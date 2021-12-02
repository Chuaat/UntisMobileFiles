// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.q0;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.p0;

public abstract class c3 extends p0 implements d3
{
    public c3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        Label_0561: {
            Object o = null;
            switch (n) {
                default: {
                    return false;
                }
                case 20: {
                    this.q1(q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 19: {
                    this.X(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 18: {
                    this.l0(q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 17: {
                    o = this.E0(parcel.readString(), parcel.readString(), parcel.readString());
                    break;
                }
                case 16: {
                    o = this.W0(parcel.readString(), parcel.readString(), q0.a(parcel, na.CREATOR));
                    break;
                }
                case 15: {
                    o = this.i0(parcel.readString(), parcel.readString(), parcel.readString(), q0.f(parcel));
                    break;
                }
                case 14: {
                    o = this.u1(parcel.readString(), parcel.readString(), q0.f(parcel), q0.a(parcel, na.CREATOR));
                    break;
                }
                case 13: {
                    this.D0(q0.a(parcel, c.CREATOR));
                    break Label_0561;
                }
                case 12: {
                    this.c0(q0.a(parcel, c.CREATOR), q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 11: {
                    final String x0 = this.x0(q0.a(parcel, na.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeString(x0);
                    return true;
                }
                case 10: {
                    this.s1(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                    break Label_0561;
                }
                case 9: {
                    final byte[] l0 = this.L0(q0.a(parcel, u.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeByteArray(l0);
                    return true;
                }
                case 7: {
                    o = this.W1(q0.a(parcel, na.CREATOR), q0.f(parcel));
                    break;
                }
                case 6: {
                    this.b1(q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 5: {
                    this.c2(q0.a(parcel, u.CREATOR), parcel.readString(), parcel.readString());
                    break Label_0561;
                }
                case 4: {
                    this.U0(q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 2: {
                    this.t2(q0.a(parcel, ca.CREATOR), q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
                case 1: {
                    this.k1(q0.a(parcel, u.CREATOR), q0.a(parcel, na.CREATOR));
                    break Label_0561;
                }
            }
            parcel2.writeNoException();
            parcel2.writeTypedList((List)o);
            return true;
        }
        parcel2.writeNoException();
        return true;
    }
}
