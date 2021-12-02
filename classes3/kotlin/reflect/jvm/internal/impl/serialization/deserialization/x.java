// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;

public abstract class x
{
    @e
    private final c a;
    @e
    private final g b;
    @f
    private final w0 c;
    
    private x(final c a, final g b, final w0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public abstract kotlin.reflect.jvm.internal.impl.name.b a();
    
    @e
    public final c b() {
        return this.a;
    }
    
    @f
    public final w0 c() {
        return this.c;
    }
    
    @e
    public final g d() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.a());
        return sb.toString();
    }
    
    public static final class a extends x
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.metadata.a.c d;
        @f
        private final a e;
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a f;
        @e
        private final kotlin.reflect.jvm.internal.impl.metadata.a.c.c g;
        private final boolean h;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.c d, @e final c c, @e final g g, @f final w0 w0, @f final a e) {
            k0.p((Object)d, "classProto");
            k0.p((Object)c, "nameResolver");
            k0.p((Object)g, "typeTable");
            super(c, g, w0, null);
            this.d = d;
            this.e = e;
            this.f = v.a(c, d.p0());
            j.a h;
            if ((h = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.e.d(d.o0())) == null) {
                h = kotlin.reflect.jvm.internal.impl.metadata.a.c.c.H;
            }
            this.g = (kotlin.reflect.jvm.internal.impl.metadata.a.c.c)h;
            final Boolean g2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f.g(d.o0());
            k0.o((Object)g2, "IS_INNER.get(classProto.flags)");
            this.h = g2;
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.impl.name.b a() {
            final kotlin.reflect.jvm.internal.impl.name.b b = this.f.b();
            k0.o((Object)b, "classId.asSingleFqName()");
            return b;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a e() {
            return this.f;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.metadata.a.c f() {
            return this.d;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.metadata.a.c.c g() {
            return this.g;
        }
        
        @f
        public final a h() {
            return this.e;
        }
        
        public final boolean i() {
            return this.h;
        }
    }
    
    public static final class b extends x
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.b d;
        
        public b(@e final kotlin.reflect.jvm.internal.impl.name.b d, @e final c c, @e final g g, @f final w0 w0) {
            k0.p((Object)d, "fqName");
            k0.p((Object)c, "nameResolver");
            k0.p((Object)g, "typeTable");
            super(c, g, w0, null);
            this.d = d;
        }
        
        @e
        @Override
        public kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.d;
        }
    }
}
