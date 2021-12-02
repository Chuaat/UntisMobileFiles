// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.Iterator;
import com.google.android.gms.common.internal.e;
import android.app.PendingIntent;
import com.google.android.gms.common.c;
import java.util.ArrayList;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.api.a;
import java.util.Map;

final class m0 extends r0
{
    private final Map<a.f, j0> H;
    final /* synthetic */ h0 I;
    
    public m0(final h0 i, final Map<a.f, j0> h) {
        this.I = i;
        super(i, null);
        this.H = h;
    }
    
    @androidx.annotation.c1
    @d6.a("mLock")
    public final void a() {
        final n0 n0 = new n0(this.I.d);
        final ArrayList<a.f> list = new ArrayList<a.f>();
        final ArrayList<a.f> list2 = new ArrayList<a.f>();
        for (final a.f f : this.H.keySet()) {
            if (f.r() && !this.H.get(f).c) {
                list.add(f);
            }
            else {
                list2.add(f);
            }
        }
        int n2 = -1;
        final boolean empty = list.isEmpty();
        final int n3 = 0;
        int i = 0;
        if (empty) {
            while (i < list2.size()) {
                final a.f value = list2.get(i);
                ++i;
                final int a = n0.a(this.I.c, value);
                if ((n2 = a) == 0) {
                    n2 = a;
                    break;
                }
            }
        }
        else {
            final int size = list.size();
            int j = n3;
            while (j < size) {
                final a.f value2 = list.get(j);
                ++j;
                final int a2 = n0.a(this.I.c, value2);
                if ((n2 = a2) != 0) {
                    n2 = a2;
                    break;
                }
            }
        }
        if (n2 != 0) {
            this.I.a.m(new l0(this, this.I, new c(n2, null)));
            return;
        }
        if (this.I.m && this.I.k != null) {
            this.I.k.f();
        }
        for (final a.f f2 : this.H.keySet()) {
            final j0 j2 = this.H.get(f2);
            if (f2.r() && n0.a(this.I.c, f2) != 0) {
                this.I.a.m(new o0(this, this.I, j2));
            }
            else {
                f2.n(j2);
            }
        }
    }
}
