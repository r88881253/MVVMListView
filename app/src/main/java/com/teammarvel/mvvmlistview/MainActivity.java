package com.teammarvel.mvvmlistview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.teammarvel.mvvmlistview.adapter.NewsAdapter;
import com.teammarvel.mvvmlistview.databinding.ActivityMainBinding;
import com.teammarvel.mvvmlistview.viewmodel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListNews();

        newsAdapter = new NewsAdapter(this, newsModelArrayList);

        activityMainBinding.listView.setAdapter(newsAdapter);



    }
}
