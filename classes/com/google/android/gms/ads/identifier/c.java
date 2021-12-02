// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.common.l;
import android.content.Context;
import android.content.SharedPreferences;

public final class c
{
    private SharedPreferences a;
    
    public c(Context i) {
        try {
            i = l.i(i);
            SharedPreferences sharedPreferences;
            if (i == null) {
                sharedPreferences = null;
            }
            else {
                sharedPreferences = i.getSharedPreferences("google_ads_flags", 0);
            }
            this.a = sharedPreferences;
        }
        finally {
            final Throwable t;
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", t);
            this.a = null;
        }
    }
    
    public final boolean a(final String s, final boolean b) {
        try {
            final SharedPreferences a = this.a;
            return a != null && a.getBoolean(s, false);
        }
        finally {
            final Throwable t;
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", t);
            return false;
        }
    }
    
    final float b(final String s, float float1) {
        try {
            final SharedPreferences a = this.a;
            if (a == null) {
                return 0.0f;
            }
            float1 = a.getFloat(s, 0.0f);
            return float1;
        }
        finally {
            final Throwable t;
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", t);
            return 0.0f;
        }
    }
    
    final String c(String string, final String s) {
        try {
            final SharedPreferences a = this.a;
            if (a == null) {
                return s;
            }
            string = a.getString(string, s);
            return string;
        }
        finally {
            final Throwable t;
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", t);
            return s;
        }
    }
}
