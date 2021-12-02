// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.util.Log;

final class k3 implements Runnable
{
    final /* synthetic */ int G;
    final /* synthetic */ String H;
    final /* synthetic */ Object I;
    final /* synthetic */ Object J;
    final /* synthetic */ Object K;
    final /* synthetic */ n3 L;
    
    k3(final n3 l, final int g, final String h, final Object i, final Object j, final Object k) {
        this.L = l;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public final void run() {
        final c4 c = this.L.a.C();
        if (c.k()) {
            if (n3.l(this.L) == '\0') {
                n3 n3;
                char c2;
                if (this.L.a.w().E()) {
                    n3 = this.L;
                    n3.a.L();
                    c2 = 'C';
                }
                else {
                    n3 = this.L;
                    n3.a.L();
                    c2 = 'c';
                }
                com.google.android.gms.measurement.internal.n3.B(n3, c2);
            }
            if (n3.m(this.L) < 0L) {
                final n3 l = this.L;
                l.a.w().n();
                n3.A(l, 42097L);
            }
            final char char1 = "01VDIWEA?".charAt(this.G);
            final char i = n3.l(this.L);
            final long m = n3.m(this.L);
            final String x = n3.x(true, this.H, this.I, this.J, this.K);
            final StringBuilder sb = new StringBuilder(String.valueOf(x).length() + 24);
            sb.append("2");
            sb.append(char1);
            sb.append(i);
            sb.append(m);
            sb.append(":");
            sb.append(x);
            String s;
            if ((s = sb.toString()).length() > 1024) {
                s = this.H.substring(0, 1024);
            }
            final a4 d = c.d;
            if (d != null) {
                d.b(s, 1L);
            }
            return;
        }
        Log.println(6, this.L.z(), "Persisted config not initialized. Not logging error/warn");
    }
}
