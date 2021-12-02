// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.j0;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;

public abstract class f2
{
    public final int a;
    
    public f2(final int a) {
        this.a = a;
    }
    
    private static Status e(final RemoteException ex) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ex.getClass().getSimpleName());
        sb.append(": ");
        sb.append(ex.getLocalizedMessage());
        return new Status(19, sb.toString());
    }
    
    public abstract void b(@j0 final Status p0);
    
    public abstract void c(@j0 final o3 p0, final boolean p1);
    
    public abstract void d(@j0 final Exception p0);
    
    public abstract void f(final i.a<?> p0) throws DeadObjectException;
}
