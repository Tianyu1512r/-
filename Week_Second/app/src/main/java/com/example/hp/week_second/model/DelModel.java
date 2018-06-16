package com.example.hp.week_second.model;

import com.example.hp.week_second.RetrofitUtils;
import com.example.hp.week_second.bean.MessageBean;
import com.example.hp.week_second.interfaces.IModel;
import com.example.hp.week_second.presenter.DelPresenter;

import io.reactivex.Flowable;

public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}
