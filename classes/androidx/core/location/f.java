// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import java.util.concurrent.RejectedExecutionException;
import android.location.GpsStatus;
import android.location.GnssStatus;
import androidx.core.util.n;
import android.os.Bundle;
import java.util.function.Consumer;
import android.os.CancellationSignal;
import androidx.annotation.r;
import androidx.annotation.p0;
import android.location.GpsStatus$Listener;
import android.location.GnssStatus$Callback;
import android.os.Handler;
import android.text.TextUtils;
import android.provider.Settings$Secure;
import android.content.Context;
import androidx.annotation.s0;
import android.location.LocationListener;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Build$VERSION;
import android.location.Location;
import java.util.concurrent.Executor;
import androidx.annotation.k0;
import androidx.core.os.c;
import androidx.annotation.j0;
import android.location.LocationManager;
import androidx.annotation.w;
import androidx.collection.m;
import java.lang.reflect.Field;

public final class f
{
    private static final long a = 30000L;
    private static final long b = 10000L;
    private static final long c = 5L;
    private static Field d;
    @w("sGnssStatusListeners")
    private static final m<Object, Object> e;
    
    static {
        e = new m<Object, Object>();
    }
    
    private f() {
    }
    
    @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
    public static void a(@j0 final LocationManager locationManager, @j0 final String s, @k0 final c c, @j0 final Executor executor, @j0 final androidx.core.util.c<Location> c2) {
        if (Build$VERSION.SDK_INT >= 30) {
            androidx.core.location.f.e.a(locationManager, s, c, executor, c2);
        }
        else {
            if (c != null) {
                c.e();
            }
            final Location lastKnownLocation = locationManager.getLastKnownLocation(s);
            if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.d.a(lastKnownLocation) < 10000L) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        c2.accept(lastKnownLocation);
                    }
                });
                return;
            }
            final f f = new f(locationManager, executor, c2);
            locationManager.requestLocationUpdates(s, 0L, 0.0f, (LocationListener)f, Looper.getMainLooper());
            if (c != null) {
                c.d((c.a)new c.a() {
                    @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
                    @Override
                    public void onCancel() {
                        f.a();
                    }
                });
            }
            f.c(30000L);
        }
    }
    
    @k0
    public static String b(@j0 final LocationManager locationManager) {
        if (Build$VERSION.SDK_INT >= 28) {
            return androidx.core.location.f.d.a(locationManager);
        }
        return null;
    }
    
    public static int c(@j0 final LocationManager locationManager) {
        if (Build$VERSION.SDK_INT >= 28) {
            return androidx.core.location.f.d.b(locationManager);
        }
        return 0;
    }
    
    public static boolean d(@j0 final LocationManager obj) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return androidx.core.location.f.d.c(obj);
        }
        final boolean b = false;
        boolean b2 = false;
        if (sdk_INT <= 19) {
            try {
                if (f.d == null) {
                    (f.d = LocationManager.class.getDeclaredField("mContext")).setAccessible(true);
                }
                final Context context = (Context)f.d.get(obj);
                if (context != null) {
                    if (sdk_INT == 19) {
                        if (Settings$Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0) {
                            b2 = true;
                        }
                        return b2;
                    }
                    return TextUtils.isEmpty((CharSequence)Settings$Secure.getString(context.getContentResolver(), "location_providers_allowed")) ^ true;
                }
            }
            catch (ClassCastException ex) {}
            catch (SecurityException ex2) {}
            catch (NoSuchFieldException ex3) {}
            catch (IllegalAccessException ex4) {}
        }
        if (!obj.isProviderEnabled("network")) {
            final boolean b3 = b;
            if (!obj.isProviderEnabled("gps")) {
                return b3;
            }
        }
        return true;
    }
    
    @s0("android.permission.ACCESS_FINE_LOCATION")
    private static boolean e(final LocationManager p0, final Handler p1, final Executor p2, final a.a p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iconst_1       
        //     6: istore          5
        //     8: iconst_1       
        //     9: istore          6
        //    11: iconst_1       
        //    12: istore          7
        //    14: iload           4
        //    16: bipush          30
        //    18: if_icmplt       90
        //    21: getstatic       androidx/core/location/f.e:Landroidx/collection/m;
        //    24: astore          8
        //    26: aload           8
        //    28: monitorenter   
        //    29: aload           8
        //    31: aload_3        
        //    32: invokevirtual   androidx/collection/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    35: checkcast       Landroidx/core/location/f$g;
        //    38: astore          9
        //    40: aload           9
        //    42: astore_1       
        //    43: aload           9
        //    45: ifnonnull       57
        //    48: new             Landroidx/core/location/f$g;
        //    51: astore_1       
        //    52: aload_1        
        //    53: aload_3        
        //    54: invokespecial   androidx/core/location/f$g.<init>:(Landroidx/core/location/a$a;)V
        //    57: aload_0        
        //    58: aload_2        
        //    59: aload_1        
        //    60: invokevirtual   android/location/LocationManager.registerGnssStatusCallback:(Ljava/util/concurrent/Executor;Landroid/location/GnssStatus$Callback;)Z
        //    63: ifeq            79
        //    66: aload           8
        //    68: aload_3        
        //    69: aload_1        
        //    70: invokevirtual   androidx/collection/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    73: pop            
        //    74: aload           8
        //    76: monitorexit    
        //    77: iconst_1       
        //    78: ireturn        
        //    79: aload           8
        //    81: monitorexit    
        //    82: iconst_0       
        //    83: ireturn        
        //    84: astore_0       
        //    85: aload           8
        //    87: monitorexit    
        //    88: aload_0        
        //    89: athrow         
        //    90: iload           4
        //    92: bipush          24
        //    94: if_icmplt       199
        //    97: aload_1        
        //    98: ifnull          107
        //   101: iconst_1       
        //   102: istore          10
        //   104: goto            110
        //   107: iconst_0       
        //   108: istore          10
        //   110: iload           10
        //   112: invokestatic    androidx/core/util/n.a:(Z)V
        //   115: getstatic       androidx/core/location/f.e:Landroidx/collection/m;
        //   118: astore          8
        //   120: aload           8
        //   122: monitorenter   
        //   123: aload           8
        //   125: aload_3        
        //   126: invokevirtual   androidx/collection/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   129: checkcast       Landroidx/core/location/f$j;
        //   132: astore          9
        //   134: aload           9
        //   136: ifnonnull       153
        //   139: new             Landroidx/core/location/f$j;
        //   142: astore          9
        //   144: aload           9
        //   146: aload_3        
        //   147: invokespecial   androidx/core/location/f$j.<init>:(Landroidx/core/location/a$a;)V
        //   150: goto            158
        //   153: aload           9
        //   155: invokevirtual   androidx/core/location/f$j.b:()V
        //   158: aload           9
        //   160: aload_2        
        //   161: invokevirtual   androidx/core/location/f$j.a:(Ljava/util/concurrent/Executor;)V
        //   164: aload_0        
        //   165: aload           9
        //   167: aload_1        
        //   168: invokevirtual   android/location/LocationManager.registerGnssStatusCallback:(Landroid/location/GnssStatus$Callback;Landroid/os/Handler;)Z
        //   171: ifeq            188
        //   174: aload           8
        //   176: aload_3        
        //   177: aload           9
        //   179: invokevirtual   androidx/collection/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   182: pop            
        //   183: aload           8
        //   185: monitorexit    
        //   186: iconst_1       
        //   187: ireturn        
        //   188: aload           8
        //   190: monitorexit    
        //   191: iconst_0       
        //   192: ireturn        
        //   193: astore_0       
        //   194: aload           8
        //   196: monitorexit    
        //   197: aload_0        
        //   198: athrow         
        //   199: aload_1        
        //   200: ifnull          209
        //   203: iconst_1       
        //   204: istore          10
        //   206: goto            212
        //   209: iconst_0       
        //   210: istore          10
        //   212: iload           10
        //   214: invokestatic    androidx/core/util/n.a:(Z)V
        //   217: getstatic       androidx/core/location/f.e:Landroidx/collection/m;
        //   220: astore          8
        //   222: aload           8
        //   224: monitorenter   
        //   225: aload           8
        //   227: aload_3        
        //   228: invokevirtual   androidx/collection/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   231: checkcast       Landroidx/core/location/f$h;
        //   234: astore          9
        //   236: aload           9
        //   238: ifnonnull       256
        //   241: new             Landroidx/core/location/f$h;
        //   244: astore          9
        //   246: aload           9
        //   248: aload_0        
        //   249: aload_3        
        //   250: invokespecial   androidx/core/location/f$h.<init>:(Landroid/location/LocationManager;Landroidx/core/location/a$a;)V
        //   253: goto            261
        //   256: aload           9
        //   258: invokevirtual   androidx/core/location/f$h.b:()V
        //   261: aload           9
        //   263: aload_2        
        //   264: invokevirtual   androidx/core/location/f$h.a:(Ljava/util/concurrent/Executor;)V
        //   267: new             Ljava/util/concurrent/FutureTask;
        //   270: astore_2       
        //   271: new             Landroidx/core/location/f$c;
        //   274: astore          11
        //   276: aload           11
        //   278: aload_0        
        //   279: aload           9
        //   281: invokespecial   androidx/core/location/f$c.<init>:(Landroid/location/LocationManager;Landroidx/core/location/f$h;)V
        //   284: aload_2        
        //   285: aload           11
        //   287: invokespecial   java/util/concurrent/FutureTask.<init>:(Ljava/util/concurrent/Callable;)V
        //   290: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //   293: aload_1        
        //   294: invokevirtual   android/os/Handler.getLooper:()Landroid/os/Looper;
        //   297: if_acmpne       307
        //   300: aload_2        
        //   301: invokevirtual   java/util/concurrent/FutureTask.run:()V
        //   304: goto            319
        //   307: aload_1        
        //   308: aload_2        
        //   309: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   312: istore          10
        //   314: iload           10
        //   316: ifeq            629
        //   319: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   322: ldc2_w          5
        //   325: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //   328: lstore          12
        //   330: invokestatic    java/lang/System.nanoTime:()J
        //   333: lstore          14
        //   335: iconst_0       
        //   336: istore          4
        //   338: lload           12
        //   340: lstore          16
        //   342: aload_2        
        //   343: lload           16
        //   345: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //   348: invokevirtual   java/util/concurrent/FutureTask.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   351: checkcast       Ljava/lang/Boolean;
        //   354: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   357: ifeq            386
        //   360: getstatic       androidx/core/location/f.e:Landroidx/collection/m;
        //   363: aload_3        
        //   364: aload           9
        //   366: invokevirtual   androidx/collection/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   369: pop            
        //   370: iload           4
        //   372: ifeq            381
        //   375: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   378: invokevirtual   java/lang/Thread.interrupt:()V
        //   381: aload           8
        //   383: monitorexit    
        //   384: iconst_1       
        //   385: ireturn        
        //   386: iload           4
        //   388: ifeq            397
        //   391: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   394: invokevirtual   java/lang/Thread.interrupt:()V
        //   397: aload           8
        //   399: monitorexit    
        //   400: iconst_0       
        //   401: ireturn        
        //   402: astore_0       
        //   403: goto            616
        //   406: astore_0       
        //   407: iload           4
        //   409: istore          7
        //   411: goto            471
        //   414: astore_0       
        //   415: iload           4
        //   417: istore          7
        //   419: goto            540
        //   422: astore_0       
        //   423: iload           6
        //   425: istore          4
        //   427: invokestatic    java/lang/System.nanoTime:()J
        //   430: lstore          16
        //   432: lload           14
        //   434: lload           12
        //   436: ladd           
        //   437: lload           16
        //   439: lsub           
        //   440: lstore          16
        //   442: iconst_1       
        //   443: istore          4
        //   445: goto            342
        //   448: astore_0       
        //   449: goto            471
        //   452: astore_0       
        //   453: iload           5
        //   455: istore          7
        //   457: goto            540
        //   460: astore_0       
        //   461: iconst_0       
        //   462: istore          4
        //   464: goto            616
        //   467: astore_0       
        //   468: iconst_0       
        //   469: istore          7
        //   471: iload           7
        //   473: istore          4
        //   475: new             Ljava/lang/IllegalStateException;
        //   478: astore_3       
        //   479: iload           7
        //   481: istore          4
        //   483: new             Ljava/lang/StringBuilder;
        //   486: astore_2       
        //   487: iload           7
        //   489: istore          4
        //   491: aload_2        
        //   492: invokespecial   java/lang/StringBuilder.<init>:()V
        //   495: iload           7
        //   497: istore          4
        //   499: aload_2        
        //   500: aload_1        
        //   501: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   504: pop            
        //   505: iload           7
        //   507: istore          4
        //   509: aload_2        
        //   510: ldc_w           " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
        //   513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   516: pop            
        //   517: iload           7
        //   519: istore          4
        //   521: aload_3        
        //   522: aload_2        
        //   523: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   526: aload_0        
        //   527: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   530: iload           7
        //   532: istore          4
        //   534: aload_3        
        //   535: athrow         
        //   536: astore_0       
        //   537: iconst_0       
        //   538: istore          7
        //   540: iload           7
        //   542: istore          4
        //   544: aload_0        
        //   545: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
        //   548: instanceof      Ljava/lang/RuntimeException;
        //   551: ifne            603
        //   554: iload           7
        //   556: istore          4
        //   558: aload_0        
        //   559: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
        //   562: instanceof      Ljava/lang/Error;
        //   565: ifeq            580
        //   568: iload           7
        //   570: istore          4
        //   572: aload_0        
        //   573: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
        //   576: checkcast       Ljava/lang/Error;
        //   579: athrow         
        //   580: iload           7
        //   582: istore          4
        //   584: new             Ljava/lang/IllegalStateException;
        //   587: astore_1       
        //   588: iload           7
        //   590: istore          4
        //   592: aload_1        
        //   593: aload_0        
        //   594: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   597: iload           7
        //   599: istore          4
        //   601: aload_1        
        //   602: athrow         
        //   603: iload           7
        //   605: istore          4
        //   607: aload_0        
        //   608: invokevirtual   java/util/concurrent/ExecutionException.getCause:()Ljava/lang/Throwable;
        //   611: checkcast       Ljava/lang/RuntimeException;
        //   614: athrow         
        //   615: astore_0       
        //   616: iload           4
        //   618: ifeq            627
        //   621: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   624: invokevirtual   java/lang/Thread.interrupt:()V
        //   627: aload_0        
        //   628: athrow         
        //   629: new             Ljava/lang/IllegalStateException;
        //   632: astore_2       
        //   633: new             Ljava/lang/StringBuilder;
        //   636: astore_0       
        //   637: aload_0        
        //   638: invokespecial   java/lang/StringBuilder.<init>:()V
        //   641: aload_0        
        //   642: aload_1        
        //   643: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   646: pop            
        //   647: aload_0        
        //   648: ldc_w           " is shutting down"
        //   651: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   654: pop            
        //   655: aload_2        
        //   656: aload_0        
        //   657: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   660: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   663: aload_2        
        //   664: athrow         
        //   665: astore_0       
        //   666: aload           8
        //   668: monitorexit    
        //   669: aload_0        
        //   670: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  29     40     84     90     Any
        //  48     57     84     90     Any
        //  57     77     84     90     Any
        //  79     82     84     90     Any
        //  85     88     84     90     Any
        //  123    134    193    199    Any
        //  139    150    193    199    Any
        //  153    158    193    199    Any
        //  158    186    193    199    Any
        //  188    191    193    199    Any
        //  194    197    193    199    Any
        //  225    236    665    671    Any
        //  241    253    665    671    Any
        //  256    261    665    671    Any
        //  261    304    665    671    Any
        //  307    314    665    671    Any
        //  319    335    536    540    Ljava/util/concurrent/ExecutionException;
        //  319    335    467    471    Ljava/util/concurrent/TimeoutException;
        //  319    335    460    467    Any
        //  342    370    422    460    Ljava/lang/InterruptedException;
        //  342    370    414    422    Ljava/util/concurrent/ExecutionException;
        //  342    370    406    414    Ljava/util/concurrent/TimeoutException;
        //  342    370    402    406    Any
        //  375    381    665    671    Any
        //  381    384    665    671    Any
        //  391    397    665    671    Any
        //  397    400    665    671    Any
        //  427    432    452    460    Ljava/util/concurrent/ExecutionException;
        //  427    432    448    452    Ljava/util/concurrent/TimeoutException;
        //  427    432    615    616    Any
        //  475    479    615    616    Any
        //  483    487    615    616    Any
        //  491    495    615    616    Any
        //  499    505    615    616    Any
        //  509    517    615    616    Any
        //  521    530    615    616    Any
        //  534    536    615    616    Any
        //  544    554    615    616    Any
        //  558    568    615    616    Any
        //  572    580    615    616    Any
        //  584    588    615    616    Any
        //  592    597    615    616    Any
        //  601    603    615    616    Any
        //  607    615    615    616    Any
        //  621    627    665    671    Any
        //  627    629    665    671    Any
        //  629    665    665    671    Any
        //  666    669    665    671    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0471:
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
    
    @s0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean f(@j0 final LocationManager locationManager, @j0 final a.a a, @j0 final Handler handler) {
        if (Build$VERSION.SDK_INT >= 30) {
            return g(locationManager, f.a(handler), a);
        }
        return g(locationManager, new i(handler), a);
    }
    
    @s0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean g(@j0 final LocationManager locationManager, @j0 final Executor executor, @j0 final a.a a) {
        if (Build$VERSION.SDK_INT >= 30) {
            return e(locationManager, null, executor, a);
        }
        Looper looper;
        if ((looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        return e(locationManager, new Handler(looper), executor, a);
    }
    
    public static void h(@j0 final LocationManager locationManager, @j0 final a.a a) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            final m<Object, Object> m = f.e;
            synchronized (m) {
                final g g = m.remove(a);
                if (g != null) {
                    locationManager.unregisterGnssStatusCallback((GnssStatus$Callback)g);
                }
                return;
            }
        }
        if (sdk_INT >= 24) {
            final m<Object, Object> m = f.e;
            synchronized (m) {
                final j j = m.remove(a);
                if (j != null) {
                    j.b();
                    locationManager.unregisterGnssStatusCallback((GnssStatus$Callback)j);
                }
                return;
            }
        }
        final m<Object, Object> m = f.e;
        synchronized (m) {
            final h h = m.remove(a);
            if (h != null) {
                h.b();
                locationManager.removeGpsStatusListener((GpsStatus$Listener)h);
            }
        }
    }
    
    @p0(28)
    private static class d
    {
        @r
        static String a(final LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }
        
        @r
        static int b(final LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }
        
        @r
        static boolean c(final LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }
    
    @p0(30)
    private static class e
    {
        @r
        @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
        static void a(final LocationManager locationManager, @j0 final String s, @k0 final c c, @j0 final Executor executor, @j0 final androidx.core.util.c<Location> c2) {
            CancellationSignal cancellationSignal;
            if (c != null) {
                cancellationSignal = (CancellationSignal)c.b();
            }
            else {
                cancellationSignal = null;
            }
            locationManager.getCurrentLocation(s, cancellationSignal, executor, (Consumer)new Consumer<Location>() {
                public void a(final Location location) {
                    c2.accept(location);
                }
            });
        }
    }
    
    private static final class f implements LocationListener
    {
        private final LocationManager a;
        private final Executor b;
        private final Handler c;
        private androidx.core.util.c<Location> d;
        @w("this")
        private boolean e;
        @k0
        Runnable f;
        
        f(final LocationManager a, final Executor b, final androidx.core.util.c<Location> d) {
            this.a = a;
            this.b = b;
            this.c = new Handler(Looper.getMainLooper());
            this.d = d;
        }
        
        @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
        private void b() {
            this.d = null;
            this.a.removeUpdates((LocationListener)this);
            final Runnable f = this.f;
            if (f != null) {
                this.c.removeCallbacks(f);
                this.f = null;
            }
        }
        
        @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
        public void a() {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                // monitorexit(this)
                this.b();
            }
        }
        
        public void c(final long n) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                final Runnable f = new Runnable() {
                    @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
                    @Override
                    public void run() {
                        final f g = androidx.core.location.f.f.this;
                        g.f = null;
                        g.onLocationChanged(null);
                    }
                };
                this.f = f;
                this.c.postDelayed((Runnable)f, n);
            }
        }
        
        @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
        public void onLocationChanged(@k0 final Location location) {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.e = true;
                // monitorexit(this)
                this.b.execute(new Runnable() {
                    final /* synthetic */ androidx.core.util.c G = androidx.core.location.f.f.this.d;
                    
                    @Override
                    public void run() {
                        this.G.accept(location);
                    }
                });
                this.b();
            }
        }
        
        @s0(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
        public void onProviderDisabled(@j0 final String s) {
            this.onLocationChanged(null);
        }
        
        public void onProviderEnabled(@j0 final String s) {
        }
        
        public void onStatusChanged(final String s, final int n, final Bundle bundle) {
        }
    }
    
    @p0(30)
    private static class g extends GnssStatus$Callback
    {
        final a.a a;
        
        g(final a.a a) {
            n.b(a != null, "invalid null callback");
            this.a = a;
        }
        
        public void onFirstFix(final int n) {
            this.a.a(n);
        }
        
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            this.a.b(androidx.core.location.a.n(gnssStatus));
        }
        
        public void onStarted() {
            this.a.c();
        }
        
        public void onStopped() {
            this.a.d();
        }
    }
    
    private static class h implements GpsStatus$Listener
    {
        private final LocationManager a;
        final a.a b;
        @k0
        volatile Executor c;
        
        h(final LocationManager a, final a.a b) {
            n.b(b != null, "invalid null callback");
            this.a = a;
            this.b = b;
        }
        
        public void a(final Executor c) {
            n.i(this.c == null);
            this.c = c;
        }
        
        public void b() {
            this.c = null;
        }
        
        @s0("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(final int n) {
            final Executor c = this.c;
            if (c == null) {
                return;
            }
            Runnable runnable2;
            if (n != 1) {
                if (n != 2) {
                    Runnable runnable;
                    if (n != 3) {
                        if (n != 4) {
                            return;
                        }
                        final GpsStatus gpsStatus = this.a.getGpsStatus((GpsStatus)null);
                        if (gpsStatus == null) {
                            return;
                        }
                        runnable = new Runnable() {
                            final /* synthetic */ a H = androidx.core.location.a.o(gpsStatus);
                            
                            @Override
                            public void run() {
                                if (h.this.c != c) {
                                    return;
                                }
                                h.this.b.b(this.H);
                            }
                        };
                    }
                    else {
                        final GpsStatus gpsStatus2 = this.a.getGpsStatus((GpsStatus)null);
                        if (gpsStatus2 == null) {
                            return;
                        }
                        runnable = new Runnable() {
                            final /* synthetic */ int H = gpsStatus2.getTimeToFirstFix();
                            
                            @Override
                            public void run() {
                                if (h.this.c != c) {
                                    return;
                                }
                                h.this.b.a(this.H);
                            }
                        };
                    }
                    c.execute(runnable);
                    return;
                }
                runnable2 = new Runnable() {
                    @Override
                    public void run() {
                        if (h.this.c != c) {
                            return;
                        }
                        h.this.b.d();
                    }
                };
            }
            else {
                runnable2 = new Runnable() {
                    @Override
                    public void run() {
                        if (h.this.c != c) {
                            return;
                        }
                        h.this.b.c();
                    }
                };
            }
            c.execute(runnable2);
        }
    }
    
    private static final class i implements Executor
    {
        private final Handler G;
        
        i(@j0 final Handler handler) {
            this.G = n.g(handler);
        }
        
        @Override
        public void execute(@j0 final Runnable runnable) {
            if (Looper.myLooper() == this.G.getLooper()) {
                runnable.run();
            }
            else if (!this.G.post((Runnable)n.g(runnable))) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.G);
                sb.append(" is shutting down");
                throw new RejectedExecutionException(sb.toString());
            }
        }
    }
    
    @p0(24)
    private static class j extends GnssStatus$Callback
    {
        final a.a a;
        @k0
        volatile Executor b;
        
        j(final a.a a) {
            n.b(a != null, "invalid null callback");
            this.a = a;
        }
        
        public void a(final Executor b) {
            final boolean b2 = true;
            n.b(b != null, "invalid null executor");
            n.i(this.b == null && b2);
            this.b = b;
        }
        
        public void b() {
            this.b = null;
        }
        
        public void onFirstFix(final int n) {
            final Executor b = this.b;
            if (b == null) {
                return;
            }
            b.execute(new Runnable() {
                @Override
                public void run() {
                    if (j.this.b != b) {
                        return;
                    }
                    j.this.a.a(n);
                }
            });
        }
        
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor b = this.b;
            if (b == null) {
                return;
            }
            b.execute(new Runnable() {
                @Override
                public void run() {
                    if (j.this.b != b) {
                        return;
                    }
                    j.this.a.b(androidx.core.location.a.n(gnssStatus));
                }
            });
        }
        
        public void onStarted() {
            final Executor b = this.b;
            if (b == null) {
                return;
            }
            b.execute(new Runnable() {
                @Override
                public void run() {
                    if (j.this.b != b) {
                        return;
                    }
                    j.this.a.c();
                }
            });
        }
        
        public void onStopped() {
            final Executor b = this.b;
            if (b == null) {
                return;
            }
            b.execute(new Runnable() {
                @Override
                public void run() {
                    if (j.this.b != b) {
                        return;
                    }
                    j.this.a.d();
                }
            });
        }
    }
}
