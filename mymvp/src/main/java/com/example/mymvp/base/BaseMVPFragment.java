package com.example.mymvp.base;

public abstract class BaseMVPFragment <P extends BasePresenter,M extends BaseModel,V extends BaseView>extends BaseFragment {
    protected P myPresenter;
    @Override
    protected void initMvp() {
        super.initMvp();
            myPresenter=initMVPPResenter();
            if (myPresenter!=null){
                myPresenter.addView(initMvpView());
                myPresenter.addModel(initMvpModel());
            }
    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initMVPPResenter();
}
