// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.util.Log;
import java.util.TreeMap;
import android.app.ActivityManager;
import androidx.annotation.b0;
import android.annotation.SuppressLint;
import java.util.HashSet;
import androidx.room.migration.Migration;
import java.io.InputStream;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import android.content.Context;
import androidx.annotation.i;
import java.util.Iterator;
import java.util.BitSet;
import java.util.concurrent.locks.Lock;
import androidx.sqlite.db.h;
import androidx.annotation.c1;
import java.util.concurrent.Callable;
import androidx.sqlite.db.b;
import android.os.CancellationSignal;
import android.database.Cursor;
import androidx.annotation.j0;
import androidx.sqlite.db.f;
import android.os.Looper;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import androidx.annotation.k0;
import java.util.List;
import androidx.sqlite.db.d;
import java.util.concurrent.Executor;
import androidx.sqlite.db.c;
import androidx.annotation.t0;

public abstract class r2
{
    private static final String n = "_Impl";
    @t0({ t0.a.I })
    public static final int o = 999;
    @Deprecated
    protected volatile androidx.sqlite.db.c a;
    private Executor b;
    private Executor c;
    private androidx.sqlite.db.d d;
    private final h1 e;
    private boolean f;
    boolean g;
    @Deprecated
    @k0
    @t0({ t0.a.I })
    protected List<b> h;
    private final ReentrantReadWriteLock i;
    @k0
    private androidx.room.a j;
    private final ThreadLocal<Integer> k;
    private final Map<String, Object> l;
    private final Map<Class<?>, Object> m;
    
    public r2() {
        this.i = new ReentrantReadWriteLock();
        this.k = new ThreadLocal<Integer>();
        this.l = Collections.synchronizedMap(new HashMap<String, Object>());
        this.e = this.i();
        this.m = new HashMap<Class<?>, Object>();
    }
    
    @k0
    private <T> T J(final Class<T> clazz, final androidx.sqlite.db.d d) {
        if (clazz.isInstance(d)) {
            return (T)d;
        }
        if (d instanceof p0) {
            return (T)this.J((Class<Object>)clazz, ((p0)d).f());
        }
        return null;
    }
    
    private void w() {
        this.c();
        final androidx.sqlite.db.c t2 = this.d.T2();
        this.e.u(t2);
        if (Build$VERSION.SDK_INT >= 16 && t2.W4()) {
            t2.v2();
        }
        else {
            t2.beginTransaction();
        }
    }
    
    private void x() {
        this.d.T2().p3();
        if (!this.u()) {
            this.e.k();
        }
    }
    
    private static boolean z() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
    
    public boolean A() {
        final androidx.room.a j = this.j;
        if (j != null) {
            return j.h();
        }
        final androidx.sqlite.db.c a = this.a;
        return a != null && a.isOpen();
    }
    
    @j0
    public Cursor D(@j0 final androidx.sqlite.db.f f) {
        return this.E(f, null);
    }
    
    @j0
    public Cursor E(@j0 final androidx.sqlite.db.f f, @k0 final CancellationSignal cancellationSignal) {
        this.c();
        this.d();
        if (cancellationSignal != null && Build$VERSION.SDK_INT >= 16) {
            return this.d.T2().I1(f, cancellationSignal);
        }
        return this.d.T2().Z3(f);
    }
    
    @j0
    public Cursor F(@j0 final String s, @k0 final Object[] array) {
        return this.d.T2().Z3(new androidx.sqlite.db.b(s, array));
    }
    
    public <V> V G(@j0 final Callable<V> callable) {
        this.e();
        try {
            try {
                final V call = callable.call();
                this.I();
                this.k();
                return call;
            }
            finally {}
        }
        catch (Exception ex) {
            androidx.room.util.f.a(ex);
            this.k();
            return null;
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        this.k();
    }
    
    public void H(@j0 final Runnable runnable) {
        this.e();
        try {
            runnable.run();
            this.I();
        }
        finally {
            this.k();
        }
    }
    
    @Deprecated
    public void I() {
        this.d.T2().n2();
    }
    
    @t0({ t0.a.I })
    public void c() {
        if (this.f) {
            return;
        }
        if (!z()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    
    @t0({ t0.a.H })
    public void d() {
        if (!this.u() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
    
    @Deprecated
    public void e() {
        this.c();
        final androidx.room.a j = this.j;
        if (j == null) {
            this.w();
        }
        else {
            j.c((g.a<androidx.sqlite.db.c, Object>)new p2(this));
        }
    }
    
    @c1
    public abstract void f();
    
    public void g() {
        if (this.A()) {
            final ReentrantReadWriteLock.WriteLock writeLock = this.i.writeLock();
            writeLock.lock();
            try {
                this.e.r();
                this.d.close();
            }
            finally {
                writeLock.unlock();
            }
        }
    }
    
    public h h(@j0 final String s) {
        this.c();
        this.d();
        return this.d.T2().h1(s);
    }
    
    @j0
    protected abstract h1 i();
    
    @j0
    protected abstract androidx.sqlite.db.d j(final n0 p0);
    
    @Deprecated
    public void k() {
        final androidx.room.a j = this.j;
        if (j == null) {
            this.x();
        }
        else {
            j.c((g.a<androidx.sqlite.db.c, Object>)new q2(this));
        }
    }
    
    @t0({ t0.a.H })
    Map<String, Object> l() {
        return this.l;
    }
    
    Lock m() {
        return this.i.readLock();
    }
    
    @j0
    public h1 n() {
        return this.e;
    }
    
    @j0
    public androidx.sqlite.db.d o() {
        return this.d;
    }
    
    @j0
    public Executor p() {
        return this.b;
    }
    
    @j0
    @t0({ t0.a.H })
    protected Map<Class<?>, List<Class<?>>> q() {
        return Collections.emptyMap();
    }
    
    @t0({ t0.a.H })
    ThreadLocal<Integer> r() {
        return this.k;
    }
    
    @j0
    public Executor s() {
        return this.c;
    }
    
    @k0
    public <T> T t(@j0 final Class<T> clazz) {
        return (T)this.m.get(clazz);
    }
    
    public boolean u() {
        return this.d.T2().x4();
    }
    
    @i
    public void v(@j0 final n0 n0) {
        final androidx.sqlite.db.d j = this.j(n0);
        this.d = j;
        final y2 y2 = this.J(y2.class, j);
        if (y2 != null) {
            y2.d(n0);
        }
        final z z = this.J(z.class, this.d);
        if (z != null) {
            final androidx.room.a a = z.a();
            this.j = a;
            this.e.o(a);
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        final boolean b2 = false;
        if (sdk_INT >= 16) {
            b = b2;
            if (n0.i == r2.c.I) {
                b = true;
            }
            this.d.setWriteAheadLoggingEnabled(b);
        }
        this.h = n0.e;
        this.b = n0.j;
        this.c = new e3(n0.k);
        this.f = n0.h;
        this.g = b;
        if (n0.l) {
            this.e.p(n0.b, n0.c);
        }
        final Map<Class<?>, List<Class<?>>> q = this.q();
        final BitSet set = new BitSet();
        for (final Map.Entry<Class<?>, List<Class<?>>> entry : q.entrySet()) {
            final Class<?> clazz = entry.getKey();
        Label_0259:
            for (final Class<?> obj : entry.getValue()) {
                int i = n0.g.size() - 1;
                while (true) {
                    while (i >= 0) {
                        if (obj.isAssignableFrom(n0.g.get(i).getClass())) {
                            set.set(i);
                            if (i >= 0) {
                                this.m.put(obj, n0.g.get(i));
                                continue Label_0259;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("A required type converter (");
                            sb.append(obj);
                            sb.append(") for ");
                            sb.append(clazz.getCanonicalName());
                            sb.append(" is missing in the database configuration.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        else {
                            --i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
        }
        for (int k = n0.g.size() - 1; k >= 0; --k) {
            if (!set.get(k)) {
                final Object value = n0.g.get(k);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected type converter ");
                sb2.append(value);
                sb2.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }
    
    protected void y(@j0 final androidx.sqlite.db.c c) {
        this.e.h(c);
    }
    
    public static class a<T extends r2>
    {
        private final Class<T> a;
        private final String b;
        private final Context c;
        private ArrayList<b> d;
        private e e;
        private f f;
        private Executor g;
        private List<Object> h;
        private Executor i;
        private Executor j;
        private androidx.sqlite.db.d.c k;
        private boolean l;
        private c m;
        private boolean n;
        private boolean o;
        private boolean p;
        private long q;
        private TimeUnit r;
        private final d s;
        private Set<Integer> t;
        private Set<Integer> u;
        private String v;
        private File w;
        private Callable<InputStream> x;
        
        a(@j0 final Context c, @j0 final Class<T> a, @k0 final String b) {
            this.q = -1L;
            this.c = c;
            this.a = a;
            this.b = b;
            this.m = c.G;
            this.o = true;
            this.s = new d();
        }
        
        @j0
        public a<T> a(@j0 final b e) {
            if (this.d == null) {
                this.d = new ArrayList<b>();
            }
            this.d.add(e);
            return this;
        }
        
        @j0
        public a<T> b(@j0 final Migration... array) {
            if (this.u == null) {
                this.u = new HashSet<Integer>();
            }
            for (final Migration migration : array) {
                this.u.add(((e1.c)migration).a);
                this.u.add(((e1.c)migration).b);
            }
            this.s.b((e1.c[])array);
            return this;
        }
        
        @j0
        public a<T> c(@j0 final Object o) {
            if (this.h == null) {
                this.h = new ArrayList<Object>();
            }
            this.h.add(o);
            return this;
        }
        
        @j0
        public a<T> d() {
            this.l = true;
            return this;
        }
        
        @SuppressLint({ "RestrictedApi" })
        @j0
        public T e() {
            if (this.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.a != null) {
                final Executor i = this.i;
                Label_0082: {
                    Executor executor;
                    if (i == null && this.j == null) {
                        executor = androidx.arch.core.executor.a.e();
                        this.j = executor;
                    }
                    else {
                        if (i != null && this.j == null) {
                            this.j = i;
                            break Label_0082;
                        }
                        if (i != null) {
                            break Label_0082;
                        }
                        executor = this.j;
                        if (executor == null) {
                            break Label_0082;
                        }
                    }
                    this.i = executor;
                }
                final Set<Integer> u = this.u;
                if (u != null && this.t != null) {
                    for (final Integer obj : u) {
                        if (!this.t.contains(obj)) {
                            continue;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                        sb.append(obj);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                androidx.sqlite.db.d.c k;
                if ((k = this.k) == null) {
                    k = new androidx.sqlite.db.framework.c();
                }
                final long q = this.q;
                androidx.sqlite.db.d.c c = k;
                if (q > 0L) {
                    if (this.b == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    c = new g0(k, new androidx.room.a(q, this.r, this.j));
                }
                final String v = this.v;
                androidx.sqlite.db.d.c c2 = null;
                Label_0362: {
                    if (v == null && this.w == null) {
                        c2 = c;
                        if (this.x == null) {
                            break Label_0362;
                        }
                    }
                    if (this.b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int n = 0;
                    int n2;
                    if (v == null) {
                        n2 = 0;
                    }
                    else {
                        n2 = 1;
                    }
                    final File w = this.w;
                    int n3;
                    if (w == null) {
                        n3 = 0;
                    }
                    else {
                        n3 = 1;
                    }
                    final Callable<InputStream> x = this.x;
                    if (x != null) {
                        n = 1;
                    }
                    if (n2 + n3 + n != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    c2 = new z2(v, w, x, c);
                }
                final f f = this.f;
                androidx.sqlite.db.d.c c3;
                if (f != null) {
                    c3 = new c2(c2, f, this.g);
                }
                else {
                    c3 = c2;
                }
                final Context c4 = this.c;
                final n0 n4 = new n0(c4, this.b, c3, this.s, this.d, this.l, this.m.d(c4), this.i, this.j, this.n, this.o, this.p, this.t, this.v, this.w, this.x, this.e, this.h);
                final r2 r2 = o2.b(this.a, "_Impl");
                r2.v(n4);
                return (T)r2;
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        
        @j0
        public a<T> f(@j0 final String v) {
            this.v = v;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public a<T> g(@j0 final String v, @j0 final e e) {
            this.e = e;
            this.v = v;
            return this;
        }
        
        @j0
        public a<T> h(@j0 final File w) {
            this.w = w;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle", "StreamFiles" })
        @j0
        public a<T> i(@j0 final File w, @j0 final e e) {
            this.e = e;
            this.w = w;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @j0
        public a<T> j(@j0 final Callable<InputStream> x) {
            this.x = x;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle", "LambdaLast" })
        @j0
        public a<T> k(@j0 final Callable<InputStream> x, @j0 final e e) {
            this.e = e;
            this.x = x;
            return this;
        }
        
        @j0
        public a<T> l() {
            this.n = (this.b != null);
            return this;
        }
        
        @j0
        public a<T> m() {
            this.o = false;
            this.p = true;
            return this;
        }
        
        @j0
        public a<T> n(final int... array) {
            if (this.t == null) {
                this.t = new HashSet<Integer>(array.length);
            }
            for (int length = array.length, i = 0; i < length; ++i) {
                this.t.add(array[i]);
            }
            return this;
        }
        
        @j0
        public a<T> o() {
            this.o = true;
            this.p = true;
            return this;
        }
        
        @j0
        public a<T> p(@k0 final androidx.sqlite.db.d.c k) {
            this.k = k;
            return this;
        }
        
        @j0
        @v0
        public a<T> q(@b0(from = 0L) final long q, @j0 final TimeUnit r) {
            if (q >= 0L) {
                this.q = q;
                this.r = r;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
        }
        
        @j0
        public a<T> r(@j0 final c m) {
            this.m = m;
            return this;
        }
        
        @j0
        public a<T> s(@j0 final f f, @j0 final Executor g) {
            this.f = f;
            this.g = g;
            return this;
        }
        
        @j0
        public a<T> t(@j0 final Executor i) {
            this.i = i;
            return this;
        }
        
        @j0
        public a<T> u(@j0 final Executor j) {
            this.j = j;
            return this;
        }
    }
    
    public abstract static class b
    {
        public void a(@j0 final androidx.sqlite.db.c c) {
        }
        
        public void b(@j0 final androidx.sqlite.db.c c) {
        }
        
        public void c(@j0 final androidx.sqlite.db.c c) {
        }
    }
    
    public enum c
    {
        G, 
        H, 
        @androidx.annotation.p0(16)
        I;
        
        private static boolean b(@j0 final ActivityManager activityManager) {
            return Build$VERSION.SDK_INT >= 19 && activityManager.isLowRamDevice();
        }
        
        @SuppressLint({ "NewApi" })
        c d(final Context context) {
            if (this != c.G) {
                return this;
            }
            if (Build$VERSION.SDK_INT >= 16) {
                final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
                if (activityManager != null && !b(activityManager)) {
                    return c.I;
                }
            }
            return c.H;
        }
    }
    
    public static class d
    {
        private HashMap<Integer, TreeMap<Integer, e1.c>> a;
        
        public d() {
            this.a = new HashMap<Integer, TreeMap<Integer, e1.c>>();
        }
        
        private void a(final e1.c c) {
            final int a = c.a;
            final int b = c.b;
            TreeMap<Integer, e1.c> value;
            if ((value = this.a.get(a)) == null) {
                value = new TreeMap<Integer, e1.c>();
                this.a.put(a, value);
            }
            final e1.c obj = value.get(b);
            if (obj != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(obj);
                sb.append(" with ");
                sb.append(c);
                Log.w("ROOM", sb.toString());
            }
            value.put(b, c);
        }
        
        private List<e1.c> d(final List<e1.c> list, final boolean b, int i, final int n) {
            int j;
        Label_0200:
            do {
                if (b) {
                    if (i >= n) {
                        return list;
                    }
                }
                else if (i <= n) {
                    return list;
                }
                final TreeMap<Integer, e1.c> treeMap = this.a.get(i);
                if (treeMap == null) {
                    return null;
                }
                Set<Integer> set;
                if (b) {
                    set = treeMap.descendingKeySet();
                }
                else {
                    set = treeMap.keySet();
                }
                final Iterator<Integer> iterator = set.iterator();
                int k;
                int n2;
                int intValue;
                do {
                    final boolean hasNext = iterator.hasNext();
                    n2 = 1;
                    final int n3 = 0;
                    if (!hasNext) {
                        j = 0;
                        continue Label_0200;
                    }
                    intValue = iterator.next();
                    if (b) {
                        k = n3;
                        if (intValue > n) {
                            continue;
                        }
                        k = n3;
                        if (intValue <= i) {
                            continue;
                        }
                    }
                    else {
                        k = n3;
                        if (intValue < n) {
                            continue;
                        }
                        k = n3;
                        if (intValue >= i) {
                            continue;
                        }
                    }
                    k = 1;
                } while (k == 0);
                list.add(treeMap.get(intValue));
                i = intValue;
                j = n2;
            } while (j != 0);
            return null;
        }
        
        public void b(@j0 final e1.c... array) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a(array[i]);
            }
        }
        
        @k0
        public List<e1.c> c(final int n, final int n2) {
            if (n == n2) {
                return Collections.emptyList();
            }
            return this.d(new ArrayList<e1.c>(), n2 > n, n, n2);
        }
    }
    
    public abstract static class e
    {
        public void a(@j0 final androidx.sqlite.db.c c) {
        }
    }
    
    public interface f
    {
        void a(@j0 final String p0, @j0 final List<Object> p1);
    }
}
