// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;

public class f0 extends p implements v0
{
    protected f0(@e final m m, @f final v0 v0, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b.a a, @e final w0 w0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (a == null) {
            L(3);
        }
        if (w0 == null) {
            L(4);
        }
        super(m, v0, g, e, a, w0);
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 13 && n != 17 && n != 18 && n != 23 && n != 24) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 13 && n != 17 && n != 18 && n != 23 && n != 24) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 19: {
                args[0] = "newOwner";
                break;
            }
            case 13:
            case 17:
            case 18:
            case 23:
            case 24: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            }
            case 12:
            case 16: {
                args[0] = "visibility";
                break;
            }
            case 11:
            case 15: {
                args[0] = "unsubstitutedValueParameters";
                break;
            }
            case 10:
            case 14: {
                args[0] = "typeParameters";
                break;
            }
            case 4:
            case 9:
            case 22: {
                args[0] = "source";
                break;
            }
            case 3:
            case 8:
            case 20: {
                args[0] = "kind";
                break;
            }
            case 2:
            case 7: {
                args[0] = "name";
                break;
            }
            case 1:
            case 6:
            case 21: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 13 && n != 17) {
            if (n != 18) {
                if (n != 23) {
                    if (n != 24) {
                        args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    }
                    else {
                        args[1] = "newCopyBuilder";
                    }
                }
                else {
                    args[1] = "copy";
                }
            }
            else {
                args[1] = "getOriginal";
            }
        }
        else {
            args[1] = "initialize";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 13:
                case 17:
                case 18:
                case 23:
                case 24: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 13 && n != 17 && n != 18 && n != 23 && n != 24) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 19:
                case 20:
                case 21:
                case 22: {
                    args[2] = "createSubstitutedCopy";
                    continue;
                }
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16: {
                    args[2] = "initialize";
                    continue;
                }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: {
                    args[2] = "create";
                    continue;
                }
            }
            break;
        }
    }
    
    @e
    public static f0 m1(@e final m m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b.a a, @e final w0 w0) {
        if (m == null) {
            L(5);
        }
        if (g == null) {
            L(6);
        }
        if (e == null) {
            L(7);
        }
        if (a == null) {
            L(8);
        }
        if (w0 == null) {
            L(9);
        }
        return new f0(m, null, g, e, a, w0);
    }
    
    @e
    @Override
    public y.a<? extends v0> B() {
        final y.a<? extends y> b = super.B();
        if (b == null) {
            L(24);
        }
        return (y.a<? extends v0>)b;
    }
    
    @e
    @Override
    protected p M0(@e final m m, @f final y y, @e final b.a a, @f kotlin.reflect.jvm.internal.impl.name.e name, @e final g g, @e final w0 w0) {
        if (m == null) {
            L(19);
        }
        if (a == null) {
            L(20);
        }
        if (g == null) {
            L(21);
        }
        if (w0 == null) {
            L(22);
        }
        final v0 v0 = (v0)y;
        if (name == null) {
            name = this.getName();
        }
        return new f0(m, v0, g, name, a, w0);
    }
    
    @e
    public v0 l1(final m m, final b0 b0, final u u, final b.a a, final boolean b2) {
        final v0 v0 = (v0)super.L0(m, b0, u, a, b2);
        if (v0 == null) {
            L(23);
        }
        return v0;
    }
    
    @e
    public v0 n1() {
        final v0 v0 = (v0)super.b();
        if (v0 == null) {
            L(18);
        }
        return v0;
    }
    
    @e
    public f0 o1(@f final t0 t0, @f final t0 t2, @e final List<? extends b1> list, @e final List<e1> list2, @f final c0 c0, @f final b0 b0, @e final u u) {
        if (list == null) {
            L(10);
        }
        if (list2 == null) {
            L(11);
        }
        if (u == null) {
            L(12);
        }
        final f0 p7 = this.p1(t0, t2, list, list2, c0, b0, u, null);
        if (p7 == null) {
            L(13);
        }
        return p7;
    }
    
    @e
    public f0 p1(@f final t0 t0, @f final t0 t2, @e final List<? extends b1> list, @e final List<e1> list2, @f final c0 c0, @f final b0 b0, @e final u u, @f final Map<? extends a.a<?>, ?> m) {
        if (list == null) {
            L(14);
        }
        if (list2 == null) {
            L(15);
        }
        if (u == null) {
            L(16);
        }
        super.S0(t0, t2, list, list2, c0, b0, u);
        if (m != null && !m.isEmpty()) {
            super.i0 = new LinkedHashMap<a.a<?>, Object>(m);
        }
        return this;
    }
}
