package listview.ljx.exmple.listviewcustom_layout;

import android.app.*;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends BaseAdapter{
    private Context context;
    //在构造方法中传context
    public MyAdapter (Context context){
        super();
        this.context=context;
    }

//   数据建议用list存
    private List<Application> dataList;  //不用new ArrayList。用setDataList方法
    // 下面这两个方法不要放在构造方法里写
    public List<Application> getDataList() {
        return dataList;
    }

    public void setDataList(List<Application> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
 //       绘制多少条数据
        if(null!=dataList){
            return dataList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.e("MyAdapter","getView==>"+position);
        Log.e("MyAdapter","getView==>"+position+"==="+convertView);

        ViewHolder viewHolder =null;  //不能每次都new

        //converview空就赋值，不是空就直接用，达到item复用的效果，不需要不断加载
        if(null==convertView){
            convertView = LayoutInflater.from(context).inflate(R.layout.item,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.imageview);
            viewHolder.textView = (TextView)convertView.findViewById(R.id.textview);

            convertView.setTag(viewHolder);    //相当于把viewHolder属性与convertView绑在一起
        }else{
            viewHolder=(ViewHolder) convertView.getTag();
        }
        Application application = dataList.get(position);
        Log.e("MyAdapter","getView==>"+position+"==="+application.toString());
        viewHolder.imageView.setImageResource(application.getResId());
        viewHolder.textView.setText(application.getName());

        return convertView;
    }

    class ViewHolder{
        //优化：防止每次调用getView都要findbyId
        ImageView imageView;
        TextView textView;
    }
}
