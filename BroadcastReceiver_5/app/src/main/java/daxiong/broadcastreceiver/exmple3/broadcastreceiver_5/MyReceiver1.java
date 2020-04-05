package daxiong.broadcastreceiver.exmple3.broadcastreceiver_5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcasthaha", "【BroadcastReceiver_5的接收者MyReceiver1】：接收到了广播事件");
    }
}
