// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.ve;
import java.util.List;
import java.util.Collection;
import com.google.android.gms.internal.measurement.m3;
import java.util.ArrayList;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.common.internal.x;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.t5;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.measurement.v5;
import androidx.collection.a;
import com.google.android.gms.internal.measurement.gg;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.measurement.c1;
import androidx.collection.j;
import com.google.android.gms.internal.measurement.i4;
import java.util.Map;

public final class q4 extends p9 implements f
{
    private final Map<String, Map<String, String>> d;
    private final Map<String, Map<String, Boolean>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, i4> g;
    private final Map<String, Map<String, Integer>> h;
    @d0
    final j<String, c1> i;
    final gg j;
    private final Map<String, String> k;
    
    q4(final z9 z9) {
        super(z9);
        this.d = new a<String, Map<String, String>>();
        this.e = new a<String, Map<String, Boolean>>();
        this.f = new a<String, Map<String, Boolean>>();
        this.g = new a<String, i4>();
        this.k = new a<String, String>();
        this.h = new a<String, Map<String, Integer>>();
        this.i = new n4(this, 20);
        this.j = new o4(this);
    }
    
    @androidx.annotation.c1
    private final void A(final String s, final i4 i4) {
        if (i4.v() != 0) {
            super.a.c().s().b("EES programs found", i4.v());
            final com.google.android.gms.internal.measurement.v5 v5 = i4.F().get(0);
            try {
                final c1 c1 = new c1();
                c1.d("internal.remoteConfig", new k4(this, s));
                c1.d("internal.appMetadata", new m4(this, s));
                c1.d("internal.logger", new j4(this));
                c1.c(v5);
                this.i.j(s, c1);
                super.a.c().s().c("EES program loaded for appId, activities", s, v5.v().v());
                final Iterator<com.google.android.gms.internal.measurement.t5> iterator = v5.v().z().iterator();
                while (iterator.hasNext()) {
                    super.a.c().s().b("EES program activity", iterator.next().w());
                }
                return;
            }
            catch (d2 d2) {
                super.a.c().o().b("Failed to load EES program. appId", s);
                return;
            }
        }
        this.i.l(s);
    }
    
    private static final Map<String, String> B(final i4 i4) {
        final a<String, String> a = new a<String, String>();
        if (i4 != null) {
            for (final com.google.android.gms.internal.measurement.k4 k4 : i4.G()) {
                a.put(k4.w(), k4.x());
            }
        }
        return a;
    }
    
    @androidx.annotation.c1
    private final i4 x(final String s, byte[] value) {
        if (value == null) {
            return i4.C();
        }
        try {
            final i4 i4 = ((f9<i4, BuilderType>)ba.A(com.google.android.gms.internal.measurement.i4.A(), (byte[])(Object)value)).n();
            final l3 s2 = super.a.c().s();
            final boolean l = i4.L();
            Object d = null;
            if (l) {
                value = (u9)Long.valueOf(i4.x());
            }
            else {
                value = null;
            }
            if (i4.K()) {
                d = i4.D();
            }
            s2.c("Parsed config. version, gmp_app_id", value, d);
            return i4;
        }
        catch (RuntimeException ex) {}
        catch (u9 value) {
            goto Label_0091;
        }
    }
    
    private final void y(final String s, final h4 h4) {
        final a<String, Boolean> a = new a<String, Boolean>();
        final a<String, Boolean> a2 = new a<String, Boolean>();
        final a<String, Integer> a3 = new a<String, Integer>();
        if (h4 != null) {
            for (int i = 0; i < h4.v(); ++i) {
                final e4 e4 = ((j9<MessageType, e4>)h4.w(i)).p();
                if (TextUtils.isEmpty((CharSequence)e4.x())) {
                    super.a.c().t().a("EventConfig contained null event name");
                }
                else {
                    final String x = e4.x();
                    final String b = x5.b(e4.x());
                    if (!TextUtils.isEmpty((CharSequence)b)) {
                        e4.w(b);
                        h4.z(i, e4);
                    }
                    a.put(x, e4.z());
                    a2.put(e4.x(), e4.A());
                    if (e4.B()) {
                        if (e4.v() >= 2 && e4.v() <= 65535) {
                            a3.put(e4.x(), e4.v());
                        }
                        else {
                            super.a.c().t().c("Invalid sampling rate. Event name, sample rate", e4.x(), e4.v());
                        }
                    }
                }
            }
        }
        this.e.put(s, a);
        this.f.put(s, a2);
        this.h.put(s, a3);
    }
    
    @androidx.annotation.c1
    private final void z(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //     4: aload_0        
        //     5: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     8: aload_1        
        //     9: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //    12: pop            
        //    13: aload_0        
        //    14: getfield        com/google/android/gms/measurement/internal/q4.g:Ljava/util/Map;
        //    17: aload_1        
        //    18: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    23: ifnonnull       515
        //    26: aload_0        
        //    27: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //    30: invokevirtual   com/google/android/gms/measurement/internal/z9.U:()Lcom/google/android/gms/measurement/internal/k;
        //    33: astore_2       
        //    34: aload_1        
        //    35: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //    38: pop            
        //    39: aload_2        
        //    40: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //    43: aload_2        
        //    44: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    47: aconst_null    
        //    48: astore_3       
        //    49: aconst_null    
        //    50: astore          4
        //    52: aload_2        
        //    53: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    56: ldc_w           "apps"
        //    59: iconst_2       
        //    60: anewarray       Ljava/lang/String;
        //    63: dup            
        //    64: iconst_0       
        //    65: ldc_w           "remote_config"
        //    68: aastore        
        //    69: dup            
        //    70: iconst_1       
        //    71: ldc_w           "config_last_modified_time"
        //    74: aastore        
        //    75: ldc_w           "app_id=?"
        //    78: iconst_1       
        //    79: anewarray       Ljava/lang/String;
        //    82: dup            
        //    83: iconst_0       
        //    84: aload_1        
        //    85: aastore        
        //    86: aconst_null    
        //    87: aconst_null    
        //    88: aconst_null    
        //    89: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    92: astore          5
        //    94: aload           5
        //    96: astore_3       
        //    97: aload           5
        //    99: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   104: ifne            110
        //   107: goto            254
        //   110: aload           5
        //   112: astore_3       
        //   113: aload           5
        //   115: iconst_0       
        //   116: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   121: astore          6
        //   123: aload           5
        //   125: astore_3       
        //   126: aload           5
        //   128: iconst_1       
        //   129: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   134: astore          7
        //   136: aload           5
        //   138: astore_3       
        //   139: aload           5
        //   141: invokeinterface android/database/Cursor.moveToNext:()Z
        //   146: ifeq            172
        //   149: aload           5
        //   151: astore_3       
        //   152: aload_2        
        //   153: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   156: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   159: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   162: ldc_w           "Got multiple records for app config, expected one. appId"
        //   165: aload_1        
        //   166: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   169: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   172: aload           6
        //   174: ifnonnull       180
        //   177: goto            254
        //   180: aload           5
        //   182: astore_3       
        //   183: new             Landroid/util/Pair;
        //   186: dup            
        //   187: aload           6
        //   189: aload           7
        //   191: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   194: astore          7
        //   196: aload           5
        //   198: invokeinterface android/database/Cursor.close:()V
        //   203: aload           7
        //   205: astore          5
        //   207: goto            264
        //   210: astore          7
        //   212: goto            224
        //   215: astore_1       
        //   216: goto            503
        //   219: astore          7
        //   221: aconst_null    
        //   222: astore          5
        //   224: aload           5
        //   226: astore_3       
        //   227: aload_2        
        //   228: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   231: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   234: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   237: ldc_w           "Error querying remote config. appId"
        //   240: aload_1        
        //   241: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   244: aload           7
        //   246: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   249: aload           5
        //   251: ifnull          261
        //   254: aload           5
        //   256: invokeinterface android/database/Cursor.close:()V
        //   261: aconst_null    
        //   262: astore          5
        //   264: aload           5
        //   266: ifnonnull       349
        //   269: aload_0        
        //   270: getfield        com/google/android/gms/measurement/internal/q4.d:Ljava/util/Map;
        //   273: aload_1        
        //   274: aconst_null    
        //   275: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   280: pop            
        //   281: aload_0        
        //   282: getfield        com/google/android/gms/measurement/internal/q4.e:Ljava/util/Map;
        //   285: aload_1        
        //   286: aconst_null    
        //   287: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   292: pop            
        //   293: aload_0        
        //   294: getfield        com/google/android/gms/measurement/internal/q4.f:Ljava/util/Map;
        //   297: aload_1        
        //   298: aconst_null    
        //   299: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   304: pop            
        //   305: aload_0        
        //   306: getfield        com/google/android/gms/measurement/internal/q4.g:Ljava/util/Map;
        //   309: aload_1        
        //   310: aconst_null    
        //   311: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   316: pop            
        //   317: aload_0        
        //   318: getfield        com/google/android/gms/measurement/internal/q4.k:Ljava/util/Map;
        //   321: aload_1        
        //   322: aconst_null    
        //   323: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   328: pop            
        //   329: aload_0        
        //   330: getfield        com/google/android/gms/measurement/internal/q4.h:Ljava/util/Map;
        //   333: astore          5
        //   335: aload           4
        //   337: astore_3       
        //   338: aload           5
        //   340: aload_1        
        //   341: aload_3        
        //   342: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   347: pop            
        //   348: return         
        //   349: aload_0        
        //   350: aload_1        
        //   351: aload           5
        //   353: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   356: checkcast       [B
        //   359: invokespecial   com/google/android/gms/measurement/internal/q4.x:(Ljava/lang/String;[B)Lcom/google/android/gms/internal/measurement/i4;
        //   362: invokevirtual   com/google/android/gms/internal/measurement/j9.p:()Lcom/google/android/gms/internal/measurement/f9;
        //   365: checkcast       Lcom/google/android/gms/internal/measurement/h4;
        //   368: astore_3       
        //   369: aload_0        
        //   370: aload_1        
        //   371: aload_3        
        //   372: invokespecial   com/google/android/gms/measurement/internal/q4.y:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/h4;)V
        //   375: aload_0        
        //   376: getfield        com/google/android/gms/measurement/internal/q4.d:Ljava/util/Map;
        //   379: aload_1        
        //   380: aload_3        
        //   381: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   384: checkcast       Lcom/google/android/gms/internal/measurement/i4;
        //   387: invokestatic    com/google/android/gms/measurement/internal/q4.B:(Lcom/google/android/gms/internal/measurement/i4;)Ljava/util/Map;
        //   390: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   395: pop            
        //   396: aload_0        
        //   397: getfield        com/google/android/gms/measurement/internal/q4.g:Ljava/util/Map;
        //   400: aload_1        
        //   401: aload_3        
        //   402: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   405: checkcast       Lcom/google/android/gms/internal/measurement/i4;
        //   408: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   413: pop            
        //   414: invokestatic    com/google/android/gms/internal/measurement/bf.b:()Z
        //   417: pop            
        //   418: aload_0        
        //   419: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   422: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   425: aconst_null    
        //   426: getstatic       com/google/android/gms/measurement/internal/a3.x0:Lcom/google/android/gms/measurement/internal/z2;
        //   429: invokevirtual   com/google/android/gms/measurement/internal/g.y:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)Z
        //   432: ifeq            447
        //   435: aload_0        
        //   436: aload_1        
        //   437: aload_3        
        //   438: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   441: checkcast       Lcom/google/android/gms/internal/measurement/i4;
        //   444: invokespecial   com/google/android/gms/measurement/internal/q4.A:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/i4;)V
        //   447: invokestatic    com/google/android/gms/internal/measurement/ve.b:()Z
        //   450: pop            
        //   451: aload_0        
        //   452: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   455: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   458: aconst_null    
        //   459: getstatic       com/google/android/gms/measurement/internal/a3.v0:Lcom/google/android/gms/measurement/internal/z2;
        //   462: invokevirtual   com/google/android/gms/measurement/internal/g.y:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)Z
        //   465: ifeq            490
        //   468: aload_0        
        //   469: getfield        com/google/android/gms/measurement/internal/q4.k:Ljava/util/Map;
        //   472: astore          7
        //   474: aload           5
        //   476: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   479: checkcast       Ljava/lang/String;
        //   482: astore_3       
        //   483: aload           7
        //   485: astore          5
        //   487: goto            338
        //   490: aload_0        
        //   491: getfield        com/google/android/gms/measurement/internal/q4.k:Ljava/util/Map;
        //   494: astore          5
        //   496: aload           4
        //   498: astore_3       
        //   499: goto            338
        //   502: astore_1       
        //   503: aload_3        
        //   504: ifnull          513
        //   507: aload_3        
        //   508: invokeinterface android/database/Cursor.close:()V
        //   513: aload_1        
        //   514: athrow         
        //   515: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  52     94     219    224    Landroid/database/sqlite/SQLiteException;
        //  52     94     215    219    Any
        //  97     107    210    215    Landroid/database/sqlite/SQLiteException;
        //  97     107    502    503    Any
        //  113    123    210    215    Landroid/database/sqlite/SQLiteException;
        //  113    123    502    503    Any
        //  126    136    210    215    Landroid/database/sqlite/SQLiteException;
        //  126    136    502    503    Any
        //  139    149    210    215    Landroid/database/sqlite/SQLiteException;
        //  139    149    502    503    Any
        //  152    172    210    215    Landroid/database/sqlite/SQLiteException;
        //  152    172    502    503    Any
        //  183    196    210    215    Landroid/database/sqlite/SQLiteException;
        //  183    196    502    503    Any
        //  227    249    502    503    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @androidx.annotation.c1
    @Override
    public final String a(final String s, final String s2) {
        this.e();
        this.z(s);
        final Map<String, String> map = this.d.get(s);
        if (map != null) {
            return map.get(s2);
        }
        return null;
    }
    
    @Override
    protected final boolean i() {
        return false;
    }
    
    @androidx.annotation.c1
    final int j(final String s, final String s2) {
        this.e();
        this.z(s);
        final Map<String, Integer> map = this.h.get(s);
        if (map == null) {
            return 1;
        }
        final Integer n = map.get(s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    @androidx.annotation.c1
    protected final i4 l(final String s) {
        this.f();
        this.e();
        x.g(s);
        this.z(s);
        return this.g.get(s);
    }
    
    @androidx.annotation.c1
    protected final String m(final String s) {
        this.e();
        return this.k.get(s);
    }
    
    @androidx.annotation.c1
    protected final void o(final String s) {
        this.e();
        this.k.put(s, null);
    }
    
    @androidx.annotation.c1
    final void p(final String s) {
        this.e();
        this.g.remove(s);
    }
    
    @androidx.annotation.c1
    final boolean q(final String s) {
        this.e();
        final i4 l = this.l(s);
        return l != null && l.J();
    }
    
    public final boolean r(final String s) {
        bf.b();
        if (super.a.w().y(null, a3.x0)) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return false;
            }
            final i4 i4 = this.g.get(s);
            if (i4 == null) {
                return false;
            }
            if (i4.v() != 0) {
                return true;
            }
        }
        return false;
    }
    
    final boolean s(final String s) {
        return "1".equals(this.a(s, "measurement.upload.blacklist_internal"));
    }
    
    @androidx.annotation.c1
    final boolean t(final String s, final String anObject) {
        this.e();
        this.z(s);
        if ("ecommerce_purchase".equals(anObject)) {
            return true;
        }
        if ("purchase".equals(anObject) || "refund".equals(anObject)) {
            return true;
        }
        final Map<String, Boolean> map = this.f.get(s);
        if (map != null) {
            final Boolean b = map.get(anObject);
            return b != null && b;
        }
        return false;
    }
    
    @androidx.annotation.c1
    final boolean u(final String s, final String s2) {
        this.e();
        this.z(s);
        if (this.s(s) && ga.U(s2)) {
            return true;
        }
        if (this.v(s) && ga.V(s2)) {
            return true;
        }
        final Map<String, Boolean> map = this.e.get(s);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    final boolean v(final String s) {
        return "1".equals(this.a(s, "measurement.upload.blacklist_public"));
    }
    
    @androidx.annotation.c1
    protected final boolean w(final String s, byte[] i, final String s2) {
        this.f();
        this.e();
        x.g(s);
        final h4 h4 = ((j9<MessageType, h4>)this.x(s, i)).p();
        if (h4 == null) {
            return false;
        }
        this.y(s, h4);
        bf.b();
        if (super.a.w().y(null, a3.x0)) {
            this.A(s, ((f9<i4, BuilderType>)h4).n());
        }
        this.g.put(s, ((f9<i4, BuilderType>)h4).n());
        this.k.put(s, s2);
        this.d.put(s, B(((f9<i4, BuilderType>)h4).n()));
        super.b.U().k(s, new ArrayList<m3>(h4.A()));
        try {
            h4.x();
            i = ((f9<i4, BuilderType>)h4).n().i();
        }
        catch (RuntimeException ex) {
            super.a.c().t().c("Unable to serialize reduced-size config. Storing full config instead. appId", n3.w(s), ex);
        }
        ve.b();
        if (super.a.w().y(null, a3.v0)) {
            super.b.U().o(s, i, s2);
        }
        else {
            super.b.U().o(s, i, null);
        }
        this.g.put(s, ((f9<i4, BuilderType>)h4).n());
        return true;
    }
}
