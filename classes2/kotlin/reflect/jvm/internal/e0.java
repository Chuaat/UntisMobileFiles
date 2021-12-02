// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import java.util.Iterator;
import kotlin.reflect.c;
import kotlin.reflect.w;
import java.util.Collections;
import kotlin.reflect.u;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.f;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.x0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.i;
import kotlin.jvm.internal.f0;
import kotlin.reflect.d;
import kotlin.reflect.h;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.l1;

public class e0 extends l1
{
    public static void r() {
        g.a();
        c0.a();
    }
    
    private static k s(final q q) {
        final h owner = q.getOwner();
        k j;
        if (owner instanceof k) {
            j = (k)owner;
        }
        else {
            j = b.J;
        }
        return j;
    }
    
    @Override
    public d a(final Class clazz) {
        return new kotlin.reflect.jvm.internal.h(clazz);
    }
    
    @Override
    public d b(final Class clazz, final String s) {
        return new kotlin.reflect.jvm.internal.h(clazz);
    }
    
    @Override
    public i c(final f0 f0) {
        return new l(s(f0), f0.getName(), f0.getSignature(), f0.getBoundReceiver());
    }
    
    @Override
    public d d(final Class clazz) {
        return g.b((Class<Object>)clazz);
    }
    
    @Override
    public d e(final Class clazz, final String s) {
        return g.b((Class<Object>)clazz);
    }
    
    @Override
    public h f(final Class clazz, final String s) {
        return new p(clazz, s);
    }
    
    @Override
    public kotlin.reflect.k g(final t0 t0) {
        return new m(s(t0), t0.getName(), t0.getSignature(), t0.getBoundReceiver());
    }
    
    @Override
    public kotlin.reflect.l h(final v0 v0) {
        return new n(s(v0), v0.getName(), v0.getSignature(), v0.getBoundReceiver());
    }
    
    @Override
    public kotlin.reflect.m i(final x0 x0) {
        return new o(s(x0), x0.getName(), x0.getSignature());
    }
    
    @Override
    public kotlin.reflect.p j(final c1 c1) {
        return new r(s(c1), c1.getName(), c1.getSignature(), c1.getBoundReceiver());
    }
    
    @Override
    public kotlin.reflect.q k(final e1 e1) {
        return new s(s(e1), e1.getName(), e1.getSignature(), e1.getBoundReceiver());
    }
    
    @Override
    public kotlin.reflect.r l(final g1 g1) {
        return new t(s(g1), g1.getName(), g1.getSignature());
    }
    
    @Override
    public String m(final d0 d0) {
        final i<Object> a = f.a((kotlin.t<?>)d0);
        if (a != null) {
            final l b = k0.b(a);
            if (b != null) {
                return g0.b.e(b.y0());
            }
        }
        return super.m(d0);
    }
    
    @Override
    public String n(final m0 m0) {
        return this.m(m0);
    }
    
    @Override
    public void o(final kotlin.reflect.t t, final List<kotlin.reflect.s> list) {
    }
    
    @Override
    public kotlin.reflect.s p(final kotlin.reflect.g g, final List<u> list, final boolean b) {
        return kotlin.reflect.full.i.b(g, list, b, Collections.emptyList());
    }
    
    @Override
    public kotlin.reflect.t q(final Object o, final String s, final w w, final boolean b) {
        List list;
        if (o instanceof d) {
            list = ((d)o).getTypeParameters();
        }
        else {
            if (!(o instanceof c)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Type parameter container must be a class or a callable: ");
                sb.append(o);
                throw new IllegalArgumentException(sb.toString());
            }
            list = ((c)o).getTypeParameters();
        }
        for (final kotlin.reflect.t t : list) {
            if (t.getName().equals(s)) {
                return t;
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Type parameter ");
        sb2.append(s);
        sb2.append(" is not found in container: ");
        sb2.append(o);
        throw new IllegalArgumentException(sb2.toString());
    }
}
