// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.o;
import rx.exceptions.c;
import rx.m;
import java.util.Objects;
import rx.functions.p;
import rx.k;

public final class b5<T> implements t<T>
{
    private final k<? extends T> G;
    final p<Throwable, ? extends k<? extends T>> H;
    
    private b5(final k<? extends T> k, final p<Throwable, ? extends k<? extends T>> p2) {
        Objects.requireNonNull(k, "originalSingle must not be null");
        Objects.requireNonNull(p2, "resumeFunctionInCaseOfError must not be null");
        this.G = k;
        this.H = p2;
    }
    
    public static <T> b5<T> b(final k<? extends T> k, final p<Throwable, ? extends k<? extends T>> p2) {
        return new b5<T>(k, p2);
    }
    
    public static <T> b5<T> c(final k<? extends T> k, final k<? extends T> obj) {
        Objects.requireNonNull(obj, "resumeSingleInCaseOfError must not be null");
        return new b5<T>(k, new p<Throwable, k<? extends T>>() {
            public k<? extends T> a(final Throwable t) {
                return obj;
            }
        });
    }
    
    public void a(final m<? super T> m) {
        final m<T> i = new m<T>() {
            @Override
            public void b(final Throwable t) {
                try {
                    ((k)b5.this.H.h(t)).j0(m);
                }
                finally {
                    c.h(t, m);
                }
            }
            
            @Override
            public void e(final T t) {
                m.e(t);
            }
        };
        m.d(i);
        this.G.j0(i);
    }
}
