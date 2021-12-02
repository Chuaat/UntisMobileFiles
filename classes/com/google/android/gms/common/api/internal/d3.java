// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.g0;
import android.app.Dialog;
import com.google.android.gms.common.c;
import com.google.android.gms.common.g;
import android.content.DialogInterface$OnCancelListener;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.x;
import android.app.PendingIntent;

final class d3 implements Runnable
{
    private final e3 G;
    final /* synthetic */ c3 H;
    
    d3(final c3 h, final e3 g) {
        this.H = h;
        this.G = g;
    }
    
    @g0
    @Override
    public final void run() {
        if (!this.H.H) {
            return;
        }
        final c b = this.G.b();
        if (b.Q1()) {
            final c3 h = this.H;
            h.G.startActivityForResult(GoogleApiActivity.b((Context)h.b(), x.k(b.q1()), this.G.a(), false), 1);
            return;
        }
        final c3 h2 = this.H;
        if (h2.K.e((Context)h2.b(), b.M(), null) != null) {
            final c3 h3 = this.H;
            h3.K.O(h3.b(), this.H.G, b.M(), 2, (DialogInterface$OnCancelListener)this.H);
            return;
        }
        if (b.M() == 18) {
            final Dialog f = g.F(this.H.b(), (DialogInterface$OnCancelListener)this.H);
            final c3 h4 = this.H;
            h4.K.H(h4.b().getApplicationContext(), new f3(this, f));
            return;
        }
        this.H.o(b, this.G.a());
    }
}
