// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.wrappers;

import com.google.android.gms.common.util.d0;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import androidx.annotation.k0;
import f2.a;

@a
public class c
{
    private static c b;
    @k0
    private b a;
    
    static {
        c.b = new c();
    }
    
    public c() {
        this.a = null;
    }
    
    @RecentlyNonNull
    @a
    public static b a(@RecentlyNonNull final Context context) {
        return c.b.b(context);
    }
    
    @d0
    private final b b(Context applicationContext) {
        synchronized (this) {
            if (this.a == null) {
                if (applicationContext.getApplicationContext() != null) {
                    applicationContext = applicationContext.getApplicationContext();
                }
                this.a = new b(applicationContext);
            }
            return this.a;
        }
    }
}
