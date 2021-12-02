// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import com.google.android.gms.clearcut.g;
import com.google.android.gms.common.data.DataHolder;
import android.os.RemoteException;
import com.google.android.gms.clearcut.e;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

public interface n6 extends IInterface
{
    void B1(final Status p0, final e p1) throws RemoteException;
    
    void M1(final Status p0) throws RemoteException;
    
    void X1(final Status p0) throws RemoteException;
    
    void h0(final Status p0, final long p1) throws RemoteException;
    
    void n2(final Status p0) throws RemoteException;
    
    void o2(final Status p0, final e p1) throws RemoteException;
    
    void p0(final DataHolder p0) throws RemoteException;
    
    void q2(final Status p0, final long p1) throws RemoteException;
    
    void z1(final Status p0, final g[] p1) throws RemoteException;
}
