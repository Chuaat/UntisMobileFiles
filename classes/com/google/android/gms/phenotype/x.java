// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import android.util.Log;
import android.content.SharedPreferences;

final class x extends d<String>
{
    x(final a a, final String s, final String s2) {
        super(a, s, s2, null);
    }
    
    private final String n(final SharedPreferences sharedPreferences) {
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
