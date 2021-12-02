// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;

final class q
{
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;
    
    q(final String a, final String b, final long c, final long d, final long e, final long f, final long g, final Long h, final Long i, final Long j, final Boolean k) {
        x.g(a);
        x.g(b);
        final boolean b2 = true;
        x.a(c >= 0L);
        x.a(d >= 0L);
        x.a(e >= 0L);
        x.a(g >= 0L && b2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    final q a(final Long n, final Long n2, Boolean b) {
        if (b != null && !b) {
            b = null;
        }
        return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, n, n2, b);
    }
    
    final q b(final long n, final long l) {
        return new q(this.a, this.b, this.c, this.d, this.e, this.f, n, l, this.i, this.j, this.k);
    }
    
    final q c(final long n) {
        return new q(this.a, this.b, this.c, this.d, this.e, n, this.g, this.h, this.i, this.j, this.k);
    }
}
