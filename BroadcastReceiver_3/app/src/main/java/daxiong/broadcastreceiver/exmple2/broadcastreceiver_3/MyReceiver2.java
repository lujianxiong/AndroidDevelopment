package daxiong.broadcastreceiver.exmple2.broadcastreceiver_3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcast", "【自定义广播接收者MyReceiver2】：接收到了广播事件");
    }
}
