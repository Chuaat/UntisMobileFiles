// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.j;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.collections.v;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.p;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.d1;

public class s extends t
{
    private final t H;
    private final d1 I;
    private d1 J;
    private List<b1> K;
    private List<b1> L;
    private w0 M;
    
    public s(final t h, final d1 i) {
        this.H = h;
        this.I = i;
    }
    
    private d1 G0() {
        if (this.J == null) {
            if (this.I.k()) {
                this.J = this.I;
            }
            else {
                final List parameters = this.H.l().getParameters();
                this.K = new ArrayList<b1>(parameters.size());
                this.J = kotlin.reflect.jvm.internal.impl.types.p.b(parameters, this.I.j(), (m)this, (List)this.K);
                this.L = v.Z1((Iterable<? extends b1>)this.K, (l<? super b1, Boolean>)new l<b1, Boolean>() {
                    public Boolean a(final b1 b1) {
                        return b1.s0() ^ true;
                    }
                });
            }
        }
        return this.J;
    }
    
    private static /* synthetic */ void O(final int n) {
        String format;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 8 && n != 10 && n != 13 && n != 22) {
            format = "@NotNull method %s.%s must not return null";
        }
        else {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        int n2;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 8 && n != 10 && n != 13 && n != 22) {
            n2 = 2;
        }
        else {
            n2 = 3;
        }
        final Object[] args = new Object[n2];
        Label_0193: {
            Label_0188: {
                if (n != 2) {
                    Label_0180: {
                        if (n != 3) {
                            if (n != 5) {
                                if (n == 6) {
                                    break Label_0180;
                                }
                                if (n == 8) {
                                    break Label_0188;
                                }
                                if (n != 10) {
                                    if (n == 13) {
                                        break Label_0180;
                                    }
                                    if (n != 22) {
                                        args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                        break Label_0193;
                                    }
                                    args[0] = "substitutor";
                                    break Label_0193;
                                }
                            }
                            args[0] = "typeSubstitution";
                            break Label_0193;
                        }
                    }
                    args[0] = "kotlinTypeRefiner";
                    break Label_0193;
                }
            }
            args[0] = "typeArguments";
        }
        switch (n) {
            default: {
                args[1] = "getTypeConstructor";
                break;
            }
            case 30: {
                args[1] = "getSealedSubclasses";
                break;
            }
            case 29: {
                args[1] = "getDeclaredTypeParameters";
                break;
            }
            case 28: {
                args[1] = "getSource";
                break;
            }
            case 27: {
                args[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 26: {
                args[1] = "getVisibility";
                break;
            }
            case 25: {
                args[1] = "getModality";
                break;
            }
            case 24: {
                args[1] = "getKind";
                break;
            }
            case 23: {
                args[1] = "substitute";
                break;
            }
            case 21: {
                args[1] = "getContainingDeclaration";
                break;
            }
            case 20: {
                args[1] = "getOriginal";
                break;
            }
            case 19: {
                args[1] = "getName";
                break;
            }
            case 18: {
                args[1] = "getAnnotations";
                break;
            }
            case 17: {
                args[1] = "getConstructors";
                break;
            }
            case 16: {
                args[1] = "getDefaultType";
                break;
            }
            case 15: {
                args[1] = "getStaticScope";
                break;
            }
            case 12:
            case 14: {
                args[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 4:
            case 7:
            case 9:
            case 11: {
                args[1] = "getMemberScope";
                break;
            }
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 22: {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            }
        }
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 8 && n != 10) {
            if (n != 13) {
                if (n == 22) {
                    args[2] = "substitute";
                }
            }
            else {
                args[2] = "getUnsubstitutedMemberScope";
            }
        }
        else {
            args[2] = "getMemberScope";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 8 && n != 10 && n != 13 && n != 22) {
            ex = new IllegalStateException(format2);
        }
        else {
            ex = new IllegalArgumentException(format2);
        }
        throw ex;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 A() {
        final k0 j = d0.j(this.getAnnotations(), this.l(), f1.g(this.l().getParameters()), false, this.E0());
        if (j == null) {
            O(16);
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h B0() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b0 = this.H.B0();
        if (b0 == null) {
            O(27);
        }
        return b0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> C() {
        this.G0();
        final List<b1> l = this.L;
        if (l == null) {
            O(29);
        }
        return l;
    }
    
    @Override
    public boolean D() {
        return this.H.D();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h E0() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h m = this.M(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.k(d.g((m)this.H)));
        if (m == null) {
            O(12);
        }
        return m;
    }
    
    @Override
    public boolean F0() {
        return this.H.F0();
    }
    
    @Override
    public boolean G() {
        return this.H.G();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public t0 K0() {
        throw new UnsupportedOperationException();
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h L(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.b1 b1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (b1 == null) {
            O(5);
        }
        if (g == null) {
            O(6);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h l = this.H.L(b1, g);
        if (this.I.k()) {
            if (l == null) {
                O(7);
            }
            return l;
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(l, this.G0());
    }
    
    @org.jetbrains.annotations.e
    public e L0(@org.jetbrains.annotations.e final d1 d1) {
        if (d1 == null) {
            O(22);
        }
        if (d1.k()) {
            return this;
        }
        return new s(this, d1.h(d1.j(), this.G0().j()));
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h M(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        if (g == null) {
            O(13);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h m = this.H.M(g);
        if (this.I.k()) {
            if (m == null) {
                O(14);
            }
            return m;
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new kotlin.reflect.jvm.internal.impl.resolve.scopes.m(m, this.G0());
    }
    
    @Override
    public <R, D> R P(final o<R, D> o, final D n) {
        return o.a(this, n);
    }
    
    @Override
    public boolean Q() {
        return this.H.Q();
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.d U() {
        return this.H.U();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h V() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h v = this.H.V();
        if (v == null) {
            O(15);
        }
        return v;
    }
    
    @Override
    public e X() {
        return this.H.X();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e b() {
        final e b = this.H.b();
        if (b == null) {
            O(20);
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m c() {
        final m c = this.H.c();
        if (c == null) {
            O(21);
        }
        return c;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h e0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.b1 b1) {
        if (b1 == null) {
            O(10);
        }
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h l = this.L(b1, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.k(d.g((m)this)));
        if (l == null) {
            O(11);
        }
        return l;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = this.H.getAnnotations();
        if (annotations == null) {
            O(18);
        }
        return annotations;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final kotlin.reflect.jvm.internal.impl.name.e name = this.H.getName();
        if (name == null) {
            O(19);
        }
        return name;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u visibility = this.H.getVisibility();
        if (visibility == null) {
            O(26);
        }
        return visibility;
    }
    
    @Override
    public boolean isExternal() {
        return this.H.isExternal();
    }
    
    @Override
    public boolean isInline() {
        return this.H.isInline();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> j() {
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> j = this.H.j();
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d>(j.size());
        for (final kotlin.reflect.jvm.internal.impl.descriptors.d d : j) {
            list.add(((kotlin.reflect.jvm.internal.impl.descriptors.d)d.B().g(d.b()).c(d.o()).n(d.getVisibility()).q(d.n()).j(false).h()).d(this.G0()));
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>)list;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.w0 k() {
        final kotlin.reflect.jvm.internal.impl.descriptors.w0 a = kotlin.reflect.jvm.internal.impl.descriptors.w0.a;
        if (a == null) {
            O(28);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 l() {
        final w0 l = this.H.l();
        if (this.I.k()) {
            if (l == null) {
                O(0);
            }
            return l;
        }
        if (this.M == null) {
            final d1 g0 = this.G0();
            final Collection k = l.k();
            final ArrayList list = new ArrayList<c0>(k.size());
            final Iterator<c0> iterator = k.iterator();
            while (iterator.hasNext()) {
                list.add(g0.p((c0)iterator.next(), k1.K));
            }
            this.M = (w0)new j((e)this, (List)this.K, (Collection)list, kotlin.reflect.jvm.internal.impl.storage.f.e);
        }
        final w0 m = this.M;
        if (m == null) {
            O(1);
        }
        return m;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.f n() {
        final kotlin.reflect.jvm.internal.impl.descriptors.f n = this.H.n();
        if (n == null) {
            O(24);
        }
        return n;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b0 o() {
        final b0 o = this.H.o();
        if (o == null) {
            O(25);
        }
        return o;
    }
    
    @Override
    public boolean q() {
        return this.H.q();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<e> s() {
        final Collection<e> s = this.H.s();
        if (s == null) {
            O(30);
        }
        return s;
    }
    
    @Override
    public boolean t() {
        return this.H.t();
    }
    
    @Override
    public boolean u() {
        return this.H.u();
    }
}
