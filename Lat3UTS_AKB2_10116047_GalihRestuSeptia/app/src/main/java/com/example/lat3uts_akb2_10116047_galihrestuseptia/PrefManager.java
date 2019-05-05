package com.example.lat3uts_akb2_10116047_galihrestuseptia;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    int privateMode   = 0;
    private static final String prefName            =  "introslider";
    private static final String isFirstTimeLaunch   =  "isFirstTimeLaunch";

    public PrefManager(Context context){
        this._context   = context;
        pref            = _context.getSharedPreferences(prefName, privateMode);
        editor          = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFisTime){
        editor.putBoolean(isFirstTimeLaunch, isFisTime);
        editor.commit();
    }


    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(isFirstTimeLaunch, true);
    }
}
