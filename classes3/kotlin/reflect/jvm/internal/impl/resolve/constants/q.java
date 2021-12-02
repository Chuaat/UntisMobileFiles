// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class q extends g<b>
{
    @e
    public static final a b;
    
    static {
        b = new a(null);
    }
    
    public q(@e final kotlin.reflect.jvm.internal.impl.name.a a, final int n) {
        k0.p((Object)a, "classId");
        this(new f(a, n));
    }
    
    public q(@e final f f) {
        k0.p((Object)f, "value");
        this(new b.b(f));
    }
    
    public q(@e final b b) {
        k0.p((Object)b, "value");
        super(b);
    }
    
    @e
    @Override
    public c0 a(@e final e0 e0) {
        k0.p((Object)e0, "module");
        final d0 a = d0.a;
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        final kotlin.reflect.jvm.internal.impl.descriptors.e kClass = e0.w().getKClass();
        k0.o((Object)kClass, "module.builtIns.kClass");
        return d0.g(b, kClass, v.k((Object)new a1(this.c(e0))));
    }
    
    @e
    public final c0 c(@e final e0 e0) {
        k0.p((Object)e0, "module");
        final b b = this.b();
        if (b instanceof b.a) {
            return ((b.a)((g<b.a>)this).b()).a();
        }
        if (!(b instanceof b.b)) {
            throw new h0();
        }
        final f c = ((b.b)((g<b.b>)this).b()).c();
        final kotlin.reflect.jvm.internal.impl.name.a a = c.a();
        final int b2 = c.b();
        final kotlin.reflect.jvm.internal.impl.descriptors.e a2 = x.a(e0, a);
        if (a2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unresolved type: ");
            sb.append(a);
            sb.append(" (arrayDimensions=");
            sb.append(b2);
            sb.append(')');
            final kotlin.reflect.jvm.internal.impl.types.k0 j = u.j(sb.toString());
            k0.o((Object)j, "createErrorType(\"Unresolved type: $classId (arrayDimensions=$arrayDimensions)\")");
            return j;
        }
        final kotlin.reflect.jvm.internal.impl.types.k0 a3 = a2.A();
        k0.o((Object)a3, "descriptor.defaultType");
        c0 c2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m(a3);
        for (int i = 0; i < b2; ++i) {
            c2 = e0.w().getArrayType(k1.K, c2);
            k0.o((Object)c2, "module.builtIns.getArrayType(Variance.INVARIANT, type)");
        }
        return c2;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final g<?> a(@e final c0 c0) {
            k0.p((Object)c0, "argumentType");
            final boolean a = kotlin.reflect.jvm.internal.impl.types.e0.a(c0);
            final q q = null;
            if (a) {
                return null;
            }
            c0 a2 = c0;
            int n = 0;
            while (KotlinBuiltIns.isArray(a2)) {
                a2 = ((y0)v.U4((List)a2.M0())).a();
                k0.o((Object)a2, "type.arguments.single().type");
                ++n;
            }
            final h c2 = a2.N0().c();
            q q2;
            if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                final kotlin.reflect.jvm.internal.impl.name.a h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h(c2);
                if (h == null) {
                    return new q(new q.b.a(c0));
                }
                q2 = new q(h, n);
            }
            else {
                q2 = q;
                if (c2 instanceof b1) {
                    final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames$FqNames.any.l());
                    k0.o((Object)m, "topLevel(StandardNames.FqNames.any.toSafe())");
                    q2 = new q(m, 0);
                }
            }
            return q2;
        }
    }
    
    public abstract static class b
    {
        private b() {
        }
        
        public static final class a extends q.b
        {
            @e
            private final c0 a;
            
            public a(@e final c0 a) {
                k0.p((Object)a, "type");
                super(null);
                this.a = a;
            }
            
            @e
            public final c0 a() {
                return this.a;
            }
            
            @Override
            public boolean equals(@org.jetbrains.annotations.f final Object o) {
                return this == o || (o instanceof a && k0.g((Object)this.a, (Object)((a)o).a));
            }
            
            @Override
            public int hashCode() {
                return this.a.hashCode();
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("LocalClass(type=");
                sb.append(this.a);
                sb.append(')');
                return sb.toString();
            }
        }
        
        public static final class b extends q.b
        {
            @e
            private final f a;
            
            public b(@e final f a) {
                k0.p((Object)a, "value");
                super(null);
                this.a = a;
            }
            
            public final int a() {
                return this.a.c();
            }
            
            @e
            public final kotlin.reflect.jvm.internal.impl.name.a b() {
                return this.a.d();
            }
            
            @e
            public final f c() {
                return this.a;
            }
            
            @Override
            public boolean equals(@org.jetbrains.annotations.f final Object o) {
                return this == o || (o instanceof b && k0.g((Object)this.a, (Object)((b)o).a));
            }
            
            @Override
            public int hashCode() {
                return this.a.hashCode();
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("NormalClass(value=");
                sb.append(this.a);
                sb.append(')');
                return sb.toString();
            }
        }
    }
}
