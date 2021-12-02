// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Queue;

abstract class d<T extends m>
{
    private static final int b = 20;
    private final Queue<T> a;
    
    d() {
        this.a = com.bumptech.glide.util.m.f(20);
    }
    
    abstract T a();
    
    T b() {
        m a;
        if ((a = this.a.poll()) == null) {
            a = this.a();
        }
        return (T)a;
    }
    
    public void c(final T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
