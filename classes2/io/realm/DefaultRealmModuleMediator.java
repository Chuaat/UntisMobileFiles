// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.List;
import io.realm.internal.r;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import io.realm.internal.OsObjectSchemaInfo;
import java.io.IOException;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import java.io.Serializable;
import io.realm.internal.p;
import java.util.Map;
import java.util.Collections;
import w4.h;
import w4.i;
import com.untis.mobile.persistence.realm.period.e;
import com.untis.mobile.persistence.realm.period.g;
import com.untis.mobile.persistence.realm.period.f;
import com.untis.mobile.persistence.realm.period.d;
import com.untis.mobile.persistence.realm.period.c;
import o4.a;
import com.untis.mobile.persistence.realm.period.b;
import java.util.HashSet;
import java.util.Set;
import io.realm.annotations.RealmModule;
import io.realm.internal.q;

@RealmModule
class DefaultRealmModuleMediator extends q
{
    private static final Set<Class<? extends n0>> a;
    
    static {
        final HashSet<Class<b>> s = new HashSet<Class<b>>(69);
        s.add(a.class);
        s.add((Class<a>)b.class);
        s.add((Class<a>)com.untis.mobile.persistence.realm.period.a.class);
        s.add((Class<a>)c.class);
        s.add((Class<a>)d.class);
        s.add((Class<a>)f.class);
        s.add((Class<a>)g.class);
        s.add((Class<a>)e.class);
        s.add((Class<a>)com.untis.mobile.persistence.realm.a.class);
        s.add((Class<a>)v4.a.class);
        s.add((Class<a>)v4.b.class);
        s.add((Class<a>)com.untis.mobile.persistence.realm.e.class);
        s.add((Class<a>)m4.b.class);
        s.add((Class<a>)m4.a.class);
        s.add((Class<a>)i4.b.class);
        s.add((Class<a>)i4.a.class);
        s.add((Class<a>)n4.a.class);
        s.add((Class<a>)l4.a.class);
        s.add((Class<a>)l4.c.class);
        s.add((Class<a>)l4.b.class);
        s.add((Class<a>)j4.c.class);
        s.add((Class<a>)j4.b.class);
        s.add((Class<a>)j4.d.class);
        s.add((Class<a>)j4.a.class);
        s.add((Class<a>)i4.d.class);
        s.add((Class<a>)k4.a.class);
        s.add((Class<a>)k4.b.class);
        s.add((Class<a>)i4.c.class);
        s.add((Class<a>)a5.a.class);
        s.add((Class<a>)p4.a.class);
        s.add((Class<a>)p4.b.class);
        s.add((Class<a>)z4.c.class);
        s.add((Class<a>)z4.a.class);
        s.add((Class<a>)z4.b.class);
        s.add((Class<a>)b5.c.class);
        s.add((Class<a>)b5.b.class);
        s.add((Class<a>)b5.a.class);
        s.add((Class<a>)com.untis.mobile.persistence.realm.b.class);
        s.add((Class<a>)u4.b.class);
        s.add((Class<a>)u4.a.class);
        s.add((Class<a>)u4.c.class);
        s.add((Class<a>)s4.b.class);
        s.add((Class<a>)s4.a.class);
        s.add((Class<a>)r4.b.class);
        s.add((Class<a>)r4.d.class);
        s.add((Class<a>)r4.c.class);
        s.add((Class<a>)r4.a.class);
        s.add((Class<a>)q4.a.class);
        s.add((Class<a>)q4.b.class);
        s.add((Class<a>)t4.a.class);
        s.add((Class<a>)t4.b.class);
        s.add((Class<a>)w4.a.class);
        s.add((Class<a>)i.class);
        s.add((Class<a>)w4.e.class);
        s.add((Class<a>)h.class);
        s.add((Class<a>)w4.g.class);
        s.add((Class<a>)w4.d.class);
        s.add((Class<a>)w4.b.class);
        s.add((Class<a>)w4.f.class);
        s.add((Class<a>)w4.c.class);
        s.add((Class<a>)y4.a.class);
        s.add((Class<a>)y4.b.class);
        s.add((Class<a>)c5.e.class);
        s.add((Class<a>)c5.c.class);
        s.add((Class<a>)c5.b.class);
        s.add((Class<a>)c5.a.class);
        s.add((Class<a>)c5.d.class);
        s.add((Class<a>)x4.a.class);
        s.add((Class<a>)com.untis.mobile.persistence.realm.c.class);
        a = Collections.unmodifiableSet((Set<?>)s);
    }
    
    @Override
    public <E extends n0> E b(final f0 f0, final E e, final boolean b, final Map<n0, p> map, final Set<io.realm.q> set) {
        Serializable s;
        if (e instanceof p) {
            s = e.getClass().getSuperclass();
        }
        else {
            s = e.getClass();
        }
        p0 obj;
        if (s.equals(a.class)) {
            obj = l2.z8(f0, (l2.b)f0.H().j(a.class), (a)e, b, map, set);
        }
        else if (s.equals(b.class)) {
            obj = v4.x8(f0, (v4.b)f0.H().j(b.class), (b)e, b, map, set);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            obj = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), (com.untis.mobile.persistence.realm.period.a)e, b, map, set);
        }
        else if (s.equals(c.class)) {
            obj = x4.d9(f0, (x4.b)f0.H().j(c.class), (c)e, b, map, set);
        }
        else if (s.equals(d.class)) {
            obj = z4.x8(f0, (z4.b)f0.H().j(d.class), (d)e, b, map, set);
        }
        else if (s.equals(f.class)) {
            obj = d5.x8(f0, (d5.b)f0.H().j(f.class), (f)e, b, map, set);
        }
        else if (s.equals(g.class)) {
            obj = f5.F8(f0, (f5.b)f0.H().j(g.class), (g)e, b, map, set);
        }
        else if (s.equals(e.class)) {
            obj = b5.x8(f0, (b5.b)f0.H().j(e.class), (e)e, b, map, set);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
            obj = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), (com.untis.mobile.persistence.realm.a)e, b, map, set);
        }
        else if (s.equals(v4.a.class)) {
            obj = r3.F8(f0, (r3.b)f0.H().j(v4.a.class), (v4.a)e, b, map, set);
        }
        else if (s.equals(v4.b.class)) {
            obj = t3.z8(f0, (t3.b)f0.H().j(v4.b.class), (v4.b)e, b, map, set);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
            obj = d1.v8(f0, (d1.b)f0.H().j(com.untis.mobile.persistence.realm.e.class), (com.untis.mobile.persistence.realm.e)e, b, map, set);
        }
        else if (s.equals(m4.b.class)) {
            obj = h2.H8(f0, (h2.b)f0.H().j(m4.b.class), (m4.b)e, b, map, set);
        }
        else if (s.equals(m4.a.class)) {
            obj = f2.W8(f0, (f2.b)f0.H().j(m4.a.class), (m4.a)e, b, map, set);
        }
        else if (s.equals(i4.b.class)) {
            obj = h1.P8(f0, (h1.b)f0.H().j(i4.b.class), (i4.b)e, b, map, set);
        }
        else if (s.equals(i4.a.class)) {
            obj = f1.N8(f0, (f1.b)f0.H().j(i4.a.class), (i4.a)e, b, map, set);
        }
        else if (s.equals(n4.a.class)) {
            obj = j2.H8(f0, (j2.b)f0.H().j(n4.a.class), (n4.a)e, b, map, set);
        }
        else if (s.equals(l4.a.class)) {
            obj = z1.J8(f0, (z1.b)f0.H().j(l4.a.class), (l4.a)e, b, map, set);
        }
        else if (s.equals(l4.c.class)) {
            obj = b2.B8(f0, (b2.b)f0.H().j(l4.c.class), (l4.c)e, b, map, set);
        }
        else if (s.equals(l4.b.class)) {
            obj = d2.F8(f0, (d2.b)f0.H().j(l4.b.class), (l4.b)e, b, map, set);
        }
        else if (s.equals(j4.c.class)) {
            obj = r1.D8(f0, (r1.b)f0.H().j(j4.c.class), (j4.c)e, b, map, set);
        }
        else if (s.equals(j4.b.class)) {
            obj = p1.B8(f0, (p1.b)f0.H().j(j4.b.class), (j4.b)e, b, map, set);
        }
        else if (s.equals(j4.d.class)) {
            obj = t1.B8(f0, (t1.b)f0.H().j(j4.d.class), (j4.d)e, b, map, set);
        }
        else if (s.equals(j4.a.class)) {
            obj = n1.R8(f0, (n1.b)f0.H().j(j4.a.class), (j4.a)e, b, map, set);
        }
        else if (s.equals(i4.d.class)) {
            obj = l1.B8(f0, (l1.b)f0.H().j(i4.d.class), (i4.d)e, b, map, set);
        }
        else if (s.equals(k4.a.class)) {
            obj = v1.F8(f0, (v1.b)f0.H().j(k4.a.class), (k4.a)e, b, map, set);
        }
        else if (s.equals(k4.b.class)) {
            obj = x1.B8(f0, (x1.b)f0.H().j(k4.b.class), (k4.b)e, b, map, set);
        }
        else if (s.equals(i4.c.class)) {
            obj = j1.J8(f0, (j1.b)f0.H().j(i4.c.class), (i4.c)e, b, map, set);
        }
        else if (s.equals(a5.a.class)) {
            obj = n5.T8(f0, (n5.b)f0.H().j(a5.a.class), (a5.a)e, b, map, set);
        }
        else if (s.equals(p4.a.class)) {
            obj = n2.X8(f0, (n2.b)f0.H().j(p4.a.class), (p4.a)e, b, map, set);
        }
        else if (s.equals(p4.b.class)) {
            obj = p2.z8(f0, (p2.b)f0.H().j(p4.b.class), (p4.b)e, b, map, set);
        }
        else if (s.equals(z4.c.class)) {
            obj = l5.la(f0, (l5.b)f0.H().j(z4.c.class), (z4.c)e, b, map, set);
        }
        else if (s.equals(z4.a.class)) {
            obj = h5.B8(f0, (h5.b)f0.H().j(z4.a.class), (z4.a)e, b, map, set);
        }
        else if (s.equals(z4.b.class)) {
            obj = j5.J8(f0, (j5.b)f0.H().j(z4.b.class), (z4.b)e, b, map, set);
        }
        else if (s.equals(b5.c.class)) {
            obj = t5.z8(f0, (t5.b)f0.H().j(b5.c.class), (b5.c)e, b, map, set);
        }
        else if (s.equals(b5.b.class)) {
            obj = p5.x8(f0, (p5.b)f0.H().j(b5.b.class), (b5.b)e, b, map, set);
        }
        else if (s.equals(b5.a.class)) {
            obj = r5.x8(f0, (r5.b)f0.H().j(b5.a.class), (b5.a)e, b, map, set);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
            obj = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), (com.untis.mobile.persistence.realm.b)e, b, map, set);
        }
        else if (s.equals(u4.b.class)) {
            obj = l3.H8(f0, (l3.b)f0.H().j(u4.b.class), (u4.b)e, b, map, set);
        }
        else if (s.equals(u4.a.class)) {
            obj = n3.D8(f0, (n3.b)f0.H().j(u4.a.class), (u4.a)e, b, map, set);
        }
        else if (s.equals(u4.c.class)) {
            obj = p3.x8(f0, (p3.b)f0.H().j(u4.c.class), (u4.c)e, b, map, set);
        }
        else if (s.equals(s4.b.class)) {
            obj = f3.B8(f0, (f3.b)f0.H().j(s4.b.class), (s4.b)e, b, map, set);
        }
        else if (s.equals(s4.a.class)) {
            obj = d3.P8(f0, (d3.b)f0.H().j(s4.a.class), (s4.a)e, b, map, set);
        }
        else if (s.equals(r4.b.class)) {
            obj = v2.F8(f0, (v2.b)f0.H().j(r4.b.class), (r4.b)e, b, map, set);
        }
        else if (s.equals(r4.d.class)) {
            obj = b3.J8(f0, (b3.b)f0.H().j(r4.d.class), (r4.d)e, b, map, set);
        }
        else if (s.equals(r4.c.class)) {
            obj = x2.D8(f0, (x2.b)f0.H().j(r4.c.class), (r4.c)e, b, map, set);
        }
        else if (s.equals(r4.a.class)) {
            obj = z2.z8(f0, (z2.b)f0.H().j(r4.a.class), (r4.a)e, b, map, set);
        }
        else if (s.equals(q4.a.class)) {
            obj = r2.D8(f0, (r2.b)f0.H().j(q4.a.class), (q4.a)e, b, map, set);
        }
        else if (s.equals(q4.b.class)) {
            obj = t2.N8(f0, (t2.b)f0.H().j(q4.b.class), (q4.b)e, b, map, set);
        }
        else if (s.equals(t4.a.class)) {
            obj = h3.X8(f0, (h3.b)f0.H().j(t4.a.class), (t4.a)e, b, map, set);
        }
        else if (s.equals(t4.b.class)) {
            obj = j3.z8(f0, (j3.b)f0.H().j(t4.b.class), (t4.b)e, b, map, set);
        }
        else if (s.equals(w4.a.class)) {
            obj = v3.D8(f0, (v3.b)f0.H().j(w4.a.class), (w4.a)e, b, map, set);
        }
        else if (s.equals(i.class)) {
            obj = l4.N8(f0, (l4.b)f0.H().j(i.class), (i)e, b, map, set);
        }
        else if (s.equals(w4.e.class)) {
            obj = d4.H8(f0, (d4.b)f0.H().j(w4.e.class), (w4.e)e, b, map, set);
        }
        else if (s.equals(h.class)) {
            obj = j4.H8(f0, (j4.b)f0.H().j(h.class), (h)e, b, map, set);
        }
        else if (s.equals(w4.g.class)) {
            obj = h4.D8(f0, (h4.b)f0.H().j(w4.g.class), (w4.g)e, b, map, set);
        }
        else if (s.equals(w4.d.class)) {
            obj = b4.L8(f0, (b4.b)f0.H().j(w4.d.class), (w4.d)e, b, map, set);
        }
        else if (s.equals(w4.b.class)) {
            obj = x3.z8(f0, (x3.b)f0.H().j(w4.b.class), (w4.b)e, b, map, set);
        }
        else if (s.equals(w4.f.class)) {
            obj = f4.B8(f0, (f4.b)f0.H().j(w4.f.class), (w4.f)e, b, map, set);
        }
        else if (s.equals(w4.c.class)) {
            obj = z3.D8(f0, (z3.b)f0.H().j(w4.c.class), (w4.c)e, b, map, set);
        }
        else if (s.equals(y4.a.class)) {
            obj = p4.V8(f0, (p4.b)f0.H().j(y4.a.class), (y4.a)e, b, map, set);
        }
        else if (s.equals(y4.b.class)) {
            obj = r4.z8(f0, (r4.b)f0.H().j(y4.b.class), (y4.b)e, b, map, set);
        }
        else if (s.equals(c5.e.class)) {
            obj = d6.N8(f0, (d6.b)f0.H().j(c5.e.class), (c5.e)e, b, map, set);
        }
        else if (s.equals(c5.c.class)) {
            obj = z5.z9(f0, (z5.b)f0.H().j(c5.c.class), (c5.c)e, b, map, set);
        }
        else if (s.equals(c5.b.class)) {
            obj = x5.H8(f0, (x5.b)f0.H().j(c5.b.class), (c5.b)e, b, map, set);
        }
        else if (s.equals(c5.a.class)) {
            obj = v5.v8(f0, (v5.b)f0.H().j(c5.a.class), (c5.a)e, b, map, set);
        }
        else if (s.equals(c5.d.class)) {
            obj = b6.F8(f0, (b6.b)f0.H().j(c5.d.class), (c5.d)e, b, map, set);
        }
        else if (s.equals(x4.a.class)) {
            obj = n4.D8(f0, (n4.b)f0.H().j(x4.a.class), (x4.a)e, b, map, set);
        }
        else {
            if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h((Class<? extends n0>)s);
            }
            obj = b1.z8(f0, (b1.b)f0.H().j(com.untis.mobile.persistence.realm.c.class), (com.untis.mobile.persistence.realm.c)e, b, map, set);
        }
        return (E)((Class<? extends n0>)s).cast(obj);
    }
    
    @Override
    public io.realm.internal.c c(final Class<? extends n0> clazz, final OsSchemaInfo osSchemaInfo) {
        q.a(clazz);
        if (clazz.equals(a.class)) {
            return l2.A8(osSchemaInfo);
        }
        if (clazz.equals(b.class)) {
            return v4.y8(osSchemaInfo);
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            return t4.A8(osSchemaInfo);
        }
        if (clazz.equals(c.class)) {
            return x4.e9(osSchemaInfo);
        }
        if (clazz.equals(d.class)) {
            return z4.y8(osSchemaInfo);
        }
        if (clazz.equals(f.class)) {
            return d5.y8(osSchemaInfo);
        }
        if (clazz.equals(g.class)) {
            return f5.G8(osSchemaInfo);
        }
        if (clazz.equals(e.class)) {
            return b5.y8(osSchemaInfo);
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
            return x0.w8(osSchemaInfo);
        }
        if (clazz.equals(v4.a.class)) {
            return r3.G8(osSchemaInfo);
        }
        if (clazz.equals(v4.b.class)) {
            return t3.A8(osSchemaInfo);
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
            return d1.w8(osSchemaInfo);
        }
        if (clazz.equals(m4.b.class)) {
            return h2.I8(osSchemaInfo);
        }
        if (clazz.equals(m4.a.class)) {
            return f2.X8(osSchemaInfo);
        }
        if (clazz.equals(i4.b.class)) {
            return h1.Q8(osSchemaInfo);
        }
        if (clazz.equals(i4.a.class)) {
            return f1.O8(osSchemaInfo);
        }
        if (clazz.equals(n4.a.class)) {
            return j2.I8(osSchemaInfo);
        }
        if (clazz.equals(l4.a.class)) {
            return z1.K8(osSchemaInfo);
        }
        if (clazz.equals(l4.c.class)) {
            return b2.C8(osSchemaInfo);
        }
        if (clazz.equals(l4.b.class)) {
            return d2.G8(osSchemaInfo);
        }
        if (clazz.equals(j4.c.class)) {
            return r1.E8(osSchemaInfo);
        }
        if (clazz.equals(j4.b.class)) {
            return p1.C8(osSchemaInfo);
        }
        if (clazz.equals(j4.d.class)) {
            return t1.C8(osSchemaInfo);
        }
        if (clazz.equals(j4.a.class)) {
            return n1.S8(osSchemaInfo);
        }
        if (clazz.equals(i4.d.class)) {
            return l1.C8(osSchemaInfo);
        }
        if (clazz.equals(k4.a.class)) {
            return v1.G8(osSchemaInfo);
        }
        if (clazz.equals(k4.b.class)) {
            return x1.C8(osSchemaInfo);
        }
        if (clazz.equals(i4.c.class)) {
            return j1.K8(osSchemaInfo);
        }
        if (clazz.equals(a5.a.class)) {
            return n5.U8(osSchemaInfo);
        }
        if (clazz.equals(p4.a.class)) {
            return n2.Y8(osSchemaInfo);
        }
        if (clazz.equals(p4.b.class)) {
            return p2.A8(osSchemaInfo);
        }
        if (clazz.equals(z4.c.class)) {
            return l5.ma(osSchemaInfo);
        }
        if (clazz.equals(z4.a.class)) {
            return h5.C8(osSchemaInfo);
        }
        if (clazz.equals(z4.b.class)) {
            return j5.K8(osSchemaInfo);
        }
        if (clazz.equals(b5.c.class)) {
            return t5.A8(osSchemaInfo);
        }
        if (clazz.equals(b5.b.class)) {
            return p5.y8(osSchemaInfo);
        }
        if (clazz.equals(b5.a.class)) {
            return r5.y8(osSchemaInfo);
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
            return z0.w8(osSchemaInfo);
        }
        if (clazz.equals(u4.b.class)) {
            return l3.I8(osSchemaInfo);
        }
        if (clazz.equals(u4.a.class)) {
            return n3.E8(osSchemaInfo);
        }
        if (clazz.equals(u4.c.class)) {
            return p3.y8(osSchemaInfo);
        }
        if (clazz.equals(s4.b.class)) {
            return f3.C8(osSchemaInfo);
        }
        if (clazz.equals(s4.a.class)) {
            return d3.Q8(osSchemaInfo);
        }
        if (clazz.equals(r4.b.class)) {
            return v2.G8(osSchemaInfo);
        }
        if (clazz.equals(r4.d.class)) {
            return b3.K8(osSchemaInfo);
        }
        if (clazz.equals(r4.c.class)) {
            return x2.E8(osSchemaInfo);
        }
        if (clazz.equals(r4.a.class)) {
            return z2.A8(osSchemaInfo);
        }
        if (clazz.equals(q4.a.class)) {
            return r2.E8(osSchemaInfo);
        }
        if (clazz.equals(q4.b.class)) {
            return t2.O8(osSchemaInfo);
        }
        if (clazz.equals(t4.a.class)) {
            return h3.Y8(osSchemaInfo);
        }
        if (clazz.equals(t4.b.class)) {
            return j3.A8(osSchemaInfo);
        }
        if (clazz.equals(w4.a.class)) {
            return v3.E8(osSchemaInfo);
        }
        if (clazz.equals(i.class)) {
            return l4.O8(osSchemaInfo);
        }
        if (clazz.equals(w4.e.class)) {
            return d4.I8(osSchemaInfo);
        }
        if (clazz.equals(h.class)) {
            return j4.I8(osSchemaInfo);
        }
        if (clazz.equals(w4.g.class)) {
            return h4.E8(osSchemaInfo);
        }
        if (clazz.equals(w4.d.class)) {
            return b4.M8(osSchemaInfo);
        }
        if (clazz.equals(w4.b.class)) {
            return x3.A8(osSchemaInfo);
        }
        if (clazz.equals(w4.f.class)) {
            return f4.C8(osSchemaInfo);
        }
        if (clazz.equals(w4.c.class)) {
            return z3.E8(osSchemaInfo);
        }
        if (clazz.equals(y4.a.class)) {
            return p4.W8(osSchemaInfo);
        }
        if (clazz.equals(y4.b.class)) {
            return r4.A8(osSchemaInfo);
        }
        if (clazz.equals(c5.e.class)) {
            return d6.O8(osSchemaInfo);
        }
        if (clazz.equals(c5.c.class)) {
            return z5.A9(osSchemaInfo);
        }
        if (clazz.equals(c5.b.class)) {
            return x5.I8(osSchemaInfo);
        }
        if (clazz.equals(c5.a.class)) {
            return v5.w8(osSchemaInfo);
        }
        if (clazz.equals(c5.d.class)) {
            return b6.G8(osSchemaInfo);
        }
        if (clazz.equals(x4.a.class)) {
            return n4.E8(osSchemaInfo);
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
            return b1.A8(osSchemaInfo);
        }
        throw q.h(clazz);
    }
    
    @Override
    public <E extends n0> E d(final E e, final int n, final Map<n0, p.a<n0>> map) {
        final Class<? super n0> superclass = e.getClass().getSuperclass();
        p0 obj;
        if (superclass.equals(a.class)) {
            obj = l2.B8((a)e, 0, n, map);
        }
        else if (superclass.equals(b.class)) {
            obj = v4.z8((b)e, 0, n, map);
        }
        else if (superclass.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            obj = t4.B8((com.untis.mobile.persistence.realm.period.a)e, 0, n, map);
        }
        else if (superclass.equals(c.class)) {
            obj = x4.f9((c)e, 0, n, map);
        }
        else if (superclass.equals(d.class)) {
            obj = z4.z8((d)e, 0, n, map);
        }
        else if (superclass.equals(f.class)) {
            obj = d5.z8((f)e, 0, n, map);
        }
        else if (superclass.equals(g.class)) {
            obj = f5.H8((g)e, 0, n, map);
        }
        else if (superclass.equals(e.class)) {
            obj = b5.z8((e)e, 0, n, map);
        }
        else if (superclass.equals(com.untis.mobile.persistence.realm.a.class)) {
            obj = x0.x8((com.untis.mobile.persistence.realm.a)e, 0, n, map);
        }
        else if (superclass.equals(v4.a.class)) {
            obj = r3.H8((v4.a)e, 0, n, map);
        }
        else if (superclass.equals(v4.b.class)) {
            obj = t3.B8((v4.b)e, 0, n, map);
        }
        else if (superclass.equals(com.untis.mobile.persistence.realm.e.class)) {
            obj = d1.x8((com.untis.mobile.persistence.realm.e)e, 0, n, map);
        }
        else if (superclass.equals(m4.b.class)) {
            obj = h2.J8((m4.b)e, 0, n, map);
        }
        else if (superclass.equals(m4.a.class)) {
            obj = f2.Y8((m4.a)e, 0, n, map);
        }
        else if (superclass.equals(i4.b.class)) {
            obj = h1.R8((i4.b)e, 0, n, map);
        }
        else if (superclass.equals(i4.a.class)) {
            obj = f1.P8((i4.a)e, 0, n, map);
        }
        else if (superclass.equals(n4.a.class)) {
            obj = j2.J8((n4.a)e, 0, n, map);
        }
        else if (superclass.equals(l4.a.class)) {
            obj = z1.L8((l4.a)e, 0, n, map);
        }
        else if (superclass.equals(l4.c.class)) {
            obj = b2.D8((l4.c)e, 0, n, map);
        }
        else if (superclass.equals(l4.b.class)) {
            obj = d2.H8((l4.b)e, 0, n, map);
        }
        else if (superclass.equals(j4.c.class)) {
            obj = r1.F8((j4.c)e, 0, n, map);
        }
        else if (superclass.equals(j4.b.class)) {
            obj = p1.D8((j4.b)e, 0, n, map);
        }
        else if (superclass.equals(j4.d.class)) {
            obj = t1.D8((j4.d)e, 0, n, map);
        }
        else if (superclass.equals(j4.a.class)) {
            obj = n1.T8((j4.a)e, 0, n, map);
        }
        else if (superclass.equals(i4.d.class)) {
            obj = l1.D8((i4.d)e, 0, n, map);
        }
        else if (superclass.equals(k4.a.class)) {
            obj = v1.H8((k4.a)e, 0, n, map);
        }
        else if (superclass.equals(k4.b.class)) {
            obj = x1.D8((k4.b)e, 0, n, map);
        }
        else if (superclass.equals(i4.c.class)) {
            obj = j1.L8((i4.c)e, 0, n, map);
        }
        else if (superclass.equals(a5.a.class)) {
            obj = n5.V8((a5.a)e, 0, n, map);
        }
        else if (superclass.equals(p4.a.class)) {
            obj = n2.Z8((p4.a)e, 0, n, map);
        }
        else if (superclass.equals(p4.b.class)) {
            obj = p2.B8((p4.b)e, 0, n, map);
        }
        else if (superclass.equals(z4.c.class)) {
            obj = l5.na((z4.c)e, 0, n, map);
        }
        else if (superclass.equals(z4.a.class)) {
            obj = h5.D8((z4.a)e, 0, n, map);
        }
        else if (superclass.equals(z4.b.class)) {
            obj = j5.L8((z4.b)e, 0, n, map);
        }
        else if (superclass.equals(b5.c.class)) {
            obj = t5.B8((b5.c)e, 0, n, map);
        }
        else if (superclass.equals(b5.b.class)) {
            obj = p5.z8((b5.b)e, 0, n, map);
        }
        else if (superclass.equals(b5.a.class)) {
            obj = r5.z8((b5.a)e, 0, n, map);
        }
        else if (superclass.equals(com.untis.mobile.persistence.realm.b.class)) {
            obj = z0.x8((com.untis.mobile.persistence.realm.b)e, 0, n, map);
        }
        else if (superclass.equals(u4.b.class)) {
            obj = l3.J8((u4.b)e, 0, n, map);
        }
        else if (superclass.equals(u4.a.class)) {
            obj = n3.F8((u4.a)e, 0, n, map);
        }
        else if (superclass.equals(u4.c.class)) {
            obj = p3.z8((u4.c)e, 0, n, map);
        }
        else if (superclass.equals(s4.b.class)) {
            obj = f3.D8((s4.b)e, 0, n, map);
        }
        else if (superclass.equals(s4.a.class)) {
            obj = d3.R8((s4.a)e, 0, n, map);
        }
        else if (superclass.equals(r4.b.class)) {
            obj = v2.H8((r4.b)e, 0, n, map);
        }
        else if (superclass.equals(r4.d.class)) {
            obj = b3.L8((r4.d)e, 0, n, map);
        }
        else if (superclass.equals(r4.c.class)) {
            obj = x2.F8((r4.c)e, 0, n, map);
        }
        else if (superclass.equals(r4.a.class)) {
            obj = z2.B8((r4.a)e, 0, n, map);
        }
        else if (superclass.equals(q4.a.class)) {
            obj = r2.F8((q4.a)e, 0, n, map);
        }
        else if (superclass.equals(q4.b.class)) {
            obj = t2.P8((q4.b)e, 0, n, map);
        }
        else if (superclass.equals(t4.a.class)) {
            obj = h3.Z8((t4.a)e, 0, n, map);
        }
        else if (superclass.equals(t4.b.class)) {
            obj = j3.B8((t4.b)e, 0, n, map);
        }
        else if (superclass.equals(w4.a.class)) {
            obj = v3.F8((w4.a)e, 0, n, map);
        }
        else if (superclass.equals(i.class)) {
            obj = l4.P8((i)e, 0, n, map);
        }
        else if (superclass.equals(w4.e.class)) {
            obj = d4.J8((w4.e)e, 0, n, map);
        }
        else if (superclass.equals(h.class)) {
            obj = j4.J8((h)e, 0, n, map);
        }
        else if (superclass.equals(w4.g.class)) {
            obj = h4.F8((w4.g)e, 0, n, map);
        }
        else if (superclass.equals(w4.d.class)) {
            obj = b4.N8((w4.d)e, 0, n, map);
        }
        else if (superclass.equals(w4.b.class)) {
            obj = x3.B8((w4.b)e, 0, n, map);
        }
        else if (superclass.equals(w4.f.class)) {
            obj = f4.D8((w4.f)e, 0, n, map);
        }
        else if (superclass.equals(w4.c.class)) {
            obj = z3.F8((w4.c)e, 0, n, map);
        }
        else if (superclass.equals(y4.a.class)) {
            obj = p4.X8((y4.a)e, 0, n, map);
        }
        else if (superclass.equals(y4.b.class)) {
            obj = r4.B8((y4.b)e, 0, n, map);
        }
        else if (superclass.equals(c5.e.class)) {
            obj = d6.P8((c5.e)e, 0, n, map);
        }
        else if (superclass.equals(c5.c.class)) {
            obj = z5.B9((c5.c)e, 0, n, map);
        }
        else if (superclass.equals(c5.b.class)) {
            obj = x5.J8((c5.b)e, 0, n, map);
        }
        else if (superclass.equals(c5.a.class)) {
            obj = v5.x8((c5.a)e, 0, n, map);
        }
        else if (superclass.equals(c5.d.class)) {
            obj = b6.H8((c5.d)e, 0, n, map);
        }
        else if (superclass.equals(x4.a.class)) {
            obj = n4.F8((x4.a)e, 0, n, map);
        }
        else {
            if (!superclass.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h((Class<? extends n0>)superclass);
            }
            obj = b1.B8((com.untis.mobile.persistence.realm.c)e, 0, n, map);
        }
        return superclass.cast(obj);
    }
    
    @Override
    public <E extends n0> E e(final Class<E> clazz, final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        q.a(clazz);
        p0 obj;
        if (clazz.equals(a.class)) {
            obj = l2.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(b.class)) {
            obj = v4.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            obj = t4.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(c.class)) {
            obj = x4.h9(f0, jsonObject, b);
        }
        else if (clazz.equals(d.class)) {
            obj = z4.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(f.class)) {
            obj = d5.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(g.class)) {
            obj = f5.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(e.class)) {
            obj = b5.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
            obj = x0.z8(f0, jsonObject, b);
        }
        else if (clazz.equals(v4.a.class)) {
            obj = r3.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(v4.b.class)) {
            obj = t3.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
            obj = d1.z8(f0, jsonObject, b);
        }
        else if (clazz.equals(m4.b.class)) {
            obj = h2.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(m4.a.class)) {
            obj = f2.a9(f0, jsonObject, b);
        }
        else if (clazz.equals(i4.b.class)) {
            obj = h1.T8(f0, jsonObject, b);
        }
        else if (clazz.equals(i4.a.class)) {
            obj = f1.R8(f0, jsonObject, b);
        }
        else if (clazz.equals(n4.a.class)) {
            obj = j2.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(l4.a.class)) {
            obj = z1.N8(f0, jsonObject, b);
        }
        else if (clazz.equals(l4.c.class)) {
            obj = b2.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(l4.b.class)) {
            obj = d2.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(j4.c.class)) {
            obj = r1.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(j4.b.class)) {
            obj = p1.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(j4.d.class)) {
            obj = t1.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(j4.a.class)) {
            obj = n1.V8(f0, jsonObject, b);
        }
        else if (clazz.equals(i4.d.class)) {
            obj = l1.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(k4.a.class)) {
            obj = v1.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(k4.b.class)) {
            obj = x1.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(i4.c.class)) {
            obj = j1.N8(f0, jsonObject, b);
        }
        else if (clazz.equals(a5.a.class)) {
            obj = n5.X8(f0, jsonObject, b);
        }
        else if (clazz.equals(p4.a.class)) {
            obj = n2.b9(f0, jsonObject, b);
        }
        else if (clazz.equals(p4.b.class)) {
            obj = p2.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(z4.c.class)) {
            obj = l5.pa(f0, jsonObject, b);
        }
        else if (clazz.equals(z4.a.class)) {
            obj = h5.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(z4.b.class)) {
            obj = j5.N8(f0, jsonObject, b);
        }
        else if (clazz.equals(b5.c.class)) {
            obj = t5.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(b5.b.class)) {
            obj = p5.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(b5.a.class)) {
            obj = r5.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
            obj = z0.z8(f0, jsonObject, b);
        }
        else if (clazz.equals(u4.b.class)) {
            obj = l3.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(u4.a.class)) {
            obj = n3.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(u4.c.class)) {
            obj = p3.B8(f0, jsonObject, b);
        }
        else if (clazz.equals(s4.b.class)) {
            obj = f3.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(s4.a.class)) {
            obj = d3.T8(f0, jsonObject, b);
        }
        else if (clazz.equals(r4.b.class)) {
            obj = v2.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(r4.d.class)) {
            obj = b3.N8(f0, jsonObject, b);
        }
        else if (clazz.equals(r4.c.class)) {
            obj = x2.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(r4.a.class)) {
            obj = z2.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(q4.a.class)) {
            obj = r2.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(q4.b.class)) {
            obj = t2.R8(f0, jsonObject, b);
        }
        else if (clazz.equals(t4.a.class)) {
            obj = h3.b9(f0, jsonObject, b);
        }
        else if (clazz.equals(t4.b.class)) {
            obj = j3.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.a.class)) {
            obj = v3.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(i.class)) {
            obj = l4.R8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.e.class)) {
            obj = d4.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(h.class)) {
            obj = j4.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.g.class)) {
            obj = h4.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.d.class)) {
            obj = b4.P8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.b.class)) {
            obj = x3.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.f.class)) {
            obj = f4.F8(f0, jsonObject, b);
        }
        else if (clazz.equals(w4.c.class)) {
            obj = z3.H8(f0, jsonObject, b);
        }
        else if (clazz.equals(y4.a.class)) {
            obj = p4.Z8(f0, jsonObject, b);
        }
        else if (clazz.equals(y4.b.class)) {
            obj = r4.D8(f0, jsonObject, b);
        }
        else if (clazz.equals(c5.e.class)) {
            obj = d6.R8(f0, jsonObject, b);
        }
        else if (clazz.equals(c5.c.class)) {
            obj = z5.D9(f0, jsonObject, b);
        }
        else if (clazz.equals(c5.b.class)) {
            obj = x5.L8(f0, jsonObject, b);
        }
        else if (clazz.equals(c5.a.class)) {
            obj = v5.z8(f0, jsonObject, b);
        }
        else if (clazz.equals(c5.d.class)) {
            obj = b6.J8(f0, jsonObject, b);
        }
        else if (clazz.equals(x4.a.class)) {
            obj = n4.H8(f0, jsonObject, b);
        }
        else {
            if (!clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h(clazz);
            }
            obj = b1.D8(f0, jsonObject, b);
        }
        return clazz.cast(obj);
    }
    
    @Override
    public <E extends n0> E f(final Class<E> clazz, final f0 f0, final JsonReader jsonReader) throws IOException {
        q.a(clazz);
        p0 obj;
        if (clazz.equals(a.class)) {
            obj = l2.E8(f0, jsonReader);
        }
        else if (clazz.equals(b.class)) {
            obj = v4.C8(f0, jsonReader);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            obj = t4.E8(f0, jsonReader);
        }
        else if (clazz.equals(c.class)) {
            obj = x4.i9(f0, jsonReader);
        }
        else if (clazz.equals(d.class)) {
            obj = z4.C8(f0, jsonReader);
        }
        else if (clazz.equals(f.class)) {
            obj = d5.C8(f0, jsonReader);
        }
        else if (clazz.equals(g.class)) {
            obj = f5.K8(f0, jsonReader);
        }
        else if (clazz.equals(e.class)) {
            obj = b5.C8(f0, jsonReader);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
            obj = x0.A8(f0, jsonReader);
        }
        else if (clazz.equals(v4.a.class)) {
            obj = r3.K8(f0, jsonReader);
        }
        else if (clazz.equals(v4.b.class)) {
            obj = t3.E8(f0, jsonReader);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
            obj = d1.A8(f0, jsonReader);
        }
        else if (clazz.equals(m4.b.class)) {
            obj = h2.M8(f0, jsonReader);
        }
        else if (clazz.equals(m4.a.class)) {
            obj = f2.b9(f0, jsonReader);
        }
        else if (clazz.equals(i4.b.class)) {
            obj = h1.U8(f0, jsonReader);
        }
        else if (clazz.equals(i4.a.class)) {
            obj = f1.S8(f0, jsonReader);
        }
        else if (clazz.equals(n4.a.class)) {
            obj = j2.M8(f0, jsonReader);
        }
        else if (clazz.equals(l4.a.class)) {
            obj = z1.O8(f0, jsonReader);
        }
        else if (clazz.equals(l4.c.class)) {
            obj = b2.G8(f0, jsonReader);
        }
        else if (clazz.equals(l4.b.class)) {
            obj = d2.K8(f0, jsonReader);
        }
        else if (clazz.equals(j4.c.class)) {
            obj = r1.I8(f0, jsonReader);
        }
        else if (clazz.equals(j4.b.class)) {
            obj = p1.G8(f0, jsonReader);
        }
        else if (clazz.equals(j4.d.class)) {
            obj = t1.G8(f0, jsonReader);
        }
        else if (clazz.equals(j4.a.class)) {
            obj = n1.W8(f0, jsonReader);
        }
        else if (clazz.equals(i4.d.class)) {
            obj = l1.G8(f0, jsonReader);
        }
        else if (clazz.equals(k4.a.class)) {
            obj = v1.K8(f0, jsonReader);
        }
        else if (clazz.equals(k4.b.class)) {
            obj = x1.G8(f0, jsonReader);
        }
        else if (clazz.equals(i4.c.class)) {
            obj = j1.O8(f0, jsonReader);
        }
        else if (clazz.equals(a5.a.class)) {
            obj = n5.Y8(f0, jsonReader);
        }
        else if (clazz.equals(p4.a.class)) {
            obj = n2.c9(f0, jsonReader);
        }
        else if (clazz.equals(p4.b.class)) {
            obj = p2.E8(f0, jsonReader);
        }
        else if (clazz.equals(z4.c.class)) {
            obj = l5.qa(f0, jsonReader);
        }
        else if (clazz.equals(z4.a.class)) {
            obj = h5.G8(f0, jsonReader);
        }
        else if (clazz.equals(z4.b.class)) {
            obj = j5.O8(f0, jsonReader);
        }
        else if (clazz.equals(b5.c.class)) {
            obj = t5.E8(f0, jsonReader);
        }
        else if (clazz.equals(b5.b.class)) {
            obj = p5.C8(f0, jsonReader);
        }
        else if (clazz.equals(b5.a.class)) {
            obj = r5.C8(f0, jsonReader);
        }
        else if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
            obj = z0.A8(f0, jsonReader);
        }
        else if (clazz.equals(u4.b.class)) {
            obj = l3.M8(f0, jsonReader);
        }
        else if (clazz.equals(u4.a.class)) {
            obj = n3.I8(f0, jsonReader);
        }
        else if (clazz.equals(u4.c.class)) {
            obj = p3.C8(f0, jsonReader);
        }
        else if (clazz.equals(s4.b.class)) {
            obj = f3.G8(f0, jsonReader);
        }
        else if (clazz.equals(s4.a.class)) {
            obj = d3.U8(f0, jsonReader);
        }
        else if (clazz.equals(r4.b.class)) {
            obj = v2.K8(f0, jsonReader);
        }
        else if (clazz.equals(r4.d.class)) {
            obj = b3.O8(f0, jsonReader);
        }
        else if (clazz.equals(r4.c.class)) {
            obj = x2.I8(f0, jsonReader);
        }
        else if (clazz.equals(r4.a.class)) {
            obj = z2.E8(f0, jsonReader);
        }
        else if (clazz.equals(q4.a.class)) {
            obj = r2.I8(f0, jsonReader);
        }
        else if (clazz.equals(q4.b.class)) {
            obj = t2.S8(f0, jsonReader);
        }
        else if (clazz.equals(t4.a.class)) {
            obj = h3.c9(f0, jsonReader);
        }
        else if (clazz.equals(t4.b.class)) {
            obj = j3.E8(f0, jsonReader);
        }
        else if (clazz.equals(w4.a.class)) {
            obj = v3.I8(f0, jsonReader);
        }
        else if (clazz.equals(i.class)) {
            obj = l4.S8(f0, jsonReader);
        }
        else if (clazz.equals(w4.e.class)) {
            obj = d4.M8(f0, jsonReader);
        }
        else if (clazz.equals(h.class)) {
            obj = j4.M8(f0, jsonReader);
        }
        else if (clazz.equals(w4.g.class)) {
            obj = h4.I8(f0, jsonReader);
        }
        else if (clazz.equals(w4.d.class)) {
            obj = b4.Q8(f0, jsonReader);
        }
        else if (clazz.equals(w4.b.class)) {
            obj = x3.E8(f0, jsonReader);
        }
        else if (clazz.equals(w4.f.class)) {
            obj = f4.G8(f0, jsonReader);
        }
        else if (clazz.equals(w4.c.class)) {
            obj = z3.I8(f0, jsonReader);
        }
        else if (clazz.equals(y4.a.class)) {
            obj = p4.a9(f0, jsonReader);
        }
        else if (clazz.equals(y4.b.class)) {
            obj = r4.E8(f0, jsonReader);
        }
        else if (clazz.equals(c5.e.class)) {
            obj = d6.S8(f0, jsonReader);
        }
        else if (clazz.equals(c5.c.class)) {
            obj = z5.E9(f0, jsonReader);
        }
        else if (clazz.equals(c5.b.class)) {
            obj = x5.M8(f0, jsonReader);
        }
        else if (clazz.equals(c5.a.class)) {
            obj = v5.A8(f0, jsonReader);
        }
        else if (clazz.equals(c5.d.class)) {
            obj = b6.K8(f0, jsonReader);
        }
        else if (clazz.equals(x4.a.class)) {
            obj = n4.I8(f0, jsonReader);
        }
        else {
            if (!clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h(clazz);
            }
            obj = b1.E8(f0, jsonReader);
        }
        return clazz.cast(obj);
    }
    
    @Override
    public Map<Class<? extends n0>, OsObjectSchemaInfo> g() {
        final HashMap<Class<com.untis.mobile.persistence.realm.c>, OsObjectSchemaInfo> hashMap = (HashMap<Class<com.untis.mobile.persistence.realm.c>, OsObjectSchemaInfo>)new HashMap<Class<x4.a>, OsObjectSchemaInfo>(69);
        hashMap.put((Class<x4.a>)a.class, l2.F8());
        hashMap.put((Class<x4.a>)b.class, v4.D8());
        hashMap.put((Class<x4.a>)com.untis.mobile.persistence.realm.period.a.class, t4.F8());
        hashMap.put((Class<x4.a>)c.class, x4.j9());
        hashMap.put((Class<x4.a>)d.class, z4.D8());
        hashMap.put((Class<x4.a>)f.class, d5.D8());
        hashMap.put((Class<x4.a>)g.class, f5.L8());
        hashMap.put((Class<x4.a>)e.class, b5.D8());
        hashMap.put((Class<x4.a>)com.untis.mobile.persistence.realm.a.class, x0.B8());
        hashMap.put((Class<x4.a>)v4.a.class, r3.L8());
        hashMap.put((Class<x4.a>)v4.b.class, t3.F8());
        hashMap.put((Class<x4.a>)com.untis.mobile.persistence.realm.e.class, d1.B8());
        hashMap.put((Class<x4.a>)m4.b.class, h2.N8());
        hashMap.put((Class<x4.a>)m4.a.class, f2.c9());
        hashMap.put((Class<x4.a>)i4.b.class, h1.V8());
        hashMap.put((Class<x4.a>)i4.a.class, f1.T8());
        hashMap.put((Class<x4.a>)n4.a.class, j2.N8());
        hashMap.put((Class<x4.a>)l4.a.class, z1.P8());
        hashMap.put((Class<x4.a>)l4.c.class, b2.H8());
        hashMap.put((Class<x4.a>)l4.b.class, d2.L8());
        hashMap.put((Class<x4.a>)j4.c.class, r1.J8());
        hashMap.put((Class<x4.a>)j4.b.class, p1.H8());
        hashMap.put((Class<x4.a>)j4.d.class, t1.H8());
        hashMap.put((Class<x4.a>)j4.a.class, n1.X8());
        hashMap.put((Class<x4.a>)i4.d.class, l1.H8());
        hashMap.put((Class<x4.a>)k4.a.class, v1.L8());
        hashMap.put((Class<x4.a>)k4.b.class, x1.H8());
        hashMap.put((Class<x4.a>)i4.c.class, j1.P8());
        hashMap.put((Class<x4.a>)a5.a.class, n5.Z8());
        hashMap.put((Class<x4.a>)p4.a.class, n2.d9());
        hashMap.put((Class<x4.a>)p4.b.class, p2.F8());
        hashMap.put((Class<x4.a>)z4.c.class, l5.ra());
        hashMap.put((Class<x4.a>)z4.a.class, h5.H8());
        hashMap.put((Class<x4.a>)z4.b.class, j5.P8());
        hashMap.put((Class<x4.a>)b5.c.class, t5.F8());
        hashMap.put((Class<x4.a>)b5.b.class, p5.D8());
        hashMap.put((Class<x4.a>)b5.a.class, r5.D8());
        hashMap.put((Class<x4.a>)com.untis.mobile.persistence.realm.b.class, z0.B8());
        hashMap.put((Class<x4.a>)u4.b.class, l3.N8());
        hashMap.put((Class<x4.a>)u4.a.class, n3.J8());
        hashMap.put((Class<x4.a>)u4.c.class, p3.D8());
        hashMap.put((Class<x4.a>)s4.b.class, f3.H8());
        hashMap.put((Class<x4.a>)s4.a.class, d3.V8());
        hashMap.put((Class<x4.a>)r4.b.class, v2.L8());
        hashMap.put((Class<x4.a>)r4.d.class, b3.P8());
        hashMap.put((Class<x4.a>)r4.c.class, x2.J8());
        hashMap.put((Class<x4.a>)r4.a.class, z2.F8());
        hashMap.put((Class<x4.a>)q4.a.class, r2.J8());
        hashMap.put((Class<x4.a>)q4.b.class, t2.T8());
        hashMap.put((Class<x4.a>)t4.a.class, h3.d9());
        hashMap.put((Class<x4.a>)t4.b.class, j3.F8());
        hashMap.put((Class<x4.a>)w4.a.class, v3.J8());
        hashMap.put((Class<x4.a>)i.class, l4.T8());
        hashMap.put((Class<x4.a>)w4.e.class, d4.N8());
        hashMap.put((Class<x4.a>)h.class, j4.N8());
        hashMap.put((Class<x4.a>)w4.g.class, h4.J8());
        hashMap.put((Class<x4.a>)w4.d.class, b4.R8());
        hashMap.put((Class<x4.a>)w4.b.class, x3.F8());
        hashMap.put((Class<x4.a>)w4.f.class, f4.H8());
        hashMap.put((Class<x4.a>)w4.c.class, z3.J8());
        hashMap.put((Class<x4.a>)y4.a.class, p4.b9());
        hashMap.put((Class<x4.a>)y4.b.class, r4.F8());
        hashMap.put((Class<x4.a>)c5.e.class, d6.T8());
        hashMap.put((Class<x4.a>)c5.c.class, z5.F9());
        hashMap.put((Class<x4.a>)c5.b.class, x5.N8());
        hashMap.put((Class<x4.a>)c5.a.class, v5.B8());
        hashMap.put((Class<x4.a>)c5.d.class, b6.L8());
        hashMap.put(x4.a.class, n4.J8());
        hashMap.put(com.untis.mobile.persistence.realm.c.class, b1.F8());
        return (Map<Class<? extends n0>, OsObjectSchemaInfo>)hashMap;
    }
    
    @Override
    public Set<Class<? extends n0>> j() {
        return DefaultRealmModuleMediator.a;
    }
    
    public String m(final Class<? extends n0> clazz) {
        q.a(clazz);
        if (clazz.equals(a.class)) {
            return "RealmDriveAttachment";
        }
        if (clazz.equals(b.class)) {
            return "RealmKlassePair";
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            return "RealmElementPair";
        }
        if (clazz.equals(c.class)) {
            return "RealmPeriod";
        }
        if (clazz.equals(d.class)) {
            return "RealmRoomPair";
        }
        if (clazz.equals(f.class)) {
            return "RealmTeacherPair";
        }
        if (clazz.equals(g.class)) {
            return "RealmTimeTable";
        }
        if (clazz.equals(e.class)) {
            return "RealmSubjectPair";
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
            return "RealmInteger";
        }
        if (clazz.equals(v4.a.class)) {
            return "RealmLessonTopic";
        }
        if (clazz.equals(v4.b.class)) {
            return "RealmTeachingMethod";
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
            return "RealmString";
        }
        if (clazz.equals(m4.b.class)) {
            return "RealmLocalHomework";
        }
        if (clazz.equals(m4.a.class)) {
            return "RealmHomework";
        }
        if (clazz.equals(i4.b.class)) {
            return "RealmExemption";
        }
        if (clazz.equals(i4.a.class)) {
            return "RealmClassbook";
        }
        if (clazz.equals(n4.a.class)) {
            return "RealmPeriodInfo";
        }
        if (clazz.equals(l4.a.class)) {
            return "RealmEvent";
        }
        if (clazz.equals(l4.c.class)) {
            return "RealmEventReasonGroup";
        }
        if (clazz.equals(l4.b.class)) {
            return "RealmEventReason";
        }
        if (clazz.equals(j4.c.class)) {
            return "RealmExcuse";
        }
        if (clazz.equals(j4.b.class)) {
            return "RealmAbsenceReason";
        }
        if (clazz.equals(j4.d.class)) {
            return "RealmExcuseStatus";
        }
        if (clazz.equals(j4.a.class)) {
            return "RealmAbsence";
        }
        if (clazz.equals(i4.d.class)) {
            return "RealmTeacherClassRegData";
        }
        if (clazz.equals(k4.a.class)) {
            return "RealmClassRole";
        }
        if (clazz.equals(k4.b.class)) {
            return "RealmDuty";
        }
        if (clazz.equals(i4.c.class)) {
            return "RealmPrioritizedAttendance";
        }
        if (clazz.equals(a5.a.class)) {
            return "RealmSystemNotification";
        }
        if (clazz.equals(p4.a.class)) {
            return "RealmInfoCenterExam";
        }
        if (clazz.equals(p4.b.class)) {
            return "RealmInvigilator";
        }
        if (clazz.equals(z4.c.class)) {
            return "RealmProfile";
        }
        if (clazz.equals(z4.a.class)) {
            return "RealmChild";
        }
        if (clazz.equals(z4.b.class)) {
            return "RealmClassbookSettings";
        }
        if (clazz.equals(b5.c.class)) {
            return "RealmTimeGridUnit";
        }
        if (clazz.equals(b5.b.class)) {
            return "RealmTimeGridDay";
        }
        if (clazz.equals(b5.a.class)) {
            return "RealmTimeGrid";
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
            return "RealmLong";
        }
        if (clazz.equals(u4.b.class)) {
            return "RealmParentDayAppointment";
        }
        if (clazz.equals(u4.a.class)) {
            return "RealmParentDay";
        }
        if (clazz.equals(u4.c.class)) {
            return "RealmParentDayStudent";
        }
        if (clazz.equals(s4.b.class)) {
            return "RealmInfoCenterLesson";
        }
        if (clazz.equals(s4.a.class)) {
            return "RealmInfoCenterHomework";
        }
        if (clazz.equals(r4.b.class)) {
            return "RealmClassLeadEvent";
        }
        if (clazz.equals(r4.d.class)) {
            return "RealmClassLeadStudentAbsence";
        }
        if (clazz.equals(r4.c.class)) {
            return "RealmClassLeadExcuse";
        }
        if (clazz.equals(r4.a.class)) {
            return "RealmClassLead";
        }
        if (clazz.equals(q4.a.class)) {
            return "RealmInfoCenterExcuse";
        }
        if (clazz.equals(q4.b.class)) {
            return "RealmInfoCenterStudentAbsence";
        }
        if (clazz.equals(t4.a.class)) {
            return "RealmInfoCenterContactHour";
        }
        if (clazz.equals(t4.b.class)) {
            return "RealmInfoCenterContactHourTimeslot";
        }
        if (clazz.equals(w4.a.class)) {
            return "RealmCustomEntityColor";
        }
        if (clazz.equals(i.class)) {
            return "RealmTeacher";
        }
        if (clazz.equals(w4.e.class)) {
            return "RealmRoom";
        }
        if (clazz.equals(h.class)) {
            return "RealmSubject";
        }
        if (clazz.equals(w4.g.class)) {
            return "RealmStudent";
        }
        if (clazz.equals(w4.d.class)) {
            return "RealmKlasse";
        }
        if (clazz.equals(w4.b.class)) {
            return "RealmDepartment";
        }
        if (clazz.equals(w4.f.class)) {
            return "RealmSchoolyear";
        }
        if (clazz.equals(w4.c.class)) {
            return "RealmHoliday";
        }
        if (clazz.equals(y4.a.class)) {
            return "RealmOfficeHour";
        }
        if (clazz.equals(y4.b.class)) {
            return "RealmOfficeHourTimeSlot";
        }
        if (clazz.equals(c5.e.class)) {
            return "RealmTimeTableModel";
        }
        if (clazz.equals(c5.c.class)) {
            return "RealmPeriodModel";
        }
        if (clazz.equals(c5.b.class)) {
            return "RealmPeriodElementModel";
        }
        if (clazz.equals(c5.a.class)) {
            return "RealmHolidayModel";
        }
        if (clazz.equals(c5.d.class)) {
            return "RealmTimeTableEntity";
        }
        if (clazz.equals(x4.a.class)) {
            return "RealmMessageOfDay";
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
            return "RealmSchoolColor";
        }
        throw q.h(clazz);
    }
    
    @Override
    public void n(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        Serializable s;
        if (n0 instanceof p) {
            s = n0.getClass().getSuperclass();
        }
        else {
            s = n0.getClass();
        }
        if (s.equals(a.class)) {
            l2.H8(f0, (a)n0, map);
        }
        else if (s.equals(b.class)) {
            v4.F8(f0, (b)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            t4.H8(f0, (com.untis.mobile.persistence.realm.period.a)n0, map);
        }
        else if (s.equals(c.class)) {
            x4.l9(f0, (c)n0, map);
        }
        else if (s.equals(d.class)) {
            z4.F8(f0, (d)n0, map);
        }
        else if (s.equals(f.class)) {
            d5.F8(f0, (f)n0, map);
        }
        else if (s.equals(g.class)) {
            f5.N8(f0, (g)n0, map);
        }
        else if (s.equals(e.class)) {
            b5.F8(f0, (e)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
            x0.D8(f0, (com.untis.mobile.persistence.realm.a)n0, map);
        }
        else if (s.equals(v4.a.class)) {
            r3.N8(f0, (v4.a)n0, map);
        }
        else if (s.equals(v4.b.class)) {
            t3.H8(f0, (v4.b)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
            d1.D8(f0, (com.untis.mobile.persistence.realm.e)n0, map);
        }
        else if (s.equals(m4.b.class)) {
            h2.P8(f0, (m4.b)n0, map);
        }
        else if (s.equals(m4.a.class)) {
            f2.e9(f0, (m4.a)n0, map);
        }
        else if (s.equals(i4.b.class)) {
            h1.X8(f0, (i4.b)n0, map);
        }
        else if (s.equals(i4.a.class)) {
            f1.V8(f0, (i4.a)n0, map);
        }
        else if (s.equals(n4.a.class)) {
            j2.P8(f0, (n4.a)n0, map);
        }
        else if (s.equals(l4.a.class)) {
            z1.R8(f0, (l4.a)n0, map);
        }
        else if (s.equals(l4.c.class)) {
            b2.J8(f0, (l4.c)n0, map);
        }
        else if (s.equals(l4.b.class)) {
            d2.N8(f0, (l4.b)n0, map);
        }
        else if (s.equals(j4.c.class)) {
            r1.L8(f0, (j4.c)n0, map);
        }
        else if (s.equals(j4.b.class)) {
            p1.J8(f0, (j4.b)n0, map);
        }
        else if (s.equals(j4.d.class)) {
            t1.J8(f0, (j4.d)n0, map);
        }
        else if (s.equals(j4.a.class)) {
            n1.Z8(f0, (j4.a)n0, map);
        }
        else if (s.equals(i4.d.class)) {
            l1.J8(f0, (i4.d)n0, map);
        }
        else if (s.equals(k4.a.class)) {
            v1.N8(f0, (k4.a)n0, map);
        }
        else if (s.equals(k4.b.class)) {
            x1.J8(f0, (k4.b)n0, map);
        }
        else if (s.equals(i4.c.class)) {
            j1.R8(f0, (i4.c)n0, map);
        }
        else if (s.equals(a5.a.class)) {
            n5.b9(f0, (a5.a)n0, map);
        }
        else if (s.equals(p4.a.class)) {
            n2.f9(f0, (p4.a)n0, map);
        }
        else if (s.equals(p4.b.class)) {
            p2.H8(f0, (p4.b)n0, map);
        }
        else if (s.equals(z4.c.class)) {
            l5.ta(f0, (z4.c)n0, map);
        }
        else if (s.equals(z4.a.class)) {
            h5.J8(f0, (z4.a)n0, map);
        }
        else if (s.equals(z4.b.class)) {
            j5.R8(f0, (z4.b)n0, map);
        }
        else if (s.equals(b5.c.class)) {
            t5.H8(f0, (b5.c)n0, map);
        }
        else if (s.equals(b5.b.class)) {
            p5.F8(f0, (b5.b)n0, map);
        }
        else if (s.equals(b5.a.class)) {
            r5.F8(f0, (b5.a)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
            z0.D8(f0, (com.untis.mobile.persistence.realm.b)n0, map);
        }
        else if (s.equals(u4.b.class)) {
            l3.P8(f0, (u4.b)n0, map);
        }
        else if (s.equals(u4.a.class)) {
            n3.L8(f0, (u4.a)n0, map);
        }
        else if (s.equals(u4.c.class)) {
            p3.F8(f0, (u4.c)n0, map);
        }
        else if (s.equals(s4.b.class)) {
            f3.J8(f0, (s4.b)n0, map);
        }
        else if (s.equals(s4.a.class)) {
            d3.X8(f0, (s4.a)n0, map);
        }
        else if (s.equals(r4.b.class)) {
            v2.N8(f0, (r4.b)n0, map);
        }
        else if (s.equals(r4.d.class)) {
            b3.R8(f0, (r4.d)n0, map);
        }
        else if (s.equals(r4.c.class)) {
            x2.L8(f0, (r4.c)n0, map);
        }
        else if (s.equals(r4.a.class)) {
            z2.H8(f0, (r4.a)n0, map);
        }
        else if (s.equals(q4.a.class)) {
            r2.L8(f0, (q4.a)n0, map);
        }
        else if (s.equals(q4.b.class)) {
            t2.V8(f0, (q4.b)n0, map);
        }
        else if (s.equals(t4.a.class)) {
            h3.f9(f0, (t4.a)n0, map);
        }
        else if (s.equals(t4.b.class)) {
            j3.H8(f0, (t4.b)n0, map);
        }
        else if (s.equals(w4.a.class)) {
            v3.L8(f0, (w4.a)n0, map);
        }
        else if (s.equals(i.class)) {
            l4.V8(f0, (i)n0, map);
        }
        else if (s.equals(w4.e.class)) {
            d4.P8(f0, (w4.e)n0, map);
        }
        else if (s.equals(h.class)) {
            j4.P8(f0, (h)n0, map);
        }
        else if (s.equals(w4.g.class)) {
            h4.L8(f0, (w4.g)n0, map);
        }
        else if (s.equals(w4.d.class)) {
            b4.T8(f0, (w4.d)n0, map);
        }
        else if (s.equals(w4.b.class)) {
            x3.H8(f0, (w4.b)n0, map);
        }
        else if (s.equals(w4.f.class)) {
            f4.J8(f0, (w4.f)n0, map);
        }
        else if (s.equals(w4.c.class)) {
            z3.L8(f0, (w4.c)n0, map);
        }
        else if (s.equals(y4.a.class)) {
            p4.d9(f0, (y4.a)n0, map);
        }
        else if (s.equals(y4.b.class)) {
            r4.H8(f0, (y4.b)n0, map);
        }
        else if (s.equals(c5.e.class)) {
            d6.V8(f0, (c5.e)n0, map);
        }
        else if (s.equals(c5.c.class)) {
            z5.H9(f0, (c5.c)n0, map);
        }
        else if (s.equals(c5.b.class)) {
            x5.P8(f0, (c5.b)n0, map);
        }
        else if (s.equals(c5.a.class)) {
            v5.D8(f0, (c5.a)n0, map);
        }
        else if (s.equals(c5.d.class)) {
            b6.N8(f0, (c5.d)n0, map);
        }
        else if (s.equals(x4.a.class)) {
            n4.L8(f0, (x4.a)n0, map);
        }
        else {
            if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h((Class<? extends n0>)s);
            }
            b1.H8(f0, (com.untis.mobile.persistence.realm.c)n0, map);
        }
    }
    
    @Override
    public void o(final f0 f0, final Collection<? extends n0> collection) {
        final Class<j4.b> obj = j4.b.class;
        final Class<j4.c> obj2 = j4.c.class;
        final Class<l4.b> obj3 = l4.b.class;
        final Class<l4.c> obj4 = l4.c.class;
        final Class<l4.a> obj5 = l4.a.class;
        final Class<n4.a> obj6 = n4.a.class;
        final Class<i4.a> obj7 = i4.a.class;
        final Class<i4.b> obj8 = i4.b.class;
        final Iterator<? extends n0> iterator = collection.iterator();
        final Class<m4.a> obj9 = m4.a.class;
        final Class<m4.b> obj10 = m4.b.class;
        final HashMap<n0, Long> hashMap = new HashMap<n0, Long>(collection.size());
        if (iterator.hasNext()) {
            final n0 n0 = (n0)iterator.next();
            Serializable s;
            if (n0 instanceof p) {
                s = ((a)n0).getClass().getSuperclass();
            }
            else {
                s = ((a)n0).getClass();
            }
            if (s.equals(a.class)) {
                l2.H8(f0, (a)n0, hashMap);
            }
            else if (s.equals(b.class)) {
                v4.F8(f0, (b)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
                t4.H8(f0, (com.untis.mobile.persistence.realm.period.a)n0, hashMap);
            }
            else if (s.equals(c.class)) {
                x4.l9(f0, (c)n0, hashMap);
            }
            else if (s.equals(d.class)) {
                z4.F8(f0, (d)n0, hashMap);
            }
            else if (s.equals(f.class)) {
                d5.F8(f0, (f)n0, hashMap);
            }
            else if (s.equals(g.class)) {
                f5.N8(f0, (g)n0, hashMap);
            }
            else if (s.equals(e.class)) {
                b5.F8(f0, (e)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
                x0.D8(f0, (com.untis.mobile.persistence.realm.a)n0, hashMap);
            }
            else if (s.equals(v4.a.class)) {
                r3.N8(f0, (v4.a)n0, hashMap);
            }
            else if (s.equals(v4.b.class)) {
                t3.H8(f0, (v4.b)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
                d1.D8(f0, (com.untis.mobile.persistence.realm.e)n0, hashMap);
            }
            else if (s.equals(obj10)) {
                h2.P8(f0, (m4.b)n0, hashMap);
            }
            else if (s.equals(obj9)) {
                f2.e9(f0, (m4.a)n0, hashMap);
            }
            else if (s.equals(obj8)) {
                h1.X8(f0, (i4.b)n0, hashMap);
            }
            else if (s.equals(obj7)) {
                f1.V8(f0, (i4.a)n0, hashMap);
            }
            else if (s.equals(obj6)) {
                j2.P8(f0, (n4.a)n0, hashMap);
            }
            else if (s.equals(obj5)) {
                z1.R8(f0, (l4.a)n0, hashMap);
            }
            else if (s.equals(obj4)) {
                b2.J8(f0, (l4.c)n0, hashMap);
            }
            else if (s.equals(obj3)) {
                d2.N8(f0, (l4.b)n0, hashMap);
            }
            else if (s.equals(obj2)) {
                r1.L8(f0, (j4.c)n0, hashMap);
            }
            else if (s.equals(obj)) {
                p1.J8(f0, (j4.b)n0, hashMap);
            }
            else if (s.equals(j4.d.class)) {
                t1.J8(f0, (j4.d)n0, hashMap);
            }
            else if (s.equals(j4.a.class)) {
                n1.Z8(f0, (j4.a)n0, hashMap);
            }
            else if (s.equals(i4.d.class)) {
                l1.J8(f0, (i4.d)n0, hashMap);
            }
            else if (s.equals(k4.a.class)) {
                v1.N8(f0, (k4.a)n0, hashMap);
            }
            else if (s.equals(k4.b.class)) {
                x1.J8(f0, (k4.b)n0, hashMap);
            }
            else if (s.equals(i4.c.class)) {
                j1.R8(f0, (i4.c)n0, hashMap);
            }
            else if (s.equals(a5.a.class)) {
                n5.b9(f0, (a5.a)n0, hashMap);
            }
            else if (s.equals(p4.a.class)) {
                n2.f9(f0, (p4.a)n0, hashMap);
            }
            else if (s.equals(p4.b.class)) {
                p2.H8(f0, (p4.b)n0, hashMap);
            }
            else if (s.equals(z4.c.class)) {
                l5.ta(f0, (z4.c)n0, hashMap);
            }
            else if (s.equals(z4.a.class)) {
                h5.J8(f0, (z4.a)n0, hashMap);
            }
            else if (s.equals(z4.b.class)) {
                j5.R8(f0, (z4.b)n0, hashMap);
            }
            else if (s.equals(b5.c.class)) {
                t5.H8(f0, (b5.c)n0, hashMap);
            }
            else if (s.equals(b5.b.class)) {
                p5.F8(f0, (b5.b)n0, hashMap);
            }
            else if (s.equals(b5.a.class)) {
                r5.F8(f0, (b5.a)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
                z0.D8(f0, (com.untis.mobile.persistence.realm.b)n0, hashMap);
            }
            else if (s.equals(u4.b.class)) {
                l3.P8(f0, (u4.b)n0, hashMap);
            }
            else if (s.equals(u4.a.class)) {
                n3.L8(f0, (u4.a)n0, hashMap);
            }
            else if (s.equals(u4.c.class)) {
                p3.F8(f0, (u4.c)n0, hashMap);
            }
            else if (s.equals(s4.b.class)) {
                f3.J8(f0, (s4.b)n0, hashMap);
            }
            else if (s.equals(s4.a.class)) {
                d3.X8(f0, (s4.a)n0, hashMap);
            }
            else if (s.equals(r4.b.class)) {
                v2.N8(f0, (r4.b)n0, hashMap);
            }
            else if (s.equals(r4.d.class)) {
                b3.R8(f0, (r4.d)n0, hashMap);
            }
            else if (s.equals(r4.c.class)) {
                x2.L8(f0, (r4.c)n0, hashMap);
            }
            else if (s.equals(r4.a.class)) {
                z2.H8(f0, (r4.a)n0, hashMap);
            }
            else if (s.equals(q4.a.class)) {
                r2.L8(f0, (q4.a)n0, hashMap);
            }
            else if (s.equals(q4.b.class)) {
                t2.V8(f0, (q4.b)n0, hashMap);
            }
            else if (s.equals(t4.a.class)) {
                h3.f9(f0, (t4.a)n0, hashMap);
            }
            else if (s.equals(t4.b.class)) {
                j3.H8(f0, (t4.b)n0, hashMap);
            }
            else if (s.equals(w4.a.class)) {
                v3.L8(f0, (w4.a)n0, hashMap);
            }
            else if (s.equals(i.class)) {
                l4.V8(f0, (i)n0, hashMap);
            }
            else if (s.equals(w4.e.class)) {
                d4.P8(f0, (w4.e)n0, hashMap);
            }
            else if (s.equals(h.class)) {
                j4.P8(f0, (h)n0, hashMap);
            }
            else if (s.equals(w4.g.class)) {
                h4.L8(f0, (w4.g)n0, hashMap);
            }
            else if (s.equals(w4.d.class)) {
                b4.T8(f0, (w4.d)n0, hashMap);
            }
            else if (s.equals(w4.b.class)) {
                x3.H8(f0, (w4.b)n0, hashMap);
            }
            else if (s.equals(w4.f.class)) {
                f4.J8(f0, (w4.f)n0, hashMap);
            }
            else if (s.equals(w4.c.class)) {
                z3.L8(f0, (w4.c)n0, hashMap);
            }
            else if (s.equals(y4.a.class)) {
                p4.d9(f0, (y4.a)n0, hashMap);
            }
            else if (s.equals(y4.b.class)) {
                r4.H8(f0, (y4.b)n0, hashMap);
            }
            else if (s.equals(c5.e.class)) {
                d6.V8(f0, (c5.e)n0, hashMap);
            }
            else if (s.equals(c5.c.class)) {
                z5.H9(f0, (c5.c)n0, hashMap);
            }
            else if (s.equals(c5.b.class)) {
                x5.P8(f0, (c5.b)n0, hashMap);
            }
            else if (s.equals(c5.a.class)) {
                v5.D8(f0, (c5.a)n0, hashMap);
            }
            else if (s.equals(c5.d.class)) {
                b6.N8(f0, (c5.d)n0, hashMap);
            }
            else if (s.equals(x4.a.class)) {
                n4.L8(f0, (x4.a)n0, hashMap);
            }
            else {
                if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                    throw q.h((Class<? extends n0>)s);
                }
                b1.H8(f0, (com.untis.mobile.persistence.realm.c)n0, hashMap);
            }
            if (iterator.hasNext()) {
                if (s.equals(a.class)) {
                    l2.I8(f0, iterator, hashMap);
                }
                else if (s.equals(b.class)) {
                    v4.G8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
                    t4.I8(f0, iterator, hashMap);
                }
                else if (s.equals(c.class)) {
                    x4.m9(f0, iterator, hashMap);
                }
                else if (s.equals(d.class)) {
                    z4.G8(f0, iterator, hashMap);
                }
                else if (s.equals(f.class)) {
                    d5.G8(f0, iterator, hashMap);
                }
                else if (s.equals(g.class)) {
                    f5.O8(f0, iterator, hashMap);
                }
                else if (s.equals(e.class)) {
                    b5.G8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
                    x0.E8(f0, iterator, hashMap);
                }
                else if (s.equals(v4.a.class)) {
                    r3.O8(f0, iterator, hashMap);
                }
                else if (s.equals(v4.b.class)) {
                    t3.I8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
                    d1.E8(f0, iterator, hashMap);
                }
                else if (s.equals(m4.b.class)) {
                    h2.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(m4.a.class)) {
                    f2.f9(f0, iterator, hashMap);
                }
                else if (s.equals(i4.b.class)) {
                    h1.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(i4.a.class)) {
                    f1.W8(f0, iterator, hashMap);
                }
                else if (s.equals(n4.a.class)) {
                    j2.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.a.class)) {
                    z1.S8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.c.class)) {
                    b2.K8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.b.class)) {
                    d2.O8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.c.class)) {
                    r1.M8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.b.class)) {
                    p1.K8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.d.class)) {
                    t1.K8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.a.class)) {
                    n1.a9(f0, iterator, hashMap);
                }
                else if (s.equals(i4.d.class)) {
                    l1.K8(f0, iterator, hashMap);
                }
                else if (s.equals(k4.a.class)) {
                    v1.O8(f0, iterator, hashMap);
                }
                else if (s.equals(k4.b.class)) {
                    x1.K8(f0, iterator, hashMap);
                }
                else if (s.equals(i4.c.class)) {
                    j1.S8(f0, iterator, hashMap);
                }
                else if (s.equals(a5.a.class)) {
                    n5.c9(f0, iterator, hashMap);
                }
                else if (s.equals(p4.a.class)) {
                    n2.g9(f0, iterator, hashMap);
                }
                else if (s.equals(p4.b.class)) {
                    p2.I8(f0, iterator, hashMap);
                }
                else if (s.equals(z4.c.class)) {
                    l5.ua(f0, iterator, hashMap);
                }
                else if (s.equals(z4.a.class)) {
                    h5.K8(f0, iterator, hashMap);
                }
                else if (s.equals(z4.b.class)) {
                    j5.S8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.c.class)) {
                    t5.I8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.b.class)) {
                    p5.G8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.a.class)) {
                    r5.G8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
                    z0.E8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.b.class)) {
                    l3.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.a.class)) {
                    n3.M8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.c.class)) {
                    p3.G8(f0, iterator, hashMap);
                }
                else if (s.equals(s4.b.class)) {
                    f3.K8(f0, iterator, hashMap);
                }
                else if (s.equals(s4.a.class)) {
                    d3.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.b.class)) {
                    v2.O8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.d.class)) {
                    b3.S8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.c.class)) {
                    x2.M8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.a.class)) {
                    z2.I8(f0, iterator, hashMap);
                }
                else if (s.equals(q4.a.class)) {
                    r2.M8(f0, iterator, hashMap);
                }
                else if (s.equals(q4.b.class)) {
                    t2.W8(f0, iterator, hashMap);
                }
                else if (s.equals(t4.a.class)) {
                    h3.g9(f0, iterator, hashMap);
                }
                else if (s.equals(t4.b.class)) {
                    j3.I8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.a.class)) {
                    v3.M8(f0, iterator, hashMap);
                }
                else if (s.equals(i.class)) {
                    l4.W8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.e.class)) {
                    d4.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(h.class)) {
                    j4.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.g.class)) {
                    h4.M8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.d.class)) {
                    b4.U8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.b.class)) {
                    x3.I8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.f.class)) {
                    f4.K8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.c.class)) {
                    z3.M8(f0, iterator, hashMap);
                }
                else if (s.equals(y4.a.class)) {
                    p4.e9(f0, iterator, hashMap);
                }
                else if (s.equals(y4.b.class)) {
                    r4.I8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.e.class)) {
                    d6.W8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.c.class)) {
                    z5.I9(f0, iterator, hashMap);
                }
                else if (s.equals(c5.b.class)) {
                    x5.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.a.class)) {
                    v5.E8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.d.class)) {
                    b6.O8(f0, iterator, hashMap);
                }
                else if (s.equals(x4.a.class)) {
                    n4.M8(f0, iterator, hashMap);
                }
                else {
                    if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                        throw q.h((Class<? extends n0>)s);
                    }
                    b1.I8(f0, iterator, hashMap);
                }
            }
        }
    }
    
    @Override
    public void p(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        Serializable s;
        if (n0 instanceof p) {
            s = n0.getClass().getSuperclass();
        }
        else {
            s = n0.getClass();
        }
        if (s.equals(a.class)) {
            l2.J8(f0, (a)n0, map);
        }
        else if (s.equals(b.class)) {
            v4.H8(f0, (b)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            t4.J8(f0, (com.untis.mobile.persistence.realm.period.a)n0, map);
        }
        else if (s.equals(c.class)) {
            x4.n9(f0, (c)n0, map);
        }
        else if (s.equals(d.class)) {
            z4.H8(f0, (d)n0, map);
        }
        else if (s.equals(f.class)) {
            d5.H8(f0, (f)n0, map);
        }
        else if (s.equals(g.class)) {
            f5.P8(f0, (g)n0, map);
        }
        else if (s.equals(e.class)) {
            b5.H8(f0, (e)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
            x0.F8(f0, (com.untis.mobile.persistence.realm.a)n0, map);
        }
        else if (s.equals(v4.a.class)) {
            r3.P8(f0, (v4.a)n0, map);
        }
        else if (s.equals(v4.b.class)) {
            t3.J8(f0, (v4.b)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
            d1.F8(f0, (com.untis.mobile.persistence.realm.e)n0, map);
        }
        else if (s.equals(m4.b.class)) {
            h2.R8(f0, (m4.b)n0, map);
        }
        else if (s.equals(m4.a.class)) {
            f2.g9(f0, (m4.a)n0, map);
        }
        else if (s.equals(i4.b.class)) {
            h1.Z8(f0, (i4.b)n0, map);
        }
        else if (s.equals(i4.a.class)) {
            f1.X8(f0, (i4.a)n0, map);
        }
        else if (s.equals(n4.a.class)) {
            j2.R8(f0, (n4.a)n0, map);
        }
        else if (s.equals(l4.a.class)) {
            z1.T8(f0, (l4.a)n0, map);
        }
        else if (s.equals(l4.c.class)) {
            b2.L8(f0, (l4.c)n0, map);
        }
        else if (s.equals(l4.b.class)) {
            d2.P8(f0, (l4.b)n0, map);
        }
        else if (s.equals(j4.c.class)) {
            r1.N8(f0, (j4.c)n0, map);
        }
        else if (s.equals(j4.b.class)) {
            p1.L8(f0, (j4.b)n0, map);
        }
        else if (s.equals(j4.d.class)) {
            t1.L8(f0, (j4.d)n0, map);
        }
        else if (s.equals(j4.a.class)) {
            n1.b9(f0, (j4.a)n0, map);
        }
        else if (s.equals(i4.d.class)) {
            l1.L8(f0, (i4.d)n0, map);
        }
        else if (s.equals(k4.a.class)) {
            v1.P8(f0, (k4.a)n0, map);
        }
        else if (s.equals(k4.b.class)) {
            x1.L8(f0, (k4.b)n0, map);
        }
        else if (s.equals(i4.c.class)) {
            j1.T8(f0, (i4.c)n0, map);
        }
        else if (s.equals(a5.a.class)) {
            n5.d9(f0, (a5.a)n0, map);
        }
        else if (s.equals(p4.a.class)) {
            n2.h9(f0, (p4.a)n0, map);
        }
        else if (s.equals(p4.b.class)) {
            p2.J8(f0, (p4.b)n0, map);
        }
        else if (s.equals(z4.c.class)) {
            l5.va(f0, (z4.c)n0, map);
        }
        else if (s.equals(z4.a.class)) {
            h5.L8(f0, (z4.a)n0, map);
        }
        else if (s.equals(z4.b.class)) {
            j5.T8(f0, (z4.b)n0, map);
        }
        else if (s.equals(b5.c.class)) {
            t5.J8(f0, (b5.c)n0, map);
        }
        else if (s.equals(b5.b.class)) {
            p5.H8(f0, (b5.b)n0, map);
        }
        else if (s.equals(b5.a.class)) {
            r5.H8(f0, (b5.a)n0, map);
        }
        else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
            z0.F8(f0, (com.untis.mobile.persistence.realm.b)n0, map);
        }
        else if (s.equals(u4.b.class)) {
            l3.R8(f0, (u4.b)n0, map);
        }
        else if (s.equals(u4.a.class)) {
            n3.N8(f0, (u4.a)n0, map);
        }
        else if (s.equals(u4.c.class)) {
            p3.H8(f0, (u4.c)n0, map);
        }
        else if (s.equals(s4.b.class)) {
            f3.L8(f0, (s4.b)n0, map);
        }
        else if (s.equals(s4.a.class)) {
            d3.Z8(f0, (s4.a)n0, map);
        }
        else if (s.equals(r4.b.class)) {
            v2.P8(f0, (r4.b)n0, map);
        }
        else if (s.equals(r4.d.class)) {
            b3.T8(f0, (r4.d)n0, map);
        }
        else if (s.equals(r4.c.class)) {
            x2.N8(f0, (r4.c)n0, map);
        }
        else if (s.equals(r4.a.class)) {
            z2.J8(f0, (r4.a)n0, map);
        }
        else if (s.equals(q4.a.class)) {
            r2.N8(f0, (q4.a)n0, map);
        }
        else if (s.equals(q4.b.class)) {
            t2.X8(f0, (q4.b)n0, map);
        }
        else if (s.equals(t4.a.class)) {
            h3.h9(f0, (t4.a)n0, map);
        }
        else if (s.equals(t4.b.class)) {
            j3.J8(f0, (t4.b)n0, map);
        }
        else if (s.equals(w4.a.class)) {
            v3.N8(f0, (w4.a)n0, map);
        }
        else if (s.equals(i.class)) {
            l4.X8(f0, (i)n0, map);
        }
        else if (s.equals(w4.e.class)) {
            d4.R8(f0, (w4.e)n0, map);
        }
        else if (s.equals(h.class)) {
            j4.R8(f0, (h)n0, map);
        }
        else if (s.equals(w4.g.class)) {
            h4.N8(f0, (w4.g)n0, map);
        }
        else if (s.equals(w4.d.class)) {
            b4.V8(f0, (w4.d)n0, map);
        }
        else if (s.equals(w4.b.class)) {
            x3.J8(f0, (w4.b)n0, map);
        }
        else if (s.equals(w4.f.class)) {
            f4.L8(f0, (w4.f)n0, map);
        }
        else if (s.equals(w4.c.class)) {
            z3.N8(f0, (w4.c)n0, map);
        }
        else if (s.equals(y4.a.class)) {
            p4.f9(f0, (y4.a)n0, map);
        }
        else if (s.equals(y4.b.class)) {
            r4.J8(f0, (y4.b)n0, map);
        }
        else if (s.equals(c5.e.class)) {
            d6.X8(f0, (c5.e)n0, map);
        }
        else if (s.equals(c5.c.class)) {
            z5.J9(f0, (c5.c)n0, map);
        }
        else if (s.equals(c5.b.class)) {
            x5.R8(f0, (c5.b)n0, map);
        }
        else if (s.equals(c5.a.class)) {
            v5.F8(f0, (c5.a)n0, map);
        }
        else if (s.equals(c5.d.class)) {
            b6.P8(f0, (c5.d)n0, map);
        }
        else if (s.equals(x4.a.class)) {
            n4.N8(f0, (x4.a)n0, map);
        }
        else {
            if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                throw q.h((Class<? extends n0>)s);
            }
            b1.J8(f0, (com.untis.mobile.persistence.realm.c)n0, map);
        }
    }
    
    @Override
    public void q(final f0 f0, final Collection<? extends n0> collection) {
        final Class<j4.b> obj = j4.b.class;
        final Class<j4.c> obj2 = j4.c.class;
        final Class<l4.b> obj3 = l4.b.class;
        final Class<l4.c> obj4 = l4.c.class;
        final Class<l4.a> obj5 = l4.a.class;
        final Class<n4.a> obj6 = n4.a.class;
        final Class<i4.a> obj7 = i4.a.class;
        final Class<i4.b> obj8 = i4.b.class;
        final Iterator<? extends n0> iterator = collection.iterator();
        final Class<m4.a> obj9 = m4.a.class;
        final Class<m4.b> obj10 = m4.b.class;
        final HashMap<n0, Long> hashMap = new HashMap<n0, Long>(collection.size());
        if (iterator.hasNext()) {
            final n0 n0 = (n0)iterator.next();
            Serializable s;
            if (n0 instanceof p) {
                s = ((a)n0).getClass().getSuperclass();
            }
            else {
                s = ((a)n0).getClass();
            }
            if (s.equals(a.class)) {
                l2.J8(f0, (a)n0, hashMap);
            }
            else if (s.equals(b.class)) {
                v4.H8(f0, (b)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
                t4.J8(f0, (com.untis.mobile.persistence.realm.period.a)n0, hashMap);
            }
            else if (s.equals(c.class)) {
                x4.n9(f0, (c)n0, hashMap);
            }
            else if (s.equals(d.class)) {
                z4.H8(f0, (d)n0, hashMap);
            }
            else if (s.equals(f.class)) {
                d5.H8(f0, (f)n0, hashMap);
            }
            else if (s.equals(g.class)) {
                f5.P8(f0, (g)n0, hashMap);
            }
            else if (s.equals(e.class)) {
                b5.H8(f0, (e)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
                x0.F8(f0, (com.untis.mobile.persistence.realm.a)n0, hashMap);
            }
            else if (s.equals(v4.a.class)) {
                r3.P8(f0, (v4.a)n0, hashMap);
            }
            else if (s.equals(v4.b.class)) {
                t3.J8(f0, (v4.b)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
                d1.F8(f0, (com.untis.mobile.persistence.realm.e)n0, hashMap);
            }
            else if (s.equals(obj10)) {
                h2.R8(f0, (m4.b)n0, hashMap);
            }
            else if (s.equals(obj9)) {
                f2.g9(f0, (m4.a)n0, hashMap);
            }
            else if (s.equals(obj8)) {
                h1.Z8(f0, (i4.b)n0, hashMap);
            }
            else if (s.equals(obj7)) {
                f1.X8(f0, (i4.a)n0, hashMap);
            }
            else if (s.equals(obj6)) {
                j2.R8(f0, (n4.a)n0, hashMap);
            }
            else if (s.equals(obj5)) {
                z1.T8(f0, (l4.a)n0, hashMap);
            }
            else if (s.equals(obj4)) {
                b2.L8(f0, (l4.c)n0, hashMap);
            }
            else if (s.equals(obj3)) {
                d2.P8(f0, (l4.b)n0, hashMap);
            }
            else if (s.equals(obj2)) {
                r1.N8(f0, (j4.c)n0, hashMap);
            }
            else if (s.equals(obj)) {
                p1.L8(f0, (j4.b)n0, hashMap);
            }
            else if (s.equals(j4.d.class)) {
                t1.L8(f0, (j4.d)n0, hashMap);
            }
            else if (s.equals(j4.a.class)) {
                n1.b9(f0, (j4.a)n0, hashMap);
            }
            else if (s.equals(i4.d.class)) {
                l1.L8(f0, (i4.d)n0, hashMap);
            }
            else if (s.equals(k4.a.class)) {
                v1.P8(f0, (k4.a)n0, hashMap);
            }
            else if (s.equals(k4.b.class)) {
                x1.L8(f0, (k4.b)n0, hashMap);
            }
            else if (s.equals(i4.c.class)) {
                j1.T8(f0, (i4.c)n0, hashMap);
            }
            else if (s.equals(a5.a.class)) {
                n5.d9(f0, (a5.a)n0, hashMap);
            }
            else if (s.equals(p4.a.class)) {
                n2.h9(f0, (p4.a)n0, hashMap);
            }
            else if (s.equals(p4.b.class)) {
                p2.J8(f0, (p4.b)n0, hashMap);
            }
            else if (s.equals(z4.c.class)) {
                l5.va(f0, (z4.c)n0, hashMap);
            }
            else if (s.equals(z4.a.class)) {
                h5.L8(f0, (z4.a)n0, hashMap);
            }
            else if (s.equals(z4.b.class)) {
                j5.T8(f0, (z4.b)n0, hashMap);
            }
            else if (s.equals(b5.c.class)) {
                t5.J8(f0, (b5.c)n0, hashMap);
            }
            else if (s.equals(b5.b.class)) {
                p5.H8(f0, (b5.b)n0, hashMap);
            }
            else if (s.equals(b5.a.class)) {
                r5.H8(f0, (b5.a)n0, hashMap);
            }
            else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
                z0.F8(f0, (com.untis.mobile.persistence.realm.b)n0, hashMap);
            }
            else if (s.equals(u4.b.class)) {
                l3.R8(f0, (u4.b)n0, hashMap);
            }
            else if (s.equals(u4.a.class)) {
                n3.N8(f0, (u4.a)n0, hashMap);
            }
            else if (s.equals(u4.c.class)) {
                p3.H8(f0, (u4.c)n0, hashMap);
            }
            else if (s.equals(s4.b.class)) {
                f3.L8(f0, (s4.b)n0, hashMap);
            }
            else if (s.equals(s4.a.class)) {
                d3.Z8(f0, (s4.a)n0, hashMap);
            }
            else if (s.equals(r4.b.class)) {
                v2.P8(f0, (r4.b)n0, hashMap);
            }
            else if (s.equals(r4.d.class)) {
                b3.T8(f0, (r4.d)n0, hashMap);
            }
            else if (s.equals(r4.c.class)) {
                x2.N8(f0, (r4.c)n0, hashMap);
            }
            else if (s.equals(r4.a.class)) {
                z2.J8(f0, (r4.a)n0, hashMap);
            }
            else if (s.equals(q4.a.class)) {
                r2.N8(f0, (q4.a)n0, hashMap);
            }
            else if (s.equals(q4.b.class)) {
                t2.X8(f0, (q4.b)n0, hashMap);
            }
            else if (s.equals(t4.a.class)) {
                h3.h9(f0, (t4.a)n0, hashMap);
            }
            else if (s.equals(t4.b.class)) {
                j3.J8(f0, (t4.b)n0, hashMap);
            }
            else if (s.equals(w4.a.class)) {
                v3.N8(f0, (w4.a)n0, hashMap);
            }
            else if (s.equals(i.class)) {
                l4.X8(f0, (i)n0, hashMap);
            }
            else if (s.equals(w4.e.class)) {
                d4.R8(f0, (w4.e)n0, hashMap);
            }
            else if (s.equals(h.class)) {
                j4.R8(f0, (h)n0, hashMap);
            }
            else if (s.equals(w4.g.class)) {
                h4.N8(f0, (w4.g)n0, hashMap);
            }
            else if (s.equals(w4.d.class)) {
                b4.V8(f0, (w4.d)n0, hashMap);
            }
            else if (s.equals(w4.b.class)) {
                x3.J8(f0, (w4.b)n0, hashMap);
            }
            else if (s.equals(w4.f.class)) {
                f4.L8(f0, (w4.f)n0, hashMap);
            }
            else if (s.equals(w4.c.class)) {
                z3.N8(f0, (w4.c)n0, hashMap);
            }
            else if (s.equals(y4.a.class)) {
                p4.f9(f0, (y4.a)n0, hashMap);
            }
            else if (s.equals(y4.b.class)) {
                r4.J8(f0, (y4.b)n0, hashMap);
            }
            else if (s.equals(c5.e.class)) {
                d6.X8(f0, (c5.e)n0, hashMap);
            }
            else if (s.equals(c5.c.class)) {
                z5.J9(f0, (c5.c)n0, hashMap);
            }
            else if (s.equals(c5.b.class)) {
                x5.R8(f0, (c5.b)n0, hashMap);
            }
            else if (s.equals(c5.a.class)) {
                v5.F8(f0, (c5.a)n0, hashMap);
            }
            else if (s.equals(c5.d.class)) {
                b6.P8(f0, (c5.d)n0, hashMap);
            }
            else if (s.equals(x4.a.class)) {
                n4.N8(f0, (x4.a)n0, hashMap);
            }
            else {
                if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                    throw q.h((Class<? extends n0>)s);
                }
                b1.J8(f0, (com.untis.mobile.persistence.realm.c)n0, hashMap);
            }
            if (iterator.hasNext()) {
                if (s.equals(a.class)) {
                    l2.K8(f0, iterator, hashMap);
                }
                else if (s.equals(b.class)) {
                    v4.I8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.period.a.class)) {
                    t4.K8(f0, iterator, hashMap);
                }
                else if (s.equals(c.class)) {
                    x4.o9(f0, iterator, hashMap);
                }
                else if (s.equals(d.class)) {
                    z4.I8(f0, iterator, hashMap);
                }
                else if (s.equals(f.class)) {
                    d5.I8(f0, iterator, hashMap);
                }
                else if (s.equals(g.class)) {
                    f5.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(e.class)) {
                    b5.I8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.a.class)) {
                    x0.G8(f0, iterator, hashMap);
                }
                else if (s.equals(v4.a.class)) {
                    r3.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(v4.b.class)) {
                    t3.K8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.e.class)) {
                    d1.G8(f0, iterator, hashMap);
                }
                else if (s.equals(m4.b.class)) {
                    h2.S8(f0, iterator, hashMap);
                }
                else if (s.equals(m4.a.class)) {
                    f2.h9(f0, iterator, hashMap);
                }
                else if (s.equals(i4.b.class)) {
                    h1.a9(f0, iterator, hashMap);
                }
                else if (s.equals(i4.a.class)) {
                    f1.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(n4.a.class)) {
                    j2.S8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.a.class)) {
                    z1.U8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.c.class)) {
                    b2.M8(f0, iterator, hashMap);
                }
                else if (s.equals(l4.b.class)) {
                    d2.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.c.class)) {
                    r1.O8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.b.class)) {
                    p1.M8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.d.class)) {
                    t1.M8(f0, iterator, hashMap);
                }
                else if (s.equals(j4.a.class)) {
                    n1.c9(f0, iterator, hashMap);
                }
                else if (s.equals(i4.d.class)) {
                    l1.M8(f0, iterator, hashMap);
                }
                else if (s.equals(k4.a.class)) {
                    v1.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(k4.b.class)) {
                    x1.M8(f0, iterator, hashMap);
                }
                else if (s.equals(i4.c.class)) {
                    j1.U8(f0, iterator, hashMap);
                }
                else if (s.equals(a5.a.class)) {
                    n5.e9(f0, iterator, hashMap);
                }
                else if (s.equals(p4.a.class)) {
                    n2.i9(f0, iterator, hashMap);
                }
                else if (s.equals(p4.b.class)) {
                    p2.K8(f0, iterator, hashMap);
                }
                else if (s.equals(z4.c.class)) {
                    l5.wa(f0, iterator, hashMap);
                }
                else if (s.equals(z4.a.class)) {
                    h5.M8(f0, iterator, hashMap);
                }
                else if (s.equals(z4.b.class)) {
                    j5.U8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.c.class)) {
                    t5.K8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.b.class)) {
                    p5.I8(f0, iterator, hashMap);
                }
                else if (s.equals(b5.a.class)) {
                    r5.I8(f0, iterator, hashMap);
                }
                else if (s.equals(com.untis.mobile.persistence.realm.b.class)) {
                    z0.G8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.b.class)) {
                    l3.S8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.a.class)) {
                    n3.O8(f0, iterator, hashMap);
                }
                else if (s.equals(u4.c.class)) {
                    p3.I8(f0, iterator, hashMap);
                }
                else if (s.equals(s4.b.class)) {
                    f3.M8(f0, iterator, hashMap);
                }
                else if (s.equals(s4.a.class)) {
                    d3.a9(f0, iterator, hashMap);
                }
                else if (s.equals(r4.b.class)) {
                    v2.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.d.class)) {
                    b3.U8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.c.class)) {
                    x2.O8(f0, iterator, hashMap);
                }
                else if (s.equals(r4.a.class)) {
                    z2.K8(f0, iterator, hashMap);
                }
                else if (s.equals(q4.a.class)) {
                    r2.O8(f0, iterator, hashMap);
                }
                else if (s.equals(q4.b.class)) {
                    t2.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(t4.a.class)) {
                    h3.i9(f0, iterator, hashMap);
                }
                else if (s.equals(t4.b.class)) {
                    j3.K8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.a.class)) {
                    v3.O8(f0, iterator, hashMap);
                }
                else if (s.equals(i.class)) {
                    l4.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.e.class)) {
                    d4.S8(f0, iterator, hashMap);
                }
                else if (s.equals(h.class)) {
                    j4.S8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.g.class)) {
                    h4.O8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.d.class)) {
                    b4.W8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.b.class)) {
                    x3.K8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.f.class)) {
                    f4.M8(f0, iterator, hashMap);
                }
                else if (s.equals(w4.c.class)) {
                    z3.O8(f0, iterator, hashMap);
                }
                else if (s.equals(y4.a.class)) {
                    p4.g9(f0, iterator, hashMap);
                }
                else if (s.equals(y4.b.class)) {
                    r4.K8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.e.class)) {
                    d6.Y8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.c.class)) {
                    z5.K9(f0, iterator, hashMap);
                }
                else if (s.equals(c5.b.class)) {
                    x5.S8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.a.class)) {
                    v5.G8(f0, iterator, hashMap);
                }
                else if (s.equals(c5.d.class)) {
                    b6.Q8(f0, iterator, hashMap);
                }
                else if (s.equals(x4.a.class)) {
                    n4.O8(f0, iterator, hashMap);
                }
                else {
                    if (!s.equals(com.untis.mobile.persistence.realm.c.class)) {
                        throw q.h((Class<? extends n0>)s);
                    }
                    b1.K8(f0, iterator, hashMap);
                }
            }
        }
    }
    
    @Override
    public <E extends n0> boolean r(final Class<E> clazz) {
        if (clazz.equals(a.class)) {
            return false;
        }
        if (clazz.equals(b.class)) {
            return false;
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            return false;
        }
        if (clazz.equals(c.class)) {
            return false;
        }
        if (clazz.equals(d.class)) {
            return false;
        }
        if (clazz.equals(f.class)) {
            return false;
        }
        if (clazz.equals(g.class)) {
            return false;
        }
        if (clazz.equals(e.class)) {
            return false;
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
            return false;
        }
        if (clazz.equals(v4.a.class)) {
            return false;
        }
        if (clazz.equals(v4.b.class)) {
            return false;
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
            return false;
        }
        if (clazz.equals(m4.b.class)) {
            return false;
        }
        if (clazz.equals(m4.a.class)) {
            return false;
        }
        if (clazz.equals(i4.b.class)) {
            return false;
        }
        if (clazz.equals(i4.a.class)) {
            return false;
        }
        if (clazz.equals(n4.a.class)) {
            return false;
        }
        if (clazz.equals(l4.a.class)) {
            return false;
        }
        if (clazz.equals(l4.c.class)) {
            return false;
        }
        if (clazz.equals(l4.b.class)) {
            return false;
        }
        if (clazz.equals(j4.c.class)) {
            return false;
        }
        if (clazz.equals(j4.b.class)) {
            return false;
        }
        if (clazz.equals(j4.d.class)) {
            return false;
        }
        if (clazz.equals(j4.a.class)) {
            return false;
        }
        if (clazz.equals(i4.d.class)) {
            return false;
        }
        if (clazz.equals(k4.a.class)) {
            return false;
        }
        if (clazz.equals(k4.b.class)) {
            return false;
        }
        if (clazz.equals(i4.c.class)) {
            return false;
        }
        if (clazz.equals(a5.a.class)) {
            return false;
        }
        if (clazz.equals(p4.a.class)) {
            return false;
        }
        if (clazz.equals(p4.b.class)) {
            return false;
        }
        if (clazz.equals(z4.c.class)) {
            return false;
        }
        if (clazz.equals(z4.a.class)) {
            return false;
        }
        if (clazz.equals(z4.b.class)) {
            return false;
        }
        if (clazz.equals(b5.c.class)) {
            return false;
        }
        if (clazz.equals(b5.b.class)) {
            return false;
        }
        if (clazz.equals(b5.a.class)) {
            return false;
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
            return false;
        }
        if (clazz.equals(u4.b.class)) {
            return false;
        }
        if (clazz.equals(u4.a.class)) {
            return false;
        }
        if (clazz.equals(u4.c.class)) {
            return false;
        }
        if (clazz.equals(s4.b.class)) {
            return false;
        }
        if (clazz.equals(s4.a.class)) {
            return false;
        }
        if (clazz.equals(r4.b.class)) {
            return false;
        }
        if (clazz.equals(r4.d.class)) {
            return false;
        }
        if (clazz.equals(r4.c.class)) {
            return false;
        }
        if (clazz.equals(r4.a.class)) {
            return false;
        }
        if (clazz.equals(q4.a.class)) {
            return false;
        }
        if (clazz.equals(q4.b.class)) {
            return false;
        }
        if (clazz.equals(t4.a.class)) {
            return false;
        }
        if (clazz.equals(t4.b.class)) {
            return false;
        }
        if (clazz.equals(w4.a.class)) {
            return false;
        }
        if (clazz.equals(i.class)) {
            return false;
        }
        if (clazz.equals(w4.e.class)) {
            return false;
        }
        if (clazz.equals(h.class)) {
            return false;
        }
        if (clazz.equals(w4.g.class)) {
            return false;
        }
        if (clazz.equals(w4.d.class)) {
            return false;
        }
        if (clazz.equals(w4.b.class)) {
            return false;
        }
        if (clazz.equals(w4.f.class)) {
            return false;
        }
        if (clazz.equals(w4.c.class)) {
            return false;
        }
        if (clazz.equals(y4.a.class)) {
            return false;
        }
        if (clazz.equals(y4.b.class)) {
            return false;
        }
        if (clazz.equals(c5.e.class)) {
            return false;
        }
        if (clazz.equals(c5.c.class)) {
            return false;
        }
        if (clazz.equals(c5.b.class)) {
            return false;
        }
        if (clazz.equals(c5.a.class)) {
            return false;
        }
        if (clazz.equals(c5.d.class)) {
            return false;
        }
        if (clazz.equals(x4.a.class)) {
            return false;
        }
        if (clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
            return false;
        }
        throw q.h(clazz);
    }
    
    @Override
    public <E extends n0> E s(final Class<E> clazz, Object obj, final r r, final io.realm.internal.c c, final boolean b, final List<String> list) {
        final io.realm.a.h h = io.realm.a.W.get();
        try {
            h.g((io.realm.a)obj, r, c, b, list);
            q.a(clazz);
            if (clazz.equals(a.class)) {
                obj = new l2();
                return clazz.cast(obj);
            }
            if (clazz.equals(b.class)) {
                obj = new v4();
                return clazz.cast(obj);
            }
            if (clazz.equals(com.untis.mobile.persistence.realm.period.a.class)) {
                obj = new t4();
                return clazz.cast(obj);
            }
            if (clazz.equals(c.class)) {
                obj = new x4();
                return clazz.cast(obj);
            }
            if (clazz.equals(d.class)) {
                obj = new z4();
                return clazz.cast(obj);
            }
            if (clazz.equals(f.class)) {
                obj = new d5();
                return clazz.cast(obj);
            }
            if (clazz.equals(g.class)) {
                obj = new f5();
                return clazz.cast(obj);
            }
            if (clazz.equals(e.class)) {
                obj = new b5();
                return clazz.cast(obj);
            }
            if (clazz.equals(com.untis.mobile.persistence.realm.a.class)) {
                obj = new x0();
                return clazz.cast(obj);
            }
            if (clazz.equals(v4.a.class)) {
                obj = new r3();
                return clazz.cast(obj);
            }
            if (clazz.equals(v4.b.class)) {
                obj = new t3();
                return clazz.cast(obj);
            }
            if (clazz.equals(com.untis.mobile.persistence.realm.e.class)) {
                obj = new d1();
                return clazz.cast(obj);
            }
            if (clazz.equals(m4.b.class)) {
                obj = new h2();
                return clazz.cast(obj);
            }
            if (clazz.equals(m4.a.class)) {
                obj = new f2();
                return clazz.cast(obj);
            }
            if (clazz.equals(i4.b.class)) {
                obj = new h1();
                return clazz.cast(obj);
            }
            if (clazz.equals(i4.a.class)) {
                obj = new f1();
                return clazz.cast(obj);
            }
            if (clazz.equals(n4.a.class)) {
                obj = new j2();
                return clazz.cast(obj);
            }
            if (clazz.equals(l4.a.class)) {
                obj = new z1();
                return clazz.cast(obj);
            }
            if (clazz.equals(l4.c.class)) {
                obj = new b2();
                return clazz.cast(obj);
            }
            if (clazz.equals(l4.b.class)) {
                obj = new d2();
                return clazz.cast(obj);
            }
            if (clazz.equals(j4.c.class)) {
                obj = new r1();
                return clazz.cast(obj);
            }
            if (clazz.equals(j4.b.class)) {
                obj = new p1();
                return clazz.cast(obj);
            }
            if (clazz.equals(j4.d.class)) {
                obj = new t1();
                return clazz.cast(obj);
            }
            if (clazz.equals(j4.a.class)) {
                obj = new n1();
                return clazz.cast(obj);
            }
            if (clazz.equals(i4.d.class)) {
                obj = new l1();
                return clazz.cast(obj);
            }
            if (clazz.equals(k4.a.class)) {
                obj = new v1();
                return clazz.cast(obj);
            }
            if (clazz.equals(k4.b.class)) {
                obj = new x1();
                return clazz.cast(obj);
            }
            if (clazz.equals(i4.c.class)) {
                obj = new j1();
                return clazz.cast(obj);
            }
            if (clazz.equals(a5.a.class)) {
                obj = new n5();
                return clazz.cast(obj);
            }
            if (clazz.equals(p4.a.class)) {
                obj = new n2();
                return clazz.cast(obj);
            }
            if (clazz.equals(p4.b.class)) {
                obj = new p2();
                return clazz.cast(obj);
            }
            if (clazz.equals(z4.c.class)) {
                obj = new l5();
                return clazz.cast(obj);
            }
            if (clazz.equals(z4.a.class)) {
                obj = new h5();
                return clazz.cast(obj);
            }
            if (clazz.equals(z4.b.class)) {
                obj = new j5();
                return clazz.cast(obj);
            }
            if (clazz.equals(b5.c.class)) {
                obj = new t5();
                return clazz.cast(obj);
            }
            if (clazz.equals(b5.b.class)) {
                obj = new p5();
                return clazz.cast(obj);
            }
            if (clazz.equals(b5.a.class)) {
                obj = new r5();
                return clazz.cast(obj);
            }
            if (clazz.equals(com.untis.mobile.persistence.realm.b.class)) {
                obj = new z0();
                return clazz.cast(obj);
            }
            if (clazz.equals(u4.b.class)) {
                obj = new l3();
                return clazz.cast(obj);
            }
            if (clazz.equals(u4.a.class)) {
                obj = new n3();
                return clazz.cast(obj);
            }
            if (clazz.equals(u4.c.class)) {
                obj = new p3();
                return clazz.cast(obj);
            }
            if (clazz.equals(s4.b.class)) {
                obj = new f3();
                return clazz.cast(obj);
            }
            if (clazz.equals(s4.a.class)) {
                obj = new d3();
                return clazz.cast(obj);
            }
            if (clazz.equals(r4.b.class)) {
                obj = new v2();
                return clazz.cast(obj);
            }
            if (clazz.equals(r4.d.class)) {
                obj = new b3();
                return clazz.cast(obj);
            }
            if (clazz.equals(r4.c.class)) {
                obj = new x2();
                return clazz.cast(obj);
            }
            if (clazz.equals(r4.a.class)) {
                obj = new z2();
                return clazz.cast(obj);
            }
            if (clazz.equals(q4.a.class)) {
                obj = new r2();
                return clazz.cast(obj);
            }
            if (clazz.equals(q4.b.class)) {
                obj = new t2();
                return clazz.cast(obj);
            }
            if (clazz.equals(t4.a.class)) {
                obj = new h3();
                return clazz.cast(obj);
            }
            if (clazz.equals(t4.b.class)) {
                obj = new j3();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.a.class)) {
                obj = new v3();
                return clazz.cast(obj);
            }
            if (clazz.equals(i.class)) {
                obj = new l4();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.e.class)) {
                obj = new d4();
                return clazz.cast(obj);
            }
            if (clazz.equals(h.class)) {
                obj = new j4();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.g.class)) {
                obj = new h4();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.d.class)) {
                obj = new b4();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.b.class)) {
                obj = new x3();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.f.class)) {
                obj = new f4();
                return clazz.cast(obj);
            }
            if (clazz.equals(w4.c.class)) {
                obj = new z3();
                return clazz.cast(obj);
            }
            if (clazz.equals(y4.a.class)) {
                obj = new p4();
                return clazz.cast(obj);
            }
            if (clazz.equals(y4.b.class)) {
                obj = new r4();
                return clazz.cast(obj);
            }
            if (clazz.equals(c5.e.class)) {
                obj = new d6();
                return clazz.cast(obj);
            }
            if (clazz.equals(c5.c.class)) {
                obj = new z5();
                return clazz.cast(obj);
            }
            if (clazz.equals(c5.b.class)) {
                obj = new x5();
                return clazz.cast(obj);
            }
            if (clazz.equals(c5.a.class)) {
                obj = new v5();
                return clazz.cast(obj);
            }
            if (clazz.equals(c5.d.class)) {
                obj = new b6();
                return clazz.cast(obj);
            }
            if (clazz.equals(x4.a.class)) {
                obj = new n4();
                return clazz.cast(obj);
            }
            if (clazz.equals(com.untis.mobile.persistence.realm.c.class)) {
                obj = new b1();
                return clazz.cast(obj);
            }
            throw q.h(clazz);
        }
        finally {
            h.a();
        }
    }
    
    @Override
    public boolean t() {
        return true;
    }
    
    @Override
    public <E extends n0> void u(final f0 f0, final E e, final E e2, final Map<n0, p> map, final Set<io.realm.q> set) {
        final Class<? super n0> superclass = e2.getClass().getSuperclass();
        if (superclass.equals(a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.drive.RealmDriveAttachment");
        }
        if (superclass.equals(b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmKlassePair");
        }
        if (superclass.equals(com.untis.mobile.persistence.realm.period.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmElementPair");
        }
        if (superclass.equals(c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmPeriod");
        }
        if (superclass.equals(d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmRoomPair");
        }
        if (superclass.equals(f.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmTeacherPair");
        }
        if (superclass.equals(g.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmTimeTable");
        }
        if (superclass.equals(e.class)) {
            throw q.k("com.untis.mobile.persistence.realm.period.RealmSubjectPair");
        }
        if (superclass.equals(com.untis.mobile.persistence.realm.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.RealmInteger");
        }
        if (superclass.equals(v4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.lessontopic.RealmLessonTopic");
        }
        if (superclass.equals(v4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.lessontopic.RealmTeachingMethod");
        }
        if (superclass.equals(com.untis.mobile.persistence.realm.e.class)) {
            throw q.k("com.untis.mobile.persistence.realm.RealmString");
        }
        if (superclass.equals(m4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.homework.RealmLocalHomework");
        }
        if (superclass.equals(m4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.homework.RealmHomework");
        }
        if (superclass.equals(i4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.RealmExemption");
        }
        if (superclass.equals(i4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.RealmClassbook");
        }
        if (superclass.equals(n4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.info.RealmPeriodInfo");
        }
        if (superclass.equals(l4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.event.RealmEvent");
        }
        if (superclass.equals(l4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.event.RealmEventReasonGroup");
        }
        if (superclass.equals(l4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.event.RealmEventReason");
        }
        if (superclass.equals(j4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.absence.RealmExcuse");
        }
        if (superclass.equals(j4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.absence.RealmAbsenceReason");
        }
        if (superclass.equals(j4.d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.absence.RealmExcuseStatus");
        }
        if (superclass.equals(j4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.absence.RealmAbsence");
        }
        if (superclass.equals(i4.d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.RealmTeacherClassRegData");
        }
        if (superclass.equals(k4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.duty.RealmClassRole");
        }
        if (superclass.equals(k4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.duty.RealmDuty");
        }
        if (superclass.equals(i4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.classbook.RealmPrioritizedAttendance");
        }
        if (superclass.equals(a5.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.systemnotification.RealmSystemNotification");
        }
        if (superclass.equals(p4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.exam.RealmInfoCenterExam");
        }
        if (superclass.equals(p4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.exam.RealmInvigilator");
        }
        if (superclass.equals(z4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.profile.RealmProfile");
        }
        if (superclass.equals(z4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.profile.RealmChild");
        }
        if (superclass.equals(z4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.profile.RealmClassbookSettings");
        }
        if (superclass.equals(b5.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timegrid.RealmTimeGridUnit");
        }
        if (superclass.equals(b5.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timegrid.RealmTimeGridDay");
        }
        if (superclass.equals(b5.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timegrid.RealmTimeGrid");
        }
        if (superclass.equals(com.untis.mobile.persistence.realm.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.RealmLong");
        }
        if (superclass.equals(u4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.parentday.RealmParentDayAppointment");
        }
        if (superclass.equals(u4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.parentday.RealmParentDay");
        }
        if (superclass.equals(u4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.parentday.RealmParentDayStudent");
        }
        if (superclass.equals(s4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.homework.RealmInfoCenterLesson");
        }
        if (superclass.equals(s4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.homework.RealmInfoCenterHomework");
        }
        if (superclass.equals(r4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.classLead.RealmClassLeadEvent");
        }
        if (superclass.equals(r4.d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.classLead.RealmClassLeadStudentAbsence");
        }
        if (superclass.equals(r4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.classLead.RealmClassLeadExcuse");
        }
        if (superclass.equals(r4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.classLead.RealmClassLead");
        }
        if (superclass.equals(q4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.absences.RealmInfoCenterExcuse");
        }
        if (superclass.equals(q4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.absences.RealmInfoCenterStudentAbsence");
        }
        if (superclass.equals(t4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.officehour.RealmInfoCenterContactHour");
        }
        if (superclass.equals(t4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.infocenter.officehour.RealmInfoCenterContactHourTimeslot");
        }
        if (superclass.equals(w4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmCustomEntityColor");
        }
        if (superclass.equals(i.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmTeacher");
        }
        if (superclass.equals(w4.e.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmRoom");
        }
        if (superclass.equals(h.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmSubject");
        }
        if (superclass.equals(w4.g.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmStudent");
        }
        if (superclass.equals(w4.d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmKlasse");
        }
        if (superclass.equals(w4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmDepartment");
        }
        if (superclass.equals(w4.f.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmSchoolyear");
        }
        if (superclass.equals(w4.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.masterdata.RealmHoliday");
        }
        if (superclass.equals(y4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.officehour.RealmOfficeHour");
        }
        if (superclass.equals(y4.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.officehour.RealmOfficeHourTimeSlot");
        }
        if (superclass.equals(c5.e.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timetable.RealmTimeTableModel");
        }
        if (superclass.equals(c5.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timetable.RealmPeriodModel");
        }
        if (superclass.equals(c5.b.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timetable.RealmPeriodElementModel");
        }
        if (superclass.equals(c5.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timetable.RealmHolidayModel");
        }
        if (superclass.equals(c5.d.class)) {
            throw q.k("com.untis.mobile.persistence.realm.timetable.RealmTimeTableEntity");
        }
        if (superclass.equals(x4.a.class)) {
            throw q.k("com.untis.mobile.persistence.realm.messageOfDay.RealmMessageOfDay");
        }
        if (superclass.equals(com.untis.mobile.persistence.realm.c.class)) {
            throw q.k("com.untis.mobile.persistence.realm.RealmSchoolColor");
        }
        throw q.h((Class<? extends n0>)superclass);
    }
}
