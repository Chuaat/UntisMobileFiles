// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;

public final class g implements q
{
    @e
    public static final g a;
    
    static {
        a = new g();
    }
    
    private g() {
    }
    
    @e
    @Override
    public c0 a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q q, @e final String str, @e final k0 obj, @e final k0 obj2) {
        kotlin.jvm.internal.k0.p((Object)q, "proto");
        kotlin.jvm.internal.k0.p((Object)str, "flexibleId");
        kotlin.jvm.internal.k0.p((Object)obj, "lowerBound");
        kotlin.jvm.internal.k0.p((Object)obj2, "upperBound");
        if (!kotlin.jvm.internal.k0.g((Object)str, (Object)"kotlin.jvm.PlatformType")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error java flexible type with id: ");
            sb.append(str);
            sb.append(". (");
            sb.append(obj);
            sb.append("..");
            sb.append(obj2);
            sb.append(')');
            final k0 j = u.j(sb.toString());
            kotlin.jvm.internal.k0.o((Object)j, "createErrorType(\"Error java flexible type with id: $flexibleId. ($lowerBound..$upperBound)\")");
            return j;
        }
        if (((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.q>)q).y(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.g)) {
            return new f(obj, obj2);
        }
        final d0 a = d0.a;
        return d0.d(obj, obj2);
    }
}
