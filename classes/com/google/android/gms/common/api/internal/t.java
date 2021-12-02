// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import com.google.android.gms.common.e;
import com.google.android.gms.common.api.a;

@f2.a
public abstract class t<A extends a.b, L>
{
    private final n<L> a;
    @k0
    private final e[] b;
    private final boolean c;
    
    @f2.a
    protected t(@RecentlyNonNull final n<L> a) {
        this.a = a;
        this.b = null;
        this.c = false;
    }
    
    @f2.a
    protected t(@RecentlyNonNull final n<L> a, @RecentlyNonNull final e[] b, @RecentlyNonNull final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @f2.a
    public void a() {
        this.a.a();
    }
    
    @RecentlyNullable
    @f2.a
    public n.a<L> b() {
        return this.a.b();
    }
    
    @RecentlyNullable
    @f2.a
    public e[] c() {
        return this.b;
    }
    
    @f2.a
    protected abstract void d(@RecentlyNonNull final A p0, @RecentlyNonNull final com.google.android.gms.tasks.n<Void> p1) throws RemoteException;
    
    @RecentlyNonNull
    public final boolean e() {
        return this.c;
    }
}
