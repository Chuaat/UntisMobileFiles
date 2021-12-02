// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.text.s;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.b;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import org.jetbrains.annotations.e;

public final class a extends v6.a
{
    @e
    public static final a n;
    
    static {
        n = new a();
    }
    
    private a() {
        final g d = kotlin.reflect.jvm.internal.impl.protobuf.g.d();
        kotlin.reflect.jvm.internal.impl.metadata.builtins.b.a(d);
        final j2 a = j2.a;
        k0.o((Object)d, "newInstance().apply(BuiltInsProtoBuf::registerAllExtensions)");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.l, Integer> a2 = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.a;
        k0.o((Object)a2, "packageFqName");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.d, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> c = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.c;
        k0.o((Object)c, "constructorAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.c, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> b = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.b;
        k0.o((Object)b, "classAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.i, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> d2 = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.d;
        k0.o((Object)d2, "functionAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> e = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.e;
        k0.o((Object)e, "propertyAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> f = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.f;
        k0.o((Object)f, "propertyGetterAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> g = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.g;
        k0.o((Object)g, "propertySetterAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.g, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> i = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.i;
        k0.o((Object)i, "enumEntryAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c> h = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.h;
        k0.o((Object)h, "compileTimeValue");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.u, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> j = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.j;
        k0.o((Object)j, "parameterAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.q, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> k = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.k;
        k0.o((Object)k, "typeAnnotation");
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.s, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> l = kotlin.reflect.jvm.internal.impl.metadata.builtins.b.l;
        k0.o((Object)l, "typeParameterAnnotation");
        super(d, a2, c, b, d2, e, f, g, i, h, j, k, l);
    }
    
    private final String o(final kotlin.reflect.jvm.internal.impl.name.b b) {
        String d;
        if (b.d()) {
            d = "default-package";
        }
        else {
            d = b.g().d();
            k0.o((Object)d, "fqName.shortName().asString()");
        }
        return d;
    }
    
    @e
    public final String m(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p((Object)b, "fqName");
        return k0.C(this.o(b), (Object)".kotlin_builtins");
    }
    
    @e
    public final String n(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p((Object)b, "fqName");
        final StringBuilder sb = new StringBuilder();
        final String b2 = b.b();
        k0.o((Object)b2, "fqName.asString()");
        sb.append(s.j2(b2, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(this.m(b));
        return sb.toString();
    }
}
