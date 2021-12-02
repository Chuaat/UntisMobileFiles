// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.plugins.a;
import io.reactivex.disposables.c;
import o7.d;
import io.reactivex.f;
import io.reactivex.n0;
import io.reactivex.v;
import io.reactivex.i0;
import io.reactivex.q;

public enum h implements q<Object>, i0<Object>, v<Object>, n0<Object>, f, d, c
{
    G;
    
    public static <T> i0<T> g() {
        return (i0<T>)h.G;
    }
    
    public static <T> o7.c<T> h() {
        return (o7.c<T>)h.G;
    }
    
    @Override
    public void b(final Throwable t) {
        a.Y(t);
    }
    
    public void cancel() {
    }
    
    @Override
    public void d(final Object o) {
    }
    
    public void dispose() {
    }
    
    @Override
    public void f() {
    }
    
    public boolean i() {
        return true;
    }
    
    @Override
    public void l(final c c) {
        c.dispose();
    }
    
    @Override
    public void m(final Object o) {
    }
    
    public void v(final long n) {
    }
    
    @Override
    public void z(final d d) {
        d.cancel();
    }
}
