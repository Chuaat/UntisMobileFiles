// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.flags.c;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.internal.flags.b;

public abstract class i extends b implements h
{
    public i() {
        super("com.google.android.gms.flags.IFlagProvider");
    }
    
    public static h asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof h) {
            return (h)queryLocalInterface;
        }
        return new j(binder);
    }
    
    @Override
    protected final boolean H(int intFlagValue, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
        if (intFlagValue != 1) {
            if (intFlagValue != 2) {
                if (intFlagValue != 3) {
                    if (intFlagValue != 4) {
                        if (intFlagValue != 5) {
                            return false;
                        }
                        final String stringFlagValue = this.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                    }
                    else {
                        final long longFlagValue = this.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(longFlagValue);
                    }
                }
                else {
                    intFlagValue = this.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(intFlagValue);
                }
            }
            else {
                final boolean booleanFlagValue = this.getBooleanFlagValue(parcel.readString(), c.c(parcel), parcel.readInt());
                parcel2.writeNoException();
                c.a(parcel2, booleanFlagValue);
            }
        }
        else {
            this.init(d.a.x2(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
