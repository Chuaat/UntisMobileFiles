// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CountDownLatch;
import io.realm.log.RealmLog;
import java.util.Arrays;
import java.util.Iterator;
import io.realm.internal.async.d;
import java.util.concurrent.ThreadPoolExecutor;
import io.realm.internal.async.c;
import java.util.concurrent.Future;
import io.realm.internal.RealmNotifier;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.internal.OsRealmConfig;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import io.realm.exceptions.RealmFileException;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Util;
import io.realm.internal.l;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import io.realm.internal.OsSharedRealm;
import b6.a;
import java.util.Map;
import java.util.Collection;
import java.lang.ref.WeakReference;
import java.util.List;

final class h0
{
    private static final String e = "Realm instances cannot be loaded asynchronously on a non-looper thread.";
    private static final String f = "The callback cannot be null.";
    private static final List<WeakReference<h0>> g;
    private static final Collection<h0> h;
    private static final String i = "Wrong key used to decrypt Realm.";
    private static final String j = "The type of Realm class must be Realm or DynamicRealm.";
    private final Map<a<f, OsSharedRealm.a>, g> a;
    private final String b;
    private j0 c;
    private final AtomicBoolean d;
    
    static {
        g = new ArrayList<WeakReference<h0>>();
        h = new ConcurrentLinkedQueue<h0>();
    }
    
    private h0(final String b) {
        this.a = new HashMap<a<f, OsSharedRealm.a>, g>();
        this.d = new AtomicBoolean(false);
        this.b = b;
    }
    
    private static void b(final j0 j0) {
        File file;
        if (j0.t()) {
            file = new File(j0.n(), j0.o());
        }
        else {
            file = null;
        }
        final String f = l.c(j0.y()).f(j0);
        final boolean b = Util.k(f) ^ true;
        if (file != null || b) {
            OsObjectStore.a(j0, new Runnable() {
                @Override
                public void run() {
                    if (file != null) {
                        c(j0.d(), file);
                    }
                    if (b) {
                        c(f, new File(l.c(j0.y()).g(j0)));
                    }
                }
            });
        }
    }
    
    private static void c(String s, File file) {
        if (file.exists()) {
            return;
        }
        final File file2 = null;
        Object access_ERROR = null;
        final String s2 = null;
        Label_0258: {
            Throwable t = null;
            try {
                final InputStream open = io.realm.a.T.getAssets().open(s);
                if (open == null) {
                    access_ERROR = RealmFileException.Kind.ACCESS_ERROR;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid input stream to the asset file: ");
                    sb.append(s);
                    throw new RealmFileException((RealmFileException.Kind)access_ERROR, sb.toString());
                }
                try {
                    access_ERROR = new FileOutputStream(file);
                    try {
                        final byte[] array = new byte[4096];
                        while (true) {
                            final int read = open.read(array);
                            if (read <= -1) {
                                break;
                            }
                            ((FileOutputStream)access_ERROR).write(array, 0, read);
                        }
                        try {
                            open.close();
                            s = s2;
                        }
                        catch (IOException ex) {}
                        Object o;
                        try {
                            ((FileOutputStream)access_ERROR).close();
                            o = s;
                        }
                        catch (IOException access_ERROR) {
                            o = s;
                            if (s == null) {
                                o = access_ERROR;
                            }
                        }
                        if (o == null) {
                            return;
                        }
                        throw new RealmFileException(RealmFileException.Kind.ACCESS_ERROR, (Throwable)o);
                    }
                    catch (IOException ex2) {}
                }
                catch (IOException ex3) {
                    access_ERROR = null;
                }
                finally {
                    access_ERROR = null;
                }
            }
            catch (IOException t) {
                access_ERROR = null;
                file = file2;
            }
            finally {
                t = null;
                file = (File)access_ERROR;
                access_ERROR = t;
                break Label_0258;
            }
            try {
                final RealmFileException.Kind access_ERROR2 = RealmFileException.Kind.ACCESS_ERROR;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not resolve the path to the asset file: ");
                sb2.append(s);
                throw new RealmFileException(access_ERROR2, sb2.toString(), t);
            }
            finally {}
        }
        if (file != null) {
            try {
                ((InputStream)file).close();
            }
            catch (IOException ex4) {}
        }
        Label_0278: {
            if (access_ERROR == null) {
                break Label_0278;
            }
            try {
                ((FileOutputStream)access_ERROR).close();
                throw s;
            }
            catch (IOException ex5) {
                throw s;
            }
        }
    }
    
    private <E extends io.realm.a> void d(final Class<E> clazz, final g g, final OsSharedRealm.a a) {
        io.realm.a a2;
        if (clazz == f0.class) {
            a2 = f0.a1(this, a);
            a2.H().f();
        }
        else {
            if (clazz != j.class) {
                throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
            }
            a2 = io.realm.j.f0(this, a);
        }
        g.g(a2);
    }
    
    static <E extends io.realm.a> E e(final j0 j0, final Class<E> clazz) {
        return k(j0.m(), true).h(j0, clazz, OsSharedRealm.a.I);
    }
    
    static <E extends io.realm.a> E f(final j0 j0, final Class<E> clazz, final OsSharedRealm.a a) {
        return (E)k(j0.m(), true).h(j0, (Class<io.realm.a>)clazz, a);
    }
    
    static <T extends io.realm.a> g0 g(final j0 j0, final io.realm.a.g<T> g, final Class<T> clazz) {
        return k(j0.m(), true).i(j0, (io.realm.a.g<io.realm.a>)g, (Class<io.realm.a>)clazz);
    }
    
    private <E extends io.realm.a> E h(final j0 c, final Class<E> clazz, final OsSharedRealm.a a) {
        synchronized (this) {
            final g n = this.n(clazz, a);
            final boolean b = this.o() == 0;
            final boolean z = c.z();
            if (b) {
                b(c);
                if (c.y() && (z ^ true)) {
                    l.e().k(new OsRealmConfig.b(c).b());
                    l.e().b(c);
                }
                this.c = c;
            }
            else {
                this.u(c);
            }
            if (!n.e()) {
                this.d(clazz, n, a);
            }
            n.f(1);
            return (E)n.c();
        }
    }
    
    private <T extends io.realm.a> g0 i(final j0 j0, final io.realm.a.g<T> g, final Class<T> clazz) {
        synchronized (this) {
            final io.realm.internal.android.a a = new io.realm.internal.android.a();
            a.c("Realm instances cannot be loaded asynchronously on a non-looper thread.");
            if (g != null) {
                final d d = new d<Object>(new AndroidRealmNotifier(null, a), j0, (io.realm.a.g<io.realm.a>)g, (Class<io.realm.a>)clazz);
                final io.realm.internal.async.d u = io.realm.a.U;
                final Future<?> g2 = u.g(d);
                d.f(g2);
                l.e().a(j0);
                return new io.realm.internal.async.c(g2, u);
            }
            throw new IllegalArgumentException("The callback cannot be null.");
        }
    }
    
    private void j(final c c) {
        synchronized (this) {
            c.a(this.o());
        }
    }
    
    private static h0 k(final String anObject, final boolean b) {
        final List<WeakReference<h0>> g = h0.g;
        synchronized (g) {
            final Iterator<WeakReference<h0>> iterator = g.iterator();
            h0 h0 = null;
            while (iterator.hasNext()) {
                final h0 h2 = iterator.next().get();
                if (h2 == null) {
                    iterator.remove();
                }
                else {
                    if (!h2.b.equals(anObject)) {
                        continue;
                    }
                    h0 = h2;
                }
            }
            h0 referent;
            if ((referent = h0) == null) {
                referent = h0;
                if (b) {
                    referent = new h0(anObject);
                    io.realm.h0.g.add(new WeakReference<h0>(referent));
                }
            }
            return referent;
        }
    }
    
    static int m(final j0 j0) {
        final String m = j0.m();
        int n = 0;
        final h0 k = k(m, false);
        if (k == null) {
            return 0;
        }
        final Iterator<g> iterator = k.a.values().iterator();
        while (iterator.hasNext()) {
            n += iterator.next().d();
        }
        return n;
    }
    
    private <E extends io.realm.a> g n(final Class<E> clazz, final OsSharedRealm.a a) {
        final a<f, OsSharedRealm.a> a2 = new a<f, OsSharedRealm.a>(h0.f.b(clazz), a);
        Object o;
        if ((o = this.a.get(a2)) == null) {
            if (a.equals(OsSharedRealm.a.I)) {
                o = new h();
            }
            else {
                o = new e();
            }
            this.a.put(a2, (g)o);
        }
        return (g)o;
    }
    
    private int o() {
        final Iterator<g> iterator = this.a.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().b();
        }
        return n;
    }
    
    private int p() {
        final Iterator<g> iterator = this.a.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final g g = iterator.next();
            if (g instanceof h) {
                n += g.b();
            }
        }
        return n;
    }
    
    static void q(final j0 j0, final c c) {
        synchronized (h0.g) {
            final h0 k = k(j0.m(), false);
            if (k == null) {
                c.a(0);
                return;
            }
            k.j(c);
        }
    }
    
    private void u(final j0 obj) {
        if (this.c.equals(obj)) {
            return;
        }
        if (!Arrays.equals(this.c.g(), obj.g())) {
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
        final m0 k = obj.k();
        final m0 i = this.c.k();
        if (i != null && k != null && i.getClass().equals(k.getClass()) && !k.equals(i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: ");
            sb.append(obj.k().getClass().getCanonicalName());
            throw new IllegalArgumentException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Configurations cannot be different if used to open the same file. \nCached configuration: \n");
        sb2.append(this.c);
        sb2.append("\n\nNew configuration: \n");
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public j0 l() {
        return this.c;
    }
    
    void r(final b b) {
        synchronized (this) {
            b.a();
        }
    }
    
    void s() {
        if (!this.d.getAndSet(true)) {
            h0.h.add(this);
        }
    }
    
    void t(final io.realm.a a) {
        synchronized (this) {
            final String path = a.getPath();
            final Class<? extends io.realm.a> class1 = a.getClass();
            OsSharedRealm.a a2;
            if (a.N()) {
                a2 = a.K.getVersionID();
            }
            else {
                a2 = OsSharedRealm.a.I;
            }
            final g n = this.n(class1, a2);
            int d = n.d();
            if (d <= 0) {
                RealmLog.w("%s has been closed already. refCount is %s", path, d);
                return;
            }
            if (--d == 0) {
                n.a();
                a.t();
                if (this.p() == 0) {
                    this.c = null;
                    for (final g g : this.a.values()) {
                        if (g instanceof e) {
                            final io.realm.a c = g.c();
                            if (c == null) {
                                continue;
                            }
                            while (!c.isClosed()) {
                                c.close();
                            }
                        }
                    }
                    l.c(a.D().y()).i(a.D());
                }
            }
            else {
                n.h(d);
            }
        }
    }
    
    interface b
    {
        void a();
    }
    
    interface c
    {
        void a(final int p0);
    }
    
    private static class d<T extends io.realm.a> implements Runnable
    {
        private final j0 G;
        private final io.realm.a.g<T> H;
        private final Class<T> I;
        private final CountDownLatch J;
        private final RealmNotifier K;
        private Future L;
        
        d(final RealmNotifier k, final j0 g, final io.realm.a.g<T> h, final Class<T> i) {
            this.J = new CountDownLatch(1);
            this.G = g;
            this.I = i;
            this.H = h;
            this.K = k;
        }
        
        public void f(final Future l) {
            this.L = l;
        }
        
        @Override
        public void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_1       
            //     2: aconst_null    
            //     3: astore_2       
            //     4: aload_0        
            //     5: getfield        io/realm/h0$d.G:Lio/realm/j0;
            //     8: aload_0        
            //     9: getfield        io/realm/h0$d.I:Ljava/lang/Class;
            //    12: invokestatic    io/realm/h0.e:(Lio/realm/j0;Ljava/lang/Class;)Lio/realm/a;
            //    15: astore_3       
            //    16: aload_3        
            //    17: astore_2       
            //    18: aload_3        
            //    19: astore_1       
            //    20: aload_0        
            //    21: getfield        io/realm/h0$d.K:Lio/realm/internal/RealmNotifier;
            //    24: astore          4
            //    26: aload_3        
            //    27: astore_2       
            //    28: aload_3        
            //    29: astore_1       
            //    30: new             Lio/realm/h0$d$a;
            //    33: astore          5
            //    35: aload_3        
            //    36: astore_2       
            //    37: aload_3        
            //    38: astore_1       
            //    39: aload           5
            //    41: aload_0        
            //    42: invokespecial   io/realm/h0$d$a.<init>:(Lio/realm/h0$d;)V
            //    45: aload_3        
            //    46: astore_2       
            //    47: aload_3        
            //    48: astore_1       
            //    49: aload           4
            //    51: aload           5
            //    53: invokevirtual   io/realm/internal/RealmNotifier.post:(Ljava/lang/Runnable;)Z
            //    56: ifne            70
            //    59: aload_3        
            //    60: astore_2       
            //    61: aload_3        
            //    62: astore_1       
            //    63: aload_0        
            //    64: getfield        io/realm/h0$d.J:Ljava/util/concurrent/CountDownLatch;
            //    67: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
            //    70: aload_3        
            //    71: astore_2       
            //    72: aload_3        
            //    73: astore_1       
            //    74: aload_0        
            //    75: getfield        io/realm/h0$d.J:Ljava/util/concurrent/CountDownLatch;
            //    78: ldc2_w          2
            //    81: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
            //    84: invokevirtual   java/util/concurrent/CountDownLatch.await:(JLjava/util/concurrent/TimeUnit;)Z
            //    87: ifne            103
            //    90: aload_3        
            //    91: astore_2       
            //    92: aload_3        
            //    93: astore_1       
            //    94: ldc             "Timeout for creating Realm instance in foreground thread in `CreateRealmRunnable` "
            //    96: iconst_0       
            //    97: anewarray       Ljava/lang/Object;
            //   100: invokestatic    io/realm/log/RealmLog.w:(Ljava/lang/String;[Ljava/lang/Object;)V
            //   103: aload_3        
            //   104: ifnull          203
            //   107: aload_3        
            //   108: astore_2       
            //   109: goto            199
            //   112: astore          5
            //   114: aload_2        
            //   115: astore_3       
            //   116: invokestatic    io/realm/internal/l.e:()Lio/realm/internal/l;
            //   119: aload           5
            //   121: invokevirtual   io/realm/internal/l.j:(Ljava/lang/Throwable;)Z
            //   124: ifne            173
            //   127: aload_2        
            //   128: astore_3       
            //   129: aload           5
            //   131: ldc             "`CreateRealmRunnable` failed."
            //   133: iconst_0       
            //   134: anewarray       Ljava/lang/Object;
            //   137: invokestatic    io/realm/log/RealmLog.h:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
            //   140: aload_2        
            //   141: astore_3       
            //   142: aload_0        
            //   143: getfield        io/realm/h0$d.K:Lio/realm/internal/RealmNotifier;
            //   146: astore_1       
            //   147: aload_2        
            //   148: astore_3       
            //   149: new             Lio/realm/h0$d$b;
            //   152: astore          4
            //   154: aload_2        
            //   155: astore_3       
            //   156: aload           4
            //   158: aload_0        
            //   159: aload           5
            //   161: invokespecial   io/realm/h0$d$b.<init>:(Lio/realm/h0$d;Ljava/lang/Throwable;)V
            //   164: aload_2        
            //   165: astore_3       
            //   166: aload_1        
            //   167: aload           4
            //   169: invokevirtual   io/realm/internal/RealmNotifier.post:(Ljava/lang/Runnable;)Z
            //   172: pop            
            //   173: aload_2        
            //   174: ifnull          203
            //   177: goto            199
            //   180: astore_2       
            //   181: aload_1        
            //   182: astore_3       
            //   183: aload_2        
            //   184: ldc             "`CreateRealmRunnable` has been interrupted."
            //   186: iconst_0       
            //   187: anewarray       Ljava/lang/Object;
            //   190: invokestatic    io/realm/log/RealmLog.y:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
            //   193: aload_1        
            //   194: ifnull          203
            //   197: aload_1        
            //   198: astore_2       
            //   199: aload_2        
            //   200: invokevirtual   io/realm/a.close:()V
            //   203: return         
            //   204: astore_2       
            //   205: aload_3        
            //   206: ifnull          213
            //   209: aload_3        
            //   210: invokevirtual   io/realm/a.close:()V
            //   213: aload_2        
            //   214: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                            
            //  -----  -----  -----  -----  --------------------------------
            //  4      16     180    199    Ljava/lang/InterruptedException;
            //  4      16     112    180    Any
            //  20     26     180    199    Ljava/lang/InterruptedException;
            //  20     26     112    180    Any
            //  30     35     180    199    Ljava/lang/InterruptedException;
            //  30     35     112    180    Any
            //  39     45     180    199    Ljava/lang/InterruptedException;
            //  39     45     112    180    Any
            //  49     59     180    199    Ljava/lang/InterruptedException;
            //  49     59     112    180    Any
            //  63     70     180    199    Ljava/lang/InterruptedException;
            //  63     70     112    180    Any
            //  74     90     180    199    Ljava/lang/InterruptedException;
            //  74     90     112    180    Any
            //  94     103    180    199    Ljava/lang/InterruptedException;
            //  94     103    112    180    Any
            //  116    127    204    215    Any
            //  129    140    204    215    Any
            //  142    147    204    215    Any
            //  149    154    204    215    Any
            //  156    164    204    215    Any
            //  166    173    204    215    Any
            //  183    193    204    215    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0173:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
    }
    
    private static class e extends g
    {
        private io.realm.a c;
        
        public void a() {
            final String path = this.c.getPath();
            super.a.set(null);
            this.c = null;
            if (super.b.decrementAndGet() >= 0) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Global reference counter of Realm");
            sb.append(path);
            sb.append(" not be negative.");
            throw new IllegalStateException(sb.toString());
        }
        
        @Override
        io.realm.a c() {
            return this.c;
        }
        
        @Override
        int d() {
            return super.b.get();
        }
        
        @Override
        boolean e() {
            return this.c != null;
        }
        
        @Override
        void g(final io.realm.a c) {
            this.c = c;
            super.a.set(0);
            super.b.incrementAndGet();
        }
    }
    
    private enum f
    {
        G, 
        H;
        
        static f b(final Class<? extends io.realm.a> clazz) {
            if (clazz == f0.class) {
                return f.G;
            }
            if (clazz == j.class) {
                return f.H;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }
    
    private abstract static class g
    {
        protected final ThreadLocal<Integer> a;
        protected AtomicInteger b;
        
        private g() {
            this.a = new ThreadLocal<Integer>();
            this.b = new AtomicInteger(0);
        }
        
        abstract void a();
        
        public int b() {
            return this.b.get();
        }
        
        abstract io.realm.a c();
        
        abstract int d();
        
        abstract boolean e();
        
        public void f(final int n) {
            final Integer n2 = this.a.get();
            final ThreadLocal<Integer> a = this.a;
            int i = n;
            if (n2 != null) {
                i = n + n2;
            }
            a.set(i);
        }
        
        abstract void g(final io.realm.a p0);
        
        public void h(final int i) {
            this.a.set(i);
        }
    }
    
    private static class h extends g
    {
        private final ThreadLocal<io.realm.a> c;
        
        private h() {
            this.c = new ThreadLocal<io.realm.a>();
        }
        
        public void a() {
            final String path = this.c.get().getPath();
            super.a.set(null);
            this.c.set(null);
            if (super.b.decrementAndGet() >= 0) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Global reference counter of Realm");
            sb.append(path);
            sb.append(" can not be negative.");
            throw new IllegalStateException(sb.toString());
        }
        
        public io.realm.a c() {
            return this.c.get();
        }
        
        public int d() {
            final Integer n = super.a.get();
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            return intValue;
        }
        
        public boolean e() {
            return this.c.get() != null;
        }
        
        public void g(final io.realm.a value) {
            this.c.set(value);
            super.a.set(0);
            super.b.incrementAndGet();
        }
    }
}
