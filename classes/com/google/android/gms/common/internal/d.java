// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.util.Log;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public final class d
{
    private d() {
        throw new AssertionError((Object)"Uninstantiable");
    }
    
    @a
    public static void a(@RecentlyNonNull final String s) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        final String value = String.valueOf(Thread.currentThread());
        final String value2 = String.valueOf(Looper.getMainLooper().getThread());
        final StringBuilder sb = new StringBuilder(value.length() + 57 + value2.length());
        sb.append("checkMainThread: current thread ");
        sb.append(value);
        sb.append(" IS NOT the main thread ");
        sb.append(value2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(s);
    }
    
    @a
    public static void b(@RecentlyNonNull final String s) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        final String value = String.valueOf(Thread.currentThread());
        final String value2 = String.valueOf(Looper.getMainLooper().getThread());
        final StringBuilder sb = new StringBuilder(value.length() + 56 + value2.length());
        sb.append("checkNotMainThread: current thread ");
        sb.append(value);
        sb.append(" IS the main thread ");
        sb.append(value2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(s);
    }
    
    @a
    public static void c(@RecentlyNonNull final Object o) {
        if (o != null) {
            return;
        }
        throw new IllegalArgumentException("null reference");
    }
    
    @a
    public static void d(@RecentlyNonNull final Object o, @RecentlyNonNull final Object obj) {
        if (o != null) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    @a
    public static void e(@RecentlyNonNull final Object o) {
        if (o == null) {
            return;
        }
        throw new IllegalArgumentException("non-null reference");
    }
    
    @a
    public static void f(@RecentlyNonNull final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    @a
    public static void g(@RecentlyNonNull final boolean b, @RecentlyNonNull final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
