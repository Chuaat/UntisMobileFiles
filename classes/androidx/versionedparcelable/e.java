// 
// Decompiled by Procyon v0.5.36
// 

package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IInterface;
import android.util.SparseBooleanArray;
import android.util.SizeF;
import androidx.annotation.p0;
import android.util.Size;
import androidx.collection.c;
import java.util.Set;
import java.io.ObjectStreamClass;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import androidx.annotation.j0;
import android.os.NetworkOnMainThreadException;
import android.os.BadParcelableException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import android.os.Parcelable;
import java.io.Serializable;
import android.os.IBinder;
import java.util.Collection;
import java.lang.reflect.Method;
import androidx.collection.a;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class e
{
    private static final String d = "VersionedParcel";
    private static final int e = -1;
    private static final int f = -2;
    private static final int g = -3;
    private static final int h = -4;
    private static final int i = -5;
    private static final int j = -6;
    private static final int k = -7;
    private static final int l = -9;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 7;
    private static final int s = 8;
    protected final a<String, Method> a;
    protected final a<String, Method> b;
    protected final a<String, Class> c;
    
    public e(final a<String, Method> a, final a<String, Method> b, final a<String, Class> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private <T> void A0(final Collection<T> collection) {
        if (collection == null) {
            this.L0(-1);
            return;
        }
        final int size = collection.size();
        this.L0(size);
        if (size > 0) {
            final int g = this.g(collection.iterator().next());
            this.L0(g);
            switch (g) {
                case 8: {
                    final Iterator<T> iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        this.H0((float)iterator.next());
                    }
                    break;
                }
                case 7: {
                    final Iterator<T> iterator2 = collection.iterator();
                    while (iterator2.hasNext()) {
                        this.L0((int)iterator2.next());
                    }
                    break;
                }
                case 5: {
                    final Iterator<T> iterator3 = collection.iterator();
                    while (iterator3.hasNext()) {
                        this.g1((IBinder)iterator3.next());
                    }
                    break;
                }
                case 4: {
                    final Iterator<T> iterator4 = collection.iterator();
                    while (iterator4.hasNext()) {
                        this.e1((String)iterator4.next());
                    }
                    break;
                }
                case 3: {
                    final Iterator<T> iterator5 = collection.iterator();
                    while (iterator5.hasNext()) {
                        this.Y0((Serializable)iterator5.next());
                    }
                    break;
                }
                case 2: {
                    final Iterator<T> iterator6 = collection.iterator();
                    while (iterator6.hasNext()) {
                        this.W0((Parcelable)iterator6.next());
                    }
                    break;
                }
                case 1: {
                    final Iterator<T> iterator7 = collection.iterator();
                    while (iterator7.hasNext()) {
                        this.l1((h)iterator7.next());
                    }
                    break;
                }
            }
        }
    }
    
    private <T> void B0(final Collection<T> collection, final int n) {
        this.i0(n);
        this.A0(collection);
    }
    
    private Exception C(final int n, final String s) {
        return this.b(n, s);
    }
    
    private int E() {
        return this.L();
    }
    
    private void Y0(final Serializable obj) {
        if (obj == null) {
            this.e1(null);
            return;
        }
        final String name = obj.getClass().getName();
        this.e1(name);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            this.t0(out.toByteArray());
        }
        catch (IOException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("VersionedParcelable encountered IOException writing serializable object (name = ");
            sb.append(name);
            sb.append(")");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    private Exception b(final int i, final String s) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown exception code: ");
                sb.append(i);
                sb.append(" msg ");
                sb.append(s);
                return new RuntimeException(sb.toString());
            }
            case -1: {
                return new SecurityException(s);
            }
            case -2: {
                return (Exception)new BadParcelableException(s);
            }
            case -3: {
                return new IllegalArgumentException(s);
            }
            case -4: {
                return new NullPointerException(s);
            }
            case -5: {
                return new IllegalStateException(s);
            }
            case -6: {
                return (Exception)new NetworkOnMainThreadException();
            }
            case -7: {
                return new UnsupportedOperationException(s);
            }
            case -9: {
                return this.V();
            }
        }
    }
    
    private Class d(final Class<? extends h> clazz) throws ClassNotFoundException {
        Class<?> forName;
        if ((forName = this.c.get(clazz.getName())) == null) {
            forName = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            this.c.put(clazz.getName(), forName);
        }
        return forName;
    }
    
    private Method e(final String name) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method declaredMethod;
        if ((declaredMethod = this.a.get(name)) == null) {
            System.currentTimeMillis();
            declaredMethod = Class.forName(name, true, e.class.getClassLoader()).getDeclaredMethod("read", e.class);
            this.a.put(name, declaredMethod);
        }
        return declaredMethod;
    }
    
    @j0
    protected static Throwable f(@j0 Throwable cause) {
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }
    
    private <T> int g(final T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof h) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(t.getClass().getName());
        sb.append(" cannot be VersionedParcelled");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private Method h(final Class clazz) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method declaredMethod;
        if ((declaredMethod = this.b.get(clazz.getName())) == null) {
            final Class d = this.d(clazz);
            System.currentTimeMillis();
            declaredMethod = d.getDeclaredMethod("write", clazz, e.class);
            this.b.put(clazz.getName(), declaredMethod);
        }
        return declaredMethod;
    }
    
    private void n1(final h h) {
        try {
            this.e1(this.d(h.getClass()).getName());
        }
        catch (ClassNotFoundException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append(h.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    private <T, S extends Collection<T>> S x(final S n) {
        int i = this.L();
        if (i < 0) {
            return null;
        }
        if (i != 0) {
            final int l = this.L();
            if (i < 0) {
                return null;
            }
            int j = i;
            if (l != 1) {
                int k = i;
                if (l != 2) {
                    int n2 = i;
                    if (l != 3) {
                        int n3 = i;
                        if (l != 4) {
                            if (l == 5) {
                                while (i > 0) {
                                    n.add((T)this.e0());
                                    --i;
                                }
                            }
                        }
                        else {
                            while (n3 > 0) {
                                n.add((T)this.c0());
                                --n3;
                            }
                        }
                    }
                    else {
                        while (n2 > 0) {
                            n.add((T)this.X());
                            --n2;
                        }
                    }
                }
                else {
                    while (k > 0) {
                        n.add(this.V());
                        --k;
                    }
                }
            }
            else {
                while (j > 0) {
                    n.add(this.g0());
                    --j;
                }
            }
        }
        return n;
    }
    
    protected double[] A() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final double[] array = new double[l];
        for (int i = 0; i < l; ++i) {
            array[i] = this.y();
        }
        return array;
    }
    
    public double[] B(final double[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.A();
    }
    
    protected abstract void C0(final double p0);
    
    public Exception D(Exception c, int e) {
        if (!this.F(e)) {
            return c;
        }
        e = this.E();
        if (e != 0) {
            c = this.C(e, this.c0());
        }
        return c;
    }
    
    public void D0(final double n, final int n2) {
        this.i0(n2);
        this.C0(n);
    }
    
    protected void E0(final double[] array) {
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (int i = 0; i < length; ++i) {
                this.C0(array[i]);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    protected abstract boolean F(final int p0);
    
    public void F0(final double[] array, final int n) {
        this.i0(n);
        this.E0(array);
    }
    
    protected abstract float G();
    
    public void G0(final Exception cause, int n) {
        this.i0(n);
        if (cause == null) {
            this.V0();
            return;
        }
        n = 0;
        if (cause instanceof Parcelable && cause.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            n = -9;
        }
        else if (cause instanceof SecurityException) {
            n = -1;
        }
        else if (cause instanceof BadParcelableException) {
            n = -2;
        }
        else if (cause instanceof IllegalArgumentException) {
            n = -3;
        }
        else if (cause instanceof NullPointerException) {
            n = -4;
        }
        else if (cause instanceof IllegalStateException) {
            n = -5;
        }
        else if (cause instanceof NetworkOnMainThreadException) {
            n = -6;
        }
        else if (cause instanceof UnsupportedOperationException) {
            n = -7;
        }
        this.L0(n);
        if (n != 0) {
            this.e1(cause.getMessage());
            if (n == -9) {
                this.W0((Parcelable)cause);
            }
            return;
        }
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        throw new RuntimeException(cause);
    }
    
    public float H(final float n, final int n2) {
        if (!this.F(n2)) {
            return n;
        }
        return this.G();
    }
    
    protected abstract void H0(final float p0);
    
    protected float[] I() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final float[] array = new float[l];
        for (int i = 0; i < l; ++i) {
            array[i] = this.G();
        }
        return array;
    }
    
    public void I0(final float n, final int n2) {
        this.i0(n2);
        this.H0(n);
    }
    
    public float[] J(final float[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.I();
    }
    
    protected void J0(final float[] array) {
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (int i = 0; i < length; ++i) {
                this.H0(array[i]);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    protected <T extends h> T K(final String s, final e e) {
        try {
            return (T)this.e(s).invoke(null, e);
        }
        catch (ClassNotFoundException cause) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", cause);
        }
        catch (NoSuchMethodException cause2) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", cause2);
        }
        catch (InvocationTargetException cause3) {
            if (cause3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)cause3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", cause3);
        }
        catch (IllegalAccessException cause4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", cause4);
        }
    }
    
    public void K0(final float[] array, final int n) {
        this.i0(n);
        this.J0(array);
    }
    
    protected abstract int L();
    
    protected abstract void L0(final int p0);
    
    public int M(final int n, final int n2) {
        if (!this.F(n2)) {
            return n;
        }
        return this.L();
    }
    
    public void M0(final int n, final int n2) {
        this.i0(n2);
        this.L0(n);
    }
    
    protected int[] N() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final int[] array = new int[l];
        for (int i = 0; i < l; ++i) {
            array[i] = this.L();
        }
        return array;
    }
    
    protected void N0(final int[] array) {
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (int i = 0; i < length; ++i) {
                this.L0(array[i]);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    public int[] O(final int[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.N();
    }
    
    public void O0(final int[] array, final int n) {
        this.i0(n);
        this.N0(array);
    }
    
    public <T> List<T> P(final List<T> list, final int n) {
        if (!this.F(n)) {
            return list;
        }
        return this.x(new ArrayList<T>());
    }
    
    public <T> void P0(final List<T> list, final int n) {
        this.B0(list, n);
    }
    
    protected abstract long Q();
    
    protected abstract void Q0(final long p0);
    
    public long R(final long n, final int n2) {
        if (!this.F(n2)) {
            return n;
        }
        return this.Q();
    }
    
    public void R0(final long n, final int n2) {
        this.i0(n2);
        this.Q0(n);
    }
    
    protected long[] S() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final long[] array = new long[l];
        for (int i = 0; i < l; ++i) {
            array[i] = this.Q();
        }
        return array;
    }
    
    protected void S0(final long[] array) {
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (int i = 0; i < length; ++i) {
                this.Q0(array[i]);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    public long[] T(final long[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.S();
    }
    
    public void T0(final long[] array, final int n) {
        this.i0(n);
        this.S0(array);
    }
    
    public <K, V> Map<K, V> U(final Map<K, V> map, int i) {
        if (!this.F(i)) {
            return map;
        }
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final a<K, V> a = new a<K, V>();
        if (l == 0) {
            return a;
        }
        final ArrayList<K> list = (ArrayList<K>)new ArrayList<Object>();
        final ArrayList<V> list2 = new ArrayList<V>();
        this.x(list);
        this.x(list2);
        for (i = 0; i < l; ++i) {
            a.put(list.get(i), (V)list2.get(i));
        }
        return a;
    }
    
    public <K, V> void U0(final Map<K, V> map, int size) {
        this.i0(size);
        if (map == null) {
            this.L0(-1);
            return;
        }
        size = map.size();
        this.L0(size);
        if (size == 0) {
            return;
        }
        final ArrayList<K> list = new ArrayList<K>();
        final ArrayList<Object> list2 = new ArrayList<Object>();
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            list.add(entry.getKey());
            list2.add(entry.getValue());
        }
        this.A0(list);
        this.A0((Collection<V>)list2);
    }
    
    protected abstract <T extends Parcelable> T V();
    
    protected void V0() {
        this.L0(0);
    }
    
    public <T extends Parcelable> T W(final T t, final int n) {
        if (!this.F(n)) {
            return t;
        }
        return this.V();
    }
    
    protected abstract void W0(final Parcelable p0);
    
    protected Serializable X() {
        final String c0 = this.c0();
        if (c0 == null) {
            return null;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.s());
        try {
            return (Serializable)new ObjectInputStream(byteArrayInputStream) {
                @Override
                protected Class<?> resolveClass(final ObjectStreamClass desc) throws IOException, ClassNotFoundException {
                    final Class<?> forName = Class.forName(desc.getName(), false, this.getClass().getClassLoader());
                    if (forName != null) {
                        return forName;
                    }
                    return super.resolveClass(desc);
                }
            }.readObject();
        }
        catch (ClassNotFoundException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ");
            sb.append(c0);
            sb.append(")");
            throw new RuntimeException(sb.toString(), cause);
        }
        catch (IOException cause2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("VersionedParcelable encountered IOException reading a Serializable object (name = ");
            sb2.append(c0);
            sb2.append(")");
            throw new RuntimeException(sb2.toString(), cause2);
        }
    }
    
    public void X0(final Parcelable parcelable, final int n) {
        this.i0(n);
        this.W0(parcelable);
    }
    
    public <T> Set<T> Y(final Set<T> set, final int n) {
        if (!this.F(n)) {
            return set;
        }
        return this.x(new c<T>());
    }
    
    @p0(api = 21)
    public Size Z(final Size size, final int n) {
        if (!this.F(n)) {
            return size;
        }
        if (this.l()) {
            return new Size(this.L(), this.L());
        }
        return null;
    }
    
    public void Z0(final Serializable s, final int n) {
        this.i0(n);
        this.Y0(s);
    }
    
    protected abstract void a();
    
    @p0(api = 21)
    public SizeF a0(final SizeF sizeF, final int n) {
        if (!this.F(n)) {
            return sizeF;
        }
        if (this.l()) {
            return new SizeF(this.G(), this.G());
        }
        return null;
    }
    
    public <T> void a1(final Set<T> set, final int n) {
        this.B0(set, n);
    }
    
    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i) {
        if (!this.F(i)) {
            return sparseBooleanArray;
        }
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        sparseBooleanArray = new SparseBooleanArray(l);
        for (i = 0; i < l; ++i) {
            sparseBooleanArray.put(this.L(), this.l());
        }
        return sparseBooleanArray;
    }
    
    @p0(api = 21)
    public void b1(final Size size, final int n) {
        this.i0(n);
        this.m0(size != null);
        if (size != null) {
            this.L0(size.getWidth());
            this.L0(size.getHeight());
        }
    }
    
    protected abstract e c();
    
    protected abstract String c0();
    
    @p0(api = 21)
    public void c1(final SizeF sizeF, final int n) {
        this.i0(n);
        this.m0(sizeF != null);
        if (sizeF != null) {
            this.H0(sizeF.getWidth());
            this.H0(sizeF.getHeight());
        }
    }
    
    public String d0(final String s, final int n) {
        if (!this.F(n)) {
            return s;
        }
        return this.c0();
    }
    
    public void d1(final SparseBooleanArray sparseBooleanArray, int i) {
        this.i0(i);
        if (sparseBooleanArray == null) {
            this.L0(-1);
            return;
        }
        final int size = sparseBooleanArray.size();
        this.L0(size);
        for (i = 0; i < size; ++i) {
            this.L0(sparseBooleanArray.keyAt(i));
            this.m0(sparseBooleanArray.valueAt(i));
        }
    }
    
    protected abstract IBinder e0();
    
    protected abstract void e1(final String p0);
    
    public IBinder f0(final IBinder binder, final int n) {
        if (!this.F(n)) {
            return binder;
        }
        return this.e0();
    }
    
    public void f1(final String s, final int n) {
        this.i0(n);
        this.e1(s);
    }
    
    protected <T extends h> T g0() {
        final String c0 = this.c0();
        if (c0 == null) {
            return null;
        }
        return (T)this.K(c0, this.c());
    }
    
    protected abstract void g1(final IBinder p0);
    
    public <T extends h> T h0(final T t, final int n) {
        if (!this.F(n)) {
            return t;
        }
        return this.g0();
    }
    
    public void h1(final IBinder binder, final int n) {
        this.i0(n);
        this.g1(binder);
    }
    
    public boolean i() {
        return false;
    }
    
    protected abstract void i0(final int p0);
    
    protected abstract void i1(final IInterface p0);
    
    protected <T> T[] j(final T[] a) {
        int i = this.L();
        if (i < 0) {
            return null;
        }
        final ArrayList list = new ArrayList<String>(i);
        if (i != 0) {
            final int l = this.L();
            if (i < 0) {
                return null;
            }
            int j = i;
            if (l != 1) {
                int k = i;
                if (l != 2) {
                    int n = i;
                    if (l != 3) {
                        int n2 = i;
                        if (l != 4) {
                            if (l == 5) {
                                while (i > 0) {
                                    list.add((String)this.e0());
                                    --i;
                                }
                            }
                        }
                        else {
                            while (n2 > 0) {
                                list.add(this.c0());
                                --n2;
                            }
                        }
                    }
                    else {
                        while (n > 0) {
                            list.add((String)this.X());
                            --n;
                        }
                    }
                }
                else {
                    while (k > 0) {
                        list.add(this.V());
                        --k;
                    }
                }
            }
            else {
                while (j > 0) {
                    list.add(this.g0());
                    --j;
                }
            }
        }
        return list.toArray(a);
    }
    
    public void j0(final boolean b, final boolean b2) {
    }
    
    public void j1(final IInterface interface1, final int n) {
        this.i0(n);
        this.i1(interface1);
    }
    
    public <T> T[] k(final T[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.j(array);
    }
    
    protected <T> void k0(final T[] array) {
        if (array == null) {
            this.L0(-1);
            return;
        }
        final int length = array.length;
        this.L0(length);
        if (length > 0) {
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            final int n4 = 0;
            final int g = this.g(array[0]);
            this.L0(g);
            if (g != 1) {
                int j = n3;
                if (g != 2) {
                    int k = n2;
                    if (g != 3) {
                        int l = n;
                        if (g != 4) {
                            int n5 = n4;
                            if (g == 5) {
                                while (n5 < length) {
                                    this.g1((IBinder)array[n5]);
                                    ++n5;
                                }
                            }
                        }
                        else {
                            while (l < length) {
                                this.e1((String)array[l]);
                                ++l;
                            }
                        }
                    }
                    else {
                        while (k < length) {
                            this.Y0((Serializable)array[k]);
                            ++k;
                        }
                    }
                }
                else {
                    while (j < length) {
                        this.W0((Parcelable)array[j]);
                        ++j;
                    }
                }
            }
            else {
                while (i < length) {
                    this.l1((h)array[i]);
                    ++i;
                }
            }
        }
    }
    
    protected <T extends h> void k1(final T t, final e e) {
        try {
            this.h(t.getClass()).invoke(null, t, e);
        }
        catch (ClassNotFoundException cause) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", cause);
        }
        catch (NoSuchMethodException cause2) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", cause2);
        }
        catch (InvocationTargetException cause3) {
            if (cause3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)cause3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", cause3);
        }
        catch (IllegalAccessException cause4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", cause4);
        }
    }
    
    protected abstract boolean l();
    
    public <T> void l0(final T[] array, final int n) {
        this.i0(n);
        this.k0(array);
    }
    
    protected void l1(final h h) {
        if (h == null) {
            this.e1(null);
            return;
        }
        this.n1(h);
        final e c = this.c();
        this.k1(h, c);
        c.a();
    }
    
    public boolean m(final boolean b, final int n) {
        if (!this.F(n)) {
            return b;
        }
        return this.l();
    }
    
    protected abstract void m0(final boolean p0);
    
    public void m1(final h h, final int n) {
        this.i0(n);
        this.l1(h);
    }
    
    protected boolean[] n() {
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        final boolean[] array = new boolean[l];
        for (int i = 0; i < l; ++i) {
            array[i] = (this.L() != 0);
        }
        return array;
    }
    
    public void n0(final boolean b, final int n) {
        this.i0(n);
        this.m0(b);
    }
    
    public boolean[] o(final boolean[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.n();
    }
    
    protected void o0(final boolean[] array) {
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (int i = 0; i < length; ++i) {
                this.L0(array[i] ? 1 : 0);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    protected abstract Bundle p();
    
    public void p0(final boolean[] array, final int n) {
        this.i0(n);
        this.o0(array);
    }
    
    public Bundle q(final Bundle bundle, final int n) {
        if (!this.F(n)) {
            return bundle;
        }
        return this.p();
    }
    
    protected abstract void q0(final Bundle p0);
    
    public byte r(final byte b, final int n) {
        if (!this.F(n)) {
            return b;
        }
        return (byte)(this.L() & 0xFF);
    }
    
    public void r0(final Bundle bundle, final int n) {
        this.i0(n);
        this.q0(bundle);
    }
    
    protected abstract byte[] s();
    
    public void s0(final byte b, final int n) {
        this.i0(n);
        this.L0(b);
    }
    
    public byte[] t(final byte[] array, final int n) {
        if (!this.F(n)) {
            return array;
        }
        return this.s();
    }
    
    protected abstract void t0(final byte[] p0);
    
    public char[] u(char[] array, int i) {
        if (!this.F(i)) {
            return array;
        }
        final int l = this.L();
        if (l < 0) {
            return null;
        }
        array = new char[l];
        for (i = 0; i < l; ++i) {
            array[i] = (char)this.L();
        }
        return array;
    }
    
    public void u0(final byte[] array, final int n) {
        this.i0(n);
        this.t0(array);
    }
    
    protected abstract CharSequence v();
    
    protected abstract void v0(final byte[] p0, final int p1, final int p2);
    
    public CharSequence w(final CharSequence charSequence, final int n) {
        if (!this.F(n)) {
            return charSequence;
        }
        return this.v();
    }
    
    public void w0(final byte[] array, final int n, final int n2, final int n3) {
        this.i0(n3);
        this.v0(array, n, n2);
    }
    
    public void x0(final char[] array, int i) {
        this.i0(i);
        if (array != null) {
            final int length = array.length;
            this.L0(length);
            for (i = 0; i < length; ++i) {
                this.L0(array[i]);
            }
        }
        else {
            this.L0(-1);
        }
    }
    
    protected abstract double y();
    
    protected abstract void y0(final CharSequence p0);
    
    public double z(final double n, final int n2) {
        if (!this.F(n2)) {
            return n;
        }
        return this.y();
    }
    
    public void z0(final CharSequence charSequence, final int n) {
        this.i0(n);
        this.y0(charSequence);
    }
    
    public static class b extends RuntimeException
    {
        public b(final Throwable cause) {
            super(cause);
        }
    }
}
