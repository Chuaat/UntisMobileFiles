// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.g;

final class k9
{
    private final g a;
    private long b;
    
    public k9(final g a) {
        x.k(a);
        this.a = a;
    }
    
    public final void a() {
        this.b = 0L;
    }
    
    public final void b() {
        this.b = this.a.d();
    }
    
    public final boolean c(final long n) {
        return this.b == 0L || this.a.d() - this.b >= 3600000L;
    }
}
