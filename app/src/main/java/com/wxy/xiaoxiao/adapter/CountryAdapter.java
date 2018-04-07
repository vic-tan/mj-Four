package com.wxy.xiaoxiao.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wxy.xiaoxiao.BuildConfig;
import com.wxy.xiaoxiao.R;
import com.wxy.xiaoxiao.bean.CountryBean;
import com.wxy.xiaoxiao.bean.DataList;
import com.wxy.xiaoxiao.ui.SSQActivity;
import com.wxy.xiaoxiao.utils.MyUtils;

import java.util.List;

/**
 * 地区走势图
 * Created by Administrator on 2017/12/22.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{

    private List<CountryBean> list;
    private Context context;

    //适配器初始化
    public CountryAdapter(Context context, List<CountryBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(
                context).inflate(R.layout.adapter_country, parent,
                false);
        CountryViewHolder holder = new CountryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, final int position) {
        final CountryBean bean = list.get(position);
        holder.tvCountry.setText(bean.getName() + "\n" + bean.getTitle());
        Drawable drawable = context.getResources().getDrawable(bean.getIcon());
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        holder.tvCountry.setCompoundDrawables(drawable, null, null, null);
        holder.tvCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putParcelable(BuildConfig.FLAVOR, DataList.getList().get(position));
                MyUtils.openActivity(context, SSQActivity.class,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView tvCountry;

        public CountryViewHolder(View view) {
            super(view);
            tvCountry = (TextView) view.findViewById(R.id.tv_country);
        }
    }


}
