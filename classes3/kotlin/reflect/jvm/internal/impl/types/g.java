// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.utils.j;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.reflect.jvm.internal.impl.types.model.n;
import kotlin.reflect.jvm.internal.impl.types.model.m;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import java.util.Set;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import java.util.ArrayDeque;
import kotlin.reflect.jvm.internal.impl.types.model.r;

public abstract class g implements r
{
    private int a;
    private boolean b;
    @f
    private ArrayDeque<k> c;
    @f
    private Set<k> d;
    
    public boolean A0(@e final k k) {
        return r.a.i(this, k);
    }
    
    public boolean B0(@e final i i) {
        return r.a.k(this, i);
    }
    
    public abstract boolean C0();
    
    @e
    public i D0(@e final i i) {
        k0.p((Object)i, "type");
        return i;
    }
    
    @Override
    public int E(@e final m m) {
        return r.a.m(this, m);
    }
    
    @e
    public i E0(@e final i i) {
        k0.p((Object)i, "type");
        return i;
    }
    
    @e
    @Override
    public k F(@e final i i) {
        return r.a.o(this, i);
    }
    
    @e
    public abstract b F0(@e final k p0);
    
    @e
    @Override
    public k Q(@e final i i) {
        return r.a.l(this, i);
    }
    
    @Override
    public boolean W(@e final i i) {
        return r.a.j(this, i);
    }
    
    @Override
    public boolean b0(@e final k k, @e final k i) {
        return r.a.e(this, k, i);
    }
    
    @f
    public Boolean k0(@e final i i, @e final i j, final boolean b) {
        k0.p((Object)i, "subType");
        k0.p((Object)j, "superType");
        return null;
    }
    
    public final void m0() {
        final ArrayDeque<k> c = this.c;
        k0.m((Object)c);
        c.clear();
        final Set<k> d = this.d;
        k0.m((Object)d);
        d.clear();
        this.b = false;
    }
    
    public boolean n0(@e final i i, @e final i j) {
        k0.p((Object)i, "subType");
        k0.p((Object)j, "superType");
        return true;
    }
    
    @e
    @Override
    public n o(@e final m m, final int n) {
        return r.a.b(this, m, n);
    }
    
    @f
    public List<k> o0(@e final k k, @e final o o) {
        return r.a.a(this, k, o);
    }
    
    @f
    public n p0(@e final k k, final int n) {
        return r.a.c(this, k, n);
    }
    
    @e
    @Override
    public o q(@e final i i) {
        return r.a.n(this, i);
    }
    
    @e
    public a q0(@e final k k, @e final kotlin.reflect.jvm.internal.impl.types.model.d d) {
        k0.p((Object)k, "subType");
        k0.p((Object)d, "superType");
        return g.a.H;
    }
    
    @f
    public final ArrayDeque<k> r0() {
        return this.c;
    }
    
    @f
    public final Set<k> s0() {
        return this.d;
    }
    
    public boolean t0(@e final i i) {
        return r.a.d(this, i);
    }
    
    public final void u0() {
        this.b = true;
        if (this.c == null) {
            this.c = new ArrayDeque<k>(4);
        }
        if (this.d == null) {
            this.d = (Set<k>)j.I.a();
        }
    }
    
    public abstract boolean v0(@e final i p0);
    
    public boolean w0(@e final k k) {
        return r.a.f(this, k);
    }
    
    public boolean x0(@e final i i) {
        return r.a.g(this, i);
    }
    
    public boolean y0(@e final i i) {
        return r.a.h(this, i);
    }
    
    public abstract boolean z0();
    
    public enum a
    {
        G, 
        H, 
        I;
    }
    
    public abstract static class b
    {
        private b() {
        }
        
        @e
        public abstract k a(@e final g p0, @e final i p1);
        
        public abstract static class a extends g.b
        {
            public a() {
                super(null);
            }
        }
        
        public static final class b extends g.b
        {
            @e
            public static final b a;
            
            static {
                a = new b();
            }
            
            private b() {
                super(null);
            }
            
            @e
            @Override
            public k a(@e final g g, @e final i i) {
                k0.p((Object)g, "context");
                k0.p((Object)i, "type");
                return g.Q(i);
            }
        }
        
        public static final class c extends g.b
        {
            @e
            public static final c a;
            
            static {
                a = new c();
            }
            
            private c() {
                super(null);
            }
            
            @e
            public Void b(@e final g g, @e final i i) {
                k0.p((Object)g, "context");
                k0.p((Object)i, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }
        
        public static final class d extends g.b
        {
            @e
            public static final d a;
            
            static {
                a = new d();
            }
            
            private d() {
                super(null);
            }
            
            @e
            @Override
            public k a(@e final g g, @e final i i) {
                k0.p((Object)g, "context");
                k0.p((Object)i, "type");
                return g.F(i);
            }
        }
    }
}
