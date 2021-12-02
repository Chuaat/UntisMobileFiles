// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.internal;

import com.google.android.gms.common.util.v;
import android.os.RemoteException;

public final class a
{
    public static RemoteException a(final String s) {
        if (v.d()) {
            return new RemoteException(s);
        }
        return new RemoteException();
    }
}
