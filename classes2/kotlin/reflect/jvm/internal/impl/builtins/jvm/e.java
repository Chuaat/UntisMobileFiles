// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;

public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b
{
    @org.jetbrains.annotations.e
    public static final b d;
    static final /* synthetic */ o<Object>[] e;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.name.b f;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.name.e g;
    @org.jetbrains.annotations.e
    private static final a h;
    @org.jetbrains.annotations.e
    private final e0 a;
    @org.jetbrains.annotations.e
    private final l<e0, m> b;
    @org.jetbrains.annotations.e
    private final i c;
    
    static {
        d = new b(null);
        e = new o[] { k1.r(new f1(k1.d(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;")) };
        f = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        final c cloneable = StandardNames.FqNames.cloneable;
        final kotlin.reflect.jvm.internal.impl.name.e i = cloneable.i();
        k0.o(i, "cloneable.shortName()");
        g = i;
        final a m = a.m(cloneable.l());
        k0.o(m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        h = m;
    }
    
    public e(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final e0 a, @org.jetbrains.annotations.e final l<? super e0, ? extends m> b) {
        k0.p(n, "storageManager");
        k0.p(a, "moduleDescriptor");
        k0.p(b, "computeContainingDeclaration");
        this.a = a;
        this.b = (l<e0, m>)b;
        this.c = n.g((n6.a)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.impl.h>() {
            final /* synthetic */ e G;
            
            @org.jetbrains.annotations.e
            public final kotlin.reflect.jvm.internal.impl.descriptors.impl.h a() {
                final kotlin.reflect.jvm.internal.impl.descriptors.impl.h h = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f(this.G).invoke(kotlin.reflect.jvm.internal.impl.builtins.jvm.e.h(this.G)), kotlin.reflect.jvm.internal.impl.builtins.jvm.e.e(), b0.K, kotlin.reflect.jvm.internal.impl.descriptors.f.H, (Collection<c0>)v.k(kotlin.reflect.jvm.internal.impl.builtins.jvm.e.h(this.G).w().getAnyType()), w0.a, false, n);
                h.L0((kotlin.reflect.jvm.internal.impl.resolve.scopes.h)new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(n, h), j1.k(), null);
                return h;
            }
        });
    }
    
    public static final /* synthetic */ a d() {
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.e.h;
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.e e() {
        return kotlin.reflect.jvm.internal.impl.builtins.jvm.e.g;
    }
    
    public static final /* synthetic */ l f(final e e) {
        return e.b;
    }
    
    public static final /* synthetic */ e0 h(final e e) {
        return e.a;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.h i() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.h)kotlin.reflect.jvm.internal.impl.storage.m.a(this.c, (Object)this, (o)kotlin.reflect.jvm.internal.impl.builtins.jvm.e.e[0]);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "packageFqName");
        Object o;
        if (k0.g(b, kotlin.reflect.jvm.internal.impl.builtins.jvm.e.f)) {
            o = j1.f(this.i());
        }
        else {
            o = j1.k();
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)o;
    }
    
    @Override
    public boolean b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.b b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(b, "packageFqName");
        k0.p(e, "name");
        return k0.g(e, e.g) && k0.g(b, e.f);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@org.jetbrains.annotations.e final a a) {
        k0.p(a, "classId");
        kotlin.reflect.jvm.internal.impl.descriptors.impl.h i;
        if (k0.g(a, kotlin.reflect.jvm.internal.impl.builtins.jvm.e.d.a())) {
            i = this.i();
        }
        else {
            i = null;
        }
        return i;
    }
    
    public static final class b
    {
        private b() {
        }
        
        @org.jetbrains.annotations.e
        public final a a() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.e.d();
        }
    }
}
