package daxiong.broadcastreceiver.exmple3.broadcastreceiver_6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcast", "【MyReceiver1】：接收到了广播事件");
        String action = intent.getAction();
        if(action.equals("Broadcast11")){
            Log.i("Broadcast", "处理【Broadcast11广播】");
            Log.i("Broadcast", "Address："+intent.getStringExtra("Address"));
        }else if(action.equals("Broadcast22")){
            Log.i("Broadcast", "处理【Broadcast22广播】");
            Log.i("Broadcast", "Number："+intent.getIntExtra("number",0));
        }else{
            assert false;
        }
    }
}
