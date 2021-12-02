// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import com.google.android.datatransport.runtime.i;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g
{
    public static a a() {
        return (a)new com.google.android.datatransport.runtime.backends.a.b();
    }
    
    public static g b(final Iterable<i> iterable) {
        return a().b(iterable).a();
    }
    
    public abstract Iterable<i> c();
    
    @k0
    public abstract byte[] d();
    
    @AutoValue$Builder
    public abstract static class a
    {
        public abstract g a();
        
        public abstract a b(final Iterable<i> p0);
        
        public abstract a c(@k0 final byte[] p0);
    }
}
