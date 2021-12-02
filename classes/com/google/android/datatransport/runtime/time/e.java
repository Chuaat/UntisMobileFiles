// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class e implements g<com.google.android.datatransport.runtime.time.a>
{
    public static e a() {
        return a.a;
    }
    
    public static com.google.android.datatransport.runtime.time.a b() {
        return p.c(d.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public com.google.android.datatransport.runtime.time.a c() {
        return b();
    }
    
    private static final class a
    {
        private static final e a;
        
        static {
            a = new e();
        }
    }
}
