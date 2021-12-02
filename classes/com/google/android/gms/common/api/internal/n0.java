// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.c1;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;

final class n0 extends r0
{
    private final ArrayList<a.f> H;
    private final /* synthetic */ h0 I;
    
    public n0(final h0 i, final ArrayList<a.f> h) {
        this.I = i;
        super(i, null);
        this.H = h;
    }
    
    @c1
    public final void a() {
        this.I.a.r.s = this.I.D();
        final ArrayList<a.f> h = this.H;
        final int size = h.size();
        int i = 0;
        while (i < size) {
            final a.f value = h.get(i);
            ++i;
            value.i(this.I.o, this.I.a.r.s);
        }
    }
}
