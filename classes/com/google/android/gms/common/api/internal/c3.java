// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import com.google.android.gms.common.c;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.k0;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.base.p;
import android.os.Looper;
import com.google.android.gms.common.g;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;

public abstract class c3 extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    protected volatile boolean H;
    protected final AtomicReference<e3> I;
    private final Handler J;
    protected final g K;
    
    protected c3(final m m) {
        this(m, g.y());
    }
    
    @d0
    c3(final m m, final g k) {
        super(m);
        this.I = new AtomicReference<e3>(null);
        this.J = new p(Looper.getMainLooper());
        this.K = k;
    }
    
    private static int m(@k0 final e3 e3) {
        if (e3 == null) {
            return -1;
        }
        return e3.a();
    }
    
    @Override
    public void f(int intExtra, int n, final Intent intent) {
        final e3 e3 = this.I.get();
        final int n2 = 1;
        final int n3 = 1;
        e3 newValue = null;
        Label_0187: {
            if (intExtra != 1) {
                if (intExtra != 2) {
                    newValue = e3;
                }
                else {
                    final int j = this.K.j((Context)this.b());
                    if (j == 0) {
                        n = n3;
                    }
                    else {
                        n = 0;
                    }
                    if (e3 == null) {
                        return;
                    }
                    newValue = e3;
                    intExtra = n;
                    if (e3.b().M() != 18) {
                        break Label_0187;
                    }
                    newValue = e3;
                    intExtra = n;
                    if (j == 18) {
                        return;
                    }
                    break Label_0187;
                }
            }
            else {
                if (n == -1) {
                    newValue = e3;
                    intExtra = n2;
                    break Label_0187;
                }
                newValue = e3;
                if (n == 0) {
                    if (e3 == null) {
                        return;
                    }
                    intExtra = 13;
                    if (intent != null) {
                        intExtra = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    newValue = new e3(new c(intExtra, null, e3.b().toString()), m(e3));
                    this.I.set(newValue);
                }
            }
            intExtra = 0;
        }
        if (intExtra != 0) {
            this.p();
            return;
        }
        if (newValue != null) {
            this.o(newValue.b(), newValue.a());
        }
    }
    
    @Override
    public void g(@k0 final Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            final AtomicReference<e3> i = this.I;
            e3 newValue;
            if (bundle.getBoolean("resolving_error", false)) {
                newValue = new e3(new c(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            }
            else {
                newValue = null;
            }
            i.set(newValue);
        }
    }
    
    @Override
    public void j(final Bundle bundle) {
        super.j(bundle);
        final e3 e3 = this.I.get();
        if (e3 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", e3.a());
            bundle.putInt("failed_status", e3.b().M());
            bundle.putParcelable("failed_resolution", (Parcelable)e3.b().q1());
        }
    }
    
    @Override
    public void k() {
        super.k();
        this.H = true;
    }
    
    @Override
    public void l() {
        super.l();
        this.H = false;
    }
    
    protected abstract void n();
    
    protected abstract void o(final c p0, final int p1);
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.o(new c(13, null), m(this.I.get()));
        this.p();
    }
    
    protected final void p() {
        this.I.set(null);
        this.n();
    }
    
    public final void q(final c c, final int n) {
        final e3 newValue = new e3(c, n);
        if (this.I.compareAndSet(null, newValue)) {
            this.J.post((Runnable)new d3(this, newValue));
        }
    }
}
