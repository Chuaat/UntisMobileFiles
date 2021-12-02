// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class w extends a0<Byte>
{
    public w(final byte b) {
        super(b);
    }
    
    @e
    @Override
    public c0 a(@e final e0 e0) {
        k0.p((Object)e0, "module");
        final kotlin.reflect.jvm.internal.impl.descriptors.e a = x.a(e0, StandardNames$FqNames.uByte);
        kotlin.reflect.jvm.internal.impl.types.k0 a2;
        if (a == null) {
            a2 = null;
        }
        else {
            a2 = a.A();
        }
        kotlin.reflect.jvm.internal.impl.types.k0 j = a2;
        if (a2 == null) {
            j = u.j("Unsigned type UByte not found");
            k0.o((Object)j, "createErrorType(\"Unsigned type UByte not found\")");
        }
        return j;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(((g<Number>)this).b().intValue());
        sb.append(".toUByte()");
        return sb.toString();
    }
}
