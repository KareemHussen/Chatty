package com.example.myapplication.utils;

import android.content.Context;

import com.example.myapplication.R;
import com.example.myapplication.screens.authentication.SharedPreferenceClass;

public class Amar {
    private static SharedPreferenceClass sharedPreferenceClass;

    public static void setMode(Context context) {
        sharedPreferenceClass = new SharedPreferenceClass(context);
        if(sharedPreferenceClass.loadNightModeState()) {
            context.setTheme(R.style.dark_theme);
        }
        else {
            context.setTheme(R.style.app_theme);
        }
    }

}
