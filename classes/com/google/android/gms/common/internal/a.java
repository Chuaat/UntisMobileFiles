// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.k0;
import androidx.annotation.RecentlyNullable;
import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;
import androidx.annotation.RecentlyNonNull;

public class a extends p.a
{
    @RecentlyNullable
    @f2.a
    public static Account y2(@RecentlyNonNull final p p) {
        if (p != null) {
            final long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    p.zza();
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
                finally {}
            }
            catch (RemoteException ex) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return null;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return null;
    }
    
    @RecentlyNonNull
    public boolean equals(@k0 final Object o) {
        throw new NoSuchMethodError();
    }
    
    @RecentlyNonNull
    @Override
    public final Account zza() {
        throw new NoSuchMethodError();
    }
}
