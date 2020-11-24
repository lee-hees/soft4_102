package dsu.software.busansubway.Select;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import dsu.software.busansubway.R;

public class ListviewAdapter extends BaseAdapter {


    Context context;
    ArrayList<ListViewItem> list_itemArrayList;
    ViewHolder viewholder;

    public ListviewAdapter(Context context, ArrayList<ListViewItem> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }


    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_select_item_layout, null); //
            viewholder = new ViewHolder();
            viewholder.content_textView1 = (TextView) convertView.findViewById(R.id.buttoncolor);
            viewholder.content_textView2 = (TextView) convertView.findViewById(R.id.text_view_at_custom_layout);
            convertView.setTag(viewholder);
        } else {
            viewholder = (ViewHolder) convertView.getTag();
        }

        if (list_itemArrayList.get(position).getContent().backcolor == 1) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_11);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 2) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_22);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 3) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_33);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 4) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_44);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 5) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_dd);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 6) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_kk);
        }

        //1호선
        if (list_itemArrayList.get(position).getContent().backcolor == 1) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_11);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 11) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_11s);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }
        //2호선
        if (list_itemArrayList.get(position).getContent().backcolor == 2) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_22);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 22) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_22s);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }
        //3호선
        if (list_itemArrayList.get(position).getContent().backcolor == 3) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_33);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 33) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_33s);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }
        //4호선
        if (list_itemArrayList.get(position).getContent().backcolor == 4) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_44);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 44) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_44s);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }
        //동해선
        if (list_itemArrayList.get(position).getContent().backcolor == 5) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_dd);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 55) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_dds);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }
        //김해선
        if (list_itemArrayList.get(position).getContent().backcolor == 6) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_kk);
            viewholder.content_textView1.setScaleX((float) 0.7);
            viewholder.content_textView1.setScaleY((float) 0.7);
        } else if (list_itemArrayList.get(position).getContent().backcolor == 66) {
            viewholder.content_textView1.setBackgroundResource(R.drawable.button_kks);
            viewholder.content_textView1.setScaleX((float) 1.0);
            viewholder.content_textView1.setScaleY((float) 1.0);
        }

        viewholder.content_textView2.setText(list_itemArrayList.get(position).getContent().contents);

        return convertView;
    }


    static class ViewHolder {

        TextView content_textView1;
        TextView content_textView2;

    }
}
