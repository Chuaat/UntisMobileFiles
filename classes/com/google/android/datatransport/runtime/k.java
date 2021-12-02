// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.p;
import java.util.concurrent.Executor;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class k implements g<Executor>
{
    public static k a() {
        return a.a;
    }
    
    public static Executor b() {
        return p.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public Executor c() {
        return b();
    }
    
    private static final class a
    {
        private static final k a;
        
        static {
            a = new k();
        }
    }
}
