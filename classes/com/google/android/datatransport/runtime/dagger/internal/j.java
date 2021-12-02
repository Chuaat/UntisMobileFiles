// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import x1.e;

public final class j<T> implements g<T>, e<T>
{
    private static final j<Object> b;
    private final T a;
    
    static {
        b = new j<Object>(null);
    }
    
    private j(final T a) {
        this.a = a;
    }
    
    public static <T> g<T> a(final T t) {
        return new j<T>(p.c(t, "instance cannot be null"));
    }
    
    public static <T> g<T> b(final T t) {
        j<T> c;
        if (t == null) {
            c = c();
        }
        else {
            c = new j<T>(t);
        }
        return c;
    }
    
    private static <T> j<T> c() {
        return (j<T>)j.b;
    }
    
    @Override
    public T get() {
        return this.a;
    }
}
