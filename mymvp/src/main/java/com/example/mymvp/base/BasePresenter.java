package com.example.mymvp.base;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePresenter<M extends BaseModel, V extends BaseView> {
    protected List<BaseModel>list=new ArrayList<>();
    protected M myModel;
    protected V myView;

    public void addView(V v) {
            this.myView=v;
    }

    public void addModel(M m) {
            this.myModel=m;
            list.add(m);
    }

    public void destroy() {
        if (myView!=null){
            myView=null;
        }
        if (list.size()>0){
            for (BaseModel model:list) {
                model.destroy();
            }
        }
    }
}
