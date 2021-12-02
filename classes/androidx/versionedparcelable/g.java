// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Set;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Bundle;
import java.io.IOException;
import java.io.FilterInputStream;
import java.lang.reflect.Method;
import androidx.collection.a;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.nio.charset.Charset;
import androidx.annotation.t0;

@t0({ t0.a.G })
class g extends e
{
    private static final Charset C;
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private int A;
    int B;
    private final DataInputStream t;
    private final DataOutputStream u;
    private DataInputStream v;
    private DataOutputStream w;
    private b x;
    private boolean y;
    int z;
    
    static {
        C = Charset.forName("UTF-16");
    }
    
    public g(final InputStream inputStream, final OutputStream outputStream) {
        this(inputStream, outputStream, new a<String, Method>(), new a<String, Method>(), new a<String, Class>());
    }
    
    private g(final InputStream inputStream, final OutputStream out, final a<String, Method> a, final a<String, Method> a2, final a<String, Class> a3) {
        super(a, a2, a3);
        this.z = 0;
        this.A = -1;
        this.B = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream;
        if (inputStream != null) {
            dataInputStream = new DataInputStream(new FilterInputStream(inputStream) {
                @Override
                public int read() throws IOException {
                    final g g = androidx.versionedparcelable.g.this;
                    final int b = g.B;
                    if (b != -1 && g.z >= b) {
                        throw new IOException();
                    }
                    final int read = super.read();
                    final g g2 = androidx.versionedparcelable.g.this;
                    ++g2.z;
                    return read;
                }
                
                @Override
                public int read(final byte[] b, int read, final int len) throws IOException {
                    final g g = androidx.versionedparcelable.g.this;
                    final int b2 = g.B;
                    if (b2 != -1 && g.z >= b2) {
                        throw new IOException();
                    }
                    read = super.read(b, read, len);
                    if (read > 0) {
                        final g g2 = androidx.versionedparcelable.g.this;
                        g2.z += read;
                    }
                    return read;
                }
                
                @Override
                public long skip(long skip) throws IOException {
                    final g g = androidx.versionedparcelable.g.this;
                    final int b = g.B;
                    if (b != -1 && g.z >= b) {
                        throw new IOException();
                    }
                    skip = super.skip(skip);
                    if (skip > 0L) {
                        final g g2 = androidx.versionedparcelable.g.this;
                        g2.z += (int)skip;
                    }
                    return skip;
                }
            });
        }
        else {
            dataInputStream = null;
        }
        this.t = dataInputStream;
        if (out != null) {
            dataOutputStream = new DataOutputStream(out);
        }
        this.u = dataOutputStream;
        this.v = dataInputStream;
        this.w = dataOutputStream;
    }
    
    private void o1(final int i, final String s, final Bundle bundle) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown type ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            }
            case 14: {
                bundle.putFloatArray(s, this.I());
                break;
            }
            case 13: {
                bundle.putFloat(s, this.G());
                break;
            }
            case 12: {
                bundle.putLongArray(s, this.S());
                break;
            }
            case 11: {
                bundle.putLong(s, this.Q());
                break;
            }
            case 10: {
                bundle.putIntArray(s, this.N());
                break;
            }
            case 9: {
                bundle.putInt(s, this.L());
                break;
            }
            case 8: {
                bundle.putDoubleArray(s, this.A());
                break;
            }
            case 7: {
                bundle.putDouble(s, this.y());
                break;
            }
            case 6: {
                bundle.putBooleanArray(s, this.n());
                break;
            }
            case 5: {
                bundle.putBoolean(s, this.l());
                break;
            }
            case 4: {
                bundle.putStringArray(s, (String[])this.j(new String[0]));
                break;
            }
            case 3: {
                bundle.putString(s, this.c0());
                break;
            }
            case 1:
            case 2: {
                bundle.putBundle(s, this.p());
                break;
            }
            case 0: {
                bundle.putParcelable(s, (Parcelable)null);
                break;
            }
        }
    }
    
    private void p1(final Object o) {
        int intValue;
        if (o == null) {
            intValue = 0;
        }
        else {
            if (o instanceof Bundle) {
                this.L0(1);
                this.q0((Bundle)o);
                return;
            }
            if (o instanceof String) {
                this.L0(3);
                this.e1((String)o);
                return;
            }
            if (o instanceof String[]) {
                this.L0(4);
                this.k0((String[])o);
                return;
            }
            if (o instanceof Boolean) {
                this.L0(5);
                this.m0((boolean)o);
                return;
            }
            if (o instanceof boolean[]) {
                this.L0(6);
                this.o0((boolean[])o);
                return;
            }
            if (o instanceof Double) {
                this.L0(7);
                this.C0((double)o);
                return;
            }
            if (o instanceof double[]) {
                this.L0(8);
                this.E0((double[])o);
                return;
            }
            if (o instanceof Integer) {
                this.L0(9);
                intValue = (int)o;
            }
            else {
                if (o instanceof int[]) {
                    this.L0(10);
                    this.N0((int[])o);
                    return;
                }
                if (o instanceof Long) {
                    this.L0(11);
                    this.Q0((long)o);
                    return;
                }
                if (o instanceof long[]) {
                    this.L0(12);
                    this.S0((long[])o);
                    return;
                }
                if (o instanceof Float) {
                    this.L0(13);
                    this.H0((float)o);
                    return;
                }
                if (o instanceof float[]) {
                    this.L0(14);
                    this.J0((float[])o);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type ");
                sb.append(o.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.L0(intValue);
    }
    
    public void C0(final double v) {
        try {
            this.w.writeDouble(v);
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public boolean F(final int i) {
        try {
            while (true) {
                final int a = this.A;
                if (a == i) {
                    return true;
                }
                if (String.valueOf(a).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                final int z = this.z;
                final int b = this.B;
                if (z < b) {
                    this.t.skip(b - z);
                }
                this.B = -1;
                final int int1 = this.t.readInt();
                this.z = 0;
                int int2;
                if ((int2 = (int1 & 0xFFFF)) == 65535) {
                    int2 = this.t.readInt();
                }
                this.A = (int1 >> 16 & 0xFFFF);
                this.B = int2;
            }
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public float G() {
        try {
            return this.v.readFloat();
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public void H0(final float v) {
        try {
            this.w.writeFloat(v);
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public int L() {
        try {
            return this.v.readInt();
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public void L0(final int v) {
        try {
            this.w.writeInt(v);
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public long Q() {
        try {
            return this.v.readLong();
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public void Q0(final long v) {
        try {
            this.w.writeLong(v);
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public <T extends Parcelable> T V() {
        return null;
    }
    
    public void W0(final Parcelable parcelable) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Parcelables cannot be written to an OutputStream");
    }
    
    public void a() {
        final b x = this.x;
        if (x != null) {
            try {
                if (x.a.size() != 0) {
                    this.x.a();
                }
                this.x = null;
            }
            catch (IOException ex) {
                throw new e.b(ex);
            }
        }
    }
    
    @Override
    protected e c() {
        return new g(this.v, this.w, super.a, super.b, super.c);
    }
    
    public String c0() {
        try {
            final int int1 = this.v.readInt();
            if (int1 > 0) {
                final byte[] array = new byte[int1];
                this.v.readFully(array);
                return new String(array, g.C);
            }
            return null;
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public IBinder e0() {
        return null;
    }
    
    public void e1(final String s) {
        Label_0032: {
            if (s == null) {
                break Label_0032;
            }
            try {
                final byte[] bytes = s.getBytes(g.C);
                this.w.writeInt(bytes.length);
                this.w.write(bytes);
                return;
                this.w.writeInt(-1);
            }
            catch (IOException ex) {
                throw new e.b(ex);
            }
        }
    }
    
    public void g1(final IBinder binder) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    public void i0(final int n) {
        this.a();
        final b x = new b(n, this.u);
        this.x = x;
        this.w = x.b;
    }
    
    public void i1(final IInterface interface1) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }
    
    @Override
    public void j0(final boolean b, final boolean y) {
        if (b) {
            this.y = y;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }
    
    public boolean l() {
        try {
            return this.v.readBoolean();
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public void m0(final boolean v) {
        try {
            this.w.writeBoolean(v);
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public Bundle p() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (int i = 0; i < l; ++i) {
            this.o1(this.L(), this.c0(), bundle);
        }
        return bundle;
    }
    
    public void q0(final Bundle bundle) {
        Label_0065: {
            if (bundle == null) {
                break Label_0065;
            }
            try {
                final Set keySet = bundle.keySet();
                this.w.writeInt(keySet.size());
                for (final String s : keySet) {
                    this.e1(s);
                    this.p1(bundle.get(s));
                }
                return;
                this.w.writeInt(-1);
            }
            catch (IOException ex) {
                throw new e.b(ex);
            }
        }
    }
    
    public byte[] s() {
        try {
            final int int1 = this.v.readInt();
            if (int1 > 0) {
                final byte[] b = new byte[int1];
                this.v.readFully(b);
                return b;
            }
            return null;
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    public void t0(final byte[] b) {
        Label_0024: {
            if (b == null) {
                break Label_0024;
            }
            try {
                this.w.writeInt(b.length);
                this.w.write(b);
                return;
                this.w.writeInt(-1);
            }
            catch (IOException ex) {
                throw new e.b(ex);
            }
        }
    }
    
    @Override
    protected CharSequence v() {
        return null;
    }
    
    public void v0(final byte[] b, final int off, final int n) {
        Label_0025: {
            if (b == null) {
                break Label_0025;
            }
            try {
                this.w.writeInt(n);
                this.w.write(b, off, n);
                return;
                this.w.writeInt(-1);
            }
            catch (IOException ex) {
                throw new e.b(ex);
            }
        }
    }
    
    public double y() {
        try {
            return this.v.readDouble();
        }
        catch (IOException ex) {
            throw new e.b(ex);
        }
    }
    
    @Override
    protected void y0(final CharSequence charSequence) {
        if (this.y) {
            return;
        }
        throw new RuntimeException("CharSequence cannot be written to an OutputStream");
    }
    
    private static class b
    {
        final ByteArrayOutputStream a;
        final DataOutputStream b;
        private final int c;
        private final DataOutputStream d;
        
        b(final int c, final DataOutputStream d) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a = byteArrayOutputStream;
            this.b = new DataOutputStream(byteArrayOutputStream);
            this.c = c;
            this.d = d;
        }
        
        void a() throws IOException {
            this.b.flush();
            final int size = this.a.size();
            final int c = this.c;
            int n;
            if (size >= 65535) {
                n = 65535;
            }
            else {
                n = size;
            }
            this.d.writeInt(c << 16 | n);
            if (size >= 65535) {
                this.d.writeInt(size);
            }
            this.a.writeTo(this.d);
        }
    }
}
