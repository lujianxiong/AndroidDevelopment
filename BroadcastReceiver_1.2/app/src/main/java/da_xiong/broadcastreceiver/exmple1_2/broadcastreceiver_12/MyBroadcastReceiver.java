package da_xiong.broadcastreceiver.exmple1_2.broadcastreceiver_12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
public class MyBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyBroadcastReceiver","【自定义广播接收者】：接受到了求救广播事件");
        Log.i("MyBroadcastReceiver",intent.getAction());
    }
}
