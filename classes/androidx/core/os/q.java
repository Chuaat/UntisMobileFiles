// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.os.Parcel;

@Deprecated
public interface q<T>
{
    T createFromParcel(final Parcel p0, final ClassLoader p1);
    
    T[] newArray(final int p0);
}
