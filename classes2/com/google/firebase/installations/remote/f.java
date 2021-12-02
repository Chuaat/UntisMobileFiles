// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f
{
    @j0
    public static a a() {
        return new com.google.firebase.installations.remote.b.b().d(0L);
    }
    
    @k0
    public abstract b b();
    
    @k0
    public abstract String c();
    
    @j0
    public abstract long d();
    
    @j0
    public abstract a e();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract f a();
        
        @j0
        public abstract a b(@j0 final b p0);
        
        @j0
        public abstract a c(@j0 final String p0);
        
        @j0
        public abstract a d(final long p0);
    }
    
    public enum b
    {
        G, 
        H, 
        I;
    }
}
