// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.n;
import java.util.Objects;
import rx.functions.a;
import rx.g;

public final class g2<T> implements b<T, T>
{
    final rx.functions.a G;
    
    public g2(final rx.functions.a a) {
        Objects.requireNonNull(a, "Action can not be null");
        this.G = a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            @Override
            public void b(final Throwable t) {
                try {
                    n.b(t);
                }
                finally {
                    this.w();
                }
            }
            
            @Override
            public void c() {
                try {
                    n.c();
                }
                finally {
                    this.w();
                }
            }
            
            @Override
            public void m(final T t) {
                n.m(t);
            }
            
            void w() {
                try {
                    g2.this.G.call();
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.e(t);
                    rx.plugins.c.I(t);
                }
            }
        };
    }
}
