// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import android.os.RemoteException;
import android.os.Parcel;
import com.google.android.gms.internal.flags.c;
import android.os.IBinder;
import com.google.android.gms.internal.flags.a;

public final class j extends a implements h
{
    j(final IBinder binder) {
        super(binder, "com.google.android.gms.flags.IFlagProvider");
    }
    
    @Override
    public final boolean getBooleanFlagValue(final String s, final boolean b, final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        c.a(h, b);
        h.writeInt(n);
        final Parcel x2 = this.x2(2, h);
        final boolean c = com.google.android.gms.internal.flags.c.c(x2);
        x2.recycle();
        return c;
    }
    
    @Override
    public final int getIntFlagValue(final String s, int int1, final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeInt(int1);
        h.writeInt(n);
        final Parcel x2 = this.x2(3, h);
        int1 = x2.readInt();
        x2.recycle();
        return int1;
    }
    
    @Override
    public final long getLongFlagValue(final String s, long long1, final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeLong(long1);
        h.writeInt(n);
        final Parcel x2 = this.x2(4, h);
        long1 = x2.readLong();
        x2.recycle();
        return long1;
    }
    
    @Override
    public final String getStringFlagValue(final String s, String string, final int n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(string);
        h.writeInt(n);
        final Parcel x2 = this.x2(5, h);
        string = x2.readString();
        x2.recycle();
        return string;
    }
    
    @Override
    public final void init(final d d) throws RemoteException {
        final Parcel h = this.H();
        c.b(h, (IInterface)d);
        this.y2(1, h);
    }
}
