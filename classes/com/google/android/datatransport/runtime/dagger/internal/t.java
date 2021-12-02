// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import e6.c;

public final class t<T> implements c<T>
{
    private static final Object c;
    private volatile c<T> a;
    private volatile Object b;
    
    static {
        c = new Object();
    }
    
    private t(final c<T> a) {
        this.b = t.c;
        this.a = a;
    }
    
    public static <P extends c<T>, T> c<T> a(final P p) {
        if (!(p instanceof t) && !(p instanceof f)) {
            return (c<T>)new t((e6.c<Object>)p.b(p));
        }
        return p;
    }
    
    public T get() {
        Object b;
        if ((b = this.b) == t.c) {
            final c<T> a = this.a;
            if (a == null) {
                b = this.b;
            }
            else {
                b = a.get();
                this.b = b;
                this.a = null;
            }
        }
        return (T)b;
    }
}
