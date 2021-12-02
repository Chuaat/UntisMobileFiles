// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.k0;
import com.google.android.gms.common.e;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.n;

public final class y2 extends w2<Void>
{
    private final x1 c;
    
    public y2(final x1 c, final n<Void> n) {
        super(3, n);
        this.c = c;
    }
    
    @k0
    @Override
    public final e[] g(final i.a<?> a) {
        return this.c.a.c();
    }
    
    @Override
    public final boolean h(final i.a<?> a) {
        return this.c.a.e();
    }
    
    public final void i(final i.a<?> a) throws RemoteException {
        this.c.a.d(a.q(), super.b);
        final com.google.android.gms.common.api.internal.n.a<?> b = this.c.a.b();
        if (b != null) {
            a.x().put(b, this.c);
        }
    }
}
