// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class k
{
    @j0
    public static a a() {
        return (a)new e.b();
    }
    
    @k0
    public abstract com.google.android.datatransport.cct.internal.a b();
    
    @k0
    public abstract b c();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract k a();
        
        @j0
        public abstract a b(@k0 final com.google.android.datatransport.cct.internal.a p0);
        
        @j0
        public abstract a c(@k0 final b p0);
    }
    
    public enum b
    {
        H(0), 
        I(23);
        
        private final int G;
        
        private b(final int g) {
            this.G = g;
        }
    }
}
