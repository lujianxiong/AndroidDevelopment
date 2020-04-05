package view.listview_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.ListView);
//ArrayAdapter太简单，根本不能满足开发需求，这只是一个例子，一般不会使用
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                //Adapter是把数据映射到ListView上的中介
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                new String []{"zhangsan","lisi","wangwu","李广","刘涛","微软","aad","sadadw","dawad","dawd","adaw","ljx"}
        );
        listView.setAdapter(adapter);
    }
}
