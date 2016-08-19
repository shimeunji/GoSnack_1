package com.example.gosnack_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 내컴퓨터 on 2016-06-10.
 */
public class SnackAdapter extends BaseAdapter{
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Snack> data = null;
    private LayoutInflater inflater = null;

    public SnackAdapter(Context c, int l, ArrayList<Snack> d) {
        this.mContext = c;
        this.layout = l;
        this.data = d;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        if(convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
        }
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView explation =(TextView)convertView.findViewById(R.id.explation);

        image.setImageBitmap(data.get(position).image);
        //image.setImageResource(R.drawable.gwaza1);
        name.setText(data.get(position).name);

        return convertView;
    }
}
