// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class f implements g<String>
{
    public static f a() {
        return a.a;
    }
    
    public static String b() {
        return p.c(e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public String c() {
        return b();
    }
    
    private static final class a
    {
        private static final f a;
        
        static {
            a = new f();
        }
    }
}
