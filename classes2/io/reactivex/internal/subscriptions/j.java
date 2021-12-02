// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.b;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;

public enum j implements d
{
    G;
    
    public static boolean b(final AtomicReference<d> atomicReference) {
        final d d = atomicReference.get();
        final j g = j.G;
        if (d != g) {
            final d d2 = atomicReference.getAndSet((d)g);
            if (d2 != g) {
                if (d2 != null) {
                    d2.cancel();
                }
                return true;
            }
        }
        return false;
    }
    
    public static void d(final AtomicReference<d> atomicReference, final AtomicLong atomicLong, long andSet) {
        final d d = atomicReference.get();
        if (d != null) {
            d.v(andSet);
        }
        else if (m(andSet)) {
            io.reactivex.internal.util.d.a(atomicLong, andSet);
            final d d2 = atomicReference.get();
            if (d2 != null) {
                andSet = atomicLong.getAndSet(0L);
                if (andSet != 0L) {
                    d2.v(andSet);
                }
            }
        }
    }
    
    public static boolean f(final AtomicReference<d> atomicReference, final AtomicLong atomicLong, final d d) {
        if (k(atomicReference, d)) {
            final long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0L) {
                d.v(andSet);
            }
            return true;
        }
        return false;
    }
    
    public static boolean g(final AtomicReference<d> atomicReference, final d newValue) {
        d expectedValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == j.G) {
                if (newValue != null) {
                    newValue.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public static void h(final long lng) {
        final StringBuilder sb = new StringBuilder();
        sb.append("More produced than requested: ");
        sb.append(lng);
        a.Y(new e(sb.toString()));
    }
    
    public static void i() {
        a.Y(new e("Subscription already set!"));
    }
    
    public static boolean j(final AtomicReference<d> atomicReference, final d newValue) {
        d expectedValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == j.G) {
                if (newValue != null) {
                    newValue.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        if (expectedValue != null) {
            expectedValue.cancel();
        }
        return true;
    }
    
    public static boolean k(final AtomicReference<d> atomicReference, final d newValue) {
        b.g(newValue, "s is null");
        if (!atomicReference.compareAndSet(null, newValue)) {
            newValue.cancel();
            if (atomicReference.get() != j.G) {
                i();
            }
            return false;
        }
        return true;
    }
    
    public static boolean l(final AtomicReference<d> atomicReference, final d d, final long n) {
        if (k(atomicReference, d)) {
            d.v(n);
            return true;
        }
        return false;
    }
    
    public static boolean m(final long lng) {
        if (lng <= 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("n > 0 required but it was ");
            sb.append(lng);
            a.Y(new IllegalArgumentException(sb.toString()));
            return false;
        }
        return true;
    }
    
    public static boolean o(final d d, final d d2) {
        if (d2 == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (d != null) {
            d2.cancel();
            i();
            return false;
        }
        return true;
    }
    
    public void cancel() {
    }
    
    public void v(final long n) {
    }
}
