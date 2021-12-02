// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import n6.l;
import java.util.List;

public final class b extends g<List<? extends g<?>>>
{
    @e
    private final l<e0, c0> b;
    
    public b(@e final List<? extends g<?>> list, @e final l<? super e0, ? extends c0> b) {
        k0.p((Object)list, "value");
        k0.p((Object)b, "computeType");
        super(list);
        this.b = (l<e0, c0>)b;
    }
    
    @e
    @Override
    public c0 a(@e final e0 e0) {
        k0.p((Object)e0, "module");
        final c0 c0 = (c0)this.b.invoke((Object)e0);
        if (!KotlinBuiltIns.isArray(c0) && !KotlinBuiltIns.isPrimitiveArray(c0)) {
            KotlinBuiltIns.isUnsignedArrayType(c0);
        }
        return c0;
    }
}
