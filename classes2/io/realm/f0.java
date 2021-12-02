// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.r;
import io.realm.internal.OsObject;
import java.io.Closeable;
import io.realm.internal.OsObjectStore;
import java.util.Collections;
import io.realm.internal.async.d;
import java.util.concurrent.ThreadPoolExecutor;
import io.realm.internal.async.c;
import io.realm.internal.RealmNotifier;
import org.json.JSONArray;
import java.io.IOException;
import java.io.Reader;
import android.util.JsonReader;
import java.io.InputStreamReader;
import io.realm.log.RealmLog;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.Util;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Scanner;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import io.realm.exceptions.RealmException;
import android.os.SystemClock;
import io.realm.internal.OsSchemaInfo;
import java.io.FileNotFoundException;
import c6.h;
import java.util.Map;
import java.io.File;
import io.realm.internal.l;
import io.realm.internal.o;
import android.content.Context;
import java.util.Iterator;
import io.realm.internal.q;
import io.realm.exceptions.RealmMigrationNeededException;
import java.util.Locale;
import io.realm.internal.Table;
import io.realm.internal.b;
import io.realm.internal.OsSharedRealm;

public class f0 extends io.realm.a
{
    private static final String Y = "A non-null RealmConfiguration must be provided";
    public static final String Z = "default.realm";
    public static final int a0 = 64;
    private static final Object b0;
    private static j0 c0;
    private final t0 X;
    
    static {
        b0 = new Object();
    }
    
    private f0(final h0 h0, final OsSharedRealm.a a) {
        super(h0, Z0(h0.l().r()), a);
        this.X = new p(this, new io.realm.internal.b(super.I.r(), super.K.getSchemaInfo()));
        if (super.I.w()) {
            final q r = super.I.r();
            final Iterator<Class<? extends n0>> iterator = r.j().iterator();
            while (iterator.hasNext()) {
                final String q = Table.Q(r.l(iterator.next()));
                if (super.K.hasTable(q)) {
                    continue;
                }
                super.K.close();
                throw new RealmMigrationNeededException(super.I.m(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.A(q)));
            }
        }
    }
    
    private f0(final OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.X = new p(this, new io.realm.internal.b(super.I.r(), osSharedRealm.getSchemaInfo()));
    }
    
    private static void A2(final Context t, final String s) {
        if (io.realm.a.T == null) {
            if (t == null) {
                throw new IllegalArgumentException("Non-null context required.");
            }
            e0(t);
            o.c(t);
            a3(new j0.a(t).e());
            l.e().h(t, s);
            if (t.getApplicationContext() != null) {
                io.realm.a.T = t.getApplicationContext();
            }
            else {
                io.realm.a.T = t;
            }
            OsSharedRealm.initialize(new File(t.getFilesDir(), ".realm.temp"));
        }
    }
    
    private <E extends n0> E Q0(final E e, final int n, final Map<n0, io.realm.internal.p.a<n0>> map) {
        this.h();
        return super.I.r().d(e, n, map);
    }
    
    public static void R(final j0 j0, @c6.h final m0 m0) throws FileNotFoundException {
        io.realm.a.R(j0, m0);
    }
    
    public static void S2(final j0 j0) throws FileNotFoundException {
        R(j0, null);
    }
    
    private static OsSchemaInfo Z0(final q q) {
        return new OsSchemaInfo(q.g().values());
    }
    
    public static void Z2() {
        synchronized (f0.b0) {
            f0.c0 = null;
        }
    }
    
    static f0 a1(final h0 h0, final OsSharedRealm.a a) {
        return new f0(h0, a);
    }
    
    public static void a3(final j0 c0) {
        if (c0 != null) {
            synchronized (f0.b0) {
                f0.c0 = c0;
                return;
            }
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }
    
    @c6.h
    public static Context c2() {
        return io.realm.a.T;
    }
    
    static f0 d1(final OsSharedRealm osSharedRealm) {
        return new f0(osSharedRealm);
    }
    
    private static void e0(final Context context) {
        final File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            }
            try {
                filesDir.mkdirs();
            }
            catch (SecurityException ex) {}
        }
        if (filesDir == null || !filesDir.exists()) {
            long n = 0L;
            int n2 = -1;
            while (context.getFilesDir() == null || !context.getFilesDir().exists()) {
                final long n3 = (new long[] { 1L, 2L, 5L, 10L, 16L })[Math.min(++n2, 4)];
                SystemClock.sleep(n3);
                if ((n += n3) > 200L) {
                    break;
                }
            }
        }
        if (context.getFilesDir() != null && context.getFilesDir().exists()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Context.getFilesDir() returns ");
        sb.append(context.getFilesDir());
        sb.append(" which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        throw new IllegalStateException(sb.toString());
    }
    
    private void f0(final Class<? extends n0> clazz) {
        if (super.K.getSchemaInfo().b(super.I.r().l(clazz)).d() != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("A RealmObject with no @PrimaryKey cannot be updated: ");
        sb.append(clazz.toString());
        throw new IllegalArgumentException(sb.toString());
    }
    
    @c6.h
    public static j0 f2() {
        synchronized (f0.b0) {
            return f0.c0;
        }
    }
    
    private void g0(final int i) {
        if (i >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("maxDepth must be > 0. It was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private <E extends n0> void h0(final E e) {
        if (e != null) {
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
    }
    
    private <E extends n0> void i0(final E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
        }
        if (!p0.j8(e) || !p0.k8(e)) {
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        if (!(e instanceof k)) {
            return;
        }
        throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
    }
    
    public static f0 j2() {
        final j0 f2 = f2();
        if (f2 != null) {
            return h0.e(f2, f0.class);
        }
        if (io.realm.a.T == null) {
            throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
        }
        throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
    }
    
    @c6.h
    public static Object k2() {
        try {
            final Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        }
        catch (IllegalAccessException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not create an instance of ");
            sb.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb.toString(), ex);
        }
        catch (InstantiationException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not create an instance of ");
            sb2.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb2.toString(), ex2);
        }
        catch (InvocationTargetException ex3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not create an instance of ");
            sb3.append("io.realm.DefaultRealmModule");
            throw new RealmException(sb3.toString(), ex3);
        }
        catch (ClassNotFoundException ex4) {
            return null;
        }
    }
    
    public static boolean o(final j0 j0) {
        return io.realm.a.o(j0);
    }
    
    private Scanner o2(final InputStream source) {
        return new Scanner(source, "UTF-8").useDelimiter("\\A");
    }
    
    public static int p2(final j0 j0) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        h0.q(j0, (h0.c)new h0.c() {
            @Override
            public void a(final int newValue) {
                atomicInteger.set(newValue);
            }
        });
        return atomicInteger.get();
    }
    
    public static f0 q2(final j0 j0) {
        if (j0 != null) {
            return h0.e(j0, f0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }
    
    public static g0 r2(final j0 j0, final c c) {
        if (j0 != null) {
            return h0.g(j0, c, f0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }
    
    public static boolean s(final j0 j0) {
        return io.realm.a.s(j0);
    }
    
    public static int u2(final j0 j0) {
        return h0.m(j0);
    }
    
    private <E extends n0> E w0(final E e, final boolean b, final Map<n0, io.realm.internal.p> map, final Set<io.realm.q> set) {
        this.h();
        if (this.Q()) {
            if (!super.I.r().r(Util.g(e.getClass()))) {
                try {
                    return super.I.r().b(this, e, b, map, set);
                }
                catch (IllegalStateException ex) {
                    if (ex.getMessage().startsWith("Attempting to create an object of type")) {
                        throw new RealmPrimaryKeyConstraintException(ex.getMessage());
                    }
                    throw ex;
                }
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }
    
    public static void z2(final Context context) {
        synchronized (f0.class) {
            A2(context, "");
        }
    }
    
    public <E extends n0> E B1(final Class<E> clazz, final InputStream inputStream) {
        Scanner o2 = null;
        if (clazz != null) {
            if (inputStream != null) {
                this.h();
                this.f0(clazz);
                try {
                    try {
                        final Scanner scanner = o2 = (o2 = this.o2(inputStream));
                        final JSONObject jsonObject = new JSONObject(scanner.next());
                        o2 = scanner;
                        final n0 f1 = this.F1(clazz, jsonObject);
                        scanner.close();
                        return (E)f1;
                    }
                    finally {
                        if (o2 != null) {
                            o2.close();
                        }
                    }
                }
                catch (JSONException ex) {}
            }
        }
        return null;
    }
    
    public <E extends n0> List<E> D0(final Iterable<E> iterable, final io.realm.q... array) {
        if (iterable == null) {
            return new ArrayList<E>();
        }
        ArrayList<n0> list;
        if (iterable instanceof Collection) {
            list = (ArrayList<n0>)new ArrayList<E>(((Collection<n0>)iterable).size());
        }
        else {
            list = (ArrayList<n0>)new ArrayList<E>();
        }
        final HashMap<n0, io.realm.internal.p> hashMap = new HashMap<n0, io.realm.internal.p>();
        for (final n0 n0 : iterable) {
            this.h0(n0);
            list.add(this.w0(n0, false, hashMap, Util.n(array)));
        }
        return (List<E>)list;
    }
    
    public <E extends n0> E E1(final Class<E> clazz, final String s) {
        if (clazz != null && s != null) {
            if (s.length() != 0) {
                this.h();
                this.f0(clazz);
                try {
                    return this.F1(clazz, new JSONObject(s));
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not create Json object from string", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public <E extends n0> E F1(final Class<E> clazz, final JSONObject jsonObject) {
        if (clazz != null) {
            if (jsonObject != null) {
                this.h();
                this.f0(clazz);
                try {
                    return super.I.r().e(clazz, this, jsonObject, true);
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not map JSON", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public <E extends n0> E G0(final E e, final io.realm.q... array) {
        this.h0(e);
        this.f0(e.getClass());
        return this.w0(e, true, new HashMap<n0, io.realm.internal.p>(), Util.n(array));
    }
    
    public void G1(final Class<? extends n0> clazz) {
        this.h();
        this.X.o(clazz).f();
    }
    
    public void G2(final n0 n0) {
        this.j();
        if (n0 != null) {
            super.I.r().n(this, n0, new HashMap<n0, Long>());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }
    
    @Override
    public t0 H() {
        return this.X;
    }
    
    public <E extends n0> List<E> H0(final Iterable<E> iterable, final io.realm.q... array) {
        if (iterable == null) {
            return new ArrayList<E>(0);
        }
        ArrayList<n0> list;
        if (iterable instanceof Collection) {
            list = (ArrayList<n0>)new ArrayList<E>(((Collection<n0>)iterable).size());
        }
        else {
            list = (ArrayList<n0>)new ArrayList<E>();
        }
        final HashMap<n0, io.realm.internal.p> hashMap = new HashMap<n0, io.realm.internal.p>();
        final Set<io.realm.q> n = Util.n(array);
        for (final n0 n2 : iterable) {
            this.h0(n2);
            list.add(this.w0(n2, true, hashMap, n));
        }
        return (List<E>)list;
    }
    
    public void H1(final d d) {
        if (d != null) {
            this.f();
            this.beginTransaction();
            try {
                d.a(this);
                this.n();
                return;
            }
            finally {
                if (this.Q()) {
                    this.d();
                }
                else {
                    RealmLog.w("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
            }
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }
    
    public g0 J1(final d d) {
        return this.P1(d, null, null);
    }
    
    public void K2(final Collection<? extends n0> collection) {
        this.j();
        if (collection == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        }
        if (collection.isEmpty()) {
            return;
        }
        super.I.r().o(this, collection);
    }
    
    public <E extends n0> void L0(final Class<E> clazz, InputStream in) throws IOException {
        if (clazz != null) {
            if (in != null) {
                this.h();
                in = (InputStream)new JsonReader((Reader)new InputStreamReader(in, "UTF-8"));
                try {
                    ((JsonReader)in).beginArray();
                    while (((JsonReader)in).hasNext()) {
                        super.I.r().f(clazz, this, (JsonReader)in);
                    }
                    ((JsonReader)in).endArray();
                }
                finally {
                    ((JsonReader)in).close();
                }
            }
        }
    }
    
    public g0 L1(final d d, final b b) {
        if (b != null) {
            return this.P1(d, null, b);
        }
        throw new IllegalArgumentException("onError callback can't be null");
    }
    
    @Override
    public boolean M() {
        this.h();
        for (final r0 r0 : this.X.i()) {
            if (!r0.l().startsWith("__") && r0.v().u0() > 0L) {
                return false;
            }
        }
        return true;
    }
    
    public <E extends n0> void M0(final Class<E> clazz, final String s) {
        if (clazz != null && s != null) {
            if (s.length() != 0) {
                try {
                    this.N0(clazz, new JSONArray(s));
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not create JSON array from string", (Throwable)ex);
                }
            }
        }
    }
    
    public g0 M1(final d d, final d.c c) {
        if (c != null) {
            return this.P1(d, c, null);
        }
        throw new IllegalArgumentException("onSuccess callback can't be null");
    }
    
    public <E extends n0> void N0(final Class<E> clazz, final JSONArray jsonArray) {
        if (clazz != null) {
            if (jsonArray != null) {
                this.h();
                int i = 0;
                while (i < jsonArray.length()) {
                    try {
                        super.I.r().e(clazz, this, jsonArray.getJSONObject(i), false);
                        ++i;
                        continue;
                    }
                    catch (JSONException ex) {
                        throw new RealmException("Could not map JSON", (Throwable)ex);
                    }
                    break;
                }
            }
        }
    }
    
    public void N2(final n0 n0) {
        this.j();
        if (n0 != null) {
            super.I.r().p(this, n0, new HashMap<n0, Long>());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }
    
    public void O2(final Collection<? extends n0> collection) {
        this.j();
        if (collection == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        }
        if (collection.isEmpty()) {
            return;
        }
        super.I.r().q(this, collection);
    }
    
    public g0 P1(final d d, @c6.h final d.c c, @c6.h final b b) {
        this.h();
        if (d == null) {
            throw new IllegalArgumentException("Transaction should not be null");
        }
        if (!this.N()) {
            final boolean a = super.K.capabilities.a();
            if (c != null || b != null) {
                super.K.capabilities.c("Callback cannot be delivered on current thread.");
            }
            final j0 d2 = this.D();
            final RealmNotifier realmNotifier = super.K.realmNotifier;
            final io.realm.internal.async.d u = io.realm.a.U;
            return new io.realm.internal.async.c(u.g(new Runnable() {
                @Override
                public void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     3: invokevirtual   java/lang/Thread.isInterrupted:()Z
                    //     6: ifeq            10
                    //     9: return         
                    //    10: aload_0        
                    //    11: getfield        io/realm/f0$a.G:Lio/realm/j0;
                    //    14: invokestatic    io/realm/f0.q2:(Lio/realm/j0;)Lio/realm/f0;
                    //    17: astore_1       
                    //    18: aload_1        
                    //    19: invokevirtual   io/realm/f0.beginTransaction:()V
                    //    22: aconst_null    
                    //    23: astore_2       
                    //    24: aload_0        
                    //    25: getfield        io/realm/f0$a.H:Lio/realm/f0$d;
                    //    28: aload_1        
                    //    29: invokeinterface io/realm/f0$d.a:(Lio/realm/f0;)V
                    //    34: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
                    //    37: invokevirtual   java/lang/Thread.isInterrupted:()Z
                    //    40: istore_3       
                    //    41: iload_3        
                    //    42: ifeq            68
                    //    45: aload_1        
                    //    46: invokevirtual   io/realm/f0.Q:()Z
                    //    49: ifeq            56
                    //    52: aload_1        
                    //    53: invokevirtual   io/realm/f0.d:()V
                    //    56: aload_1        
                    //    57: invokevirtual   io/realm/f0.close:()V
                    //    60: return         
                    //    61: astore_2       
                    //    62: aload_1        
                    //    63: invokevirtual   io/realm/f0.close:()V
                    //    66: aload_2        
                    //    67: athrow         
                    //    68: aload_1        
                    //    69: invokevirtual   io/realm/f0.n:()V
                    //    72: aload_1        
                    //    73: getfield        io/realm/a.K:Lio/realm/internal/OsSharedRealm;
                    //    76: invokevirtual   io/realm/internal/OsSharedRealm.getVersionID:()Lio/realm/internal/OsSharedRealm$a;
                    //    79: astore          4
                    //    81: aload_1        
                    //    82: invokevirtual   io/realm/f0.Q:()Z
                    //    85: ifeq            92
                    //    88: aload_1        
                    //    89: invokevirtual   io/realm/f0.d:()V
                    //    92: aload_1        
                    //    93: invokevirtual   io/realm/f0.close:()V
                    //    96: goto            125
                    //    99: astore_2       
                    //   100: aload_1        
                    //   101: invokevirtual   io/realm/f0.close:()V
                    //   104: aload_2        
                    //   105: athrow         
                    //   106: astore_2       
                    //   107: aload_1        
                    //   108: invokevirtual   io/realm/f0.Q:()Z
                    //   111: ifeq            118
                    //   114: aload_1        
                    //   115: invokevirtual   io/realm/f0.d:()V
                    //   118: aload_1        
                    //   119: invokevirtual   io/realm/f0.close:()V
                    //   122: aconst_null    
                    //   123: astore          4
                    //   125: aload_0        
                    //   126: getfield        io/realm/f0$a.I:Z
                    //   129: ifeq            189
                    //   132: aload           4
                    //   134: ifnull          165
                    //   137: aload_0        
                    //   138: getfield        io/realm/f0$a.J:Lio/realm/f0$d$c;
                    //   141: ifnull          165
                    //   144: aload_0        
                    //   145: getfield        io/realm/f0$a.K:Lio/realm/internal/RealmNotifier;
                    //   148: new             Lio/realm/f0$a$a;
                    //   151: dup            
                    //   152: aload_0        
                    //   153: aload           4
                    //   155: invokespecial   io/realm/f0$a$a.<init>:(Lio/realm/f0$a;Lio/realm/internal/OsSharedRealm$a;)V
                    //   158: invokevirtual   io/realm/internal/RealmNotifier.post:(Ljava/lang/Runnable;)Z
                    //   161: pop            
                    //   162: goto            193
                    //   165: aload_2        
                    //   166: ifnull          193
                    //   169: aload_0        
                    //   170: getfield        io/realm/f0$a.K:Lio/realm/internal/RealmNotifier;
                    //   173: new             Lio/realm/f0$a$b;
                    //   176: dup            
                    //   177: aload_0        
                    //   178: aload_2        
                    //   179: invokespecial   io/realm/f0$a$b.<init>:(Lio/realm/f0$a;Ljava/lang/Throwable;)V
                    //   182: invokevirtual   io/realm/internal/RealmNotifier.post:(Ljava/lang/Runnable;)Z
                    //   185: pop            
                    //   186: goto            193
                    //   189: aload_2        
                    //   190: ifnonnull       194
                    //   193: return         
                    //   194: new             Lio/realm/exceptions/RealmException;
                    //   197: dup            
                    //   198: ldc             "Async transaction failed"
                    //   200: aload_2        
                    //   201: invokespecial   io/realm/exceptions/RealmException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
                    //   204: athrow         
                    //   205: astore_2       
                    //   206: aload_1        
                    //   207: invokevirtual   io/realm/f0.close:()V
                    //   210: aload_2        
                    //   211: athrow         
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type
                    //  -----  -----  -----  -----  ----
                    //  24     41     106    125    Any
                    //  45     56     61     68     Any
                    //  68     81     106    125    Any
                    //  81     92     99     106    Any
                    //  107    118    205    212    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
                    //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
                    //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
                    //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
                    // 
                    throw new IllegalStateException("An error occurred while decompiling this method.");
                }
            }), u);
        }
        throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
    }
    
    public f0 Q1() {
        return h0.f(super.I, f0.class, super.K.getVersionID());
    }
    
    public void V2() {
        this.T();
    }
    
    public <E extends n0> E W0(final Class<E> clazz, final n0 n0, final String s) {
        this.h();
        Util.e(n0, "parentObject");
        Util.b(s, "parentProperty");
        if (p0.j8(n0) && p0.k8(n0)) {
            return super.I.r().s(clazz, this, this.F(this.X.m(clazz).l(), (io.realm.internal.p)n0, s, this.X, this.X.m(n0.getClass())), this.X.j(clazz), true, Collections.EMPTY_LIST);
        }
        throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
    }
    
    public void X2(final i0<f0> i0) {
        this.V((i0<io.realm.a>)i0);
    }
    
    @Override
    public io.reactivex.l<f0> c() {
        return super.I.q().f(this);
    }
    
    public void d0(final i0<f0> i0) {
        this.b((i0<io.realm.a>)i0);
    }
    
    public <E extends n0> E e1(final Class<E> clazz) {
        this.h();
        final q r = super.I.r();
        if (!r.r(clazz)) {
            return this.q1(clazz, true, Collections.emptyList());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  ");
        sb.append(r.l(clazz));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public <E extends n0> E f1(final Class<E> clazz, @c6.h final Object o) {
        this.h();
        final q r = super.I.r();
        if (!r.r(clazz)) {
            return this.p1(clazz, o, true, Collections.emptyList());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  ");
        sb.append(r.l(clazz));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public <E extends n0> RealmQuery<E> f3(final Class<E> clazz) {
        this.h();
        return RealmQuery.t(this, clazz);
    }
    
    @c6.h
    public <E extends n0> E g1(final Class<E> clazz, InputStream in) throws IOException {
        Closeable o2 = null;
        if (clazz != null) {
            if (in != null) {
                this.h();
                if (OsObjectStore.c(super.K, super.I.r().l(clazz)) != null) {
                    try {
                        try {
                            in = (InputStream)(o2 = (o2 = this.o2(in)));
                            final JSONObject jsonObject = new JSONObject(((Scanner)in).next());
                            o2 = in;
                            super.I.r().e(clazz, this, jsonObject, false);
                            ((Scanner)in).close();
                        }
                        finally {
                            if (o2 != null) {
                                ((Scanner)o2).close();
                            }
                        }
                    }
                    catch (JSONException ex) {}
                }
                in = (InputStream)new JsonReader((Reader)new InputStreamReader(in, "UTF-8"));
                try {
                    return super.I.r().f(clazz, this, (JsonReader)in);
                }
                finally {
                    ((JsonReader)in).close();
                }
            }
        }
        return null;
    }
    
    public <E extends n0> E j0(final E e) {
        return this.m0(e, Integer.MAX_VALUE);
    }
    
    @c6.h
    public <E extends n0> E k1(final Class<E> clazz, final String s) {
        if (clazz != null && s != null) {
            if (s.length() != 0) {
                try {
                    return this.o1(clazz, new JSONObject(s));
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not create Json object from string", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public <E extends n0> E m0(final E e, final int n) {
        this.g0(n);
        this.i0(e);
        return this.Q0(e, n, new HashMap<n0, io.realm.internal.p.a<n0>>());
    }
    
    @c6.h
    public <E extends n0> E o1(final Class<E> clazz, final JSONObject jsonObject) {
        if (clazz != null) {
            if (jsonObject != null) {
                this.h();
                try {
                    return super.I.r().e(clazz, this, jsonObject, false);
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not map JSON", (Throwable)ex);
                }
            }
        }
        return null;
    }
    
    public <E extends n0> List<E> p0(final Iterable<E> iterable) {
        return this.s0(iterable, Integer.MAX_VALUE);
    }
    
     <E extends n0> E p1(final Class<E> clazz, @c6.h final Object o, final boolean b, final List<String> list) {
        return super.I.r().s(clazz, this, OsObject.createWithPrimaryKey(this.X.o(clazz), o), this.X.j(clazz), b, list);
    }
    
     <E extends n0> E q1(final Class<E> clazz, final boolean b, final List<String> list) {
        final Table o = this.X.o(clazz);
        if (OsObjectStore.c(super.K, super.I.r().l(clazz)) == null) {
            return super.I.r().s(clazz, this, OsObject.create(o), this.X.j(clazz), b, list);
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key, use 'createObject(Class<E>, Object)' instead.", o.z()));
    }
    
    public <E extends n0> List<E> s0(final Iterable<E> iterable, final int n) {
        this.g0(n);
        if (iterable == null) {
            return new ArrayList<E>(0);
        }
        ArrayList<n0> list;
        if (iterable instanceof Collection) {
            list = (ArrayList<n0>)new ArrayList<E>(((Collection<n0>)iterable).size());
        }
        else {
            list = (ArrayList<n0>)new ArrayList<E>();
        }
        final HashMap<n0, io.realm.internal.p.a<n0>> hashMap = new HashMap<n0, io.realm.internal.p.a<n0>>();
        for (final n0 n2 : iterable) {
            this.i0(n2);
            list.add(this.Q0(n2, n, hashMap));
        }
        return (List<E>)list;
    }
    
    public <E extends n0> void t1(final Class<E> clazz, final InputStream inputStream) {
        if (clazz != null) {
            if (inputStream != null) {
                this.h();
                this.f0(clazz);
                Scanner o2 = null;
                try {
                    try {
                        final Scanner scanner = o2 = (o2 = this.o2(inputStream));
                        final JSONArray jsonArray = new JSONArray(scanner.next());
                        int n = 0;
                        while (true) {
                            o2 = scanner;
                            if (n >= jsonArray.length()) {
                                break;
                            }
                            o2 = scanner;
                            super.I.r().e(clazz, this, jsonArray.getJSONObject(n), true);
                            ++n;
                        }
                        scanner.close();
                    }
                    finally {
                        if (o2 != null) {
                            o2.close();
                        }
                    }
                }
                catch (JSONException ex) {}
            }
        }
    }
    
    public <E extends n0> void v1(final Class<E> clazz, final String s) {
        if (clazz != null && s != null) {
            if (s.length() != 0) {
                this.h();
                this.f0(clazz);
                try {
                    this.z1(clazz, new JSONArray(s));
                }
                catch (JSONException ex) {
                    throw new RealmException("Could not create JSON array from string", (Throwable)ex);
                }
            }
        }
    }
    
    Table x2(final Class<? extends n0> clazz) {
        return this.X.o(clazz);
    }
    
    public <E extends n0> E y0(final E e, final io.realm.q... array) {
        this.h0(e);
        return this.w0(e, false, new HashMap<n0, io.realm.internal.p>(), Util.n(array));
    }
    
    public <E extends n0> void z1(final Class<E> clazz, final JSONArray jsonArray) {
        if (clazz != null) {
            if (jsonArray != null) {
                this.h();
                this.f0(clazz);
                int i = 0;
                while (i < jsonArray.length()) {
                    try {
                        super.I.r().e(clazz, this, jsonArray.getJSONObject(i), true);
                        ++i;
                        continue;
                    }
                    catch (JSONException ex) {
                        throw new RealmException("Could not map JSON", (Throwable)ex);
                    }
                    break;
                }
            }
        }
    }
    
    public abstract static class c extends g<f0>
    {
        @Override
        public void a(final Throwable t) {
            super.a(t);
        }
        
        public abstract void c(final f0 p0);
    }
    
    public interface d
    {
        void a(final f0 p0);
        
        public static class a
        {
            public void a(final Exception ex) {
            }
            
            public void b() {
            }
        }
        
        public interface b
        {
            void b(final Throwable p0);
        }
        
        public interface c
        {
            void onSuccess();
        }
    }
}
