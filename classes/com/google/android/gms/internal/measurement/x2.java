// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

abstract class x2 implements Runnable
{
    final long G;
    final long H;
    final boolean I;
    final /* synthetic */ j3 J;
    
    x2(final j3 j, final boolean i) {
        this.J = j;
        this.G = j.b.a();
        this.H = j.b.d();
        this.I = i;
    }
    
    abstract void a() throws RemoteException;
    
    protected void b() {
    }
    
    @Override
    public final void run() {
        if (j3.p(this.J)) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch (Exception ex) {
            j3.O(this.J, ex, false, this.I);
            this.b();
        }
    }
}
