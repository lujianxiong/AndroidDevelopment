package viewholder.listview.exmple.listviewviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

//        MyAdapter adapter=new MyAdapter(this);
        MyAdapter2 adapter2=new MyAdapter2(this);
        //创建list并把数据放进去
        List<Application> list= new ArrayList<Application>();
        list.add(new Application("QQ",R.drawable.qq));
        list.add(new Application("跑酷",R.drawable.paoku));
        list.add(new Application("纸牌",R.drawable.card));
        list.add(new Application("飞机",R.drawable.plane));
        list.add(new Application("房子",R.drawable.house));
        list.add(new Application("斗地主",R.drawable.ddz));
        list.add(new Application("画图",R.drawable.paint));

        //将list数据放进adapter
        adapter2.setDataList(list);
        listView.setAdapter(adapter2);
    }
}
