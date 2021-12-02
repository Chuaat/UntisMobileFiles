// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.n;

abstract class w2<T> extends e1
{
    protected final n<T> b;
    
    public w2(final int n, final n<T> b) {
        super(n);
        this.b = b;
    }
    
    @Override
    public void b(@j0 final Status status) {
        this.b.d(new b(status));
    }
    
    @Override
    public void c(@j0 final o3 o3, final boolean b) {
    }
    
    @Override
    public void d(@j0 final Exception ex) {
        this.b.d(ex);
    }
    
    @Override
    public final void f(final i.a<?> a) throws DeadObjectException {
        try {
            this.i(a);
        }
        catch (RuntimeException ex) {
            this.d(ex);
        }
        catch (RemoteException ex2) {
            this.b(e(ex2));
        }
        catch (DeadObjectException ex3) {
            this.b(e((RemoteException)ex3));
            throw ex3;
        }
    }
    
    protected abstract void i(final i.a<?> p0) throws RemoteException;
}
