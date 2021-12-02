// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.concurrent.Executors;
import androidx.annotation.t0;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.util.concurrent.Executor;

public final class c<T>
{
    @k0
    private final Executor a;
    @j0
    private final Executor b;
    @j0
    private final k.f<T> c;
    
    c(@k0 final Executor a, @j0 final Executor b, @j0 final k.f<T> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    public Executor a() {
        return this.b;
    }
    
    @j0
    public k.f<T> b() {
        return this.c;
    }
    
    @k0
    @t0({ t0.a.G })
    public Executor c() {
        return this.a;
    }
    
    public static final class a<T>
    {
        private static final Object d;
        private static Executor e;
        @k0
        private Executor a;
        private Executor b;
        private final k.f<T> c;
        
        static {
            d = new Object();
        }
        
        public a(@j0 final k.f<T> c) {
            this.c = c;
        }
        
        @j0
        public c<T> a() {
            if (this.b == null) {
                synchronized (androidx.recyclerview.widget.c.a.d) {
                    if (androidx.recyclerview.widget.c.a.e == null) {
                        androidx.recyclerview.widget.c.a.e = Executors.newFixedThreadPool(2);
                    }
                    // monitorexit(a.d)
                    this.b = androidx.recyclerview.widget.c.a.e;
                }
            }
            return new c<T>(this.a, this.b, this.c);
        }
        
        @j0
        public a<T> b(final Executor b) {
            this.b = b;
            return this;
        }
        
        @j0
        @t0({ t0.a.G })
        public a<T> c(final Executor a) {
            this.a = a;
            return this;
        }
    }
}
