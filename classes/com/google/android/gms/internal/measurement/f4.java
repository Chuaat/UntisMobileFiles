// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class f4
{
    final y a;
    final g5 b;
    final g5 c;
    final j8 d;
    
    public f4() {
        final y a = new y();
        this.a = a;
        final g5 c = new g5(null, a);
        this.c = c;
        this.b = c.a();
        final j8 d = new j8();
        this.d = d;
        c.g("require", new lg(d));
        d.a("internal.platform", e3.G);
        c.g("runtime.counter", new i(0.0));
    }
    
    public final q a(final g5 g5, final a6... array) {
        q q = com.google.android.gms.internal.measurement.q.f;
        for (int length = array.length, i = 0; i < length; ++i) {
            final q a = i7.a(array[i]);
            h6.c(this.c);
            if (!(a instanceof r)) {
                q = a;
                if (!(a instanceof p)) {
                    continue;
                }
            }
            q = this.a.a(g5, a);
        }
        return q;
    }
}
