// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.concurrent.TimeUnit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.exceptions.a;
import java.util.concurrent.atomic.AtomicReference;

public final class k
{
    public static final Throwable a;
    
    static {
        a = new a();
    }
    
    private k() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> boolean a(final AtomicReference<Throwable> atomicReference, final Throwable t) {
        Throwable expectedValue;
        Throwable newValue;
        do {
            expectedValue = atomicReference.get();
            if (expectedValue == k.a) {
                return false;
            }
            if (expectedValue == null) {
                newValue = t;
            }
            else {
                newValue = new io.reactivex.exceptions.a(new Throwable[] { expectedValue, t });
            }
        } while (!atomicReference.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public static List<Throwable> b(Throwable e) {
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        final ArrayDeque<Throwable> arrayDeque = new ArrayDeque<Throwable>();
        arrayDeque.offer(e);
        while (!arrayDeque.isEmpty()) {
            e = arrayDeque.removeFirst();
            if (e instanceof io.reactivex.exceptions.a) {
                final List<Throwable> b = ((io.reactivex.exceptions.a)e).b();
                for (int i = b.size() - 1; i >= 0; --i) {
                    arrayDeque.offerFirst(b.get(i));
                }
            }
            else {
                list.add(e);
            }
        }
        return list;
    }
    
    public static <T> Throwable c(final AtomicReference<Throwable> atomicReference) {
        final Throwable t = atomicReference.get();
        final Throwable a = k.a;
        Throwable t2 = t;
        if (t != a) {
            t2 = atomicReference.getAndSet(a);
        }
        return t2;
    }
    
    public static <E extends Throwable> Exception d(final Throwable t) throws E, Throwable {
        if (t instanceof Exception) {
            return (Exception)t;
        }
        throw t;
    }
    
    public static String e(final long lng, final TimeUnit timeUnit) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(lng);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }
    
    public static RuntimeException f(final Throwable cause) {
        if (cause instanceof Error) {
            throw (Error)cause;
        }
        if (cause instanceof RuntimeException) {
            return (RuntimeException)cause;
        }
        return new RuntimeException(cause);
    }
    
    static final class a extends Throwable
    {
        private static final long G = -4649703670690200604L;
        
        a() {
            super("No further exceptions");
        }
        
        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
    }
}
