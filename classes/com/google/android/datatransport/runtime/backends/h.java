// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class h
{
    public static h a() {
        return new b(a.I, -1L);
    }
    
    public static h d(final long n) {
        return new b(a.G, n);
    }
    
    public static h e() {
        return new b(a.H, -1L);
    }
    
    public abstract long b();
    
    public abstract a c();
    
    public enum a
    {
        G, 
        H, 
        I;
    }
}
