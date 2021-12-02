// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0$b;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.d0;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.e;

public final class d extends c implements f
{
    @e
    private final g l;
    @e
    private final b0 m;
    
    public d(@e final g l) {
        k0.p((Object)l, "options");
        (this.l = l).m0();
        this.m = d0.c((n6.a)new n6.a<d>() {
            final /* synthetic */ d G;
            
            @e
            public final d a() {
                return (d)this.G.A((n6.l<? super f, j2>)d$d$a.G);
            }
        });
    }
    
    private final void A1(final StringBuilder sb, final o0 o0) {
        final o0 c = o0.c();
        StringBuilder sb2;
        if (c == null) {
            sb2 = null;
        }
        else {
            this.A1(sb, c);
            sb.append('.');
            final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)o0.b()).getName();
            k0.o((Object)name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(this.x(name, false));
            sb2 = sb;
        }
        if (sb2 == null) {
            final w0 l = ((h)o0.b()).l();
            k0.o((Object)l, "possiblyInnerType.classifierDescriptor.typeConstructor");
            sb.append(this.L1(l));
        }
        sb.append(this.K1(o0.a()));
    }
    
    private final void B1(final q0 q0, final StringBuilder sb) {
        if (!this.B0()) {
            if (!this.A0()) {
                this.C1(q0, sb);
                final u visibility = ((a0)q0).getVisibility();
                k0.o((Object)visibility, "property.visibility");
                this.W1(visibility, sb);
                final boolean contains = this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.U);
                final boolean b = false;
                this.s1(sb, contains && ((g1)q0).p(), "const");
                this.o1((a0)q0, sb);
                this.r1((kotlin.reflect.jvm.internal.impl.descriptors.b)q0, sb);
                this.w1((kotlin.reflect.jvm.internal.impl.descriptors.b)q0, sb);
                boolean b2 = b;
                if (this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.V)) {
                    b2 = b;
                    if (((g1)q0).v0()) {
                        b2 = true;
                    }
                }
                this.s1(sb, b2, "lateinit");
                this.n1((kotlin.reflect.jvm.internal.impl.descriptors.b)q0, sb);
            }
            S1(this, (g1)q0, sb, false, 4, null);
            final List typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a)q0).getTypeParameters();
            k0.o((Object)typeParameters, "property.typeParameters");
            this.Q1(typeParameters, sb, true);
            this.D1((kotlin.reflect.jvm.internal.impl.descriptors.a)q0, sb);
        }
        this.t1((m)q0, sb, true);
        sb.append(": ");
        final c0 a = ((d1)q0).a();
        k0.o((Object)a, "property.type");
        sb.append(this.y(a));
        this.E1((kotlin.reflect.jvm.internal.impl.descriptors.a)q0, sb);
        this.l1((g1)q0, sb);
        final List typeParameters2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)q0).getTypeParameters();
        k0.o((Object)typeParameters2, "property.typeParameters");
        this.X1(typeParameters2, sb);
    }
    
    private final void C1(final q0 q0, final StringBuilder sb) {
        if (!this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.N)) {
            return;
        }
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)q0, null, 2, null);
        final w u0 = q0.u0();
        if (u0 != null) {
            this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)u0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.H);
        }
        final w r0 = q0.r0();
        if (r0 != null) {
            this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)r0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.P);
        }
        if (this.o0() == kotlin.reflect.jvm.internal.impl.renderer.l.I) {
            final r0 e = q0.e();
            if (e != null) {
                this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.K);
            }
            final s0 h = q0.h();
            if (h != null) {
                this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)h, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.L);
                final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)h).m();
                k0.o((Object)m, "setter.valueParameters");
                final e1 e2 = (e1)v.U4(m);
                k0.o((Object)e2, "it");
                this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.O);
            }
        }
    }
    
    private final void D1(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final StringBuilder sb) {
        final t0 q0 = a.q0();
        if (q0 != null) {
            this.X0(sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)q0, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.M);
            final c0 a2 = ((d1)q0).a();
            k0.o((Object)a2, "receiver.type");
            String str2;
            final String str = str2 = this.y(a2);
            if (this.Z1(a2)) {
                str2 = str;
                if (!f1.l(a2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append('(');
                    sb2.append(str);
                    sb2.append(')');
                    str2 = sb2.toString();
                }
            }
            sb.append(str2);
            sb.append(".");
        }
    }
    
    private final void E1(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final StringBuilder sb) {
        if (!this.p0()) {
            return;
        }
        final t0 q0 = a.q0();
        if (q0 != null) {
            sb.append(" on ");
            final c0 a2 = ((d1)q0).a();
            k0.o((Object)a2, "receiver.type");
            sb.append(this.y(a2));
        }
    }
    
    private final void F1(final StringBuilder sb, final kotlin.reflect.jvm.internal.impl.types.k0 k0) {
        if (k0.g((Object)k0, (Object)f1.b) || f1.k(k0)) {
            sb.append("???");
            return;
        }
        if (kotlin.reflect.jvm.internal.impl.types.u.t(k0)) {
            if (this.E0()) {
                final String string = ((f0)((kotlin.reflect.jvm.internal.impl.types.u.f)k0.N0()).f()).getName().toString();
                k0.o((Object)string, "type.constructor as UninferredParameterTypeConstructor).typeParameterDescriptor.name.toString()");
                sb.append(this.h1(string));
            }
            else {
                sb.append("???");
            }
            return;
        }
        if (e0.a(k0)) {
            this.g1(sb, k0);
            return;
        }
        if (this.Z1(k0)) {
            this.k1(sb, k0);
        }
        else {
            this.g1(sb, k0);
        }
    }
    
    private final void G1(final StringBuilder sb) {
        final int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }
    
    private final void H1(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final StringBuilder sb) {
        if (this.L0()) {
            return;
        }
        if (KotlinBuiltIns.isNothing((c0)e.A())) {
            return;
        }
        final Collection<c0> k = ((h)e).l().k();
        k0.o((Object)k, "klass.typeConstructor.supertypes");
        if (!k.isEmpty()) {
            if (k.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny((c0)k.iterator().next())) {
                this.G1(sb);
                sb.append(": ");
                v.X2((Iterable)k, (Appendable)sb, (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)new n6.l<c0, CharSequence>() {
                    final /* synthetic */ d G;
                    
                    @e
                    public final CharSequence a(final c0 c0) {
                        final d g = this.G;
                        k0.o((Object)c0, "it");
                        return g.y(c0);
                    }
                }, 60, (Object)null);
            }
        }
    }
    
    private final void I1(final y y, final StringBuilder sb) {
        this.s1(sb, y.isSuspend(), "suspend");
    }
    
    private final void J1(final a1 a1, final StringBuilder sb) {
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a1, null, 2, null);
        final u visibility = ((a0)a1).getVisibility();
        k0.o((Object)visibility, "typeAlias.visibility");
        this.W1(visibility, sb);
        this.o1((a0)a1, sb);
        sb.append(this.m1("typealias"));
        sb.append(" ");
        this.t1((m)a1, sb, true);
        final List c = ((i)a1).C();
        k0.o((Object)c, "typeAlias.declaredTypeParameters");
        this.Q1(c, sb, false);
        this.Z0((i)a1, sb);
        sb.append(" = ");
        sb.append(this.y(a1.k0()));
    }
    
    private final void M1(final StringBuilder sb, final c0 c0, final w0 w0) {
        final o0 a = c1.a(c0);
        if (a == null) {
            sb.append(this.L1(w0));
            sb.append(this.K1(c0.M0()));
            return;
        }
        this.A1(sb, a);
    }
    
    private final void N(final StringBuilder sb, final m m) {
        if (!(m instanceof h0)) {
            if (!(m instanceof kotlin.reflect.jvm.internal.impl.descriptors.m0)) {
                if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e0) {
                    sb.append(" is a module");
                    return;
                }
                final m c = m.c();
                if (c != null && !(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e0)) {
                    sb.append(" ");
                    sb.append(this.p1("defined in"));
                    sb.append(" ");
                    final kotlin.reflect.jvm.internal.impl.name.c i = kotlin.reflect.jvm.internal.impl.resolve.d.m(c);
                    k0.o((Object)i, "getFqName(containingDeclaration)");
                    String w;
                    if (i.e()) {
                        w = "root package";
                    }
                    else {
                        w = this.w(i);
                    }
                    sb.append(w);
                    if (this.J0() && c instanceof h0 && m instanceof p) {
                        final String name = ((p)m).k().a().getName();
                        if (name != null) {
                            sb.append(" ");
                            sb.append(this.p1("in file"));
                            sb.append(" ");
                            sb.append(name);
                        }
                    }
                }
            }
        }
    }
    
    private final String N0() {
        return this.R(">");
    }
    
    static /* synthetic */ void N1(final d d, final StringBuilder sb, final c0 c0, w0 n0, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n0 = c0.N0();
        }
        d.M1(sb, c0, n0);
    }
    
    private final void O(final StringBuilder sb, final List<? extends y0> list) {
        v.X2((Iterable)list, (Appendable)sb, (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)new n6.l<y0, CharSequence>() {
            final /* synthetic */ d G;
            
            @e
            public final CharSequence a(@e final y0 y0) {
                k0.p((Object)y0, "it");
                String string;
                if (y0.d()) {
                    string = "*";
                }
                else {
                    final d g = this.G;
                    final c0 a = y0.a();
                    k0.o((Object)a, "it.type");
                    final String y2 = g.y(a);
                    if (y0.c() == k1.K) {
                        string = y2;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(y0.c());
                        sb.append(' ');
                        sb.append(y2);
                        string = sb.toString();
                    }
                }
                return string;
            }
        }, 60, (Object)null);
    }
    
    private final boolean O0(final c0 c0) {
        return FunctionTypesKt.isSuspendFunctionType(c0) || !((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations().isEmpty();
    }
    
    private final void O1(final b1 b1, final StringBuilder sb, final boolean b2) {
        if (b2) {
            sb.append(this.R0());
        }
        if (this.H0()) {
            sb.append("/*");
            sb.append(b1.i());
            sb.append("*/ ");
        }
        this.s1(sb, b1.r(), "reified");
        final String d = b1.v().d();
        final int length = d.length();
        int n = 1;
        this.s1(sb, length > 0, d);
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)b1, null, 2, null);
        this.t1((m)b1, sb, b2);
        final int size = b1.getUpperBounds().size();
        if ((size > 1 && !b2) || size == 1) {
            final c0 c0 = b1.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(c0)) {
                sb.append(" : ");
                k0.o((Object)c0, "upperBound");
                sb.append(this.y(c0));
            }
        }
        else if (b2) {
            for (final c0 c2 : b1.getUpperBounds()) {
                if (KotlinBuiltIns.isDefaultBound(c2)) {
                    continue;
                }
                if (n != 0) {
                    sb.append(" : ");
                }
                else {
                    sb.append(" & ");
                }
                k0.o((Object)c2, "upperBound");
                sb.append(this.y(c2));
                n = 0;
            }
        }
        if (b2) {
            sb.append(this.N0());
        }
    }
    
    private final String P() {
        final int n = b.a[this.C0().ordinal()];
        String r;
        if (n != 1) {
            if (n != 2) {
                throw new kotlin.h0();
            }
            r = "&rarr;";
        }
        else {
            r = this.R("->");
        }
        return r;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.b0 P0(final a0 a0) {
        if (a0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            kotlin.reflect.jvm.internal.impl.descriptors.b0 b0;
            if (((kotlin.reflect.jvm.internal.impl.descriptors.e)a0).n() == kotlin.reflect.jvm.internal.impl.descriptors.f.H) {
                b0 = kotlin.reflect.jvm.internal.impl.descriptors.b0.K;
            }
            else {
                b0 = kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
            }
            return b0;
        }
        final m c = ((kotlin.reflect.jvm.internal.impl.descriptors.n)a0).c();
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
        }
        else {
            e = null;
        }
        if (e == null) {
            return kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
        }
        if (!(a0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            return kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.b b2 = (kotlin.reflect.jvm.internal.impl.descriptors.b)a0;
        final Collection g = b2.g();
        k0.o((Object)g, "this.overriddenDescriptors");
        if ((g.isEmpty() ^ true) && e.o() != kotlin.reflect.jvm.internal.impl.descriptors.b0.H) {
            return kotlin.reflect.jvm.internal.impl.descriptors.b0.J;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b0 b3;
        if (e.n() == kotlin.reflect.jvm.internal.impl.descriptors.f.H && !k0.g((Object)((a0)b2).getVisibility(), (Object)t.a)) {
            final kotlin.reflect.jvm.internal.impl.descriptors.b0 o = ((a0)b2).o();
            b3 = kotlin.reflect.jvm.internal.impl.descriptors.b0.K;
            if (o != b3) {
                b3 = kotlin.reflect.jvm.internal.impl.descriptors.b0.J;
            }
        }
        else {
            b3 = kotlin.reflect.jvm.internal.impl.descriptors.b0.H;
        }
        return b3;
    }
    
    private final void P1(final StringBuilder sb, final List<? extends b1> list) {
        final Iterator<? extends b1> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.O1((b1)iterator.next(), sb, false);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
    }
    
    private final boolean Q(final String str, final String s) {
        final boolean g = k0.g((Object)str, (Object)s.k2(s, "?", "", false, 4, null));
        boolean b = false;
        if (!g && (!s.J1(s, "?", false, 2, null) || !k0.g((Object)k0.C(str, (Object)"?"), (Object)s))) {
            final StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(str);
            sb.append(")?");
            if (!k0.g((Object)sb.toString(), (Object)s)) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    private final boolean Q0(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        return k0.g((Object)c.f(), (Object)StandardNames$FqNames.parameterName);
    }
    
    private final void Q1(final List<? extends b1> list, final StringBuilder sb, final boolean b) {
        if (this.M0()) {
            return;
        }
        if (list.isEmpty() ^ true) {
            sb.append(this.R0());
            this.P1(sb, list);
            sb.append(this.N0());
            if (b) {
                sb.append(" ");
            }
        }
    }
    
    private final String R(final String s) {
        return this.C0().b(s);
    }
    
    private final String R0() {
        return this.R("<");
    }
    
    private final void R1(final g1 g1, final StringBuilder sb, final boolean b) {
        if (b || !(g1 instanceof e1)) {
            String s;
            if (g1.n0()) {
                s = "var";
            }
            else {
                s = "val";
            }
            sb.append(this.m1(s));
            sb.append(" ");
        }
    }
    
    private final boolean S0(final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
        return b.g().isEmpty() ^ true;
    }
    
    static /* synthetic */ void S1(final d d, final g1 g1, final StringBuilder sb, boolean b, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        d.R1(g1, sb, b);
    }
    
    private final void T0(final StringBuilder sb, final kotlin.reflect.jvm.internal.impl.types.a a) {
        final kotlin.reflect.jvm.internal.impl.renderer.m c0 = this.C0();
        final kotlin.reflect.jvm.internal.impl.renderer.m h = kotlin.reflect.jvm.internal.impl.renderer.m.H;
        if (c0 == h) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        this.v1(sb, a.Z());
        sb.append(" */");
        if (this.C0() == h) {
            sb.append("</i></font>");
        }
    }
    
    private final void T1(final e1 e1, final boolean b, final StringBuilder sb, final boolean b2) {
        if (b2) {
            sb.append(this.m1("value-parameter"));
            sb.append(" ");
        }
        if (this.H0()) {
            sb.append("/*");
            sb.append(e1.i());
            sb.append("*/ ");
        }
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e1, null, 2, null);
        this.s1(sb, e1.f0(), "crossinline");
        this.s1(sb, e1.b0(), "noinline");
        final boolean w0 = this.w0();
        boolean b3 = true;
        boolean b5 = false;
        Label_0190: {
            if (w0) {
                final kotlin.reflect.jvm.internal.impl.descriptors.a c = e1.c();
                final boolean b4 = c instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
                final Object o = null;
                Object o2;
                if (b4) {
                    o2 = c;
                }
                else {
                    o2 = null;
                }
                Object value;
                if (o2 == null) {
                    value = o;
                }
                else {
                    value = ((kotlin.reflect.jvm.internal.impl.descriptors.l)o2).H();
                }
                if (k0.g(value, (Object)Boolean.TRUE)) {
                    b5 = true;
                    break Label_0190;
                }
            }
            b5 = false;
        }
        if (b5) {
            this.s1(sb, this.S(), "actual");
        }
        this.V1((g1)e1, b, sb, b2, b5);
        Label_0257: {
            if (this.Y() != null) {
                boolean b6;
                if (this.p()) {
                    b6 = e1.x0();
                }
                else {
                    b6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.a(e1);
                }
                if (b6) {
                    break Label_0257;
                }
            }
            b3 = false;
        }
        if (b3) {
            final n6.l<e1, String> y = this.Y();
            k0.m((Object)y);
            sb.append(k0.C(" = ", y.invoke((Object)e1)));
        }
    }
    
    private final void U0(final p0 p2, final StringBuilder sb) {
        this.o1((a0)p2, sb);
    }
    
    private final void U1(final Collection<? extends e1> collection, final boolean b, final StringBuilder sb) {
        final boolean a2 = this.a2(b);
        final int size = collection.size();
        this.G0().b(size, sb);
        final Iterator<? extends e1> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final e1 e1 = (e1)iterator.next();
            this.G0().a(e1, n, size, sb);
            this.T1(e1, a2, sb, false);
            this.G0().d(e1, n, size, sb);
            ++n;
        }
        this.G0().c(size, sb);
    }
    
    private final void V0(final y y, final StringBuilder sb) {
        final boolean operator = y.isOperator();
        final boolean b = false;
        boolean b3 = false;
        Label_0105: {
            if (operator) {
                final Collection g = y.g();
                k0.o((Object)g, "functionDescriptor.overriddenDescriptors");
                boolean b2 = false;
                Label_0086: {
                    if (!g.isEmpty()) {
                        final Iterator<y> iterator = (Iterator<y>)g.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().isOperator()) {
                                b2 = false;
                                break Label_0086;
                            }
                        }
                    }
                    b2 = true;
                }
                if (b2 || this.T()) {
                    b3 = true;
                    break Label_0105;
                }
            }
            b3 = false;
        }
        boolean b4 = b;
        Label_0209: {
            if (y.isInfix()) {
                final Collection g2 = y.g();
                k0.o((Object)g2, "functionDescriptor.overriddenDescriptors");
                boolean b5 = false;
                Label_0190: {
                    if (!g2.isEmpty()) {
                        final Iterator<y> iterator2 = (Iterator<y>)g2.iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().isInfix()) {
                                b5 = false;
                                break Label_0190;
                            }
                        }
                    }
                    b5 = true;
                }
                if (!b5) {
                    b4 = b;
                    if (!this.T()) {
                        break Label_0209;
                    }
                }
                b4 = true;
            }
        }
        this.s1(sb, y.T(), "tailrec");
        this.I1(y, sb);
        this.s1(sb, y.isInline(), "inline");
        this.s1(sb, b4, "infix");
        this.s1(sb, b3, "operator");
    }
    
    private final void V1(final g1 g1, final boolean b, final StringBuilder sb, final boolean b2, final boolean b3) {
        final c0 a = ((d1)g1).a();
        k0.o((Object)a, "variable.type");
        final boolean b4 = g1 instanceof e1;
        final c0 c0 = null;
        e1 e1;
        if (b4) {
            e1 = (e1)g1;
        }
        else {
            e1 = null;
        }
        c0 p5;
        if (e1 == null) {
            p5 = c0;
        }
        else {
            p5 = e1.p0();
        }
        c0 c2;
        if (p5 == null) {
            c2 = a;
        }
        else {
            c2 = p5;
        }
        this.s1(sb, p5 != null, "vararg");
        if (b3 || (b2 && !this.B0())) {
            this.R1(g1, sb, b3);
        }
        if (b) {
            this.t1((m)g1, sb, b2);
            sb.append(": ");
        }
        sb.append(this.y(c2));
        this.l1(g1, sb);
        if (this.H0() && p5 != null) {
            sb.append(" /*");
            sb.append(this.y(a));
            sb.append("*/");
        }
    }
    
    private final List<String> W0(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        final Map b = c.b();
        final boolean t0 = this.t0();
        final List<Object> list = null;
        kotlin.reflect.jvm.internal.impl.descriptors.e f;
        if (t0) {
            f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
        }
        else {
            f = null;
        }
        Iterable<e1> m = null;
        Label_0059: {
            if (f != null) {
                final kotlin.reflect.jvm.internal.impl.descriptors.d u = f.U();
                if (u != null) {
                    m = (Iterable<e1>)((kotlin.reflect.jvm.internal.impl.descriptors.a)u).m();
                    break Label_0059;
                }
            }
            m = null;
        }
        List<Object> e;
        if (m == null) {
            e = list;
        }
        else {
            final ArrayList<e1> list2 = new ArrayList<e1>();
            for (final e1 next : m) {
                if (next.x0()) {
                    list2.add(next);
                }
            }
            e = new ArrayList<Object>(v.Y((Iterable)list2, 10));
            final Iterator<Object> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                e.add(((f0)iterator2.next()).getName());
            }
        }
        if (e == null) {
            e = (List<Object>)v.E();
        }
        final ArrayList<kotlin.reflect.jvm.internal.impl.name.e> list3 = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>();
        for (final kotlin.reflect.jvm.internal.impl.name.e next2 : e) {
            final kotlin.reflect.jvm.internal.impl.name.e e2 = next2;
            k0.o((Object)e2, "it");
            if (b.containsKey(e2) ^ true) {
                list3.add(next2);
            }
        }
        final ArrayList list4 = new ArrayList<String>(v.Y((Iterable)list3, 10));
        final Iterator<Object> iterator4 = list3.iterator();
        while (iterator4.hasNext()) {
            list4.add(k0.C(iterator4.next().d(), (Object)" = ..."));
        }
        final Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, V>> entrySet = b.entrySet();
        final ArrayList list5 = new ArrayList<String>(v.Y((Iterable)entrySet, 10));
        for (final Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, V> entry : entrySet) {
            final kotlin.reflect.jvm.internal.impl.name.e e3 = entry.getKey();
            final kotlin.reflect.jvm.internal.impl.resolve.constants.g g = (kotlin.reflect.jvm.internal.impl.resolve.constants.g)entry.getValue();
            final StringBuilder sb = new StringBuilder();
            sb.append(e3.d());
            sb.append(" = ");
            String e4;
            if (!e.contains(e3)) {
                e4 = this.e1(g);
            }
            else {
                e4 = "...";
            }
            sb.append(e4);
            list5.add(sb.toString());
        }
        return (List<String>)v.d5((Iterable)v.q4((Collection)list4, (Iterable)list5));
    }
    
    private final boolean W1(final u u, final StringBuilder sb) {
        if (!this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.K)) {
            return false;
        }
        u f = u;
        if (this.i0()) {
            f = u.f();
        }
        if (!this.v0() && k0.g((Object)f, (Object)t.l)) {
            return false;
        }
        sb.append(this.m1(f.c()));
        sb.append(" ");
        return true;
    }
    
    private final void X0(final StringBuilder sb, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e e) {
        if (!this.h0().contains(e.N)) {
            return;
        }
        Set<kotlin.reflect.jvm.internal.impl.name.b> set;
        if (a instanceof c0) {
            set = this.o();
        }
        else {
            set = this.a0();
        }
        final n6.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> u = this.U();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c : a.getAnnotations()) {
            if (!v.J1((Iterable)set, (Object)c.f()) && !this.Q0(c) && (u == null || (boolean)u.invoke((Object)c))) {
                sb.append(this.t(c, e));
                if (this.Z()) {
                    sb.append('\n');
                    k0.o((Object)sb, "append('\\n')");
                }
                else {
                    sb.append(" ");
                }
            }
        }
    }
    
    private final void X1(final List<? extends b1> list, final StringBuilder sb) {
        if (this.M0()) {
            return;
        }
        final ArrayList<String> list2 = new ArrayList<String>(0);
        for (final b1 b1 : list) {
            final List upperBounds = b1.getUpperBounds();
            k0.o((Object)upperBounds, "typeParameter.upperBounds");
            for (final c0 c0 : v.P1((Iterable)upperBounds, 1)) {
                final StringBuilder sb2 = new StringBuilder();
                final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)b1).getName();
                k0.o((Object)name, "typeParameter.name");
                sb2.append(this.x(name, false));
                sb2.append(" : ");
                k0.o((Object)c0, "it");
                sb2.append(this.y(c0));
                list2.add(sb2.toString());
            }
        }
        if (list2.isEmpty() ^ true) {
            sb.append(" ");
            sb.append(this.m1("where"));
            sb.append(" ");
            v.X2((Iterable)list2, (Appendable)sb, (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)null, 124, (Object)null);
        }
    }
    
    static /* synthetic */ void Y0(final d d, final StringBuilder sb, final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e e, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            e = null;
        }
        d.X0(sb, a, e);
    }
    
    private final String Y1(String substring, String substring2, String c, final String s, final String s2) {
        if (s.u2(substring, substring2, false, 2, null) && s.u2(c, s, false, 2, null)) {
            final int length = substring2.length();
            Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
            substring = substring.substring(length);
            k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
            final int length2 = s.length();
            Objects.requireNonNull(c, "null cannot be cast to non-null type java.lang.String");
            substring2 = c.substring(length2);
            k0.o((Object)substring2, "(this as java.lang.String).substring(startIndex)");
            c = k0.C(s2, (Object)substring);
            if (k0.g((Object)substring, (Object)substring2)) {
                return c;
            }
            if (this.Q(substring, substring2)) {
                return k0.C(c, (Object)"!");
            }
        }
        return null;
    }
    
    private final void Z0(final i i, final StringBuilder sb) {
        final List c = i.C();
        k0.o((Object)c, "classifier.declaredTypeParameters");
        final List<b1> parameters = ((h)i).l().getParameters();
        k0.o((Object)parameters, "classifier.typeConstructor.parameters");
        if (this.H0() && i.u() && parameters.size() > c.size()) {
            sb.append(" /*captured type parameters: ");
            this.P1(sb, parameters.subList(c.size(), parameters.size()));
            sb.append("*/");
        }
    }
    
    private final boolean Z1(final c0 c0) {
        final boolean builtinFunctionalType = FunctionTypesKt.isBuiltinFunctionalType(c0);
        boolean b = false;
        if (builtinFunctionalType) {
            final List<y0> m0 = c0.M0();
            boolean b2 = false;
            Label_0077: {
                if (!(m0 instanceof Collection) || !m0.isEmpty()) {
                    final Iterator<Object> iterator = m0.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().d()) {
                            b2 = false;
                            break Label_0077;
                        }
                    }
                }
                b2 = true;
            }
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    private final void a1(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final StringBuilder sb) {
        final boolean b = e.n() == kotlin.reflect.jvm.internal.impl.descriptors.f.J;
        if (!this.B0()) {
            Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)e, null, 2, null);
            if (!b) {
                final u visibility = e.getVisibility();
                k0.o((Object)visibility, "klass.visibility");
                this.W1(visibility, sb);
            }
            if ((e.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.H || e.o() != kotlin.reflect.jvm.internal.impl.descriptors.b0.K) && (!e.n().b() || e.o() != kotlin.reflect.jvm.internal.impl.descriptors.b0.H)) {
                final kotlin.reflect.jvm.internal.impl.descriptors.b0 o = e.o();
                k0.o((Object)o, "klass.modality");
                this.q1(o, sb, this.P0((a0)e));
            }
            this.o1((a0)e, sb);
            this.s1(sb, this.h0().contains(e.O) && ((i)e).u(), "inner");
            this.s1(sb, this.h0().contains(e.Q) && e.D(), "data");
            this.s1(sb, this.h0().contains(e.R) && e.isInline(), "inline");
            this.s1(sb, this.h0().contains(e.X) && e.t(), "value");
            this.s1(sb, this.h0().contains(e.W) && e.q(), "fun");
            this.b1(e, sb);
        }
        if (!kotlin.reflect.jvm.internal.impl.resolve.d.x((m)e)) {
            if (!this.B0()) {
                this.G1(sb);
            }
            this.t1((m)e, sb, true);
        }
        else {
            this.d1((m)e, sb);
        }
        if (b) {
            return;
        }
        final List c = e.C();
        k0.o((Object)c, "klass.declaredTypeParameters");
        this.Q1(c, sb, false);
        this.Z0((i)e, sb);
        if (!e.n().b() && this.W()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.d u = e.U();
            if (u != null) {
                sb.append(" ");
                Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)u, null, 2, null);
                final u visibility2 = ((a0)u).getVisibility();
                k0.o((Object)visibility2, "primaryConstructor.visibility");
                this.W1(visibility2, sb);
                sb.append(this.m1("constructor"));
                final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)u).m();
                k0.o((Object)m, "primaryConstructor.valueParameters");
                this.U1(m, ((kotlin.reflect.jvm.internal.impl.descriptors.a)u).K(), sb);
            }
        }
        this.H1(e, sb);
        this.X1(c, sb);
    }
    
    private final boolean a2(final boolean b) {
        final int n = d.b.b[this.l0().ordinal()];
        boolean b2 = false;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return b2;
                }
                throw new kotlin.h0();
            }
            else if (b) {
                return b2;
            }
        }
        b2 = true;
        return b2;
    }
    
    private final d b0() {
        return (d)this.m.getValue();
    }
    
    private final void b1(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final StringBuilder sb) {
        sb.append(this.m1(kotlin.reflect.jvm.internal.impl.renderer.c.a.a((i)e)));
    }
    
    private final void d1(final m m, final StringBuilder sb) {
        if (this.q0()) {
            if (this.B0()) {
                sb.append("companion object");
            }
            this.G1(sb);
            final m c = m.c();
            if (c != null) {
                sb.append("of ");
                final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)c).getName();
                k0.o((Object)name, "containingDeclaration.name");
                sb.append(this.x(name, false));
            }
        }
        if (this.H0() || !k0.g((Object)((f0)m).getName(), (Object)kotlin.reflect.jvm.internal.impl.name.g.c)) {
            if (!this.B0()) {
                this.G1(sb);
            }
            final kotlin.reflect.jvm.internal.impl.name.e name2 = ((f0)m).getName();
            k0.o((Object)name2, "descriptor.name");
            sb.append(this.x(name2, true));
        }
    }
    
    private final String e1(final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g) {
        String s;
        if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            s = v.Z2((Iterable)((kotlin.reflect.jvm.internal.impl.resolve.constants.g<Iterable>)g).b(), (CharSequence)", ", (CharSequence)"{", (CharSequence)"}", 0, (CharSequence)null, (n6.l)new n6.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>, CharSequence>() {
                @e
                public final CharSequence a(@e final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g) {
                    k0.p((Object)g, "it");
                    return d.this.e1(g);
                }
            }, 24, (Object)null);
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            s = kotlin.text.s.c4(kotlin.reflect.jvm.internal.impl.renderer.c.u(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.a)g).b(), null, 2, null), "@");
        }
        else if (g instanceof q) {
            final q.b b = ((q)g).b();
            if (b instanceof q.b.a) {
                final StringBuilder sb = new StringBuilder();
                sb.append(((q.b.a)b).a());
                sb.append("::class");
                s = sb.toString();
            }
            else {
                if (!(b instanceof q.b.b)) {
                    throw new kotlin.h0();
                }
                final q.b.b b2 = (q.b.b)b;
                String str = b2.b().b().b();
                k0.o((Object)str, "classValue.classId.asSingleFqName().asString()");
                for (int a = b2.a(), i = 0; i < a; ++i) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("kotlin.Array<");
                    sb2.append(str);
                    sb2.append('>');
                    str = sb2.toString();
                }
                s = k0.C(str, (Object)"::class");
            }
        }
        else {
            s = g.toString();
        }
        return s;
    }
    
    private final void f1(final kotlin.reflect.jvm.internal.impl.descriptors.l l, final StringBuilder sb) {
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)l, null, 2, null);
        boolean b = false;
        Label_0068: {
            if (this.l.U() || l.I().o() != kotlin.reflect.jvm.internal.impl.descriptors.b0.I) {
                final u visibility = ((a0)l).getVisibility();
                k0.o((Object)visibility, "constructor.visibility");
                if (this.W1(visibility, sb)) {
                    b = true;
                    break Label_0068;
                }
            }
            b = false;
        }
        this.n1((kotlin.reflect.jvm.internal.impl.descriptors.b)l, sb);
        final boolean b2 = this.s0() || !l.H() || b;
        if (b2) {
            sb.append(this.m1("constructor"));
        }
        final i c = l.c();
        k0.o((Object)c, "constructor.containingDeclaration");
        if (this.z0()) {
            if (b2) {
                sb.append(" ");
            }
            this.t1((m)c, sb, true);
            final List typeParameters = l.getTypeParameters();
            k0.o((Object)typeParameters, "constructor.typeParameters");
            this.Q1(typeParameters, sb, false);
        }
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)l).m();
        k0.o((Object)m, "constructor.valueParameters");
        this.U1(m, ((kotlin.reflect.jvm.internal.impl.descriptors.a)l).K(), sb);
        if (this.r0() && !l.H() && c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            final kotlin.reflect.jvm.internal.impl.descriptors.d u = ((kotlin.reflect.jvm.internal.impl.descriptors.e)c).U();
            if (u != null) {
                final List i = ((kotlin.reflect.jvm.internal.impl.descriptors.a)u).m();
                k0.o((Object)i, "primaryConstructor.valueParameters");
                final ArrayList<e1> list = new ArrayList<e1>();
                for (final e1 next : i) {
                    final e1 e1 = next;
                    if (!e1.x0() && e1.p0() == null) {
                        list.add(next);
                    }
                }
                if (list.isEmpty() ^ true) {
                    sb.append(" : ");
                    sb.append(this.m1("this"));
                    sb.append(v.Z2((Iterable)list, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, (CharSequence)null, (n6.l)d$f.G, 24, (Object)null));
                }
            }
        }
        if (this.z0()) {
            final List typeParameters2 = l.getTypeParameters();
            k0.o((Object)typeParameters2, "constructor.typeParameters");
            this.X1(typeParameters2, sb);
        }
    }
    
    private final void g1(final StringBuilder sb, final c0 c0) {
        Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0, null, 2, null);
        if (e0.a(c0)) {
            String str;
            if (c0 instanceof i1 && this.n0()) {
                str = ((i1)c0).W0();
            }
            else if (c0 instanceof kotlin.reflect.jvm.internal.impl.types.t && !this.g0()) {
                str = ((kotlin.reflect.jvm.internal.impl.types.t)c0).W0();
            }
            else {
                str = c0.N0().toString();
            }
            sb.append(str);
            sb.append(this.K1(c0.M0()));
        }
        else {
            N1(this, sb, c0, null, 2, null);
        }
        if (c0.O0()) {
            sb.append("?");
        }
        if (n0.c(c0)) {
            sb.append("!!");
        }
    }
    
    private final String h1(final String str) {
        final int n = b.a[this.C0().ordinal()];
        String string = str;
        if (n != 1) {
            if (n != 2) {
                throw new kotlin.h0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("<font color=red><b>");
            sb.append(str);
            sb.append("</b></font>");
            string = sb.toString();
        }
        return string;
    }
    
    private final String i1(final List<kotlin.reflect.jvm.internal.impl.name.e> list) {
        return this.R(n.c(list));
    }
    
    private final void j1(final y y, final StringBuilder sb) {
        if (!this.B0()) {
            if (!this.A0()) {
                Y0(this, sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)y, null, 2, null);
                final u visibility = ((a0)y).getVisibility();
                k0.o((Object)visibility, "function.visibility");
                this.W1(visibility, sb);
                this.r1((kotlin.reflect.jvm.internal.impl.descriptors.b)y, sb);
                if (this.c0()) {
                    this.o1((a0)y, sb);
                }
                this.w1((kotlin.reflect.jvm.internal.impl.descriptors.b)y, sb);
                if (this.c0()) {
                    this.V0(y, sb);
                }
                else {
                    this.I1(y, sb);
                }
                this.n1((kotlin.reflect.jvm.internal.impl.descriptors.b)y, sb);
                if (this.H0()) {
                    if (y.z0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (y.D0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(this.m1("fun"));
            sb.append(" ");
            final List typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).getTypeParameters();
            k0.o((Object)typeParameters, "function.typeParameters");
            this.Q1(typeParameters, sb, true);
            this.D1((kotlin.reflect.jvm.internal.impl.descriptors.a)y, sb);
        }
        this.t1((m)y, sb, true);
        final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m();
        k0.o((Object)m, "function.valueParameters");
        this.U1(m, ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).K(), sb);
        this.E1((kotlin.reflect.jvm.internal.impl.descriptors.a)y, sb);
        final c0 returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).getReturnType();
        if (!this.K0() && (this.F0() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            String y2;
            if (returnType == null) {
                y2 = "[NULL]";
            }
            else {
                y2 = this.y(returnType);
            }
            sb.append(y2);
        }
        final List typeParameters2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).getTypeParameters();
        k0.o((Object)typeParameters2, "function.typeParameters");
        this.X1(typeParameters2, sb);
    }
    
    private final void k1(final StringBuilder sb, final c0 c0) {
        final int length = sb.length();
        Y0(this.b0(), sb, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0, null, 2, null);
        final int length2 = sb.length();
        final int n = 1;
        final boolean b = length2 != length;
        final boolean suspendFunctionType = FunctionTypesKt.isSuspendFunctionType(c0);
        final boolean o0 = c0.O0();
        final c0 receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(c0);
        final boolean b2 = o0 || (b && receiverTypeFromFunctionType != null);
        if (b2) {
            if (suspendFunctionType) {
                sb.insert(length, '(');
            }
            else {
                if (b) {
                    s.k7(sb);
                    if (sb.charAt(s.i3(sb) - 1) != ')') {
                        sb.insert(s.i3(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        this.s1(sb, suspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            int n2 = 0;
            Label_0207: {
                if (this.Z1(receiverTypeFromFunctionType)) {
                    n2 = n;
                    if (!receiverTypeFromFunctionType.O0()) {
                        break Label_0207;
                    }
                }
                if (this.O0(receiverTypeFromFunctionType)) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                sb.append("(");
            }
            this.u1(sb, receiverTypeFromFunctionType);
            if (n2 != 0) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        final Iterator<y0> iterator = (Iterator<y0>)FunctionTypesKt.getValueParameterTypesFromFunctionType(c0).iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            final y0 y0 = iterator.next();
            if (n3 > 0) {
                sb.append(", ");
            }
            kotlin.reflect.jvm.internal.impl.name.e parameterNameFromFunctionTypeArgument;
            if (this.m0()) {
                final c0 a = y0.a();
                k0.o((Object)a, "typeProjection.type");
                parameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(a);
            }
            else {
                parameterNameFromFunctionTypeArgument = null;
            }
            if (parameterNameFromFunctionTypeArgument != null) {
                sb.append(this.x(parameterNameFromFunctionTypeArgument, false));
                sb.append(": ");
            }
            sb.append(this.z(y0));
            ++n3;
        }
        sb.append(") ");
        sb.append(this.P());
        sb.append(" ");
        this.u1(sb, FunctionTypesKt.getReturnTypeFromFunctionType(c0));
        if (b2) {
            sb.append(")");
        }
        if (o0) {
            sb.append("?");
        }
    }
    
    private final void l1(final g1 g1, final StringBuilder sb) {
        if (this.f0()) {
            final kotlin.reflect.jvm.internal.impl.resolve.constants.g a0 = g1.a0();
            if (a0 != null) {
                sb.append(" = ");
                sb.append(this.R(this.e1(a0)));
            }
        }
    }
    
    private final String m1(final String str) {
        final int n = b.a[this.C0().ordinal()];
        String string = str;
        if (n != 1) {
            if (n != 2) {
                throw new kotlin.h0();
            }
            if (this.V()) {
                string = str;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("<b>");
                sb.append(str);
                sb.append("</b>");
                string = sb.toString();
            }
        }
        return string;
    }
    
    private final void n1(final kotlin.reflect.jvm.internal.impl.descriptors.b b, final StringBuilder sb) {
        if (!this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.P)) {
            return;
        }
        if (this.H0() && b.n() != b$a.G) {
            sb.append("/*");
            final String name = ((Enum)b.n()).name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            final String lowerCase = name.toLowerCase();
            k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("*/ ");
        }
    }
    
    private final void o1(final a0 a0, final StringBuilder sb) {
        this.s1(sb, a0.isExternal(), "external");
        final boolean contains = this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.S);
        final boolean b = true;
        this.s1(sb, contains && a0.Q(), "expect");
        this.s1(sb, this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.T) && a0.F0() && b, "actual");
    }
    
    private final void q1(final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, final StringBuilder sb, final kotlin.reflect.jvm.internal.impl.descriptors.b0 b2) {
        if (!this.u0() && b0 == b2) {
            return;
        }
        final boolean contains = this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.L);
        final String name = ((Enum)b0).name();
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase = name.toLowerCase();
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
        this.s1(sb, contains, lowerCase);
    }
    
    private final void r1(final kotlin.reflect.jvm.internal.impl.descriptors.b b, final StringBuilder sb) {
        if (!kotlin.reflect.jvm.internal.impl.resolve.d.J((m)b) || ((a0)b).o() != kotlin.reflect.jvm.internal.impl.descriptors.b0.H) {
            if (this.k0() == kotlin.reflect.jvm.internal.impl.renderer.j.G && ((a0)b).o() == kotlin.reflect.jvm.internal.impl.descriptors.b0.J && this.S0(b)) {
                return;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.b0 o = ((a0)b).o();
            k0.o((Object)o, "callable.modality");
            this.q1(o, sb, this.P0((a0)b));
        }
    }
    
    private final void s1(final StringBuilder sb, final boolean b, final String s) {
        if (b) {
            sb.append(this.m1(s));
            sb.append(" ");
        }
    }
    
    private final void t1(final m m, final StringBuilder sb, final boolean b) {
        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)m).getName();
        k0.o((Object)name, "descriptor.name");
        sb.append(this.x(name, b));
    }
    
    private final void u1(final StringBuilder sb, final c0 c0) {
        final j1 q0 = c0.Q0();
        kotlin.reflect.jvm.internal.impl.types.a a;
        if (q0 instanceof kotlin.reflect.jvm.internal.impl.types.a) {
            a = (kotlin.reflect.jvm.internal.impl.types.a)q0;
        }
        else {
            a = null;
        }
        if (a != null) {
            if (this.x0()) {
                this.v1(sb, a.Z());
            }
            else {
                this.v1(sb, a.Z0());
                if (this.y0()) {
                    this.T0(sb, a);
                }
            }
            return;
        }
        this.v1(sb, c0);
    }
    
    private final void v1(final StringBuilder sb, final c0 c0) {
        if (c0 instanceof l1 && this.p() && !((l1)c0).S0()) {
            sb.append("<Not computed yet>");
            return;
        }
        final j1 q0 = c0.Q0();
        if (q0 instanceof kotlin.reflect.jvm.internal.impl.types.w) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.w)q0).X0(this, this));
        }
        else if (q0 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
            this.F1(sb, (kotlin.reflect.jvm.internal.impl.types.k0)q0);
        }
    }
    
    private final void w1(final kotlin.reflect.jvm.internal.impl.descriptors.b b, final StringBuilder sb) {
        if (!this.h0().contains(kotlin.reflect.jvm.internal.impl.renderer.e.M)) {
            return;
        }
        if (this.S0(b) && this.k0() != kotlin.reflect.jvm.internal.impl.renderer.j.H) {
            this.s1(sb, true, "override");
            if (this.H0()) {
                sb.append("/*");
                sb.append(b.g().size());
                sb.append("*/ ");
            }
        }
    }
    
    private final void x1(final h0 h0, final StringBuilder sb) {
        this.y1(h0.f(), "package-fragment", sb);
        if (this.p()) {
            sb.append(" in ");
            this.t1((m)h0.c(), sb, false);
        }
    }
    
    private final void y1(final kotlin.reflect.jvm.internal.impl.name.b b, final String s, final StringBuilder sb) {
        sb.append(this.m1(s));
        final kotlin.reflect.jvm.internal.impl.name.c j = b.j();
        k0.o((Object)j, "fqName.toUnsafe()");
        final String w = this.w(j);
        if (w.length() > 0) {
            sb.append(" ");
            sb.append(w);
        }
    }
    
    private final void z1(final kotlin.reflect.jvm.internal.impl.descriptors.m0 m0, final StringBuilder sb) {
        this.y1(m0.f(), "package", sb);
        if (this.p()) {
            sb.append(" in context of ");
            this.t1((m)m0.y0(), sb, false);
        }
    }
    
    public boolean A0() {
        return this.l.Z();
    }
    
    public boolean B0() {
        return this.l.a0();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.renderer.m C0() {
        return this.l.b0();
    }
    
    @e
    public n6.l<c0, c0> D0() {
        return this.l.c0();
    }
    
    public boolean E0() {
        return this.l.d0();
    }
    
    public boolean F0() {
        return this.l.e0();
    }
    
    @e
    public l G0() {
        return this.l.f0();
    }
    
    public boolean H0() {
        return this.l.g0();
    }
    
    public boolean I0() {
        return this.l.h0();
    }
    
    public boolean J0() {
        return this.l.i0();
    }
    
    public boolean K0() {
        return this.l.j0();
    }
    
    @e
    public String K1(@e final List<? extends y0> list) {
        k0.p((Object)list, "typeArguments");
        String string;
        if (list.isEmpty()) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.R0());
            this.O(sb, list);
            sb.append(this.N0());
            string = sb.toString();
            k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        }
        return string;
    }
    
    public boolean L0() {
        return this.l.k0();
    }
    
    @e
    public String L1(@e final w0 w0) {
        k0.p((Object)w0, "typeConstructor");
        final h c = w0.c();
        final boolean b = c instanceof b1;
        final int n = 1;
        int n2;
        if (b || c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            n2 = n;
        }
        else {
            n2 = ((c instanceof a1) ? 1 : 0);
        }
        String s;
        if (n2 != 0) {
            s = this.c1(c);
        }
        else {
            if (c != null) {
                throw new IllegalStateException(k0.C("Unexpected classifier: ", (Object)c.getClass()).toString());
            }
            s = w0.toString();
        }
        return s;
    }
    
    public boolean M0() {
        return this.l.l0();
    }
    
    public boolean S() {
        return this.l.t();
    }
    
    public boolean T() {
        return this.l.u();
    }
    
    @org.jetbrains.annotations.f
    public n6.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> U() {
        return this.l.v();
    }
    
    public boolean V() {
        return this.l.w();
    }
    
    public boolean W() {
        return this.l.x();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.renderer.b X() {
        return this.l.y();
    }
    
    @org.jetbrains.annotations.f
    public n6.l<e1, String> Y() {
        return this.l.z();
    }
    
    public boolean Z() {
        return this.l.A();
    }
    
    @Override
    public void a(@e final Set<kotlin.reflect.jvm.internal.impl.name.b> set) {
        k0.p((Object)set, "<set-?>");
        this.l.a(set);
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.name.b> a0() {
        return this.l.B();
    }
    
    @Override
    public void b(final boolean b) {
        this.l.b(b);
    }
    
    @Override
    public void c(@e final Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> set) {
        k0.p((Object)set, "<set-?>");
        this.l.c(set);
    }
    
    public boolean c0() {
        return this.l.C();
    }
    
    @e
    public String c1(@e final h h) {
        k0.p((Object)h, "klass");
        String s;
        if (kotlin.reflect.jvm.internal.impl.types.u.r((m)h)) {
            s = h.l().toString();
        }
        else {
            s = this.X().a(h, this);
        }
        return s;
    }
    
    @Override
    public void d(@e final kotlin.reflect.jvm.internal.impl.renderer.k k) {
        k0.p((Object)k, "<set-?>");
        this.l.d(k);
    }
    
    public boolean d0() {
        return this.l.D();
    }
    
    @Override
    public void e(final boolean b) {
        this.l.e(b);
    }
    
    public boolean e0() {
        return this.l.E();
    }
    
    @Override
    public void f(final boolean b) {
        this.l.f(b);
    }
    
    public boolean f0() {
        return this.l.F();
    }
    
    @Override
    public boolean g() {
        return this.l.g();
    }
    
    public boolean g0() {
        return this.l.G();
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.renderer.b b) {
        k0.p((Object)b, "<set-?>");
        this.l.h(b);
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.renderer.e> h0() {
        return this.l.H();
    }
    
    @Override
    public void i(final boolean b) {
        this.l.i(b);
    }
    
    public boolean i0() {
        return this.l.I();
    }
    
    @Override
    public void j(final boolean b) {
        this.l.j(b);
    }
    
    @e
    public final g j0() {
        return this.l;
    }
    
    @Override
    public void k(final boolean b) {
        this.l.k(b);
    }
    
    @e
    public j k0() {
        return this.l.J();
    }
    
    @Override
    public void l(final boolean b) {
        this.l.l(b);
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.renderer.k l0() {
        return this.l.K();
    }
    
    @Override
    public void m(@e final kotlin.reflect.jvm.internal.impl.renderer.m m) {
        k0.p((Object)m, "<set-?>");
        this.l.m(m);
    }
    
    public boolean m0() {
        return this.l.L();
    }
    
    @Override
    public void n(@e final kotlin.reflect.jvm.internal.impl.renderer.a a) {
        k0.p((Object)a, "<set-?>");
        this.l.n(a);
    }
    
    public boolean n0() {
        return this.l.M();
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.b> o() {
        return this.l.o();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.renderer.l o0() {
        return this.l.N();
    }
    
    @Override
    public boolean p() {
        return this.l.p();
    }
    
    public boolean p0() {
        return this.l.O();
    }
    
    @e
    public String p1(@e final String str) {
        k0.p((Object)str, "message");
        final int n = b.a[this.C0().ordinal()];
        String string = str;
        if (n != 1) {
            if (n != 2) {
                throw new kotlin.h0();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("<i>");
            sb.append(str);
            sb.append("</i>");
            string = sb.toString();
        }
        return string;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.renderer.a q() {
        return this.l.q();
    }
    
    public boolean q0() {
        return this.l.P();
    }
    
    @Override
    public void r(final boolean b) {
        this.l.r(b);
    }
    
    public boolean r0() {
        return this.l.Q();
    }
    
    @e
    @Override
    public String s(@e final m m) {
        k0.p((Object)m, "declarationDescriptor");
        final StringBuilder sb = new StringBuilder();
        m.P((o)new a(), (Object)sb);
        if (this.I0()) {
            this.N(sb, m);
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public boolean s0() {
        return this.l.R();
    }
    
    @e
    @Override
    public String t(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e e) {
        k0.p((Object)c, "annotation");
        final StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (e != null) {
            sb.append(k0.C(e.b(), (Object)":"));
        }
        final c0 a = c.a();
        sb.append(this.y(a));
        if (this.d0()) {
            final List<String> w0 = this.W0(c);
            if (this.e0() || (w0.isEmpty() ^ true)) {
                v.X2((Iterable)w0, (Appendable)sb, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, (CharSequence)null, (n6.l)null, 112, (Object)null);
            }
        }
        if (this.H0() && (e0.a(a) || a.N0().c() instanceof g0$b)) {
            sb.append(" /* annotation class not found */");
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public boolean t0() {
        return this.l.S();
    }
    
    public boolean u0() {
        return this.l.T();
    }
    
    @e
    @Override
    public String v(@e final String s, @e final String str, @e final KotlinBuiltIns kotlinBuiltIns) {
        k0.p((Object)s, "lowerRendered");
        k0.p((Object)str, "upperRendered");
        k0.p((Object)kotlinBuiltIns, "builtIns");
        if (this.Q(s, str)) {
            if (s.u2(str, "(", false, 2, null)) {
                final StringBuilder sb = new StringBuilder();
                sb.append('(');
                sb.append(s);
                sb.append(")!");
                return sb.toString();
            }
            return k0.C(s, (Object)"!");
        }
        else {
            final kotlin.reflect.jvm.internal.impl.renderer.b x = this.X();
            final kotlin.reflect.jvm.internal.impl.descriptors.e collection = kotlinBuiltIns.getCollection();
            k0.o((Object)collection, "builtIns.collection");
            final String u5 = s.u5(x.a((h)collection, this), "Collection", null, 2, null);
            final String c = k0.C(u5, (Object)"Mutable");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(u5);
            sb2.append('(');
            sb2.append("Mutable");
            sb2.append(')');
            final String y1 = this.Y1(s, c, str, u5, sb2.toString());
            if (y1 != null) {
                return y1;
            }
            final String y2 = this.Y1(s, k0.C(u5, (Object)"MutableMap.MutableEntry"), str, k0.C(u5, (Object)"Map.Entry"), k0.C(u5, (Object)"(Mutable)Map.(Mutable)Entry"));
            if (y2 != null) {
                return y2;
            }
            final kotlin.reflect.jvm.internal.impl.renderer.b x2 = this.X();
            final kotlin.reflect.jvm.internal.impl.descriptors.e array = kotlinBuiltIns.getArray();
            k0.o((Object)array, "builtIns.array");
            final String u6 = s.u5(x2.a((h)array, this), "Array", null, 2, null);
            final String y3 = this.Y1(s, k0.C(u6, (Object)this.R("Array<")), str, k0.C(u6, (Object)this.R("Array<out ")), k0.C(u6, (Object)this.R("Array<(out) ")));
            if (y3 != null) {
                return y3;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append('(');
            sb3.append(s);
            sb3.append("..");
            sb3.append(str);
            sb3.append(')');
            return sb3.toString();
        }
    }
    
    public boolean v0() {
        return this.l.U();
    }
    
    @e
    @Override
    public String w(@e final kotlin.reflect.jvm.internal.impl.name.c c) {
        k0.p((Object)c, "fqName");
        final List<kotlin.reflect.jvm.internal.impl.name.e> h = c.h();
        k0.o((Object)h, "fqName.pathSegments()");
        return this.i1(h);
    }
    
    public boolean w0() {
        return this.l.V();
    }
    
    @e
    @Override
    public String x(@e final kotlin.reflect.jvm.internal.impl.name.e e, final boolean b) {
        k0.p((Object)e, "name");
        String s;
        final String str = s = this.R(n.b(e));
        if (this.V()) {
            s = str;
            if (this.C0() == kotlin.reflect.jvm.internal.impl.renderer.m.H) {
                s = str;
                if (b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("<b>");
                    sb.append(str);
                    sb.append("</b>");
                    s = sb.toString();
                }
            }
        }
        return s;
    }
    
    public boolean x0() {
        return this.l.W();
    }
    
    @e
    @Override
    public String y(@e final c0 c0) {
        k0.p((Object)c0, "type");
        final StringBuilder sb = new StringBuilder();
        this.u1(sb, (c0)this.D0().invoke((Object)c0));
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public boolean y0() {
        return this.l.X();
    }
    
    @e
    @Override
    public String z(@e final y0 y0) {
        k0.p((Object)y0, "typeProjection");
        final StringBuilder sb = new StringBuilder();
        this.O(sb, v.k((Object)y0));
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public boolean z0() {
        return this.l.Y();
    }
    
    private final class a implements o<j2, StringBuilder>
    {
        public a() {
            k0.p((Object)d.this, "this$0");
        }
        
        private final void t(final p0 p3, final StringBuilder sb, final String s) {
            final int n = d.a.a.a[d.this.o0().ordinal()];
            if (n != 1) {
                if (n == 2) {
                    this.p((y)p3, sb);
                }
            }
            else {
                d.this.U0(p3, sb);
                sb.append(k0.C(s, (Object)" for "));
                final d a = d.this;
                final q0 c0 = p3.C0();
                k0.o((Object)c0, "descriptor.correspondingProperty");
                a.B1(c0, sb);
            }
        }
        
        public void A(@e final e1 e1, @e final StringBuilder sb) {
            k0.p((Object)e1, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.T1(e1, true, sb, true);
        }
        
        public void n(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final StringBuilder sb) {
            k0.p((Object)e, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.a1(e, sb);
        }
        
        public void o(@e final kotlin.reflect.jvm.internal.impl.descriptors.l l, @e final StringBuilder sb) {
            k0.p((Object)l, "constructorDescriptor");
            k0.p((Object)sb, "builder");
            d.this.f1(l, sb);
        }
        
        public void p(@e final y y, @e final StringBuilder sb) {
            k0.p((Object)y, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.j1(y, sb);
        }
        
        public void q(@e final kotlin.reflect.jvm.internal.impl.descriptors.e0 e0, @e final StringBuilder sb) {
            k0.p((Object)e0, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.t1((m)e0, sb, true);
        }
        
        public void r(@e final h0 h0, @e final StringBuilder sb) {
            k0.p((Object)h0, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.x1(h0, sb);
        }
        
        public void s(@e final kotlin.reflect.jvm.internal.impl.descriptors.m0 m0, @e final StringBuilder sb) {
            k0.p((Object)m0, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.z1(m0, sb);
        }
        
        public void u(@e final q0 q0, @e final StringBuilder sb) {
            k0.p((Object)q0, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.B1(q0, sb);
        }
        
        public void v(@e final r0 r0, @e final StringBuilder sb) {
            k0.p((Object)r0, "descriptor");
            k0.p((Object)sb, "builder");
            this.t((p0)r0, sb, "getter");
        }
        
        public void w(@e final s0 s0, @e final StringBuilder sb) {
            k0.p((Object)s0, "descriptor");
            k0.p((Object)sb, "builder");
            this.t((p0)s0, sb, "setter");
        }
        
        public void x(@e final t0 t0, @e final StringBuilder sb) {
            k0.p((Object)t0, "descriptor");
            k0.p((Object)sb, "builder");
            sb.append(((f0)t0).getName());
        }
        
        public void y(@e final a1 a1, @e final StringBuilder sb) {
            k0.p((Object)a1, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.J1(a1, sb);
        }
        
        public void z(@e final b1 b1, @e final StringBuilder sb) {
            k0.p((Object)b1, "descriptor");
            k0.p((Object)sb, "builder");
            d.this.O1(b1, sb, true);
        }
    }
}
