package com.example.html2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    txtTest.setText( Html.fromHtml("<a href=\"http://www.google.com\">Google</a>"));

    text.setMovementMethod(LinkMovementMethod.getInstance());

}
