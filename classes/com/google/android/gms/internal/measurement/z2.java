// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.b6;

final class z2 extends k1
{
    private final b6 e;
    
    z2(final b6 e) {
        this.e = e;
    }
    
    @Override
    public final void V(final String s, final String s2, final Bundle bundle, final long n) {
        this.e.a(s, s2, bundle, n);
    }
    
    @Override
    public final int c() {
        return System.identityHashCode(this.e);
    }
}
