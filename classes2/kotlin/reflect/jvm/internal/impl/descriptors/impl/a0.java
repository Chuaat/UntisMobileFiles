// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

public abstract class a0 extends k implements p0
{
    private boolean K;
    private final boolean L;
    private final b0 M;
    private final q0 N;
    private final boolean O;
    private final b.a P;
    private u Q;
    @f
    private y R;
    
    public a0(@e final b0 m, @e final u q, @e final q0 n, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, final boolean k, final boolean l, final boolean o, final b.a p10, @e final w0 w0) {
        if (m == null) {
            L(0);
        }
        if (q == null) {
            L(1);
        }
        if (n == null) {
            L(2);
        }
        if (g == null) {
            L(3);
        }
        if (e == null) {
            L(4);
        }
        if (w0 == null) {
            L(5);
        }
        super(n.c(), g, e, w0);
        this.R = null;
        this.M = m;
        this.Q = q;
        this.N = n;
        this.K = k;
        this.L = l;
        this.O = o;
        this.P = p10;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 6:
            case 8:
            case 9:
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
            case 6:
            case 8:
            case 9:
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
                args[0] = "modality";
                break;
            }
            case 14: {
                args[0] = "overriddenDescriptors";
                break;
            }
            case 7: {
                args[0] = "substitutor";
                break;
            }
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 5: {
                args[0] = "source";
                break;
            }
            case 4: {
                args[0] = "name";
                break;
            }
            case 3: {
                args[0] = "annotations";
                break;
            }
            case 2: {
                args[0] = "correspondingProperty";
                break;
            }
            case 1: {
                args[0] = "visibility";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 13: {
                args[1] = "getOverriddenDescriptors";
                break;
            }
            case 12: {
                args[1] = "getCorrespondingProperty";
                break;
            }
            case 11: {
                args[1] = "getCorrespondingVariable";
                break;
            }
            case 10: {
                args[1] = "getVisibility";
                break;
            }
            case 9: {
                args[1] = "getModality";
                break;
            }
            case 8: {
                args[1] = "getTypeParameters";
                break;
            }
            case 6: {
                args[1] = "getKind";
                break;
            }
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 6:
                case 8:
                case 9:
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
                        case 6:
                        case 8:
                        case 9:
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
                case 14: {
                    args[2] = "setOverriddenDescriptors";
                    continue;
                }
                case 7: {
                    args[2] = "substitute";
                    continue;
                }
            }
            break;
        }
    }
    
    @Override
    public void A0(@e final Collection<? extends b> collection) {
        if (collection == null) {
            L(14);
        }
    }
    
    @e
    @Override
    public y.a<? extends y> B() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }
    
    @e
    @Override
    public q0 C0() {
        final q0 n = this.N;
        if (n == null) {
            L(12);
        }
        return n;
    }
    
    @Override
    public boolean D0() {
        return false;
    }
    
    @Override
    public boolean F0() {
        return false;
    }
    
    @e
    public p0 G0(final m m, final b0 b0, final u u, final b.a a, final boolean b2) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }
    
    @Override
    public boolean K() {
        return false;
    }
    
    @e
    public abstract p0 L0();
    
    @e
    protected Collection<p0> M0(final boolean b) {
        final ArrayList<r0> list = new ArrayList<r0>(0);
        for (final q0 q0 : this.C0().g()) {
            Object o;
            if (b) {
                o = q0.e();
            }
            else {
                o = q0.h();
            }
            if (o != null) {
                list.add((r0)o);
            }
        }
        return (Collection<p0>)list;
    }
    
    public void N0(final boolean k) {
        this.K = k;
    }
    
    public void O0(@f final y r) {
        this.R = r;
    }
    
    public void P0(final u q) {
        this.Q = q;
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    @Override
    public boolean T() {
        return false;
    }
    
    @Override
    public boolean Y() {
        return this.K;
    }
    
    @e
    @Override
    public y d(@e final d1 d1) {
        if (d1 == null) {
            L(7);
        }
        throw new UnsupportedOperationException();
    }
    
    @e
    @Override
    public List<b1> getTypeParameters() {
        final List<b1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            L(8);
        }
        return emptyList;
    }
    
    @e
    @Override
    public u getVisibility() {
        final u q = this.Q;
        if (q == null) {
            L(10);
        }
        return q;
    }
    
    @f
    @Override
    public y h0() {
        return this.R;
    }
    
    @Override
    public boolean isExternal() {
        return this.L;
    }
    
    @Override
    public boolean isInfix() {
        return false;
    }
    
    @Override
    public boolean isInline() {
        return this.O;
    }
    
    @Override
    public boolean isOperator() {
        return false;
    }
    
    @Override
    public boolean isSuspend() {
        return false;
    }
    
    @f
    @Override
    public t0 j0() {
        return this.C0().j0();
    }
    
    @f
    @Override
    public <V> V m0(final a.a<V> a) {
        return null;
    }
    
    @e
    @Override
    public b.a n() {
        final b.a p = this.P;
        if (p == null) {
            L(6);
        }
        return p;
    }
    
    @e
    @Override
    public b0 o() {
        final b0 m = this.M;
        if (m == null) {
            L(9);
        }
        return m;
    }
    
    @f
    @Override
    public t0 q0() {
        return this.C0().q0();
    }
    
    @Override
    public boolean z0() {
        return false;
    }
}
