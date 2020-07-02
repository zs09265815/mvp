package com.example.mymvp.base;

public abstract class BaseMVPActivity<P extends BasePresenter,M extends BaseModel,V extends BaseView>extends BaseActivity {
    protected  P myPresenter;

    @Override
    protected void initMVP() {
        super.initMVP();
        myPresenter=initMvpPresenter();
        if (myPresenter!=null){
            myPresenter.addView(initMvpView());
            myPresenter.addModel(initMvpModel());
        }

    }

    protected abstract M initMvpModel();

    protected abstract P initMvpPresenter();

    protected abstract V initMvpView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myPresenter!=null){
            myPresenter.destroy();
            myPresenter=null;
        }
    }
}
