// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.e;

public final class i
{
    private i() {
        throw new IllegalStateException("No instances!");
    }
    
    public static String a(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(s);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(s);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }
    
    public static void b(final Class<?> clazz) {
        a.Y(new e(a(clazz.getName())));
    }
    
    public static boolean c(final AtomicReference<c> atomicReference, final c newValue, final Class<?> clazz) {
        b.g(newValue, "next is null");
        if (!atomicReference.compareAndSet(null, newValue)) {
            newValue.dispose();
            if (atomicReference.get() != d.G) {
                b(clazz);
            }
            return false;
        }
        return true;
    }
    
    public static boolean d(final AtomicReference<o7.d> atomicReference, final o7.d newValue, final Class<?> clazz) {
        b.g(newValue, "next is null");
        if (!atomicReference.compareAndSet(null, newValue)) {
            newValue.cancel();
            if (atomicReference.get() != j.G) {
                b(clazz);
            }
            return false;
        }
        return true;
    }
    
    public static boolean e(final c c, final c c2, final Class<?> clazz) {
        b.g(c2, "next is null");
        if (c != null) {
            c2.dispose();
            if (c != d.G) {
                b(clazz);
            }
            return false;
        }
        return true;
    }
    
    public static boolean f(final o7.d d, final o7.d d2, final Class<?> clazz) {
        b.g(d2, "next is null");
        if (d != null) {
            d2.cancel();
            if (d != j.G) {
                b(clazz);
            }
            return false;
        }
        return true;
    }
}
