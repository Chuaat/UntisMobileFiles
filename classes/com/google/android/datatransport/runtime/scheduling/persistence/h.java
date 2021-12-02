// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class h implements g<d>
{
    public static h a() {
        return a.a;
    }
    
    public static d c() {
        return p.c(e.d(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public d b() {
        return c();
    }
    
    private static final class a
    {
        private static final h a;
        
        static {
            a = new h();
        }
    }
}
