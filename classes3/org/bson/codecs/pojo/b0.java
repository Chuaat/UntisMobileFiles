// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import org.bson.q0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.a;
import org.bson.codecs.r0;
import org.bson.w0;
import org.bson.codecs.s0;
import org.bson.p0;
import java.util.Map;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.bson.diagnostics.c;
import org.bson.codecs.n0;
import java.util.concurrent.ConcurrentMap;
import org.bson.codecs.configuration.d;
import org.bson.diagnostics.b;

final class b0<T> extends a0<T>
{
    private static final b g;
    private final org.bson.codecs.pojo.b<T> a;
    private final d b;
    private final g0 c;
    private final m d;
    private final ConcurrentMap<org.bson.codecs.pojo.b<?>, n0<?>> e;
    private final boolean f;
    
    static {
        g = c.a("PojoCodec");
    }
    
    b0(final org.bson.codecs.pojo.b<T> a, d f, final List<f0> list, final m d) {
        this.a = a;
        f = org.bson.codecs.configuration.c.f(org.bson.codecs.configuration.c.b(this), f);
        this.b = f;
        this.d = d;
        this.e = new ConcurrentHashMap<org.bson.codecs.pojo.b<?>, n0<?>>();
        this.c = new h0(this, f, list);
        this.f = t(a);
        this.u();
    }
    
    b0(final org.bson.codecs.pojo.b<T> a, final d d, final g0 c, final m d2, final ConcurrentMap<org.bson.codecs.pojo.b<?>, n0<?>> e, final boolean f) {
        this.a = a;
        this.b = org.bson.codecs.configuration.c.f(org.bson.codecs.configuration.c.b(this), d);
        this.d = d2;
        this.e = e;
        this.c = c;
        this.f = f;
        this.u();
    }
    
    private <S> void h(final j0<S> j0) {
        n0<S> n0;
        if (j0.d() != null) {
            n0 = j0.d();
        }
        else {
            n0 = this.v(j0);
        }
        j0.b(n0);
    }
    
    private <S, V> boolean i(final Class<S> clazz, final Class<V> obj) {
        return clazz.equals(obj) || (Collection.class.isAssignableFrom(clazz) && Collection.class.isAssignableFrom(obj)) || (Map.class.isAssignableFrom(clazz) && Map.class.isAssignableFrom(obj));
    }
    
    private void j(final p0 p3, final s0 s0, final s<T> s2) {
        p3.b4();
        while (p3.o5() != org.bson.w0.H) {
            final String f4 = p3.F4();
            if (this.a.n() && this.a.c().equals(f4)) {
                p3.U();
            }
            else {
                this.k(p3, s0, s2, f4, this.q(this.a, f4));
            }
        }
        p3.K3();
    }
    
    private <S> void k(final p0 p5, final s0 s0, final s<T> s2, final String s3, final j0<S> j0) {
        if (j0 != null) {
            final Object o = null;
            try {
                Object b;
                if (p5.O5() == org.bson.w0.R) {
                    p5.H4();
                    b = o;
                }
                else {
                    b = s0.b((r0<S>)j0.c(), p5);
                }
                if (j0.n()) {
                    s2.b(b, (j0<Object>)j0);
                }
                return;
            }
            catch (a a) {
                throw new a(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", this.a.h(), s3, a.getMessage()), a);
            }
            catch (org.bson.g0 g0) {
                throw new a(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", this.a.h(), s3, g0.getMessage()), g0);
            }
        }
        final b g2 = b0.g;
        if (g2.h()) {
            g2.o(String.format("Found property not present in the ClassModel: %s", s3));
        }
        p5.skipValue();
    }
    
    private <S> void l(final z0 z0, final T t, final x0 x0, final r<S> r) {
        if (r.d() == null) {
            return;
        }
        if (r.c() == null) {
            this.m(z0, t, x0, r.d());
            return;
        }
        final S value = r.d().g().get(t);
        while (true) {
            S b;
            if ((b = value) != null) {
                break Label_0095;
            }
            b = value;
            if (!x0.d()) {
                break Label_0095;
            }
            b = r.c().b();
            try {
                r.d().g().d(t, b);
                this.n(z0, x0, r.d(), b);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    private <S> void m(final z0 z0, final T t, final x0 x0, final j0<S> j0) {
        if (j0 != null && j0.m()) {
            this.n(z0, x0, j0, j0.g().get(t));
        }
    }
    
    private <S> void n(final z0 z0, final x0 x0, final j0<S> j0, final S n) {
        if (j0.o(n)) {
            z0.K(j0.i());
            if (n == null) {
                z0.T();
            }
            else {
                try {
                    x0.b(j0.c(), z0, n);
                }
                catch (a a) {
                    throw new a(String.format("Failed to encode '%s'. Encoding '%s' errored with: %s", this.a.h(), j0.i(), a.getMessage()), a);
                }
            }
        }
    }
    
    private n0<T> o(final p0 p5, final boolean b, final String s, final d d, final m m, n0<T> a) {
        n0<T> n0 = a;
        if (b) {
            final q0 s2 = p5.S4();
            p5.b4();
            int n2 = 0;
            while (n2 == 0 && p5.o5() != org.bson.w0.H) {
                if (s.equals(p5.F4())) {
                    try {
                        a = d.a(m.c(p5.U()));
                        n2 = 1;
                        continue;
                    }
                    catch (Exception ex) {
                        throw new a(String.format("Failed to decode '%s'. Decoding errored with: %s", this.a.h(), ex.getMessage()), ex);
                    }
                }
                p5.skipValue();
            }
            s2.reset();
            n0 = a;
        }
        return n0;
    }
    
    private <S> n0<S> p(final j0<S> j0) {
        try {
            return this.c.a(j0.j());
        }
        catch (a a) {
            return new w<S>(j0.j().a(), a);
        }
    }
    
    private j0<?> q(final org.bson.codecs.pojo.b<T> b, final String anObject) {
        for (final j0<?> j0 : b.j()) {
            if (j0.n() && j0.k().equals(anObject)) {
                return j0;
            }
        }
        return null;
    }
    
    private <S, V> org.bson.codecs.pojo.b<S> r(final org.bson.codecs.pojo.b<S> b, final j0<V> j0) {
        boolean b2;
        if (j0.p() == null) {
            b2 = b.n();
        }
        else {
            b2 = j0.p();
        }
        final String c = b.c();
        final int n = 1;
        int i = 0;
        final boolean b3 = c != null && b.b() != null;
        int n2;
        if (b2 != b.n() && b3) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (j0.j().getTypeParameters().isEmpty() && n2 == 0) {
            return b;
        }
        final ArrayList<j0<I>> list = new ArrayList<j0<I>>((Collection<? extends j0<I>>)b.j());
        j0<?> d = b.d();
        final List<o0<?>> typeParameters = j0.j().getTypeParameters();
        while (i < list.size()) {
            final j0<I> j2 = list.get(i);
            final String f = j2.f();
            final org.bson.codecs.pojo.p0 p2 = b.k().get(f);
            j0<?> j3 = d;
            if (p2.c()) {
                final j0<I> s = this.s(j2, p2, typeParameters);
                list.set(i, s);
                if ((j3 = d) != null) {
                    j3 = d;
                    if (d.f().equals(f)) {
                        j3 = s;
                    }
                }
            }
            ++i;
            d = j3;
        }
        boolean b4;
        if (n2 != 0) {
            b4 = j0.p();
        }
        else {
            b4 = b.n();
        }
        return new org.bson.codecs.pojo.b<S>((Class<Object>)b.l(), b.k(), (t<Object>)b.g(), b4, b.c(), b.b(), r.b(b, d), (List<j0<?>>)list);
    }
    
    private <V> j0<V> s(final j0<V> j0, final org.bson.codecs.pojo.p0 p3, final List<o0<?>> list) {
        final Map<Integer, Integer> b = p3.b();
        final Integer n = b.get(-1);
        o0<?> c;
        if (n != null) {
            c = list.get(n);
        }
        else {
            final o0.b<V> c2 = o0.c(j0.j().a());
            final ArrayList list2 = new ArrayList<o0<?>>(j0.j().getTypeParameters());
            for (int i = 0; i < list2.size(); ++i) {
                for (final Map.Entry<Integer, Integer> entry : b.entrySet()) {
                    if (entry.getKey().equals(i)) {
                        list2.set(i, list.get(entry.getValue()));
                    }
                }
            }
            c2.b((List<o0<?>>)list2);
            c = c2.c();
        }
        if (j0.j().equals(c)) {
            return j0;
        }
        return new j0<V>(j0.f(), j0.i(), j0.k(), (o0<Object>)c, null, (org.bson.codecs.pojo.n0<Object>)j0.h(), j0.p(), (d0<Object>)j0.g(), j0.e());
    }
    
    private static <T> boolean t(final org.bson.codecs.pojo.b<T> b) {
        if (!b.m()) {
            return true;
        }
        for (final Map.Entry<String, V> entry : b.k().entrySet()) {
            final org.bson.codecs.pojo.p0 p = (org.bson.codecs.pojo.p0)entry.getValue();
            final j0 i = b.i(entry.getKey());
            if (p.c() && (i == null || i.d() == null)) {
                return false;
            }
        }
        return true;
    }
    
    private void u() {
        if (this.f) {
            this.e.put(this.a, this);
            final Iterator<j0<?>> iterator = this.a.j().iterator();
            while (iterator.hasNext()) {
                this.h((j0<Object>)iterator.next());
            }
        }
    }
    
    private <S> n0<S> v(final j0<S> j0) {
        Object p;
        final n0<V> n0 = (n0<V>)(p = this.p((j0<V>)j0));
        if (n0 instanceof a0) {
            final org.bson.codecs.pojo.b<S> r = this.r(((a0<S>)n0).e(), (j0<S>)j0);
            if (this.e.containsKey(r)) {
                p = this.e.get(r);
            }
            else {
                p = new x<S>((org.bson.codecs.pojo.b<Object>)r, this.b, this.c, this.d, this.e);
            }
        }
        return (n0<S>)p;
    }
    
    @Override
    public void a(final z0 z0, final T t, final x0 x0) {
        if (this.f) {
            if (this.i(t.getClass(), this.a.l())) {
                z0.w0();
                this.l(z0, t, x0, this.a.e());
                if (this.a.n()) {
                    z0.S(this.a.c(), this.a.b());
                }
                for (final j0<Object> j0 : this.a.j()) {
                    if (j0.equals(this.a.d())) {
                        continue;
                    }
                    this.m(z0, t, x0, j0);
                }
                z0.N0();
            }
            else {
                this.b.a(t.getClass()).a(z0, t, x0);
            }
            return;
        }
        throw new a(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", this.a.h()));
    }
    
    @Override
    public T c(final p0 p2, final s0 s0) {
        if (!s0.c()) {
            return this.o(p2, this.a.n(), this.a.c(), this.b, this.d, this).c(p2, s0.a().b(true).a());
        }
        if (this.f) {
            final s<T> f = this.a.f();
            this.j(p2, s0, f);
            return f.a();
        }
        throw new a(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", this.a.h()));
    }
    
    @Override
    org.bson.codecs.pojo.b<T> e() {
        return this.a;
    }
    
    @Override
    public Class<T> g() {
        return this.a.l();
    }
    
    @Override
    public String toString() {
        return String.format("PojoCodec<%s>", this.a);
    }
}
