// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;

@Deprecated
public final class p
{
    private p() {
    }
    
    @Deprecated
    public static <T> Parcelable$Creator<T> a(final q<T> q) {
        return (Parcelable$Creator<T>)new a((q<Object>)q);
    }
    
    static class a<T> implements Parcelable$ClassLoaderCreator<T>
    {
        private final q<T> a;
        
        a(final q<T> a) {
            this.a = a;
        }
        
        public T createFromParcel(final Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }
        
        public T createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            return this.a.createFromParcel(parcel, classLoader);
        }
        
        public T[] newArray(final int n) {
            return this.a.newArray(n);
        }
    }
}
