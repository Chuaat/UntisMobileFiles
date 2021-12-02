// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;

final class b2 extends t<Object, Object>
{
    private final /* synthetic */ u.a d;
    
    b2(final u.a d, final n n, final e[] array, final boolean b) {
        this.d = d;
        super(n, array, b);
    }
    
    @Override
    protected final void d(final a.b b, final com.google.android.gms.tasks.n n) throws RemoteException {
        this.d.a.a(b, n);
    }
}
