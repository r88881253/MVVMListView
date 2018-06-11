package com.teammarvel.mvvmlistview.viewmodel;

import com.teammarvel.mvvmlistview.model.News;

import java.util.ArrayList;

public class NewsModel {

    public String header;
    public String desc;


    public NewsModel(News news){
        this.header = news.header;
        this.desc = news.desc;
    }

    public NewsModel() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public ArrayList<NewsModel> getArrayListNews(){

        ArrayList<NewsModel> newsModelArrayList = new ArrayList<>();

        NewsModel newsModel1 = new NewsModel(new News("First Header", "This is First News."));
        NewsModel newsModel2 = new NewsModel(new News("Second Header", "This is Second News."));
        NewsModel newsModel3 = new NewsModel(new News("Third Header", "This is Third News."));
        NewsModel newsModel4 = new NewsModel(new News("Four Header", "This is Four News."));

        newsModelArrayList.add(newsModel1);
        newsModelArrayList.add(newsModel2);
        newsModelArrayList.add(newsModel3);
        newsModelArrayList.add(newsModel4);

        return newsModelArrayList;
    }
}
