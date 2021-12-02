// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.async.d;
import java.util.concurrent.ThreadPoolExecutor;
import io.realm.internal.async.c;
import io.realm.internal.RealmNotifier;
import c6.h;
import io.realm.log.RealmLog;
import io.realm.internal.r;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObject;
import io.realm.internal.p;
import io.realm.exceptions.RealmException;
import java.util.Locale;
import io.realm.internal.Util;
import io.reactivex.l;
import java.io.File;
import io.realm.internal.Table;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;

public class j extends io.realm.a
{
    private final t0 X;
    
    private j(final h0 h0, final OsSharedRealm.a a) {
        super(h0, null, a);
        h0.q(h0.l(), (h0.c)new h0.c() {
            @Override
            public void a(final int n) {
                if (n > 0) {
                    return;
                }
                if (h0.l().w()) {
                    return;
                }
                if (OsObjectStore.d(j.this.K) != -1L) {
                    return;
                }
                j.this.K.beginTransaction();
                if (OsObjectStore.d(j.this.K) == -1L) {
                    OsObjectStore.f(j.this.K, -1L);
                }
                j.this.K.commitTransaction();
            }
        });
        this.X = new v(this);
    }
    
    private j(final OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.X = new v(this);
    }
    
    public static j G0(final j0 j0) {
        if (j0 != null) {
            return h0.e(j0, j.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }
    
    public static g0 H0(final j0 j0, final c c) {
        if (j0 != null) {
            return h0.g(j0, c, j.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }
    
    static j f0(final h0 h0, final OsSharedRealm.a a) {
        return new j(h0, a);
    }
    
    static j g0(final OsSharedRealm osSharedRealm) {
        return new j(osSharedRealm);
    }
    
    public j D0() {
        OsSharedRealm.a a;
        try {
            a = super.K.getVersionID();
        }
        catch (IllegalStateException ex) {
            this.K();
            a = super.K.getVersionID();
        }
        return h0.f(super.I, j.class, a);
    }
    
    @Override
    public t0 H() {
        return this.X;
    }
    
    public void L0() {
        this.T();
    }
    
    @Override
    public boolean M() {
        this.h();
        return super.K.isEmpty();
    }
    
    public void M0(final i0<j> i0) {
        this.V((i0<io.realm.a>)i0);
    }
    
    void N0(final long n) {
        OsObjectStore.f(super.K, n);
    }
    
    public RealmQuery<k> Q0(final String str) {
        this.h();
        if (super.K.hasTable(Table.Q(str))) {
            return RealmQuery.s(this, str);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Class does not exist in the Realm and cannot be queried: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public l<j> c() {
        return super.I.q().e(this);
    }
    
    public void d0(final i0<j> i0) {
        this.b((i0<io.realm.a>)i0);
    }
    
    public k e0(final String s, final k k, final String s2) {
        this.h();
        Util.e(k, "parentObject");
        Util.b(s2, "parentProperty");
        if (!p0.j8(k) || !p0.k8(k)) {
            throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
        }
        final String c = OsObjectStore.c(super.K, s);
        if (c != null) {
            throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', embedded objects cannot have primary keys.", s, c));
        }
        final String p3 = k.P8();
        final r0 h = this.X.h(p3);
        if (h != null) {
            return new k(this, this.F(s, k, s2, this.X, h));
        }
        throw new IllegalStateException(String.format("No schema found for '%s'.", p3));
    }
    
    public k h0(final String s) {
        this.h();
        final Table p = this.X.p(s);
        final String c = OsObjectStore.c(super.K, s);
        if (c == null) {
            return new k(this, CheckedRow.q(OsObject.create(p)));
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', use  'createObject(String, Object)' instead.", s, c));
    }
    
    public k i0(final String s, final Object o) {
        return new k(this, CheckedRow.q(OsObject.createWithPrimaryKey(this.X.p(s), o)));
    }
    
    public void j0(final String s) {
        this.h();
        this.g();
        this.X.p(s).f();
    }
    
    public void m0(final d d) {
        if (d != null) {
            this.f();
            this.beginTransaction();
            try {
                d.a(this);
                this.n();
                return;
            }
            catch (RuntimeException ex) {
                if (this.Q()) {
                    this.d();
                }
                else {
                    RealmLog.w("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw ex;
            }
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }
    
    public g0 p0(final d d) {
        return this.y0(d, null, null);
    }
    
    public g0 s0(final d d, final b b) {
        if (b != null) {
            return this.y0(d, null, b);
        }
        throw new IllegalArgumentException("onError callback can't be null");
    }
    
    public g0 w0(final d d, final d.c c) {
        if (c != null) {
            return this.y0(d, c, null);
        }
        throw new IllegalArgumentException("onSuccess callback can't be null");
    }
    
    public g0 y0(final d d, @c6.h final d.c c, @c6.h final b b) {
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
                    //    11: getfield        io/realm/j$b.G:Lio/realm/j0;
                    //    14: invokestatic    io/realm/j.G0:(Lio/realm/j0;)Lio/realm/j;
                    //    17: astore_1       
                    //    18: aload_1        
                    //    19: invokevirtual   io/realm/j.beginTransaction:()V
                    //    22: aconst_null    
                    //    23: astore_2       
                    //    24: aload_0        
                    //    25: getfield        io/realm/j$b.H:Lio/realm/j$d;
                    //    28: aload_1        
                    //    29: invokeinterface io/realm/j$d.a:(Lio/realm/j;)V
                    //    34: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
                    //    37: invokevirtual   java/lang/Thread.isInterrupted:()Z
                    //    40: istore_3       
                    //    41: iload_3        
                    //    42: ifeq            68
                    //    45: aload_1        
                    //    46: invokevirtual   io/realm/j.Q:()Z
                    //    49: ifeq            56
                    //    52: aload_1        
                    //    53: invokevirtual   io/realm/j.d:()V
                    //    56: aload_1        
                    //    57: invokevirtual   io/realm/j.close:()V
                    //    60: return         
                    //    61: astore_2       
                    //    62: aload_1        
                    //    63: invokevirtual   io/realm/j.close:()V
                    //    66: aload_2        
                    //    67: athrow         
                    //    68: aload_1        
                    //    69: invokevirtual   io/realm/j.n:()V
                    //    72: aload_1        
                    //    73: getfield        io/realm/a.K:Lio/realm/internal/OsSharedRealm;
                    //    76: invokevirtual   io/realm/internal/OsSharedRealm.getVersionID:()Lio/realm/internal/OsSharedRealm$a;
                    //    79: astore          4
                    //    81: aload_1        
                    //    82: invokevirtual   io/realm/j.Q:()Z
                    //    85: ifeq            92
                    //    88: aload_1        
                    //    89: invokevirtual   io/realm/j.d:()V
                    //    92: aload_1        
                    //    93: invokevirtual   io/realm/j.close:()V
                    //    96: goto            125
                    //    99: astore_2       
                    //   100: aload_1        
                    //   101: invokevirtual   io/realm/j.close:()V
                    //   104: aload_2        
                    //   105: athrow         
                    //   106: astore_2       
                    //   107: aload_1        
                    //   108: invokevirtual   io/realm/j.Q:()Z
                    //   111: ifeq            118
                    //   114: aload_1        
                    //   115: invokevirtual   io/realm/j.d:()V
                    //   118: aload_1        
                    //   119: invokevirtual   io/realm/j.close:()V
                    //   122: aconst_null    
                    //   123: astore          4
                    //   125: aload_0        
                    //   126: getfield        io/realm/j$b.I:Z
                    //   129: ifeq            189
                    //   132: aload           4
                    //   134: ifnull          165
                    //   137: aload_0        
                    //   138: getfield        io/realm/j$b.J:Lio/realm/j$d$c;
                    //   141: ifnull          165
                    //   144: aload_0        
                    //   145: getfield        io/realm/j$b.K:Lio/realm/internal/RealmNotifier;
                    //   148: new             Lio/realm/j$b$a;
                    //   151: dup            
                    //   152: aload_0        
                    //   153: aload           4
                    //   155: invokespecial   io/realm/j$b$a.<init>:(Lio/realm/j$b;Lio/realm/internal/OsSharedRealm$a;)V
                    //   158: invokevirtual   io/realm/internal/RealmNotifier.post:(Ljava/lang/Runnable;)Z
                    //   161: pop            
                    //   162: goto            193
                    //   165: aload_2        
                    //   166: ifnull          193
                    //   169: aload_0        
                    //   170: getfield        io/realm/j$b.K:Lio/realm/internal/RealmNotifier;
                    //   173: new             Lio/realm/j$b$b;
                    //   176: dup            
                    //   177: aload_0        
                    //   178: aload_2        
                    //   179: invokespecial   io/realm/j$b$b.<init>:(Lio/realm/j$b;Ljava/lang/Throwable;)V
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
                    //   207: invokevirtual   io/realm/j.close:()V
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
    
    public abstract static class c extends g<j>
    {
        @Override
        public void a(final Throwable t) {
            super.a(t);
        }
        
        public abstract void c(final j p0);
    }
    
    public interface d
    {
        void a(final j p0);
        
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
