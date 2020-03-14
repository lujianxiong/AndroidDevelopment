package com.example.imageview_demo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private int minWidth = 100;//屏幕宽度:最小值
    private ImageView imageView;
    private TextView textView1, textView2;
    private Matrix matrix = new Matrix();
    int width;
    int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) this.findViewById(R.id.imageview);
        SeekBar seekBar1 = (SeekBar) this.findViewById(R.id.seekbar1);
        SeekBar seekBar2 = (SeekBar) this.findViewById(R.id.seekbar2);
        textView1 = (TextView) this.findViewById(R.id.textview1);
        textView2 = (TextView) this.findViewById(R.id.textview2);
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);

        //    1）设置图片放大缩小效果
        //    第一步：将<ImageView>标签中的android:scaleType设置为"fitCenter"
        //    第二步：获取屏幕的宽度
        //    第三步：设置seekBar的最大progree值为屏幕宽度
        //    第四步：设置imageview的布局参数，也就是宽和高，也就是画布的宽高
        // 设置图片放大缩小效果
        // 第一步：获取屏幕的宽度
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        // 第二步：设置seekBar的最大progree值为屏幕宽度
        seekBar1.setMax(dm.widthPixels - minWidth);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //获取原图片的大小
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.background3, opts);
        // 将BitmapFactory.Options.inSampleSize设为1才是原始大小，有时候根据需要因为图片太大而内存溢出时，需要适当选择inSampleSize的值
        opts.inSampleSize = 1;
        opts.inJustDecodeBounds = false;
        width = opts.outWidth;
        height = opts.outHeight;
        textView1.setText("图像宽度:" + width + "  图像高度:" + height);

        // 放大或缩小
        if (seekBar.getId() == R.id.seekbar1) {
            int newWidth = progress + minWidth;
            int newHeight = (int) (newWidth * height / width);//按照原比例缩放
            // 第三步：设置imageview的布局参数，也就是宽和高，也就是画布的宽高
            imageView.setLayoutParams(new LinearLayout.LayoutParams(newWidth, newHeight));
            textView1.setText("图像宽度:" + newWidth + "  图像高度:" + newHeight);
        } else
            // 2）旋转
            // 设置旋转度数
            // 设置图片旋转方法
            if (seekBar.getId() == R.id.seekbar2) {
                // 第一步：给matrix设置角度，用于新的bitmap
                matrix.setRotate(progress);
                // 第二步：获取bitmap资源
                Bitmap bitmap = ((BitmapDrawable) (getResources().getDrawable(R.drawable.background3))).getBitmap();
                // 第三步：重建bitmap用于显示
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                // 第四步：给imageview设置新的bitmap
                imageView.setImageBitmap(bitmap);
                textView2.setText(progress + "度");
            }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
    }
}