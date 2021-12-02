// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;

public class c0 extends a0 implements r0
{
    private kotlin.reflect.jvm.internal.impl.types.c0 T;
    @e
    private final r0 U;
    
    public c0(@e final q0 q0, @e final g g, @e final b0 b0, @e final u u, final boolean b2, final boolean b3, final boolean b4, @e final b.a a, @f r0 u2, @e final w0 w0) {
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
        sb.append("<get-");
        sb.append(q0.getName());
        sb.append(">");
        super(b0, u, q0, g, kotlin.reflect.jvm.internal.impl.name.e.l(sb.toString()), b2, b3, b4, a, w0);
        if (u2 == null) {
            u2 = this;
        }
        this.U = u2;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 6 && n != 7 && n != 8) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 6 && n != 7 && n != 8) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "correspondingProperty";
                break;
            }
            case 6:
            case 7:
            case 8: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
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
            case 1: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 6) {
            if (n != 7) {
                if (n != 8) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                }
                else {
                    args[1] = "getOriginal";
                }
            }
            else {
                args[1] = "getValueParameters";
            }
        }
        else {
            args[1] = "getOverriddenDescriptors";
        }
        if (n != 6 && n != 7 && n != 8) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 6 && n != 7 && n != 8) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.b(this, n);
    }
    
    @e
    public r0 Q0() {
        final r0 u = this.U;
        if (u == null) {
            L(8);
        }
        return u;
    }
    
    public void R0(final kotlin.reflect.jvm.internal.impl.types.c0 c0) {
        kotlin.reflect.jvm.internal.impl.types.c0 a = c0;
        if (c0 == null) {
            a = this.C0().a();
        }
        this.T = a;
    }
    
    @e
    @Override
    public Collection<? extends r0> g() {
        final Collection<p0> m0 = super.M0(true);
        if (m0 == null) {
            L(6);
        }
        return (Collection<? extends r0>)m0;
    }
    
    @Override
    public kotlin.reflect.jvm.internal.impl.types.c0 getReturnType() {
        return this.T;
    }
    
    @e
    @Override
    public List<e1> m() {
        final List<e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            L(7);
        }
        return emptyList;
    }
}
