// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import org.jetbrains.annotations.f;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.i;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q$a;
import kotlin.reflect.jvm.internal.impl.incremental.components.c$a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t$a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.d;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.checker.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

public final class h extends a
{
    public h(@e final n n, @e final m m, @e final e0 e0, @e final g0 g0, @e final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a a, @e final c c, @e final k k, @e final l l, @e final u6.a a2) {
        k0.p(n, "storageManager");
        k0.p(m, "finder");
        k0.p(e0, "moduleDescriptor");
        k0.p(g0, "notFoundClasses");
        k0.p(a, "additionalClassPartsProvider");
        k0.p(c, "platformDependentDeclarationFilter");
        k0.p(k, "deserializationConfiguration");
        k0.p(l, "kotlinTypeChecker");
        k0.p(a2, "samConversionResolver");
        super(n, (s)m, e0);
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m i = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m((i0)this);
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a n2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.n;
        final d d = new d(e0, g0, (v6.a)n2);
        final t$a a3 = t$a.a;
        final p a4 = p.a;
        k0.o(a4, "DO_NOTHING");
        this.h(new j(n, e0, k, (g)i, (kotlin.reflect.jvm.internal.impl.serialization.deserialization.c)d, (i0)this, (t)a3, a4, (kotlin.reflect.jvm.internal.impl.incremental.components.c)c$a.a, (q)q$a.a, (Iterable)v.L(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(n, e0), new kotlin.reflect.jvm.internal.impl.builtins.jvm.e(n, e0, null, 4, null)), g0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.a(), a, c, ((v6.a)n2).e(), l, a2, (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.e)null, 262144, (w)null));
    }
    
    @f
    protected kotlin.reflect.jvm.internal.impl.serialization.deserialization.n c(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        final InputStream b2 = this.e().b(b);
        Object a;
        if (b2 == null) {
            a = null;
        }
        else {
            a = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b.T.a(b, this.g(), this.f(), b2, false);
        }
        return (kotlin.reflect.jvm.internal.impl.serialization.deserialization.n)a;
    }
}
