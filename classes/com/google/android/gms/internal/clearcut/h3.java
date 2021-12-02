// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class h3 implements q2
{
    private final s2 a;
    private final String b;
    private final i3 c;
    
    h3(final s2 a, final String b, final Object[] array) {
        this.a = a;
        this.b = b;
        this.c = new i3(a.getClass(), b, array);
    }
    
    @Override
    public final int a() {
        if ((this.c.d & 0x1) == 0x1) {
            return j1.g.i;
        }
        return j1.g.j;
    }
    
    @Override
    public final boolean b() {
        return (this.c.d & 0x2) == 0x2;
    }
    
    @Override
    public final s2 c() {
        return this.a;
    }
    
    public final int d() {
        return this.c.e;
    }
    
    final i3 e() {
        return this.c;
    }
    
    public final int f() {
        return this.c.h;
    }
    
    public final int g() {
        return this.c.i;
    }
    
    public final int h() {
        return this.c.j;
    }
    
    public final int i() {
        return this.c.m;
    }
    
    final int[] j() {
        return this.c.n;
    }
    
    public final int k() {
        return this.c.l;
    }
    
    public final int l() {
        return this.c.k;
    }
}
