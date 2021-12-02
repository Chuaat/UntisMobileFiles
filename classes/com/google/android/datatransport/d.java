// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport;

import androidx.annotation.k0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d<T>
{
    public static <T> d<T> d(final int i, final T t) {
        return new a<T>(i, t, e.G);
    }
    
    public static <T> d<T> e(final T t) {
        return new a<T>(null, t, e.G);
    }
    
    public static <T> d<T> f(final int i, final T t) {
        return new a<T>(i, t, e.H);
    }
    
    public static <T> d<T> g(final T t) {
        return new a<T>(null, t, e.H);
    }
    
    public static <T> d<T> h(final int i, final T t) {
        return new a<T>(i, t, e.I);
    }
    
    public static <T> d<T> i(final T t) {
        return new a<T>(null, t, e.I);
    }
    
    @k0
    public abstract Integer a();
    
    public abstract T b();
    
    public abstract e c();
}
