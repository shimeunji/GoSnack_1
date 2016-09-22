package kr.hs.emirim.gosnack;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by 내컴퓨터 on 2016-09-19.
 */
public class SnackAdapter extends BaseAdapter {
    private static final String TAG = "스낵:SAdapter";
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Snack> snacks = null;
    private LayoutInflater inflater = null;

    public static String rank_url;
    public static String info_url;

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

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }
        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        // img.setImageBitmap(snacks.get(position).getImg_rank());
        rank_url = S.IMG_URL + snacks.get(position).getImg_rank();
        //info_url=S.IMG_URL+snacks.get(position).getImg_info();
        Log.d(TAG, "그림 url-:" + rank_url);
        Picasso.with(mContext).setIndicatorsEnabled(true);
        Picasso.with(mContext).load(rank_url)
                .error(R.drawable.home_image)
                .into(img);
        return convertView;
    }
}
