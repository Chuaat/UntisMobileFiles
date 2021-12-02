// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import f2.a;
import com.google.android.gms.common.annotation.KeepName;
import android.os.Parcelable;

@KeepName
@a
public final class BinderWrapper implements Parcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<BinderWrapper> CREATOR;
    private IBinder G;
    
    static {
        CREATOR = (Parcelable$Creator)new d1();
    }
    
    @a
    public BinderWrapper(@RecentlyNonNull final IBinder g) {
        this.G = g;
    }
    
    private BinderWrapper(final Parcel parcel) {
        this.G = parcel.readStrongBinder();
    }
    
    @RecentlyNonNull
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        parcel.writeStrongBinder(this.G);
    }
}
