// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.c1;

final class f9
{
    private e9 a;
    final /* synthetic */ j9 b;
    
    f9(final j9 b) {
        this.b = b;
    }
    
    @c1
    final void a(final long n) {
        this.a = new e9(this, this.b.a.F().a(), n);
        j9.l(this.b).postDelayed((Runnable)this.a, 2000L);
    }
    
    @c1
    final void b() {
        this.b.e();
        if (this.a != null) {
            j9.l(this.b).removeCallbacks((Runnable)this.a);
        }
        this.b.a.C().q.a(false);
    }
}
