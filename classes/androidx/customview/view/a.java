// 
// Decompiled by Procyon v0.5.36
// 

package androidx.customview.view;

import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public abstract class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a H;
    private final Parcelable G;
    
    static {
        H = new a() {};
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
            public a a(final Parcel parcel) {
                return this.b(parcel, null);
            }
            
            public a b(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return a.H;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public a[] c(final int n) {
                return new a[n];
            }
        };
    }
    
    private a() {
        this.G = null;
    }
    
    protected a(@j0 final Parcel parcel) {
        this(parcel, null);
    }
    
    protected a(@j0 final Parcel parcel, @k0 final ClassLoader classLoader) {
        Object g = parcel.readParcelable(classLoader);
        if (g == null) {
            g = a.H;
        }
        this.G = (Parcelable)g;
    }
    
    protected a(@j0 Parcelable g) {
        if (g != null) {
            if (g == a.H) {
                g = null;
            }
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    @k0
    public final Parcelable a() {
        return this.G;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.G, n);
    }
}
