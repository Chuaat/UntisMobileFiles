// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.mixed;

import io.reactivex.n0;
import io.reactivex.internal.operators.single.v0;
import io.reactivex.q0;
import io.reactivex.v;
import io.reactivex.internal.operators.maybe.n1;
import io.reactivex.i0;
import io.reactivex.y;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;
import io.reactivex.f;
import io.reactivex.i;
import x5.o;

final class r
{
    private r() {
        throw new IllegalStateException("No instances!");
    }
    
    static <T> boolean a(final Object o, final o<? super T, ? extends i> o2, final f f) {
        if (o instanceof Callable) {
            final Callable callable = (Callable)o;
            i i = null;
            try {
                final Object call = callable.call();
                if (call != null) {
                    i = b.g((i)o2.apply((Object)call), "The mapper returned a null CompletableSource");
                }
                if (i == null) {
                    e.b(f);
                }
                else {
                    i.c(f);
                }
                return true;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                e.g(t, f);
                return true;
            }
        }
        return false;
    }
    
    static <T, R> boolean b(final Object o, final o<? super T, ? extends y<? extends R>> o2, final i0<? super R> i0) {
        if (o instanceof Callable) {
            final Callable callable = (Callable)o;
            y y = null;
            try {
                final Object call = callable.call();
                if (call != null) {
                    y = b.g((y)o2.apply((Object)call), "The mapper returned a null MaybeSource");
                }
                if (y == null) {
                    e.f(i0);
                }
                else {
                    y.c(n1.l8((i0<? super T>)i0));
                }
                return true;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                e.l(t, i0);
                return true;
            }
        }
        return false;
    }
    
    static <T, R> boolean c(final Object o, final o<? super T, ? extends q0<? extends R>> o2, final i0<? super R> i0) {
        if (o instanceof Callable) {
            final Callable callable = (Callable)o;
            q0 q0 = null;
            try {
                final Object call = callable.call();
                if (call != null) {
                    q0 = b.g((q0)o2.apply((Object)call), "The mapper returned a null SingleSource");
                }
                if (q0 == null) {
                    e.f(i0);
                }
                else {
                    q0.c(v0.l8((i0<? super T>)i0));
                }
                return true;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                e.l(t, i0);
                return true;
            }
        }
        return false;
    }
}
