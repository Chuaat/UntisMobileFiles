// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result;

import android.app.PendingIntent;
import android.os.Parcel;
import androidx.annotation.k0;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class f implements Parcelable
{
    @j0
    public static final Parcelable$Creator<f> CREATOR;
    @j0
    private final IntentSender G;
    @k0
    private final Intent H;
    private final int I;
    private final int J;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<f>() {
            public f a(final Parcel parcel) {
                return new f(parcel);
            }
            
            public f[] b(final int n) {
                return new f[n];
            }
        };
    }
    
    f(@j0 final IntentSender g, @k0 final Intent h, final int i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    f(@j0 final Parcel parcel) {
        this.G = (IntentSender)parcel.readParcelable(IntentSender.class.getClassLoader());
        this.H = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.I = parcel.readInt();
        this.J = parcel.readInt();
    }
    
    @k0
    public Intent a() {
        return this.H;
    }
    
    public int b() {
        return this.I;
    }
    
    public int c() {
        return this.J;
    }
    
    @j0
    public IntentSender d() {
        return this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.G, n);
        parcel.writeParcelable((Parcelable)this.H, n);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
    }
    
    public static final class b
    {
        private IntentSender a;
        private Intent b;
        private int c;
        private int d;
        
        public b(@j0 final PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
        
        public b(@j0 final IntentSender a) {
            this.a = a;
        }
        
        @j0
        public f a() {
            return new f(this.a, this.b, this.c, this.d);
        }
        
        @j0
        public b b(@k0 final Intent b) {
            this.b = b;
            return this;
        }
        
        @j0
        public b c(final int d, final int c) {
            this.d = d;
            this.c = c;
            return this;
        }
    }
}
