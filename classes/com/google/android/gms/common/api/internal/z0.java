// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class z0 extends q1
{
    private WeakReference<t0> a;
    
    z0(final t0 referent) {
        this.a = new WeakReference<t0>(referent);
    }
    
    @Override
    public final void a() {
        final t0 t0 = this.a.get();
        if (t0 == null) {
            return;
        }
        t0.V();
    }
}
