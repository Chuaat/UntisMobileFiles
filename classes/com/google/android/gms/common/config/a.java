// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.config;

import com.google.android.gms.common.util.d0;
import android.util.Log;
import android.os.StrictMode$ThreadPolicy;
import android.os.Binder;
import android.os.StrictMode;
import androidx.annotation.RecentlyNonNull;
import java.util.Set;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.k0;

@a
public abstract class a<T>
{
    private static final Object d;
    @k0
    private static a e;
    private static int f;
    @SuppressLint({ "StaticFieldLeak" })
    @k0
    private static Context g;
    @k0
    @d6.a("lock")
    private static Set<String> h;
    @RecentlyNonNull
    protected final String a;
    @RecentlyNonNull
    protected final T b;
    @k0
    private T c;
    
    static {
        d = new Object();
    }
    
    protected a(@RecentlyNonNull final String a, @RecentlyNonNull final T b) {
        this.c = null;
        this.a = a;
        this.b = b;
    }
    
    @RecentlyNonNull
    @a
    public static boolean c() {
        synchronized (a.d) {
            // monitorexit(a.d)
            return false;
        }
    }
    
    @RecentlyNonNull
    @a
    public static a<Float> f(@RecentlyNonNull final String s, @RecentlyNonNull final Float n) {
        return new d(s, n);
    }
    
    @RecentlyNonNull
    @a
    public static a<Integer> g(@RecentlyNonNull final String s, @RecentlyNonNull final Integer n) {
        return new e(s, n);
    }
    
    @RecentlyNonNull
    @a
    public static a<Long> h(@RecentlyNonNull final String s, @RecentlyNonNull final Long n) {
        return new b(s, n);
    }
    
    @RecentlyNonNull
    @a
    public static a<String> i(@RecentlyNonNull final String s, @RecentlyNonNull final String s2) {
        return new f(s, s2);
    }
    
    @RecentlyNonNull
    @a
    public static a<Boolean> j(@RecentlyNonNull final String s, @RecentlyNonNull final boolean b) {
        return new c(s, b);
    }
    
    private static boolean l() {
        synchronized (a.d) {
            // monitorexit(a.d)
            return false;
        }
    }
    
    @RecentlyNonNull
    @a
    public final T a() {
        final T c = this.c;
        if (c != null) {
            return c;
        }
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        synchronized (com.google.android.gms.common.config.a.d) {
            // monitorexit(a.d)
            synchronized (com.google.android.gms.common.config.a.d) {
                com.google.android.gms.common.config.a.h = null;
                com.google.android.gms.common.config.a.g = null;
                // monitorexit(a.d)
                try {
                    try {
                        final T k = this.k(this.a);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        return k;
                    }
                    finally {}
                }
                catch (SecurityException o) {
                    final long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        final T i = this.k(this.a);
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        return i;
                    }
                    finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public final T b() {
        return this.a();
    }
    
    @d0
    @a
    public void d(@RecentlyNonNull final T c) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.c = c;
        synchronized (com.google.android.gms.common.config.a.d) {
            l();
        }
    }
    
    @d0
    @a
    public void e() {
        this.c = null;
    }
    
    @RecentlyNonNull
    protected abstract T k(@RecentlyNonNull final String p0);
    
    private interface a
    {
        String a(final String p0, final String p1);
        
        Boolean b(final String p0, final Boolean p1);
        
        Integer c(final String p0, final Integer p1);
        
        Float d(final String p0, final Float p1);
        
        Long e(final String p0, final Long p1);
    }
}
