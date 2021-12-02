// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.storage.n;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;

public abstract class d extends k implements a1
{
    @e
    private final u K;
    private List<? extends b1> L;
    @e
    private final d$c M;
    
    public d(@e final m m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0, @e final u k) {
        k0.p(m, "containingDeclaration");
        k0.p(g, "annotations");
        k0.p(e, "name");
        k0.p(w0, "sourceElement");
        k0.p(k, "visibilityImpl");
        super(m, g, e, w0);
        this.K = k;
        this.M = new kotlin.reflect.jvm.internal.impl.types.w0() {
            final /* synthetic */ d a;
            
            @e
            public kotlin.reflect.jvm.internal.impl.types.w0 b(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
                k0.p(g, "kotlinTypeRefiner");
                return (kotlin.reflect.jvm.internal.impl.types.w0)this;
            }
            
            public boolean d() {
                return true;
            }
            
            @e
            public a1 e() {
                return this.a;
            }
            
            @e
            public List<b1> getParameters() {
                return this.a.N0();
            }
            
            @e
            public Collection<c0> k() {
                final Collection k = ((c0)this.e().k0()).N0().k();
                k0.o(k, "declarationDescriptor.underlyingType.constructor.supertypes");
                return (Collection<c0>)k;
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("[typealias ");
                sb.append(this.e().getName().d());
                sb.append(']');
                return sb.toString();
            }
            
            @e
            public KotlinBuiltIns w() {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this.e());
            }
        };
    }
    
    @e
    @Override
    public List<b1> C() {
        final List<? extends b1> l = this.L;
        if (l != null) {
            return (List<b1>)l;
        }
        k0.S("declaredTypeParametersImpl");
        throw null;
    }
    
    @Override
    public boolean F0() {
        return false;
    }
    
    @e
    protected final kotlin.reflect.jvm.internal.impl.types.k0 G0() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e y = this.y();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h e0;
        if (y == null) {
            e0 = null;
        }
        else {
            e0 = y.E0();
        }
        Object b = e0;
        if (e0 == null) {
            b = h$c.b;
        }
        final kotlin.reflect.jvm.internal.impl.types.k0 t = f1.t((h)this, (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)b, (l)new l<kotlin.reflect.jvm.internal.impl.types.checker.g, kotlin.reflect.jvm.internal.impl.types.k0>() {
            final /* synthetic */ d G;
            
            public final kotlin.reflect.jvm.internal.impl.types.k0 a(final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
                final h e = g.e((m)this.G);
                kotlin.reflect.jvm.internal.impl.types.k0 a;
                if (e == null) {
                    a = null;
                }
                else {
                    a = e.A();
                }
                return a;
            }
        });
        k0.o(t, "@OptIn(TypeRefinement::class)\n    protected fun computeDefaultType(): SimpleType =\n        TypeUtils.makeUnsubstitutedType(this, classDescriptor?.unsubstitutedMemberScope ?: MemberScope.Empty) { kotlinTypeRefiner ->\n            kotlinTypeRefiner.refineDescriptor(this)?.defaultType\n        }");
        return t;
    }
    
    @e
    public a1 L0() {
        return (a1)super.O();
    }
    
    @e
    public final Collection<h0> M0() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e y = this.y();
        if (y == null) {
            return (Collection<h0>)v.E();
        }
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> j = y.j();
        k0.o(j, "classDescriptor.constructors");
        final ArrayList<h0> list = new ArrayList<h0>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.d d : j) {
            final i0.a n0 = i0.n0;
            final kotlin.reflect.jvm.internal.impl.storage.n l0 = this.l0();
            k0.o(d, "it");
            final h0 b = n0.b(l0, this, d);
            if (b != null) {
                list.add(b);
            }
        }
        return list;
    }
    
    @e
    protected abstract List<b1> N0();
    
    public final void O0(@e final List<? extends b1> l) {
        k0.p(l, "declaredTypeParameters");
        this.L = l;
    }
    
    @Override
    public <R, D> R P(@e final o<R, D> o, final D n) {
        k0.p(o, "visitor");
        return o.e(this, n);
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    @e
    @Override
    public u getVisibility() {
        return this.K;
    }
    
    @Override
    public boolean isExternal() {
        return false;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.w0 l() {
        return (kotlin.reflect.jvm.internal.impl.types.w0)this.M;
    }
    
    @e
    protected abstract kotlin.reflect.jvm.internal.impl.storage.n l0();
    
    @e
    @Override
    public b0 o() {
        return b0.H;
    }
    
    @e
    @Override
    public String toString() {
        return k0.C("typealias ", this.getName().d());
    }
    
    @Override
    public boolean u() {
        return f1.c((c0)this.k0(), (l)new l<j1, Boolean>() {
            final /* synthetic */ d G;
            
            public final Boolean a(final j1 j1) {
                k0.o(j1, "type");
                final boolean a = e0.a((c0)j1);
                boolean b = true;
                if (!a) {
                    final d g = this.G;
                    final h c = ((c0)j1).N0().c();
                    if (c instanceof b1 && !k0.g(((b1)c).c(), g)) {
                        return b;
                    }
                }
                b = false;
                return b;
            }
        });
    }
}
