package com.teammarvel.mvvmlistview.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.teammarvel.mvvmlistview.R;
import com.teammarvel.mvvmlistview.databinding.ListRowBinding;
import com.teammarvel.mvvmlistview.viewmodel.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel>{

    private ArrayList<NewsModel> newsModelArrayList;
    private Context context1;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_row , newsModelArrayList);
        this.context1 = context;
        this.newsModelArrayList = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        ListRowBinding listRowBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_row, parent,false);
        listRowBinding.setNewlist(newsModelArrayList.get(position));

        return listRowBinding.getRoot();
//        return super.getView(position, convertView, parent);
    }
}
