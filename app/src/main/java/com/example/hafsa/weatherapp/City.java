package com.example.hafsa.weatherapp;

import android.app.Activity;
import android.content.SharedPreferences;

public class City {

    SharedPreferences prefs;

    public City(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
