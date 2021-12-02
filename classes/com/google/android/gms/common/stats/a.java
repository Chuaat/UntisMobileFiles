// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.n1;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.util.Log;
import com.google.android.gms.common.util.e;
import android.content.Intent;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.x;
import android.content.ServiceConnection;
import java.util.concurrent.ConcurrentHashMap;
import com.google.android.gms.common.util.d0;
import c6.h;

@f2.a
public class a
{
    private static final Object b;
    @h
    private static volatile a c;
    @d0
    private static boolean d = false;
    @d0
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> a;
    
    static {
        b = new Object();
    }
    
    private a() {
        this.a = new ConcurrentHashMap<ServiceConnection, ServiceConnection>();
    }
    
    @RecentlyNonNull
    @f2.a
    public static a b() {
        if (a.c == null) {
            synchronized (a.b) {
                if (a.c == null) {
                    a.c = new a();
                }
            }
        }
        return x.k(a.c);
    }
    
    @SuppressLint({ "UntrackedBindService" })
    private final boolean f(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, boolean bindService) {
        final ComponentName component = intent.getComponent();
        bindService = (component != null && e.c(context, component.getPackageName()));
        if (bindService) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (g(serviceConnection)) {
            final ServiceConnection serviceConnection2 = this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, s, intent.getAction()));
            }
            try {
                final boolean bindService2 = context.bindService(intent, serviceConnection, n);
                if (!(bindService = bindService2)) {
                    this.a.remove(serviceConnection, serviceConnection);
                    bindService = bindService2;
                    return bindService;
                }
                return bindService;
            }
            finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        bindService = context.bindService(intent, serviceConnection, n);
        return bindService;
    }
    
    private static boolean g(final ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof n1);
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean a(@RecentlyNonNull final Context context, @RecentlyNonNull final Intent intent, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final int n) {
        return this.e(context, context.getClass().getName(), intent, serviceConnection, n);
    }
    
    @SuppressLint({ "UntrackedBindService" })
    @f2.a
    public void c(@RecentlyNonNull final Context p0, @RecentlyNonNull final ServiceConnection p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/stats/a.g:(Landroid/content/ServiceConnection;)Z
        //     4: ifeq            57
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/common/stats/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    11: aload_2        
        //    12: invokevirtual   java/util/concurrent/ConcurrentHashMap.containsKey:(Ljava/lang/Object;)Z
        //    15: ifeq            57
        //    18: aload_0        
        //    19: getfield        com/google/android/gms/common/stats/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    22: aload_2        
        //    23: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: checkcast       Landroid/content/ServiceConnection;
        //    29: astore_3       
        //    30: aload_1        
        //    31: aload_3        
        //    32: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/common/stats/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    39: aload_2        
        //    40: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: pop            
        //    44: return         
        //    45: astore_1       
        //    46: aload_0        
        //    47: getfield        com/google/android/gms/common/stats/a.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    50: aload_2        
        //    51: invokevirtual   java/util/concurrent/ConcurrentHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: pop            
        //    55: aload_1        
        //    56: athrow         
        //    57: aload_1        
        //    58: aload_2        
        //    59: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    62: return         
        //    63: astore_1       
        //    64: goto            35
        //    67: astore_1       
        //    68: goto            62
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  18     30     45     57     Any
        //  30     35     63     67     Ljava/lang/IllegalArgumentException;
        //  30     35     63     67     Ljava/lang/IllegalStateException;
        //  30     35     45     57     Any
        //  57     62     67     71     Ljava/lang/IllegalArgumentException;
        //  57     62     67     71     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    @SuppressLint({ "UntrackedBindService" })
    @f2.a
    public void d(@RecentlyNonNull final Context context, @RecentlyNonNull final ServiceConnection serviceConnection) {
        try {
            this.c(context, serviceConnection);
        }
        catch (IllegalArgumentException ex) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", (Throwable)ex);
        }
    }
    
    @RecentlyNonNull
    public final boolean e(@RecentlyNonNull final Context context, @RecentlyNonNull final String s, @RecentlyNonNull final Intent intent, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final int n) {
        return this.f(context, s, intent, serviceConnection, n, true);
    }
}
