// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;

public abstract class l0 extends k implements g1
{
    protected c0 K;
    
    public l0(@e final m m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @f final c0 k, @e final w0 w0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (w0 == null) {
            L(3);
        }
        super(m, g, e, w0);
        this.K = k;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
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
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
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
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            }
            case 3: {
                args[0] = "source";
                break;
            }
            case 2: {
                args[0] = "name";
                break;
            }
            case 1: {
                args[0] = "annotations";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            }
            case 9: {
                args[1] = "getReturnType";
                break;
            }
            case 8: {
                args[1] = "getTypeParameters";
                break;
            }
            case 7: {
                args[1] = "getOverriddenDescriptors";
                break;
            }
            case 6: {
                args[1] = "getValueParameters";
                break;
            }
            case 5: {
                args[1] = "getOriginal";
                break;
            }
            case 4: {
                args[1] = "getType";
                break;
            }
        }
        switch (n) {
            default: {
                args[2] = "<init>";
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                final String format2 = String.format(format, args);
                RuntimeException ex = null;
                switch (n) {
                    default: {
                        ex = new IllegalArgumentException(format2);
                        break;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        ex = new IllegalStateException(format2);
                        break;
                    }
                }
                throw ex;
            }
        }
    }
    
    @e
    public g1 G0() {
        final g1 g1 = (g1)super.O();
        if (g1 == null) {
            L(5);
        }
        return g1;
    }
    
    @Override
    public boolean K() {
        return false;
    }
    
    public void L0(final c0 k) {
        this.K = k;
    }
    
    @e
    @Override
    public c0 a() {
        final c0 k = this.K;
        if (k == null) {
            L(4);
        }
        return k;
    }
    
    @e
    @Override
    public Collection<? extends a> g() {
        final Set<? extends a> emptySet = Collections.emptySet();
        if (emptySet == null) {
            L(7);
        }
        return emptySet;
    }
    
    @e
    @Override
    public c0 getReturnType() {
        final c0 a = this.a();
        if (a == null) {
            L(9);
        }
        return a;
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
    
    @Override
    public t0 j0() {
        return null;
    }
    
    @e
    @Override
    public List<e1> m() {
        final List<e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            L(6);
        }
        return emptyList;
    }
    
    @f
    @Override
    public <V> V m0(final a.a<V> a) {
        return null;
    }
    
    @Override
    public boolean p() {
        return false;
    }
    
    @Override
    public t0 q0() {
        return null;
    }
}
