// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.n;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;

final class m2 extends a0<Object, Object>
{
    private final /* synthetic */ a d;
    
    m2(final a d, final e[] array, final boolean b, final int n) {
        this.d = d;
        super(array, b, n, null);
    }
    
    @Override
    protected final void b(final com.google.android.gms.common.api.a.b b, final n n) throws RemoteException {
        this.d.a.a(b, n);
    }
}
