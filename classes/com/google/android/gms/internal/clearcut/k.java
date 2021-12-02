// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.util.Log;
import android.content.SharedPreferences;

final class k extends f<Boolean>
{
    k(final p p3, final String s, final Boolean b) {
        super(p3, s, b, null);
    }
    
    private final Boolean r(final SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getBoolean(super.b, false);
        }
        catch (ClassCastException ex) {
            final String value = String.valueOf(super.b);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid boolean value in SharedPreferences for ".concat(value);
            }
            else {
                concat = new String("Invalid boolean value in SharedPreferences for ");
            }
            Log.e("PhenotypeFlag", concat, (Throwable)ex);
            return null;
        }
    }
}
