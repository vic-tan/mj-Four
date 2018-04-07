package com.wxy.xiaoxiao.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wxy.xiaoxiao.BuildConfig;
import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.bean.AreaBean;
import com.wxy.xiaoxiao.ui.H5Activity;
import com.wxy.xiaoxiao.utils.MyUtils;

import java.util.List;

/**
 * 全国走势图
 * Created by Administrator on 2017/12/22.
 */

public class AreaAdapter extends RecyclerView.Adapter<AreaAdapter.CountryViewHolder>{

    private List<AreaBean> list;
    private Context context;

    //适配器初始化
    public AreaAdapter(Context context, List<AreaBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(
                context).inflate(R.layout.adapter_area, parent,
                false);
        CountryViewHolder holder = new CountryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, final int position) {
        final AreaBean bean = list.get(position);
        if (bean.getType().equals("体彩")){
            holder.areaTag.setBackgroundColor(ContextCompat.getColor(context,R.color.darkcyan));
        }else {
            holder.areaTag.setBackgroundColor(ContextCompat.getColor(context,R.color.red));
        }
        holder.areaTag.setText(bean.getType());
        holder.areaName.setText(bean.getName());
        holder.ll_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putParcelable(BuildConfig.FLAVOR,bean);
                MyUtils.openActivity(context, H5Activity.class,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView areaTag,areaName;
        LinearLayout ll_area;

        public CountryViewHolder(View view) {
            super(view);
            areaName = (TextView) view.findViewById(R.id.area_name);
            areaTag=view.findViewById(R.id.area_tag);
            ll_area=view.findViewById(R.id.ll_area);
        }
    }


}
