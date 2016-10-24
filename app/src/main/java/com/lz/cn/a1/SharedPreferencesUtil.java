package com.lz.cn.a1;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtil {
	public static String CONFIG = "session";
	private static SharedPreferences sharedPreferences;
	//存储string方法
	public static SharedPreferences.Editor saveStringData(Context context,String key,String value){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
		}
		sharedPreferences.edit().putString(key, value).commit();
		return sharedPreferences.edit();
	}
	//移除string
	public static SharedPreferences.Editor removeStringData(Context context,String key){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
		}
		sharedPreferences.edit().remove(key).commit();
		return sharedPreferences.edit();
	}
	//获取String数据
	public static String getStringData(Context context,String key,String defValue){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
		}
		return sharedPreferences.getString(key, defValue);
	}
	public static void saveBooleanData(Context context,String key,Boolean value){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
		}
		sharedPreferences.edit().putBoolean(key, value).commit();
	}
	public static Boolean getBooleanData(Context context,String key,Boolean defValue){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
		}
		return sharedPreferences.getBoolean(key, defValue);
	}
	public static void clearData(Context context,String key,String value){
		if(sharedPreferences == null){
			sharedPreferences = context.getSharedPreferences(CONFIG, Context.MODE_PRIVATE);
			sharedPreferences.edit().clear().commit();
		}
		sharedPreferences.edit().clear().commit();
	}
}
