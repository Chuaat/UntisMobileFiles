// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

public interface d extends IInterface
{
    Bundle G1(final int p0, final String p1, final String p2, final String p3, final String p4, final Bundle p5) throws RemoteException;
    
    Bundle J1(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    Bundle K0(final int p0, final String p1, final String p2, final String p3, final Bundle p4) throws RemoteException;
    
    Bundle S0(final int p0, final String p1, final String p2, final String p3) throws RemoteException;
    
    Bundle Y0(final int p0, final String p1, final String p2, final String p3, final String p4) throws RemoteException;
    
    Bundle Z(final int p0, final String p1, final String p2, final Bundle p3, final Bundle p4) throws RemoteException;
    
    int d0(final int p0, final String p1, final String p2) throws RemoteException;
    
    int e2(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    int g1(final int p0, final String p1, final String p2) throws RemoteException;
    
    Bundle j2(final int p0, final String p1, final String p2, final String p3, final Bundle p4) throws RemoteException;
    
    Bundle k0(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    Bundle r2(final int p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    Bundle w0(final int p0, final String p1, final String p2, final String p3, final Bundle p4) throws RemoteException;
}
