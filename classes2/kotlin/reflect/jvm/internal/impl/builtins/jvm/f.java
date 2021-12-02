// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.i;
import n6.a;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class f extends KotlinBuiltIns
{
    static final /* synthetic */ o<Object>[] i;
    @org.jetbrains.annotations.f
    private n6.a<b> g;
    @org.jetbrains.annotations.e
    private final i h;
    
    static {
        i = new o[] { k1.r(new f1(k1.d(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;")) };
    }
    
    public f(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final a a) {
        k0.p(n, "storageManager");
        k0.p(a, "kind");
        super(n);
        this.h = n.g((n6.a)new n6.a<g>() {
            final /* synthetic */ f G;
            
            @org.jetbrains.annotations.e
            public final g a() {
                final x builtInsModule = this.G.getBuiltInsModule();
                k0.o(builtInsModule, "builtInsModule");
                return new g(builtInsModule, n, new a<b>() {
                    final /* synthetic */ f G = f$d.this.G;
                    
                    @org.jetbrains.annotations.e
                    public final b a() {
                        final a r = f.r(this.G);
                        if (r != null) {
                            final b invoke = r.invoke();
                            final f g = this.G;
                            final b b = invoke;
                            f.s(g, null);
                            return b;
                        }
                        throw new AssertionError((Object)"JvmBuiltins instance has not been initialized properly");
                    }
                });
            }
        });
        final int n2 = c.a[a.ordinal()];
        boolean b;
        if (n2 != 2) {
            if (n2 != 3) {
                return;
            }
            b = true;
        }
        else {
            b = false;
        }
        this.f(b);
    }
    
    public static final /* synthetic */ n6.a r(final f f) {
        return f.g;
    }
    
    public static final /* synthetic */ void s(final f f, final n6.a g) {
        f.g = (n6.a<b>)g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a g() {
        return this.u();
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c l() {
        return this.u();
    }
    
    @org.jetbrains.annotations.e
    protected List<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> t() {
        final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> j = super.j();
        k0.o(j, "super.getClassDescriptorFactories()");
        final n n = this.n();
        k0.o(n, "storageManager");
        final x builtInsModule = this.getBuiltInsModule();
        k0.o(builtInsModule, "builtInsModule");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b>)v.n4((Iterable<? extends kotlin.reflect.jvm.internal.impl.builtins.jvm.e>)j, new kotlin.reflect.jvm.internal.impl.builtins.jvm.e(n, builtInsModule, null, 4, null));
    }
    
    @org.jetbrains.annotations.e
    public final g u() {
        return (g)m.a(this.h, (Object)this, (o)f.i[0]);
    }
    
    public final void v(@org.jetbrains.annotations.e final e0 e0, final boolean b) {
        k0.p(e0, "moduleDescriptor");
        this.w(new n6.a<b>() {
            @org.jetbrains.annotations.e
            public final b a() {
                return new b(e0, b);
            }
        });
    }
    
    public final void w(@org.jetbrains.annotations.e final n6.a<b> g) {
        k0.p(g, "computation");
        this.g = g;
    }
    
    public enum a
    {
        G, 
        H, 
        I;
    }
    
    public static final class b
    {
        @org.jetbrains.annotations.e
        private final e0 a;
        private final boolean b;
        
        public b(@org.jetbrains.annotations.e final e0 a, final boolean b) {
            k0.p(a, "ownerModuleDescriptor");
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final e0 a() {
            return this.a;
        }
        
        public final boolean b() {
            return this.b;
        }
    }
}
