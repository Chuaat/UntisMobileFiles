// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.u4;
import java.util.List;
import com.google.android.gms.internal.measurement.e5;

final class y9
{
    e5 a;
    List<Long> b;
    List<u4> c;
    long d;
    final /* synthetic */ z9 e;
    
    private static final long b(final u4 u4) {
        return u4.z() / 1000L / 60L / 60L;
    }
    
    public final boolean a(final long l, final u4 u4) {
        x.k(u4);
        if (this.c == null) {
            this.c = new ArrayList<u4>();
        }
        if (this.b == null) {
            this.b = new ArrayList<Long>();
        }
        if (this.c.size() > 0 && b(this.c.get(0)) != b(u4)) {
            return false;
        }
        final long d = this.d + u4.y();
        this.e.S();
        if (d >= Math.max(0, a3.j.a(null))) {
            return false;
        }
        this.d = d;
        this.c.add(u4);
        this.b.add(l);
        final int size = this.c.size();
        this.e.S();
        return size < Math.max(1, a3.k.a(null));
    }
}
