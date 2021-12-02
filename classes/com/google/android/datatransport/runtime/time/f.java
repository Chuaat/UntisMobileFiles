// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class f implements g<com.google.android.datatransport.runtime.time.a>
{
    public static f a() {
        return a.a;
    }
    
    public static com.google.android.datatransport.runtime.time.a c() {
        return p.c(d.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public com.google.android.datatransport.runtime.time.a b() {
        return c();
    }
    
    private static final class a
    {
        private static final f a;
        
        static {
            a = new f();
        }
    }
}
