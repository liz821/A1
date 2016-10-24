package com.lz.cn.a1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Liz on 2016/6/7.
 */
public class A1 extends Activity implements View.OnClickListener{
    private String KEY = "$O0oo0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
      Intent get=getIntent();
       Boolean isFromYk=get.getBooleanExtra("isFromYk",false);
//        TextView tv=new TextView(getApplicationContext());
        TextView tv= (TextView)findViewById(R.id.a1);
        findViewById(R.id.back).setOnClickListener(this);
        if(isFromYk){
            tv.setText("true");
        }
      else tv.setText("false");
        Log.e("`````psw`",SharedPreferencesUtil.getStringData(this,
                "userPassword", "").replace(KEY, ""));
    }

    @Override
    public void onClick(View v) {
             switch (v.getId()){
                 case R.id.back:
                     Intent intent =getIntent();
                     setResult(10, intent);
                     finish();
                     break;
             }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);

    }
}
