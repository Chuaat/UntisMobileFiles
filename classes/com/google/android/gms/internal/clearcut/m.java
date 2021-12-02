// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import android.util.Base64;
import android.util.Log;
import android.content.SharedPreferences;

final class m extends f<Object>
{
    private final Object m;
    private String n;
    private o;
    private final /* synthetic */ o p;
    
    m(final p p4, final String s, final Object o, final o p5) {
        this.p = p5;
        super(p4, s, o, null);
        this.m = new Object();
    }
    
    @Override
    protected final Object f(final SharedPreferences sharedPreferences) {
        try {
            return this.m(sharedPreferences.getString(super.b, ""));
        }
        catch (ClassCastException ex) {
            final String value = String.valueOf(super.b);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid byte[] value in SharedPreferences for ".concat(value);
            }
            else {
                concat = new String("Invalid byte[] value in SharedPreferences for ");
            }
            Log.e("PhenotypeFlag", concat, (Throwable)ex);
            return null;
        }
    }
    
    @Override
    protected final Object m(final String str) {
        try {
            synchronized (this.m) {
                if (!str.equals(this.n)) {
                    final Object a = this.p.a(Base64.decode(str, 3));
                    this.n = str;
                    this.o = a;
                }
                return this.o;
            }
        }
        catch (IOException | IllegalArgumentException ex) {
            final String b = super.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(b);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
