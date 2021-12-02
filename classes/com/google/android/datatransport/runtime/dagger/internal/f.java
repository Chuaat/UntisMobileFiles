// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import x1.e;
import e6.c;

public final class f<T> implements c<T>, e<T>
{
    private static final Object c;
    private volatile c<T> a;
    private volatile Object b;
    
    static {
        c = new Object();
    }
    
    private f(final c<T> a) {
        this.b = f.c;
        this.a = a;
    }
    
    public static <P extends c<T>, T> e<T> a(final P p) {
        if (p instanceof e) {
            return (e<T>)p;
        }
        return new f<T>(p.b(p));
    }
    
    public static <P extends c<T>, T> c<T> b(final P p) {
        p.b(p);
        if (p instanceof f) {
            return p;
        }
        return (c<T>)new f((e6.c<Object>)p);
    }
    
    public static Object c(final Object obj, final Object obj2) {
        if (obj != f.c && !(obj instanceof o) && obj != obj2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Scoped provider was invoked recursively returning different results: ");
            sb.append(obj);
            sb.append(" & ");
            sb.append(obj2);
            sb.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(sb.toString());
        }
        return obj2;
    }
    
    public T get() {
        final Object b = this.b;
        final Object c = f.c;
        final T t = (T)b;
        if (b == c) {
            synchronized (this) {
                if (this.b == c) {
                    this.b = c(this.b, this.a.get());
                    this.a = null;
                }
            }
        }
        return t;
    }
}
