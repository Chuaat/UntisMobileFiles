// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;

@f2.a
public abstract class c0<A extends a.b, L>
{
    private final n.a<L> a;
    
    @f2.a
    protected c0(@RecentlyNonNull final n.a<L> a) {
        this.a = a;
    }
    
    @RecentlyNonNull
    @f2.a
    public n.a<L> a() {
        return this.a;
    }
    
    @f2.a
    protected abstract void b(@RecentlyNonNull final A p0, @RecentlyNonNull final com.google.android.gms.tasks.n<Boolean> p1) throws RemoteException;
}
