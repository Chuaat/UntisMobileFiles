// 
// Decompiled by Procyon v0.5.36
// 

package h2;

import android.os.Bundle;
import java.util.List;
import java.math.BigInteger;
import java.math.BigDecimal;
import android.os.IBinder;
import android.util.SparseLongArray;
import android.util.SparseIntArray;
import android.util.SparseBooleanArray;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.util.SparseArray;
import java.util.ArrayList;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcel;

public class b
{
    private b() {
    }
    
    @RecentlyNonNull
    public static ArrayList<Parcel> A(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final ArrayList<Parcel> list = new ArrayList<Parcel>();
        int int2;
        int dataPosition2;
        Parcel obtain;
        for (i = 0; i < int1; ++i) {
            int2 = parcel.readInt();
            if (int2 != 0) {
                dataPosition2 = parcel.dataPosition();
                obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, int2);
                list.add(obtain);
                parcel.setDataPosition(dataPosition2 + int2);
            }
            else {
                list.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static SparseArray<Parcel> B(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final SparseArray sparseArray = new SparseArray();
        int int2;
        int int3;
        int dataPosition2;
        Parcel obtain;
        for (i = 0; i < int1; ++i) {
            int2 = parcel.readInt();
            int3 = parcel.readInt();
            if (int3 != 0) {
                dataPosition2 = parcel.dataPosition();
                obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, int3);
                sparseArray.append(int2, (Object)obtain);
                parcel.setDataPosition(dataPosition2 + int3);
            }
            else {
                sparseArray.append(int2, (Object)null);
            }
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<Parcel>)sparseArray;
    }
    
    @RecentlyNonNull
    public static <T extends Parcelable> T C(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + f0);
        return (T)parcelable;
    }
    
    @RecentlyNonNull
    public static SparseBooleanArray D(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + f0);
        return sparseBooleanArray;
    }
    
    @RecentlyNonNull
    public static SparseIntArray E(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseIntArray sparseIntArray = new SparseIntArray();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + f0);
        return sparseIntArray;
    }
    
    @RecentlyNonNull
    public static SparseLongArray F(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseLongArray sparseLongArray = new SparseLongArray();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + f0);
        return sparseLongArray;
    }
    
    @RecentlyNonNull
    public static String G(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + f0);
        return string;
    }
    
    @RecentlyNonNull
    public static String[] H(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + f0);
        return stringArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<String> I(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + f0);
        return (ArrayList<String>)stringArrayList;
    }
    
    @RecentlyNonNull
    public static SparseArray<String> J(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseArray sparseArray = new SparseArray();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            sparseArray.append(parcel.readInt(), (Object)parcel.readString());
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<String>)sparseArray;
    }
    
    @RecentlyNonNull
    public static <T> T[] K(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int f0, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        f0 = f0(parcel, f0);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray((Parcelable$Creator)parcelable$Creator);
        parcel.setDataPosition(dataPosition + f0);
        return (T[])typedArray;
    }
    
    @RecentlyNonNull
    public static <T> ArrayList<T> L(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int f0, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        f0 = f0(parcel, f0);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)parcelable$Creator);
        parcel.setDataPosition(dataPosition + f0);
        return (ArrayList<T>)typedArrayList;
    }
    
    @RecentlyNonNull
    public static <T> SparseArray<T> M(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i, @RecentlyNonNull final Parcelable$Creator<T> parcelable$Creator) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final SparseArray sparseArray = new SparseArray();
        int int2;
        Object fromParcel;
        for (i = 0; i < int1; ++i) {
            int2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                fromParcel = parcelable$Creator.createFromParcel(parcel);
            }
            else {
                fromParcel = null;
            }
            sparseArray.append(int2, fromParcel);
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<T>)sparseArray;
    }
    
    public static void N(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        final StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }
    
    @RecentlyNonNull
    public static int O(@RecentlyNonNull final int n) {
        return n & 0xFFFF;
    }
    
    @RecentlyNonNull
    public static boolean P(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    @RecentlyNonNull
    public static Boolean Q(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int f0 = f0(parcel, n);
        if (f0 == 0) {
            return null;
        }
        j0(parcel, n, f0, 4);
        return parcel.readInt() != 0;
    }
    
    @RecentlyNonNull
    public static byte R(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    @RecentlyNonNull
    public static char S(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return (char)parcel.readInt();
    }
    
    @RecentlyNonNull
    public static double T(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 8);
        return parcel.readDouble();
    }
    
    @RecentlyNonNull
    public static Double U(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int f0 = f0(parcel, n);
        if (f0 == 0) {
            return null;
        }
        j0(parcel, n, f0, 8);
        return parcel.readDouble();
    }
    
    @RecentlyNonNull
    public static float V(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return parcel.readFloat();
    }
    
    @RecentlyNonNull
    public static Float W(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int f0 = f0(parcel, n);
        if (f0 == 0) {
            return null;
        }
        j0(parcel, n, f0, 4);
        return parcel.readFloat();
    }
    
    @RecentlyNonNull
    public static int X(@RecentlyNonNull final Parcel parcel) {
        return parcel.readInt();
    }
    
    @RecentlyNonNull
    public static IBinder Y(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + f0);
        return strongBinder;
    }
    
    @RecentlyNonNull
    public static int Z(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return parcel.readInt();
    }
    
    @RecentlyNonNull
    public static BigDecimal a(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        final int int1 = parcel.readInt();
        parcel.setDataPosition(dataPosition + f0);
        return new BigDecimal(new BigInteger(byteArray), int1);
    }
    
    @RecentlyNonNull
    public static Integer a0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int f0 = f0(parcel, n);
        if (f0 == 0) {
            return null;
        }
        j0(parcel, n, f0, 4);
        return parcel.readInt();
    }
    
    @RecentlyNonNull
    public static BigDecimal[] b(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final BigDecimal[] array = new BigDecimal[int1];
        for (i = 0; i < int1; ++i) {
            array[i] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + f0);
        return array;
    }
    
    public static void b0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition, @RecentlyNonNull final List list, @RecentlyNonNull final ClassLoader classLoader) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + f0);
    }
    
    @RecentlyNonNull
    public static BigInteger c(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + f0);
        return new BigInteger(byteArray);
    }
    
    @RecentlyNonNull
    public static long c0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 8);
        return parcel.readLong();
    }
    
    @RecentlyNonNull
    public static BigInteger[] d(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final BigInteger[] array = new BigInteger[int1];
        for (i = 0; i < int1; ++i) {
            array[i] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + f0);
        return array;
    }
    
    @RecentlyNonNull
    public static Long d0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int f0 = f0(parcel, n);
        if (f0 == 0) {
            return null;
        }
        j0(parcel, n, f0, 8);
        return parcel.readLong();
    }
    
    @RecentlyNonNull
    public static boolean[] e(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final boolean[] booleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + f0);
        return booleanArray;
    }
    
    @RecentlyNonNull
    public static short e0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        i0(parcel, n, 4);
        return (short)parcel.readInt();
    }
    
    @RecentlyNonNull
    public static ArrayList<Boolean> f(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList<Boolean> list = new ArrayList<Boolean>();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readInt() != 0);
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static int f0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return n >> 16 & 0xFFFF;
        }
        return parcel.readInt();
    }
    
    @RecentlyNonNull
    public static Bundle g(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + f0);
        return bundle;
    }
    
    public static void g0(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int f0) {
        f0 = f0(parcel, f0);
        parcel.setDataPosition(parcel.dataPosition() + f0);
    }
    
    @RecentlyNonNull
    public static byte[] h(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int f0) {
        f0 = f0(parcel, f0);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + f0);
        return byteArray;
    }
    
    @RecentlyNonNull
    public static int h0(@RecentlyNonNull final Parcel parcel) {
        final int x = X(parcel);
        final int f0 = f0(parcel, x);
        final int dataPosition = parcel.dataPosition();
        if (O(x) != 20293) {
            final String value = String.valueOf(Integer.toHexString(x));
            String concat;
            if (value.length() != 0) {
                concat = "Expected object header. Got 0x".concat(value);
            }
            else {
                concat = new String("Expected object header. Got 0x");
            }
            throw new a(concat, parcel);
        }
        final int i = f0 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }
    
    @RecentlyNonNull
    public static byte[][] i(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final byte[][] array = new byte[int1][];
        for (i = 0; i < int1; ++i) {
            array[i] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + f0);
        return array;
    }
    
    private static void i0(final Parcel parcel, int f0, final int i) {
        f0 = f0(parcel, f0);
        if (f0 == i) {
            return;
        }
        final String hexString = Integer.toHexString(f0);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i);
        sb.append(" got ");
        sb.append(f0);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    @RecentlyNonNull
    public static SparseArray<byte[]> j(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final SparseArray sparseArray = new SparseArray(int1);
        for (i = 0; i < int1; ++i) {
            sparseArray.append(parcel.readInt(), (Object)parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<byte[]>)sparseArray;
    }
    
    private static void j0(final Parcel parcel, final int n, final int n2, final int i) {
        if (n2 == i) {
            return;
        }
        final String hexString = Integer.toHexString(n2);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i);
        sb.append(" got ");
        sb.append(n2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
    
    @RecentlyNonNull
    public static char[] k(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final char[] charArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + f0);
        return charArray;
    }
    
    @RecentlyNonNull
    public static double[] l(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final double[] doubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + f0);
        return doubleArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<Double> m(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList<Double> list = new ArrayList<Double>();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readDouble());
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static SparseArray<Double> n(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseArray sparseArray = new SparseArray();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            sparseArray.append(parcel.readInt(), (Object)parcel.readDouble());
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<Double>)sparseArray;
    }
    
    @RecentlyNonNull
    public static float[] o(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final float[] floatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + f0);
        return floatArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<Float> p(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList<Float> list = new ArrayList<Float>();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readFloat());
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static SparseArray<Float> q(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final SparseArray sparseArray = new SparseArray();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            sparseArray.append(parcel.readInt(), (Object)parcel.readFloat());
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<Float>)sparseArray;
    }
    
    @RecentlyNonNull
    public static IBinder[] r(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final IBinder[] binderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + f0);
        return binderArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<IBinder> s(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList binderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + f0);
        return (ArrayList<IBinder>)binderArrayList;
    }
    
    @RecentlyNonNull
    public static SparseArray<IBinder> t(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final SparseArray sparseArray = new SparseArray(int1);
        for (i = 0; i < int1; ++i) {
            sparseArray.append(parcel.readInt(), (Object)parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + f0);
        return (SparseArray<IBinder>)sparseArray;
    }
    
    @RecentlyNonNull
    public static int[] u(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + f0);
        return intArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<Integer> v(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static long[] w(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int dataPosition) {
        final int f0 = f0(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final long[] longArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + f0);
        return longArray;
    }
    
    @RecentlyNonNull
    public static ArrayList<Long> x(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final ArrayList<Long> list = new ArrayList<Long>();
        int int1;
        for (int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            list.add(parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + f0);
        return list;
    }
    
    @RecentlyNonNull
    public static Parcel y(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int f0) {
        f0 = f0(parcel, f0);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, f0);
        parcel.setDataPosition(dataPosition + f0);
        return obtain;
    }
    
    @RecentlyNonNull
    public static Parcel[] z(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int f0 = f0(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f0 == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final Parcel[] array = new Parcel[int1];
        int int2;
        int dataPosition2;
        Parcel obtain;
        for (i = 0; i < int1; ++i) {
            int2 = parcel.readInt();
            if (int2 != 0) {
                dataPosition2 = parcel.dataPosition();
                obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, int2);
                array[i] = obtain;
                parcel.setDataPosition(dataPosition2 + int2);
            }
            else {
                array[i] = null;
            }
        }
        parcel.setDataPosition(dataPosition + f0);
        return array;
    }
    
    public static class a extends RuntimeException
    {
        public a(@RecentlyNonNull final String s, @RecentlyNonNull final Parcel parcel) {
            final int dataPosition = parcel.dataPosition();
            final int dataSize = parcel.dataSize();
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 41);
            sb.append(s);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }
}
