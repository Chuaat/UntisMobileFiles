// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import rx.h;
import rx.n;
import rx.g;

public class e<T, R> extends f<T, R>
{
    private final rx.observers.f<T> H;
    private final f<T, R> I;
    
    public e(final f<T, R> i) {
        super(new a<R>() {
            public void a(final n<? super R> n) {
                i.R6(n);
            }
        });
        this.I = i;
        this.H = new rx.observers.f<T>(i);
    }
    
    @Override
    public boolean E7() {
        return this.I.E7();
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.b(t);
    }
    
    @Override
    public void c() {
        this.H.c();
    }
    
    @Override
    public void m(final T t) {
        this.H.m(t);
    }
}
