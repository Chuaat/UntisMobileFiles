// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.r;

public final class w3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final r<? super T> I;
    
    public w3(final l<T> l, final r<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (r<? super T>)this.I));
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        final r<? super T> H;
        d I;
        boolean J;
        
        a(final c<? super T> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            Label_0020: {
                if (!this.J) {
                    break Label_0020;
                }
                while (true) {
                    this.G.m((Object)t);
                    return;
                    try {
                        if (this.H.a((Object)t)) {
                            this.I.v(1L);
                            return;
                        }
                        this.J = true;
                        continue;
                    }
                    finally {
                        b.b((Throwable)t);
                        this.I.cancel();
                        this.G.b((Throwable)t);
                    }
                    break;
                }
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
}
