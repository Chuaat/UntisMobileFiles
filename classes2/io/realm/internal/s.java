// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import c6.h;
import io.realm.y;

public class s implements y
{
    private final y G;
    private final Throwable H;
    private final b I;
    
    public s(final OsCollectionChangeSet g) {
        this.G = g;
        final boolean i = g.i();
        final Throwable d = g.d();
        this.H = d;
        b j;
        if (d != null) {
            j = b.I;
        }
        else if (i) {
            j = b.G;
        }
        else {
            j = b.H;
        }
        this.I = j;
    }
    
    @Override
    public a[] a() {
        return this.G.a();
    }
    
    @Override
    public a[] b() {
        return this.G.b();
    }
    
    @Override
    public a[] c() {
        return this.G.c();
    }
    
    @h
    @Override
    public Throwable d() {
        return this.H;
    }
    
    @Override
    public int[] e() {
        return this.G.e();
    }
    
    @Override
    public int[] f() {
        return this.G.f();
    }
    
    @Override
    public int[] g() {
        return this.G.g();
    }
    
    @Override
    public b getState() {
        return this.I;
    }
}
