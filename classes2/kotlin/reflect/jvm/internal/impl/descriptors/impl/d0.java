// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;

public class d0 extends a0 implements s0
{
    private e1 T;
    @e
    private final s0 U;
    
    public d0(@e final q0 q0, @e final g g, @e final b0 b0, @e final u u, final boolean b2, final boolean b3, final boolean b4, @e final b.a a, @f final s0 s0, @e final w0 w0) {
        if (q0 == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (b0 == null) {
            L(2);
        }
        if (u == null) {
            L(3);
        }
        if (a == null) {
            L(4);
        }
        if (w0 == null) {
            L(5);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("<set-");
        sb.append(q0.getName());
        sb.append(">");
        super(b0, u, q0, g, kotlin.reflect.jvm.internal.impl.name.e.l(sb.toString()), b2, b3, b4, a, w0);
        s0 u2;
        if (s0 != null) {
            u2 = s0;
        }
        else {
            u2 = this;
        }
        this.U = u2;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13: {
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
            case 10:
            case 11:
            case 12:
            case 13: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "correspondingProperty";
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            case 8: {
                args[0] = "type";
                break;
            }
            case 7: {
                args[0] = "setterDescriptor";
                break;
            }
            case 6: {
                args[0] = "parameter";
                break;
            }
            case 5: {
                args[0] = "source";
                break;
            }
            case 4: {
                args[0] = "kind";
                break;
            }
            case 3: {
                args[0] = "visibility";
                break;
            }
            case 2: {
                args[0] = "modality";
                break;
            }
            case 1:
            case 9: {
                args[0] = "annotations";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            case 13: {
                args[1] = "getOriginal";
                break;
            }
            case 12: {
                args[1] = "getReturnType";
                break;
            }
            case 11: {
                args[1] = "getValueParameters";
                break;
            }
            case 10: {
                args[1] = "getOverriddenDescriptors";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 10:
                case 11:
                case 12:
                case 13: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex = null;
                    switch (n) {
                        default: {
                            ex = new IllegalArgumentException(format2);
                            break;
                        }
                        case 10:
                        case 11:
                        case 12:
                        case 13: {
                            ex = new IllegalStateException(format2);
                            break;
                        }
                    }
                    throw ex;
                }
                case 7:
                case 8:
                case 9: {
                    args[2] = "createSetterParameter";
                    continue;
                }
                case 6: {
                    args[2] = "initialize";
                    continue;
                }
            }
            break;
        }
    }
    
    public static k0 Q0(@e final s0 s0, @e final c0 c0, @e final g g) {
        if (s0 == null) {
            L(7);
        }
        if (c0 == null) {
            L(8);
        }
        if (g == null) {
            L(9);
        }
        return new k0(s0, null, 0, g, kotlin.reflect.jvm.internal.impl.name.e.l("<set-?>"), c0, false, false, false, null, w0.a);
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.i(this, n);
    }
    
    @e
    public s0 R0() {
        final s0 u = this.U;
        if (u == null) {
            L(13);
        }
        return u;
    }
    
    public void S0(@e final e1 t) {
        if (t == null) {
            L(6);
        }
        this.T = t;
    }
    
    @e
    @Override
    public Collection<? extends s0> g() {
        final Collection<p0> m0 = super.M0(false);
        if (m0 == null) {
            L(10);
        }
        return (Collection<? extends s0>)m0;
    }
    
    @e
    @Override
    public c0 getReturnType() {
        final kotlin.reflect.jvm.internal.impl.types.k0 unitType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this).getUnitType();
        if (unitType == null) {
            L(12);
        }
        return (c0)unitType;
    }
    
    @e
    @Override
    public List<e1> m() {
        final e1 t = this.T;
        if (t != null) {
            final List<e1> singletonList = Collections.singletonList(t);
            if (singletonList == null) {
                L(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}
