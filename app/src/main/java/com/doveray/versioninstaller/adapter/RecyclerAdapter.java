package com.doveray.versioninstaller.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.doveray.versioninstaller.R;

import java.util.List;

/**
 * Created by Doveray on 2017/4/1.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<MyViewHoder>{

    private Context ctx;
    private List<String> mDatas;

    public RecyclerAdapter(Context ctx, List<String> mDatas) {
        this.ctx = ctx;
        this.mDatas = mDatas;
    }

    @Override
    public MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyViewHoder holder = new MyViewHoder(LayoutInflater.from(ctx).inflate(R.layout.item_home,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHoder holder, int position) {

        holder.tvName.setText(mDatas.get(position));
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
