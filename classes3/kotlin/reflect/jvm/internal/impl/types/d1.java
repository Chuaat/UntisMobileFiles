// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.k;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.utils.c;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import n6.l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.List;
import org.jetbrains.annotations.e;

public class d1
{
    public static final d1 b;
    @e
    private final b1 a;
    
    static {
        b = g(b1.b);
    }
    
    protected d1(@e final b1 a) {
        if (a == null) {
            a(6);
        }
        this.a = a;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        Label_0161: {
            Label_0158: {
                if (n != 1 && n != 7 && n != 32 && n != 35) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                    break Label_0161;
                                                }
                                                case 38:
                                                case 39:
                                                case 40: {
                                                    break Label_0158;
                                                }
                                            }
                                            break;
                                        }
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30: {
                                            break Label_0158;
                                        }
                                    }
                                    break;
                                }
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23: {
                                    break Label_0158;
                                }
                            }
                            break;
                        }
                        case 10:
                        case 11:
                        case 12: {
                            break;
                        }
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0319: {
            Label_0317: {
                if (n != 1 && n != 7 && n != 32 && n != 35) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    n2 = 3;
                                                    break Label_0319;
                                                }
                                                case 38:
                                                case 39:
                                                case 40: {
                                                    break Label_0317;
                                                }
                                            }
                                            break;
                                        }
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30: {
                                            break Label_0317;
                                        }
                                    }
                                    break;
                                }
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23: {
                                    break Label_0317;
                                }
                            }
                            break;
                        }
                        case 10:
                        case 11:
                        case 12: {
                            break;
                        }
                    }
                }
            }
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "substitution";
                break;
            }
            case 37: {
                args[0] = "projectionKind";
                break;
            }
            case 33:
            case 36: {
                args[0] = "typeParameterVariance";
                break;
            }
            case 31: {
                args[0] = "annotations";
                break;
            }
            case 25: {
                args[0] = "substituted";
                break;
            }
            case 24: {
                args[0] = "originalType";
                break;
            }
            case 17:
            case 26: {
                args[0] = "originalProjection";
                break;
            }
            case 15:
            case 16:
            case 34: {
                args[0] = "typeProjection";
                break;
            }
            case 9:
            case 14: {
                args[0] = "howThisTypeIsUsed";
                break;
            }
            case 8:
            case 13: {
                args[0] = "type";
                break;
            }
            case 5: {
                args[0] = "context";
                break;
            }
            case 4: {
                args[0] = "substitutionContext";
                break;
            }
            case 3: {
                args[0] = "second";
                break;
            }
            case 2: {
                args[0] = "first";
                break;
            }
            case 1:
            case 7:
            case 10:
            case 11:
            case 12:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 35:
            case 38:
            case 39:
            case 40: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            }
        }
        Label_0829: {
            if (n != 1) {
                if (n != 7) {
                    if (n != 32) {
                        Label_0800: {
                            if (n != 35) {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        switch (n) {
                                                            default: {
                                                                args[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                                break Label_0829;
                                                            }
                                                            case 38:
                                                            case 39:
                                                            case 40: {
                                                                break Label_0800;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30: {
                                                        args[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                        break Label_0829;
                                                    }
                                                }
                                                break;
                                            }
                                            case 18:
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                            case 23: {
                                                args[1] = "unsafeSubstitute";
                                                break Label_0829;
                                            }
                                        }
                                        break;
                                    }
                                    case 10:
                                    case 11:
                                    case 12: {
                                        args[1] = "safeSubstitute";
                                        break Label_0829;
                                    }
                                }
                            }
                        }
                        args[1] = "combine";
                    }
                    else {
                        args[1] = "filterOutUnsafeVariance";
                    }
                }
                else {
                    args[1] = "getSubstitution";
                }
            }
            else {
                args[1] = "replaceWithNonApproximatingSubstitution";
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "create";
                }
                case 1:
                case 7:
                case 10:
                case 11:
                case 12:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 35:
                case 38:
                case 39:
                case 40: {
                    final String format2 = String.format(format, args);
                    Label_1248: {
                        if (n != 1 && n != 7 && n != 32 && n != 35) {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    switch (n) {
                                                        default: {
                                                            throw new IllegalArgumentException(format2);
                                                        }
                                                        case 38:
                                                        case 39:
                                                        case 40: {
                                                            break Label_1248;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30: {
                                                    break Label_1248;
                                                }
                                            }
                                            break;
                                        }
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23: {
                                            break Label_1248;
                                        }
                                    }
                                    break;
                                }
                                case 10:
                                case 11:
                                case 12: {
                                    break;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 33:
                case 34:
                case 36:
                case 37: {
                    args[2] = "combine";
                    continue;
                }
                case 31: {
                    args[2] = "filterOutUnsafeVariance";
                    continue;
                }
                case 24:
                case 25:
                case 26: {
                    args[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                    continue;
                }
                case 17: {
                    args[2] = "unsafeSubstitute";
                    continue;
                }
                case 16: {
                    args[2] = "substituteWithoutApproximation";
                    continue;
                }
                case 13:
                case 14:
                case 15: {
                    args[2] = "substitute";
                    continue;
                }
                case 8:
                case 9: {
                    args[2] = "safeSubstitute";
                    continue;
                }
                case 6: {
                    args[2] = "<init>";
                    continue;
                }
                case 2:
                case 3: {
                    args[2] = "createChainedSubstitutor";
                    continue;
                }
            }
            break;
        }
    }
    
    private static void b(final int n, final y0 y0, final b1 b1) {
        if (n <= 100) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Recursion too deep. Most likely infinite loop while substituting ");
        sb.append(o(y0));
        sb.append("; substitution: ");
        sb.append(o(b1));
        throw new IllegalStateException(sb.toString());
    }
    
    @e
    public static k1 c(@e k1 m, @e final y0 y0) {
        if (m == null) {
            a(33);
        }
        if (y0 == null) {
            a(34);
        }
        if (y0.d()) {
            m = k1.M;
            if (m == null) {
                a(35);
            }
            return m;
        }
        return d(m, y0.c());
    }
    
    @e
    public static k1 d(@e final k1 obj, @e final k1 obj2) {
        if (obj == null) {
            a(36);
        }
        if (obj2 == null) {
            a(37);
        }
        final k1 k = k1.K;
        if (obj == k) {
            if (obj2 == null) {
                a(38);
            }
            return obj2;
        }
        if (obj2 == k) {
            if (obj == null) {
                a(39);
            }
            return obj;
        }
        if (obj == obj2) {
            if (obj2 == null) {
                a(40);
            }
            return obj2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Variance conflict: type parameter variance '");
        sb.append(obj);
        sb.append("' and ");
        sb.append("projection kind '");
        sb.append(obj2);
        sb.append("' cannot be combined");
        throw new AssertionError((Object)sb.toString());
    }
    
    private static d e(final k1 k1, final k1 k2) {
        final k1 l = k1.L;
        if (k1 == l && k2 == k1.M) {
            return d.I;
        }
        if (k1 == k1.M && k2 == l) {
            return d.H;
        }
        return d.G;
    }
    
    @e
    public static d1 f(@e final c0 c0) {
        if (c0 == null) {
            a(5);
        }
        return g(x0.h(c0.N0(), c0.M0()));
    }
    
    @e
    public static d1 g(@e final b1 b1) {
        if (b1 == null) {
            a(0);
        }
        return new d1(b1);
    }
    
    @e
    public static d1 h(@e final b1 b1, @e final b1 b2) {
        if (b1 == null) {
            a(2);
        }
        if (b2 == null) {
            a(3);
        }
        return g(q.h(b1, b2));
    }
    
    @e
    private static g i(@e final g g) {
        if (g == null) {
            a(31);
        }
        if (!g.B4(StandardNames$FqNames.unsafeVariance)) {
            return g;
        }
        return (g)new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(g, (l)new l<b, Boolean>() {
            private static /* synthetic */ void a(final int n) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
            }
            
            public Boolean b(@e final b b) {
                if (b == null) {
                    a(0);
                }
                return b.equals(StandardNames$FqNames.unsafeVariance) ^ true;
            }
        });
    }
    
    @e
    private static y0 l(@e final c0 c0, @e y0 y0, @f final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1, @e final y0 y2) {
        if (c0 == null) {
            a(24);
        }
        if (y0 == null) {
            a(25);
        }
        if (y2 == null) {
            a(26);
        }
        if (!((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations().B4(StandardNames$FqNames.unsafeVariance)) {
            if (y0 == null) {
                a(27);
            }
            return y0;
        }
        final w0 n0 = y0.a().N0();
        if (!(n0 instanceof j)) {
            return y0;
        }
        final y0 a = ((j)n0).a();
        final k1 c2 = a.c();
        final d e = e(y2.c(), c2);
        final d i = d.I;
        if (e == i) {
            return new a1(a.a());
        }
        if (b1 == null) {
            return y0;
        }
        if (e(b1.v(), c2) == i) {
            y0 = new a1(a.a());
        }
        return y0;
    }
    
    private static String o(final Object o) {
        try {
            return o.toString();
        }
        finally {
            final Throwable obj;
            if (!kotlin.reflect.jvm.internal.impl.utils.c.a(obj)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("[Exception while computing toString(): ");
                sb.append(obj);
                sb.append("]");
                return sb.toString();
            }
            throw (RuntimeException)obj;
        }
    }
    
    private y0 r(final y0 y0, final int n) throws c {
        final c0 a = y0.a();
        final k1 c = y0.c();
        if (a.N0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.b1) {
            return y0;
        }
        c0 p2 = null;
        final k0 b = n0.b(a);
        if (b != null) {
            p2 = this.m().p(b, k1.K);
        }
        c0 c3;
        final c0 c2 = c3 = c1.b(a, this.s(a.N0().getParameters(), a.M0(), n), this.a.d(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations()));
        if (c2 instanceof k0) {
            c3 = c2;
            if (p2 instanceof k0) {
                c3 = n0.j((k0)c2, (k0)p2);
            }
        }
        return new a1(c, c3);
    }
    
    private List<y0> s(final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> list, final List<y0> list2, final int n) throws c {
        final ArrayList<y0> list3 = new ArrayList<y0>(list.size());
        int i = 0;
        boolean b = false;
        while (i < list.size()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.b1 b2 = list.get(i);
            final y0 y0 = list2.get(i);
            final y0 u = this.u(y0, b2, n + 1);
            final int n2 = d1$b.a[e(b2.v(), u.c()).ordinal()];
            y0 s;
            if (n2 != 1 && n2 != 2) {
                if (n2 != 3) {
                    s = u;
                }
                else {
                    final k1 v = b2.v();
                    final k1 k = k1.K;
                    s = u;
                    if (v != k) {
                        s = u;
                        if (!u.d()) {
                            s = new a1(k, u.a());
                        }
                    }
                }
            }
            else {
                s = f1.s(b2);
            }
            if (s != y0) {
                b = true;
            }
            list3.add(s);
            ++i;
        }
        if (!b) {
            return list2;
        }
        return list3;
    }
    
    @e
    private y0 u(@e y0 r, @f final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1, int n) throws c {
        if (r == null) {
            a(17);
        }
        b(n, r, this.a);
        if (r.d()) {
            return r;
        }
        final c0 a = r.a();
        if (a instanceof g1) {
            final g1 g1 = (g1)a;
            final j1 g2 = g1.G0();
            final c0 m = g1.M();
            final y0 u = this.u(new a1(r.c(), g2), b1, n + 1);
            return new a1(u.c(), h1.d(u.a().Q0(), this.p(m, r.c())));
        }
        y0 y0 = r;
        if (!s.a(a)) {
            if (a.Q0() instanceof j0) {
                y0 = r;
            }
            else {
                final y0 e = this.a.e(a);
                y0 l;
                if (e != null) {
                    l = l(a, e, b1, r);
                }
                else {
                    l = null;
                }
                final k1 c = r.c();
                if (l == null && z.b(a) && !v0.b(a)) {
                    final w a2 = z.a(a);
                    final a1 a3 = new a1(c, a2.V0());
                    ++n;
                    final y0 u2 = this.u(a3, b1, n);
                    final y0 u3 = this.u(new a1(c, a2.W0()), b1, n);
                    final k1 c2 = u2.c();
                    if (u2.a() == a2.V0() && u3.a() == a2.W0()) {
                        return r;
                    }
                    return new a1(c2, d0.d(c1.a(u2.a()), c1.a(u3.a())));
                }
                else {
                    y0 = r;
                    if (!KotlinBuiltIns.isNothing(a)) {
                        if (e0.a(a)) {
                            y0 = r;
                        }
                        else if (l != null) {
                            final d e2 = e(c, l.c());
                            if (!kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(a)) {
                                n = d1$b.a[e2.ordinal()];
                                if (n == 1) {
                                    throw new c("Out-projection in in-position");
                                }
                                if (n == 2) {
                                    return new a1(k1.M, a.N0().w().getNullableAnyType());
                                }
                            }
                            final kotlin.reflect.jvm.internal.impl.types.k a4 = v0.a(a);
                            if (l.d()) {
                                return l;
                            }
                            c0 c3;
                            if (a4 != null) {
                                c3 = a4.O(l.a());
                            }
                            else {
                                c3 = f1.q(l.a(), a.O0());
                            }
                            c0 i = c3;
                            if (!((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations().isEmpty()) {
                                i = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.l(c3, (g)new k(new g[] { ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c3).getAnnotations(), i(this.a.d(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations())) }));
                            }
                            k1 d = c;
                            if (e2 == d1.d.G) {
                                d = d(c, l.c());
                            }
                            return new a1(d, i);
                        }
                        else {
                            r = this.r(r, n);
                            if ((y0 = r) == null) {
                                a(23);
                                y0 = r;
                            }
                        }
                    }
                }
            }
        }
        return y0;
    }
    
    @e
    public b1 j() {
        final b1 a = this.a;
        if (a == null) {
            a(7);
        }
        return a;
    }
    
    public boolean k() {
        return this.a.f();
    }
    
    @e
    public d1 m() {
        final b1 a = this.a;
        if (a instanceof a0 && a.b()) {
            return new d1(new a0(((a0)this.a).i(), ((a0)this.a).h(), false));
        }
        return this;
    }
    
    @e
    public c0 n(@e c0 a, @e final k1 k1) {
        if (a == null) {
            a(8);
        }
        if (k1 == null) {
            a(9);
        }
        if (this.k()) {
            if (a == null) {
                a(10);
            }
            return a;
        }
        try {
            a = this.u(new a1(k1, a), null, 0).a();
            if (a == null) {
                a(11);
            }
            return a;
        }
        catch (c c) {
            final k0 j = u.j(c.getMessage());
            if (j == null) {
                a(12);
            }
            return j;
        }
    }
    
    @f
    public c0 p(@e c0 a, @e final k1 k1) {
        if (a == null) {
            a(13);
        }
        if (k1 == null) {
            a(14);
        }
        final y0 q = this.q(new a1(k1, this.j().g(a, k1)));
        if (q == null) {
            a = null;
        }
        else {
            a = q.a();
        }
        return a;
    }
    
    @f
    public y0 q(@e y0 t) {
        if (t == null) {
            a(15);
        }
        t = this.t(t);
        if (!this.a.a() && !this.a.b()) {
            return t;
        }
        return kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.c(t, this.a.b());
    }
    
    @f
    public y0 t(@e y0 u) {
        if (u == null) {
            a(16);
        }
        if (this.k()) {
            return u;
        }
        try {
            u = this.u(u, null, 0);
            return u;
        }
        catch (c c) {
            return null;
        }
    }
    
    private static final class c extends Exception
    {
        public c(final String message) {
            super(message);
        }
    }
    
    private enum d
    {
        G, 
        H, 
        I;
    }
}
