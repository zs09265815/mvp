package com.example.mymvp.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment {

    private Unbinder bind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLayoutId(), container, false);
        bind = ButterKnife.bind(this, inflate);
        initMvp();
        initData();
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {

    }


    protected void initData() {

    }

    protected void initMvp() {


    }


    protected abstract int getLayoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
