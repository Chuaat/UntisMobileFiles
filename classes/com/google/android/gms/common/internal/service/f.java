// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

final class f extends b
{
    private final e.b<Status> f;
    
    public f(final e.b<Status> f) {
        this.f = f;
    }
    
    @Override
    public final void h(final int n) throws RemoteException {
        this.f.b(new Status(n));
    }
}
