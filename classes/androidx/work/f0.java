// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import androidx.annotation.t0;
import java.util.Set;
import androidx.work.impl.model.r;
import androidx.annotation.j0;
import java.util.UUID;
import android.annotation.SuppressLint;

public abstract class f0
{
    public static final long d = 30000L;
    @SuppressLint({ "MinMaxConstant" })
    public static final long e = 18000000L;
    @SuppressLint({ "MinMaxConstant" })
    public static final long f = 10000L;
    @j0
    private UUID a;
    @j0
    private r b;
    @j0
    private Set<String> c;
    
    @t0({ t0.a.H })
    protected f0(@j0 final UUID a, @j0 final r b, @j0 final Set<String> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    public UUID a() {
        return this.a;
    }
    
    @j0
    @t0({ t0.a.H })
    public String b() {
        return this.a.toString();
    }
    
    @j0
    @t0({ t0.a.H })
    public Set<String> c() {
        return this.c;
    }
    
    @j0
    @t0({ t0.a.H })
    public r d() {
        return this.b;
    }
    
    public abstract static class a<B extends a<?, ?>, W extends f0>
    {
        boolean a;
        UUID b;
        r c;
        Set<String> d;
        Class<? extends ListenableWorker> e;
        
        a(@j0 final Class<? extends ListenableWorker> e) {
            this.a = false;
            this.d = new HashSet<String>();
            this.b = UUID.randomUUID();
            this.e = e;
            this.c = new r(this.b.toString(), e.getName());
            this.a(e.getName());
        }
        
        @j0
        public final B a(@j0 final String s) {
            this.d.add(s);
            return this.d();
        }
        
        @j0
        public final W b() {
            final f0 c = this.c();
            this.b = UUID.randomUUID();
            final r c2 = new r(this.c);
            this.c = c2;
            c2.a = this.b.toString();
            return (W)c;
        }
        
        @j0
        abstract W c();
        
        @j0
        abstract B d();
        
        @j0
        public final B e(final long duration, @j0 final TimeUnit timeUnit) {
            this.c.o = timeUnit.toMillis(duration);
            return this.d();
        }
        
        @j0
        @p0(26)
        public final B f(@j0 final Duration duration) {
            this.c.o = duration.toMillis();
            return this.d();
        }
        
        @j0
        public final B g(@j0 final androidx.work.a l, final long duration, @j0 final TimeUnit timeUnit) {
            this.a = true;
            final r c = this.c;
            c.l = l;
            c.e(timeUnit.toMillis(duration));
            return this.d();
        }
        
        @j0
        @p0(26)
        public final B h(@j0 final androidx.work.a l, @j0 final Duration duration) {
            this.a = true;
            final r c = this.c;
            c.l = l;
            c.e(duration.toMillis());
            return this.d();
        }
        
        @j0
        public final B i(@j0 final c j) {
            this.c.j = j;
            return this.d();
        }
        
        @j0
        public B j(final long duration, @j0 final TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return this.d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        
        @j0
        @p0(26)
        public B k(@j0 final Duration duration) {
            this.c.g = duration.toMillis();
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return this.d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        
        @b1
        @j0
        @t0({ t0.a.H })
        public final B l(final int k) {
            this.c.k = k;
            return this.d();
        }
        
        @b1
        @j0
        @t0({ t0.a.H })
        public final B m(@j0 final c0.a b) {
            this.c.b = b;
            return this.d();
        }
        
        @j0
        public final B n(@j0 final f e) {
            this.c.e = e;
            return this.d();
        }
        
        @b1
        @j0
        @t0({ t0.a.H })
        public final B o(final long duration, @j0 final TimeUnit timeUnit) {
            this.c.n = timeUnit.toMillis(duration);
            return this.d();
        }
        
        @b1
        @j0
        @t0({ t0.a.H })
        public final B p(final long duration, @j0 final TimeUnit timeUnit) {
            this.c.p = timeUnit.toMillis(duration);
            return this.d();
        }
    }
}
