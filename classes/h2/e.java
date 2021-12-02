// 
// Decompiled by Procyon v0.5.36
// 

package h2;

import android.os.Parcelable;
import java.util.Iterator;
import java.io.Serializable;
import java.util.ArrayList;
import android.os.Bundle;
import com.google.android.gms.common.util.c;
import androidx.annotation.RecentlyNullable;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.x;
import android.os.Parcelable$Creator;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import com.google.android.gms.common.util.d0;

@d0
@a
public final class e
{
    @RecentlyNonNull
    @a
    public static <T extends d> T a(@RecentlyNonNull final byte[] array, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        x.k(parcelable$Creator);
        final Parcel obtain = Parcel.obtain();
        obtain.unmarshall(array, 0, array.length);
        obtain.setDataPosition(0);
        final d d = (d)parcelable$Creator.createFromParcel(obtain);
        obtain.recycle();
        return (T)d;
    }
    
    @RecentlyNullable
    @a
    public static <T extends d> T b(@RecentlyNonNull final Intent intent, @RecentlyNonNull final String s, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        final byte[] byteArrayExtra = intent.getByteArrayExtra(s);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, parcelable$Creator);
    }
    
    @RecentlyNonNull
    @a
    public static <T extends d> T c(@RecentlyNonNull final String s, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        return a(c.b(s), parcelable$Creator);
    }
    
    @RecentlyNullable
    public static <T extends d> ArrayList<T> d(@RecentlyNonNull final Bundle bundle, @RecentlyNonNull final String s, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        final ArrayList list = (ArrayList)bundle.getSerializable(s);
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList<T>(list.size());
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final byte[] value = list.get(i);
            ++i;
            list2.add(a(value, parcelable$Creator));
        }
        return (ArrayList<T>)list2;
    }
    
    @RecentlyNullable
    @a
    public static <T extends d> ArrayList<T> e(@RecentlyNonNull final Intent intent, @RecentlyNonNull final String s, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        final ArrayList list = (ArrayList)intent.getSerializableExtra(s);
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList<T>(list.size());
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final byte[] value = list.get(i);
            ++i;
            list2.add(a(value, parcelable$Creator));
        }
        return (ArrayList<T>)list2;
    }
    
    public static <T extends d> void f(@RecentlyNonNull final Iterable<T> iterable, @RecentlyNonNull final Bundle bundle, @RecentlyNonNull final String s) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        final Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(h(iterator.next()));
        }
        bundle.putSerializable(s, (Serializable)list);
    }
    
    @a
    public static <T extends d> void g(@RecentlyNonNull final Iterable<T> iterable, @RecentlyNonNull final Intent intent, @RecentlyNonNull final String s) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        final Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(h(iterator.next()));
        }
        intent.putExtra(s, (Serializable)list);
    }
    
    @RecentlyNonNull
    @a
    public static <T extends d> byte[] h(@RecentlyNonNull final T t) {
        final Parcel obtain = Parcel.obtain();
        ((Parcelable)t).writeToParcel(obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
    
    @a
    public static <T extends d> void i(@RecentlyNonNull final T t, @RecentlyNonNull final Intent intent, @RecentlyNonNull final String s) {
        intent.putExtra(s, h(t));
    }
    
    @RecentlyNonNull
    @a
    public static <T extends d> String j(@RecentlyNonNull final T t) {
        return c.e(h(t));
    }
}
