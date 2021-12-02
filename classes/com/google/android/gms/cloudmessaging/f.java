// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.IInterface;
import android.util.Log;
import android.os.Parcel;
import androidx.annotation.k0;
import android.os.RemoteException;
import android.os.Message;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class f implements Parcelable
{
    public static final Parcelable$Creator<f> CREATOR;
    private Messenger G;
    private c H;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public f(final IBinder binder) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.G = new Messenger(binder);
            return;
        }
        this.H = new c.b(binder);
    }
    
    private final IBinder a() {
        final Messenger g = this.G;
        if (g != null) {
            return g.getBinder();
        }
        return ((IInterface)this.H).asBinder();
    }
    
    public final void b(final Message message) throws RemoteException {
        final Messenger g = this.G;
        if (g != null) {
            g.send(message);
            return;
        }
        this.H.q0(message);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.a().equals(((f)o).a());
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final Messenger g = this.G;
        IBinder binder;
        if (g != null) {
            binder = g.getBinder();
        }
        else {
            binder = ((IInterface)this.H).asBinder();
        }
        parcel.writeStrongBinder(binder);
    }
    
    public static final class a extends ClassLoader
    {
        @Override
        protected final Class<?> loadClass(final String s, final boolean resolve) throws ClassNotFoundException {
            if ("com.google.android.gms.iid.MessengerCompat".equals(s)) {
                if (Log.isLoggable("CloudMessengerCompat", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                    Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                }
                return f.class;
            }
            return super.loadClass(s, resolve);
        }
    }
}
