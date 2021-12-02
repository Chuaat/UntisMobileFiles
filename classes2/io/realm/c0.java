// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import c6.h;
import io.realm.internal.p;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.internal.m;
import java.util.List;
import io.realm.internal.OsObject;
import io.realm.internal.r;
import io.realm.internal.n;

public final class c0<E extends n0> implements n.b
{
    private static b i;
    private E a;
    private boolean b;
    private r c;
    private OsObject d;
    private a e;
    private boolean f;
    private List<String> g;
    private m<OsObject.b> h;
    
    static {
        c0.i = new b();
    }
    
    public c0() {
        this.b = true;
        this.h = new m<OsObject.b>();
    }
    
    public c0(final E a) {
        this.b = true;
        this.h = new m<OsObject.b>();
        this.a = a;
    }
    
    private void k() {
        this.h.c((m.a<OsObject.b>)c0.i);
    }
    
    private void l() {
        final OsSharedRealm k = this.e.K;
        if (k != null && !k.isClosed()) {
            if (this.c.T()) {
                if (this.d == null) {
                    (this.d = new OsObject(this.e.K, (UncheckedRow)this.c)).setObserverPairs(this.h);
                    this.h = null;
                }
            }
        }
    }
    
    @Override
    public void a(final r c) {
        this.c = c;
        this.k();
        if (c.T()) {
            this.l();
        }
    }
    
    public void b(final q0<E> q0) {
        final r c = this.c;
        if (c instanceof n) {
            this.h.a(new OsObject.b((T)this.a, (q0<T>)q0));
        }
        else if (c instanceof UncheckedRow) {
            this.l();
            final OsObject d = this.d;
            if (d != null) {
                d.addListener(this.a, q0);
            }
        }
    }
    
    public void c(final n0 n0) {
        if (!p0.k8(n0) || !p0.j8(n0)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((p)n0).S6().f() == this.f()) {
            return;
        }
        throw new IllegalArgumentException("'value' belongs to a different Realm.");
    }
    
    public boolean d() {
        return this.f;
    }
    
    public List<String> e() {
        return this.g;
    }
    
    public a f() {
        return this.e;
    }
    
    public r g() {
        return this.c;
    }
    
    public boolean h() {
        return this.c.e1();
    }
    
    public boolean i() {
        return this.b;
    }
    
    public void j() {
        final r c = this.c;
        if (c instanceof n) {
            ((n)c).e();
        }
    }
    
    public void m() {
        final OsObject d = this.d;
        if (d != null) {
            d.removeListener(this.a);
        }
        else {
            this.h.b();
        }
    }
    
    public void n(final q0<E> q0) {
        final OsObject d = this.d;
        if (d != null) {
            d.removeListener(this.a, q0);
        }
        else {
            this.h.e(this.a, q0);
        }
    }
    
    public void o(final boolean f) {
        this.f = f;
    }
    
    public void p() {
        this.b = false;
        this.g = null;
    }
    
    public void q(final List<String> g) {
        this.g = g;
    }
    
    public void r(final a e) {
        this.e = e;
    }
    
    public void s(final r c) {
        this.c = c;
    }
    
    private static class b implements a<OsObject.b>
    {
        public void b(final OsObject.b b, final Object o) {
            b.a((n0)o, null);
        }
    }
    
    static class c<T extends n0> implements q0<T>
    {
        private final i0<T> a;
        
        c(final i0<T> a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }
        
        @Override
        public void a(final T t, @h final w w) {
            this.a.a(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof c && this.a == ((c)o).a;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
