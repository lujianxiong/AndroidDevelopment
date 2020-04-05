package daxiong.broadcastreceiver.exmple3.broadcastreceiver_5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcasthaha", "【BroadcastReceiver_5的接收者MyReceiver2】：接收到了广播事件");
        abortBroadcast();  //拦截广播
    }
}
