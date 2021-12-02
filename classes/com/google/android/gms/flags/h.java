// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import com.google.android.gms.dynamic.d;
import android.os.RemoteException;
import android.os.IInterface;

public interface h extends IInterface
{
    boolean getBooleanFlagValue(final String p0, final boolean p1, final int p2) throws RemoteException;
    
    int getIntFlagValue(final String p0, final int p1, final int p2) throws RemoteException;
    
    long getLongFlagValue(final String p0, final long p1, final int p2) throws RemoteException;
    
    String getStringFlagValue(final String p0, final String p1, final int p2) throws RemoteException;
    
    void init(final d p0) throws RemoteException;
}
