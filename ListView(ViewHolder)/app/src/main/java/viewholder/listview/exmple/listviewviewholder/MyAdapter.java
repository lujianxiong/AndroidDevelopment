package viewholder.listview.exmple.listviewviewholder;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter{
    private Context context;  //看到后面的getview就一定要记得在前面private context
    private List<Application> datalist;

    public MyAdapter(Context context) {
        super();
        //context是必须要传的，因为最好写在构造方法中，不要写setter、getter
        this.context = context;
    }

    public List<Application> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<Application> datalist) {
        this.datalist = datalist;
    }


    @Override
    public int getCount() {
        if(null != datalist){
            return datalist.size();
        }return 0;
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
        ViewHolder Holder = null;
        if(null == convertView){
            convertView = LayoutInflater.from(context).inflate(R.layout.item,null); //这是用来给converView加载布局的
            Holder=new ViewHolder();
            Holder.imageView=(ImageView)convertView.findViewById(R.id.imageview) ;   //activity可以findbyid，convertView也可以
            Holder.textView =(TextView)convertView.findViewById(R.id.textview);
            convertView.setTag(Holder);
        }else{
            Holder = (ViewHolder)convertView.getTag();
        }

        Application application = datalist.get(position);
        Holder.imageView.setImageResource(application.getResId());
        Holder.textView.setText(application.getName());


        return convertView;
    }

    class ViewHolder{
        //这个内部类是封装数据的，这里是将图片和文字封装咋一起
        ImageView imageView;
        TextView textView;
   }
}
