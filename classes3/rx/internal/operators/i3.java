// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.n;
import rx.g;

public final class i3<T> implements b<T, T>
{
    final int G;
    
    public i3(final int n) {
        if (n >= 0) {
            this.G = n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("n >= 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public n<? super T> a(final n<? super T> n) {
        return new n<T>(n) {
            int L;
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                n.c();
            }
            
            @Override
            public void m(final T t) {
                final int l = this.L;
                if (l >= i3.this.G) {
                    n.m(t);
                }
                else {
                    this.L = l + 1;
                }
            }
            
            @Override
            public void s0(final i i) {
                n.s0(i);
                i.v(i3.this.G);
            }
        };
    }
}
