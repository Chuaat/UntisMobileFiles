// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o
{
    @j0
    public static a a() {
        return (a)new com.google.firebase.installations.a.b();
    }
    
    @j0
    public abstract String b();
    
    @j0
    public abstract long c();
    
    @j0
    public abstract long d();
    
    @j0
    public abstract a e();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract o a();
        
        @j0
        public abstract a b(@j0 final String p0);
        
        @j0
        public abstract a c(final long p0);
        
        @j0
        public abstract a d(final long p0);
    }
}
