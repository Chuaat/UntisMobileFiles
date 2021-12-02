// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.content.ComponentName;
import androidx.annotation.j0;
import com.google.android.gms.common.c;
import androidx.annotation.g0;
import android.os.DeadObjectException;
import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import android.os.Looper;
import androidx.annotation.c1;
import android.content.Context;
import com.google.android.gms.common.stats.a;
import android.content.Intent;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.e;
import android.content.ServiceConnection;

@d0
public final class t8 implements ServiceConnection, a, b
{
    private volatile boolean c;
    private volatile j3 d;
    final /* synthetic */ u8 e;
    
    protected t8(final u8 e) {
        this.e = e;
    }
    
    @c1
    public final void b(final Intent intent) {
        this.e.e();
        final Context x = this.e.a.X();
        final com.google.android.gms.common.stats.a b = a.b();
        synchronized (this) {
            if (this.c) {
                this.e.a.c().s().a("Connection attempt already in progress");
                return;
            }
            this.e.a.c().s().a("Using local app measurement service");
            this.c = true;
            b.a(x, intent, (ServiceConnection)u8.G(this.e), 129);
        }
    }
    
    @c1
    public final void c() {
        this.e.e();
        final Context x = this.e.a.X();
        synchronized (this) {
            if (this.c) {
                this.e.a.c().s().a("Connection attempt already in progress");
                return;
            }
            if (this.d != null && (this.d.l() || this.d.a())) {
                this.e.a.c().s().a("Already awaiting connection attempt");
                return;
            }
            this.d = new j3(x, Looper.getMainLooper(), this, this);
            this.e.a.c().s().a("Connecting to remote service");
            this.c = true;
            com.google.android.gms.common.internal.x.k(this.d);
            this.d.z();
        }
    }
    
    @c1
    public final void d() {
        if (this.d != null && (this.d.a() || this.d.l())) {
            this.d.d();
        }
        this.d = null;
    }
    
    @g0
    public final void onConnected(final Bundle bundle) {
        com.google.android.gms.common.internal.x.f("MeasurementServiceConnection.onConnected");
        // monitorenter(this)
        try {
            try {
                com.google.android.gms.common.internal.x.k(this.d);
                this.e.a.b().w(new q8(this, this.d.K()));
            }
            finally {
            }
            // monitorexit(this)
            // monitorexit(this)
        }
        catch (DeadObjectException ex) {}
        catch (IllegalStateException ex2) {}
    }
    
    @g0
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        com.google.android.gms.common.internal.x.f("MeasurementServiceConnection.onConnectionFailed");
        final n3 b = this.e.a.B();
        if (b != null) {
            b.t().b("Service connection failed", c);
        }
        synchronized (this) {
            this.c = false;
            this.d = null;
            // monitorexit(this)
            this.e.a.b().w(new s8(this));
        }
    }
    
    @g0
    public final void onConnectionSuspended(final int n) {
        com.google.android.gms.common.internal.x.f("MeasurementServiceConnection.onConnectionSuspended");
        this.e.a.c().n().a("Service connection suspended");
        this.e.a.b().w(new r8(this));
    }
    
    @g0
    public final void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/google/android/gms/common/internal/x.f:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: ifnonnull       37
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        com/google/android/gms/measurement/internal/t8.c:Z
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //    20: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    23: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    26: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    29: ldc             "Service connected with null binder"
        //    31: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //    34: aload_0        
        //    35: monitorexit    
        //    36: return         
        //    37: aconst_null    
        //    38: astore_3       
        //    39: aconst_null    
        //    40: astore          4
        //    42: aload           4
        //    44: astore_1       
        //    45: aload_2        
        //    46: invokeinterface android/os/IBinder.getInterfaceDescriptor:()Ljava/lang/String;
        //    51: astore          5
        //    53: aload           4
        //    55: astore_1       
        //    56: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    58: aload           5
        //    60: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    63: ifeq            139
        //    66: aload           4
        //    68: astore_1       
        //    69: aload_2        
        //    70: ldc             "com.google.android.gms.measurement.internal.IMeasurementService"
        //    72: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    77: astore_3       
        //    78: aload           4
        //    80: astore_1       
        //    81: aload_3        
        //    82: instanceof      Lcom/google/android/gms/measurement/internal/d3;
        //    85: ifeq            99
        //    88: aload           4
        //    90: astore_1       
        //    91: aload_3        
        //    92: checkcast       Lcom/google/android/gms/measurement/internal/d3;
        //    95: astore_2       
        //    96: goto            114
        //    99: aload           4
        //   101: astore_1       
        //   102: new             Lcom/google/android/gms/measurement/internal/b3;
        //   105: dup            
        //   106: aload_2        
        //   107: invokespecial   com/google/android/gms/measurement/internal/b3.<init>:(Landroid/os/IBinder;)V
        //   110: astore_2       
        //   111: goto            96
        //   114: aload_2        
        //   115: astore_1       
        //   116: aload_0        
        //   117: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   120: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   123: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   126: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   129: ldc             "Bound to IMeasurementService interface"
        //   131: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   134: aload_2        
        //   135: astore_1       
        //   136: goto            190
        //   139: aload           4
        //   141: astore_1       
        //   142: aload_0        
        //   143: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   146: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   149: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   152: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   155: ldc             "Got binder with a wrong descriptor"
        //   157: aload           5
        //   159: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   162: aload_3        
        //   163: astore_1       
        //   164: goto            190
        //   167: astore_1       
        //   168: goto            257
        //   171: astore_2       
        //   172: aload_0        
        //   173: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   176: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   179: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   182: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   185: ldc             "Service connect failed to get IMeasurementService"
        //   187: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   190: aload_1        
        //   191: ifnonnull       225
        //   194: aload_0        
        //   195: iconst_0       
        //   196: putfield        com/google/android/gms/measurement/internal/t8.c:Z
        //   199: invokestatic    com/google/android/gms/common/stats/a.b:()Lcom/google/android/gms/common/stats/a;
        //   202: aload_0        
        //   203: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   206: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   209: invokevirtual   com/google/android/gms/measurement/internal/z4.X:()Landroid/content/Context;
        //   212: aload_0        
        //   213: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   216: invokestatic    com/google/android/gms/measurement/internal/u8.G:(Lcom/google/android/gms/measurement/internal/u8;)Lcom/google/android/gms/measurement/internal/t8;
        //   219: invokevirtual   com/google/android/gms/common/stats/a.c:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   222: goto            254
        //   225: aload_0        
        //   226: getfield        com/google/android/gms/measurement/internal/t8.e:Lcom/google/android/gms/measurement/internal/u8;
        //   229: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   232: invokevirtual   com/google/android/gms/measurement/internal/z4.b:()Lcom/google/android/gms/measurement/internal/w4;
        //   235: astore_2       
        //   236: new             Lcom/google/android/gms/measurement/internal/o8;
        //   239: astore          4
        //   241: aload           4
        //   243: aload_0        
        //   244: aload_1        
        //   245: invokespecial   com/google/android/gms/measurement/internal/o8.<init>:(Lcom/google/android/gms/measurement/internal/t8;Lcom/google/android/gms/measurement/internal/d3;)V
        //   248: aload_2        
        //   249: aload           4
        //   251: invokevirtual   com/google/android/gms/measurement/internal/w4.w:(Ljava/lang/Runnable;)V
        //   254: aload_0        
        //   255: monitorexit    
        //   256: return         
        //   257: aload_0        
        //   258: monitorexit    
        //   259: aload_1        
        //   260: athrow         
        //   261: astore_1       
        //   262: goto            254
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     36     167    261    Any
        //  45     53     171    190    Landroid/os/RemoteException;
        //  45     53     167    261    Any
        //  56     66     171    190    Landroid/os/RemoteException;
        //  56     66     167    261    Any
        //  69     78     171    190    Landroid/os/RemoteException;
        //  69     78     167    261    Any
        //  81     88     171    190    Landroid/os/RemoteException;
        //  81     88     167    261    Any
        //  91     96     171    190    Landroid/os/RemoteException;
        //  91     96     167    261    Any
        //  102    111    171    190    Landroid/os/RemoteException;
        //  102    111    167    261    Any
        //  116    134    171    190    Landroid/os/RemoteException;
        //  116    134    167    261    Any
        //  142    162    171    190    Landroid/os/RemoteException;
        //  142    162    167    261    Any
        //  172    190    167    261    Any
        //  194    199    167    261    Any
        //  199    222    261    265    Ljava/lang/IllegalArgumentException;
        //  199    222    167    261    Any
        //  225    254    167    261    Any
        //  254    256    167    261    Any
        //  257    259    167    261    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    @g0
    public final void onServiceDisconnected(final ComponentName componentName) {
        com.google.android.gms.common.internal.x.f("MeasurementServiceConnection.onServiceDisconnected");
        this.e.a.c().n().a("Service disconnected");
        this.e.a.b().w(new p8(this, componentName));
    }
}
