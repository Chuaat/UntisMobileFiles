// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

public interface b
{
    @f
    String a(@e final y p0);
    
    boolean b(@e final y p0);
    
    @e
    String getDescription();
    
    public static final class a
    {
        @f
        public static String a(@e final b b, @e final y y) {
            k0.p((Object)b, "this");
            k0.p((Object)y, "functionDescriptor");
            String description;
            if (!b.b(y)) {
                description = b.getDescription();
            }
            else {
                description = null;
            }
            return description;
        }
    }
}
