// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import n6.l;
import kotlin.reflect.o;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

public final class u0<T extends h>
{
    @e
    public static final a e;
    static final /* synthetic */ o<Object>[] f;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.e a;
    @e
    private final l<g, T> b;
    @e
    private final g c;
    @e
    private final i d;
    
    static {
        e = new a(null);
        f = new o[] { k1.r(new f1(k1.d(u0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")) };
    }
    
    private u0(final kotlin.reflect.jvm.internal.impl.descriptors.e a, final n n, final l<? super g, ? extends T> b, final g c) {
        this.a = a;
        this.b = (l<g, T>)b;
        this.c = c;
        this.d = n.g((n6.a)new n6.a<T>() {
            final /* synthetic */ u0<T> G;
            
            @e
            public final T a() {
                return u0.b(this.G).invoke(u0.a(this.G));
            }
        });
    }
    
    public static final /* synthetic */ g a(final u0 u0) {
        return u0.c;
    }
    
    public static final /* synthetic */ l b(final u0 u0) {
        return u0.b;
    }
    
    private final T d() {
        return (T)m.a(this.d, (Object)this, (o)u0.f[0]);
    }
    
    @e
    public final T c(@e final g g) {
        k0.p(g, "kotlinTypeRefiner");
        if (!g.c(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((kotlin.reflect.jvm.internal.impl.descriptors.m)this.a))) {
            return this.d();
        }
        final w0 l = this.a.l();
        k0.o(l, "classDescriptor.typeConstructor");
        if (!g.d(l)) {
            return this.d();
        }
        return (T)g.b(this.a, (n6.a)new n6.a<T>() {
            final /* synthetic */ u0<T> G;
            
            @e
            public final T a() {
                return u0.b(this.G).invoke(g);
            }
        });
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final <T extends h> u0<T> a(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final n n, @e final g g, @e final l<? super g, ? extends T> l) {
            k0.p(e, "classDescriptor");
            k0.p(n, "storageManager");
            k0.p(g, "kotlinTypeRefinerForOwnerModule");
            k0.p(l, "scopeFactory");
            return new u0<T>(e, n, l, g, null);
        }
    }
}
