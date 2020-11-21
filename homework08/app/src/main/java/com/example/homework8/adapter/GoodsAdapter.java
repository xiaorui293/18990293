package com.example.homework8.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homework8.bean.GoodsInfo;

import java.util.ArrayList;

public class GoodsAdapter extends BaseAdapter implements View.OnClickListener {
    private final String TAG = "GoodsAdapter";
    private Context mContext;
    private ArrayList<GoodsInfo> mGoodsArray;

    public GoodsAdapter (Context context,ArrayList<GoodsInfo> goodsInfos ) {

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView. setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();

        }

        final GoodsInfo info = mGoodsArray.get(position);
        Log.d(TAG,  "info , name: "+info. name);
        holder. tv_name.setText(info.name);
//        holder. iv_thumb. setImageBitmap(MainApplication .getInstance(). mIconMap. get(info. rowid));
        holder.tv_price. setText("" + (int) info.price);
        holder.btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//        mAddCartListener.addToCart(info. rowid);
        Toast .makeText (mContext , "已添加" + info.name + "到购物车",Toast.LENGTH_LONG). show();
        return convertView;
    }

    @Override
    public void onClick(View view) {

    }
    public  final  class ViewHolder {
        public TextView tv_name,tv_price ;
        public ImageView iv_thumb;

        public Button btn_add;


    }
}
