// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.b0;
import android.os.Build$VERSION;
import androidx.annotation.t0;
import java.util.concurrent.Executors;
import androidx.work.impl.a;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import android.annotation.SuppressLint;

public final class b
{
    @SuppressLint({ "MinMaxConstant" })
    public static final int m = 20;
    @j0
    final Executor a;
    @j0
    final Executor b;
    @j0
    final g0 c;
    @j0
    final p d;
    @j0
    final a0 e;
    @k0
    final n f;
    @k0
    final String g;
    final int h;
    final int i;
    final int j;
    final int k;
    private final boolean l;
    
    b(@j0 final a a) {
        Executor a2;
        if ((a2 = a.a) == null) {
            a2 = this.a();
        }
        this.a = a2;
        Executor b = a.d;
        if (b == null) {
            this.l = true;
            b = this.a();
        }
        else {
            this.l = false;
        }
        this.b = b;
        g0 c;
        if ((c = a.b) == null) {
            c = g0.c();
        }
        this.c = c;
        p d;
        if ((d = a.c) == null) {
            d = p.c();
        }
        this.d = d;
        a0 e;
        if ((e = a.e) == null) {
            e = new androidx.work.impl.a();
        }
        this.e = e;
        this.h = a.h;
        this.i = a.i;
        this.j = a.j;
        this.k = a.k;
        this.f = a.f;
        this.g = a.g;
    }
    
    @j0
    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
    
    @k0
    public String b() {
        return this.g;
    }
    
    @k0
    @t0({ t0.a.H })
    public n c() {
        return this.f;
    }
    
    @j0
    public Executor d() {
        return this.a;
    }
    
    @j0
    public p e() {
        return this.d;
    }
    
    public int f() {
        return this.j;
    }
    
    @b0(from = 20L, to = 50L)
    @t0({ t0.a.H })
    public int g() {
        if (Build$VERSION.SDK_INT == 23) {
            return this.k / 2;
        }
        return this.k;
    }
    
    public int h() {
        return this.i;
    }
    
    @t0({ t0.a.H })
    public int i() {
        return this.h;
    }
    
    @j0
    public a0 j() {
        return this.e;
    }
    
    @j0
    public Executor k() {
        return this.b;
    }
    
    @j0
    public g0 l() {
        return this.c;
    }
    
    @t0({ t0.a.H })
    public boolean m() {
        return this.l;
    }
    
    public static final class a
    {
        Executor a;
        g0 b;
        p c;
        Executor d;
        a0 e;
        @k0
        n f;
        @k0
        String g;
        int h;
        int i;
        int j;
        int k;
        
        public a() {
            this.h = 4;
            this.i = 0;
            this.j = Integer.MAX_VALUE;
            this.k = 20;
        }
        
        @t0({ t0.a.H })
        public a(@j0 final b b) {
            this.a = b.a;
            this.b = b.c;
            this.c = b.d;
            this.d = b.b;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
        }
        
        @j0
        public b a() {
            return new b(this);
        }
        
        @j0
        public a b(@j0 final String g) {
            this.g = g;
            return this;
        }
        
        @j0
        public a c(@j0 final Executor a) {
            this.a = a;
            return this;
        }
        
        @j0
        @t0({ t0.a.H })
        public a d(@j0 final n f) {
            this.f = f;
            return this;
        }
        
        @j0
        public a e(@j0 final p c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a f(final int i, final int j) {
            if (j - i >= 1000) {
                this.i = i;
                this.j = j;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }
        
        @j0
        public a g(final int a) {
            if (a >= 20) {
                this.k = Math.min(a, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }
        
        @j0
        public a h(final int h) {
            this.h = h;
            return this;
        }
        
        @j0
        public a i(@j0 final a0 e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a j(@j0 final Executor d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a k(@j0 final g0 b) {
            this.b = b;
            return this;
        }
    }
    
    public interface b
    {
        @j0
        androidx.work.b a();
    }
}
