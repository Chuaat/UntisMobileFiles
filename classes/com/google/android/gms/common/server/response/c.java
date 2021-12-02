// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import java.util.Iterator;
import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import com.google.android.gms.common.util.d0;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcel;
import com.google.android.gms.common.internal.b0;
import h2.d;

@b0
@f2.a
public abstract class c extends a implements d
{
    @f2.a
    public c() {
    }
    
    @RecentlyNonNull
    @f2.a
    public byte[] V() {
        final Parcel obtain = Parcel.obtain();
        ((Parcelable)this).writeToParcel(obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
    
    @RecentlyNonNull
    public final int describeContents() {
        return 0;
    }
    
    @RecentlyNullable
    @d0
    public Object e(@RecentlyNonNull final String s) {
        return null;
    }
    
    @RecentlyNonNull
    @Override
    public boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!this.getClass().isInstance(o)) {
            return false;
        }
        final a a = (a)o;
        for (final a<?, ?> a2 : this.c().values()) {
            if (this.f(a2)) {
                if (!a.f(a2) || !v.b(this.d(a2), a.d(a2))) {
                    return false;
                }
                continue;
            }
            else {
                if (a.f(a2)) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    @RecentlyNonNull
    @d0
    public boolean g(@RecentlyNonNull final String s) {
        return false;
    }
    
    @RecentlyNonNull
    @Override
    public int hashCode() {
        final Iterator<a<?, ?>> iterator = this.c().values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final a<?, ?> a = iterator.next();
            if (this.f(a)) {
                n = n * 31 + x.k(this.d(a)).hashCode();
            }
        }
        return n;
    }
}
