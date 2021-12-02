// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.n;
import java.util.LinkedHashMap;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.i;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Map;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import n6.a;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

public abstract class p extends k implements y
{
    private List<b1> K;
    private List<e1> L;
    private c0 M;
    private t0 N;
    private t0 O;
    private b0 P;
    private u Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private boolean b0;
    private boolean c0;
    private Collection<? extends y> d0;
    private volatile a<Collection<y>> e0;
    private final y f0;
    private final b.a g0;
    @f
    private y h0;
    protected Map<a.a<?>, Object> i0;
    
    protected p(@e final m m, @f final y y, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b.a g2, @e final w0 w0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (g2 == null) {
            L(3);
        }
        if (w0 == null) {
            L(4);
        }
        super(m, g, e, w0);
        this.Q = t.i;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = true;
        this.c0 = false;
        this.d0 = null;
        this.e0 = null;
        this.h0 = null;
        this.i0 = null;
        y f0;
        if ((f0 = y) == null) {
            f0 = this;
        }
        this.f0 = f0;
        this.g0 = g2;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25: {
                format = "@NotNull method %s.%s must not return null";
                break;
            }
        }
        int n2 = 0;
        switch (n) {
            default: {
                n2 = 3;
                break;
            }
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 23: {
                args[0] = "configuration";
                break;
            }
            case 22:
            case 27:
            case 29: {
                args[0] = "substitutor";
                break;
            }
            case 20: {
                args[0] = "originalSubstitutor";
                break;
            }
            case 15: {
                args[0] = "overriddenDescriptors";
                break;
            }
            case 11: {
                args[0] = "extensionReceiverParameter";
                break;
            }
            case 10: {
                args[0] = "unsubstitutedReturnType";
                break;
            }
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 7:
            case 9: {
                args[0] = "visibility";
                break;
            }
            case 6:
            case 26:
            case 28: {
                args[0] = "unsubstitutedValueParameters";
                break;
            }
            case 5: {
                args[0] = "typeParameters";
                break;
            }
            case 4: {
                args[0] = "source";
                break;
            }
            case 3: {
                args[0] = "kind";
                break;
            }
            case 2: {
                args[0] = "name";
                break;
            }
            case 1: {
                args[0] = "annotations";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 25: {
                args[1] = "getSourceToUseForCopy";
                break;
            }
            case 24: {
                args[1] = "copy";
                break;
            }
            case 21: {
                args[1] = "newCopyBuilder";
                break;
            }
            case 19: {
                args[1] = "getKind";
                break;
            }
            case 18: {
                args[1] = "getOriginal";
                break;
            }
            case 17: {
                args[1] = "getValueParameters";
                break;
            }
            case 16: {
                args[1] = "getTypeParameters";
                break;
            }
            case 14: {
                args[1] = "getVisibility";
                break;
            }
            case 13: {
                args[1] = "getModality";
                break;
            }
            case 12: {
                args[1] = "getOverriddenDescriptors";
                break;
            }
            case 8: {
                args[1] = "initialize";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 8:
                case 12:
                case 13:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 24:
                case 25: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 8:
                        case 12:
                        case 13:
                        case 14:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 21:
                        case 24:
                        case 25: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 26:
                case 27:
                case 28:
                case 29: {
                    args[2] = "getSubstitutedValueParameters";
                    continue;
                }
                case 23: {
                    args[2] = "doSubstitute";
                    continue;
                }
                case 22: {
                    args[2] = "newCopyBuilder";
                    continue;
                }
                case 20: {
                    args[2] = "substitute";
                    continue;
                }
                case 15: {
                    args[2] = "setOverriddenDescriptors";
                    continue;
                }
                case 11: {
                    args[2] = "setExtensionReceiverParameter";
                    continue;
                }
                case 10: {
                    args[2] = "setReturnType";
                    continue;
                }
                case 9: {
                    args[2] = "setVisibility";
                    continue;
                }
                case 5:
                case 6:
                case 7: {
                    args[2] = "initialize";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    private w0 O0(final boolean b, @f y b2) {
        w0 w0;
        if (b) {
            if (b2 == null) {
                b2 = this.b();
            }
            w0 = b2.k();
        }
        else {
            w0 = kotlin.reflect.jvm.internal.impl.descriptors.w0.a;
        }
        if (w0 == null) {
            L(25);
        }
        return w0;
    }
    
    @f
    public static List<e1> P0(final y y, @e final List<e1> list, @e final d1 d1) {
        if (list == null) {
            L(26);
        }
        if (d1 == null) {
            L(27);
        }
        return Q0(y, list, d1, false, false, null);
    }
    
    @f
    public static List<e1> Q0(final y y, @e final List<e1> list, @e final d1 d1, final boolean b, final boolean b2, @f final boolean[] array) {
        if (list == null) {
            L(28);
        }
        if (d1 == null) {
            L(29);
        }
        final ArrayList<k0> list2 = (ArrayList<k0>)new ArrayList<e1>(list.size());
        for (final e1 e1 : list) {
            final c0 a = e1.a();
            final k1 l = k1.L;
            final c0 p6 = d1.p(a, l);
            final c0 p7 = e1.p0();
            c0 p8;
            if (p7 == null) {
                p8 = null;
            }
            else {
                p8 = d1.p(p7, l);
            }
            if (p6 == null) {
                return null;
            }
            if ((p6 != e1.a() || p7 != p8) && array != null) {
                array[0] = true;
            }
            a<? extends List<? extends g1>> a2;
            if (e1 instanceof k0.b) {
                a2 = new a<List<g1>>() {
                    final /* synthetic */ List G = ((k0.b)e1).P0();
                    
                    public List<g1> a() {
                        return (List<g1>)this.G;
                    }
                };
            }
            else {
                a2 = null;
            }
            e1 e2;
            if (b) {
                e2 = null;
            }
            else {
                e2 = e1;
            }
            final int i = e1.i();
            final g annotations = e1.getAnnotations();
            final kotlin.reflect.jvm.internal.impl.name.e name = e1.getName();
            final boolean x0 = e1.x0();
            final boolean f0 = e1.f0();
            final boolean b3 = e1.b0();
            w0 w0;
            if (b2) {
                w0 = e1.k();
            }
            else {
                w0 = kotlin.reflect.jvm.internal.impl.descriptors.w0.a;
            }
            list2.add(k0.M0(y, e2, i, annotations, name, p6, x0, f0, b3, p8, w0, a2));
        }
        return (List<e1>)list2;
    }
    
    private void U0() {
        final a<Collection<y>> e0 = this.e0;
        if (e0 != null) {
            this.d0 = e0.invoke();
            this.e0 = null;
        }
    }
    
    private void b1(final boolean z) {
        this.Z = z;
    }
    
    private void c1(final boolean y) {
        this.Y = y;
    }
    
    private void e1(@f final y h0) {
        this.h0 = h0;
    }
    
    @Override
    public void A0(@e final Collection<? extends b> d0) {
        if (d0 == null) {
            L(15);
        }
        this.d0 = (Collection<? extends y>)d0;
        final Iterator<? extends y> iterator = d0.iterator();
        while (iterator.hasNext()) {
            if (((y)iterator.next()).D0()) {
                this.Z = true;
                break;
            }
        }
    }
    
    @e
    @Override
    public y.a<? extends y> B() {
        final c t0 = this.T0(d1.b);
        if (t0 == null) {
            L(21);
        }
        return t0;
    }
    
    @Override
    public boolean D0() {
        return this.Z;
    }
    
    @Override
    public boolean F0() {
        return this.X;
    }
    
    @Override
    public boolean K() {
        return this.c0;
    }
    
    @e
    public y L0(final m m, final b0 b0, final u u, final b.a a, final boolean b2) {
        final y h = (y)this.B().o(m).c(b0).n(u).q(a).j(b2).h();
        if (h == null) {
            L(24);
        }
        return h;
    }
    
    @e
    protected abstract p M0(@e final m p0, @f final y p1, @e final b.a p2, @f final kotlin.reflect.jvm.internal.impl.name.e p3, @e final g p4, @e final w0 p5);
    
    @f
    protected y N0(@e final c c) {
        if (c == null) {
            L(23);
        }
        final boolean[] array = { false };
        g g;
        if (c.r != null) {
            g = i.a(this.getAnnotations(), c.r);
        }
        else {
            g = this.getAnnotations();
        }
        final m b = c.b;
        final y e = c.e;
        final p m0 = this.M0(b, e, c.f, c.k, g, this.O0(c.n, e));
        List<b1> list;
        if (c.q == null) {
            list = this.getTypeParameters();
        }
        else {
            list = c.q;
        }
        array[0] |= (list.isEmpty() ^ true);
        final ArrayList list2 = new ArrayList<b1>(list.size());
        final d1 c2 = kotlin.reflect.jvm.internal.impl.types.p.c((List)list, c.a, (m)m0, (List)list2, array);
        if (c2 == null) {
            return null;
        }
        final t0 h = c.h;
        t0 t0;
        if (h != null) {
            final c0 p = c2.p(h.a(), k1.L);
            if (p == null) {
                return null;
            }
            t0 = new e0(m0, (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b((kotlin.reflect.jvm.internal.impl.descriptors.a)m0, p, c.h.getValue()), c.h.getAnnotations());
            array[0] |= (p != c.h.a());
        }
        else {
            t0 = null;
        }
        final t0 i = c.i;
        t0 d;
        if (i != null) {
            d = i.d(c2);
            if (d == null) {
                return null;
            }
            array[0] |= (d != c.i);
        }
        else {
            d = null;
        }
        final List<e1> q0 = Q0(m0, c.g, c2, c.o, c.n, array);
        if (q0 == null) {
            return null;
        }
        final c0 p2 = c2.p(c.j, k1.M);
        if (p2 == null) {
            return null;
        }
        array[0] |= (p2 != c.j);
        if (!array[0] && c.v) {
            return this;
        }
        m0.S0(t0, d, (List<? extends b1>)list2, q0, p2, c.c, c.d);
        m0.g1(this.R);
        m0.d1(this.S);
        m0.Y0(this.T);
        m0.f1(this.U);
        m0.j1(this.V);
        m0.i1(this.a0);
        m0.X0(this.W);
        m0.W0(this.X);
        m0.Z0(this.b0);
        m0.c1(c.p);
        m0.b1(c.s);
        boolean b2;
        if (c.u != null) {
            b2 = c.u;
        }
        else {
            b2 = this.c0;
        }
        m0.a1(b2);
        if (!c.t.isEmpty() || this.i0 != null) {
            final Map a = c.t;
            final Map<a.a<?>, Object> i2 = this.i0;
            if (i2 != null) {
                for (final Map.Entry<a.a<?>, V> entry : i2.entrySet()) {
                    if (!a.containsKey(entry.getKey())) {
                        a.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            Object singletonMap = a;
            if (a.size() == 1) {
                singletonMap = Collections.singletonMap(a.keySet().iterator().next(), a.values().iterator().next());
            }
            m0.i0 = (Map<a.a<?>, Object>)singletonMap;
        }
        if (c.m || this.h0() != null) {
            y h2;
            if (this.h0() != null) {
                h2 = this.h0();
            }
            else {
                h2 = this;
            }
            m0.e1(h2.d(c2));
        }
        if (c.l && !this.b().g().isEmpty()) {
            a<Collection<y>> e2;
            if (c.a.f()) {
                e2 = this.e0;
                if (e2 == null) {
                    m0.A0(this.g());
                    return m0;
                }
            }
            else {
                e2 = new a<Collection<y>>() {
                    public Collection<y> a() {
                        final kotlin.reflect.jvm.internal.impl.utils.i i = new kotlin.reflect.jvm.internal.impl.utils.i();
                        final Iterator<? extends y> iterator = p.this.g().iterator();
                        while (iterator.hasNext()) {
                            ((Collection<y>)i).add(((y)iterator.next()).d(c2));
                        }
                        return (Collection<y>)i;
                    }
                };
            }
            m0.e0 = e2;
        }
        return m0;
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.g(this, n);
    }
    
    @Override
    public boolean Q() {
        return this.W;
    }
    
    public boolean R0() {
        return this.b0;
    }
    
    @e
    public p S0(@f final t0 n, @f final t0 o, @e final List<? extends b1> list, @e final List<e1> list2, @f final c0 m, @f final b0 p7, @e final u q) {
        if (list == null) {
            L(5);
        }
        if (list2 == null) {
            L(6);
        }
        if (q == null) {
            L(7);
        }
        this.K = v.I5((Iterable<? extends b1>)list);
        this.L = v.I5((Iterable<? extends e1>)list2);
        this.M = m;
        this.P = p7;
        this.Q = q;
        this.N = n;
        this.O = o;
        final int n2 = 0;
        int i = 0;
        int j;
        while (true) {
            j = n2;
            if (i >= list.size()) {
                break;
            }
            final b1 obj = (b1)list.get(i);
            if (obj.i() != i) {
                final StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(" index is ");
                sb.append(obj.i());
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            ++i;
        }
        while (j < list2.size()) {
            final e1 obj2 = list2.get(j);
            if (obj2.i() != j + 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append("index is ");
                sb2.append(obj2.i());
                sb2.append(" but position is ");
                sb2.append(j);
                throw new IllegalStateException(sb2.toString());
            }
            ++j;
        }
        return this;
    }
    
    @Override
    public boolean T() {
        return this.V;
    }
    
    @e
    protected c T0(@e final d1 d1) {
        if (d1 == null) {
            L(22);
        }
        return new c(d1.j(), this.c(), this.o(), this.getVisibility(), this.n(), this.m(), this.q0(), this.getReturnType(), null);
    }
    
    public <V> void V0(final a.a<V> a, final Object o) {
        if (this.i0 == null) {
            this.i0 = new LinkedHashMap<a.a<?>, Object>();
        }
        this.i0.put(a, o);
    }
    
    public void W0(final boolean x) {
        this.X = x;
    }
    
    public void X0(final boolean w) {
        this.W = w;
    }
    
    public void Y0(final boolean t) {
        this.T = t;
    }
    
    public void Z0(final boolean b0) {
        this.b0 = b0;
    }
    
    public void a1(final boolean c0) {
        this.c0 = c0;
    }
    
    @e
    @Override
    public y b() {
        final y f0 = this.f0;
        y b;
        if (f0 == this) {
            b = this;
        }
        else {
            b = f0.b();
        }
        if (b == null) {
            L(18);
        }
        return b;
    }
    
    @Override
    public y d(@e final d1 d1) {
        if (d1 == null) {
            L(20);
        }
        if (d1.k()) {
            return this;
        }
        return this.T0(d1).N(this.b()).P().J(true).h();
    }
    
    public void d1(final boolean s) {
        this.S = s;
    }
    
    public void f1(final boolean u) {
        this.U = u;
    }
    
    @e
    @Override
    public Collection<? extends y> g() {
        this.U0();
        Object o = this.d0;
        if (o == null) {
            o = Collections.emptyList();
        }
        if (o == null) {
            L(12);
        }
        return (Collection<? extends y>)o;
    }
    
    public void g1(final boolean r) {
        this.R = r;
    }
    
    @Override
    public c0 getReturnType() {
        return this.M;
    }
    
    @e
    @Override
    public List<b1> getTypeParameters() {
        final List<b1> k = this.K;
        if (k != null) {
            return k;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("typeParameters == null for ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    @e
    @Override
    public u getVisibility() {
        final u q = this.Q;
        if (q == null) {
            L(14);
        }
        return q;
    }
    
    @f
    @Override
    public y h0() {
        return this.h0;
    }
    
    public void h1(@e final c0 m) {
        if (m == null) {
            L(10);
        }
        this.M = m;
    }
    
    public void i1(final boolean a0) {
        this.a0 = a0;
    }
    
    @Override
    public boolean isExternal() {
        return this.T;
    }
    
    @Override
    public boolean isInfix() {
        if (this.S) {
            return true;
        }
        final Iterator<? extends y> iterator = this.b().g().iterator();
        while (iterator.hasNext()) {
            if (((y)iterator.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isInline() {
        return this.U;
    }
    
    @Override
    public boolean isOperator() {
        if (this.R) {
            return true;
        }
        final Iterator<? extends y> iterator = this.b().g().iterator();
        while (iterator.hasNext()) {
            if (((y)iterator.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isSuspend() {
        return this.a0;
    }
    
    @f
    @Override
    public t0 j0() {
        return this.O;
    }
    
    public void j1(final boolean v) {
        this.V = v;
    }
    
    public void k1(@e final u q) {
        if (q == null) {
            L(9);
        }
        this.Q = q;
    }
    
    @e
    @Override
    public List<e1> m() {
        final List<e1> l = this.L;
        if (l == null) {
            L(17);
        }
        return l;
    }
    
    @Override
    public <V> V m0(final a.a<V> a) {
        final Map<a.a<?>, Object> i0 = this.i0;
        if (i0 == null) {
            return null;
        }
        return (V)i0.get(a);
    }
    
    @e
    @Override
    public b.a n() {
        final b.a g0 = this.g0;
        if (g0 == null) {
            L(19);
        }
        return g0;
    }
    
    @e
    @Override
    public b0 o() {
        final b0 p = this.P;
        if (p == null) {
            L(13);
        }
        return p;
    }
    
    @f
    @Override
    public t0 q0() {
        return this.N;
    }
    
    @Override
    public boolean z0() {
        return this.Y;
    }
    
    public class c implements y.a<y>
    {
        @e
        protected kotlin.reflect.jvm.internal.impl.types.b1 a;
        @e
        protected m b;
        @e
        protected b0 c;
        @e
        protected u d;
        @f
        protected y e;
        @e
        protected b.a f;
        @e
        protected List<e1> g;
        @f
        protected t0 h;
        @f
        protected t0 i;
        @e
        protected c0 j;
        @f
        protected kotlin.reflect.jvm.internal.impl.name.e k;
        protected boolean l;
        protected boolean m;
        protected boolean n;
        protected boolean o;
        private boolean p;
        private List<b1> q;
        private g r;
        private boolean s;
        private Map<a.a<?>, Object> t;
        private Boolean u;
        protected boolean v;
        
        public c(@e final kotlin.reflect.jvm.internal.impl.types.b1 a, @e final m b, @e final b0 c, @e final u d, @e final b.a f, @f final List<e1> g, @e final t0 h, @f final c0 j, final kotlin.reflect.jvm.internal.impl.name.e k) {
            if (a == null) {
                u(0);
            }
            if (b == null) {
                u(1);
            }
            if (c == null) {
                u(2);
            }
            if (d == null) {
                u(3);
            }
            if (f == null) {
                u(4);
            }
            if (g == null) {
                u(5);
            }
            if (j == null) {
                u(6);
            }
            this.e = null;
            this.i = kotlin.reflect.jvm.internal.impl.descriptors.impl.p.this.O;
            this.l = true;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = kotlin.reflect.jvm.internal.impl.descriptors.impl.p.this.z0();
            this.q = null;
            this.r = null;
            this.s = kotlin.reflect.jvm.internal.impl.descriptors.impl.p.this.D0();
            this.t = new LinkedHashMap<a.a<?>, Object>();
            this.u = null;
            this.v = false;
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = f;
            this.g = g;
            this.h = h;
            this.j = j;
            this.k = k;
        }
        
        private static /* synthetic */ void u(final int n) {
            String format = null;
            switch (n) {
                default: {
                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
                }
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39: {
                    format = "@NotNull method %s.%s must not return null";
                    break;
                }
            }
            int n2 = 0;
            switch (n) {
                default: {
                    n2 = 3;
                    break;
                }
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39: {
                    n2 = 2;
                    break;
                }
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "substitution";
                    break;
                }
                case 36: {
                    args[0] = "userDataKey";
                    break;
                }
                case 32: {
                    args[0] = "additionalAnnotations";
                    break;
                }
                case 22: {
                    args[0] = "type";
                    break;
                }
                case 18:
                case 20: {
                    args[0] = "parameters";
                    break;
                }
                case 16: {
                    args[0] = "name";
                    break;
                }
                case 11: {
                    args[0] = "visibility";
                    break;
                }
                case 9: {
                    args[0] = "modality";
                    break;
                }
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                }
                case 7: {
                    args[0] = "owner";
                    break;
                }
                case 6: {
                    args[0] = "newReturnType";
                    break;
                }
                case 5: {
                    args[0] = "newValueParameterDescriptors";
                    break;
                }
                case 4:
                case 13: {
                    args[0] = "kind";
                    break;
                }
                case 3: {
                    args[0] = "newVisibility";
                    break;
                }
                case 2: {
                    args[0] = "newModality";
                    break;
                }
                case 1: {
                    args[0] = "newOwner";
                    break;
                }
            }
            switch (n) {
                default: {
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                }
                case 39: {
                    args[1] = "setJustForTypeSubstitution";
                    break;
                }
                case 38: {
                    args[1] = "getSubstitution";
                    break;
                }
                case 37: {
                    args[1] = "putUserData";
                    break;
                }
                case 35: {
                    args[1] = "setSubstitution";
                    break;
                }
                case 33: {
                    args[1] = "setAdditionalAnnotations";
                    break;
                }
                case 31: {
                    args[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                }
                case 30: {
                    args[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                }
                case 29: {
                    args[1] = "setDropOriginalInContainingParts";
                    break;
                }
                case 28: {
                    args[1] = "setPreserveSourceElement";
                    break;
                }
                case 27: {
                    args[1] = "setSignatureChange";
                    break;
                }
                case 26: {
                    args[1] = "setOriginal";
                    break;
                }
                case 25: {
                    args[1] = "setDispatchReceiverParameter";
                    break;
                }
                case 24: {
                    args[1] = "setExtensionReceiverParameter";
                    break;
                }
                case 23: {
                    args[1] = "setReturnType";
                    break;
                }
                case 21: {
                    args[1] = "setTypeParameters";
                    break;
                }
                case 19: {
                    args[1] = "setValueParameters";
                    break;
                }
                case 17: {
                    args[1] = "setName";
                    break;
                }
                case 15: {
                    args[1] = "setCopyOverrides";
                    break;
                }
                case 14: {
                    args[1] = "setKind";
                    break;
                }
                case 12: {
                    args[1] = "setVisibility";
                    break;
                }
                case 10: {
                    args[1] = "setModality";
                    break;
                }
                case 8: {
                    args[1] = "setOwner";
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        args[2] = "<init>";
                    }
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                    case 19:
                    case 21:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 33:
                    case 35:
                    case 37:
                    case 38:
                    case 39: {
                        final String format2 = String.format(format, args);
                        RuntimeException ex = null;
                        switch (n) {
                            default: {
                                ex = new IllegalArgumentException(format2);
                                break;
                            }
                            case 8:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                            case 19:
                            case 21:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 33:
                            case 35:
                            case 37:
                            case 38:
                            case 39: {
                                ex = new IllegalStateException(format2);
                                break;
                            }
                        }
                        throw ex;
                    }
                    case 36: {
                        args[2] = "putUserData";
                        continue;
                    }
                    case 34: {
                        args[2] = "setSubstitution";
                        continue;
                    }
                    case 32: {
                        args[2] = "setAdditionalAnnotations";
                        continue;
                    }
                    case 22: {
                        args[2] = "setReturnType";
                        continue;
                    }
                    case 20: {
                        args[2] = "setTypeParameters";
                        continue;
                    }
                    case 18: {
                        args[2] = "setValueParameters";
                        continue;
                    }
                    case 16: {
                        args[2] = "setName";
                        continue;
                    }
                    case 13: {
                        args[2] = "setKind";
                        continue;
                    }
                    case 11: {
                        args[2] = "setVisibility";
                        continue;
                    }
                    case 9: {
                        args[2] = "setModality";
                        continue;
                    }
                    case 7: {
                        args[2] = "setOwner";
                        continue;
                    }
                }
                break;
            }
        }
        
        @e
        public c B(@e final g r) {
            if (r == null) {
                u(32);
            }
            this.r = r;
            return this;
        }
        
        @e
        public c C(final boolean l) {
            this.l = l;
            return this;
        }
        
        @e
        public c D(@f final t0 i) {
            this.i = i;
            return this;
        }
        
        @e
        public c E() {
            this.o = true;
            return this;
        }
        
        @e
        public c F(@f final t0 h) {
            this.h = h;
            return this;
        }
        
        public c G(final boolean b) {
            this.u = b;
            return this;
        }
        
        @e
        public c H() {
            this.s = true;
            return this;
        }
        
        @e
        public c I() {
            this.p = true;
            return this;
        }
        
        @e
        public c J(final boolean v) {
            this.v = v;
            return this;
        }
        
        @e
        public c K(@e final b.a f) {
            if (f == null) {
                u(13);
            }
            this.f = f;
            return this;
        }
        
        @e
        public c L(@e final b0 c) {
            if (c == null) {
                u(9);
            }
            this.c = c;
            return this;
        }
        
        @e
        public c M(@e final kotlin.reflect.jvm.internal.impl.name.e k) {
            if (k == null) {
                u(16);
            }
            this.k = k;
            return this;
        }
        
        @e
        public c N(@f final b b) {
            this.e = (y)b;
            return this;
        }
        
        @e
        public c O(@e final m b) {
            if (b == null) {
                u(7);
            }
            this.b = b;
            return this;
        }
        
        @e
        public c P() {
            this.n = true;
            return this;
        }
        
        @e
        public c Q(@e final c0 j) {
            if (j == null) {
                u(22);
            }
            this.j = j;
            return this;
        }
        
        @e
        public c R() {
            this.m = true;
            return this;
        }
        
        @e
        public c S(@e final kotlin.reflect.jvm.internal.impl.types.b1 a) {
            if (a == null) {
                u(34);
            }
            this.a = a;
            return this;
        }
        
        @e
        public c T(@e final List<b1> q) {
            if (q == null) {
                u(20);
            }
            this.q = q;
            return this;
        }
        
        @e
        public c U(@e final List<e1> g) {
            if (g == null) {
                u(18);
            }
            this.g = g;
            return this;
        }
        
        @e
        public c V(@e final u d) {
            if (d == null) {
                u(11);
            }
            this.d = d;
            return this;
        }
        
        @f
        @Override
        public y h() {
            return kotlin.reflect.jvm.internal.impl.descriptors.impl.p.this.N0(this);
        }
    }
}
