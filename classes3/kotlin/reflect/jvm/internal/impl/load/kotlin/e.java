// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.s0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.protobuf.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.collections.j1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import java.util.Set;

public final class e
{
    @org.jetbrains.annotations.e
    public static final a b;
    @org.jetbrains.annotations.e
    private static final Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> c;
    @org.jetbrains.annotations.e
    private static final Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> d;
    @org.jetbrains.annotations.e
    private static final f e;
    @org.jetbrains.annotations.e
    private static final f f;
    @org.jetbrains.annotations.e
    private static final f g;
    public j a;
    
    static {
        b = new a(null);
        c = j1.f((Object)kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.K);
        d = j1.u((Object[])new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a[] { kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.L, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a.O });
        e = new f(new int[] { 1, 1, 2 });
        f = new f(new int[] { 1, 1, 11 });
        g = new f(new int[] { 1, 1, 13 });
    }
    
    public static final /* synthetic */ f a() {
        return kotlin.reflect.jvm.internal.impl.load.kotlin.e.g;
    }
    
    public static final /* synthetic */ Set b() {
        return kotlin.reflect.jvm.internal.impl.load.kotlin.e.c;
    }
    
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f e(final o o) {
        if (!this.f().g().b()) {
            if (o.a().j()) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.H;
            }
            if (o.a().k()) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.I;
            }
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f.G;
    }
    
    private final r<f> g(final o o) {
        if (!this.h() && !o.a().d().h()) {
            return new r<f>(o.a().d(), kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.i, o.b(), o.c());
        }
        return null;
    }
    
    private final boolean h() {
        return this.f().g().d();
    }
    
    private final boolean i(final o o) {
        return !this.f().g().c() && o.a().i() && k0.g((Object)o.a().d(), (Object)kotlin.reflect.jvm.internal.impl.load.kotlin.e.f);
    }
    
    private final boolean j(final o o) {
        return (this.f().g().e() && (o.a().i() || k0.g((Object)o.a().d(), (Object)kotlin.reflect.jvm.internal.impl.load.kotlin.e.e))) || this.i(o);
    }
    
    private final String[] l(final o o, final Set<? extends kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> set) {
        final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a = o.a();
        String[] array;
        if ((array = a.a()) == null) {
            array = a.b();
        }
        if (array == null || !set.contains(a.c())) {
            array = null;
        }
        return array;
    }
    
    @org.jetbrains.annotations.f
    public final h d(@org.jetbrains.annotations.e final h0 h0, @org.jetbrains.annotations.e final o o) {
        k0.p((Object)h0, "descriptor");
        k0.p((Object)o, "kotlinClass");
        final String[] l = this.l(o, kotlin.reflect.jvm.internal.impl.load.kotlin.e.d);
        if (l == null) {
            return null;
        }
        final String[] g = o.a().g();
        if (g == null) {
            return null;
        }
        Label_0196: {
            s0 s0 = null;
            try {
                try {
                    final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h a = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a;
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.m(l, g);
                }
                finally {
                    if (this.h() || o.a().d().h()) {
                        break Label_0196;
                    }
                    s0 = null;
                }
            }
            catch (k k) {}
            if (s0 == null) {
                return null;
            }
            final g g2 = (g)s0.a();
            final kotlin.reflect.jvm.internal.impl.metadata.a.l i = (kotlin.reflect.jvm.internal.impl.metadata.a.l)s0.b();
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j(h0, i, g2, o.a().d(), new i(o, i, g2, this.g(o), this.j(o), this.e(o)), this.f(), (n6.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.e>>)e$b.G);
        }
    }
    
    @org.jetbrains.annotations.e
    public final j f() {
        final j a = this.a;
        if (a != null) {
            return a;
        }
        k0.S("components");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f k(@org.jetbrains.annotations.e final o o) {
        k0.p((Object)o, "kotlinClass");
        final String[] l = this.l(o, kotlin.reflect.jvm.internal.impl.load.kotlin.e.b.b());
        if (l == null) {
            return null;
        }
        final String[] g = o.a().g();
        if (g == null) {
            return null;
        }
        Label_0175: {
            s0 s0 = null;
            try {
                try {
                    final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h a = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.a;
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.i(l, g);
                }
                finally {
                    if (this.h() || o.a().d().h()) {
                        break Label_0175;
                    }
                    s0 = null;
                }
            }
            catch (k k) {}
            if (s0 == null) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.f((c)s0.a(), (kotlin.reflect.jvm.internal.impl.metadata.a.c)s0.b(), o.a().d(), (w0)new q(o, this.g(o), this.j(o), this.e(o)));
        }
    }
    
    @org.jetbrains.annotations.f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e m(@org.jetbrains.annotations.e final o o) {
        k0.p((Object)o, "kotlinClass");
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f k = this.k(o);
        if (k == null) {
            return null;
        }
        return this.f().f().d(o.c(), k);
    }
    
    public final void n(@org.jetbrains.annotations.e final d d) {
        k0.p((Object)d, "components");
        this.o(d.a());
    }
    
    public final void o(@org.jetbrains.annotations.e final j a) {
        k0.p((Object)a, "<set-?>");
        this.a = a;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final f a() {
            return kotlin.reflect.jvm.internal.impl.load.kotlin.e.a();
        }
        
        @org.jetbrains.annotations.e
        public final Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a> b() {
            return (Set<kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.a>)kotlin.reflect.jvm.internal.impl.load.kotlin.e.b();
        }
    }
}
