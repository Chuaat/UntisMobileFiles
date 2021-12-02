// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.w;
import kotlin.reflect.g;
import kotlin.reflect.s;
import java.util.List;
import kotlin.reflect.t;
import kotlin.reflect.r;
import kotlin.reflect.q;
import kotlin.reflect.p;
import kotlin.reflect.m;
import kotlin.reflect.l;
import kotlin.reflect.k;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.d;

public class l1
{
    private static final String a = "kotlin.jvm.functions.";
    
    public d a(final Class clazz) {
        return new u(clazz);
    }
    
    public d b(final Class clazz, final String s) {
        return new u(clazz);
    }
    
    public i c(final f0 f0) {
        return f0;
    }
    
    public d d(final Class clazz) {
        return new u(clazz);
    }
    
    public d e(final Class clazz, final String s) {
        return new u(clazz);
    }
    
    public h f(final Class clazz, final String s) {
        return new a1(clazz, s);
    }
    
    public k g(final t0 t0) {
        return t0;
    }
    
    public l h(final v0 v0) {
        return v0;
    }
    
    public m i(final x0 x0) {
        return x0;
    }
    
    public p j(final c1 c1) {
        return c1;
    }
    
    public q k(final e1 e1) {
        return e1;
    }
    
    public r l(final g1 g1) {
        return g1;
    }
    
    @kotlin.e1(version = "1.3")
    public String m(final d0 d0) {
        String s2;
        final String s = s2 = d0.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
    
    @kotlin.e1(version = "1.1")
    public String n(final m0 m0) {
        return this.m(m0);
    }
    
    @kotlin.e1(version = "1.4")
    public void o(final t t, final List<s> list) {
        ((s1)t).b(list);
    }
    
    @kotlin.e1(version = "1.4")
    public s p(final g g, final List<kotlin.reflect.u> list, final boolean b) {
        return new u1(g, list, b);
    }
    
    @kotlin.e1(version = "1.4")
    public t q(final Object o, final String s, final w w, final boolean b) {
        return new s1(o, s, w, b);
    }
}
