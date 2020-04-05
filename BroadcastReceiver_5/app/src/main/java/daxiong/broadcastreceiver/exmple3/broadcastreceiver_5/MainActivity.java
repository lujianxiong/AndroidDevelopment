package daxiong.broadcastreceiver.exmple3.broadcastreceiver_5;
//拦截Receiver2广播：在Receiver中加：abortBroadcast()
//指定某个特定广播接收者：一旦sendOrderedBroadcast()的第3个参数指定了某个广播接收者，
//则无论前面是否有拦截，此广播一定能被该receiver接收到
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyReceiver1 mMyReceiver1;
    MyReceiver2 mMyReceiver2;
    MyReceiver3 mMyReceiver3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//实例化IntentFilter对象
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("Broadcasthaha");
        

        mMyReceiver1 = new MyReceiver1();
        mMyReceiver2 = new MyReceiver2();
        mMyReceiver3 = new MyReceiver3();
        //优先级为：1-2-3
        intentFilter.setPriority(900);
        registerReceiver(mMyReceiver2, intentFilter);
        intentFilter.setPriority(1000);
        registerReceiver(mMyReceiver1, intentFilter);
        intentFilter.setPriority(800);
        registerReceiver(mMyReceiver3, intentFilter);

    }
    public void send(View view){
        Intent intent = new Intent();
        intent.setAction("Broadcasthaha");
        sendOrderedBroadcast(intent, null,mMyReceiver3,null,0,null,null);
    }
    @Override
    protected void onPause(){
        super.onPause();
        //重写onPause方法，并销毁资源
        unregisterReceiver(mMyReceiver1);
        unregisterReceiver(mMyReceiver2);
        unregisterReceiver(mMyReceiver3);
    }
}
