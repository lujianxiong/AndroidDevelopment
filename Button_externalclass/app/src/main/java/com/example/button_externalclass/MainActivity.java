package com.example.button_externalclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
        button1.setText("外部类实现按钮点击事件！！");
    }
}
