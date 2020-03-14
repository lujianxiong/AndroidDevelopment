package com.example.button_innerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new MyButton());
    }
    private  class MyButton implements View.OnClickListener{
        @Override
        public void onClick(View v){
            button1.setText("内部类实现按钮点击事件！！");
        }
    }
}

