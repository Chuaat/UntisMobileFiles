// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.utils.j;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

public class b0 extends m0 implements q0
{
    private final kotlin.reflect.jvm.internal.impl.descriptors.b0 P;
    private u Q;
    private Collection<? extends q0> R;
    private final q0 S;
    private final kotlin.reflect.jvm.internal.impl.descriptors.b.a T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    private final boolean Y;
    private final boolean Z;
    private t0 a0;
    private t0 b0;
    private List<b1> c0;
    private c0 d0;
    private s0 e0;
    private boolean f0;
    private w g0;
    private w h0;
    
    protected b0(@e final m m, @f final q0 q0, @e final g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 p15, @e final u q2, final boolean b, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.b.a t, @e final w0 w0, final boolean u, final boolean v, final boolean w2, final boolean x, final boolean y, final boolean z) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (p15 == null) {
            L(2);
        }
        if (q2 == null) {
            L(3);
        }
        if (e == null) {
            L(4);
        }
        if (t == null) {
            L(5);
        }
        if (w0 == null) {
            L(6);
        }
        super(m, g, e, null, b, w0);
        this.R = null;
        this.P = p15;
        this.Q = q2;
        q0 s;
        if (q0 == null) {
            s = this;
        }
        else {
            s = q0;
        }
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w2;
        this.X = x;
        this.Y = y;
        this.Z = z;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        Label_0073: {
            if (n != 23 && n != 33 && n != 34 && n != 36 && n != 37) {
                switch (n) {
                    default: {
                        format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break Label_0073;
                    }
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21: {
                        break;
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0147: {
            if (n != 23 && n != 33 && n != 34 && n != 36 && n != 37) {
                switch (n) {
                    default: {
                        n2 = 3;
                        break Label_0147;
                    }
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21: {
                        break;
                    }
                }
            }
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 35: {
                args[0] = "overriddenDescriptors";
                break;
            }
            case 31: {
                args[0] = "newName";
                break;
            }
            case 29: {
                args[0] = "newVisibility";
                break;
            }
            case 28: {
                args[0] = "newModality";
                break;
            }
            case 27: {
                args[0] = "newOwner";
                break;
            }
            case 26: {
                args[0] = "accessorDescriptor";
                break;
            }
            case 25: {
                args[0] = "substitutor";
                break;
            }
            case 24: {
                args[0] = "copyConfiguration";
                break;
            }
            case 22: {
                args[0] = "originalSubstitutor";
                break;
            }
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 33:
            case 34:
            case 36:
            case 37: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            }
            case 15: {
                args[0] = "typeParameters";
                break;
            }
            case 14: {
                args[0] = "outType";
                break;
            }
            case 6:
            case 13:
            case 32: {
                args[0] = "source";
                break;
            }
            case 5:
            case 12:
            case 30: {
                args[0] = "kind";
                break;
            }
            case 4:
            case 11: {
                args[0] = "name";
                break;
            }
            case 3:
            case 10:
            case 16: {
                args[0] = "visibility";
                break;
            }
            case 2:
            case 9: {
                args[0] = "modality";
                break;
            }
            case 1:
            case 8: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 23) {
            if (n != 33) {
                if (n != 34) {
                    if (n != 36) {
                        if (n != 37) {
                            switch (n) {
                                default: {
                                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                    break;
                                }
                                case 21: {
                                    args[1] = "getAccessors";
                                    break;
                                }
                                case 20: {
                                    args[1] = "getVisibility";
                                    break;
                                }
                                case 19: {
                                    args[1] = "getModality";
                                    break;
                                }
                                case 18: {
                                    args[1] = "getReturnType";
                                    break;
                                }
                                case 17: {
                                    args[1] = "getTypeParameters";
                                    break;
                                }
                            }
                        }
                        else {
                            args[1] = "copy";
                        }
                    }
                    else {
                        args[1] = "getOverriddenDescriptors";
                    }
                }
                else {
                    args[1] = "getKind";
                }
            }
            else {
                args[1] = "getOriginal";
            }
        }
        else {
            args[1] = "getSourceToUseForCopy";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 23:
                case 33:
                case 34:
                case 36:
                case 37: {
                    final String format2 = String.format(format, args);
                    if (n != 23 && n != 33 && n != 34 && n != 36 && n != 37) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException(format2);
                            }
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21: {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 35: {
                    args[2] = "setOverriddenDescriptors";
                    continue;
                }
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 25:
                case 26: {
                    args[2] = "getSubstitutedInitialSignatureDescriptor";
                    continue;
                }
                case 24: {
                    args[2] = "doSubstitute";
                    continue;
                }
                case 22: {
                    args[2] = "substitute";
                    continue;
                }
                case 16: {
                    args[2] = "setVisibility";
                    continue;
                }
                case 14:
                case 15: {
                    args[2] = "setType";
                    continue;
                }
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13: {
                    args[2] = "create";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static b0 P0(@e final m m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, final boolean b2, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, @e final w0 w0, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7, final boolean b8) {
        if (m == null) {
            L(7);
        }
        if (g == null) {
            L(8);
        }
        if (b0 == null) {
            L(9);
        }
        if (u == null) {
            L(10);
        }
        if (e == null) {
            L(11);
        }
        if (a == null) {
            L(12);
        }
        if (w0 == null) {
            L(13);
        }
        return new b0(m, null, g, b0, u, b2, e, a, w0, b3, b4, b5, b6, b7, b8);
    }
    
    @e
    private w0 T0(final boolean b, @f q0 b2) {
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
            L(23);
        }
        return w0;
    }
    
    private static y U0(@e final kotlin.reflect.jvm.internal.impl.types.d1 d1, @e final p0 p2) {
        if (d1 == null) {
            L(25);
        }
        if (p2 == null) {
            L(26);
        }
        y d2;
        if (p2.h0() != null) {
            d2 = p2.h0().d(d1);
        }
        else {
            d2 = null;
        }
        return d2;
    }
    
    private static u Z0(final u u, final kotlin.reflect.jvm.internal.impl.descriptors.b.a a) {
        u h = u;
        if (a == b.a.H) {
            h = u;
            if (t.g(u.f())) {
                h = t.h;
            }
        }
        return h;
    }
    
    @Override
    public void A0(@e final Collection<? extends b> r) {
        if (r == null) {
            L(35);
        }
        this.R = (Collection<? extends q0>)r;
    }
    
    @e
    @Override
    public List<p0> E() {
        final ArrayList<c0> list = (ArrayList<c0>)new ArrayList<p0>(2);
        final c0 d0 = this.d0;
        if (d0 != null) {
            list.add(d0);
        }
        final s0 e0 = this.e0;
        if (e0 != null) {
            list.add((c0)e0);
        }
        return (List<p0>)list;
    }
    
    @Override
    public boolean F0() {
        return this.X;
    }
    
    @e
    public q0 O0(final m m, final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, final u u, final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, final boolean b2) {
        final q0 n = this.Y0().u(m).t(null).s(b0).w(u).r(a).q(b2).n();
        if (n == null) {
            L(37);
        }
        return n;
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.d(this, n);
    }
    
    @Override
    public boolean Q() {
        return this.W;
    }
    
    @e
    protected b0 Q0(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, @f final q0 q0, @e final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0) {
        if (m == null) {
            L(27);
        }
        if (b0 == null) {
            L(28);
        }
        if (u == null) {
            L(29);
        }
        if (a == null) {
            L(30);
        }
        if (e == null) {
            L(31);
        }
        if (w0 == null) {
            L(32);
        }
        return new b0(m, q0, this.getAnnotations(), b0, u, this.n0(), e, a, w0, this.v0(), this.p(), this.Q(), this.F0(), this.isExternal(), this.S());
    }
    
    @f
    protected q0 R0(@e final a a) {
        if (a == null) {
            L(24);
        }
        final b0 q0 = this.Q0(a.a, a.b, a.c, a.d, a.f, a.k, this.T0(a.e, a.d));
        List<b1> list;
        if (a.j == null) {
            list = this.getTypeParameters();
        }
        else {
            list = a.j;
        }
        final ArrayList list2 = new ArrayList<b1>(list.size());
        final kotlin.reflect.jvm.internal.impl.types.d1 b = kotlin.reflect.jvm.internal.impl.types.p.b((List)list, a.g, (m)q0, (List)list2);
        final kotlin.reflect.jvm.internal.impl.types.c0 c = a.l;
        final k1 m = k1.M;
        final kotlin.reflect.jvm.internal.impl.types.c0 p = b.p(c, m);
        w w = null;
        if (p == null) {
            return null;
        }
        final t0 d = a.i;
        t0 d2;
        if (d != null) {
            if ((d2 = d.d(b)) == null) {
                return null;
            }
        }
        else {
            d2 = null;
        }
        final t0 b2 = this.b0;
        t0 t0;
        if (b2 != null) {
            final kotlin.reflect.jvm.internal.impl.types.c0 p2 = b.p(b2.a(), k1.L);
            if (p2 == null) {
                return null;
            }
            t0 = new e0(q0, (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b((kotlin.reflect.jvm.internal.impl.descriptors.a)q0, p2, this.b0.getValue()), this.b0.getAnnotations());
        }
        else {
            t0 = null;
        }
        q0.b1(p, (List<? extends b1>)list2, d2, t0);
        c0 c2;
        if (this.d0 == null) {
            c2 = null;
        }
        else {
            c2 = new c0(q0, this.d0.getAnnotations(), a.b, Z0(this.d0.getVisibility(), a.f), this.d0.Y(), this.d0.isExternal(), this.d0.isInline(), a.f, a.o(), w0.a);
        }
        if (c2 != null) {
            final kotlin.reflect.jvm.internal.impl.types.c0 returnType = this.d0.getReturnType();
            c2.O0(U0(b, this.d0));
            kotlin.reflect.jvm.internal.impl.types.c0 p3;
            if (returnType != null) {
                p3 = b.p(returnType, m);
            }
            else {
                p3 = null;
            }
            c2.R0(p3);
        }
        d0 d3;
        if (this.e0 == null) {
            d3 = null;
        }
        else {
            d3 = new d0(q0, this.e0.getAnnotations(), a.b, Z0(this.e0.getVisibility(), a.f), this.e0.Y(), this.e0.isExternal(), this.e0.isInline(), a.f, a.p(), w0.a);
        }
        if (d3 != null) {
            Object o;
            if ((o = kotlin.reflect.jvm.internal.impl.descriptors.impl.p.Q0(d3, this.e0.m(), b, false, false, null)) == null) {
                q0.a1(true);
                o = Collections.singletonList(kotlin.reflect.jvm.internal.impl.descriptors.impl.d0.Q0(d3, (kotlin.reflect.jvm.internal.impl.types.c0)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g(a.a).getNothingType(), this.e0.m().get(0).getAnnotations()));
            }
            if (((List)o).size() != 1) {
                throw new IllegalStateException();
            }
            d3.O0(U0(b, this.e0));
            d3.S0(((List<e1>)o).get(0));
        }
        final w g0 = this.g0;
        w w2;
        if (g0 == null) {
            w2 = null;
        }
        else {
            w2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(g0.getAnnotations(), q0);
        }
        final w h0 = this.h0;
        if (h0 != null) {
            w = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o(h0.getAnnotations(), q0);
        }
        q0.W0(c2, d3, w2, w);
        if (a.h) {
            final kotlin.reflect.jvm.internal.impl.utils.j b3 = kotlin.reflect.jvm.internal.impl.utils.j.b();
            final Iterator<? extends q0> iterator = this.g().iterator();
            while (iterator.hasNext()) {
                ((Collection<q0>)b3).add(((q0)iterator.next()).d(b));
            }
            q0.A0((Collection<? extends b>)b3);
        }
        if (this.p()) {
            final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> n = (kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)super.N;
            if (n != null) {
                q0.M0(n);
            }
        }
        return q0;
    }
    
    @Override
    public boolean S() {
        return this.Z;
    }
    
    @f
    public c0 S0() {
        return this.d0;
    }
    
    public void V0(@f final c0 c0, @f final s0 s0) {
        this.W0(c0, s0, null, null);
    }
    
    public void W0(@f final c0 d0, @f final s0 e0, @f final w g0, @f final w h0) {
        this.d0 = d0;
        this.e0 = e0;
        this.g0 = g0;
        this.h0 = h0;
    }
    
    public boolean X0() {
        return this.f0;
    }
    
    @e
    public a Y0() {
        return new a();
    }
    
    public void a1(final boolean f0) {
        this.f0 = f0;
    }
    
    @e
    @Override
    public q0 b() {
        final q0 s = this.S;
        q0 b;
        if (s == this) {
            b = this;
        }
        else {
            b = s.b();
        }
        if (b == null) {
            L(33);
        }
        return b;
    }
    
    public void b1(@e final kotlin.reflect.jvm.internal.impl.types.c0 c0, @e final List<? extends b1> c2, @f final t0 a0, @f final t0 b0) {
        if (c0 == null) {
            L(14);
        }
        if (c2 == null) {
            L(15);
        }
        this.L0(c0);
        this.c0 = new ArrayList<b1>(c2);
        this.b0 = b0;
        this.a0 = a0;
    }
    
    public void c1(@e final u q) {
        if (q == null) {
            L(16);
        }
        this.Q = q;
    }
    
    @Override
    public q0 d(@e final kotlin.reflect.jvm.internal.impl.types.d1 d1) {
        if (d1 == null) {
            L(22);
        }
        if (d1.k()) {
            return this;
        }
        return this.Y0().v(d1.j()).t(this.b()).n();
    }
    
    @e
    @Override
    public Collection<? extends q0> g() {
        Object o = this.R;
        if (o == null) {
            o = Collections.emptyList();
        }
        if (o == null) {
            L(36);
        }
        return (Collection<? extends q0>)o;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.c0 getReturnType() {
        final kotlin.reflect.jvm.internal.impl.types.c0 a = this.a();
        if (a == null) {
            L(18);
        }
        return a;
    }
    
    @e
    @Override
    public List<b1> getTypeParameters() {
        final List<b1> c0 = this.c0;
        if (c0 != null) {
            return c0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("typeParameters == null for ");
        sb.append(this.toString());
        throw new IllegalStateException(sb.toString());
    }
    
    @e
    @Override
    public u getVisibility() {
        final u q = this.Q;
        if (q == null) {
            L(20);
        }
        return q;
    }
    
    @f
    @Override
    public s0 h() {
        return this.e0;
    }
    
    @Override
    public boolean isExternal() {
        return this.Y;
    }
    
    @f
    @Override
    public t0 j0() {
        return this.a0;
    }
    
    @f
    @Override
    public <V> V m0(final kotlin.reflect.jvm.internal.impl.descriptors.a.a<V> a) {
        return null;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.b.a n() {
        final kotlin.reflect.jvm.internal.impl.descriptors.b.a t = this.T;
        if (t == null) {
            L(34);
        }
        return t;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.b0 o() {
        final kotlin.reflect.jvm.internal.impl.descriptors.b0 p = this.P;
        if (p == null) {
            L(19);
        }
        return p;
    }
    
    @Override
    public boolean p() {
        return this.V;
    }
    
    @f
    @Override
    public t0 q0() {
        return this.b0;
    }
    
    @f
    @Override
    public w r0() {
        return this.h0;
    }
    
    @f
    @Override
    public w u0() {
        return this.g0;
    }
    
    @Override
    public boolean v0() {
        return this.U;
    }
    
    public class a
    {
        private m a;
        private kotlin.reflect.jvm.internal.impl.descriptors.b0 b;
        private u c;
        private q0 d;
        private boolean e;
        private kotlin.reflect.jvm.internal.impl.descriptors.b.a f;
        private kotlin.reflect.jvm.internal.impl.types.b1 g;
        private boolean h;
        private t0 i;
        private List<b1> j;
        private kotlin.reflect.jvm.internal.impl.name.e k;
        private kotlin.reflect.jvm.internal.impl.types.c0 l;
        
        public a() {
            this.a = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.c();
            this.b = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.o();
            this.c = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.getVisibility();
            this.d = null;
            this.e = false;
            this.f = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.n();
            this.g = kotlin.reflect.jvm.internal.impl.types.b1.b;
            this.h = true;
            this.i = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.a0;
            this.j = null;
            this.k = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.getName();
            this.l = kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.a();
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 1 && n != 2 && n != 3 && n != 5 && n != 7 && n != 9 && n != 11 && n != 19 && n != 13 && n != 14 && n != 16 && n != 17) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 1 && n != 2 && n != 3 && n != 5 && n != 7 && n != 9 && n != 11 && n != 19 && n != 13 && n != 14 && n != 16 && n != 17) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "owner";
                    break;
                }
                case 18: {
                    args[0] = "name";
                    break;
                }
                case 15: {
                    args[0] = "substitution";
                    break;
                }
                case 12: {
                    args[0] = "typeParameters";
                    break;
                }
                case 10: {
                    args[0] = "kind";
                    break;
                }
                case 8: {
                    args[0] = "visibility";
                    break;
                }
                case 6: {
                    args[0] = "modality";
                    break;
                }
                case 4: {
                    args[0] = "type";
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                }
            }
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 5) {
                            if (n != 7) {
                                if (n != 9) {
                                    if (n != 11) {
                                        if (n != 19) {
                                            if (n != 13) {
                                                if (n != 14) {
                                                    if (n != 16) {
                                                        if (n != 17) {
                                                            args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                        }
                                                        else {
                                                            args[1] = "setCopyOverrides";
                                                        }
                                                    }
                                                    else {
                                                        args[1] = "setSubstitution";
                                                    }
                                                }
                                                else {
                                                    args[1] = "setDispatchReceiverParameter";
                                                }
                                            }
                                            else {
                                                args[1] = "setTypeParameters";
                                            }
                                        }
                                        else {
                                            args[1] = "setName";
                                        }
                                    }
                                    else {
                                        args[1] = "setKind";
                                    }
                                }
                                else {
                                    args[1] = "setVisibility";
                                }
                            }
                            else {
                                args[1] = "setModality";
                            }
                        }
                        else {
                            args[1] = "setReturnType";
                        }
                    }
                    else {
                        args[1] = "setPreserveSourceElement";
                    }
                }
                else {
                    args[1] = "setOriginal";
                }
            }
            else {
                args[1] = "setOwner";
            }
            while (true) {
                switch (n) {
                    default: {
                        args[2] = "setOwner";
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 13:
                    case 14:
                    case 16:
                    case 17:
                    case 19: {
                        final String format2 = String.format(format, args);
                        RuntimeException ex;
                        if (n != 1 && n != 2 && n != 3 && n != 5 && n != 7 && n != 9 && n != 11 && n != 19 && n != 13 && n != 14 && n != 16 && n != 17) {
                            ex = new IllegalArgumentException(format2);
                        }
                        else {
                            ex = new IllegalStateException(format2);
                        }
                        throw ex;
                    }
                    case 18: {
                        args[2] = "setName";
                        continue;
                    }
                    case 15: {
                        args[2] = "setSubstitution";
                        continue;
                    }
                    case 12: {
                        args[2] = "setTypeParameters";
                        continue;
                    }
                    case 10: {
                        args[2] = "setKind";
                        continue;
                    }
                    case 8: {
                        args[2] = "setVisibility";
                        continue;
                    }
                    case 6: {
                        args[2] = "setModality";
                        continue;
                    }
                    case 4: {
                        args[2] = "setReturnType";
                        continue;
                    }
                }
                break;
            }
        }
        
        @f
        public q0 n() {
            return kotlin.reflect.jvm.internal.impl.descriptors.impl.b0.this.R0(this);
        }
        
        r0 o() {
            final q0 d = this.d;
            if (d == null) {
                return null;
            }
            return d.e();
        }
        
        s0 p() {
            final q0 d = this.d;
            if (d == null) {
                return null;
            }
            return d.h();
        }
        
        @e
        public a q(final boolean h) {
            this.h = h;
            return this;
        }
        
        @e
        public a r(@e final kotlin.reflect.jvm.internal.impl.descriptors.b.a f) {
            if (f == null) {
                a(10);
            }
            this.f = f;
            return this;
        }
        
        @e
        public a s(@e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b) {
            if (b == null) {
                a(6);
            }
            this.b = b;
            return this;
        }
        
        @e
        public a t(@f final b b) {
            this.d = (q0)b;
            return this;
        }
        
        @e
        public a u(@e final m a) {
            if (a == null) {
                a(0);
            }
            this.a = a;
            return this;
        }
        
        @e
        public a v(@e final kotlin.reflect.jvm.internal.impl.types.b1 g) {
            if (g == null) {
                a(15);
            }
            this.g = g;
            return this;
        }
        
        @e
        public a w(@e final u c) {
            if (c == null) {
                a(8);
            }
            this.c = c;
            return this;
        }
    }
}
