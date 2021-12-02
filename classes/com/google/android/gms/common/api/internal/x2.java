// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.k0;
import com.google.android.gms.common.e;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.n;
import com.google.android.gms.common.api.a;

public final class x2<ResultT> extends e1
{
    private final a0<a.b, ResultT> b;
    private final n<ResultT> c;
    private final y d;
    
    public x2(final int n, final a0<a.b, ResultT> b, final n<ResultT> c, final y d) {
        super(n);
        this.c = c;
        this.b = b;
        this.d = d;
        if (n == 2 && b.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
    
    @Override
    public final void b(@j0 final Status status) {
        this.c.d(this.d.a(status));
    }
    
    @Override
    public final void c(@j0 final o3 o3, final boolean b) {
        o3.d(this.c, b);
    }
    
    @Override
    public final void d(@j0 final Exception ex) {
        this.c.d(ex);
    }
    
    @Override
    public final void f(final i.a<?> a) throws DeadObjectException {
        try {
            this.b.b(a.q(), this.c);
        }
        catch (RuntimeException ex) {
            this.d(ex);
        }
        catch (RemoteException ex2) {
            this.b(e(ex2));
        }
        catch (DeadObjectException ex3) {
            throw ex3;
        }
    }
    
    @k0
    @Override
    public final e[] g(final i.a<?> a) {
        return this.b.d();
    }
    
    @Override
    public final boolean h(final i.a<?> a) {
        return this.b.c();
    }
}
