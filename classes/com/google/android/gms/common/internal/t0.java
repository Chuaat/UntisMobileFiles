// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

final class t0 implements a
{
    private final /* synthetic */ n a;
    private final /* synthetic */ com.google.android.gms.tasks.n b;
    private final /* synthetic */ w.a c;
    private final /* synthetic */ w.b d;
    
    t0(final n a, final com.google.android.gms.tasks.n b, final w.a c, final w.b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Status status) {
        if (status.j3()) {
            this.b.c(this.c.a(this.a.e(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.b(this.d.N(status));
    }
}
