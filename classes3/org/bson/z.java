// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import org.bson.types.Decimal128;
import java.util.Map;
import org.bson.types.ObjectId;

public class z extends a
{
    private y0 L;
    private d M;
    
    public z(final y l) {
        this.a0((a.b)new c(null, u.G, l));
        this.L = l;
    }
    
    @Override
    protected long C() {
        return this.L.U().h1();
    }
    
    @Override
    protected String D() {
        return this.L.b0().X0();
    }
    
    @Override
    protected String F() {
        return this.L.c0().Y0();
    }
    
    @Override
    protected void G() {
    }
    
    @Override
    protected void H() {
    }
    
    @Override
    protected void J() {
    }
    
    @Override
    protected ObjectId K() {
        return this.L.l0().Y0();
    }
    
    @Override
    protected r0 L() {
        return this.L.n0();
    }
    
    @Override
    protected void M() {
        this.a0((a.b)new c(this.w0(), u.I, this.L.f()));
    }
    
    @Override
    protected void N() {
        y y;
        if (this.L.t0() == w0.W) {
            y = this.L.c0().Z0();
        }
        else {
            y = this.L.I();
        }
        this.a0((a.b)new c(this.w0(), u.H, y));
    }
    
    @Deprecated
    @Override
    public void O() {
        if (this.M == null) {
            this.M = new d();
            return;
        }
        throw new h("A mark already exists; it needs to be reset before creating a new one");
    }
    
    @Override
    protected String Q() {
        return this.L.o0().Y0();
    }
    
    @Override
    protected String R() {
        return this.L.q0().X0();
    }
    
    @Override
    protected v0 S() {
        return this.L.r0();
    }
    
    @Override
    public q0 S4() {
        return new d();
    }
    
    @Override
    protected void T() {
    }
    
    @Override
    protected void V() {
    }
    
    @Override
    protected void W() {
    }
    
    @Override
    protected int j() {
        return this.L.i().b1().length;
    }
    
    @Override
    protected byte k() {
        return this.L.i().c1();
    }
    
    @Override
    protected o n() {
        return this.L.i();
    }
    
    @Override
    protected boolean o() {
        return this.L.v().Y0();
    }
    
    @Override
    public w0 o5() {
        if (this.Z() != a.d.G && this.Z() != a.d.K) {
            final a.d z = this.Z();
            final a.d h = a.d.H;
            if (z != h) {
                this.i0("ReadBSONType", h);
            }
            final int n = z$a.a[((a.b)this.w0()).c().ordinal()];
            a.d d;
            if (n != 1) {
                if (n != 2) {
                    throw new h("Invalid ContextType.");
                }
                final Map.Entry<String, y0> e = this.w0().e();
                if (e == null) {
                    this.f0(a.d.L);
                    return w0.H;
                }
                this.e0(e.getKey());
                this.L = e.getValue();
                d = a.d.I;
            }
            else {
                if ((this.L = this.w0().f()) == null) {
                    this.f0(a.d.M);
                    return w0.H;
                }
                d = a.d.J;
            }
            this.f0(d);
            this.d0(this.L.t0());
            return this.O5();
        }
        this.d0(w0.K);
        this.f0(a.d.J);
        return this.O5();
    }
    
    @Override
    protected w q() {
        return this.L.z();
    }
    
    @Override
    protected long r() {
        return this.L.B().Y0();
    }
    
    @Deprecated
    @Override
    public void reset() {
        final d m = this.M;
        if (m != null) {
            m.reset();
            this.M = null;
            return;
        }
        throw new h("trying to reset a mark before creating it");
    }
    
    public Decimal128 s() {
        return this.L.E().c1();
    }
    
    @Override
    protected double t() {
        return this.L.O().h1();
    }
    
    @Override
    protected void w() {
        this.a0(((a.b)this.w0()).d());
    }
    
    protected c w0() {
        return (c)super.X();
    }
    
    @Override
    protected void x() {
        this.a0(((a.b)this.w0()).d());
        final int n = z$a.a[((a.b)this.w0()).c().ordinal()];
        a.d d;
        if (n != 1 && n != 2) {
            if (n != 3) {
                throw new h("Unexpected ContextType.");
            }
            d = a.d.N;
        }
        else {
            d = a.d.H;
        }
        this.f0(d);
    }
    
    @Override
    protected int y() {
        return this.L.P().h1();
    }
    
    private static class b<T> implements Iterator<T>
    {
        private Iterator<T> G;
        private List<T> H;
        private int I;
        private boolean J;
        
        protected b(final Iterator<T> g) {
            this.H = new ArrayList<T>();
            this.G = g;
            this.I = 0;
            this.J = false;
        }
        
        protected void a() {
            this.J = true;
        }
        
        protected void b() {
            this.I = 0;
            this.J = false;
        }
        
        @Override
        public boolean hasNext() {
            return this.G.hasNext() || this.I < this.H.size();
        }
        
        @Override
        public T next() {
            T t;
            if (this.I < this.H.size()) {
                t = this.H.get(this.I);
                if (!this.J) {
                    this.H.remove(0);
                    return t;
                }
            }
            else {
                final T t2 = t = this.G.next();
                if (!this.J) {
                    return t;
                }
                this.H.add(t2);
                t = t2;
            }
            ++this.I;
            return t;
        }
        
        @Override
        public void remove() {
        }
    }
    
    protected class c extends a.b
    {
        private z.b<Map.Entry<String, y0>> d;
        private z.b<y0> e;
        
        protected c(final c c, final u u, final n n) {
            super((a.b)c, u);
            this.e = (z.b<y0>)new z.b((Iterator<Object>)n.iterator());
        }
        
        protected c(final c c, final u u, final y y) {
            super((a.b)c, u);
            this.d = (z.b<Map.Entry<String, y0>>)new z.b((Iterator<Object>)y.entrySet().iterator());
        }
        
        public Map.Entry<String, y0> e() {
            if (this.d.hasNext()) {
                return this.d.next();
            }
            return null;
        }
        
        public y0 f() {
            if (this.e.hasNext()) {
                return this.e.next();
            }
            return null;
        }
        
        protected void g() {
            Iterator<T> iterator = (Iterator<T>)this.d;
            if (iterator == null) {
                iterator = (Iterator<T>)this.e;
            }
            ((z.b)iterator).a();
            if (((a.b)this).d() != null) {
                ((c)((a.b)this).d()).g();
            }
        }
        
        protected void h() {
            Iterator<T> iterator = (Iterator<T>)this.d;
            if (iterator == null) {
                iterator = (Iterator<T>)this.e;
            }
            ((z.b)iterator).b();
            if (((a.b)this).d() != null) {
                ((c)((a.b)this).d()).h();
            }
        }
    }
    
    protected class d extends a.c
    {
        private final y0 g;
        private final z.c h;
        
        protected d() {
            this.g = z.this.L;
            (this.h = z.this.w0()).g();
        }
        
        @Override
        public void reset() {
            super.reset();
            z.this.L = this.g;
            z.this.a0((a.b)this.h);
            this.h.h();
        }
    }
}
