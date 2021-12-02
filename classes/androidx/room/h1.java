// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import android.database.sqlite.SQLiteException;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Callable;
import androidx.annotation.c1;
import java.util.Collection;
import android.os.Build$VERSION;
import androidx.sqlite.db.c;
import java.util.Collections;
import androidx.annotation.t0;
import java.util.Iterator;
import java.util.Locale;
import android.database.Cursor;
import androidx.sqlite.db.f;
import java.util.HashSet;
import android.annotation.SuppressLint;
import androidx.arch.core.internal.b;
import androidx.sqlite.db.h;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.annotation.k0;
import java.util.Set;
import java.util.Map;
import androidx.annotation.j0;
import java.util.HashMap;
import androidx.annotation.b1;

public class h1
{
    private static final String[] n;
    private static final String o = "room_table_modification_log";
    private static final String p = "table_id";
    private static final String q = "invalidated";
    private static final String r = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @b1
    static final String s = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    @b1
    static final String t = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @j0
    final HashMap<String, Integer> a;
    final String[] b;
    @j0
    private Map<String, Set<String>> c;
    @k0
    a d;
    final r2 e;
    AtomicBoolean f;
    private volatile boolean g;
    volatile h h;
    private b i;
    private final f1 j;
    @SuppressLint({ "RestrictedApi" })
    @b1
    final androidx.arch.core.internal.b<c, d> k;
    private j1 l;
    @b1
    Runnable m;
    
    static {
        n = new String[] { "UPDATE", "DELETE", "INSERT" };
    }
    
    @t0({ t0.a.I })
    public h1(final r2 e, final Map<String, String> map, final Map<String, Set<String>> c, final String... array) {
        this.d = null;
        int i = 0;
        this.f = new AtomicBoolean(false);
        this.g = false;
        this.k = new androidx.arch.core.internal.b<c, d>();
        this.m = new Runnable() {
            private Set<Integer> a() {
                final HashSet<Integer> set = new HashSet<Integer>();
                final Cursor d = h1.this.e.D(new androidx.sqlite.db.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                try {
                    while (d.moveToNext()) {
                        set.add(d.getInt(0));
                    }
                    d.close();
                    if (!set.isEmpty()) {
                        h1.this.h.c1();
                    }
                    return set;
                }
                finally {
                    d.close();
                }
            }
            
            @Override
            public void run() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //     4: getfield        androidx/room/h1.e:Landroidx/room/r2;
                //     7: invokevirtual   androidx/room/r2.m:()Ljava/util/concurrent/locks/Lock;
                //    10: astore_1       
                //    11: aload_1        
                //    12: invokeinterface java/util/concurrent/locks/Lock.lock:()V
                //    17: aconst_null    
                //    18: astore_2       
                //    19: aconst_null    
                //    20: astore_3       
                //    21: aconst_null    
                //    22: astore          4
                //    24: aload_2        
                //    25: astore          5
                //    27: aload_3        
                //    28: astore          6
                //    30: aload_0        
                //    31: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //    34: invokevirtual   androidx/room/h1.g:()Z
                //    37: istore          7
                //    39: iload           7
                //    41: ifne            70
                //    44: aload_1        
                //    45: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //    50: aload_0        
                //    51: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //    54: getfield        androidx/room/h1.d:Landroidx/room/a;
                //    57: astore          6
                //    59: aload           6
                //    61: ifnull          69
                //    64: aload           6
                //    66: invokevirtual   androidx/room/a.b:()V
                //    69: return         
                //    70: aload_2        
                //    71: astore          5
                //    73: aload_3        
                //    74: astore          6
                //    76: aload_0        
                //    77: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //    80: getfield        androidx/room/h1.f:Ljava/util/concurrent/atomic/AtomicBoolean;
                //    83: iconst_1       
                //    84: iconst_0       
                //    85: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
                //    88: istore          7
                //    90: iload           7
                //    92: ifne            121
                //    95: aload_1        
                //    96: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //   101: aload_0        
                //   102: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   105: getfield        androidx/room/h1.d:Landroidx/room/a;
                //   108: astore          6
                //   110: aload           6
                //   112: ifnull          120
                //   115: aload           6
                //   117: invokevirtual   androidx/room/a.b:()V
                //   120: return         
                //   121: aload_2        
                //   122: astore          5
                //   124: aload_3        
                //   125: astore          6
                //   127: aload_0        
                //   128: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   131: getfield        androidx/room/h1.e:Landroidx/room/r2;
                //   134: invokevirtual   androidx/room/r2.u:()Z
                //   137: istore          7
                //   139: iload           7
                //   141: ifeq            170
                //   144: aload_1        
                //   145: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //   150: aload_0        
                //   151: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   154: getfield        androidx/room/h1.d:Landroidx/room/a;
                //   157: astore          6
                //   159: aload           6
                //   161: ifnull          169
                //   164: aload           6
                //   166: invokevirtual   androidx/room/a.b:()V
                //   169: return         
                //   170: aload_2        
                //   171: astore          5
                //   173: aload_3        
                //   174: astore          6
                //   176: aload_0        
                //   177: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   180: getfield        androidx/room/h1.e:Landroidx/room/r2;
                //   183: astore          8
                //   185: aload_2        
                //   186: astore          5
                //   188: aload_3        
                //   189: astore          6
                //   191: aload           8
                //   193: getfield        androidx/room/r2.g:Z
                //   196: ifeq            287
                //   199: aload_2        
                //   200: astore          5
                //   202: aload_3        
                //   203: astore          6
                //   205: aload           8
                //   207: invokevirtual   androidx/room/r2.o:()Landroidx/sqlite/db/d;
                //   210: invokeinterface androidx/sqlite/db/d.T2:()Landroidx/sqlite/db/c;
                //   215: astore          8
                //   217: aload_2        
                //   218: astore          5
                //   220: aload_3        
                //   221: astore          6
                //   223: aload           8
                //   225: invokeinterface androidx/sqlite/db/c.v2:()V
                //   230: aload_0        
                //   231: invokespecial   androidx/room/h1$a.a:()Ljava/util/Set;
                //   234: astore_2       
                //   235: aload_2        
                //   236: astore          4
                //   238: aload           8
                //   240: invokeinterface androidx/sqlite/db/c.n2:()V
                //   245: aload_2        
                //   246: astore          5
                //   248: aload_2        
                //   249: astore          6
                //   251: aload           8
                //   253: invokeinterface androidx/sqlite/db/c.p3:()V
                //   258: goto            298
                //   261: astore_2       
                //   262: aload           4
                //   264: astore          5
                //   266: aload           4
                //   268: astore          6
                //   270: aload           8
                //   272: invokeinterface androidx/sqlite/db/c.p3:()V
                //   277: aload           4
                //   279: astore          5
                //   281: aload           4
                //   283: astore          6
                //   285: aload_2        
                //   286: athrow         
                //   287: aload_2        
                //   288: astore          5
                //   290: aload_3        
                //   291: astore          6
                //   293: aload_0        
                //   294: invokespecial   androidx/room/h1$a.a:()Ljava/util/Set;
                //   297: astore_2       
                //   298: aload_1        
                //   299: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //   304: aload_0        
                //   305: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   308: getfield        androidx/room/h1.d:Landroidx/room/a;
                //   311: astore          4
                //   313: aload_2        
                //   314: astore          5
                //   316: aload           4
                //   318: ifnull          397
                //   321: aload_2        
                //   322: astore          6
                //   324: aload           4
                //   326: astore          5
                //   328: aload           5
                //   330: invokevirtual   androidx/room/a.b:()V
                //   333: aload           6
                //   335: astore          5
                //   337: goto            397
                //   340: astore          6
                //   342: goto            487
                //   345: astore          4
                //   347: aload           5
                //   349: astore          6
                //   351: goto            356
                //   354: astore          4
                //   356: ldc             "ROOM"
                //   358: ldc             "Cannot run invalidation tracker. Is the db closed?"
                //   360: aload           4
                //   362: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
                //   365: pop            
                //   366: aload_1        
                //   367: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //   372: aload_0        
                //   373: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   376: getfield        androidx/room/h1.d:Landroidx/room/a;
                //   379: astore          4
                //   381: aload           6
                //   383: astore          5
                //   385: aload           4
                //   387: ifnull          397
                //   390: aload           4
                //   392: astore          5
                //   394: goto            328
                //   397: aload           5
                //   399: ifnull          486
                //   402: aload           5
                //   404: invokeinterface java/util/Set.isEmpty:()Z
                //   409: ifne            486
                //   412: aload_0        
                //   413: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   416: getfield        androidx/room/h1.k:Landroidx/arch/core/internal/b;
                //   419: astore          6
                //   421: aload           6
                //   423: monitorenter   
                //   424: aload_0        
                //   425: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   428: getfield        androidx/room/h1.k:Landroidx/arch/core/internal/b;
                //   431: invokevirtual   androidx/arch/core/internal/b.iterator:()Ljava/util/Iterator;
                //   434: astore          4
                //   436: aload           4
                //   438: invokeinterface java/util/Iterator.hasNext:()Z
                //   443: ifeq            472
                //   446: aload           4
                //   448: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   453: checkcast       Ljava/util/Map$Entry;
                //   456: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
                //   461: checkcast       Landroidx/room/h1$d;
                //   464: aload           5
                //   466: invokevirtual   androidx/room/h1$d.a:(Ljava/util/Set;)V
                //   469: goto            436
                //   472: aload           6
                //   474: monitorexit    
                //   475: goto            486
                //   478: astore          5
                //   480: aload           6
                //   482: monitorexit    
                //   483: aload           5
                //   485: athrow         
                //   486: return         
                //   487: aload_1        
                //   488: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
                //   493: aload_0        
                //   494: getfield        androidx/room/h1$a.G:Landroidx/room/h1;
                //   497: getfield        androidx/room/h1.d:Landroidx/room/a;
                //   500: astore          5
                //   502: aload           5
                //   504: ifnull          512
                //   507: aload           5
                //   509: invokevirtual   androidx/room/a.b:()V
                //   512: aload           6
                //   514: athrow         
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                     
                //  -----  -----  -----  -----  -----------------------------------------
                //  30     39     354    356    Ljava/lang/IllegalStateException;
                //  30     39     345    354    Landroid/database/sqlite/SQLiteException;
                //  30     39     340    515    Any
                //  76     90     354    356    Ljava/lang/IllegalStateException;
                //  76     90     345    354    Landroid/database/sqlite/SQLiteException;
                //  76     90     340    515    Any
                //  127    139    354    356    Ljava/lang/IllegalStateException;
                //  127    139    345    354    Landroid/database/sqlite/SQLiteException;
                //  127    139    340    515    Any
                //  176    185    354    356    Ljava/lang/IllegalStateException;
                //  176    185    345    354    Landroid/database/sqlite/SQLiteException;
                //  176    185    340    515    Any
                //  191    199    354    356    Ljava/lang/IllegalStateException;
                //  191    199    345    354    Landroid/database/sqlite/SQLiteException;
                //  191    199    340    515    Any
                //  205    217    354    356    Ljava/lang/IllegalStateException;
                //  205    217    345    354    Landroid/database/sqlite/SQLiteException;
                //  205    217    340    515    Any
                //  223    230    354    356    Ljava/lang/IllegalStateException;
                //  223    230    345    354    Landroid/database/sqlite/SQLiteException;
                //  223    230    340    515    Any
                //  230    235    261    287    Any
                //  238    245    261    287    Any
                //  251    258    354    356    Ljava/lang/IllegalStateException;
                //  251    258    345    354    Landroid/database/sqlite/SQLiteException;
                //  251    258    340    515    Any
                //  270    277    354    356    Ljava/lang/IllegalStateException;
                //  270    277    345    354    Landroid/database/sqlite/SQLiteException;
                //  270    277    340    515    Any
                //  285    287    354    356    Ljava/lang/IllegalStateException;
                //  285    287    345    354    Landroid/database/sqlite/SQLiteException;
                //  285    287    340    515    Any
                //  293    298    354    356    Ljava/lang/IllegalStateException;
                //  293    298    345    354    Landroid/database/sqlite/SQLiteException;
                //  293    298    340    515    Any
                //  356    366    340    515    Any
                //  424    436    478    486    Any
                //  436    469    478    486    Any
                //  472    475    478    486    Any
                //  480    483    478    486    Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0436:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        };
        this.e = e;
        this.i = new b(array.length);
        this.a = new HashMap<String, Integer>();
        this.c = c;
        this.j = new f1(e);
        final int length = array.length;
        this.b = new String[length];
        while (i < length) {
            final String s = array[i];
            final Locale us = Locale.US;
            final String lowerCase = s.toLowerCase(us);
            this.a.put(lowerCase, i);
            final String s2 = map.get(array[i]);
            if (s2 != null) {
                this.b[i] = s2.toLowerCase(us);
            }
            else {
                this.b[i] = lowerCase;
            }
            ++i;
        }
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            final String s3 = entry.getValue();
            final Locale us2 = Locale.US;
            final String lowerCase2 = s3.toLowerCase(us2);
            if (this.a.containsKey(lowerCase2)) {
                final String lowerCase3 = entry.getKey().toLowerCase(us2);
                final HashMap<String, Integer> a = this.a;
                a.put(lowerCase3, a.get(lowerCase2));
            }
        }
    }
    
    @t0({ t0.a.I })
    public h1(final r2 r2, final String... array) {
        this(r2, new HashMap<String, String>(), Collections.emptyMap(), array);
    }
    
    private static void c(final StringBuilder sb, final String str, final String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }
    
    private static void d(final androidx.sqlite.db.c c) {
        if (Build$VERSION.SDK_INT >= 16 && c.W4()) {
            c.v2();
        }
        else {
            c.beginTransaction();
        }
    }
    
    private String[] n(final String[] array) {
        final HashSet<String> set = new HashSet<String>();
        for (final String s : array) {
            final String lowerCase = s.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                set.addAll((Collection<?>)this.c.get(lowerCase));
            }
            else {
                set.add(s);
            }
        }
        return set.toArray(new String[set.size()]);
    }
    
    private void q(final androidx.sqlite.db.c c, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(n);
        sb.append(", 0)");
        c.J0(sb.toString());
        final String str = this.b[n];
        final StringBuilder sb2 = new StringBuilder();
        for (final String str2 : h1.n) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(n);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            c.J0(sb2.toString());
        }
    }
    
    private void s(final androidx.sqlite.db.c c, int i) {
        final String s = this.b[i];
        final StringBuilder sb = new StringBuilder();
        final String[] n = h1.n;
        int length;
        String s2;
        for (length = n.length, i = 0; i < length; ++i) {
            s2 = n[i];
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, s, s2);
            c.J0(sb.toString());
        }
    }
    
    private String[] v(final String[] array) {
        final String[] n = this.n(array);
        for (final String str : n) {
            if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
                final StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return n;
    }
    
    @SuppressLint({ "RestrictedApi" })
    @c1
    public void a(@j0 final c c) {
        final String[] n = this.n(c.a);
        final int[] array = new int[n.length];
        for (int length = n.length, i = 0; i < length; ++i) {
            final Integer n2 = this.a.get(n[i].toLowerCase(Locale.US));
            if (n2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("There is no table with name ");
                sb.append(n[i]);
                throw new IllegalArgumentException(sb.toString());
            }
            array[i] = n2;
        }
        final d d = new d(c, array, n);
        synchronized (this.k) {
            final d d2 = this.k.l(c, d);
            // monitorexit(this.k)
            if (d2 == null && this.i.b(array)) {
                this.t();
            }
        }
    }
    
    @t0({ t0.a.I })
    public void b(final c c) {
        this.a((c)new e(this, c));
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public <T> LiveData<T> e(final String[] array, final Callable<T> callable) {
        return this.f(array, false, callable);
    }
    
    @t0({ t0.a.I })
    public <T> LiveData<T> f(final String[] array, final boolean b, final Callable<T> callable) {
        return this.j.a(this.v(array), b, callable);
    }
    
    boolean g() {
        if (!this.e.A()) {
            return false;
        }
        if (!this.g) {
            this.e.o().T2();
        }
        if (!this.g) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }
    
    void h(final androidx.sqlite.db.c c) {
        synchronized (this) {
            if (this.g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            c.J0("PRAGMA temp_store = MEMORY;");
            c.J0("PRAGMA recursive_triggers='ON';");
            c.J0("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            this.u(c);
            this.h = c.h1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.g = true;
        }
    }
    
    @b1(otherwise = 3)
    @t0({ t0.a.G })
    public void i(final String... array) {
        synchronized (this.k) {
            for (final Map.Entry<c, d> entry : this.k) {
                if (!entry.getKey().a()) {
                    entry.getValue().b(array);
                }
            }
        }
    }
    
    void j() {
        synchronized (this) {
            this.g = false;
            this.i.e();
        }
    }
    
    public void k() {
        if (this.f.compareAndSet(false, true)) {
            final a d = this.d;
            if (d != null) {
                d.f();
            }
            this.e.p().execute(this.m);
        }
    }
    
    @c1
    @t0({ t0.a.I })
    public void l() {
        final a d = this.d;
        if (d != null) {
            d.f();
        }
        this.t();
        this.m.run();
    }
    
    @SuppressLint({ "RestrictedApi" })
    @c1
    public void m(@j0 final c c) {
        synchronized (this.k) {
            final d d = this.k.m(c);
            // monitorexit(this.k)
            if (d != null && this.i.c(d.a)) {
                this.t();
            }
        }
    }
    
    void o(final a d) {
        (this.d = d).i(new g1(this));
    }
    
    void p(final Context context, final String s) {
        this.l = new j1(context, s, this, this.e.p());
    }
    
    void r() {
        final j1 l = this.l;
        if (l != null) {
            l.a();
            this.l = null;
        }
    }
    
    void t() {
        if (!this.e.A()) {
            return;
        }
        this.u(this.e.o().T2());
    }
    
    void u(final androidx.sqlite.db.c ex) {
        if (((androidx.sqlite.db.c)ex).x4()) {
            return;
        }
        Label_0010: {
            break Label_0010;
            try {
                while (true) {
                    final Lock m = this.e.m();
                    m.lock();
                    try {
                        final int[] a = this.i.a();
                        if (a == null) {
                            return;
                        }
                        final int length = a.length;
                        d((androidx.sqlite.db.c)ex);
                        int n = 0;
                    Label_0099_Outer:
                        while (true) {
                            Label_0105: {
                                if (n >= length) {
                                    break Label_0105;
                                }
                                final int n2 = a[n];
                                Label_0092: {
                                    if (n2 == 1) {
                                        break Label_0092;
                                    }
                                    while (true) {
                                        if (n2 != 2) {
                                            break Label_0099;
                                        }
                                        try {
                                            this.s((androidx.sqlite.db.c)ex, n);
                                            ++n;
                                            continue Label_0099_Outer;
                                            this.q((androidx.sqlite.db.c)ex, n);
                                            continue;
                                            ((androidx.sqlite.db.c)ex).n2();
                                            ((androidx.sqlite.db.c)ex).p3();
                                            this.i.d();
                                        }
                                        finally {
                                            ((androidx.sqlite.db.c)ex).p3();
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        m.unlock();
                    }
                }
            }
            catch (SQLiteException ex) {}
            catch (IllegalStateException ex2) {}
        }
        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex);
    }
    
    static class b
    {
        static final int f = 0;
        static final int g = 1;
        static final int h = 2;
        final long[] a;
        final boolean[] b;
        final int[] c;
        boolean d;
        boolean e;
        
        b(final int n) {
            final long[] array = new long[n];
            this.a = array;
            final boolean[] array2 = new boolean[n];
            this.b = array2;
            this.c = new int[n];
            Arrays.fill(array, 0L);
            Arrays.fill(array2, false);
        }
        
        @k0
        int[] a() {
            synchronized (this) {
                if (this.d && !this.e) {
                    final int length = this.a.length;
                    int n = 0;
                    while (true) {
                        int n2 = 1;
                        if (n >= length) {
                            break;
                        }
                        final boolean b = this.a[n] > 0L;
                        final boolean[] b2 = this.b;
                        if (b != b2[n]) {
                            final int[] c = this.c;
                            if (!b) {
                                n2 = 2;
                            }
                            c[n] = n2;
                        }
                        else {
                            this.c[n] = 0;
                        }
                        b2[n] = b;
                        ++n;
                    }
                    this.e = true;
                    this.d = false;
                    return this.c;
                }
                return null;
            }
        }
        
        boolean b(final int... array) {
            synchronized (this) {
                final int length = array.length;
                int i = 0;
                boolean b = false;
                while (i < length) {
                    final int n = array[i];
                    final long[] a = this.a;
                    final long n2 = a[n];
                    a[n] = 1L + n2;
                    if (n2 == 0L) {
                        this.d = true;
                        b = true;
                    }
                    ++i;
                }
                return b;
            }
        }
        
        boolean c(final int... array) {
            synchronized (this) {
                final int length = array.length;
                int i = 0;
                boolean b = false;
                while (i < length) {
                    if (this.a[array[i]]-- == 1L) {
                        this.d = true;
                        b = true;
                    }
                    ++i;
                }
                return b;
            }
        }
        
        void d() {
            synchronized (this) {
                this.e = false;
            }
        }
        
        void e() {
            synchronized (this) {
                Arrays.fill(this.b, false);
                this.d = true;
            }
        }
    }
    
    public abstract static class c
    {
        final String[] a;
        
        protected c(@j0 final String s, final String... original) {
            (this.a = Arrays.copyOf(original, original.length + 1))[original.length] = s;
        }
        
        public c(@j0 final String[] original) {
            this.a = Arrays.copyOf(original, original.length);
        }
        
        boolean a() {
            return false;
        }
        
        public abstract void b(@j0 final Set<String> p0);
    }
    
    static class d
    {
        final int[] a;
        private final String[] b;
        final c c;
        private final Set<String> d;
        
        d(final c c, final int[] a, final String[] b) {
            this.c = c;
            this.a = a;
            this.b = b;
            Object unmodifiableSet;
            if (a.length == 1) {
                final HashSet<String> s = new HashSet<String>();
                s.add(b[0]);
                unmodifiableSet = Collections.unmodifiableSet((Set<?>)s);
            }
            else {
                unmodifiableSet = null;
            }
            this.d = (Set<String>)unmodifiableSet;
        }
        
        void a(final Set<Integer> set) {
            final int length = this.a.length;
            Set<String> set2 = null;
            Set<String> d;
            for (int i = 0; i < length; ++i, set2 = d) {
                d = set2;
                if (set.contains(this.a[i])) {
                    if (length == 1) {
                        d = this.d;
                    }
                    else {
                        if ((d = set2) == null) {
                            d = new HashSet<String>(length);
                        }
                        d.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }
        
        void b(final String[] array) {
            final int length = this.b.length;
            final Set<String> set = null;
            Set<String> d;
            if (length == 1) {
                final int length2 = array.length;
                int n = 0;
                while (true) {
                    d = set;
                    if (n >= length2) {
                        break;
                    }
                    if (array[n].equalsIgnoreCase(this.b[0])) {
                        d = this.d;
                        break;
                    }
                    ++n;
                }
            }
            else {
                final HashSet<String> set2 = new HashSet<String>();
                for (final String anotherString : array) {
                    for (final String e : this.b) {
                        if (e.equalsIgnoreCase(anotherString)) {
                            set2.add(e);
                            break;
                        }
                    }
                }
                d = set;
                if (set2.size() > 0) {
                    d = set2;
                }
            }
            if (d != null) {
                this.c.b(d);
            }
        }
    }
    
    static class e extends c
    {
        final h1 b;
        final WeakReference<c> c;
        
        e(final h1 b, final c referent) {
            super(referent.a);
            this.b = b;
            this.c = new WeakReference<c>(referent);
        }
        
        @Override
        public void b(@j0 final Set<String> set) {
            final c c = this.c.get();
            if (c == null) {
                this.b.m((c)this);
            }
            else {
                c.b(set);
            }
        }
    }
}
