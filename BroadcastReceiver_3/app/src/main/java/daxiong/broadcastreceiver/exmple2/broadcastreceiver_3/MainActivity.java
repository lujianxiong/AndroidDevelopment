package daxiong.broadcastreceiver.exmple2.broadcastreceiver_3;
//静态注册
//setComponent 、setPackage
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view){
        Intent intent = new Intent();
        intent.setAction("Broadcast");  //定义广播的事件类型

        //setComponent只有最后一个调用才会起作用
        //new ComponentName( )的两个参数：第一个是带包路径项目名，即package；
        // 第二个是带包路径的广播接收者名，即package.接收者文件名
  //      intent.setComponent(new ComponentName("daxiong.broadcastreceiver.exmple2.broadcastreceiver_3",
  //              "daxiong.broadcastreceiver.exmple2.broadcastreceiver_3.MyReceiver1"));
  //      intent.setComponent(new ComponentName("daxiong.broadcastreceiver.exmple2.broadcastreceiver_3",
  //              "daxiong.broadcastreceiver.exmple2.broadcastreceiver_3.MyReceiver2"));
  //      intent.setComponent(new ComponentName("daxiong.broadcastreceiver.exmple2.broadcastreceiver_3",
  //              "daxiong.broadcastreceiver.exmple2.broadcastreceiver_3.MyReceiver3"));

        //多个广播接收者需要调用setPackage（）；参数是带包路径
        //setComponent比setPackage的优先级要高
       intent.setPackage("daxiong.broadcastreceiver.exmple2.broadcastreceiver_3");

        sendOrderedBroadcast(intent, null);   //发送有序广播
    }

}
