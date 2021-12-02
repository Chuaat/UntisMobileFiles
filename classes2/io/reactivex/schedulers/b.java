// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.schedulers;

import io.reactivex.internal.schedulers.r;
import io.reactivex.internal.schedulers.h;
import io.reactivex.internal.schedulers.g;
import io.reactivex.internal.schedulers.p;
import io.reactivex.annotations.e;
import io.reactivex.internal.schedulers.d;
import java.util.concurrent.Executor;
import io.reactivex.internal.schedulers.s;
import java.util.concurrent.Callable;
import io.reactivex.plugins.a;
import io.reactivex.annotations.f;
import io.reactivex.j0;

public final class b
{
    @io.reactivex.annotations.f
    static final j0 a;
    @io.reactivex.annotations.f
    static final j0 b;
    @io.reactivex.annotations.f
    static final j0 c;
    @io.reactivex.annotations.f
    static final j0 d;
    @io.reactivex.annotations.f
    static final j0 e;
    
    static {
        a = io.reactivex.plugins.a.J(new h());
        b = io.reactivex.plugins.a.G(new b());
        c = io.reactivex.plugins.a.H(new c());
        d = s.l();
        e = io.reactivex.plugins.a.I(new f());
    }
    
    private b() {
        throw new IllegalStateException("No instances!");
    }
    
    @io.reactivex.annotations.f
    public static j0 a() {
        return io.reactivex.plugins.a.X(io.reactivex.schedulers.b.b);
    }
    
    @io.reactivex.annotations.f
    public static j0 b(@io.reactivex.annotations.f final Executor executor) {
        return new io.reactivex.internal.schedulers.d(executor, false);
    }
    
    @io.reactivex.annotations.e
    @io.reactivex.annotations.f
    public static j0 c(@io.reactivex.annotations.f final Executor executor, final boolean b) {
        return new io.reactivex.internal.schedulers.d(executor, b);
    }
    
    @io.reactivex.annotations.f
    public static j0 d() {
        return io.reactivex.plugins.a.Z(io.reactivex.schedulers.b.c);
    }
    
    @io.reactivex.annotations.f
    public static j0 e() {
        return io.reactivex.plugins.a.a0(io.reactivex.schedulers.b.e);
    }
    
    public static void f() {
        a().h();
        d().h();
        e().h();
        g().h();
        i().h();
        p.b();
    }
    
    @io.reactivex.annotations.f
    public static j0 g() {
        return io.reactivex.plugins.a.c0(io.reactivex.schedulers.b.a);
    }
    
    public static void h() {
        a().j();
        d().j();
        e().j();
        g().j();
        i().j();
        p.c();
    }
    
    @io.reactivex.annotations.f
    public static j0 i() {
        return io.reactivex.schedulers.b.d;
    }
    
    static final class a
    {
        static final j0 a;
        
        static {
            a = new b();
        }
    }
    
    static final class b implements Callable<j0>
    {
        public j0 a() throws Exception {
            return io.reactivex.schedulers.b.a.a;
        }
    }
    
    static final class c implements Callable<j0>
    {
        public j0 a() throws Exception {
            return io.reactivex.schedulers.b.d.a;
        }
    }
    
    static final class d
    {
        static final j0 a;
        
        static {
            a = new io.reactivex.internal.schedulers.g();
        }
    }
    
    static final class e
    {
        static final j0 a;
        
        static {
            a = new io.reactivex.internal.schedulers.h();
        }
    }
    
    static final class f implements Callable<j0>
    {
        public j0 a() throws Exception {
            return io.reactivex.schedulers.b.e.a;
        }
    }
    
    static final class g
    {
        static final j0 a;
        
        static {
            a = new r();
        }
    }
    
    static final class h implements Callable<j0>
    {
        public j0 a() throws Exception {
            return g.a;
        }
    }
}
