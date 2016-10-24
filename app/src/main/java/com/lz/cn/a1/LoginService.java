package com.lz.cn.a1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Liz on 2016/6/12.
 */
public class LoginService extends BroadcastReceiver{
    private String KEY = "$O0oo0";
    @Override
    public void onReceive(Context context, Intent intent) {
         Intent a1=new Intent(context,A1.class);
        a1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          context.startActivity(a1);
//        Bundle extras = intent.getExtras();
//        String uname = extras.getString("jy_uname");
//        String psw = extras.getString("jy_psw");
//        Log.e("userPassword",
//                psw);
        Bundle extras = intent.getExtras();
        String uname = extras.getString("yk_uname");
        String psw = extras.getString("yk_psw");
        SharedPreferencesUtil.saveStringData(context, "userPassword",
                psw + KEY);

        SharedPreferencesUtil.saveStringData(context, "userName", uname);
        SharedPreferencesUtil.saveBooleanData(context, "ischeck",
                true);
        Log.e("`````uname`",SharedPreferencesUtil.getStringData(context,
                "userName", ""));

    }

}
