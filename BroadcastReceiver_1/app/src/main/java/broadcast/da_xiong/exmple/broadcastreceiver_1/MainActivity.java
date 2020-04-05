package broadcast.da_xiong.exmple.broadcastreceiver_1;
//保存拦截号码，实现拨打电话拦截
import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText et_ipnumber;
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_ipnumber = (EditText) findViewById(R.id.et_ipnumber);
// 创建SharedPreferences对象
        sp = getSharedPreferences("config", MODE_PRIVATE);
    }
    public void click(View view) {
// 获取用户输入的拦截号码
        String number = et_ipnumber.getText().toString().trim();
//创建Editor对象,保存用户输入的拦截号码
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("number", number);
        editor.commit();
        Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
    }
}

