// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.k0;
import androidx.annotation.b1;
import android.content.BroadcastReceiver;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.util.Log;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import androidx.annotation.w;

class d1 implements Runnable
{
    private static final Object L;
    @w("TOPIC_SYNC_TASK_LOCK")
    private static Boolean M;
    @w("TOPIC_SYNC_TASK_LOCK")
    private static Boolean N;
    private final Context G;
    private final m0 H;
    private final PowerManager$WakeLock I;
    private final c1 J;
    private final long K;
    
    static {
        L = new Object();
    }
    
    d1(final c1 j, final Context g, final m0 h, final long k) {
        this.J = j;
        this.G = g;
        this.K = k;
        this.H = h;
        this.I = ((PowerManager)g.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
    
    private static String e(final String str) {
        final StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }
    
    private static boolean f(final Context context) {
        synchronized (d1.L) {
            final Boolean n = d1.N;
            boolean b;
            if (n == null) {
                b = g(context, "android.permission.ACCESS_NETWORK_STATE", n);
            }
            else {
                b = n;
            }
            return d1.N = b;
        }
    }
    
    private static boolean g(final Context context, final String s, final Boolean b) {
        if (b != null) {
            return b;
        }
        final boolean b2 = context.checkCallingOrSelfPermission(s) == 0;
        if (!b2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(s));
            return false;
        }
        return b2;
    }
    
    private static boolean h(final Context context) {
        synchronized (d1.L) {
            final Boolean m = d1.M;
            boolean b;
            if (m == null) {
                b = g(context, "android.permission.WAKE_LOCK", m);
            }
            else {
                b = m;
            }
            return d1.M = b;
        }
    }
    
    private boolean i() {
        synchronized (this) {
            final ConnectivityManager connectivityManager = (ConnectivityManager)this.G.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo;
            if (connectivityManager != null) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            else {
                activeNetworkInfo = null;
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
    }
    
    private static boolean j() {
        final boolean loggable = Log.isLoggable("FirebaseMessaging", 3);
        boolean b = false;
        if (!loggable) {
            if (Build$VERSION.SDK_INT != 23) {
                return b;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @SuppressLint({ "Wakelock" })
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //     4: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //     7: ifeq            20
        //    10: aload_0        
        //    11: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //    14: getstatic       com/google/firebase/messaging/c.c:J
        //    17: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    20: aload_0        
        //    21: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //    24: iconst_1       
        //    25: invokevirtual   com/google/firebase/messaging/c1.n:(Z)V
        //    28: aload_0        
        //    29: getfield        com/google/firebase/messaging/d1.H:Lcom/google/firebase/messaging/m0;
        //    32: invokevirtual   com/google/firebase/messaging/m0.g:()Z
        //    35: ifne            74
        //    38: aload_0        
        //    39: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //    42: iconst_0       
        //    43: invokevirtual   com/google/firebase/messaging/c1.n:(Z)V
        //    46: aload_0        
        //    47: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //    50: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //    53: ifeq            73
        //    56: aload_0        
        //    57: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //    60: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    63: return         
        //    64: astore_1       
        //    65: ldc             "FirebaseMessaging"
        //    67: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //    69: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    72: pop            
        //    73: return         
        //    74: aload_0        
        //    75: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //    78: invokestatic    com/google/firebase/messaging/d1.f:(Landroid/content/Context;)Z
        //    81: ifeq            133
        //    84: aload_0        
        //    85: invokespecial   com/google/firebase/messaging/d1.i:()Z
        //    88: ifne            133
        //    91: new             Lcom/google/firebase/messaging/d1$a;
        //    94: astore_1       
        //    95: aload_1        
        //    96: aload_0        
        //    97: aload_0        
        //    98: invokespecial   com/google/firebase/messaging/d1$a.<init>:(Lcom/google/firebase/messaging/d1;Lcom/google/firebase/messaging/d1;)V
        //   101: aload_1        
        //   102: invokevirtual   com/google/firebase/messaging/d1$a.a:()V
        //   105: aload_0        
        //   106: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //   109: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //   112: ifeq            132
        //   115: aload_0        
        //   116: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //   119: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   122: return         
        //   123: astore_1       
        //   124: ldc             "FirebaseMessaging"
        //   126: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   128: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   131: pop            
        //   132: return         
        //   133: aload_0        
        //   134: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //   137: invokevirtual   com/google/firebase/messaging/c1.r:()Z
        //   140: ifeq            154
        //   143: aload_0        
        //   144: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //   147: iconst_0       
        //   148: invokevirtual   com/google/firebase/messaging/c1.n:(Z)V
        //   151: goto            165
        //   154: aload_0        
        //   155: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //   158: aload_0        
        //   159: getfield        com/google/firebase/messaging/d1.K:J
        //   162: invokevirtual   com/google/firebase/messaging/c1.s:(J)V
        //   165: aload_0        
        //   166: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //   169: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //   172: ifeq            275
        //   175: aload_0        
        //   176: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //   179: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   182: return         
        //   183: astore_1       
        //   184: ldc             "FirebaseMessaging"
        //   186: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   188: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   191: pop            
        //   192: return         
        //   193: astore_2       
        //   194: goto            276
        //   197: astore_1       
        //   198: aload_1        
        //   199: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   202: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   205: astore_1       
        //   206: aload_1        
        //   207: invokevirtual   java/lang/String.length:()I
        //   210: ifeq            223
        //   213: ldc             "Failed to sync topics. Won't retry sync. "
        //   215: aload_1        
        //   216: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   219: astore_1       
        //   220: goto            233
        //   223: new             Ljava/lang/String;
        //   226: dup            
        //   227: ldc             "Failed to sync topics. Won't retry sync. "
        //   229: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   232: astore_1       
        //   233: ldc             "FirebaseMessaging"
        //   235: aload_1        
        //   236: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   239: pop            
        //   240: aload_0        
        //   241: getfield        com/google/firebase/messaging/d1.J:Lcom/google/firebase/messaging/c1;
        //   244: iconst_0       
        //   245: invokevirtual   com/google/firebase/messaging/c1.n:(Z)V
        //   248: aload_0        
        //   249: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //   252: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //   255: ifeq            275
        //   258: aload_0        
        //   259: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //   262: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   265: return         
        //   266: astore_1       
        //   267: ldc             "FirebaseMessaging"
        //   269: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   271: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   274: pop            
        //   275: return         
        //   276: aload_0        
        //   277: getfield        com/google/firebase/messaging/d1.G:Landroid/content/Context;
        //   280: invokestatic    com/google/firebase/messaging/d1.h:(Landroid/content/Context;)Z
        //   283: ifeq            305
        //   286: aload_0        
        //   287: getfield        com/google/firebase/messaging/d1.I:Landroid/os/PowerManager$WakeLock;
        //   290: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   293: goto            305
        //   296: astore_1       
        //   297: ldc             "FirebaseMessaging"
        //   299: ldc             "TopicsSyncTask's wakelock was already released due to timeout."
        //   301: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   304: pop            
        //   305: aload_2        
        //   306: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     46     197    275    Ljava/io/IOException;
        //  20     46     193    307    Any
        //  56     63     64     73     Ljava/lang/RuntimeException;
        //  74     105    197    275    Ljava/io/IOException;
        //  74     105    193    307    Any
        //  115    122    123    132    Ljava/lang/RuntimeException;
        //  133    151    197    275    Ljava/io/IOException;
        //  133    151    193    307    Any
        //  154    165    197    275    Ljava/io/IOException;
        //  154    165    193    307    Any
        //  175    182    183    193    Ljava/lang/RuntimeException;
        //  198    220    193    307    Any
        //  223    233    193    307    Any
        //  233    248    193    307    Any
        //  258    265    266    275    Ljava/lang/RuntimeException;
        //  286    293    296    305    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 148 out of bounds for length 148
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    @b1
    class a extends BroadcastReceiver
    {
        @k0
        @w("this")
        private d1 a;
        
        public a(final d1 a) {
            this.a = a;
        }
        
        public void a() {
            if (j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d1.this.G.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public void onReceive(final Context context, final Intent intent) {
            synchronized (this) {
                final d1 a = this.a;
                if (a == null) {
                    return;
                }
                if (!a.i()) {
                    return;
                }
                if (j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.J.l(this.a, 0L);
                context.unregisterReceiver((BroadcastReceiver)this);
                this.a = null;
            }
        }
    }
}
