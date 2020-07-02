package com.example.mymvp.net;


import io.reactivex.Observer;

public abstract class BaseObserver<T> implements Observer<T> {
    private final String TAG=getClass().getName();
    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {

    }
}
