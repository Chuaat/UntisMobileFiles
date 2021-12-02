// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.b1;
import com.google.android.datatransport.h;
import com.google.android.datatransport.d;
import com.google.android.datatransport.c;
import com.google.firebase.messaging.reporting.b;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import com.google.android.gms.tasks.m;
import com.google.android.gms.tasks.p;
import com.google.firebase.installations.i;
import com.google.firebase.e;
import android.text.TextUtils;
import androidx.annotation.k0;
import com.google.firebase.messaging.reporting.a;
import android.os.Bundle;
import androidx.annotation.j0;
import android.content.Intent;

public class l0
{
    public static boolean A(@j0 final Intent intent) {
        return intent != null && !r(intent) && a();
    }
    
    public static boolean B(@j0 final Intent intent) {
        return intent != null && !r(intent) && C(intent.getExtras());
    }
    
    public static boolean C(@j0 final Bundle bundle) {
        return bundle != null && "1".equals(bundle.getString("google.c.a.e"));
    }
    
    static boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: invokestatic    com/google/firebase/e.o:()Lcom/google/firebase/e;
        //     7: invokevirtual   com/google/firebase/e.m:()Landroid/content/Context;
        //    10: astore_0       
        //    11: aload_0        
        //    12: ldc             "com.google.firebase.messaging"
        //    14: iconst_0       
        //    15: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ldc             "export_to_big_query"
        //    22: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    27: ifeq            40
        //    30: aload_1        
        //    31: ldc             "export_to_big_query"
        //    33: iconst_0       
        //    34: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    39: ireturn        
        //    40: aload_0        
        //    41: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    44: astore_1       
        //    45: aload_1        
        //    46: ifnull          96
        //    49: aload_1        
        //    50: aload_0        
        //    51: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    54: sipush          128
        //    57: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    60: astore_1       
        //    61: aload_1        
        //    62: ifnull          96
        //    65: aload_1        
        //    66: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    69: astore_0       
        //    70: aload_0        
        //    71: ifnull          96
        //    74: aload_0        
        //    75: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    77: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //    80: ifeq            96
        //    83: aload_1        
        //    84: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    87: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    89: iconst_0       
        //    90: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    93: istore_2       
        //    94: iload_2        
        //    95: ireturn        
        //    96: iconst_0       
        //    97: ireturn        
        //    98: astore_0       
        //    99: ldc             "FirebaseMessaging"
        //   101: ldc             "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
        //   103: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   106: pop            
        //   107: iconst_0       
        //   108: ireturn        
        //   109: astore_0       
        //   110: goto            96
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      4      98     109    Ljava/lang/IllegalStateException;
        //  40     45     109    113    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  49     61     109    113    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  65     70     109    113    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  74     94     109    113    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    static a b(final a.b b, final Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle bundle;
        if ((bundle = intent.getExtras()) == null) {
            bundle = Bundle.EMPTY;
        }
        final a.a q = a.q();
        q.p(p(bundle));
        q.g(b);
        q.h(f(bundle));
        q.k(m());
        q.n(a.d.I);
        q.j(k(bundle));
        final String h = h(bundle);
        if (h != null) {
            q.i(h);
        }
        final String o = o(bundle);
        if (o != null) {
            q.o(o);
        }
        final String c = c(bundle);
        if (c != null) {
            q.e(c);
        }
        final String i = i(bundle);
        if (i != null) {
            q.b(i);
        }
        final String e = e(bundle);
        if (e != null) {
            q.f(e);
        }
        final long n = n(bundle);
        if (n > 0L) {
            q.m(n);
        }
        return q.a();
    }
    
    @k0
    static String c(final Bundle bundle) {
        return bundle.getString("collapse_key");
    }
    
    @k0
    static String d(final Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }
    
    @k0
    static String e(final Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }
    
    @j0
    static String f(Bundle string) {
        string = (InterruptedException)((Bundle)string).getString("google.to");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return (String)string;
        }
        try {
            string = (InterruptedException)p.a((m)i.u(e.o()).b());
            return (String)string;
        }
        catch (InterruptedException string) {}
        catch (ExecutionException ex) {}
        throw new RuntimeException(string);
    }
    
    @k0
    static String g(final Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }
    
    @k0
    static String h(final Bundle bundle) {
        final String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }
    
    @k0
    static String i(final Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }
    
    @k0
    static String j(final Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }
    
    @j0
    static a.c k(final Bundle bundle) {
        a.c c;
        if (bundle != null && n0.v(bundle)) {
            c = a.c.K;
        }
        else {
            c = a.c.I;
        }
        return c;
    }
    
    @j0
    static String l(final Bundle bundle) {
        if (!n0.v(bundle)) {
            return "data";
        }
        return "display";
    }
    
    @j0
    static String m() {
        return e.o().m().getPackageName();
    }
    
    @k0
    static long n(Bundle o) {
        if (o.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(o.getString("google.c.sender.id"));
            }
            catch (NumberFormatException ex) {
                Log.w("FirebaseMessaging", "error parsing project number", (Throwable)ex);
            }
        }
        o = (Bundle)e.o();
        final String m = ((e)o).r().m();
        if (m != null) {
            try {
                return Long.parseLong(m);
            }
            catch (NumberFormatException ex2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", (Throwable)ex2);
            }
        }
        final String j = ((e)o).r().j();
        if (!j.startsWith("1:")) {
            try {
                return Long.parseLong(j);
            }
            catch (NumberFormatException ex3) {
                Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex3);
                return 0L;
            }
        }
        final String[] split = j.split(":");
        if (split.length < 2) {
            return 0L;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(s);
    }
    
    @k0
    static String o(final Bundle bundle) {
        final String string = bundle.getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }
    
    @j0
    static int p(Bundle value) {
        value = (Bundle)value.get("google.ttl");
        if (value instanceof Integer) {
            return (int)value;
        }
        if (value instanceof String) {
            try {
                return Integer.parseInt((String)value);
            }
            catch (NumberFormatException ex) {
                final String value2 = String.valueOf(value);
                final StringBuilder sb = new StringBuilder(value2.length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(value2);
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        return 0;
    }
    
    @k0
    static String q(final Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }
    
    private static boolean r(final Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
    
    public static void s(@j0 final Intent intent) {
        x("_nd", intent.getExtras());
    }
    
    public static void t(@j0 final Intent intent) {
        x("_nf", intent.getExtras());
    }
    
    public static void u(@j0 final Bundle bundle) {
        z(bundle);
        x("_no", bundle);
    }
    
    public static void v(@j0 final Intent intent) {
        if (B(intent)) {
            x("_nr", intent.getExtras());
        }
        if (A(intent)) {
            w(a.b.I, intent, FirebaseMessaging.m());
        }
    }
    
    private static void w(final a.b b, final Intent intent, @k0 final com.google.android.datatransport.i i) {
        if (i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        final a b2 = b(b, intent);
        if (b2 == null) {
            return;
        }
        try {
            final h b3 = i.b("FCM_CLIENT_EVENT_LOGGING", (Class)b.class, c.b("proto"), com.google.firebase.messaging.k0.a);
            final b.a d = b.d();
            d.b(b2);
            b3.a(com.google.android.datatransport.d.g((Object)d.a()));
        }
        catch (RuntimeException ex) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", (Throwable)ex);
        }
    }
    
    @b1
    static void x(final String str, Bundle obj) {
        Bundle bundle = obj;
        if (obj == null) {
            bundle = new Bundle();
        }
        obj = new Bundle();
        final String d = d(bundle);
        if (d != null) {
            obj.putString("_nmid", d);
        }
        final String e = e(bundle);
        if (e != null) {
            obj.putString("_nmn", e);
        }
        final String i = i(bundle);
        if (!TextUtils.isEmpty((CharSequence)i)) {
            obj.putString("label", i);
        }
        final String g = g(bundle);
        if (!TextUtils.isEmpty((CharSequence)g)) {
            obj.putString("message_channel", g);
        }
        final String o = o(bundle);
        if (o != null) {
            obj.putString("_nt", o);
        }
        final String j = j(bundle);
        if (j != null) {
            try {
                obj.putInt("_nmt", Integer.parseInt(j));
            }
            catch (NumberFormatException ex) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
            }
        }
        final String q = q(bundle);
        if (q != null) {
            try {
                obj.putInt("_ndt", Integer.parseInt(q));
            }
            catch (NumberFormatException ex2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
            }
        }
        final String l = l(bundle);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            obj.putString("_nmc", l);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(str.length() + 37 + value.length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(value);
            Log.d("FirebaseMessaging", sb.toString());
        }
        final com.google.firebase.analytics.connector.a a = (com.google.firebase.analytics.connector.a)com.google.firebase.e.o().k((Class)com.google.firebase.analytics.connector.a.class);
        if (a != null) {
            a.c("fcm", str, obj);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
    
    static void y(final boolean b) {
        e.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", b).apply();
    }
    
    private static void z(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
            return;
        }
        final com.google.firebase.analytics.connector.a a = (com.google.firebase.analytics.connector.a)e.o().k((Class)com.google.firebase.analytics.connector.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (a != null) {
            final String string = bundle.getString("google.c.a.c_id");
            a.f("fcm", "_ln", (Object)string);
            final Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            a.c("fcm", "_cmp", bundle2);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
    }
}
