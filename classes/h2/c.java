// 
// Decompiled by Procyon v0.5.36
// 

package h2;

import android.os.Bundle;
import java.math.BigInteger;
import java.math.BigDecimal;
import android.util.SparseLongArray;
import android.util.SparseIntArray;
import android.util.SparseBooleanArray;
import android.os.Parcelable;
import java.util.List;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcel;

public class c
{
    private c() {
    }
    
    public static void A(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<Float> sparseArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel.writeFloat((float)sparseArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void B(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final IBinder binder, @RecentlyNonNull final boolean b) {
        if (binder == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeStrongBinder(binder);
        h0(parcel, e0);
    }
    
    public static void C(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final IBinder[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeBinderArray(array);
        h0(parcel, e0);
    }
    
    public static void D(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final List<IBinder> list, @RecentlyNonNull final boolean b) {
        if (list == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeBinderList((List)list);
        h0(parcel, e0);
    }
    
    public static void E(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<IBinder> sparseArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel.writeStrongBinder((IBinder)sparseArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void F(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        f0(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void G(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final int[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeIntArray(array);
        h0(parcel, e0);
    }
    
    public static void H(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Integer> list, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt((int)list.get(i));
        }
        h0(parcel, e0);
    }
    
    public static void I(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final Integer n2, @RecentlyNonNull final boolean b) {
        if (n2 == null) {
            if (b) {
                f0(parcel, n, 0);
            }
            return;
        }
        f0(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void J(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final List list, @RecentlyNonNull final boolean b) {
        if (list == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeList(list);
        h0(parcel, e0);
    }
    
    public static void K(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final long n2) {
        f0(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void L(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final long[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeLongArray(array);
        h0(parcel, e0);
    }
    
    public static void M(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Long> list, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeLong((long)list.get(i));
        }
        h0(parcel, e0);
    }
    
    public static void N(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final Long n2, @RecentlyNonNull final boolean b) {
        if (n2 == null) {
            if (b) {
                f0(parcel, n, 0);
            }
            return;
        }
        f0(parcel, n, 8);
        parcel.writeLong((long)n2);
    }
    
    public static void O(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final Parcel parcel2, @RecentlyNonNull final boolean b) {
        if (parcel2 == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        h0(parcel, e0);
    }
    
    public static void P(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final Parcel[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcel parcel2;
        for (i = 0; i < length; ++i) {
            parcel2 = array[i];
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
            else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, e0);
    }
    
    public static void Q(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Parcel> list, @RecentlyNonNull final boolean b) {
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcel parcel2;
        for (i = 0; i < size; ++i) {
            parcel2 = list.get(i);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
            else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, e0);
    }
    
    public static void R(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<Parcel> sparseArray, @RecentlyNonNull final boolean b) {
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        Parcel parcel2;
        for (i = 0; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel2 = (Parcel)sparseArray.valueAt(i);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
            else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, e0);
    }
    
    public static void S(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final Parcelable parcelable, @RecentlyNonNull final int n, @RecentlyNonNull final boolean b) {
        if (parcelable == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcelable.writeToParcel(parcel, n);
        h0(parcel, e0);
    }
    
    public static void T(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final short n2) {
        f0(parcel, n, 4);
        parcel.writeInt((int)n2);
    }
    
    public static void U(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final SparseBooleanArray sparseBooleanArray, @RecentlyNonNull final boolean b) {
        if (sparseBooleanArray == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        h0(parcel, e0);
    }
    
    public static void V(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseIntArray sparseIntArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseIntArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseIntArray.keyAt(i));
            parcel.writeInt(sparseIntArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void W(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseLongArray sparseLongArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseLongArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseLongArray.keyAt(i));
            parcel.writeLong(sparseLongArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void X(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final String s, @RecentlyNonNull final boolean b) {
        if (s == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeString(s);
        h0(parcel, e0);
    }
    
    public static void Y(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final String[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeStringArray(array);
        h0(parcel, e0);
    }
    
    public static void Z(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final List<String> list, @RecentlyNonNull final boolean b) {
        if (list == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeStringList((List)list);
        h0(parcel, e0);
    }
    
    @RecentlyNonNull
    public static int a(@RecentlyNonNull final Parcel parcel) {
        return e0(parcel, 20293);
    }
    
    public static void a0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<String> sparseArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel.writeString((String)sparseArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void b(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        h0(parcel, n);
    }
    
    public static <T extends Parcelable> void b0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final T[] array, @RecentlyNonNull final int n, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                g0(parcel, parcelable, n);
            }
        }
        h0(parcel, e0);
    }
    
    public static void c(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final BigDecimal bigDecimal, @RecentlyNonNull final boolean b) {
        if (bigDecimal == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        h0(parcel, e0);
    }
    
    public static <T extends Parcelable> void c0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<T> list, @RecentlyNonNull final boolean b) {
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                g0(parcel, parcelable, 0);
            }
        }
        h0(parcel, e0);
    }
    
    public static void d(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final BigDecimal[] array, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (array == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = n; i < length; ++i) {
            parcel.writeByteArray(array[i].unscaledValue().toByteArray());
            parcel.writeInt(array[i].scale());
        }
        h0(parcel, e0);
    }
    
    public static <T extends Parcelable> void d0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<T> sparseArray, @RecentlyNonNull final boolean b) {
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcelable = (Parcelable)sparseArray.valueAt(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                g0(parcel, parcelable, 0);
            }
        }
        h0(parcel, e0);
    }
    
    public static void e(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final BigInteger bigInteger, @RecentlyNonNull final boolean b) {
        if (bigInteger == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeByteArray(bigInteger.toByteArray());
        h0(parcel, e0);
    }
    
    private static int e0(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    public static void f(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final BigInteger[] array, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (array == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = n; i < length; ++i) {
            parcel.writeByteArray(array[i].toByteArray());
        }
        h0(parcel, e0);
    }
    
    private static void f0(final Parcel parcel, final int n, final int n2) {
        if (n2 >= 65535) {
            parcel.writeInt(n | 0xFFFF0000);
            parcel.writeInt(n2);
            return;
        }
        parcel.writeInt(n | n2 << 16);
    }
    
    public static void g(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final boolean b) {
        f0(parcel, n, 4);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    private static <T extends Parcelable> void g0(final Parcel parcel, final T t, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        t.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void h(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final boolean[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeBooleanArray(array);
        h0(parcel, e0);
    }
    
    private static void h0(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void i(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Boolean> list, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt((int)(((boolean)list.get(i)) ? 1 : 0));
        }
        h0(parcel, e0);
    }
    
    public static void j(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final Boolean b, @RecentlyNonNull final boolean b2) {
        if (b == null) {
            if (b2) {
                f0(parcel, n, 0);
            }
            return;
        }
        f0(parcel, n, 4);
        parcel.writeInt((int)(((boolean)b) ? 1 : 0));
    }
    
    public static void k(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final Bundle bundle, @RecentlyNonNull final boolean b) {
        if (bundle == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeBundle(bundle);
        h0(parcel, e0);
    }
    
    public static void l(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final byte b) {
        f0(parcel, n, 4);
        parcel.writeInt((int)b);
    }
    
    public static void m(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final byte[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeByteArray(array);
        h0(parcel, e0);
    }
    
    public static void n(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final byte[][] array, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (array == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = n; i < length; ++i) {
            parcel.writeByteArray(array[i]);
        }
        h0(parcel, e0);
    }
    
    public static void o(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<byte[]> sparseArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel.writeByteArray((byte[])sparseArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void p(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final char c) {
        f0(parcel, n, 4);
        parcel.writeInt((int)c);
    }
    
    public static void q(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final char[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeCharArray(array);
        h0(parcel, e0);
    }
    
    public static void r(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final double n2) {
        f0(parcel, n, 8);
        parcel.writeDouble(n2);
    }
    
    public static void s(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final double[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeDoubleArray(array);
        h0(parcel, e0);
    }
    
    public static void t(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Double> list, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeDouble((double)list.get(i));
        }
        h0(parcel, e0);
    }
    
    public static void u(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final Double n2, @RecentlyNonNull final boolean b) {
        if (n2 == null) {
            if (b) {
                f0(parcel, n, 0);
            }
            return;
        }
        f0(parcel, n, 8);
        parcel.writeDouble((double)n2);
    }
    
    public static void v(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final SparseArray<Double> sparseArray, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (sparseArray == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = sparseArray.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeInt(sparseArray.keyAt(i));
            parcel.writeDouble((double)sparseArray.valueAt(i));
        }
        h0(parcel, e0);
    }
    
    public static void w(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final float n2) {
        f0(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void x(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int e0, @RecentlyNonNull final float[] array, @RecentlyNonNull final boolean b) {
        if (array == null) {
            if (b) {
                f0(parcel, e0, 0);
            }
            return;
        }
        e0 = e0(parcel, e0);
        parcel.writeFloatArray(array);
        h0(parcel, e0);
    }
    
    public static void y(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final List<Float> list, @RecentlyNonNull final boolean b) {
        final int n = 0;
        if (list == null) {
            if (b) {
                f0(parcel, i, 0);
            }
            return;
        }
        final int e0 = e0(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = n; i < size; ++i) {
            parcel.writeFloat((float)list.get(i));
        }
        h0(parcel, e0);
    }
    
    public static void z(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n, @RecentlyNonNull final Float n2, @RecentlyNonNull final boolean b) {
        if (n2 == null) {
            if (b) {
                f0(parcel, n, 0);
            }
            return;
        }
        f0(parcel, n, 4);
        parcel.writeFloat((float)n2);
    }
}
