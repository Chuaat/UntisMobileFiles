// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.collections.q0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.util.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;

public final class e extends f0
{
    @org.jetbrains.annotations.e
    public static final a j0;
    
    static {
        j0 = new a(null);
    }
    
    private e(final m m, final e e, final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, final boolean b) {
        super(m, e, g.r.b(), kotlin.reflect.jvm.internal.impl.util.j.h, a, w0.a);
        this.g1(true);
        this.i1(b);
        this.Z0(false);
    }
    
    private final y q1(final List<kotlin.reflect.jvm.internal.impl.name.e> list) {
        final int size = this.m().size();
        final int size2 = list.size();
        boolean b = true;
        final List<e1> m = this.m();
        k0.o(m, "valueParameters");
        final ArrayList list2 = new ArrayList<e1>(v.Y((Iterable<?>)m, 10));
        for (final e1 e1 : m) {
            final kotlin.reflect.jvm.internal.impl.name.e name = e1.getName();
            k0.o(name, "it.name");
            final int i = e1.i();
            final int n = i - (size - size2);
            kotlin.reflect.jvm.internal.impl.name.e e2 = name;
            if (n >= 0) {
                final kotlin.reflect.jvm.internal.impl.name.e e3 = list.get(n);
                e2 = name;
                if (e3 != null) {
                    e2 = e3;
                }
            }
            list2.add(e1.H0(this, e2, i));
        }
        final c t0 = this.T0(d1.b);
        Label_0237: {
            if (!list.isEmpty()) {
                final Iterator<kotlin.reflect.jvm.internal.impl.name.e> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next() == null) {
                        break Label_0237;
                    }
                }
            }
            b = false;
        }
        final c n2 = t0.G(b).U((List<e1>)list2).N(this.n1());
        k0.o(n2, "newCopyBuilder(TypeSubstitutor.EMPTY)\n                .setHasSynthesizedParameterNames(parameterNames.any { it == null })\n                .setValueParameters(newValueParameters)\n                .setOriginal(original)");
        final y n3 = super.N0(n2);
        k0.m(n3);
        return n3;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected p M0(@org.jetbrains.annotations.e final m m, @f final y y, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, @f final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final w0 w0) {
        k0.p(m, "newOwner");
        k0.p(a, "kind");
        k0.p(g, "annotations");
        k0.p(w0, "source");
        return new e(m, (e)y, a, this.isSuspend());
    }
    
    @f
    @Override
    protected y N0(@org.jetbrains.annotations.e final c c) {
        k0.p(c, "configuration");
        final e e = (e)super.N0(c);
        if (e == null) {
            return null;
        }
        final List<e1> m = e.m();
        k0.o(m, "substituted.valueParameters");
        final boolean b = m instanceof Collection;
        final int n = 0;
        int n2 = 0;
        Label_0124: {
            if (!b || !m.isEmpty()) {
                final Iterator<Object> iterator = m.iterator();
                while (iterator.hasNext()) {
                    final c0 a = iterator.next().a();
                    k0.o(a, "it.type");
                    if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(a) != null) {
                        n2 = n;
                        break Label_0124;
                    }
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            return e;
        }
        final List<e1> i = e.m();
        k0.o(i, "substituted.valueParameters");
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(v.Y((Iterable<?>)i, 10));
        final Iterator<Object> iterator2 = i.iterator();
        while (iterator2.hasNext()) {
            final c0 a2 = iterator2.next().a();
            k0.o(a2, "it.type");
            list.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(a2));
        }
        return e.q1((List<kotlin.reflect.jvm.internal.impl.name.e>)list);
    }
    
    @Override
    public boolean T() {
        return false;
    }
    
    @Override
    public boolean isExternal() {
        return false;
    }
    
    @Override
    public boolean isInline() {
        return false;
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final e1 b(final e e, final int n, final b1 b1) {
            final String d = b1.getName().d();
            k0.o(d, "typeParameter.name.asString()");
            String lowerCase;
            if (k0.g(d, "T")) {
                lowerCase = "instance";
            }
            else if (k0.g(d, "E")) {
                lowerCase = "receiver";
            }
            else {
                lowerCase = d.toLowerCase();
                k0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            }
            final g b2 = g.r.b();
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(lowerCase);
            k0.o(i, "identifier(name)");
            final kotlin.reflect.jvm.internal.impl.types.k0 a = b1.A();
            k0.o(a, "typeParameter.defaultType");
            final w0 a2 = w0.a;
            k0.o(a2, "NO_SOURCE");
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.k0(e, null, n, b2, i, (c0)a, false, false, false, null, a2);
        }
        
        @org.jetbrains.annotations.e
        public final e a(@org.jetbrains.annotations.e final b b, final boolean b2) {
            k0.p(b, "functionClass");
            final List<b1> c = b.C();
            final e e = new e(b, null, kotlin.reflect.jvm.internal.impl.descriptors.b.a.G, b2, null);
            final t0 k0 = b.K0();
            final List<? extends b1> e2 = v.E();
            final ArrayList<b1> list = new ArrayList<b1>();
            for (final b1 next : c) {
                if (next.v() != k1.L) {
                    break;
                }
                list.add(next);
            }
            final Iterable<q0<Object>> u5 = v.U5((Iterable<?>)list);
            final ArrayList list2 = new ArrayList<e1>(v.Y((Iterable<?>)u5, 10));
            for (final q0<Object> q0 : u5) {
                list2.add(this.b(e, q0.e(), q0.f()));
            }
            e.o1(null, k0, e2, (List<e1>)list2, (c0)v.c3((List<? extends b1>)c).A(), kotlin.reflect.jvm.internal.impl.descriptors.b0.K, t.e);
            e.a1(true);
            return e;
        }
    }
}
