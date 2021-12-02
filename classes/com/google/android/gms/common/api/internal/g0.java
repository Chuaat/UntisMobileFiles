// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.Iterator;
import java.util.Set;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.t;
import androidx.annotation.k0;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;

public final class g0 implements c1
{
    private final b1 a;
    private boolean b;
    
    public g0(final b1 a) {
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final void H(final c c, final a<?> a, final boolean b) {
    }
    
    @Override
    public final void I() {
        if (this.b) {
            this.b = false;
            this.a.m(new i0(this, this));
        }
    }
    
    @Override
    public final void J(@k0 final Bundle bundle) {
    }
    
    @Override
    public final <A extends a.b, R extends t, T extends e.a<R, A>> T K(final T t) {
        return this.L(t);
    }
    
    @Override
    public final <A extends a.b, T extends e.a<? extends t, A>> T L(final T t) {
        try {
            this.a.r.A.b(t);
            final a.f f = this.a.r.r.get(t.A());
            x.l(f, "Appropriate Api was not requested.");
            if (!f.a() && this.a.k.containsKey(t.A())) {
                ((e.a)t).a(new Status(17));
            }
            else {
                ((e.a<R, A>)t).C((A)f);
            }
        }
        catch (DeadObjectException ex) {
            this.a.m(new f0(this, this));
        }
        return t;
    }
    
    @Override
    public final void b() {
    }
    
    final void c() {
        if (this.b) {
            this.b = false;
            this.a.r.A.a();
            this.f();
        }
    }
    
    @Override
    public final boolean f() {
        if (this.b) {
            return false;
        }
        final Set<q2> z = this.a.r.z;
        if (z != null && !z.isEmpty()) {
            this.b = true;
            final Iterator<q2> iterator = (Iterator<q2>)z.iterator();
            while (iterator.hasNext()) {
                iterator.next().e();
            }
            return false;
        }
        this.a.l(null);
        return true;
    }
    
    @Override
    public final void h(final int n) {
        this.a.l(null);
        this.a.s.b(n, this.b);
    }
}
