// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;

public final class j implements p
{
    @e
    public static final j b;
    
    static {
        b = new j();
    }
    
    private j() {
    }
    
    @Override
    public void a(@e final b b) {
        k0.p((Object)b, "descriptor");
        throw new IllegalStateException(k0.C("Cannot infer visibility for ", (Object)b));
    }
    
    @Override
    public void b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final List<String> obj) {
        k0.p((Object)e, "descriptor");
        k0.p((Object)obj, "unresolvedSuperClasses");
        final StringBuilder sb = new StringBuilder();
        sb.append("Incomplete hierarchy for class ");
        sb.append(((f0)e).getName());
        sb.append(", unresolved classes ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
}
