// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;
import android.os.IInterface;

public interface d extends IInterface
{
    void I1(final h p0) throws RemoteException;
    
    void N(final Status p0) throws RemoteException;
    
    void U(final Status p0, final GoogleSignInAccount p1) throws RemoteException;
    
    void Z1(final c p0, final com.google.android.gms.signin.internal.c p1) throws RemoteException;
    
    void a2(final n p0) throws RemoteException;
    
    void b2(final Status p0) throws RemoteException;
}
