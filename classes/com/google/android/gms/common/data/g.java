// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import android.content.ContentValues;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;

@f2.a
public class g<T extends d> extends a<T>
{
    private static final String[] I;
    private final Parcelable$Creator<T> H;
    
    static {
        I = new String[] { "data" };
    }
    
    @f2.a
    public g(@RecentlyNonNull final DataHolder dataHolder, @RecentlyNonNull final Parcelable$Creator<T> h) {
        super(dataHolder);
        this.H = h;
    }
    
    @f2.a
    public static <T extends d> void b(@RecentlyNonNull final DataHolder.a a, @RecentlyNonNull final T t) {
        final Parcel obtain = Parcel.obtain();
        ((Parcelable)t).writeToParcel(obtain, 0);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        a.c(contentValues);
        obtain.recycle();
    }
    
    @RecentlyNonNull
    @f2.a
    public static DataHolder.a f() {
        return DataHolder.M(g.I);
    }
    
    @RecentlyNonNull
    @f2.a
    public T h(@RecentlyNonNull final int n) {
        final DataHolder dataHolder = x.k(super.G);
        final byte[] q1 = dataHolder.Q1("data", n, dataHolder.O3(n));
        final Parcel obtain = Parcel.obtain();
        obtain.unmarshall(q1, 0, q1.length);
        obtain.setDataPosition(0);
        final d d = (d)this.H.createFromParcel(obtain);
        obtain.recycle();
        return (T)d;
    }
}
