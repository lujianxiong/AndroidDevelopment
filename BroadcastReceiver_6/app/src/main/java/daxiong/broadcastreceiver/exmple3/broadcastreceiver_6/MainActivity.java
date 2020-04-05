package daxiong.broadcastreceiver.exmple3.broadcastreceiver_6;
// 实现一个接收者接受多个广播
//实现在广播中传递数据
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyReceiver1 mMyReceiver1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//实例化IntentFilter对象
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("Broadcast11");
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("Broadcast22");

        mMyReceiver1 = new MyReceiver1();
        registerReceiver(mMyReceiver1, intentFilter1);
        registerReceiver(mMyReceiver1, intentFilter2);
    }
    public void send(View view){
        Intent intent1 = new Intent();
        Intent intent2 = new Intent();
        intent1.putExtra("Address","江苏南京");
        intent2.putExtra("number",123456789);
        intent1.setAction("Broadcast11");
        intent2.setAction("Broadcast22");
        sendOrderedBroadcast(intent1,null);
        sendOrderedBroadcast(intent2,null);
    }
    @Override
    protected void onPause(){
        super.onPause();
        //重写onPause方法，并销毁资源
        unregisterReceiver(mMyReceiver1);
    }
}
