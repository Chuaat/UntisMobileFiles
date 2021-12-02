// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import androidx.annotation.j0;
import androidx.annotation.w;
import n3.a$a;
import n3.a;
import n3.b;

class f0<T> implements b<T>, a<T>
{
    private static final a$a<Object> c;
    private static final b<Object> d;
    @w("this")
    private a$a<T> a;
    private volatile b<T> b;
    
    static {
        c = (a$a)d0.a;
        d = (b)e0.a;
    }
    
    private f0(final a$a<T> a, final b<T> b) {
        this.a = a;
        this.b = b;
    }
    
    static <T> f0<T> e() {
        return new f0<T>((n3.a$a<T>)f0.c, (n3.b<T>)f0.d);
    }
    
    static <T> f0<T> i(final b<T> b) {
        return new f0<T>(null, b);
    }
    
    public void a(@j0 final a$a<T> a$a) {
        final b<T> b = this.b;
        final b<Object> d = f0.d;
        if (b != d) {
            a$a.a((b)b);
            return;
        }
        b<T> b2 = null;
        synchronized (this) {
            final b<T> b3 = this.b;
            if (b3 != d) {
                b2 = b3;
            }
            else {
                this.a = (a$a<T>)new c0(this.a, a$a);
            }
            // monitorexit(this)
            if (b2 != null) {
                a$a.a((b)b3);
            }
        }
    }
    
    public T get() {
        return (T)this.b.get();
    }
    
    void j(final b<T> b) {
        if (this.b == f0.d) {
            synchronized (this) {
                final a$a<T> a = this.a;
                this.a = null;
                this.b = b;
                // monitorexit(this)
                a.a((b)b);
                return;
            }
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
