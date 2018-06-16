package com.example.hp.week_second;

import com.example.hp.week_second.bean.DatasBean;
import com.example.hp.week_second.bean.MessageBean;
import com.example.hp.week_second.interfaces.IModel;
import com.example.hp.week_second.presenter.NewsPresenter;

import java.util.List;

import io.reactivex.Flowable;

public class NewsModel implements IModel {
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter){
        this.presenter = (NewsPresenter) presenter;

    }
    @Override
    public void getData(String uid,String pid) {
        Flowable<MessageBean<List<DatasBean>>> flowable = RetrofitUtils.getInstance().getApiService().getDatas(uid);
        presenter.getNews(flowable);
    }
}
