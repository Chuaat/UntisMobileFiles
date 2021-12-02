// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;

public abstract class c extends j implements t0
{
    private static final e I;
    
    static {
        I = e.l("<this>");
    }
    
    public c(@org.jetbrains.annotations.e final g g) {
        if (g == null) {
            L(0);
        }
        super(g, c.I);
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "annotations";
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            case 1: {
                args[0] = "substitutor";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            case 8: {
                args[1] = "getSource";
                break;
            }
            case 7: {
                args[1] = "getOriginal";
                break;
            }
            case 6: {
                args[1] = "getVisibility";
                break;
            }
            case 5: {
                args[1] = "getOverriddenDescriptors";
                break;
            }
            case 4: {
                args[1] = "getValueParameters";
                break;
            }
            case 3: {
                args[1] = "getType";
                break;
            }
            case 2: {
                args[1] = "getTypeParameters";
                break;
            }
        }
        switch (n) {
            case 1: {
                args[2] = "substitute";
            }
            default: {
                args[2] = "<init>";
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                final String format2 = String.format(format, args);
                RuntimeException ex = null;
                switch (n) {
                    default: {
                        ex = new IllegalArgumentException(format2);
                        break;
                    }
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        ex = new IllegalStateException(format2);
                        break;
                    }
                }
                throw ex;
            }
        }
    }
    
    @Override
    public boolean K() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    public n0 O() {
        return this;
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.l(this, n);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public c0 a() {
        final c0 a = this.getValue().a();
        if (a == null) {
            L(3);
        }
        return a;
    }
    
    @f
    @Override
    public t0 d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.d1 d1) {
        if (d1 == null) {
            L(1);
        }
        if (d1.k()) {
            return this;
        }
        c0 c0;
        k1 k1;
        if (this.c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            c0 = this.a();
            k1 = kotlin.reflect.jvm.internal.impl.types.k1.M;
        }
        else {
            c0 = this.a();
            k1 = kotlin.reflect.jvm.internal.impl.types.k1.K;
        }
        final c0 p = d1.p(c0, k1);
        if (p == null) {
            return null;
        }
        if (p == this.a()) {
            return this;
        }
        return new e0(this.c(), (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)new h(p), this.getAnnotations());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<? extends a> g() {
        final Set<? extends a> emptySet = Collections.emptySet();
        if (emptySet == null) {
            L(5);
        }
        return emptySet;
    }
    
    @f
    @Override
    public c0 getReturnType() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> getTypeParameters() {
        final List<b1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            L(2);
        }
        return emptyList;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u f = t.f;
        if (f == null) {
            L(6);
        }
        return f;
    }
    
    @f
    @Override
    public t0 j0() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 k() {
        final w0 a = w0.a;
        if (a == null) {
            L(8);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<e1> m() {
        final List<e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            L(4);
        }
        return emptyList;
    }
    
    @f
    @Override
    public <V> V m0(final a.a<V> a) {
        return null;
    }
    
    @f
    @Override
    public t0 q0() {
        return null;
    }
}
