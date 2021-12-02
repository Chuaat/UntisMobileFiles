// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.a;
import rx.o;
import rx.d;
import rx.b;

public final class w0<T> implements j0
{
    public static volatile boolean I;
    final j0 G;
    final String H;
    
    public w0(final j0 g) {
        this.G = g;
        this.H = v0.b();
    }
    
    public void a(final d d) {
        ((rx.functions.b<a>)this.G).h(new a(d, this.H));
    }
    
    static final class a implements d
    {
        final d G;
        final String H;
        
        public a(final d g, final String h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void a(final o o) {
            this.G.a(o);
        }
        
        @Override
        public void b(final Throwable t) {
            new rx.exceptions.a(this.H).a(t);
            this.G.b(t);
        }
        
        @Override
        public void c() {
            this.G.c();
        }
    }
}
