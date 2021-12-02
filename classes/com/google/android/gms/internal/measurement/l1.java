// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

public interface l1 extends IInterface
{
    void V(final String p0, final String p1, final Bundle p2, final long p3) throws RemoteException;
    
    int c() throws RemoteException;
}
