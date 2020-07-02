package com.example.mymvp.utils;

import android.os.Environment;

import com.example.mymvp.base.BaseApplication;

import java.io.File;

/**
 * Created by $lzj on 2019/5/5.
 */
public interface AppConstants {
	
	
	   public static final int Type_Zhihu=0;
    public static final int Type_Wechat=1;
    public static final int Type_Gank=2;
    public static final int Type_Gold=3;
    public static final int Type_Vtex=4;
    public static final int Type_Collect=5;
    public static final int Type_Setting=6;
    public static final int Type_About=7;
	

    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "code" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY="com.baidu.geek.fileprovider";

    //网络缓存的地址
    String PATH_DATA = BaseApplication.getApplication().getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";

}
