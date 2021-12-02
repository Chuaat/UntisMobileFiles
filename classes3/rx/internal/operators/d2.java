// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.n;
import rx.f;
import rx.g;

public final class d2<T> implements b<T, f<T>>
{
    d2() {
    }
    
    public static d2 b() {
        return c.a;
    }
    
    public n<? super f<T>> a(final n<? super T> n) {
        return new n<f<T>>(n) {
            boolean L;
            
            @Override
            public void b(final Throwable t) {
                if (!this.L) {
                    this.L = true;
                    n.b(t);
                }
            }
            
            @Override
            public void c() {
                if (!this.L) {
                    this.L = true;
                    n.c();
                }
            }
            
            public void w(final f<T> obj) {
                final int n = d2$b.a[obj.f().ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported notification type: ");
                            sb.append(obj);
                            this.b(new IllegalArgumentException(sb.toString()));
                        }
                        else {
                            this.c();
                        }
                    }
                    else {
                        this.b(obj.g());
                    }
                }
                else if (!this.L) {
                    n.m(obj.h());
                }
            }
        };
    }
    
    static final class c
    {
        static final d2<Object> a;
        
        static {
            a = new d2<Object>();
        }
    }
}
