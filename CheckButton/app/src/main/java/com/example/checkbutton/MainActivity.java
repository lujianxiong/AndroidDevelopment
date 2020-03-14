package com.example.checkbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox paobu=(CheckBox) findViewById(R.id.paobu);//获取paobu复选按钮
        final CheckBox youyong=(CheckBox) findViewById(R.id.youyong);
        final CheckBox yumaoqiu=(CheckBox) findViewById(R.id.yumaoqiu);
        paobu.setOnCheckedChangeListener(checkBox_listener);//为tiyu添加状态改变监听
        youyong.setOnCheckedChangeListener(checkBox_listener);
        yumaoqiu.setOnCheckedChangeListener(checkBox_listener);

        Button button=(Button) findViewById(R.id.tijiao);//为提交按钮添加事件监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";//保存所有选中的值
                if (paobu.isChecked())//选中跑步
                    str += "你选了"+paobu.getText().toString() + "\n";
                if (youyong.isChecked())//选中游泳
                    str += "你选了"+youyong.getText().toString() + "\n";
                if (yumaoqiu.isChecked())//选中打羽毛球
                    str += "你选了"+yumaoqiu.getText().toString();
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }
    //创建一个状态改变监听对象
    private CompoundButton.OnCheckedChangeListener checkBox_listener=new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if(isChecked){//判断复选按钮是否被选中
                Log.i("复选按钮", "选中了[" + compoundButton.getText().toString() + "]");
            }
        }
    };
}
