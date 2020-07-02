package com.example.mymvp.base;

public interface BaseCallBack <T>{
        void getData(T data);
        void error(String msg);
}
