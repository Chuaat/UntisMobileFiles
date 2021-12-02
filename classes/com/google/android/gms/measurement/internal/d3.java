// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;
import androidx.annotation.k0;
import android.os.RemoteException;
import android.os.IInterface;

public interface d3 extends IInterface
{
    void D0(final c p0) throws RemoteException;
    
    List<c> E0(final String p0, @k0 final String p1, @k0 final String p2) throws RemoteException;
    
    @k0
    byte[] L0(final u p0, final String p1) throws RemoteException;
    
    void U0(final na p0) throws RemoteException;
    
    List<c> W0(@k0 final String p0, @k0 final String p1, final na p2) throws RemoteException;
    
    @k0
    List<ca> W1(final na p0, final boolean p1) throws RemoteException;
    
    void X(final Bundle p0, final na p1) throws RemoteException;
    
    void b1(final na p0) throws RemoteException;
    
    void c0(final c p0, final na p1) throws RemoteException;
    
    void c2(final u p0, final String p1, @k0 final String p2) throws RemoteException;
    
    List<ca> i0(final String p0, @k0 final String p1, @k0 final String p2, final boolean p3) throws RemoteException;
    
    void k1(final u p0, final na p1) throws RemoteException;
    
    void l0(final na p0) throws RemoteException;
    
    void q1(final na p0) throws RemoteException;
    
    void s1(final long p0, @k0 final String p1, @k0 final String p2, final String p3) throws RemoteException;
    
    void t2(final ca p0, final na p1) throws RemoteException;
    
    List<ca> u1(@k0 final String p0, @k0 final String p1, final boolean p2, final na p3) throws RemoteException;
    
    @k0
    String x0(final na p0) throws RemoteException;
}
