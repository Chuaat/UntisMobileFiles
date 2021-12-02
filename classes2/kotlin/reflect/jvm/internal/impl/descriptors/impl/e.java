// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.d0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.Collections;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

public abstract class e extends k implements b1
{
    private final k1 K;
    private final boolean L;
    private final int M;
    private final i<w0> N;
    private final i<k0> O;
    private final kotlin.reflect.jvm.internal.impl.storage.n P;
    
    protected e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n p9, @org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final k1 k, final boolean l, final int i, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.w0 w0, @org.jetbrains.annotations.e final z0 z0) {
        if (p9 == null) {
            L(0);
        }
        if (m == null) {
            L(1);
        }
        if (g == null) {
            L(2);
        }
        if (e == null) {
            L(3);
        }
        if (k == null) {
            L(4);
        }
        if (w0 == null) {
            L(5);
        }
        if (z0 == null) {
            L(6);
        }
        super(m, g, e, w0);
        this.K = k;
        this.L = l;
        this.M = i;
        this.N = (i<w0>)p9.g((n6.a)new n6.a<w0>() {
            public w0 a() {
                return (w0)new c(p9, z0);
            }
        });
        this.O = (i<k0>)p9.g((n6.a)new n6.a<k0>() {
            public k0 a() {
                return d0.j(g.r.b(), e.this.l(), (List)Collections.emptyList(), false, (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new kotlin.reflect.jvm.internal.impl.resolve.scopes.g((a)new a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>() {
                    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h a() {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Scope for type parameter ");
                        sb.append(e.d());
                        return kotlin.reflect.jvm.internal.impl.resolve.scopes.n.k(sb.toString(), (Collection)e.this.getUpperBounds());
                    }
                }));
            }
        });
        this.P = p9;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format = null;
        switch (n) {
            default: {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14: {
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14: {
                n2 = 2;
                break;
            }
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "storageManager";
                break;
            }
            case 12: {
                args[0] = "bounds";
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 6: {
                args[0] = "supertypeLoopChecker";
                break;
            }
            case 5: {
                args[0] = "source";
                break;
            }
            case 4: {
                args[0] = "variance";
                break;
            }
            case 3: {
                args[0] = "name";
                break;
            }
            case 2: {
                args[0] = "annotations";
                break;
            }
            case 1: {
                args[0] = "containingDeclaration";
                break;
            }
        }
        switch (n) {
            default: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 14: {
                args[1] = "getStorageManager";
                break;
            }
            case 13: {
                args[1] = "processBoundsWithoutCycles";
                break;
            }
            case 11: {
                args[1] = "getOriginal";
                break;
            }
            case 10: {
                args[1] = "getDefaultType";
                break;
            }
            case 9: {
                args[1] = "getTypeConstructor";
                break;
            }
            case 8: {
                args[1] = "getUpperBounds";
                break;
            }
            case 7: {
                args[1] = "getVariance";
                break;
            }
        }
        switch (n) {
            case 12: {
                args[2] = "processBoundsWithoutCycles";
            }
            default: {
                args[2] = "<init>";
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14: {
                final String format2 = String.format(format, args);
                RuntimeException ex = null;
                switch (n) {
                    default: {
                        ex = new IllegalArgumentException(format2);
                        break;
                    }
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 13:
                    case 14: {
                        ex = new IllegalStateException(format2);
                        break;
                    }
                }
                throw ex;
            }
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 A() {
        final k0 k0 = ((n6.a<k0>)this.O).invoke();
        if (k0 == null) {
            L(10);
        }
        return k0;
    }
    
    @org.jetbrains.annotations.e
    protected List<c0> G0(@org.jetbrains.annotations.e final List<c0> list) {
        if (list == null) {
            L(12);
        }
        if (list == null) {
            L(13);
        }
        return list;
    }
    
    protected abstract void L0(@org.jetbrains.annotations.e final c0 p0);
    
    @org.jetbrains.annotations.e
    protected abstract List<c0> M0();
    
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.m(this, n);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b1 b() {
        final b1 b1 = (b1)super.O();
        if (b1 == null) {
            L(11);
        }
        return b1;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<c0> getUpperBounds() {
        final List m = ((c)this.l()).m();
        if (m == null) {
            L(8);
        }
        return (List<c0>)m;
    }
    
    @Override
    public int i() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final w0 l() {
        final w0 w0 = ((n6.a<w0>)this.N).invoke();
        if (w0 == null) {
            L(9);
        }
        return w0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.storage.n l0() {
        final kotlin.reflect.jvm.internal.impl.storage.n p = this.P;
        if (p == null) {
            L(14);
        }
        return p;
    }
    
    @Override
    public boolean r() {
        return this.L;
    }
    
    @Override
    public boolean s0() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k1 v() {
        final k1 k = this.K;
        if (k == null) {
            L(7);
        }
        return k;
    }
    
    private class c extends kotlin.reflect.jvm.internal.impl.types.h
    {
        private final z0 c;
        
        public c(final kotlin.reflect.jvm.internal.impl.storage.n n, final z0 c) {
            if (n == null) {
                q(0);
            }
            super(n);
            this.c = c;
        }
        
        private static /* synthetic */ void q(final int n) {
            String format;
            if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 8) {
                format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                format = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 8) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] args = new Object[n2];
            switch (n) {
                default: {
                    args[0] = "storageManager";
                    break;
                }
                case 7: {
                    args[0] = "supertypes";
                    break;
                }
                case 6: {
                    args[0] = "type";
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8: {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                }
            }
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                if (n != 8) {
                                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                                }
                                else {
                                    args[1] = "processSupertypesWithoutCycles";
                                }
                            }
                            else {
                                args[1] = "getSupertypeLoopChecker";
                            }
                        }
                        else {
                            args[1] = "getBuiltIns";
                        }
                    }
                    else {
                        args[1] = "getDeclarationDescriptor";
                    }
                }
                else {
                    args[1] = "getParameters";
                }
            }
            else {
                args[1] = "computeSupertypes";
            }
            while (true) {
                switch (n) {
                    default: {
                        args[2] = "<init>";
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8: {
                        final String format2 = String.format(format, args);
                        RuntimeException ex;
                        if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 8) {
                            ex = new IllegalArgumentException(format2);
                        }
                        else {
                            ex = new IllegalStateException(format2);
                        }
                        throw ex;
                    }
                    case 7: {
                        args[2] = "processSupertypesWithoutCycles";
                        continue;
                    }
                    case 6: {
                        args[2] = "reportSupertypeLoopError";
                        continue;
                    }
                }
                break;
            }
        }
        
        @org.jetbrains.annotations.e
        public h c() {
            final e d = e.this;
            if (d == null) {
                q(3);
            }
            return d;
        }
        
        public boolean d() {
            return true;
        }
        
        @org.jetbrains.annotations.e
        protected Collection<c0> g() {
            final List<c0> m0 = e.this.M0();
            if (m0 == null) {
                q(1);
            }
            return m0;
        }
        
        @org.jetbrains.annotations.e
        public List<b1> getParameters() {
            final List<b1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                q(2);
            }
            return emptyList;
        }
        
        @f
        protected c0 h() {
            return (c0)u.j("Cyclic upper bounds");
        }
        
        @org.jetbrains.annotations.e
        protected z0 l() {
            final z0 c = this.c;
            if (c == null) {
                q(5);
            }
            return c;
        }
        
        @org.jetbrains.annotations.e
        protected List<c0> n(@org.jetbrains.annotations.e final List<c0> list) {
            if (list == null) {
                q(7);
            }
            final List<c0> g0 = e.this.G0(list);
            if (g0 == null) {
                q(8);
            }
            return g0;
        }
        
        protected void p(@org.jetbrains.annotations.e final c0 c0) {
            if (c0 == null) {
                q(6);
            }
            e.this.L0(c0);
        }
        
        public String toString() {
            return e.this.getName().toString();
        }
        
        @org.jetbrains.annotations.e
        public KotlinBuiltIns w() {
            final KotlinBuiltIns g = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)e.this);
            if (g == null) {
                q(4);
            }
            return g;
        }
    }
}
