// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.k0;
import com.google.android.gms.common.e;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;

public final class z2 extends w2<Boolean>
{
    private final n.a<?> c;
    
    public z2(final n.a<?> c, final com.google.android.gms.tasks.n<Boolean> n) {
        super(4, n);
        this.c = c;
    }
    
    @k0
    @Override
    public final e[] g(final i.a<?> a) {
        final x1 x1 = a.x().get(this.c);
        if (x1 == null) {
            return null;
        }
        return x1.a.c();
    }
    
    @Override
    public final boolean h(final i.a<?> a) {
        final x1 x1 = a.x().get(this.c);
        return x1 != null && x1.a.e();
    }
    
    public final void i(final i.a<?> a) throws RemoteException {
        final x1 x1 = a.x().remove(this.c);
        if (x1 != null) {
            x1.b.b(a.q(), super.b);
            x1.a.a();
            return;
        }
        super.b.e(Boolean.FALSE);
    }
}
