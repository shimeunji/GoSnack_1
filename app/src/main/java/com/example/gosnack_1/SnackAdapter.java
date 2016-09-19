package com.example.gosnack_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 내컴퓨터 on 2016-09-19.
 */
public class SnackAdapter extends BaseAdapter {
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Snack> snacks = null;
    private LayoutInflater inflater = null;

    public SnackAdapter(Context c, int l, ArrayList<Snack> s) {
        this.mContext = c;
        this.layout = l;
        this.snacks = s;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return snacks.size();
    }
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return snacks;
    }
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null)
        {
            convertView=inflater.inflate(layout,parent,false);
        }
        TextView name=(TextView)convertView.findViewById(R.id.name);
        name.setText(snacks.get(position).getName());

        TextView company=(TextView)convertView.findViewById(R.id.company);
        company.setText(snacks.get(position).getCompany());

        return convertView;

    }

}
