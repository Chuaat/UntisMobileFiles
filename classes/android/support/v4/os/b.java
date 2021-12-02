// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.os;

import android.os.IInterface;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Handler;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
@t0({ t0.a.I })
public class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    final boolean G;
    final Handler H;
    a I;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Handler h) {
        this.G = true;
        this.H = h;
    }
    
    b(final Parcel parcel) {
        this.G = false;
        this.H = null;
        this.I = a.b.H(parcel.readStrongBinder());
    }
    
    protected void a(final int n, final Bundle bundle) {
    }
    
    public void b(final int n, final Bundle bundle) {
        if (this.G) {
            final Handler h = this.H;
            if (h != null) {
                h.post((Runnable)new c(n, bundle));
            }
            else {
                this.a(n, bundle);
            }
            return;
        }
        final a i = this.I;
        if (i == null) {
            return;
        }
        try {
            i.u2(n, bundle);
        }
        catch (RemoteException ex) {}
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.I == null) {
                this.I = new b();
            }
            parcel.writeStrongBinder(((IInterface)this.I).asBinder());
        }
    }
    
    class b extends android.support.v4.os.a.b
    {
        public void u2(final int n, final Bundle bundle) {
            final android.support.v4.os.b g = android.support.v4.os.b.this;
            final Handler h = g.H;
            if (h != null) {
                h.post((Runnable)g.new c(n, bundle));
            }
            else {
                g.a(n, bundle);
            }
        }
    }
    
    class c implements Runnable
    {
        final int G;
        final Bundle H;
        
        c(final int g, final Bundle h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            b.this.a(this.G, this.H);
        }
    }
}
