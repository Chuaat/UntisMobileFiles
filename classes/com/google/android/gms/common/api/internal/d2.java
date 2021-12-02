// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;

final class d2 extends c0<Object, Object>
{
    private final /* synthetic */ u.a b;
    
    d2(final u.a b, final n.a a) {
        this.b = b;
        super(a);
    }
    
    @Override
    protected final void b(final a.b b, final com.google.android.gms.tasks.n n) throws RemoteException {
        this.b.b.a(b, n);
    }
}
