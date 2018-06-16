package com.example.hp.week_second.interfaces;

import com.example.hp.week_second.bean.MessageBean;

public interface IView {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}