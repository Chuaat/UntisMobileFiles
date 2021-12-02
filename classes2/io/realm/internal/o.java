// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.lang.reflect.Field;
import java.util.Locale;
import java.io.PrintStream;
import com.getkeepsafe.relinker.e;
import android.content.Context;
import java.io.File;

public class o
{
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d = "java.library.path";
    private static boolean e;
    
    static {
        final String str = a = File.separator;
        final String str2 = b = File.pathSeparator;
        final StringBuilder sb = new StringBuilder();
        sb.append("lib");
        sb.append(str2);
        sb.append("..");
        sb.append(str);
        sb.append("lib");
        c = sb.toString();
        o.e = false;
    }
    
    public static void a(final String str) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("java.library.path"));
            final String b = o.b;
            sb.append(b);
            sb.append(str);
            sb.append(b);
            System.setProperty("java.library.path", sb.toString());
        }
        catch (Exception cause) {
            throw new RuntimeException("Cannot set the library path!", cause);
        }
    }
    
    private static String b(final String... array) {
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final String libname = array[i];
            try {
                System.loadLibrary(libname);
                return libname;
            }
            finally {
                ++i;
                continue;
            }
            break;
        }
        return null;
    }
    
    public static void c(final Context context) {
        synchronized (o.class) {
            if (o.e) {
                return;
            }
            com.getkeepsafe.relinker.e.d(context, "realm-jni", "10.4.0");
            o.e = true;
        }
    }
    
    private static String d() {
        try {
            a(o.c);
            f();
        }
        finally {}
        String s = b("realm_jni32d", "realm_jni64d");
        if (s != null) {
            System.out.println("!!! Realm debug version loaded. !!!\n");
        }
        else {
            s = b("realm_jni32", "realm_jni64");
            if (s == null) {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder();
                sb.append("Searched java.library.path=");
                sb.append(System.getProperty("java.library.path"));
                err.println(sb.toString());
                throw new RuntimeException("Couldn't load the Realm JNI library 'realm_jni32.dll or realm_jni64.dll'. Please include the directory to the library in java.library.path.");
            }
        }
        return s;
    }
    
    public static boolean e() {
        return System.getProperty("os.name").toLowerCase(Locale.getDefault()).contains("win");
    }
    
    private static void f() {
        try {
            final Field declaredField = ClassLoader.class.getDeclaredField("sys_paths");
            declaredField.setAccessible(true);
            declaredField.set(null, null);
        }
        catch (Exception cause) {
            throw new RuntimeException("Cannot reset the library path!", cause);
        }
    }
}
