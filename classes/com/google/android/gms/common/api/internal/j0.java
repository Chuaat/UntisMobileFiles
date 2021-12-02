// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.x;
import android.os.Looper;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.a;
import java.lang.ref.WeakReference;
import com.google.android.gms.common.internal.e;

final class j0 implements c
{
    private final WeakReference<h0> a;
    private final com.google.android.gms.common.api.a<?> b;
    private final boolean c;
    
    public j0(final h0 referent, final com.google.android.gms.common.api.a<?> b, final boolean c) {
        this.a = new WeakReference<h0>(referent);
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(@androidx.annotation.j0 final com.google.android.gms.common.c c) {
        final h0 h0 = this.a.get();
        if (h0 == null) {
            return;
        }
        com.google.android.gms.common.internal.x.r(Looper.myLooper() == h0.a.r.q(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        h0.b.lock();
        try {
            if (com.google.android.gms.common.api.internal.h0.k(h0, 0)) {
                if (!c.j2()) {
                    h0.n(c, this.b, this.c);
                }
                if (h0.t()) {
                    h0.u();
                }
            }
        }
        finally {
            h0.b.unlock();
        }
    }
}
