// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.util.Log;
import android.content.SharedPreferences;

final class l extends f<String>
{
    l(final p p3, final String s, final String s2) {
        super(p3, s, s2, null);
    }
    
    private final String r(final SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(super.b, (String)null);
        }
        catch (ClassCastException ex) {
            final String value = String.valueOf(super.b);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid string value in SharedPreferences for ".concat(value);
            }
            else {
                concat = new String("Invalid string value in SharedPreferences for ");
            }
            Log.e("PhenotypeFlag", concat, (Throwable)ex);
            return null;
        }
    }
}
