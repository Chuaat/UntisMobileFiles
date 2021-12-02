// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.g;
import com.google.android.gms.signin.internal.n;
import java.lang.ref.WeakReference;
import com.google.android.gms.signin.internal.e;

final class q0 extends e
{
    private final WeakReference<h0> f;
    
    q0(final h0 referent) {
        this.f = new WeakReference<h0>(referent);
    }
    
    @androidx.annotation.g
    @Override
    public final void a2(final n n) {
        final h0 h0 = this.f.get();
        if (h0 == null) {
            return;
        }
        h0.a.m(new p0(this, h0, h0, n));
    }
}
