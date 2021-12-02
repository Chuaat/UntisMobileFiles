// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.k0;
import kotlin.collections.y0;
import kotlin.s0;
import kotlin.n1;
import kotlin.collections.m;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import org.jetbrains.annotations.e;

public enum n
{
    A0("anonymous function", false), 
    B0("object literal", false);
    
    @e
    public static final a I;
    @e
    private static final HashMap<String, n> J;
    @e
    private static final Set<n> K;
    @e
    private static final Set<n> L;
    @e
    private static final Map<kotlin.reflect.jvm.internal.impl.descriptors.annotations.e, n> M;
    
    N("class", false, 2, (w)null), 
    O("annotation class", false, 2, (w)null), 
    P("type parameter", false), 
    Q("property", false, 2, (w)null), 
    R("field", false, 2, (w)null), 
    S("local variable", false, 2, (w)null), 
    T("value parameter", false, 2, (w)null), 
    U("constructor", false, 2, (w)null), 
    V("function", false, 2, (w)null), 
    W("getter", false, 2, (w)null), 
    X("setter", false, 2, (w)null), 
    Y("type usage", false), 
    Z("expression", false), 
    a0("file", false), 
    b0("typealias", false), 
    c0("type projection", false), 
    d0("star projection", false), 
    e0("property constructor parameter", false), 
    f0("class", false), 
    g0("object", false), 
    h0("companion object", false), 
    i0("interface", false), 
    j0("enum class", false), 
    k0("enum entry", false), 
    l0("local class", false), 
    m0("local function", false), 
    n0("member function", false), 
    o0("top level function", false), 
    p0("member property", false), 
    q0("member property with backing field", false), 
    r0("member property with delegate", false), 
    s0("member property without backing field or delegate", false), 
    t0("top level property", false), 
    u0("top level property with backing field", false), 
    v0("top level property with delegate", false), 
    w0("top level property without backing field or delegate", false), 
    x0("initializer", false), 
    y0("destructuring declaration", false), 
    z0("lambda expression", false);
    
    @e
    private final String G;
    private final boolean H;
    
    static {
        I = new a(null);
        J = new HashMap<String, n>();
        final n[] values = values();
        final int length = values.length;
        int n = 0;
        while (n < length) {
            final n n2 = values[n];
            ++n;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.J.put(n2.name(), n2);
        }
        final n[] values2 = values();
        final ArrayList<n> list = new ArrayList<n>();
        for (final n n4 : values2) {
            if (n4.b()) {
                list.add(n4);
            }
        }
        K = v.N5((Iterable<?>)list);
        L = m.Gy(values());
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e n5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.N;
        final n t = kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.T;
        final s0<kotlin.reflect.jvm.internal.impl.descriptors.annotations.e, n> a = n1.a(n5, t);
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e h = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.H;
        final n r = kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.R;
        M = kotlin.collections.y0.W(a, n1.a(h, r), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.J, kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.Q), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.I, kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.a0), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.K, kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.W), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.L, kotlin.reflect.jvm.internal.impl.descriptors.annotations.n.X), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.M, t), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.O, t), n1.a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.P, r));
    }
    
    private n(final String g, final boolean h) {
        this.G = g;
        this.H = h;
    }
    
    public final boolean b() {
        return this.H;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
