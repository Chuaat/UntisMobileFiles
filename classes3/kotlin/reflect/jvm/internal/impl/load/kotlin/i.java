// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g;

public final class i implements g
{
    @e
    private final c b;
    @f
    private final c c;
    @f
    private final r<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> d;
    private final boolean e;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f;
    @f
    private final o g;
    @e
    private final String h;
    
    public i(@e final o o, @e final a.l l, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, @f final r<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> r, final boolean b, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f) {
        k0.p((Object)o, "kotlinClass");
        k0.p((Object)l, "packageProto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)f, "abiStability");
        final c b2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.b(o.c());
        k0.o((Object)b2, "byClassId(kotlinClass.classId)");
        final String e = o.a().e();
        c d = null;
        if (e != null && e.length() > 0) {
            d = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.d(e);
        }
        this(b2, d, l, c, r, b, f, o);
    }
    
    public i(@e final c b, @f final c c, @e final a.l l, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c2, @f final r<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> d, final boolean e, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f f, @f final o g) {
        k0.p((Object)b, "className");
        k0.p((Object)l, "packageProto");
        k0.p((Object)c2, "nameResolver");
        k0.p((Object)f, "abiStability");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final kotlin.reflect.jvm.internal.impl.protobuf.i.g<a.l, Integer> m = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.m;
        k0.o((Object)m, "packageModuleName");
        final Integer n = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((kotlin.reflect.jvm.internal.impl.protobuf.i.d<kotlin.reflect.jvm.internal.impl.protobuf.i.d>)l, (kotlin.reflect.jvm.internal.impl.protobuf.i.g<kotlin.reflect.jvm.internal.impl.protobuf.i.d, Integer>)m);
        String h = "main";
        if (n != null) {
            final String string = c2.getString(n.intValue());
            if (string != null) {
                h = string;
            }
        }
        this.h = h;
    }
    
    @e
    public x0 a() {
        final x0 a = x0.a;
        k0.o((Object)a, "NO_SOURCE_FILE");
        return a;
    }
    
    @e
    @Override
    public String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(this.d().b().b());
        sb.append('\'');
        return sb.toString();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.a d() {
        return new kotlin.reflect.jvm.internal.impl.name.a(this.b.g(), this.g());
    }
    
    @f
    public final c e() {
        return this.c;
    }
    
    @f
    public final o f() {
        return this.g;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.name.e g() {
        final String f = this.b.f();
        k0.o((Object)f, "className.internalName");
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(s.p5(f, '/', null, 2, null));
        k0.o((Object)i, "identifier(className.internalName.substringAfterLast('/'))");
        return i;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)i.class.getSimpleName());
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }
}
