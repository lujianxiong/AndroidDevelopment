package com.example.button_lamada;

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
        button1.setOnClickListener((v)-> {
            button1.setText("Lamada表达式实现按钮点击事件！！");
        });
    }
}
//  lamada表达式配置参考：https://my.oschina.net/codelx/blog/1557838