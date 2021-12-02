// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.utils.i;
import java.util.Collections;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public abstract class b extends h implements w0
{
    private int c;
    
    public b(@e final n n) {
        if (n == null) {
            q(0);
        }
        super(n);
        this.c = 0;
    }
    
    private static /* synthetic */ void q(final int n) {
        String format;
        if (n != 1 && n != 3 && n != 4) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 3 && n != 4) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        Label_0092: {
            if (n != 1) {
                if (n == 2) {
                    args[0] = "descriptor";
                    break Label_0092;
                }
                if (n != 3 && n != 4) {
                    args[0] = "storageManager";
                    break Label_0092;
                }
            }
            args[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (n != 1) {
            if (n != 3 && n != 4) {
                args[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            else {
                args[1] = "getAdditionalNeighboursInSupertypeGraph";
            }
        }
        else {
            args[1] = "getBuiltIns";
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    args[2] = "<init>";
                }
            }
            else {
                args[2] = "hasMeaningfulFqName";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 1 && n != 3 && n != 4) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    private static boolean r(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        final boolean equals = ((f0)e).getName().equals(((f0)e2).getName());
        final boolean b = false;
        if (!equals) {
            return false;
        }
        final m c = e.c();
        for (m m = e2.c(), c2 = c; c2 != null && m != null; c2 = c2.c(), m = m.c()) {
            if (c2 instanceof e0) {
                return m instanceof e0;
            }
            if (m instanceof e0) {
                return false;
            }
            if (c2 instanceof h0) {
                boolean b2 = b;
                if (m instanceof h0) {
                    b2 = b;
                    if (((h0)c2).f().equals(((h0)m).f())) {
                        b2 = true;
                    }
                }
                return b2;
            }
            if (m instanceof h0) {
                return false;
            }
            if (!((f0)c2).getName().equals(((f0)m).getName())) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean t(@e final kotlin.reflect.jvm.internal.impl.descriptors.h h) {
        if (h == null) {
            q(2);
        }
        return !u.r((m)h) && !d.E((m)h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w0)) {
            return false;
        }
        if (o.hashCode() != this.hashCode()) {
            return false;
        }
        final w0 w0 = (w0)o;
        if (w0.getParameters().size() != this.getParameters().size()) {
            return false;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e s = this.s();
        final kotlin.reflect.jvm.internal.impl.descriptors.h c = w0.c();
        if (t((kotlin.reflect.jvm.internal.impl.descriptors.h)s)) {
            if (c == null || t(c)) {
                if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                    return r(s, (kotlin.reflect.jvm.internal.impl.descriptors.e)c);
                }
            }
        }
        return false;
    }
    
    @f
    @Override
    protected c0 h() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.s())) {
            return null;
        }
        return this.w().getAnyType();
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        if (c != 0) {
            return c;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e s = this.s();
        int c2;
        if (t((kotlin.reflect.jvm.internal.impl.descriptors.h)s)) {
            c2 = d.m((m)s).hashCode();
        }
        else {
            c2 = System.identityHashCode(this);
        }
        return this.c = c2;
    }
    
    @e
    @Override
    protected Collection<c0> i(final boolean b) {
        final m c = this.s().c();
        if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            final List<c0> emptyList = Collections.emptyList();
            if (emptyList == null) {
                q(3);
            }
            return emptyList;
        }
        final i<k0> i = (i<k0>)new i<c0>();
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
        i.add(e.A());
        final kotlin.reflect.jvm.internal.impl.descriptors.e x = e.X();
        if (b && x != null) {
            i.add(x.A());
        }
        return (Collection<c0>)i;
    }
    
    @e
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e s();
    
    @e
    @Override
    public KotlinBuiltIns w() {
        final KotlinBuiltIns g = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this.s());
        if (g == null) {
            q(1);
        }
        return g;
    }
}
