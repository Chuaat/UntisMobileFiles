// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

public final class l3
{
    private final int a;
    private final boolean b;
    private final boolean c;
    final /* synthetic */ n3 d;
    
    l3(final n3 d, final int a, final boolean b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final String s) {
        this.d.C(this.a, this.b, this.c, s, null, null, null);
    }
    
    public final void b(final String s, final Object o) {
        this.d.C(this.a, this.b, this.c, s, o, null, null);
    }
    
    public final void c(final String s, final Object o, final Object o2) {
        this.d.C(this.a, this.b, this.c, s, o, o2, null);
    }
    
    public final void d(final String s, final Object o, final Object o2, final Object o3) {
        this.d.C(this.a, this.b, this.c, s, o, o2, o3);
    }
}
