package viewholder.listview.exmple.listviewviewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter2 extends DAdapter<Application>{

    public MyAdapter2(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(null ==convertView){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item,null);
        }
        ImageView imageView = DViewHolder.get(convertView,R.id.imageview);
        TextView textView = DViewHolder.get(convertView,R.id.textview);

        Application application = getDataLiat().get(position);
        imageView.setImageResource(application.getResId());
        textView.setText(application.getName());

        return convertView;
    }
}
