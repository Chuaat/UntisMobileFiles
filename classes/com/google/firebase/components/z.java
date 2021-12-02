// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import androidx.annotation.b1;
import n3.b;

public class z<T> implements b<T>
{
    private static final Object c;
    private volatile Object a;
    private volatile b<T> b;
    
    static {
        c = new Object();
    }
    
    z(final T a) {
        this.a = z.c;
        this.a = a;
    }
    
    public z(final b<T> b) {
        this.a = z.c;
        this.b = b;
    }
    
    @b1
    boolean a() {
        return this.a != z.c;
    }
    
    public T get() {
        final Object a = this.a;
        final Object c = z.c;
        final T t = (T)a;
        if (a == c) {
            synchronized (this) {
                if (this.a == c) {
                    this.a = this.b.get();
                    this.b = null;
                }
            }
        }
        return t;
    }
}
