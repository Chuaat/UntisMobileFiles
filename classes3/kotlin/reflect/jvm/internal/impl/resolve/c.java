// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.e0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;

public class c
{
    private static /* synthetic */ void a(final int n) {
        String format;
        if (n != 12 && n != 23 && n != 25) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 12 && n != 23 && n != 25) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "propertyDescriptor";
                break;
            }
            case 29: {
                args[0] = "owner";
                break;
            }
            case 26:
            case 27:
            case 28: {
                args[0] = "descriptor";
                break;
            }
            case 22:
            case 24: {
                args[0] = "enumClass";
                break;
            }
            case 21: {
                args[0] = "source";
                break;
            }
            case 20: {
                args[0] = "containingClass";
                break;
            }
            case 12:
            case 23:
            case 25: {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            }
            case 10: {
                args[0] = "visibility";
                break;
            }
            case 6:
            case 11:
            case 19: {
                args[0] = "sourceElement";
                break;
            }
            case 2:
            case 5:
            case 9: {
                args[0] = "parameterAnnotations";
                break;
            }
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 12) {
            if (n != 23) {
                if (n != 25) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                }
                else {
                    args[1] = "createEnumValueOfMethod";
                }
            }
            else {
                args[1] = "createEnumValuesMethod";
            }
        }
        else {
            args[1] = "createSetter";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "createDefaultSetter";
                }
                case 12:
                case 23:
                case 25: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 12 && n != 23 && n != 25) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 29:
                case 30: {
                    args[2] = "createExtensionReceiverParameterForCallable";
                    continue;
                }
                case 28: {
                    args[2] = "isEnumSpecialMethod";
                    continue;
                }
                case 27: {
                    args[2] = "isEnumValueOfMethod";
                    continue;
                }
                case 26: {
                    args[2] = "isEnumValuesMethod";
                    continue;
                }
                case 24: {
                    args[2] = "createEnumValueOfMethod";
                    continue;
                }
                case 22: {
                    args[2] = "createEnumValuesMethod";
                    continue;
                }
                case 20:
                case 21: {
                    args[2] = "createPrimaryConstructorForObject";
                    continue;
                }
                case 15:
                case 16:
                case 17:
                case 18:
                case 19: {
                    args[2] = "createGetter";
                    continue;
                }
                case 13:
                case 14: {
                    args[2] = "createDefaultGetter";
                    continue;
                }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11: {
                    args[2] = "createSetter";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static c0 b(@e final q0 q0, @e final g g) {
        if (q0 == null) {
            a(13);
        }
        if (g == null) {
            a(14);
        }
        return g(q0, g, true, false, false);
    }
    
    @e
    public static d0 c(@e final q0 q0, @e final g g, @e final g g2) {
        if (q0 == null) {
            a(0);
        }
        if (g == null) {
            a(1);
        }
        if (g2 == null) {
            a(2);
        }
        return k(q0, g, g2, true, false, false, ((p)q0).k());
    }
    
    @e
    public static v0 d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(24);
        }
        final g$a r = g.r;
        final f0 m1 = f0.m1((m)e, r.b(), StandardNames.ENUM_VALUE_OF, b$a.J, ((p)e).k());
        final f0 o1 = m1.o1((t0)null, (t0)null, (List)Collections.emptyList(), (List)Collections.singletonList(new k0((kotlin.reflect.jvm.internal.impl.descriptors.a)m1, (e1)null, 0, r.b(), kotlin.reflect.jvm.internal.impl.name.e.i("value"), (kotlin.reflect.jvm.internal.impl.types.c0)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)e).getStringType(), false, false, false, (kotlin.reflect.jvm.internal.impl.types.c0)null, ((p)e).k())), (kotlin.reflect.jvm.internal.impl.types.c0)e.A(), b0.H, t.e);
        if (o1 == null) {
            a(25);
        }
        return (v0)o1;
    }
    
    @e
    public static v0 e(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (e == null) {
            a(22);
        }
        final f0 o1 = f0.m1((m)e, g.r.b(), StandardNames.ENUM_VALUES, b$a.J, ((p)e).k()).o1((t0)null, (t0)null, (List)Collections.emptyList(), (List)Collections.emptyList(), (kotlin.reflect.jvm.internal.impl.types.c0)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)e).getArrayType(k1.K, (kotlin.reflect.jvm.internal.impl.types.c0)e.A()), b0.H, t.e);
        if (o1 == null) {
            a(23);
        }
        return (v0)o1;
    }
    
    @f
    public static t0 f(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final kotlin.reflect.jvm.internal.impl.types.c0 c0, @e final g g) {
        if (a == null) {
            a(29);
        }
        if (g == null) {
            a(30);
        }
        final t0 t0 = null;
        Object o;
        if (c0 == null) {
            o = t0;
        }
        else {
            o = new e0((m)a, (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new b(a, c0, null), g);
        }
        return (t0)o;
    }
    
    @e
    public static c0 g(@e final q0 q0, @e final g g, final boolean b, final boolean b2, final boolean b3) {
        if (q0 == null) {
            a(15);
        }
        if (g == null) {
            a(16);
        }
        return h(q0, g, b, b2, b3, ((p)q0).k());
    }
    
    @e
    public static c0 h(@e final q0 q0, @e final g g, final boolean b, final boolean b2, final boolean b3, @e final w0 w0) {
        if (q0 == null) {
            a(17);
        }
        if (g == null) {
            a(18);
        }
        if (w0 == null) {
            a(19);
        }
        return new c0(q0, g, ((a0)q0).o(), ((a0)q0).getVisibility(), b, b2, b3, b$a.G, (r0)null, w0);
    }
    
    @e
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.f i(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final w0 w0) {
        if (e == null) {
            a(20);
        }
        if (w0 == null) {
            a(21);
        }
        return new a(e, w0, false);
    }
    
    @e
    public static d0 j(@e final q0 q0, @e final g g, @e final g g2, final boolean b, final boolean b2, final boolean b3, @e final u u, @e final w0 w0) {
        if (q0 == null) {
            a(7);
        }
        if (g == null) {
            a(8);
        }
        if (g2 == null) {
            a(9);
        }
        if (u == null) {
            a(10);
        }
        if (w0 == null) {
            a(11);
        }
        final d0 d0 = new d0(q0, g, ((a0)q0).o(), u, b, b2, b3, b$a.G, (s0)null, w0);
        d0.S0((e1)kotlin.reflect.jvm.internal.impl.descriptors.impl.d0.Q0((s0)d0, ((d1)q0).a(), g2));
        return d0;
    }
    
    @e
    public static d0 k(@e final q0 q0, @e final g g, @e final g g2, final boolean b, final boolean b2, final boolean b3, @e final w0 w0) {
        if (q0 == null) {
            a(3);
        }
        if (g == null) {
            a(4);
        }
        if (g2 == null) {
            a(5);
        }
        if (w0 == null) {
            a(6);
        }
        return j(q0, g, g2, b, b2, b3, ((a0)q0).getVisibility(), w0);
    }
    
    private static boolean l(@e final y y) {
        if (y == null) {
            a(28);
        }
        return ((kotlin.reflect.jvm.internal.impl.descriptors.b)y).n() == b$a.J && d.A(y.c());
    }
    
    public static boolean m(@e final y y) {
        if (y == null) {
            a(27);
        }
        return ((kotlin.reflect.jvm.internal.impl.descriptors.f0)y).getName().equals(StandardNames.ENUM_VALUE_OF) && l(y);
    }
    
    public static boolean n(@e final y y) {
        if (y == null) {
            a(26);
        }
        return ((kotlin.reflect.jvm.internal.impl.descriptors.f0)y).getName().equals(StandardNames.ENUM_VALUES) && l(y);
    }
    
    private static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.f
    {
        public a(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final w0 w0, final boolean b) {
            if (e == null) {
                L(0);
            }
            if (w0 == null) {
                L(1);
            }
            super(e, (l)null, g.r.b(), true, b$a.G, w0);
            this.q1((List)Collections.emptyList(), d.k(e, b));
        }
        
        private static /* synthetic */ void L(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                args[0] = "containingClass";
            }
            else {
                args[0] = "source";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            args[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
    }
}
