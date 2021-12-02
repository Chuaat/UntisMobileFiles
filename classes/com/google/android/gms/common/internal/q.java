// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.internal.common.b;
import androidx.annotation.RecentlyNonNull;
import android.os.IBinder;
import com.google.android.gms.internal.common.a;
import android.os.RemoteException;
import android.os.IInterface;

public interface q extends IInterface
{
    void cancel() throws RemoteException;
    
    public abstract static class a extends a implements q
    {
        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }
        
        @RecentlyNonNull
        public static q x2(@RecentlyNonNull final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof q) {
                return (q)queryLocalInterface;
            }
            return new q.a.a(binder);
        }
        
        public static final class a extends b implements q
        {
            a(final IBinder binder) {
                super(binder, "com.google.android.gms.common.internal.ICancelToken");
            }
            
            @Override
            public final void cancel() throws RemoteException {
                this.z2(2, this.H());
            }
        }
    }
}
