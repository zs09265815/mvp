package com.example.mymvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        ButterKnife.bind(this);
        initMVP();
        initData();
        initView();
    }

    protected void initView() {

    }

    protected void initData() {

    }

    protected void initMVP() {

    }

    protected abstract int getLayoutID();

}
