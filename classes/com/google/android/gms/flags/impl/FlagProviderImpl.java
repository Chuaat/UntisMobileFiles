// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags.impl;

import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.flags.i;

@DynamiteApi
public class FlagProviderImpl extends i
{
    private boolean f;
    private SharedPreferences g;
    
    public FlagProviderImpl() {
        this.f = false;
    }
    
    @Override
    public boolean getBooleanFlagValue(final String s, final boolean b, final int n) {
        if (!this.f) {
            return b;
        }
        return b.a(this.g, s, b);
    }
    
    @Override
    public int getIntFlagValue(final String s, final int i, final int n) {
        if (!this.f) {
            return i;
        }
        return d.a(this.g, s, i);
    }
    
    @Override
    public long getLongFlagValue(final String s, final long l, final int n) {
        if (!this.f) {
            return l;
        }
        return com.google.android.gms.flags.impl.f.a(this.g, s, l);
    }
    
    @Override
    public String getStringFlagValue(final String s, final String s2, final int n) {
        if (!this.f) {
            return s2;
        }
        return com.google.android.gms.flags.impl.h.a(this.g, s, s2);
    }
    
    @Override
    public void init(final com.google.android.gms.dynamic.d d) {
        final Context context = com.google.android.gms.dynamic.f.y2(d);
        if (this.f) {
            return;
        }
        try {
            this.g = j.a(context.createPackageContext("com.google.android.gms", 0));
            this.f = true;
        }
        catch (Exception ex) {
            final String value = String.valueOf(ex.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "Could not retrieve sdk flags, continuing with defaults: ".concat(value);
            }
            else {
                concat = new String("Could not retrieve sdk flags, continuing with defaults: ");
            }
            Log.w("FlagProviderImpl", concat);
        }
        catch (PackageManager$NameNotFoundException ex2) {
            goto Label_0079;
        }
    }
}
