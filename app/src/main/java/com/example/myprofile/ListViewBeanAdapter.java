package com.example.myprofile;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class ListViewBeanAdapter extends BaseAdapter {
    public ArrayList<ListViewBean> arraylistListener;
    private List<ListViewBean> mListenerList;
    Context mContext;

    public ListViewBeanAdapter(List<ListViewBean> mListenerList, Context context){
        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<ListViewBean>();
        this.arraylistListener.addAll(mListenerList);
    }
    public class  ViewHolder{
        ImageView mItemPic;
        TextView mLangName;
    }
    @Override
    public int getCount(){
        return mListenerList.size();
    }
    @Override
    public Object getItem(int position){
        return mListenerList.size();
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.design_listview_profile, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.image_listview_profile);
            holder.mLangName=(TextView)view.findViewById(R.id.tv_listview_profile);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = mListenerList.get(position).getHinhanh();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(mListenerList.get(position).getTenhinhanh());
        }catch (Exception ex){
        }
        return view;
    }
}
