// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class i2 extends x2
{
    final /* synthetic */ b1 K;
    final /* synthetic */ j3 L;
    
    i2(final j3 l, final b1 k) {
        this.L = l;
        this.K = k;
        super(l, true);
    }
    
    @Override
    final void a() throws RemoteException {
        x.k(j3.A(this.L)).getCurrentScreenClass(this.K);
    }
    
    @Override
    protected final void b() {
        this.K.G(null);
    }
}
