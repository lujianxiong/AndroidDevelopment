package daxiong.broadcastreceiver.exmple2.broadcastreceiver_3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcast", "【自定义广播接收者MyReceiver1】：接收到了广播事件");
    }
}
