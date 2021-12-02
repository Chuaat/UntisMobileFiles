// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.Set;
import android.os.Build;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import io.realm.p0;
import io.realm.n0;
import io.realm.log.RealmLog;
import java.util.Locale;
import java.io.File;
import c6.h;
import io.realm.internal.android.a;
import java.util.Map;

public class Util
{
    private static Boolean a;
    private static Boolean b;
    
    public static void a(final String str, final Map<String, ?> map, final String str2) {
        if (map.containsKey(str)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Key '");
        sb.append(str);
        sb.append("' required in '");
        sb.append(str2);
        sb.append("'.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void b(final String s, final String str) {
        if (!k(s)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Non-empty '");
        sb.append(str);
        sb.append("' required.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void c(final String s) {
        new a().c(s);
    }
    
    public static void d(final String s) {
        if (!new a().b()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static void e(@h final Object o, final String str) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Nonnull '");
        sb.append(str);
        sb.append("' required.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean f(final String s, File parent, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".management");
        final File file = new File(parent, sb.toString());
        parent = new File(s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(".note");
        final File file2 = new File(sb2.toString());
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file3 : listFiles) {
                if (!file3.delete()) {
                    RealmLog.w(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", file3.getAbsolutePath()), new Object[0]);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            RealmLog.w(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", file.getAbsolutePath()), new Object[0]);
        }
        boolean delete;
        if (parent.exists()) {
            final boolean b = delete = parent.delete();
            if (!b) {
                RealmLog.w(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", parent.getAbsolutePath()), new Object[0]);
                delete = b;
            }
        }
        else {
            delete = true;
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.w(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", file2.getAbsolutePath()), new Object[0]);
        }
        return delete;
    }
    
    public static Class<? extends n0> g(final Class<? extends n0> clazz) {
        if (!clazz.equals(n0.class) && !clazz.equals(p0.class)) {
            final Class<? super n0> superclass = clazz.getSuperclass();
            Class<? extends n0> clazz2 = clazz;
            if (!superclass.equals(Object.class)) {
                clazz2 = clazz;
                if (!superclass.equals(p0.class)) {
                    clazz2 = (Class<? extends n0>)superclass;
                }
            }
            return clazz2;
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }
    
    public static String h(final Throwable t) {
        final StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out, true));
        return out.getBuffer().toString();
    }
    
    public static String i() {
        return nativeGetTablePrefix();
    }
    
    public static boolean j() {
        synchronized (Util.class) {
            if (Util.b == null) {
                try {
                    Util.b = Boolean.TRUE;
                }
                catch (ClassNotFoundException ex) {
                    Util.b = Boolean.FALSE;
                }
            }
            return Util.b;
        }
    }
    
    public static boolean k(@h final String s) {
        return s == null || s.length() == 0;
    }
    
    public static boolean l() {
        final String fingerprint = Build.FINGERPRINT;
        if (!fingerprint.startsWith("generic") && !fingerprint.startsWith("unknown")) {
            final String model = Build.MODEL;
            if (!model.contains("google_sdk") && !model.contains("Emulator") && !model.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                if (!"google_sdk".equals(Build.PRODUCT)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean m() {
        synchronized (Util.class) {
            if (Util.a == null) {
                try {
                    Class.forName("io.reactivex.l");
                    Util.a = Boolean.TRUE;
                }
                catch (ClassNotFoundException ex) {
                    Util.a = Boolean.FALSE;
                }
            }
            return Util.a;
        }
    }
    
    public static <T> Set<T> n(final T... array) {
        if (array == null) {
            return Collections.emptySet();
        }
        final LinkedHashSet<T> set = new LinkedHashSet<T>();
        for (int i = 0; i < array.length; ++i) {
            final T t = array[i];
            if (t != null) {
                set.add(t);
            }
        }
        return set;
    }
    
    static native String nativeGetTablePrefix();
}
