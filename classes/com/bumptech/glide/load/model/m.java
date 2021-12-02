// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.util.Queue;
import androidx.annotation.b1;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.bumptech.glide.util.h;

public class m<A, B>
{
    private static final int b = 250;
    private final h<b<A>, B> a;
    
    public m() {
        this(250L);
    }
    
    public m(final long n) {
        this.a = new h<b<A>, B>(n) {
            protected void r(@j0 final b<A> b, @k0 final B b2) {
                b.c();
            }
        };
    }
    
    public void a() {
        this.a.b();
    }
    
    @k0
    public B b(final A a, final int n, final int n2) {
        final b<A> a2 = m.b.a(a, n, n2);
        final B k = this.a.k(a2);
        a2.c();
        return k;
    }
    
    public void c(final A a, final int n, final int n2, final B b) {
        this.a.o(m.b.a(a, n, n2), b);
    }
    
    @b1
    static final class b<A>
    {
        private static final Queue<b<?>> d;
        private int a;
        private int b;
        private A c;
        
        static {
            d = com.bumptech.glide.util.m.f(0);
        }
        
        private b() {
        }
        
        static <A> b<A> a(final A a, final int n, final int n2) {
            Object d = b.d;
            synchronized (d) {
                final b<A> b = ((Queue<b<A>>)d).poll();
                // monitorexit(d)
                d = b;
                if (b == null) {
                    d = new b<A>();
                }
                ((b<A>)d).b(a, n, n2);
                return (b<A>)d;
            }
        }
        
        private void b(final A c, final int b, final int a) {
            this.c = c;
            this.b = b;
            this.a = a;
        }
        
        public void c() {
            final Queue<b<?>> d = m.b.d;
            synchronized (d) {
                d.offer(this);
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof b;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final b b4 = (b)o;
                b3 = b2;
                if (this.b == b4.b) {
                    b3 = b2;
                    if (this.a == b4.a) {
                        b3 = b2;
                        if (this.c.equals(b4.c)) {
                            b3 = true;
                        }
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.c.hashCode();
        }
    }
}
