// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.clearcut.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.clearcut.e;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

public abstract class o6 extends b0 implements n6
{
    public o6() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                this.o2(c1.a(parcel, Status.CREATOR), c1.a(parcel, com.google.android.gms.clearcut.e.CREATOR));
                break;
            }
            case 8: {
                this.B1(c1.a(parcel, Status.CREATOR), c1.a(parcel, com.google.android.gms.clearcut.e.CREATOR));
                break;
            }
            case 7: {
                this.p0(c1.a(parcel, DataHolder.CREATOR));
                break;
            }
            case 6: {
                this.z1(c1.a(parcel, Status.CREATOR), (g[])parcel.createTypedArray((Parcelable$Creator)g.CREATOR));
                break;
            }
            case 5: {
                this.q2(c1.a(parcel, Status.CREATOR), parcel.readLong());
                break;
            }
            case 4: {
                this.n2(c1.a(parcel, Status.CREATOR));
                break;
            }
            case 3: {
                this.h0(c1.a(parcel, Status.CREATOR), parcel.readLong());
                break;
            }
            case 2: {
                this.X1(c1.a(parcel, Status.CREATOR));
                break;
            }
            case 1: {
                this.M1(c1.a(parcel, Status.CREATOR));
                break;
            }
        }
        return true;
    }
}
