// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import c6.h;
import io.realm.j0;

public class OsObjectStore
{
    public static final long a = -1L;
    
    public static boolean a(final j0 j0, final Runnable runnable) {
        return nativeCallWithLock(j0.m(), runnable);
    }
    
    public static boolean b(final OsSharedRealm osSharedRealm, final String s) {
        return nativeDeleteTableForObject(osSharedRealm.getNativePtr(), s);
    }
    
    @h
    public static String c(final OsSharedRealm osSharedRealm, String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append(Util.i());
        sb.append(string);
        string = sb.toString();
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), string);
    }
    
    public static long d(final OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }
    
    public static void e(final OsSharedRealm osSharedRealm, String string, @h final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(Util.i());
        sb.append(string);
        string = sb.toString();
        nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), string, s);
    }
    
    public static void f(final OsSharedRealm osSharedRealm, final long n) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), n);
    }
    
    private static native boolean nativeCallWithLock(final String p0, final Runnable p1);
    
    private static native boolean nativeDeleteTableForObject(final long p0, final String p1);
    
    @h
    private static native String nativeGetPrimaryKeyForObject(final long p0, final String p1);
    
    private static native long nativeGetSchemaVersion(final long p0);
    
    private static native void nativeSetPrimaryKeyForObject(final long p0, final String p1, @h final String p2);
    
    private static native void nativeSetSchemaVersion(final long p0, final long p1);
}
