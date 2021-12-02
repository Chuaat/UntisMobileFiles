// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.e0;
import java.util.ListIterator;
import kotlin.reflect.jvm.internal.impl.types.z;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.j2;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.checker.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.collections.v;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import java.util.List;

public class j
{
    private static final List<e> c;
    public static final j d;
    private static final f.a e;
    private final g a;
    private final f.a b;
    
    static {
        c = v.I5((Iterable)ServiceLoader.load(e.class, e.class.getClassLoader()));
        d = new j(e = new f.a() {
            private static /* synthetic */ void b(final int n) {
                final Object[] args = new Object[3];
                if (n != 1) {
                    args[0] = "a";
                }
                else {
                    args[0] = "b";
                }
                args[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
                args[2] = "equals";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
            }
            
            @Override
            public boolean a(@org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final w0 obj) {
                if (w0 == null) {
                    b(0);
                }
                if (obj == null) {
                    b(1);
                }
                return w0.equals(obj);
            }
        }, g.a.a);
    }
    
    private j(@org.jetbrains.annotations.e final f.a b, @org.jetbrains.annotations.e final g a) {
        if (b == null) {
            a(4);
        }
        if (a == null) {
            a(5);
        }
        this.b = b;
        this.a = a;
    }
    
    @org.jetbrains.annotations.f
    public static a A(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        final j d = j.d;
        final a c = d.G(a2, a, null).c();
        final a c2 = d.G(a, a2, null).c();
        Enum<a> enum1 = i.a.G;
        if (c != enum1 || c2 != enum1) {
            final a i = kotlin.reflect.jvm.internal.impl.resolve.j.i.a.I;
            if (c != (enum1 = i)) {
                if (c2 == i) {
                    enum1 = i;
                }
                else {
                    enum1 = kotlin.reflect.jvm.internal.impl.resolve.j.i.a.H;
                }
            }
        }
        return (a)enum1;
    }
    
    @org.jetbrains.annotations.e
    private static b0 B(@org.jetbrains.annotations.e final Collection<b> collection, final boolean b, @org.jetbrains.annotations.e final b0 b2) {
        if (collection == null) {
            a(91);
        }
        if (b2 == null) {
            a(92);
        }
        Object k = b0.K;
        for (final b b3 : collection) {
            b0 o;
            if (b && ((a0)b3).o() == b0.K) {
                o = b2;
            }
            else {
                o = ((a0)b3).o();
            }
            if (((Enum<Enum>)o).compareTo((Enum)k) < 0) {
                k = o;
            }
        }
        if (k == null) {
            a(93);
        }
        return (b0)k;
    }
    
    @org.jetbrains.annotations.e
    public static Set<b> C(@org.jetbrains.annotations.e final b b) {
        if (b == null) {
            a(13);
        }
        final LinkedHashSet<b> set = new LinkedHashSet<b>();
        h(b, set);
        return set;
    }
    
    private static boolean D(@org.jetbrains.annotations.f final p0 p2, @org.jetbrains.annotations.f final p0 p3) {
        return p2 == null || p3 == null || K((q)p2, (q)p3);
    }
    
    public static boolean E(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        if (a == null) {
            a(65);
        }
        if (a2 == null) {
            a(66);
        }
        final c0 returnType = a.getReturnType();
        final c0 returnType2 = a2.getReturnType();
        final boolean k = K((q)a, (q)a2);
        final boolean b = false;
        if (!k) {
            return false;
        }
        final s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> n = j.d.n(a.getTypeParameters(), a2.getTypeParameters());
        if (a instanceof y) {
            return J(a, returnType, a2, returnType2, n);
        }
        if (!(a instanceof q0)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected callable: ");
            sb.append(a.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
        final q0 q0 = (q0)a;
        final q0 q2 = (q0)a2;
        if (!D((p0)q0.h(), (p0)q2.h())) {
            return false;
        }
        if (((g1)q0).n0() && ((g1)q2).n0()) {
            return ((m)n.e()).e((kotlin.reflect.jvm.internal.impl.types.checker.a)n.f(), returnType.Q0(), returnType2.Q0());
        }
        if (!((g1)q0).n0()) {
            final boolean b2 = b;
            if (((g1)q2).n0()) {
                return b2;
            }
        }
        boolean b2 = b;
        if (J(a, returnType, a2, returnType2, n)) {
            b2 = true;
        }
        return b2;
    }
    
    private static boolean F(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (a == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!E(a, iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean J(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, @org.jetbrains.annotations.e final c0 c2, @org.jetbrains.annotations.e final s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> s0) {
        if (a == null) {
            a(71);
        }
        if (c0 == null) {
            a(72);
        }
        if (a2 == null) {
            a(73);
        }
        if (c2 == null) {
            a(74);
        }
        if (s0 == null) {
            a(75);
        }
        return ((m)s0.e()).f((kotlin.reflect.jvm.internal.impl.types.checker.a)s0.f(), c0.Q0(), c2.Q0());
    }
    
    private static boolean K(@org.jetbrains.annotations.e final q q, @org.jetbrains.annotations.e final q q2) {
        if (q == null) {
            a(67);
        }
        if (q2 == null) {
            a(68);
        }
        final Integer d = t.d(q.getVisibility(), q2.getVisibility());
        return d == null || d >= 0;
    }
    
    public static boolean L(@org.jetbrains.annotations.e final a0 a0, @org.jetbrains.annotations.e final a0 a2) {
        if (a0 == null) {
            a(55);
        }
        if (a2 == null) {
            a(56);
        }
        return !t.g(a2.getVisibility()) && t.h((q)a2, (kotlin.reflect.jvm.internal.impl.descriptors.m)a0);
    }
    
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean M(@org.jetbrains.annotations.e final D n, @org.jetbrains.annotations.e final D obj, final boolean b, final boolean b2) {
        if (n == null) {
            a(11);
        }
        if (obj == null) {
            a(12);
        }
        if (!n.equals(obj) && b.a.e((kotlin.reflect.jvm.internal.impl.descriptors.m)n.b(), (kotlin.reflect.jvm.internal.impl.descriptors.m)obj.b(), b, b2)) {
            return true;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.a b3 = obj.b();
        final Iterator<D> iterator = kotlin.reflect.jvm.internal.impl.resolve.d.d(n).iterator();
        while (iterator.hasNext()) {
            if (b.a.e((kotlin.reflect.jvm.internal.impl.descriptors.m)b3, (kotlin.reflect.jvm.internal.impl.descriptors.m)iterator.next(), b, b2)) {
                return true;
            }
        }
        return false;
    }
    
    public static void N(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.f final l<b, j2> l) {
        if (b == null) {
            a(105);
        }
        for (final b b2 : b.g()) {
            if (((a0)b2).getVisibility() == t.g) {
                N(b2, l);
            }
        }
        if (((a0)b).getVisibility() != t.g) {
            return;
        }
        final u j = j(b);
        u e;
        if (j == null) {
            if (l != null) {
                l.invoke((Object)b);
            }
            e = t.e;
        }
        else {
            e = j;
        }
        if (b instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.b0) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.impl.b0)b).c1(e);
            for (final p0 p2 : ((q0)b).E()) {
                l<b, j2> i;
                if (j == null) {
                    i = null;
                }
                else {
                    i = l;
                }
                N((b)p2, i);
            }
        }
        else if (b instanceof p) {
            ((p)b).k1(e);
        }
        else {
            final kotlin.reflect.jvm.internal.impl.descriptors.impl.a0 a0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.a0)b;
            a0.P0(e);
            if (e != ((a0)a0.C0()).getVisibility()) {
                a0.N0(false);
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public static <H> H O(@org.jetbrains.annotations.e final Collection<H> collection, @org.jetbrains.annotations.e final l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> l) {
        if (collection == null) {
            a(76);
        }
        if (l == null) {
            a(77);
        }
        if (collection.size() == 1) {
            final Object m2 = v.m2((Iterable)collection);
            if (m2 == null) {
                a(78);
            }
            return (H)m2;
        }
        final ArrayList<H> list = new ArrayList<H>(2);
        final List k3 = v.k3((Iterable)collection, (l)l);
        final Object m3 = v.m2((Iterable)collection);
        final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)l.invoke(m3);
        final Iterator<H> iterator = collection.iterator();
        Object o = m3;
        while (iterator.hasNext()) {
            final H next = iterator.next();
            final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = (kotlin.reflect.jvm.internal.impl.descriptors.a)l.invoke((Object)next);
            if (F(a2, k3)) {
                list.add(next);
            }
            if (E(a2, a) && !E(a, a2)) {
                o = next;
            }
        }
        if (list.isEmpty()) {
            if (o == null) {
                a(79);
            }
            return (H)o;
        }
        if (list.size() == 1) {
            final Object m4 = v.m2((Iterable)list);
            if (m4 == null) {
                a(80);
            }
            return (H)m4;
        }
        final H h = null;
        final Iterator<Object> iterator2 = list.iterator();
        H next2;
        do {
            next2 = h;
            if (!iterator2.hasNext()) {
                break;
            }
            next2 = iterator2.next();
        } while (z.b(((kotlin.reflect.jvm.internal.impl.descriptors.a)l.invoke((Object)next2)).getReturnType()));
        if (next2 != null) {
            return next2;
        }
        final Object m5 = v.m2((Iterable)list);
        if (m5 == null) {
            a(82);
        }
        return (H)m5;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        Label_0203: {
            Label_0199: {
                if (n != 9 && n != 10 && n != 14 && n != 19 && n != 93 && n != 96 && n != 101) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                    break Label_0203;
                                                }
                                                case 88:
                                                case 89:
                                                case 90: {
                                                    break Label_0199;
                                                }
                                            }
                                            break;
                                        }
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82: {
                                            break Label_0199;
                                        }
                                    }
                                    break;
                                }
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37: {
                                    break Label_0199;
                                }
                            }
                            break;
                        }
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27: {
                            break;
                        }
                    }
                }
            }
            format = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0403: {
            Label_0401: {
                if (n != 9 && n != 10 && n != 14 && n != 19 && n != 93 && n != 96 && n != 101) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    n2 = 3;
                                                    break Label_0403;
                                                }
                                                case 88:
                                                case 89:
                                                case 90: {
                                                    break Label_0401;
                                                }
                                            }
                                            break;
                                        }
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82: {
                                            break Label_0401;
                                        }
                                    }
                                    break;
                                }
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37: {
                                    break Label_0401;
                                }
                            }
                            break;
                        }
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27: {
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
                args[0] = "equalityAxioms";
                break;
            }
            case 105:
            case 106: {
                args[0] = "memberDescriptor";
                break;
            }
            case 100: {
                args[0] = "onConflict";
                break;
            }
            case 98:
            case 103: {
                args[0] = "extractFrom";
                break;
            }
            case 97:
            case 102: {
                args[0] = "overrider";
                break;
            }
            case 95: {
                args[0] = "toFilter";
                break;
            }
            case 92: {
                args[0] = "classModality";
                break;
            }
            case 77:
            case 99: {
                args[0] = "descriptorByHandle";
                break;
            }
            case 76:
            case 83: {
                args[0] = "overridables";
                break;
            }
            case 74: {
                args[0] = "bReturnType";
                break;
            }
            case 72: {
                args[0] = "aReturnType";
                break;
            }
            case 70:
            case 86:
            case 91:
            case 107: {
                args[0] = "descriptors";
                break;
            }
            case 69: {
                args[0] = "candidate";
                break;
            }
            case 66:
            case 68:
            case 73: {
                args[0] = "b";
                break;
            }
            case 65:
            case 67:
            case 71: {
                args[0] = "a";
                break;
            }
            case 61:
            case 63: {
                args[0] = "notOverridden";
                break;
            }
            case 58: {
                args[0] = "descriptorsFromSuper";
                break;
            }
            case 57: {
                args[0] = "fromCurrent";
                break;
            }
            case 56: {
                args[0] = "fromSuper";
                break;
            }
            case 55: {
                args[0] = "overriding";
                break;
            }
            case 54:
            case 60:
            case 64:
            case 85:
            case 104: {
                args[0] = "strategy";
                break;
            }
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94: {
                args[0] = "current";
                break;
            }
            case 52: {
                args[0] = "membersFromCurrent";
                break;
            }
            case 51: {
                args[0] = "membersFromSupertypes";
                break;
            }
            case 50: {
                args[0] = "name";
                break;
            }
            case 48: {
                args[0] = "subTypeParameter";
                break;
            }
            case 47: {
                args[0] = "superTypeParameter";
                break;
            }
            case 46:
            case 49:
            case 75: {
                args[0] = "typeChecker";
                break;
            }
            case 45: {
                args[0] = "typeInSub";
                break;
            }
            case 44: {
                args[0] = "typeInSuper";
                break;
            }
            case 41:
            case 43: {
                args[0] = "secondParameters";
                break;
            }
            case 40:
            case 42: {
                args[0] = "firstParameters";
                break;
            }
            case 18:
            case 21:
            case 29:
            case 39: {
                args[0] = "subDescriptor";
                break;
            }
            case 17:
            case 20:
            case 28:
            case 38: {
                args[0] = "superDescriptor";
                break;
            }
            case 16: {
                args[0] = "result";
                break;
            }
            case 13:
            case 15: {
                args[0] = "descriptor";
                break;
            }
            case 12: {
                args[0] = "g";
                break;
            }
            case 11: {
                args[0] = "f";
                break;
            }
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101: {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 8: {
                args[0] = "transformFirst";
                break;
            }
            case 6:
            case 7: {
                args[0] = "candidateSet";
                break;
            }
            case 4: {
                args[0] = "axioms";
                break;
            }
            case 1:
            case 2:
            case 5: {
                args[0] = "kotlinTypeRefiner";
                break;
            }
        }
        Label_1515: {
            if (n != 9 && n != 10) {
                if (n != 14) {
                    if (n != 19) {
                        if (n == 93) {
                            args[1] = "getMinimalModality";
                            break Label_1515;
                        }
                        if (n == 96) {
                            args[1] = "filterVisibleFakeOverrides";
                            break Label_1515;
                        }
                        if (n == 101) {
                            args[1] = "extractMembersOverridableInBothWays";
                            break Label_1515;
                        }
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        args[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break Label_1515;
                                                    }
                                                    case 88:
                                                    case 89:
                                                    case 90: {
                                                        args[1] = "determineModalityForFakeOverride";
                                                        break Label_1515;
                                                    }
                                                }
                                                break;
                                            }
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                            case 82: {
                                                args[1] = "selectMostSpecificMember";
                                                break Label_1515;
                                            }
                                        }
                                        break;
                                    }
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37: {
                                        args[1] = "isOverridableByWithoutExternalConditions";
                                        break Label_1515;
                                    }
                                }
                                break;
                            }
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27: {
                                break;
                            }
                        }
                    }
                    args[1] = "isOverridableBy";
                }
                else {
                    args[1] = "getOverriddenDeclarations";
                }
            }
            else {
                args[1] = "filterOverrides";
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "createWithEqualityAxioms";
                }
                case 9:
                case 10:
                case 14:
                case 19:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 88:
                case 89:
                case 90:
                case 93:
                case 96:
                case 101: {
                    final String format2 = String.format(format, args);
                    Label_2476: {
                        if (n != 9 && n != 10 && n != 14 && n != 19 && n != 93 && n != 96 && n != 101) {
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
                                                        case 88:
                                                        case 89:
                                                        case 90: {
                                                            break Label_2476;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82: {
                                                    break Label_2476;
                                                }
                                            }
                                            break;
                                        }
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37: {
                                            break Label_2476;
                                        }
                                    }
                                    break;
                                }
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27: {
                                    break;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(format2);
                }
                case 107: {
                    args[2] = "findMaxVisibility";
                    continue;
                }
                case 106: {
                    args[2] = "computeVisibilityToInherit";
                    continue;
                }
                case 105: {
                    args[2] = "resolveUnknownVisibilityForMember";
                    continue;
                }
                case 97:
                case 98:
                case 99:
                case 100:
                case 102:
                case 103:
                case 104: {
                    args[2] = "extractMembersOverridableInBothWays";
                    continue;
                }
                case 94:
                case 95: {
                    args[2] = "filterVisibleFakeOverrides";
                    continue;
                }
                case 91:
                case 92: {
                    args[2] = "getMinimalModality";
                    continue;
                }
                case 86:
                case 87: {
                    args[2] = "determineModalityForFakeOverride";
                    continue;
                }
                case 83:
                case 84:
                case 85: {
                    args[2] = "createAndBindFakeOverride";
                    continue;
                }
                case 76:
                case 77: {
                    args[2] = "selectMostSpecificMember";
                    continue;
                }
                case 71:
                case 72:
                case 73:
                case 74:
                case 75: {
                    args[2] = "isReturnTypeMoreSpecific";
                    continue;
                }
                case 69:
                case 70: {
                    args[2] = "isMoreSpecificThenAllOf";
                    continue;
                }
                case 67:
                case 68: {
                    args[2] = "isVisibilityMoreSpecific";
                    continue;
                }
                case 65:
                case 66: {
                    args[2] = "isMoreSpecific";
                    continue;
                }
                case 62:
                case 63:
                case 64: {
                    args[2] = "createAndBindFakeOverrides";
                    continue;
                }
                case 61: {
                    args[2] = "allHasSameContainingDeclaration";
                    continue;
                }
                case 57:
                case 58:
                case 59:
                case 60: {
                    args[2] = "extractAndBindOverridesForMember";
                    continue;
                }
                case 55:
                case 56: {
                    args[2] = "isVisibleForOverride";
                    continue;
                }
                case 50:
                case 51:
                case 52:
                case 53:
                case 54: {
                    args[2] = "generateOverridesInFunctionGroup";
                    continue;
                }
                case 47:
                case 48:
                case 49: {
                    args[2] = "areTypeParametersEquivalent";
                    continue;
                }
                case 44:
                case 45:
                case 46: {
                    args[2] = "areTypesEquivalent";
                    continue;
                }
                case 42:
                case 43: {
                    args[2] = "createTypeCheckerContext";
                    continue;
                }
                case 40:
                case 41: {
                    args[2] = "createTypeChecker";
                    continue;
                }
                case 38:
                case 39: {
                    args[2] = "getBasicOverridabilityProblem";
                    continue;
                }
                case 28:
                case 29: {
                    args[2] = "isOverridableByWithoutExternalConditions";
                    continue;
                }
                case 17:
                case 18:
                case 20:
                case 21: {
                    args[2] = "isOverridableBy";
                    continue;
                }
                case 15:
                case 16: {
                    args[2] = "collectOverriddenDeclarations";
                    continue;
                }
                case 13: {
                    args[2] = "getOverriddenDeclarations";
                    continue;
                }
                case 11:
                case 12: {
                    args[2] = "overrides";
                    continue;
                }
                case 7:
                case 8: {
                    args[2] = "filterOverrides";
                    continue;
                }
                case 6: {
                    args[2] = "filterOutOverridden";
                    continue;
                }
                case 4:
                case 5: {
                    args[2] = "<init>";
                    continue;
                }
                case 2:
                case 3: {
                    args[2] = "create";
                    continue;
                }
                case 1: {
                    args[2] = "createWithTypeRefiner";
                    continue;
                }
            }
            break;
        }
    }
    
    private static boolean d(@org.jetbrains.annotations.e final Collection<b> collection) {
        if (collection == null) {
            a(61);
        }
        return collection.size() < 2 || v.j1((Iterable)collection, (l)new l<b, Boolean>() {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.m G = ((n)collection.iterator().next()).c();
            
            public Boolean a(final b b) {
                return ((n)b).c() == this.G;
            }
        });
    }
    
    private boolean e(@org.jetbrains.annotations.e final b1 b1, @org.jetbrains.annotations.e final b1 b2, @org.jetbrains.annotations.e final s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> s0) {
        if (b1 == null) {
            a(47);
        }
        if (b2 == null) {
            a(48);
        }
        if (s0 == null) {
            a(49);
        }
        final List upperBounds = b1.getUpperBounds();
        final ArrayList<Object> list = new ArrayList<Object>(b2.getUpperBounds());
        if (upperBounds.size() != list.size()) {
            return false;
        }
    Label_0076:
        for (final c0 c0 : upperBounds) {
            final ListIterator<c0> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (this.f(c0, listIterator.next(), s0)) {
                    listIterator.remove();
                    continue Label_0076;
                }
            }
            return false;
        }
        return true;
    }
    
    private boolean f(@org.jetbrains.annotations.e final c0 c0, @org.jetbrains.annotations.e final c0 c2, @org.jetbrains.annotations.e final s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> s0) {
        if (c0 == null) {
            a(44);
        }
        if (c2 == null) {
            a(45);
        }
        if (s0 == null) {
            a(46);
        }
        return (e0.a(c0) && e0.a(c2)) || ((m)s0.e()).e((kotlin.reflect.jvm.internal.impl.types.checker.a)s0.f(), c0.Q0(), c2.Q0());
    }
    
    @org.jetbrains.annotations.f
    private static i g(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        final t0 q0 = a.q0();
        int n = true ? 1 : 0;
        final boolean b = q0 == null;
        if (a2.q0() != null) {
            n = (false ? 1 : 0);
        }
        String s;
        if ((b ? 1 : 0) != n) {
            s = "Receiver presence mismatch";
        }
        else {
            if (a.m().size() == a2.m().size()) {
                return null;
            }
            s = "Value parameter number mismatch";
        }
        return i.d(s);
    }
    
    private static void h(@org.jetbrains.annotations.e final b obj, @org.jetbrains.annotations.e final Set<b> set) {
        if (obj == null) {
            a(15);
        }
        if (set == null) {
            a(16);
        }
        if (obj.n().b()) {
            set.add(obj);
        }
        else {
            if (obj.g().isEmpty()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("No overridden descriptors found for (fake override) ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            final Iterator<b> iterator = obj.g().iterator();
            while (iterator.hasNext()) {
                h(iterator.next(), set);
            }
        }
    }
    
    private static List<c0> i(final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        final t0 q0 = a.q0();
        final ArrayList<c0> list = new ArrayList<c0>();
        if (q0 != null) {
            list.add(((d1)q0).a());
        }
        final Iterator<e1> iterator = (Iterator<e1>)a.m().iterator();
        while (iterator.hasNext()) {
            list.add(((d1)iterator.next()).a());
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    private static u j(@org.jetbrains.annotations.e b b) {
        if (b == null) {
            a(106);
        }
        final Collection g = b.g();
        final u x = x(g);
        if (x == null) {
            return null;
        }
        if (b.n() == b$a.H) {
            final Iterator<? extends b> iterator = g.iterator();
            while (iterator.hasNext()) {
                b = (b)iterator.next();
                if (((a0)b).o() != b0.K && !((a0)b).getVisibility().equals(x)) {
                    return null;
                }
            }
            return x;
        }
        return x.f();
    }
    
    @org.jetbrains.annotations.e
    public static j k(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final f.a a) {
        if (g == null) {
            a(2);
        }
        if (a == null) {
            a(3);
        }
        return new j(a, g);
    }
    
    private static void l(@org.jetbrains.annotations.e Collection<b> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.i i) {
        if (collection == null) {
            a(83);
        }
        if (e == null) {
            a(84);
        }
        if (i == null) {
            a(85);
        }
        final Collection<b> w = w(e, collection);
        final boolean empty = w.isEmpty();
        if (!empty) {
            collection = w;
        }
        final b0 q = q(collection, e);
        u u;
        if (empty) {
            u = t.h;
        }
        else {
            u = t.g;
        }
        final b o0 = O(collection, (n6.l<b, kotlin.reflect.jvm.internal.impl.descriptors.a>)new l<b, kotlin.reflect.jvm.internal.impl.descriptors.a>() {
            public b a(final b b) {
                return b;
            }
        }).o0((kotlin.reflect.jvm.internal.impl.descriptors.m)e, q, u, b$a.H, false);
        i.d(o0, collection);
        i.a(o0);
    }
    
    private static void m(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.e final Collection<b> c, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.i i) {
        if (e == null) {
            a(62);
        }
        if (c == null) {
            a(63);
        }
        if (i == null) {
            a(64);
        }
        if (d(c)) {
            final Iterator<b> iterator = c.iterator();
            while (iterator.hasNext()) {
                l(Collections.singleton(iterator.next()), e, i);
            }
            return;
        }
        final LinkedList list = new LinkedList<b>(c);
        while (!list.isEmpty()) {
            l(t(o.a(list), list, i), e, i);
        }
    }
    
    @org.jetbrains.annotations.e
    private s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> n(@org.jetbrains.annotations.e final List<b1> list, @org.jetbrains.annotations.e final List<b1> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        return (s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a>)new s0((Object)new m(this.a), (Object)this.o(list, list2));
    }
    
    @org.jetbrains.annotations.e
    private j o(@org.jetbrains.annotations.e final List<b1> list, @org.jetbrains.annotations.e final List<b1> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            return new j(null);
        }
        final HashMap<w0, w0> hashMap = new HashMap<w0, w0>();
        for (int i = 0; i < list.size(); ++i) {
            hashMap.put(list.get(i).l(), list2.get(i).l());
        }
        return new j(hashMap);
    }
    
    @org.jetbrains.annotations.e
    public static j p(@org.jetbrains.annotations.e final g g) {
        if (g == null) {
            a(1);
        }
        return new j(j.e, g);
    }
    
    @org.jetbrains.annotations.e
    private static b0 q(@org.jetbrains.annotations.e final Collection<b> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (collection == null) {
            a(86);
        }
        if (e == null) {
            a(87);
        }
        final Iterator<b> iterator = collection.iterator();
        final boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        while (iterator.hasNext()) {
            final b obj = iterator.next();
            final int n = j$h.c[((Enum)((a0)obj).o()).ordinal()];
            if (n == 1) {
                final b0 h = b0.H;
                if (h == null) {
                    a(88);
                }
                return h;
            }
            if (n == 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Member cannot have SEALED modality: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            if (n != 3) {
                if (n != 4) {
                    continue;
                }
                b3 = true;
            }
            else {
                b2 = true;
            }
        }
        boolean b4 = b;
        if (((a0)e).Q()) {
            b4 = b;
            if (e.o() != b0.K) {
                b4 = b;
                if (e.o() != b0.I) {
                    b4 = true;
                }
            }
        }
        if (b2 && !b3) {
            final b0 j = b0.J;
            if (j == null) {
                a(89);
            }
            return j;
        }
        if (!b2 && b3) {
            b0 b5;
            if (b4) {
                b5 = e.o();
            }
            else {
                b5 = b0.K;
            }
            if (b5 == null) {
                a(90);
            }
            return b5;
        }
        final HashSet<kotlin.reflect.jvm.internal.impl.descriptors.a> set = new HashSet<kotlin.reflect.jvm.internal.impl.descriptors.a>();
        final Iterator<b> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            set.addAll((Collection<?>)C(iterator2.next()));
        }
        return B((Collection<b>)u(set), b4, e.o());
    }
    
    private Collection<b> r(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final Collection<? extends b> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.i i) {
        if (b == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (e == null) {
            a(59);
        }
        if (i == null) {
            a(60);
        }
        final ArrayList<b> list = new ArrayList<b>(collection.size());
        final j<b> b2 = j.b();
        for (final b b3 : collection) {
            final a c = this.G((kotlin.reflect.jvm.internal.impl.descriptors.a)b3, (kotlin.reflect.jvm.internal.impl.descriptors.a)b, e).c();
            final boolean l = L((a0)b, (a0)b3);
            final int n = j$h.b[c.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    continue;
                }
                if (l) {
                    i.c(b3, b);
                }
            }
            else if (l) {
                b2.add(b3);
            }
            list.add(b3);
        }
        i.d(b, b2);
        return list;
    }
    
    @org.jetbrains.annotations.e
    public static <H> Collection<H> s(@org.jetbrains.annotations.e final H h, @org.jetbrains.annotations.e final Collection<H> collection, @org.jetbrains.annotations.e final l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> l, @org.jetbrains.annotations.e final l<H, j2> i) {
        if (h == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (l == null) {
            a(99);
        }
        if (i == null) {
            a(100);
        }
        final ArrayList<H> list = new ArrayList<H>();
        list.add(h);
        final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)l.invoke((Object)h);
        final Iterator<H> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final H next = iterator.next();
            final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = (kotlin.reflect.jvm.internal.impl.descriptors.a)l.invoke((Object)next);
            if (h != next) {
                final a a3 = A(a, a2);
                if (a3 == kotlin.reflect.jvm.internal.impl.resolve.j.i.a.G) {
                    list.add(next);
                }
                else {
                    if (a3 != kotlin.reflect.jvm.internal.impl.resolve.j.i.a.I) {
                        continue;
                    }
                    i.invoke((Object)next);
                }
            }
            iterator.remove();
        }
        return list;
    }
    
    @org.jetbrains.annotations.e
    private static Collection<b> t(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final Queue<b> queue, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.i i) {
        if (b == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (i == null) {
            a(104);
        }
        return s(b, queue, (n6.l<b, kotlin.reflect.jvm.internal.impl.descriptors.a>)new l<b, kotlin.reflect.jvm.internal.impl.descriptors.a>() {
            public kotlin.reflect.jvm.internal.impl.descriptors.a a(final b b) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.a)b;
            }
        }, (n6.l<b, j2>)new l<b, j2>() {
            public j2 a(final b b) {
                i.b(b, b);
                return j2.a;
            }
        });
    }
    
    @org.jetbrains.annotations.e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> u(@org.jetbrains.annotations.e final Set<D> set) {
        if (set == null) {
            a(6);
        }
        return v(set, !set.isEmpty() && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.q(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((kotlin.reflect.jvm.internal.impl.descriptors.m)set.iterator().next())), null, (n6.p<? super D, ? super D, s0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>>)new n6.p<D, D, s0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>>() {
            public s0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> a(final D n, final D n2) {
                return (s0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>)new s0((Object)n, (Object)n2);
            }
        });
    }
    
    @org.jetbrains.annotations.e
    public static <D> Set<D> v(@org.jetbrains.annotations.e final Set<D> set, final boolean b, @org.jetbrains.annotations.f final n6.a<?> a, @org.jetbrains.annotations.e final n6.p<? super D, ? super D, s0<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> p4) {
        if (set == null) {
            a(7);
        }
        if (p4 == null) {
            a(8);
        }
        if (set.size() <= 1) {
            return set;
        }
        final LinkedHashSet<D> set2 = new LinkedHashSet<D>();
    Label_0047:
        for (final D next : set) {
            if (a != null) {
                a.invoke();
            }
            final Iterator<Object> iterator2 = set2.iterator();
            while (iterator2.hasNext()) {
                final s0 s0 = (s0)p4.invoke((Object)next, iterator2.next());
                final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = (kotlin.reflect.jvm.internal.impl.descriptors.a)s0.a();
                final kotlin.reflect.jvm.internal.impl.descriptors.a a3 = (kotlin.reflect.jvm.internal.impl.descriptors.a)s0.b();
                if (M(a2, a3, b, true)) {
                    iterator2.remove();
                }
                else {
                    if (M(a3, a2, b, true)) {
                        continue Label_0047;
                    }
                    continue;
                }
            }
            set2.add(next);
        }
        return set2;
    }
    
    @org.jetbrains.annotations.e
    private static Collection<b> w(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.e final Collection<b> collection) {
        if (e == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        final List z1 = v.Z1((Iterable)collection, (l)new l<b, Boolean>() {
            public Boolean a(final b b) {
                return !t.g(((a0)b).getVisibility()) && t.h((q)b, (kotlin.reflect.jvm.internal.impl.descriptors.m)e);
            }
        });
        if (z1 == null) {
            a(96);
        }
        return (Collection<b>)z1;
    }
    
    @org.jetbrains.annotations.f
    public static u x(@org.jetbrains.annotations.e final Collection<? extends b> collection) {
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return t.l;
        }
        final Iterator<? extends b> iterator = collection.iterator();
        u u = null;
    Label_0029:
        while (true) {
            u = null;
            while (iterator.hasNext()) {
                final u visibility = ((a0)iterator.next()).getVisibility();
                if (u != null) {
                    final Integer d = t.d(visibility, u);
                    if (d == null) {
                        continue Label_0029;
                    }
                    if (d <= 0) {
                        continue;
                    }
                }
                u = visibility;
            }
            break;
        }
        if (u == null) {
            return null;
        }
        final Iterator<? extends b> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            final Integer d2 = t.d(u, ((a0)iterator2.next()).getVisibility());
            if (d2 == null || d2 < 0) {
                return null;
            }
        }
        return u;
    }
    
    @org.jetbrains.annotations.f
    public static i z(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a obj, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        if (obj == null) {
            a(38);
        }
        if (a == null) {
            a(39);
        }
        final boolean b = obj instanceof y;
        if (!b || a instanceof y) {
            final boolean b2 = obj instanceof q0;
            if (!b2 || a instanceof q0) {
                if (!b && !b2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("This type of CallableDescriptor cannot be checked for overridability: ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (!((f0)obj).getName().equals(((f0)a).getName())) {
                    final String s = "Name mismatch";
                    return i.d(s);
                }
                final i g = g(obj, a);
                if (g != null) {
                    return g;
                }
                return null;
            }
        }
        final String s = "Member kind mismatch";
        return i.d(s);
    }
    
    @org.jetbrains.annotations.e
    public i G(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (a == null) {
            a(17);
        }
        if (a2 == null) {
            a(18);
        }
        final i h = this.H(a, a2, e, false);
        if (h == null) {
            a(19);
        }
        return h;
    }
    
    @org.jetbrains.annotations.e
    public i H(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.e e, final boolean b) {
        if (a == null) {
            a(20);
        }
        if (a2 == null) {
            a(21);
        }
        final i i = this.I(a, a2, b);
        int n;
        if (i.c() == kotlin.reflect.jvm.internal.impl.resolve.j.i.a.G) {
            n = 1;
        }
        else {
            n = 0;
        }
        for (final e e2 : j.c) {
            if (e2.a() == e.a.G) {
                continue;
            }
            if (n != 0 && e2.a() == e.a.H) {
                continue;
            }
            final int n2 = j$h.a[e2.b(a, a2, e).ordinal()];
            if (n2 != 1) {
                if (n2 == 2) {
                    final i b2 = kotlin.reflect.jvm.internal.impl.resolve.j.i.b("External condition failed");
                    if (b2 == null) {
                        a(22);
                    }
                    return b2;
                }
                if (n2 != 3) {
                    continue;
                }
                final i d = kotlin.reflect.jvm.internal.impl.resolve.j.i.d("External condition");
                if (d == null) {
                    a(23);
                }
                return d;
            }
            else {
                n = 1;
            }
        }
        if (n == 0) {
            return i;
        }
        for (final e e3 : j.c) {
            if (e3.a() != e.a.G) {
                continue;
            }
            final int n3 = j$h.a[e3.b(a, a2, e).ordinal()];
            if (n3 == 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Contract violation in ");
                sb.append(e3.getClass().getName());
                sb.append(" condition. It's not supposed to end with success");
                throw new IllegalStateException(sb.toString());
            }
            if (n3 == 2) {
                final i b3 = kotlin.reflect.jvm.internal.impl.resolve.j.i.b("External condition failed");
                if (b3 == null) {
                    a(25);
                }
                return b3;
            }
            if (n3 != 3) {
                continue;
            }
            final i d2 = kotlin.reflect.jvm.internal.impl.resolve.j.i.d("External condition");
            if (d2 == null) {
                a(26);
            }
            return d2;
        }
        final i e4 = kotlin.reflect.jvm.internal.impl.resolve.j.i.e();
        if (e4 == null) {
            a(27);
        }
        return e4;
    }
    
    @org.jetbrains.annotations.e
    public i I(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final boolean b) {
        if (a == null) {
            a(28);
        }
        if (a2 == null) {
            a(29);
        }
        final i z = z(a, a2);
        if (z != null) {
            return z;
        }
        final List<c0> i = i(a);
        final List<c0> j = i(a2);
        final List typeParameters = a.getTypeParameters();
        final List typeParameters2 = a2.getTypeParameters();
        final int size = typeParameters.size();
        final int size2 = typeParameters2.size();
        final int n = 0;
        int k = 0;
        if (size != size2) {
            while (k < i.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.f.a.b(i.get(k), j.get(k))) {
                    final i d = kotlin.reflect.jvm.internal.impl.resolve.j.i.d("Type parameter number mismatch");
                    if (d == null) {
                        a(31);
                    }
                    return d;
                }
                ++k;
            }
            final i b2 = kotlin.reflect.jvm.internal.impl.resolve.j.i.b("Type parameter number mismatch");
            if (b2 == null) {
                a(32);
            }
            return b2;
        }
        final s0<m, kotlin.reflect.jvm.internal.impl.types.checker.a> n2 = this.n(typeParameters, typeParameters2);
        for (int l = 0; l < typeParameters.size(); ++l) {
            if (!this.e(typeParameters.get(l), typeParameters2.get(l), n2)) {
                final i d2 = kotlin.reflect.jvm.internal.impl.resolve.j.i.d("Type parameter bounds mismatch");
                if (d2 == null) {
                    a(33);
                }
                return d2;
            }
        }
        for (int n3 = 0; n3 < i.size(); ++n3) {
            if (!this.f(i.get(n3), j.get(n3), n2)) {
                final i d3 = kotlin.reflect.jvm.internal.impl.resolve.j.i.d("Value parameter type mismatch");
                if (d3 == null) {
                    a(34);
                }
                return d3;
            }
        }
        if (a instanceof y && a2 instanceof y && ((y)a).isSuspend() != ((y)a2).isSuspend()) {
            final i b3 = kotlin.reflect.jvm.internal.impl.resolve.j.i.b("Incompatible suspendability");
            if (b3 == null) {
                a(35);
            }
            return b3;
        }
        if (b) {
            final c0 returnType = a.getReturnType();
            final c0 returnType2 = a2.getReturnType();
            if (returnType != null && returnType2 != null) {
                int n4 = n;
                if (e0.a(returnType2)) {
                    n4 = n;
                    if (e0.a(returnType)) {
                        n4 = 1;
                    }
                }
                if (n4 == 0 && !((m)n2.e()).f((kotlin.reflect.jvm.internal.impl.types.checker.a)n2.f(), returnType2.Q0(), returnType.Q0())) {
                    final i b4 = kotlin.reflect.jvm.internal.impl.resolve.j.i.b("Return type mismatch");
                    if (b4 == null) {
                        a(36);
                    }
                    return b4;
                }
            }
        }
        final i e = kotlin.reflect.jvm.internal.impl.resolve.j.i.e();
        if (e == null) {
            a(37);
        }
        return e;
    }
    
    public void y(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final Collection<? extends b> c, @org.jetbrains.annotations.e final Collection<? extends b> collection, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e2, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.i i) {
        if (e == null) {
            a(50);
        }
        if (c == null) {
            a(51);
        }
        if (collection == null) {
            a(52);
        }
        if (e2 == null) {
            a(53);
        }
        if (i == null) {
            a(54);
        }
        final LinkedHashSet<b> set = new LinkedHashSet<b>(c);
        final Iterator<? extends b> iterator = collection.iterator();
        while (iterator.hasNext()) {
            set.removeAll(this.r((b)iterator.next(), c, e2, i));
        }
        m(e2, set, i);
    }
    
    public static class i
    {
        private static final i c;
        private final a a;
        private final String b;
        
        static {
            c = new i(a.G, "SUCCESS");
        }
        
        public i(@org.jetbrains.annotations.e final a a, @org.jetbrains.annotations.e final String b) {
            if (a == null) {
                a(3);
            }
            if (b == null) {
                a(4);
            }
            this.a = a;
            this.b = b;
        }
        
        private static /* synthetic */ void a(final int n) {
            String format;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                format = "@NotNull method %s.%s must not return null";
            }
            else {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            int n2;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                n2 = 2;
            }
            else {
                n2 = 3;
            }
            final Object[] args = new Object[n2];
            Label_0102: {
                if (n != 1 && n != 2) {
                    if (n == 3) {
                        args[0] = "success";
                        break Label_0102;
                    }
                    if (n != 4) {
                        args[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break Label_0102;
                    }
                }
                args[0] = "debugMessage";
            }
            switch (n) {
                default: {
                    args[1] = "success";
                    break;
                }
                case 6: {
                    args[1] = "getDebugMessage";
                    break;
                }
                case 5: {
                    args[1] = "getResult";
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 4: {
                    args[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                }
            }
            if (n != 1) {
                if (n != 2) {
                    if (n == 3 || n == 4) {
                        args[2] = "<init>";
                    }
                }
                else {
                    args[2] = "conflict";
                }
            }
            else {
                args[2] = "incompatible";
            }
            final String format2 = String.format(format, args);
            RuntimeException ex;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                ex = new IllegalStateException(format2);
            }
            else {
                ex = new IllegalArgumentException(format2);
            }
            throw ex;
        }
        
        @org.jetbrains.annotations.e
        public static i b(@org.jetbrains.annotations.e final String s) {
            if (s == null) {
                a(2);
            }
            return new i(a.I, s);
        }
        
        @org.jetbrains.annotations.e
        public static i d(@org.jetbrains.annotations.e final String s) {
            if (s == null) {
                a(1);
            }
            return new i(a.H, s);
        }
        
        @org.jetbrains.annotations.e
        public static i e() {
            final i c = i.c;
            if (c == null) {
                a(0);
            }
            return c;
        }
        
        @org.jetbrains.annotations.e
        public a c() {
            final a a = this.a;
            if (a == null) {
                a(5);
            }
            return a;
        }
        
        public enum a
        {
            G, 
            H, 
            I;
        }
    }
    
    private class j extends kotlin.reflect.jvm.internal.impl.types.checker.a
    {
        @org.jetbrains.annotations.f
        private final Map<w0, w0> j;
        
        public j(final Map<w0, w0> j) {
            super(true, true, true, kotlin.reflect.jvm.internal.impl.resolve.j.this.a);
            this.j = j;
        }
        
        private static /* synthetic */ void I0(final int n) {
            final Object[] args = new Object[3];
            if (n != 1 && n != 3) {
                args[0] = "a";
            }
            else {
                args[0] = "b";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverridingUtilTypeCheckerContext";
            if (n != 2 && n != 3) {
                args[2] = "areEqualTypeConstructors";
            }
            else {
                args[2] = "areEqualTypeConstructorsByAxioms";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        private boolean J0(@org.jetbrains.annotations.e final w0 obj, @org.jetbrains.annotations.e final w0 obj2) {
            if (obj == null) {
                I0(2);
            }
            if (obj2 == null) {
                I0(3);
            }
            final boolean a = kotlin.reflect.jvm.internal.impl.resolve.j.this.b.a(obj, obj2);
            final boolean b = true;
            if (a) {
                return true;
            }
            final Map<w0, w0> j = this.j;
            if (j == null) {
                return false;
            }
            final w0 w0 = j.get(obj);
            final w0 w2 = this.j.get(obj2);
            if (w0 != null) {
                final boolean b2 = b;
                if (w0.equals(obj2)) {
                    return b2;
                }
            }
            return w2 != null && w2.equals(obj) && b;
        }
        
        @Override
        public boolean G0(@org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final w0 w2) {
            boolean b = false;
            if (w0 == null) {
                I0(0);
            }
            if (w2 == null) {
                I0(1);
            }
            if (super.G0(w0, w2) || this.J0(w0, w2)) {
                b = true;
            }
            return b;
        }
    }
}
