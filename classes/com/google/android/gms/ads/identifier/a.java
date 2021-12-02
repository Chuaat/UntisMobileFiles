// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.ads.identifier;

import java.util.concurrent.CountDownLatch;
import java.lang.ref.WeakReference;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;
import java.util.HashMap;
import com.google.android.gms.internal.ads_identifier.f;
import java.util.concurrent.TimeUnit;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;
import java.io.IOException;
import android.os.SystemClock;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.x;
import android.content.Context;
import com.google.android.gms.internal.ads_identifier.e;
import androidx.annotation.k0;
import com.google.android.gms.common.b;
import c6.j;

@j
@a
public class a
{
    @k0
    @d6.a("this")
    private com.google.android.gms.common.b a;
    @k0
    @d6.a("this")
    private e b;
    @d6.a("this")
    private boolean c;
    private final Object d;
    @k0
    @d6.a("mAutoDisconnectTaskLock")
    private b e;
    @d6.a("this")
    private final Context f;
    private final boolean g;
    private final long h;
    
    @a
    public a(final Context context) {
        this(context, 30000L, false, false);
    }
    
    @d0
    private a(final Context context, final long h, final boolean b, final boolean g) {
        this.d = new Object();
        x.k(context);
        Context applicationContext = context;
        if (b) {
            applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
        }
        this.f = applicationContext;
        this.c = false;
        this.h = h;
        this.g = g;
    }
    
    @a
    public static a b(Context context) throws IOException, IllegalStateException, i, com.google.android.gms.common.j {
        final c c = new c(context);
        final boolean a = c.a("gads:ad_id_app_context:enabled", false);
        final float b = c.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        final String c2 = c.c("gads:ad_id_use_shared_preference:experiment_id", "");
        context = (Context)new a(context, -1L, a, c.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            ((a)context).j(false);
            final a c3 = ((a)context).c();
            ((a)context).k(c3, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c2, null);
            ((a)context).a();
            return c3;
        }
        finally {
            try {
                final Throwable t;
                ((a)context).k(null, a, b, -1L, c2, t);
            }
            finally {
                ((a)context).a();
            }
        }
    }
    
    @a
    public static boolean d(Context context) throws IOException, i, com.google.android.gms.common.j {
        final c c = new c(context);
        context = (Context)new a(context, -1L, c.a("gads:ad_id_app_context:enabled", false), c.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            ((a)context).j(false);
            return ((a)context).l();
        }
        finally {
            ((a)context).a();
        }
    }
    
    @a
    public static void e(final boolean b) {
    }
    
    private static com.google.android.gms.common.b g(final Context context, final boolean b) throws IOException, i, com.google.android.gms.common.j {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            final int k = h.i().k(context, 12451000);
            if (k != 0 && k != 2) {
                throw new IOException("Google Play services not available");
            }
            String s;
            if (b) {
                s = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
            }
            else {
                s = "com.google.android.gms.ads.identifier.service.START";
            }
            final com.google.android.gms.common.b b2 = new com.google.android.gms.common.b();
            final Intent intent = new Intent(s);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.a.b().a(context, intent, (ServiceConnection)b2, 1)) {
                    return b2;
                }
                throw new IOException("Connection failure");
            }
            finally {
                final Throwable cause;
                throw new IOException(cause);
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new i(9);
        }
    }
    
    @d0
    private static e h(final Context context, final com.google.android.gms.common.b b) throws IOException {
        try {
            return f.H(b.b(10000L, TimeUnit.MILLISECONDS));
        }
        catch (InterruptedException ex) {
            throw new IOException("Interrupted exception");
        }
        finally {
            final Throwable cause;
            throw new IOException(cause);
        }
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/ads/identifier/a.d:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/ads/identifier/a.e:Lcom/google/android/gms/ads/identifier/a$b;
        //    11: astore_2       
        //    12: aload_2        
        //    13: ifnull          30
        //    16: aload_2        
        //    17: getfield        com/google/android/gms/ads/identifier/a$b.I:Ljava/util/concurrent/CountDownLatch;
        //    20: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    23: aload_0        
        //    24: getfield        com/google/android/gms/ads/identifier/a.e:Lcom/google/android/gms/ads/identifier/a$b;
        //    27: invokevirtual   java/lang/Thread.join:()V
        //    30: aload_0        
        //    31: getfield        com/google/android/gms/ads/identifier/a.h:J
        //    34: lconst_0       
        //    35: lcmp           
        //    36: ifle            57
        //    39: new             Lcom/google/android/gms/ads/identifier/a$b;
        //    42: astore_2       
        //    43: aload_2        
        //    44: aload_0        
        //    45: aload_0        
        //    46: getfield        com/google/android/gms/ads/identifier/a.h:J
        //    49: invokespecial   com/google/android/gms/ads/identifier/a$b.<init>:(Lcom/google/android/gms/ads/identifier/a;J)V
        //    52: aload_0        
        //    53: aload_2        
        //    54: putfield        com/google/android/gms/ads/identifier/a.e:Lcom/google/android/gms/ads/identifier/a$b;
        //    57: aload_1        
        //    58: monitorexit    
        //    59: return         
        //    60: astore_2       
        //    61: aload_1        
        //    62: monitorexit    
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_2       
        //    66: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      12     60     65     Any
        //  16     23     60     65     Any
        //  23     30     65     69     Ljava/lang/InterruptedException;
        //  23     30     60     65     Any
        //  30     57     60     65     Any
        //  57     59     60     65     Any
        //  61     63     60     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    @d0
    private final void j(final boolean b) throws IOException, IllegalStateException, i, com.google.android.gms.common.j {
        x.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                this.a();
            }
            final com.google.android.gms.common.b g = g(this.f, this.g);
            this.a = g;
            this.b = h(this.f, g);
            this.c = true;
            if (b) {
                this.i();
            }
        }
    }
    
    @d0
    private final boolean k(final a a, final boolean b, final float n, final long i, final String s, final Throwable t) {
        if (Math.random() > n) {
            return false;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final String s2 = "1";
        String s3;
        if (b) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        hashMap.put("app_context", s3);
        if (a != null) {
            String s4;
            if (a.b()) {
                s4 = s2;
            }
            else {
                s4 = "0";
            }
            hashMap.put("limit_ad_tracking", s4);
        }
        if (a != null && a.a() != null) {
            hashMap.put("ad_id_size", Integer.toString(a.a().length()));
        }
        if (t != null) {
            hashMap.put("error", t.getClass().getName());
        }
        if (s != null && !s.isEmpty()) {
            hashMap.put("experiment_id", s);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(i));
        new com.google.android.gms.ads.identifier.b(this, hashMap).start();
        return true;
    }
    
    private final boolean l() throws IOException {
        x.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Label_0100: {
                if (!this.c) {
                    Object d = this.d;
                    synchronized (d) {
                        final b e = this.e;
                        if (e != null && e.J) {
                            // monitorexit(d)
                            try {
                                this.j(false);
                                if (this.c) {
                                    break Label_0100;
                                }
                                d = new IOException("AdvertisingIdClient cannot reconnect.");
                                throw d;
                            }
                            catch (Exception cause) {
                                d = new IOException("AdvertisingIdClient cannot reconnect.", cause);
                                throw d;
                            }
                        }
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
            }
            x.k(this.a);
            x.k(this.b);
            try {
                final boolean a = this.b.a();
                // monitorexit(this)
                this.i();
                return a;
            }
            catch (RemoteException ex) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
                throw new IOException("Remote exception");
            }
        }
    }
    
    public final void a() {
        x.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f != null && this.a != null) {
                try {
                    if (this.c) {
                        com.google.android.gms.common.stats.a.b().c(this.f, (ServiceConnection)this.a);
                    }
                }
                finally {
                    final Throwable t;
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", t);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            }
        }
    }
    
    @a
    public a c() throws IOException {
        x.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Label_0100: {
                if (!this.c) {
                    final Object d = this.d;
                    synchronized (d) {
                        final b e = this.e;
                        if (e != null && e.J) {
                            // monitorexit(d)
                            try {
                                this.j(false);
                                if (this.c) {
                                    break Label_0100;
                                }
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                            catch (Exception d) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.", (Throwable)d);
                            }
                        }
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
            }
            x.k(this.a);
            x.k(this.b);
            try {
                final a a = new a(this.b.b(), this.b.F(true));
                // monitorexit(this)
                this.i();
                return a;
            }
            catch (RemoteException ex) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
                throw new IOException("Remote exception");
            }
        }
    }
    
    @a
    public void f() throws IOException, IllegalStateException, i, com.google.android.gms.common.j {
        this.j(true);
    }
    
    @Override
    protected void finalize() throws Throwable {
        this.a();
        super.finalize();
    }
    
    @f2.c
    public static final class a
    {
        private final String a;
        private final boolean b;
        
        public a(final String a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public final String a() {
            return this.a;
        }
        
        public final boolean b() {
            return this.b;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final boolean b = this.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 7);
            sb.append("{");
            sb.append(a);
            sb.append("}");
            sb.append(b);
            return sb.toString();
        }
    }
    
    @d0
    static final class b extends Thread
    {
        private WeakReference<a> G;
        private long H;
        CountDownLatch I;
        boolean J;
        
        public b(final a referent, final long h) {
            this.G = new WeakReference<a>(referent);
            this.H = h;
            this.I = new CountDownLatch(1);
            this.J = false;
            this.start();
        }
        
        private final void a() {
            final a a = this.G.get();
            if (a != null) {
                a.a();
                this.J = true;
            }
        }
        
        @Override
        public final void run() {
            try {
                if (!this.I.await(this.H, TimeUnit.MILLISECONDS)) {
                    this.a();
                }
            }
            catch (InterruptedException ex) {
                this.a();
            }
        }
    }
}
