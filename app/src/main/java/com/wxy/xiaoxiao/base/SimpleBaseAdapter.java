package com.wxy.xiaoxiao.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by win7 on 2016/6/29.
 */
public abstract class SimpleBaseAdapter<T> extends BaseAdapter {
    protected int mSize;
    protected List<T> mList;
    protected LayoutInflater mInflater;
    protected Context context;



    public SimpleBaseAdapter() {
    }


    public List<T> getmList() {
        return mList;
    }

    public SimpleBaseAdapter(List<T> list, Context context) {
        if(context==null){
            return;
        }
        this.mList = list;
        this.context=context;
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mSize = mList == null ? 0 : mList.size();
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * @param list
     * @title 更新列表数据
     */
    public void update(List<T> list) {
        if (list == null) {
            return;
        }
        if (this.mList != null) {
            this.mList.clear();
            this.mList = list;
        } else {
            this.mList = list;
        }
        this.mSize = mList.size();
        notifyDataSetChanged();
    }

    /**
     * @param list
     * @title 添加列表数据
     */
    public void add(List<T> list) {
        if (list == null) {
            return;
        }
        if (this.mList != null) {
            this.mList.addAll(list);
        } else {
            this.mList = list;
        }
        this.mSize = mList.size();
        notifyDataSetChanged();
    }

    /**
     * @param list
     * @title 全量替换
     */
    public void replace(List<T> list) {
        if (list == null) {
            return;
        }
        this.mList = list;
        this.mSize = mList.size();
        notifyDataSetChanged();
    }

    /**
     * @title 清除列表数据
     */
    public void clean() {
        if (mList == null) {
            return;
        }
        mList.clear();
        this.mSize = mList.size();
        notifyDataSetChanged();
    }

    /**
     * 删除一条信息
     *
     * @param t 需要删除的数据
     */
    public void remove(T t) {
        if (mList == null) {
            return;
        }
        mList.remove(t);
        this.mSize = mList.size();
        notifyDataSetChanged();
    }


    /**
     * 添加一条信息
     *
     * @param t 需要添加的数据
     */
    public void add(T t) {
        if (t == null) {
            return;
        }
        if (this.mList == null) {
            this.mList = new ArrayList<>();
        }
        mList.add(t);
        this.mSize = mList.size();
        notifyDataSetChanged();
    }

}
