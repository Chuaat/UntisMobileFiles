// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.name.g;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.name.b;

public class d
{
    public static final b a;
    
    static {
        a = new b("kotlin.jvm.JvmName");
    }
    
    private d() {
    }
    
    public static boolean A(@f final m m) {
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.I);
    }
    
    public static boolean B(@e final m m) {
        if (m == null) {
            a(34);
        }
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.J);
    }
    
    public static boolean C(@f final m m) {
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.H);
    }
    
    private static boolean D(@f final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.f f) {
        if (f == null) {
            a(35);
        }
        return m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e && ((kotlin.reflect.jvm.internal.impl.descriptors.e)m).n() == f;
    }
    
    public static boolean E(@e final m m) {
        m c = m;
        if (m == null) {
            a(1);
            c = m;
        }
        while (c != null) {
            if (u(c) || y(c)) {
                return true;
            }
            c = c.c();
        }
        return false;
    }
    
    private static boolean F(@e final c0 c0, @e final m m) {
        if (c0 == null) {
            a(28);
        }
        if (m == null) {
            a(29);
        }
        final h c2 = c0.N0().c();
        if (c2 != null) {
            final m b = ((m)c2).b();
            if (b instanceof h && m instanceof h && ((h)m).l().equals(((h)b).l())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean G(@f final m m) {
        return (D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.G) || D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.H)) && ((kotlin.reflect.jvm.internal.impl.descriptors.e)m).o() == b0.I;
    }
    
    public static boolean H(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        if (e == null) {
            a(26);
        }
        if (e2 == null) {
            a(27);
        }
        return I(e.A(), (m)e2.b());
    }
    
    public static boolean I(@e final c0 c0, @e final m m) {
        if (c0 == null) {
            a(30);
        }
        if (m == null) {
            a(31);
        }
        if (F(c0, m)) {
            return true;
        }
        final Iterator<c0> iterator = c0.N0().k().iterator();
        while (iterator.hasNext()) {
            if (I(iterator.next(), m)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean J(@f final m m) {
        return m != null && m.c() instanceof h0;
    }
    
    public static boolean K(@e final g1 g1, @e final c0 c0) {
        if (g1 == null) {
            a(61);
        }
        if (c0 == null) {
            a(62);
        }
        final boolean n0 = g1.n0();
        boolean b2;
        final boolean b = b2 = false;
        if (!n0) {
            if (e0.a(c0)) {
                b2 = b;
            }
            else {
                if (f1.b(c0)) {
                    return true;
                }
                final KotlinBuiltIns g2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)g1);
                if (!KotlinBuiltIns.isPrimitiveType(c0)) {
                    final kotlin.reflect.jvm.internal.impl.types.checker.f a = kotlin.reflect.jvm.internal.impl.types.checker.f.a;
                    if (!a.b(g2.getStringType(), c0) && !a.b(g2.getNumber().A(), c0) && !a.b(g2.getAnyType(), c0)) {
                        final UnsignedTypes instance = UnsignedTypes.INSTANCE;
                        b2 = b;
                        if (!UnsignedTypes.isUnsignedType(c0)) {
                            return b2;
                        }
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    @e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D L(@e final D n) {
        kotlin.reflect.jvm.internal.impl.descriptors.b obj = n;
        if (n == null) {
            a(57);
            obj = n;
        }
        while (obj.n() == b$a.H) {
            final Collection g = obj.g();
            if (g.isEmpty()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Fake override should have at least one overridden descriptor: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            obj = g.iterator().next();
        }
        return (D)obj;
    }
    
    @e
    public static <D extends q> D M(@e final D n) {
        if (n == null) {
            a(59);
        }
        if (n instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            return L(n);
        }
        if (n == null) {
            a(60);
        }
        return n;
    }
    
    private static /* synthetic */ void a(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91: {
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
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91: {
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
            case 83:
            case 86:
            case 88: {
                args[0] = "name";
                break;
            }
            case 80:
            case 82:
            case 85:
            case 87: {
                args[0] = "scope";
                break;
            }
            case 74:
            case 75:
            case 76: {
                args[0] = "annotated";
                break;
            }
            case 70: {
                args[0] = "memberDescriptor";
                break;
            }
            case 69: {
                args[0] = "result";
                break;
            }
            case 68: {
                args[0] = "current";
                break;
            }
            case 66: {
                args[0] = "f";
                break;
            }
            case 61: {
                args[0] = "variable";
                break;
            }
            case 54: {
                args[0] = "location";
                break;
            }
            case 53: {
                args[0] = "innerClassName";
                break;
            }
            case 44: {
                args[0] = "typeConstructor";
                break;
            }
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 52:
            case 63:
            case 64:
            case 65:
            case 72:
            case 73: {
                args[0] = "classDescriptor";
                break;
            }
            case 35: {
                args[0] = "classKind";
                break;
            }
            case 29: {
                args[0] = "other";
                break;
            }
            case 28:
            case 30:
            case 43:
            case 62: {
                args[0] = "type";
                break;
            }
            case 25:
            case 27:
            case 31: {
                args[0] = "superClass";
                break;
            }
            case 24:
            case 26: {
                args[0] = "subClass";
                break;
            }
            case 23: {
                args[0] = "declarationDescriptor";
                break;
            }
            case 18: {
                args[0] = "kotlinType";
                break;
            }
            case 16:
            case 17: {
                args[0] = "aClass";
                break;
            }
            case 15: {
                args[0] = "second";
                break;
            }
            case 14: {
                args[0] = "first";
                break;
            }
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91: {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 55:
            case 56:
            case 57:
            case 59:
            case 77:
            case 90:
            case 92: {
                args[0] = "descriptor";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 91: {
                args[1] = "getDirectMember";
                break;
            }
            case 89: {
                args[1] = "getPropertyByName";
                break;
            }
            case 84: {
                args[1] = "getFunctionByName";
                break;
            }
            case 81: {
                args[1] = "getAllDescriptors";
                break;
            }
            case 78:
            case 79: {
                args[1] = "getContainingSourceFile";
                break;
            }
            case 71: {
                args[1] = "getAllOverriddenDeclarations";
                break;
            }
            case 67: {
                args[1] = "getAllOverriddenDescriptors";
                break;
            }
            case 60: {
                args[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 58: {
                args[1] = "unwrapFakeOverride";
                break;
            }
            case 47:
            case 48:
            case 49:
            case 50:
            case 51: {
                args[1] = "getDefaultConstructorVisibility";
                break;
            }
            case 45: {
                args[1] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 40:
            case 41: {
                args[1] = "getSuperClassType";
                break;
            }
            case 38: {
                args[1] = "getSuperclassDescriptors";
                break;
            }
            case 20: {
                args[1] = "getContainingModule";
                break;
            }
            case 9:
            case 10: {
                args[1] = "getFqNameFromTopLevelClass";
                break;
            }
            case 7: {
                args[1] = "getFqNameUnsafe";
                break;
            }
            case 4: {
                args[1] = "getFqNameSafe";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "getDispatchReceiverParameterIfNeeded";
                }
                case 4:
                case 7:
                case 9:
                case 10:
                case 20:
                case 38:
                case 40:
                case 41:
                case 45:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 58:
                case 60:
                case 67:
                case 71:
                case 78:
                case 79:
                case 81:
                case 84:
                case 89:
                case 91: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 4:
                        case 7:
                        case 9:
                        case 10:
                        case 20:
                        case 38:
                        case 40:
                        case 41:
                        case 45:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 58:
                        case 60:
                        case 67:
                        case 71:
                        case 78:
                        case 79:
                        case 81:
                        case 84:
                        case 89:
                        case 91: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 92: {
                    args[2] = "isMethodOfAny";
                    continue;
                }
                case 90: {
                    args[2] = "getDirectMember";
                    continue;
                }
                case 87:
                case 88: {
                    args[2] = "getPropertyByName";
                    continue;
                }
                case 85:
                case 86: {
                    args[2] = "getFunctionByNameOrNull";
                    continue;
                }
                case 82:
                case 83: {
                    args[2] = "getFunctionByName";
                    continue;
                }
                case 80: {
                    args[2] = "getAllDescriptors";
                    continue;
                }
                case 77: {
                    args[2] = "getContainingSourceFile";
                    continue;
                }
                case 76: {
                    args[2] = "hasJvmNameAnnotation";
                    continue;
                }
                case 75: {
                    args[2] = "findJvmNameAnnotation";
                    continue;
                }
                case 74: {
                    args[2] = "getJvmName";
                    continue;
                }
                case 73: {
                    args[2] = "canHaveDeclaredConstructors";
                    continue;
                }
                case 72: {
                    args[2] = "isSingletonOrAnonymousObject";
                    continue;
                }
                case 70: {
                    args[2] = "getAllOverriddenDeclarations";
                    continue;
                }
                case 68:
                case 69: {
                    args[2] = "collectAllOverriddenDescriptors";
                    continue;
                }
                case 66: {
                    args[2] = "getAllOverriddenDescriptors";
                    continue;
                }
                case 65: {
                    args[2] = "classCanHaveOpenMembers";
                    continue;
                }
                case 64: {
                    args[2] = "classCanHaveAbstractDeclaration";
                    continue;
                }
                case 63: {
                    args[2] = "classCanHaveAbstractFakeOverride";
                    continue;
                }
                case 61:
                case 62: {
                    args[2] = "shouldRecordInitializerForProperty";
                    continue;
                }
                case 59: {
                    args[2] = "unwrapFakeOverrideToAnyDeclaration";
                    continue;
                }
                case 57: {
                    args[2] = "unwrapFakeOverride";
                    continue;
                }
                case 56: {
                    args[2] = "isTopLevelOrInnerClass";
                    continue;
                }
                case 55: {
                    args[2] = "isStaticNestedClass";
                    continue;
                }
                case 52:
                case 53:
                case 54: {
                    args[2] = "getInnerClassByName";
                    continue;
                }
                case 46: {
                    args[2] = "getDefaultConstructorVisibility";
                    continue;
                }
                case 44: {
                    args[2] = "getClassDescriptorForTypeConstructor";
                    continue;
                }
                case 43: {
                    args[2] = "getClassDescriptorForType";
                    continue;
                }
                case 42: {
                    args[2] = "getSuperClassDescriptor";
                    continue;
                }
                case 39: {
                    args[2] = "getSuperClassType";
                    continue;
                }
                case 37: {
                    args[2] = "getSuperclassDescriptors";
                    continue;
                }
                case 36: {
                    args[2] = "hasAbstractMembers";
                    continue;
                }
                case 35: {
                    args[2] = "isKindOf";
                    continue;
                }
                case 34: {
                    args[2] = "isEnumEntry";
                    continue;
                }
                case 33: {
                    args[2] = "isAnonymousFunction";
                    continue;
                }
                case 32: {
                    args[2] = "isAnonymousObject";
                    continue;
                }
                case 30:
                case 31: {
                    args[2] = "isSubtypeOfClass";
                    continue;
                }
                case 28:
                case 29: {
                    args[2] = "isSameClass";
                    continue;
                }
                case 26:
                case 27: {
                    args[2] = "isSubclass";
                    continue;
                }
                case 24:
                case 25: {
                    args[2] = "isDirectSubclass";
                    continue;
                }
                case 23: {
                    args[2] = "isAncestor";
                    continue;
                }
                case 22: {
                    args[2] = "getContainingClass";
                    continue;
                }
                case 19: {
                    args[2] = "getContainingModule";
                    continue;
                }
                case 18:
                case 21: {
                    args[2] = "getContainingModuleOrNull";
                    continue;
                }
                case 16:
                case 17: {
                    args[2] = "getParentOfType";
                    continue;
                }
                case 14:
                case 15: {
                    args[2] = "areInSameModule";
                    continue;
                }
                case 13: {
                    args[2] = "isStaticDeclaration";
                    continue;
                }
                case 12: {
                    args[2] = "isOverride";
                    continue;
                }
                case 11: {
                    args[2] = "isExtension";
                    continue;
                }
                case 8: {
                    args[2] = "getFqNameFromTopLevelClass";
                    continue;
                }
                case 6: {
                    args[2] = "getFqNameUnsafe";
                    continue;
                }
                case 5: {
                    args[2] = "getFqNameSafeIfPossible";
                    continue;
                }
                case 3: {
                    args[2] = "getFqNameSafe";
                    continue;
                }
                case 2: {
                    args[2] = "getFqName";
                    continue;
                }
                case 1: {
                    args[2] = "isLocal";
                    continue;
                }
            }
            break;
        }
    }
    
    public static boolean b(@e final m m, @e final m i) {
        if (m == null) {
            a(14);
        }
        if (i == null) {
            a(15);
        }
        return g(m).equals(g(i));
    }
    
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@e final D n, @e final Set<D> set) {
        if (n == null) {
            a(68);
        }
        if (set == null) {
            a(69);
        }
        if (set.contains(n)) {
            return;
        }
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> iterator = (Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a>)n.b().g().iterator();
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.a b = iterator.next().b();
            c(b, (Set<kotlin.reflect.jvm.internal.impl.descriptors.a>)set);
            set.add((D)b);
        }
    }
    
    @e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(@e final D n) {
        if (n == null) {
            a(66);
        }
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.a> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.a>();
        c(n.b(), set);
        return (Set<D>)set;
    }
    
    @e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e e(@e final c0 c0) {
        if (c0 == null) {
            a(43);
        }
        return f(c0.N0());
    }
    
    @e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e f(@e final w0 w0) {
        if (w0 == null) {
            a(44);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)w0.c();
        if (e == null) {
            a(45);
        }
        return e;
    }
    
    @e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e0 g(@e final m m) {
        if (m == null) {
            a(19);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e0 h = h(m);
        if (h == null) {
            a(20);
        }
        return h;
    }
    
    @f
    public static kotlin.reflect.jvm.internal.impl.descriptors.e0 h(@e final m m) {
        m c = m;
        if (m == null) {
            a(21);
            c = m;
        }
        while (c != null) {
            if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e0) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e0)c;
            }
            if (c instanceof m0) {
                return ((m0)c).y0();
            }
            c = c.c();
        }
        return null;
    }
    
    @f
    public static kotlin.reflect.jvm.internal.impl.descriptors.e0 i(@e final c0 c0) {
        if (c0 == null) {
            a(18);
        }
        final h c2 = c0.N0().c();
        if (c2 == null) {
            return null;
        }
        return h((m)c2);
    }
    
    @e
    public static x0 j(@e final m m) {
        if (m == null) {
            a(77);
        }
        Object c0 = m;
        if (m instanceof s0) {
            c0 = ((p0)m).C0();
        }
        if (c0 instanceof p) {
            final x0 a = ((p)c0).k().a();
            if (a == null) {
                a(78);
            }
            return a;
        }
        final x0 a2 = x0.a;
        if (a2 == null) {
            a(79);
        }
        return a2;
    }
    
    @e
    public static u k(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, final boolean b) {
        if (e == null) {
            a(46);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.f n = e.n();
        if (n == kotlin.reflect.jvm.internal.impl.descriptors.f.I || n.b()) {
            final u a = t.a;
            if (a == null) {
                a(47);
            }
            return a;
        }
        if (G((m)e)) {
            if (b) {
                final u d = t.d;
                if (d == null) {
                    a(48);
                }
                return d;
            }
            final u a2 = t.a;
            if (a2 == null) {
                a(49);
            }
            return a2;
        }
        else {
            if (u((m)e)) {
                final u l = t.l;
                if (l == null) {
                    a(50);
                }
                return l;
            }
            final u e2 = t.e;
            if (e2 == null) {
                a(51);
            }
            return e2;
        }
    }
    
    @f
    public static t0 l(@e final m m) {
        if (m == null) {
            a(0);
        }
        if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e)m).K0();
        }
        return null;
    }
    
    @e
    public static c m(@e final m m) {
        if (m == null) {
            a(2);
        }
        final b o = o(m);
        c c;
        if (o != null) {
            c = o.j();
        }
        else {
            c = p(m);
        }
        return c;
    }
    
    @e
    public static b n(@e final m m) {
        if (m == null) {
            a(3);
        }
        final b o = o(m);
        b l;
        if (o != null) {
            l = o;
        }
        else {
            l = p(m).l();
        }
        if (l == null) {
            a(4);
        }
        return l;
    }
    
    @f
    private static b o(@e final m m) {
        if (m == null) {
            a(5);
        }
        if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e0 || kotlin.reflect.jvm.internal.impl.types.u.r(m)) {
            return kotlin.reflect.jvm.internal.impl.name.b.c;
        }
        if (m instanceof m0) {
            return ((m0)m).f();
        }
        if (m instanceof h0) {
            return ((h0)m).f();
        }
        return null;
    }
    
    @e
    private static c p(@e final m m) {
        if (m == null) {
            a(6);
        }
        final c c = m(m.c()).c(((f0)m).getName());
        if (c == null) {
            a(7);
        }
        return c;
    }
    
    @f
    public static <D extends m> D q(@f final m m, @e final Class<D> clazz) {
        if (clazz == null) {
            a(16);
        }
        return r(m, clazz, true);
    }
    
    @f
    public static <D extends m> D r(@f m m, @e final Class<D> clazz, final boolean b) {
        if (clazz == null) {
            a(17);
        }
        if (m == null) {
            return null;
        }
        m c = m;
        while (true) {
            Label_0028: {
                if (!b) {
                    break Label_0028;
                }
                c = m.c();
            }
            if (c == null) {
                return null;
            }
            m = c;
            if (clazz.isInstance(c)) {
                return (D)c;
            }
            continue;
        }
    }
    
    @f
    public static kotlin.reflect.jvm.internal.impl.descriptors.e s(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(42);
        }
        final Iterator<c0> iterator = ((h)e).l().k().iterator();
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = e(iterator.next());
            if (e2.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.H) {
                return e2;
            }
        }
        return null;
    }
    
    public static boolean t(@f final m m) {
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.K);
    }
    
    public static boolean u(@e final m m) {
        if (m == null) {
            a(32);
        }
        return v(m) && ((f0)m).getName().equals(g.a);
    }
    
    public static boolean v(@f final m m) {
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.G);
    }
    
    public static boolean w(@f final m m) {
        return v(m) || A(m);
    }
    
    public static boolean x(@f final m m) {
        return D(m, kotlin.reflect.jvm.internal.impl.descriptors.f.L) && ((kotlin.reflect.jvm.internal.impl.descriptors.e)m).G();
    }
    
    public static boolean y(final m m) {
        return m instanceof q && ((q)m).getVisibility() == t.f;
    }
    
    public static boolean z(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        if (e == null) {
            a(24);
        }
        if (e2 == null) {
            a(25);
        }
        final Iterator<c0> iterator = ((h)e).l().k().iterator();
        while (iterator.hasNext()) {
            if (F(iterator.next(), (m)e2.b())) {
                return true;
            }
        }
        return false;
    }
}
