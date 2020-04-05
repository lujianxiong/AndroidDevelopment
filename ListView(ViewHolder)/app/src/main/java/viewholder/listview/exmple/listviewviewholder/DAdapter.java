package viewholder.listview.exmple.listviewviewholder;
//工具类
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public abstract  class DAdapter<T> extends BaseAdapter{

    private Context context;
    private List<T> dataLiat;

    public DAdapter(Context context) {
        super();
        this.context = context;
    }
    public void setDataList(List<T> dataLiat) {
        this.dataLiat = dataLiat;
    }
    public List<T> getDataLiat() {
        return dataLiat;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        if(null!=dataLiat){
            return dataLiat.size();
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
    public  abstract  View getView(int position, View convertView, ViewGroup parent);
}
