// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Parcelable;
import com.google.android.gms.internal.base.b;
import com.google.android.gms.internal.base.d;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.internal.base.a;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

public interface k extends IInterface
{
    void J0(@RecentlyNonNull final Status p0) throws RemoteException;
    
    public abstract static class a extends a implements k
    {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }
        
        @RecentlyNonNull
        public static k y2(@RecentlyNonNull final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof k) {
                return (k)queryLocalInterface;
            }
            return new k.a.a(binder);
        }
        
        @RecentlyNonNull
        @Override
        protected final boolean x2(@RecentlyNonNull final int n, @RecentlyNonNull final Parcel parcel, @RecentlyNonNull final Parcel parcel2, @RecentlyNonNull final int n2) throws RemoteException {
            if (n == 1) {
                this.J0(d.a(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
        
        public static final class a extends b implements k
        {
            a(final IBinder binder) {
                super(binder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }
            
            @Override
            public final void J0(final Status status) throws RemoteException {
                final Parcel h = this.H();
                d.c(h, (Parcelable)status);
                this.z2(1, h);
            }
        }
    }
}
