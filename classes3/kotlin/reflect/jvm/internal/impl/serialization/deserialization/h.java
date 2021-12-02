// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.w;
import n6.l;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class h
{
    @e
    public static final b c;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.a> d;
    @e
    private final j a;
    @e
    private final l<a, kotlin.reflect.jvm.internal.impl.descriptors.e> b;
    
    static {
        c = new b(null);
        d = j1.f((Object)kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames$FqNames.cloneable.l()));
    }
    
    public h(@e final j a) {
        k0.p((Object)a, "components");
        this.a = a;
        this.b = (l<a, kotlin.reflect.jvm.internal.impl.descriptors.e>)a.u().i((n6.l<? super Object, ?>)new l<a, kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            @f
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final a a) {
                k0.p((Object)a, "key");
                return h.this.c(a);
            }
        });
    }
    
    public static final /* synthetic */ Set b() {
        return h.d;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e c(final a a) {
        final kotlin.reflect.jvm.internal.impl.name.a b = a.b();
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> iterator = this.a.k().iterator();
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e c = iterator.next().c(b);
            if (c == null) {
                continue;
            }
            return c;
        }
        if (h.c.a().contains(b)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.f f;
        if ((f = a.a()) == null && (f = this.a.e().a(b)) == null) {
            return null;
        }
        final c a2 = f.a();
        final kotlin.reflect.jvm.internal.impl.metadata.a.c b2 = f.b();
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c2 = f.c();
        final w0 d = f.d();
        final kotlin.reflect.jvm.internal.impl.name.a g = b.g();
        if (g == null) {
            final i0 r = this.a.r();
            final kotlin.reflect.jvm.internal.impl.name.b h = b.h();
            k0.o((Object)h, "classId.packageFqName");
            while (true) {
                for (final h0 next : kotlin.reflect.jvm.internal.impl.descriptors.k0.b(r, h)) {
                    final h0 h2 = next;
                    boolean b3 = false;
                    Label_0312: {
                        if (h2 instanceof n) {
                            final n n = (n)h2;
                            final kotlin.reflect.jvm.internal.impl.name.e j = b.j();
                            k0.o((Object)j, "classId.shortClassName");
                            if (!n.L0(j)) {
                                b3 = false;
                                break Label_0312;
                            }
                        }
                        b3 = true;
                    }
                    if (b3) {
                        final h0 h3 = next;
                        if (h3 == null) {
                            return null;
                        }
                        final j a3 = this.a;
                        final kotlin.reflect.jvm.internal.impl.metadata.a.t i0 = b2.I0();
                        k0.o((Object)i0, "classProto.typeTable");
                        final g g2 = new g(i0);
                        final i.a b4 = i.b;
                        final kotlin.reflect.jvm.internal.impl.metadata.a.w k0 = b2.K0();
                        kotlin.jvm.internal.k0.o((Object)k0, "classProto.versionRequirementTable");
                        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l l = a3.a(h3, a2, g2, b4.a(k0), c2, null);
                        return (kotlin.reflect.jvm.internal.impl.descriptors.e)new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e(l, b2, a2, c2, d);
                    }
                }
                h0 next = null;
                continue;
            }
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e e = e(this, g, null, 2, null);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e e2;
        if (e instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) {
            e2 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)e;
        }
        else {
            e2 = null;
        }
        if (e2 == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.e m = b.j();
        k0.o((Object)m, "classId.shortClassName");
        if (!e2.d1(m)) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l l = e2.X0();
        return (kotlin.reflect.jvm.internal.impl.descriptors.e)new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e(l, b2, a2, c2, d);
    }
    
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e e(final h h, final kotlin.reflect.jvm.internal.impl.name.a a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.f f, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            f = null;
        }
        return h.d(a, f);
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d(@e final kotlin.reflect.jvm.internal.impl.name.a a, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f f) {
        k0.p((Object)a, "classId");
        return (kotlin.reflect.jvm.internal.impl.descriptors.e)this.b.invoke((Object)new a(a, f));
    }
    
    private static final class a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a a;
        @f
        private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f b;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.name.a a, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f b) {
            k0.p((Object)a, "classId");
            this.a = a;
            this.b = b;
        }
        
        @f
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.f a() {
            return this.b;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a b() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return o instanceof a && k0.g((Object)this.a, (Object)((a)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    public static final class b
    {
        private b() {
        }
        
        @e
        public final Set<kotlin.reflect.jvm.internal.impl.name.a> a() {
            return (Set<kotlin.reflect.jvm.internal.impl.name.a>)h.b();
        }
    }
}
