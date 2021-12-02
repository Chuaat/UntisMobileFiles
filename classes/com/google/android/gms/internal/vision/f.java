// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import android.os.IBinder;

public final class f extends b0 implements g
{
    f(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }
    
    @Override
    public final e S1(final d d, final n n) throws RemoteException {
        final Parcel h = this.H();
        f1.b(h, (IInterface)d);
        f1.c(h, (Parcelable)n);
        final Parcel x2 = this.x2(1, h);
        final IBinder strongBinder = x2.readStrongBinder();
        e e;
        if (strongBinder == null) {
            e = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof e) {
                e = (e)queryLocalInterface;
            }
            else {
                e = new com.google.android.gms.internal.vision.d(strongBinder);
            }
        }
        x2.recycle();
        return e;
    }
}
