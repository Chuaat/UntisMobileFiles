// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamite.DynamiteModule;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;
import android.content.Context;

final class a2 extends x2
{
    final /* synthetic */ String K;
    final /* synthetic */ String L;
    final /* synthetic */ Context M;
    final /* synthetic */ Bundle N;
    final /* synthetic */ j3 O;
    
    a2(final j3 o, final String k, final String l, final Context m, final Bundle n) {
        this.O = o;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        super(o, true);
    }
    
    public final void a() {
        try {
            String l;
            String k;
            String e;
            if (j3.q(this.O, this.K, this.L)) {
                l = this.L;
                k = this.K;
                e = j3.E(this.O);
            }
            else {
                final String s = null;
                l = (k = s);
                e = s;
            }
            x.k(this.M);
            final j3 o = this.O;
            j3.N(o, o.B(this.M, true));
            if (j3.A(this.O) == null) {
                Log.w(j3.E(this.O), "Failed to connect to measurement client.");
                return;
            }
            final int a = DynamiteModule.a(this.M, "com.google.android.gms.measurement.dynamite");
            final int c = DynamiteModule.c(this.M, "com.google.android.gms.measurement.dynamite");
            x.k(j3.A(this.O)).initialize(f.z2(this.M), new o1(42097L, Math.max(a, c), c < a, e, k, l, this.N, r4.a(this.M)), super.G);
        }
        catch (Exception ex) {
            j3.O(this.O, ex, true, false);
        }
    }
}
