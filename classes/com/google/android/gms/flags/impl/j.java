// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags.impl;

import java.util.concurrent.Callable;
import com.google.android.gms.internal.flags.e;
import android.content.Context;
import android.content.SharedPreferences;

public final class j
{
    private static SharedPreferences a;
    
    public static SharedPreferences a(final Context context) throws Exception {
        synchronized (SharedPreferences.class) {
            if (j.a == null) {
                j.a = e.a((Callable<SharedPreferences>)new k(context));
            }
            return j.a;
        }
    }
}
