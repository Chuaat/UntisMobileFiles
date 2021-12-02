// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class v extends g<String>
{
    public v(@e final String s) {
        k0.p((Object)s, "value");
        super(s);
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.types.k0 c(@e final e0 e0) {
        k0.p((Object)e0, "module");
        final kotlin.reflect.jvm.internal.impl.types.k0 stringType = e0.w().getStringType();
        k0.o((Object)stringType, "module.builtIns.stringType");
        return stringType;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(this.b());
        sb.append('\"');
        return sb.toString();
    }
}
