// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class l
{
    private static a a() {
        return (a)new f.b();
    }
    
    @j0
    public static a i(@j0 final String s) {
        return a().g(s);
    }
    
    @j0
    public static a j(@j0 final byte[] array) {
        return a().f(array);
    }
    
    @k0
    public abstract Integer b();
    
    public abstract long c();
    
    public abstract long d();
    
    @k0
    public abstract o e();
    
    @k0
    public abstract byte[] f();
    
    @k0
    public abstract String g();
    
    public abstract long h();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract l a();
        
        @j0
        public abstract a b(@k0 final Integer p0);
        
        @j0
        public abstract a c(final long p0);
        
        @j0
        public abstract a d(final long p0);
        
        @j0
        public abstract a e(@k0 final o p0);
        
        @j0
        abstract a f(@k0 final byte[] p0);
        
        @j0
        abstract a g(@k0 final String p0);
        
        @j0
        public abstract a h(final long p0);
    }
}
