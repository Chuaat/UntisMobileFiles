// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.disposables;

import io.reactivex.internal.functions.b;
import io.reactivex.plugins.a;
import io.reactivex.exceptions.e;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;

public enum d implements c
{
    G;
    
    public static boolean b(final AtomicReference<c> atomicReference) {
        final d d = atomicReference.get();
        final d g = io.reactivex.internal.disposables.d.G;
        if (d != g) {
            final d d2 = atomicReference.getAndSet(g);
            if (d2 != g) {
                if (d2 != null) {
                    d2.dispose();
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean d(final c c) {
        return c == d.G;
    }
    
    public static boolean f(final AtomicReference<c> atomicReference, final c newValue) {
        c expectedValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == d.G) {
                if (newValue != null) {
                    newValue.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public static void g() {
        a.Y(new e("Disposable already set!"));
    }
    
    public static boolean h(final AtomicReference<c> atomicReference, final c newValue) {
        c expectedValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == d.G) {
                if (newValue != null) {
                    newValue.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        if (expectedValue != null) {
            expectedValue.dispose();
        }
        return true;
    }
    
    public static boolean j(final AtomicReference<c> atomicReference, final c newValue) {
        b.g(newValue, "d is null");
        if (!atomicReference.compareAndSet(null, newValue)) {
            newValue.dispose();
            if (atomicReference.get() != d.G) {
                g();
            }
            return false;
        }
        return true;
    }
    
    public static boolean k(final AtomicReference<c> atomicReference, final c newValue) {
        if (!atomicReference.compareAndSet(null, newValue)) {
            if (atomicReference.get() == d.G) {
                newValue.dispose();
            }
            return false;
        }
        return true;
    }
    
    public static boolean l(final c c, final c c2) {
        if (c2 == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (c != null) {
            c2.dispose();
            g();
            return false;
        }
        return true;
    }
    
    @Override
    public void dispose() {
    }
    
    @Override
    public boolean i() {
        return true;
    }
}
