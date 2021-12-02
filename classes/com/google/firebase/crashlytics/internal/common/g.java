// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.HashMap;
import java.util.Map;
import android.os.Debug;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.text.TextUtils;
import android.content.res.Resources$NotFoundException;
import android.hardware.SensorManager;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Closeable;
import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.StatFs;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import java.util.Scanner;
import java.io.InputStream;
import com.google.firebase.crashlytics.internal.f;
import java.util.Locale;
import java.io.File;
import android.os.Build;
import android.provider.Settings$Secure;
import android.content.Context;

public class g
{
    private static final String a = "SHA-1";
    private static final String b = "goldfish";
    private static final String c = "ranchu";
    private static final String d = "sdk";
    public static final String e = "com.google.firebase.crashlytics";
    public static final String f = "com.crashlytics.prefs";
    private static final char[] g;
    static final String h = "com.google.firebase.crashlytics.mapping_file_id";
    static final String i = "com.crashlytics.android.build_id";
    private static final String j = "com.google.firebase.crashlytics.unity_version";
    private static final long k = -1L;
    static final int l = 1073741824;
    static final int m = 1048576;
    static final int n = 1024;
    private static long o = 0L;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 4;
    public static final int s = 8;
    public static final int t = 16;
    public static final int u = 32;
    
    static {
        g = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        com.google.firebase.crashlytics.internal.common.g.o = -1L;
    }
    
    public static boolean A(final Context context) {
        final String string = Settings$Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            final String hardware = Build.HARDWARE;
            if (!hardware.contains("goldfish") && !hardware.contains("ranchu")) {
                if (string != null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Deprecated
    public static boolean B(final Context context) {
        return false;
    }
    
    public static boolean C(final Context context) {
        final boolean a = A(context);
        final String tags = Build.TAGS;
        if (!a && tags != null && tags.contains("test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        final File file = new File("/system/xbin/su");
        return !a && file.exists();
    }
    
    public static String D(final int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", i).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }
    
    public static String E(final Context context) {
        final int r = r(context, "com.google.firebase.crashlytics.unity_version", "string");
        String string;
        if (r != 0) {
            string = context.getResources().getString(r);
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Unity Editor version is: ");
            sb.append(string);
            f.k(sb.toString());
        }
        else {
            string = null;
        }
        return string;
    }
    
    public static String F(final String s) {
        return v(s, "SHA-1");
    }
    
    public static String G(final InputStream source) {
        final Scanner useDelimiter = new Scanner(source).useDelimiter("\\A");
        String next;
        if (useDelimiter.hasNext()) {
            next = useDelimiter.next();
        }
        else {
            next = "";
        }
        return next;
    }
    
    public static long a(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        return activityManager$MemoryInfo.availMem;
    }
    
    public static long b(final String s) {
        final StatFs statFs = new StatFs(s);
        final long n = statFs.getBlockSize();
        return statFs.getBlockCount() * n - n * statFs.getAvailableBlocks();
    }
    
    @SuppressLint({ "MissingPermission" })
    public static boolean c(final Context context) {
        final boolean d = d(context, "android.permission.ACCESS_NETWORK_STATE");
        boolean b = true;
        if (d) {
            final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            b = (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting() && b);
        }
        return b;
    }
    
    public static boolean d(final Context context, final String s) {
        return context.checkCallingOrSelfPermission(s) == 0;
    }
    
    public static void e(final Closeable closeable, final String s) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (IOException ex) {
                com.google.firebase.crashlytics.internal.f.f().e(s, ex);
            }
        }
    }
    
    public static void f(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {
            goto Label_0016;
        }
    }
    
    static long g(final String s, final String regex, final int n) {
        return Long.parseLong(s.split(regex)[0].trim()) * n;
    }
    
    public static String h(final String... array) {
        String f;
        final String s = f = null;
        if (array != null) {
            if (array.length == 0) {
                f = s;
            }
            else {
                final ArrayList<String> list = (ArrayList<String>)new ArrayList<Comparable>();
                for (final String s2 : array) {
                    if (s2 != null) {
                        list.add(s2.replace("-", "").toLowerCase(Locale.US));
                    }
                }
                Collections.sort((List<Comparable>)list);
                final StringBuilder sb = new StringBuilder();
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    sb.append(iterator.next());
                }
                final String string = sb.toString();
                f = s;
                if (string.length() > 0) {
                    f = F(string);
                }
            }
        }
        return f;
    }
    
    public static String i(final File p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: istore_2       
        //     5: aconst_null    
        //     6: astore_3       
        //     7: aconst_null    
        //     8: astore          4
        //    10: aconst_null    
        //    11: astore          5
        //    13: iload_2        
        //    14: ifeq            228
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore          6
        //    22: new             Ljava/io/FileReader;
        //    25: astore          4
        //    27: aload           4
        //    29: aload_0        
        //    30: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    33: aload           6
        //    35: aload           4
        //    37: sipush          1024
        //    40: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;I)V
        //    43: aload           6
        //    45: astore          4
        //    47: aload           6
        //    49: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    52: astore          7
        //    54: aload           6
        //    56: astore_3       
        //    57: aload           5
        //    59: astore          4
        //    61: aload           7
        //    63: ifnull          115
        //    66: aload           6
        //    68: astore          4
        //    70: ldc_w           "\\s*:\\s*"
        //    73: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    76: aload           7
        //    78: iconst_2       
        //    79: invokevirtual   java/util/regex/Pattern.split:(Ljava/lang/CharSequence;I)[Ljava/lang/String;
        //    82: astore_3       
        //    83: aload           6
        //    85: astore          4
        //    87: aload_3        
        //    88: arraylength    
        //    89: iconst_1       
        //    90: if_icmple       43
        //    93: aload           6
        //    95: astore          4
        //    97: aload_3        
        //    98: iconst_0       
        //    99: aaload         
        //   100: aload_1        
        //   101: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   104: ifeq            43
        //   107: aload_3        
        //   108: iconst_1       
        //   109: aaload         
        //   110: astore          4
        //   112: aload           6
        //   114: astore_3       
        //   115: aload_3        
        //   116: ldc_w           "Failed to close system file reader."
        //   119: invokestatic    com/google/firebase/crashlytics/internal/common/g.e:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   122: goto            228
        //   125: astore          4
        //   127: aload           6
        //   129: astore_1       
        //   130: aload           4
        //   132: astore          6
        //   134: goto            147
        //   137: astore_0       
        //   138: aload_3        
        //   139: astore_1       
        //   140: goto            219
        //   143: astore          6
        //   145: aconst_null    
        //   146: astore_1       
        //   147: aload_1        
        //   148: astore          4
        //   150: invokestatic    com/google/firebase/crashlytics/internal/f.f:()Lcom/google/firebase/crashlytics/internal/f;
        //   153: astore_3       
        //   154: aload_1        
        //   155: astore          4
        //   157: new             Ljava/lang/StringBuilder;
        //   160: astore          7
        //   162: aload_1        
        //   163: astore          4
        //   165: aload           7
        //   167: invokespecial   java/lang/StringBuilder.<init>:()V
        //   170: aload_1        
        //   171: astore          4
        //   173: aload           7
        //   175: ldc_w           "Error parsing "
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: pop            
        //   182: aload_1        
        //   183: astore          4
        //   185: aload           7
        //   187: aload_0        
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   191: pop            
        //   192: aload_1        
        //   193: astore          4
        //   195: aload_3        
        //   196: aload           7
        //   198: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   201: aload           6
        //   203: invokevirtual   com/google/firebase/crashlytics/internal/f.e:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   206: aload_1        
        //   207: astore_3       
        //   208: aload           5
        //   210: astore          4
        //   212: goto            115
        //   215: astore_0       
        //   216: aload           4
        //   218: astore_1       
        //   219: aload_1        
        //   220: ldc_w           "Failed to close system file reader."
        //   223: invokestatic    com/google/firebase/crashlytics/internal/common/g.e:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   226: aload_0        
        //   227: athrow         
        //   228: aload           4
        //   230: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     43     143    147    Ljava/lang/Exception;
        //  17     43     137    143    Any
        //  47     54     125    137    Ljava/lang/Exception;
        //  47     54     215    219    Any
        //  70     83     125    137    Ljava/lang/Exception;
        //  70     83     215    219    Any
        //  87     93     125    137    Ljava/lang/Exception;
        //  87     93     215    219    Any
        //  97     107    125    137    Ljava/lang/Exception;
        //  97     107    215    219    Any
        //  150    154    215    219    Any
        //  157    162    215    219    Any
        //  165    170    215    219    Any
        //  173    182    215    219    Any
        //  185    192    215    219    Any
        //  195    206    215    219    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0115:
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
    
    public static ActivityManager$RunningAppProcessInfo j(final String anObject, final Context context) {
        final List runningAppProcesses = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.processName.equals(anObject)) {
                    return activityManager$RunningAppProcessInfo;
                }
            }
        }
        return null;
    }
    
    public static boolean k(final Context context, final String s, final boolean b) {
        if (context != null) {
            final Resources resources = context.getResources();
            if (resources != null) {
                final int r = r(context, s, "bool");
                if (r > 0) {
                    return resources.getBoolean(r);
                }
                final int r2 = r(context, s, "string");
                if (r2 > 0) {
                    return Boolean.parseBoolean(context.getString(r2));
                }
            }
        }
        return b;
    }
    
    public static int l() {
        return com.google.firebase.crashlytics.internal.common.g.a.b().ordinal();
    }
    
    public static int m(final Context context) {
        int a;
        final boolean b = (a = (A(context) ? 1 : 0)) != 0;
        if (C(context)) {
            a = ((b ? 1 : 0) | 0x2);
        }
        int n = a;
        if (z()) {
            n = (a | 0x4);
        }
        return n;
    }
    
    public static SharedPreferences n(final Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }
    
    public static String o(final Context context) {
        int n;
        if ((n = r(context, "com.google.firebase.crashlytics.mapping_file_id", "string")) == 0) {
            n = r(context, "com.crashlytics.android.build_id", "string");
        }
        String string;
        if (n != 0) {
            string = context.getResources().getString(n);
        }
        else {
            string = null;
        }
        return string;
    }
    
    public static boolean p(final Context context) {
        final boolean a = A(context);
        boolean b = false;
        if (a) {
            return false;
        }
        if (((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            b = true;
        }
        return b;
    }
    
    public static String q(final Context context) {
        final int icon = context.getApplicationContext().getApplicationInfo().icon;
        Label_0044: {
            if (icon <= 0) {
                break Label_0044;
            }
            try {
                String s;
                if ("android".equals(s = context.getResources().getResourcePackageName(icon))) {
                    s = context.getPackageName();
                }
                return s;
                s = context.getPackageName();
                return s;
            }
            catch (Resources$NotFoundException ex) {
                return context.getPackageName();
            }
        }
    }
    
    public static int r(final Context context, final String s, final String s2) {
        return context.getResources().getIdentifier(s, s2, q(context));
    }
    
    public static SharedPreferences s(final Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }
    
    public static String t(final Context context, final String s) {
        final int r = r(context, s, "string");
        if (r > 0) {
            return context.getString(r);
        }
        return "";
    }
    
    public static long u() {
        synchronized (g.class) {
            if (com.google.firebase.crashlytics.internal.common.g.o == -1L) {
                final long n = 0L;
                final String i = i(new File("/proc/meminfo"), "MemTotal");
                long o = n;
                if (!TextUtils.isEmpty((CharSequence)i)) {
                    final String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            o = g(upperCase, "KB", 1024);
                        }
                        else if (upperCase.endsWith("MB")) {
                            o = g(upperCase, "MB", 1048576);
                        }
                        else if (upperCase.endsWith("GB")) {
                            o = g(upperCase, "GB", 1073741824);
                        }
                        else {
                            final f f = com.google.firebase.crashlytics.internal.f.f();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            f.m(sb.toString());
                            o = n;
                        }
                    }
                    catch (NumberFormatException ex) {
                        final f f2 = com.google.firebase.crashlytics.internal.f.f();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        f2.e(sb2.toString(), ex);
                        o = n;
                    }
                }
                com.google.firebase.crashlytics.internal.common.g.o = o;
            }
            return com.google.firebase.crashlytics.internal.common.g.o;
        }
    }
    
    private static String v(final String s, final String s2) {
        return w(s.getBytes(), s2);
    }
    
    private static String w(final byte[] input, final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(s);
            instance.update(input);
            return x(instance.digest());
        }
        catch (NoSuchAlgorithmException ex) {
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(s);
            sb.append(", returning empty string.");
            f.e(sb.toString(), ex);
            return "";
        }
    }
    
    public static String x(final byte[] array) {
        final char[] value = new char[array.length * 2];
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i] & 0xFF;
            final int n2 = i * 2;
            final char[] g = com.google.firebase.crashlytics.internal.common.g.g;
            value[n2] = g[n >>> 4];
            value[n2 + 1] = g[n & 0xF];
        }
        return new String(value);
    }
    
    public static boolean y(final Context context) {
        return (context.getApplicationInfo().flags & 0x2) != 0x0;
    }
    
    public static boolean z() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }
    
    enum a
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O, 
        P;
        
        private static final Map<String, a> Q;
        
        static {
            final HashMap<String, a> q = new HashMap<String, a>(4);
            final a a7;
            (Q = q).put("armeabi-v7a", a7);
            final a a6;
            q.put("armeabi", a6);
            final a a10;
            q.put("arm64-v8a", a10);
            final a a;
            q.put("x86", a);
        }
        
        static a b() {
            final String cpu_ABI = Build.CPU_ABI;
            if (TextUtils.isEmpty((CharSequence)cpu_ABI)) {
                com.google.firebase.crashlytics.internal.f.f().k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return a.N;
            }
            a n;
            if ((n = a.Q.get(cpu_ABI.toLowerCase(Locale.US))) == null) {
                n = a.N;
            }
            return n;
        }
    }
}
