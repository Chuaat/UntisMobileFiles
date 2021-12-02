// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.collections.t0;
import kotlin.j2;
import kotlin.collections.v;
import kotlin.ranges.k;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a;

public final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.a
{
    @org.jetbrains.annotations.e
    public static final a T;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.name.a U;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.name.a V;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.n M;
    @org.jetbrains.annotations.e
    private final h0 N;
    @org.jetbrains.annotations.e
    private final c O;
    private final int P;
    @org.jetbrains.annotations.e
    private final b Q;
    @org.jetbrains.annotations.e
    private final d R;
    @org.jetbrains.annotations.e
    private final List<b1> S;
    
    static {
        T = new a(null);
        U = new kotlin.reflect.jvm.internal.impl.name.a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.name.e.i("Function"));
        V = new kotlin.reflect.jvm.internal.impl.name.a(StandardNames.KOTLIN_REFLECT_FQ_NAME, kotlin.reflect.jvm.internal.impl.name.e.i("KFunction"));
    }
    
    public b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n m, @org.jetbrains.annotations.e final h0 n, @org.jetbrains.annotations.e final c o, int b) {
        k0.p(m, "storageManager");
        k0.p(n, "containingDeclaration");
        k0.p(o, "functionKind");
        super(m, o.f(b));
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = b;
        this.Q = new b();
        this.R = new d(m, this);
        final ArrayList<b1> list = new ArrayList<b1>();
        final k k = new k(1, b);
        final ArrayList list2 = new ArrayList<j2>(v.Y((Iterable<?>)k, 10));
        final Iterator<? extends T> iterator = ((Iterable<? extends T>)k).iterator();
        while (iterator.hasNext()) {
            b = ((t0)iterator).b();
            L0(list, this, k1.L, k0.C("P", b));
            list2.add(j2.a);
        }
        L0(list, this, k1.M, "R");
        this.S = (List<b1>)v.I5((Iterable<?>)list);
    }
    
    private static final void L0(final ArrayList<b1> list, final b b, final k1 k1, final String s) {
        list.add(j0.S0(b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), false, k1, kotlin.reflect.jvm.internal.impl.name.e.i(s), list.size(), b.M));
    }
    
    public static final /* synthetic */ h0 M0(final b b) {
        return b.N;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.a N0() {
        return b.U;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.a O0() {
        return b.V;
    }
    
    public static final /* synthetic */ List P0(final b b) {
        return b.S;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.n Q0(final b b) {
        return b.M;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<b1> C() {
        return this.S;
    }
    
    @Override
    public boolean D() {
        return false;
    }
    
    @Override
    public boolean F0() {
        return false;
    }
    
    @Override
    public boolean G() {
        return false;
    }
    
    @Override
    public boolean Q() {
        return false;
    }
    
    public final int R0() {
        return this.P;
    }
    
    @f
    public Void S0() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d> T0() {
        return v.E();
    }
    
    @org.jetbrains.annotations.e
    public h0 U0() {
        return this.N;
    }
    
    @org.jetbrains.annotations.e
    public final c V0() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    public List<e> W0() {
        return v.E();
    }
    
    @org.jetbrains.annotations.e
    public h$c X0() {
        return h$c.b;
    }
    
    @org.jetbrains.annotations.e
    protected d Y0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        k0.p(g, "kotlinTypeRefiner");
        return this.R;
    }
    
    @f
    public Void Z0() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public u getVisibility() {
        final u e = kotlin.reflect.jvm.internal.impl.descriptors.t.e;
        k0.o(e, "PUBLIC");
        return e;
    }
    
    @Override
    public boolean isExternal() {
        return false;
    }
    
    @Override
    public boolean isInline() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 k() {
        final w0 a = w0.a;
        k0.o(a, "NO_SOURCE");
        return a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.w0 l() {
        return (kotlin.reflect.jvm.internal.impl.types.w0)this.Q;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.f n() {
        return kotlin.reflect.jvm.internal.impl.descriptors.f.H;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b0 o() {
        return b0.K;
    }
    
    @Override
    public boolean q() {
        return false;
    }
    
    @Override
    public boolean t() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final String d = this.getName().d();
        k0.o(d, "name.asString()");
        return d;
    }
    
    @Override
    public boolean u() {
        return false;
    }
    
    public static final class a
    {
        private a() {
        }
    }
    
    private final class b extends kotlin.reflect.jvm.internal.impl.types.b
    {
        public b() {
            k0.p(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this, "this$0");
            super(kotlin.reflect.jvm.internal.impl.builtins.functions.b.Q0(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this));
        }
        
        public boolean d() {
            return true;
        }
        
        @org.jetbrains.annotations.e
        protected Collection<c0> g() {
            final int n = a.a[kotlin.reflect.jvm.internal.impl.builtins.functions.b.this.V0().ordinal()];
            List<kotlin.reflect.jvm.internal.impl.name.a> list = null;
            Label_0138: {
                if (n != 1) {
                    if (n == 2) {
                        list = v.L(kotlin.reflect.jvm.internal.impl.builtins.functions.b.O0(), new kotlin.reflect.jvm.internal.impl.name.a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, c.J.f(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this.R0())));
                        break Label_0138;
                    }
                    if (n != 3) {
                        if (n == 4) {
                            list = v.L(kotlin.reflect.jvm.internal.impl.builtins.functions.b.O0(), new kotlin.reflect.jvm.internal.impl.name.a(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, c.K.f(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this.R0())));
                            break Label_0138;
                        }
                        throw new kotlin.h0();
                    }
                }
                list = v.k(kotlin.reflect.jvm.internal.impl.builtins.functions.b.N0());
            }
            final e0 c = kotlin.reflect.jvm.internal.impl.builtins.functions.b.M0(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this).c();
            final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.types.k0>(v.Y((Iterable<?>)list, 10));
            for (final kotlin.reflect.jvm.internal.impl.name.a obj : list) {
                final e a = x.a(c, obj);
                if (a == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Built-in class ");
                    sb.append(obj);
                    sb.append(" not found");
                    throw new IllegalStateException(sb.toString().toString());
                }
                final List<Object> x5 = v.x5((List<?>)this.getParameters(), a.l().getParameters().size());
                final ArrayList list3 = new ArrayList<a1>(v.Y((Iterable<?>)x5, 10));
                final Iterator<b1> iterator2 = x5.iterator();
                while (iterator2.hasNext()) {
                    list3.add(new a1((c0)iterator2.next().A()));
                }
                final d0 a2 = d0.a;
                list2.add(d0.g(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), a, (List)list3));
            }
            return (Collection<c0>)v.I5((Iterable<?>)list2);
        }
        
        @org.jetbrains.annotations.e
        public List<b1> getParameters() {
            return (List<b1>)kotlin.reflect.jvm.internal.impl.builtins.functions.b.P0(kotlin.reflect.jvm.internal.impl.builtins.functions.b.this);
        }
        
        @org.jetbrains.annotations.e
        protected z0 l() {
            return z0.a.a;
        }
        
        @org.jetbrains.annotations.e
        public String toString() {
            return this.u().toString();
        }
        
        @org.jetbrains.annotations.e
        public kotlin.reflect.jvm.internal.impl.builtins.functions.b u() {
            return kotlin.reflect.jvm.internal.impl.builtins.functions.b.this;
        }
    }
}
