// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.t;

public final class v2<A extends e.a<? extends t, a.b>> extends f2
{
    private final A b;
    
    public v2(final int n, final A a) {
        super(n);
        this.b = x.l(a, "Null methods are not runnable.");
    }
    
    @Override
    public final void b(@j0 final Status status) {
        try {
            ((e.a)this.b).a(status);
        }
        catch (IllegalStateException ex) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex);
        }
    }
    
    @Override
    public final void c(@j0 final o3 o3, final boolean b) {
        o3.c(this.b, b);
    }
    
    @Override
    public final void d(@j0 final Exception ex) {
        final String simpleName = ex.getClass().getSimpleName();
        final String localizedMessage = ex.getLocalizedMessage();
        final StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        final Status status = new Status(10, sb.toString());
        try {
            ((e.a)this.b).a(status);
        }
        catch (IllegalStateException ex2) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex2);
        }
    }
    
    @Override
    public final void f(final i.a<?> a) throws DeadObjectException {
        try {
            ((e.a<R, a.f>)this.b).C(a.q());
        }
        catch (RuntimeException ex) {
            this.d(ex);
        }
    }
}
