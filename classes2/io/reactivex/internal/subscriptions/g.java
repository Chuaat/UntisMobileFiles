// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import o7.d;
import o7.c;
import y5.l;

public enum g implements l<Object>
{
    G;
    
    public static void b(final c<?> c) {
        c.z((d)g.G);
        c.f();
    }
    
    public static void d(final Throwable t, final c<?> c) {
        c.z((d)g.G);
        c.b(t);
    }
    
    @Override
    public int E(final int n) {
        return n & 0x2;
    }
    
    public void cancel() {
    }
    
    public void clear() {
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public boolean offer(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    public boolean p(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @io.reactivex.annotations.g
    public Object poll() {
        return null;
    }
    
    @Override
    public String toString() {
        return "EmptySubscription";
    }
    
    public void v(final long n) {
        j.m(n);
    }
}
