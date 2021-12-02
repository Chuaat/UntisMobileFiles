// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.annotations.g;
import io.reactivex.n0;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.disposables.c;
import io.reactivex.f;
import y5.j;

public enum e implements j<Object>
{
    G, 
    H;
    
    public static void b(final f f) {
        f.l(e.G);
        f.f();
    }
    
    public static void d(final v<?> v) {
        v.l(e.G);
        v.f();
    }
    
    public static void f(final i0<?> i0) {
        i0.l(e.G);
        i0.f();
    }
    
    public static void g(final Throwable t, final f f) {
        f.l(e.G);
        f.b(t);
    }
    
    public static void j(final Throwable t, final v<?> v) {
        v.l(e.G);
        v.b(t);
    }
    
    public static void l(final Throwable t, final i0<?> i0) {
        i0.l(e.G);
        i0.b(t);
    }
    
    public static void m(final Throwable t, final n0<?> n0) {
        n0.l(e.G);
        n0.b(t);
    }
    
    @Override
    public int E(final int n) {
        return n & 0x2;
    }
    
    @Override
    public void clear() {
    }
    
    @Override
    public void dispose() {
    }
    
    @Override
    public boolean i() {
        return this == e.G;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public boolean offer(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public boolean p(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @g
    @Override
    public Object poll() throws Exception {
        return null;
    }
}
