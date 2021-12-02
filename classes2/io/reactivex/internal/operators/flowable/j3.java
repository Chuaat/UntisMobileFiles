// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.d;
import io.reactivex.internal.subscriptions.h;
import io.reactivex.internal.subscriptions.g;
import java.util.concurrent.Callable;
import o7.c;
import io.reactivex.plugins.a;
import io.reactivex.l;
import o7.b;
import x5.o;

public final class j3
{
    private j3() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U> l<U> a(final T t, final o<? super T, ? extends b<? extends U>> o) {
        return io.reactivex.plugins.a.P((l<U>)new a(t, (o<? super Object, ? extends o7.b<?>>)o));
    }
    
    public static <T, R> boolean b(final b<T> b, final c<? super R> c, final o<? super T, ? extends b<? extends R>> o) {
        if (b instanceof Callable) {
            final Throwable t;
            try {
                final Object call = ((Callable<Object>)b).call();
                if (call == null) {
                    g.b(c);
                    return true;
                }
                final b b2 = io.reactivex.internal.functions.b.g((b)o.apply((Object)call), "The mapper returned a null Publisher");
                if (b2 instanceof Callable) {
                    final Object call2 = ((Callable<Object>)b2).call();
                    if (call2 == null) {
                        g.b(c);
                        return true;
                    }
                    c.z((d)new h((o7.c<? super Object>)c, call2));
                    return true;
                }
            }
            finally {
                io.reactivex.exceptions.b.b(t);
                g.d(t, c);
                return true;
            }
            ((b)t).e((c)c);
            return true;
        }
        return false;
    }
    
    static final class a<T, R> extends l<R>
    {
        final T H;
        final o<? super T, ? extends b<? extends R>> I;
        
        a(final T h, final o<? super T, ? extends b<? extends R>> i) {
            this.H = h;
            this.I = i;
        }
        
        public void n6(final c<? super R> c) {
            try {
                final b b = io.reactivex.internal.functions.b.g((b)this.I.apply((Object)this.H), "The mapper returned a null Publisher");
                if (b instanceof Callable) {
                    try {
                        final Object call = ((Callable<Object>)b).call();
                        if (call == null) {
                            g.b(c);
                            return;
                        }
                        c.z((d)new h((o7.c<? super Object>)c, call));
                        return;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        g.d(t, c);
                        return;
                    }
                }
                b.e((c)c);
            }
            finally {
                final Throwable t2;
                g.d(t2, c);
            }
        }
    }
}
