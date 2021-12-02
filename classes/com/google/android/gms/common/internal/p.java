// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcelable$Creator;
import com.google.android.gms.internal.common.b;
import android.os.Parcelable;
import com.google.android.gms.internal.common.d;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.internal.common.a;
import androidx.annotation.RecentlyNonNull;
import android.os.RemoteException;
import android.accounts.Account;
import android.os.IInterface;

public interface p extends IInterface
{
    @RecentlyNonNull
    Account zza() throws RemoteException;
    
    public abstract static class a extends a implements p
    {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }
        
        @RecentlyNonNull
        public static p x2(@RecentlyNonNull final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof p) {
                return (p)queryLocalInterface;
            }
            return new p.a.a(binder);
        }
        
        @RecentlyNonNull
        @Override
        protected final boolean H(@RecentlyNonNull final int n, @RecentlyNonNull final Parcel parcel, @RecentlyNonNull final Parcel parcel2, @RecentlyNonNull final int n2) throws RemoteException {
            if (n == 2) {
                final Account zza = this.zza();
                parcel2.writeNoException();
                d.f(parcel2, (Parcelable)zza);
                return true;
            }
            return false;
        }
        
        public static final class a extends b implements p
        {
            a(final IBinder binder) {
                super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            
            @Override
            public final Account zza() throws RemoteException {
                final Parcel x2 = this.x2(2, this.H());
                final Account account = d.a(x2, (android.os.Parcelable$Creator<Account>)Account.CREATOR);
                x2.recycle();
                return account;
            }
        }
    }
}
