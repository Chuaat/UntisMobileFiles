// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import android.text.TextUtils;
import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable;
import java.lang.reflect.Method;
import androidx.collection.a;
import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.annotation.t0;

@t0({ t0.a.G })
class f extends e
{
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private int A;
    private final SparseIntArray t;
    private final Parcel u;
    private final int v;
    private final int w;
    private final String x;
    private int y;
    private int z;
    
    f(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a<String, Method>(), new a<String, Method>(), new a<String, Class>());
    }
    
    private f(final Parcel u, final int n, final int w, final String x, final a<String, Method> a, final a<String, Method> a2, final a<String, Class> a3) {
        super(a, a2, a3);
        this.t = new SparseIntArray();
        this.y = -1;
        this.z = 0;
        this.A = -1;
        this.u = u;
        this.v = n;
        this.w = w;
        this.z = n;
        this.x = x;
    }
    
    public void C0(final double n) {
        this.u.writeDouble(n);
    }
    
    public boolean F(final int i) {
        while (true) {
            final int z = this.z;
            final int w = this.w;
            boolean b = true;
            if (z >= w) {
                if (this.A != i) {
                    b = false;
                }
                return b;
            }
            final int a = this.A;
            if (a == i) {
                return true;
            }
            if (String.valueOf(a).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.u.setDataPosition(this.z);
            final int int1 = this.u.readInt();
            this.A = this.u.readInt();
            this.z += int1;
        }
    }
    
    public float G() {
        return this.u.readFloat();
    }
    
    public void H0(final float n) {
        this.u.writeFloat(n);
    }
    
    public int L() {
        return this.u.readInt();
    }
    
    public void L0(final int n) {
        this.u.writeInt(n);
    }
    
    public long Q() {
        return this.u.readLong();
    }
    
    public void Q0(final long n) {
        this.u.writeLong(n);
    }
    
    public <T extends Parcelable> T V() {
        return (T)this.u.readParcelable(this.getClass().getClassLoader());
    }
    
    public void W0(final Parcelable parcelable) {
        this.u.writeParcelable(parcelable, 0);
    }
    
    public void a() {
        final int y = this.y;
        if (y >= 0) {
            final int value = this.t.get(y);
            final int dataPosition = this.u.dataPosition();
            this.u.setDataPosition(value);
            this.u.writeInt(dataPosition - value);
            this.u.setDataPosition(dataPosition);
        }
    }
    
    @Override
    protected e c() {
        final Parcel u = this.u;
        final int dataPosition = u.dataPosition();
        int n;
        if ((n = this.z) == this.v) {
            n = this.w;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.x);
        sb.append("  ");
        return new f(u, dataPosition, n, sb.toString(), super.a, super.b, super.c);
    }
    
    public String c0() {
        return this.u.readString();
    }
    
    public IBinder e0() {
        return this.u.readStrongBinder();
    }
    
    public void e1(final String s) {
        this.u.writeString(s);
    }
    
    public void g1(final IBinder binder) {
        this.u.writeStrongBinder(binder);
    }
    
    public void i0(final int y) {
        this.a();
        this.y = y;
        this.t.put(y, this.u.dataPosition());
        this.L0(0);
        this.L0(y);
    }
    
    public void i1(final IInterface interface1) {
        this.u.writeStrongInterface(interface1);
    }
    
    public boolean l() {
        return this.u.readInt() != 0;
    }
    
    public void m0(final boolean b) {
        this.u.writeInt((int)(b ? 1 : 0));
    }
    
    public Bundle p() {
        return this.u.readBundle(this.getClass().getClassLoader());
    }
    
    public void q0(final Bundle bundle) {
        this.u.writeBundle(bundle);
    }
    
    public byte[] s() {
        final int int1 = this.u.readInt();
        if (int1 < 0) {
            return null;
        }
        final byte[] array = new byte[int1];
        this.u.readByteArray(array);
        return array;
    }
    
    public void t0(final byte[] array) {
        if (array != null) {
            this.u.writeInt(array.length);
            this.u.writeByteArray(array);
        }
        else {
            this.u.writeInt(-1);
        }
    }
    
    @Override
    protected CharSequence v() {
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.u);
    }
    
    public void v0(final byte[] array, final int n, final int n2) {
        if (array != null) {
            this.u.writeInt(array.length);
            this.u.writeByteArray(array, n, n2);
        }
        else {
            this.u.writeInt(-1);
        }
    }
    
    public double y() {
        return this.u.readDouble();
    }
    
    @Override
    protected void y0(final CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.u, 0);
    }
}
