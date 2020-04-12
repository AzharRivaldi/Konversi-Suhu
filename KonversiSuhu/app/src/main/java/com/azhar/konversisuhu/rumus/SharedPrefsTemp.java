package com.azhar.konversisuhu.rumus;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPrefsTemp {

    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setTemperature1(Context context, String temperature, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("temp_symbol_1", temperature);
        editor.putInt("temp_index_1", index);
        editor.apply();
    }

    public static void setTemperature2(Context context, String temperature, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("temp_symbol_2", temperature);
        editor.putInt("temp_index_2", index);
        editor.apply();
    }

    //get temperature symbol (C, R, F, K) 1
    public static String getTempSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("temp_symbol_1", "");
    }

    //get temperature symbol (C, R, F, K) 2
    public static String getTempSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("temp_symbol_2", "");
    }

    //get temperarures (1) index
    public static int getTempIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("temp_index_1", 0);
    }

    public static int getTempIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("temp_index_2", 0);
    }
}