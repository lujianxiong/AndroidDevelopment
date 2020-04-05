package da_xiong.broadcastreceiver.exmple1_2.broadcastreceiver_12;
//发送一条自定义广播，并接收
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view){
        Log.v("MyBroadcastReceiver","【广播发送者】：send broadcast");
        Intent intent = new Intent();
// 定义广播的事件类型
        intent.setAction("Help_Stitch");
// 发送广播
        sendBroadcast(intent);
    }
}
