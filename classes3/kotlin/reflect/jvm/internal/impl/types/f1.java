// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.n;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.utils.j;
import n6.l;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public class f1
{
    public static final k0 a;
    public static final k0 b;
    @e
    public static final k0 c;
    public static final k0 d;
    
    static {
        a = u.p("DONT_CARE");
        b = u.j("Cannot be inferred");
        c = new a("NO_EXPECTED_TYPE");
        d = new a("UNIT_EXPECTED_TYPE");
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        Label_0113: {
            if (n != 4 && n != 9 && n != 11 && n != 15 && n != 17 && n != 19 && n != 26 && n != 35 && n != 47 && n != 52 && n != 6 && n != 7) {
                switch (n) {
                    default: {
                        format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break Label_0113;
                    }
                    case 55:
                    case 56:
                    case 57:
                    case 58: {
                        break;
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0223: {
            if (n != 4 && n != 9 && n != 11 && n != 15 && n != 17 && n != 19 && n != 26 && n != 35 && n != 47 && n != 52 && n != 6 && n != 7) {
                switch (n) {
                    default: {
                        n2 = 3;
                        break Label_0223;
                    }
                    case 55:
                    case 56:
                    case 57:
                    case 58: {
                        break;
                    }
                }
            }
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "type";
                break;
            }
            case 53: {
                args[0] = "literalTypeConstructor";
                break;
            }
            case 51:
            case 54: {
                args[0] = "expectedType";
                break;
            }
            case 48:
            case 49: {
                args[0] = "supertypes";
                break;
            }
            case 46:
            case 50: {
                args[0] = "numberValueTypeConstructor";
                break;
            }
            case 45: {
                args[0] = "parameterDescriptor";
                break;
            }
            case 43:
            case 44: {
                args[0] = "isSpecialType";
                break;
            }
            case 42: {
                args[0] = "specialType";
                break;
            }
            case 41: {
                args[0] = "typeParameterConstructors";
                break;
            }
            case 39: {
                args[0] = "typeParameters";
                break;
            }
            case 37: {
                args[0] = "b";
                break;
            }
            case 36: {
                args[0] = "a";
                break;
            }
            case 34: {
                args[0] = "projections";
                break;
            }
            case 32: {
                args[0] = "typeArguments";
                break;
            }
            case 31:
            case 33: {
                args[0] = "clazz";
                break;
            }
            case 24: {
                args[0] = "result";
                break;
            }
            case 22: {
                args[0] = "substitutor";
                break;
            }
            case 21: {
                args[0] = "superType";
                break;
            }
            case 20: {
                args[0] = "subType";
                break;
            }
            case 16: {
                args[0] = "parameters";
                break;
            }
            case 14: {
                args[0] = "refinedTypeFactory";
                break;
            }
            case 13: {
                args[0] = "unsubstitutedMemberScope";
                break;
            }
            case 12: {
                args[0] = "typeConstructor";
                break;
            }
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58: {
                args[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            }
        }
        Label_0833: {
            if (n != 4) {
                Label_0820: {
                    if (n != 9) {
                        if (n == 11 || n == 15) {
                            args[1] = "makeUnsubstitutedType";
                            break Label_0833;
                        }
                        if (n == 17) {
                            args[1] = "getDefaultTypeProjections";
                            break Label_0833;
                        }
                        if (n == 19) {
                            args[1] = "getImmediateSupertypes";
                            break Label_0833;
                        }
                        if (n == 26) {
                            args[1] = "getAllSupertypes";
                            break Label_0833;
                        }
                        if (n == 35) {
                            args[1] = "substituteProjectionsForParameters";
                            break Label_0833;
                        }
                        if (n != 47) {
                            if (n != 52) {
                                if (n == 6 || n == 7) {
                                    break Label_0820;
                                }
                                switch (n) {
                                    default: {
                                        args[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                        break Label_0833;
                                    }
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58: {
                                        break;
                                    }
                                }
                            }
                            args[1] = "getPrimitiveNumberType";
                            break Label_0833;
                        }
                        args[1] = "getDefaultPrimitiveNumberType";
                        break Label_0833;
                    }
                }
                args[1] = "makeNullableIfNeeded";
            }
            else {
                args[1] = "makeNullableAsSpecified";
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "noExpectedType";
                }
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                case 15:
                case 17:
                case 19:
                case 26:
                case 35:
                case 47:
                case 52:
                case 55:
                case 56:
                case 57:
                case 58: {
                    final String format2 = String.format(format, args);
                    if (n != 4 && n != 9 && n != 11 && n != 15 && n != 17 && n != 19 && n != 26 && n != 35 && n != 47 && n != 52 && n != 6 && n != 7) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException(format2);
                            }
                            case 55:
                            case 56:
                            case 57:
                            case 58: {
                                break;
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 62: {
                    args[2] = "getTypeParameterDescriptorOrNull";
                    continue;
                }
                case 61: {
                    args[2] = "isNonReifiedTypeParameter";
                    continue;
                }
                case 60: {
                    args[2] = "isReifiedTypeParameter";
                    continue;
                }
                case 59: {
                    args[2] = "isTypeParameter";
                    continue;
                }
                case 50:
                case 51:
                case 53:
                case 54: {
                    args[2] = "getPrimitiveNumberType";
                    continue;
                }
                case 49: {
                    args[2] = "findByFqName";
                    continue;
                }
                case 46:
                case 48: {
                    args[2] = "getDefaultPrimitiveNumberType";
                    continue;
                }
                case 45: {
                    args[2] = "makeStarProjection";
                    continue;
                }
                case 42:
                case 43:
                case 44: {
                    args[2] = "contains";
                    continue;
                }
                case 40:
                case 41: {
                    args[2] = "dependsOnTypeConstructors";
                    continue;
                }
                case 38:
                case 39: {
                    args[2] = "dependsOnTypeParameters";
                    continue;
                }
                case 36:
                case 37: {
                    args[2] = "equalTypes";
                    continue;
                }
                case 33:
                case 34: {
                    args[2] = "substituteProjectionsForParameters";
                    continue;
                }
                case 31:
                case 32: {
                    args[2] = "substituteParameters";
                    continue;
                }
                case 30: {
                    args[2] = "getClassDescriptor";
                    continue;
                }
                case 29: {
                    args[2] = "hasNullableSuperType";
                    continue;
                }
                case 28: {
                    args[2] = "acceptsNullable";
                    continue;
                }
                case 27: {
                    args[2] = "isNullableType";
                    continue;
                }
                case 25: {
                    args[2] = "getAllSupertypes";
                    continue;
                }
                case 23:
                case 24: {
                    args[2] = "collectAllSupertypes";
                    continue;
                }
                case 20:
                case 21:
                case 22: {
                    args[2] = "createSubstitutedSupertype";
                    continue;
                }
                case 18: {
                    args[2] = "getImmediateSupertypes";
                    continue;
                }
                case 16: {
                    args[2] = "getDefaultTypeProjections";
                    continue;
                }
                case 12:
                case 13:
                case 14: {
                    args[2] = "makeUnsubstitutedType";
                    continue;
                }
                case 10: {
                    args[2] = "canHaveSubtypes";
                    continue;
                }
                case 5:
                case 8: {
                    args[2] = "makeNullableIfNeeded";
                    continue;
                }
                case 3: {
                    args[2] = "makeNullableAsSpecified";
                    continue;
                }
                case 2: {
                    args[2] = "makeNotNullable";
                    continue;
                }
                case 1: {
                    args[2] = "makeNullable";
                    continue;
                }
            }
            break;
        }
    }
    
    public static boolean b(@e final c0 c0) {
        if (c0 == null) {
            a(28);
        }
        return c0.O0() || (z.b(c0) && b(z.a(c0).W0()));
    }
    
    public static boolean c(@f final c0 c0, @e final l<j1, Boolean> l) {
        if (l == null) {
            a(43);
        }
        return d(c0, l, null);
    }
    
    private static boolean d(@f final c0 c0, @e final l<j1, Boolean> l, final j<c0> j) {
        if (l == null) {
            a(44);
        }
        if (c0 == null) {
            return false;
        }
        final j1 q0 = c0.Q0();
        if (v(c0)) {
            return (boolean)l.invoke((Object)q0);
        }
        if (j != null && j.contains(c0)) {
            return false;
        }
        if (l.invoke((Object)q0)) {
            return true;
        }
        j<c0> b;
        if ((b = j) == null) {
            b = j.b();
        }
        b.add(c0);
        w w;
        if (q0 instanceof w) {
            w = (w)q0;
        }
        else {
            w = null;
        }
        if (w != null && (d(w.V0(), l, b) || d(w.W0(), l, b))) {
            return true;
        }
        if (q0 instanceof kotlin.reflect.jvm.internal.impl.types.l && d(((kotlin.reflect.jvm.internal.impl.types.l)q0).Z0(), l, b)) {
            return true;
        }
        final w0 n0 = c0.N0();
        if (n0 instanceof b0) {
            final Iterator<c0> iterator = ((b0)n0).k().iterator();
            while (iterator.hasNext()) {
                if (d(iterator.next(), l, b)) {
                    return true;
                }
            }
            return false;
        }
        final Iterator<y0> iterator2 = c0.M0().iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                return false;
            }
            final y0 y0 = iterator2.next();
            if (y0.d()) {
                continue;
            }
            final c0 a = y0.a();
            try {
                if (d(a, l, b)) {
                    return true;
                }
                continue;
            }
            finally {}
        }
    }
    
    @f
    public static c0 e(@e final c0 c0, @e c0 p3, @e final d1 d1) {
        if (c0 == null) {
            a(20);
        }
        if (p3 == null) {
            a(21);
        }
        if (d1 == null) {
            a(22);
        }
        p3 = d1.p(p3, k1.K);
        if (p3 != null) {
            return q(p3, c0.O0());
        }
        return null;
    }
    
    @f
    public static kotlin.reflect.jvm.internal.impl.descriptors.e f(@e final c0 c0) {
        if (c0 == null) {
            a(30);
        }
        final h c2 = c0.N0().c();
        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
        }
        return null;
    }
    
    @e
    public static List<y0> g(@e final List<b1> list) {
        if (list == null) {
            a(16);
        }
        final ArrayList<a1> list2 = new ArrayList<a1>(list.size());
        final Iterator<b1> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new a1(((h)iterator.next()).A()));
        }
        final List i5 = v.I5((Iterable)list2);
        if (i5 == null) {
            a(17);
        }
        return (List<y0>)i5;
    }
    
    @e
    public static List<c0> h(@e final c0 c0) {
        if (c0 == null) {
            a(18);
        }
        final d1 f = d1.f(c0);
        final Collection<c0> k = c0.N0().k();
        final ArrayList list = new ArrayList<c0>(k.size());
        final Iterator<c0> iterator = k.iterator();
        while (iterator.hasNext()) {
            final c0 e = e(c0, iterator.next(), f);
            if (e != null) {
                list.add(e);
            }
        }
        return (List<c0>)list;
    }
    
    @f
    public static b1 i(@e final c0 c0) {
        if (c0 == null) {
            a(62);
        }
        if (c0.N0().c() instanceof b1) {
            return (b1)c0.N0().c();
        }
        return null;
    }
    
    public static boolean j(@e final c0 c0) {
        if (c0 == null) {
            a(29);
        }
        if (c0.N0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return false;
        }
        final Iterator<c0> iterator = h(c0).iterator();
        while (iterator.hasNext()) {
            if (l(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean k(@f final c0 c0) {
        return c0 != null && c0.N0() == f1.a.N0();
    }
    
    public static boolean l(@e final c0 c0) {
        if (c0 == null) {
            a(27);
        }
        if (c0.O0()) {
            return true;
        }
        if (z.b(c0) && l(z.a(c0).W0())) {
            return true;
        }
        if (n0.c(c0)) {
            return false;
        }
        if (m(c0)) {
            return j(c0);
        }
        final w0 n0 = c0.N0();
        if (n0 instanceof b0) {
            final Iterator<c0> iterator = n0.k().iterator();
            while (iterator.hasNext()) {
                if (l(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean m(@e final c0 c0) {
        if (c0 == null) {
            a(59);
        }
        return i(c0) != null || c0.N0() instanceof n;
    }
    
    @e
    public static c0 n(@e final c0 c0) {
        if (c0 == null) {
            a(2);
        }
        return p(c0, false);
    }
    
    @e
    public static c0 o(@e final c0 c0) {
        if (c0 == null) {
            a(1);
        }
        return p(c0, true);
    }
    
    @e
    public static c0 p(@e final c0 c0, final boolean b) {
        if (c0 == null) {
            a(3);
        }
        final j1 r0 = c0.Q0().R0(b);
        if (r0 == null) {
            a(4);
        }
        return r0;
    }
    
    @e
    public static c0 q(@e final c0 c0, final boolean b) {
        if (c0 == null) {
            a(8);
        }
        if (b) {
            return o(c0);
        }
        if (c0 == null) {
            a(9);
        }
        return c0;
    }
    
    @e
    public static k0 r(@e k0 u0, final boolean b) {
        if (u0 == null) {
            a(5);
        }
        if (b) {
            u0 = u0.U0(true);
            if (u0 == null) {
                a(6);
            }
            return u0;
        }
        if (u0 == null) {
            a(7);
        }
        return u0;
    }
    
    @e
    public static y0 s(@e final b1 b1) {
        if (b1 == null) {
            a(45);
        }
        return new p0(b1);
    }
    
    @e
    public static k0 t(final h obj, final kotlin.reflect.jvm.internal.impl.resolve.scopes.h h, final l<g, k0> l) {
        if (u.r((m)obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsubstituted type for ");
            sb.append(obj);
            final k0 j = u.j(sb.toString());
            if (j == null) {
                a(11);
            }
            return j;
        }
        return u(obj.l(), h, l);
    }
    
    @e
    public static k0 u(@e final w0 w0, @e final kotlin.reflect.jvm.internal.impl.resolve.scopes.h h, @e final l<g, k0> l) {
        if (w0 == null) {
            a(12);
        }
        if (h == null) {
            a(13);
        }
        if (l == null) {
            a(14);
        }
        final k0 k = d0.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), w0, g(w0.getParameters()), false, h, l);
        if (k == null) {
            a(15);
        }
        return k;
    }
    
    public static boolean v(@e final c0 c0) {
        boolean b = false;
        if (c0 == null) {
            a(0);
        }
        if (c0 == f1.c || c0 == f1.d) {
            b = true;
        }
        return b;
    }
    
    public static class a extends n
    {
        private final String H;
        
        public a(final String h) {
            this.H = h;
        }
        
        private static /* synthetic */ void Z0(final int n) {
            String format;
            if (n != 1 && n != 4) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 1 && n != 4) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            Label_0090: {
                if (n != 1) {
                    if (n == 2) {
                        args[0] = "delegate";
                        break Label_0090;
                    }
                    if (n == 3) {
                        args[0] = "kotlinTypeRefiner";
                        break Label_0090;
                    }
                    if (n != 4) {
                        args[0] = "newAnnotations";
                        break Label_0090;
                    }
                }
                args[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (n != 1) {
                if (n != 4) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                }
                else {
                    args[1] = "refine";
                }
            }
            else {
                args[1] = "toString";
            }
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            args[2] = "replaceAnnotations";
                        }
                    }
                    else {
                        args[2] = "refine";
                    }
                }
                else {
                    args[2] = "replaceDelegate";
                }
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 1 && n != 4) {
                ex = new IllegalArgumentException(format2);
            }
            else {
                ex = new IllegalStateException(format2);
            }
            throw ex;
        }
        
        @e
        @Override
        public k0 U0(final boolean b) {
            throw new IllegalStateException(this.H);
        }
        
        @e
        @Override
        public k0 V0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
            if (g == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.H);
        }
        
        @e
        @Override
        protected k0 W0() {
            throw new IllegalStateException(this.H);
        }
        
        @e
        @Override
        public n Y0(@e final k0 k0) {
            if (k0 == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.H);
        }
        
        @e
        public a a1(@e final g g) {
            if (g == null) {
                Z0(3);
            }
            return this;
        }
        
        @e
        @Override
        public String toString() {
            final String h = this.H;
            if (h == null) {
                Z0(1);
            }
            return h;
        }
    }
}
