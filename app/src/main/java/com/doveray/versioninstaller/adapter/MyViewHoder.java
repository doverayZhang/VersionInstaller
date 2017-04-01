package com.doveray.versioninstaller.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.doveray.versioninstaller.R;

/**
 * Created by Doveray on 2017/4/1.
 */

public class MyViewHoder extends RecyclerView.ViewHolder {

    TextView tvName,tvVersion;

    public MyViewHoder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        tvVersion = (TextView) itemView.findViewById(R.id.tv_num);
    }

}
