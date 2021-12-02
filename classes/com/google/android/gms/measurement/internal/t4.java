// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;

final class t4 implements UncaughtExceptionHandler
{
    private final String a;
    final /* synthetic */ w4 b;
    
    public t4(final w4 b, final String a) {
        this.b = b;
        x.k(a);
        this.a = a;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        synchronized (this) {
            this.b.a.c().o().b(this.a, t);
        }
    }
}
