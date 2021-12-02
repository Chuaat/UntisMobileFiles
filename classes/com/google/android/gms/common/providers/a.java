// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;
import androidx.annotation.RecentlyNonNull;

@Deprecated
@a
public class a
{
    private static a a;
    
    private a() {
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static a a() {
        synchronized (a.class) {
            if (com.google.android.gms.common.providers.a.a == null) {
                com.google.android.gms.common.providers.a.a = (a)new b();
            }
            return com.google.android.gms.common.providers.a.a;
        }
    }
    
    public interface a
    {
        @Deprecated
        @RecentlyNonNull
        @f2.a
        ScheduledExecutorService a();
    }
}
