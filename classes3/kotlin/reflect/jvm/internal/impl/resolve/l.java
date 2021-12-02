// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;

public interface l
{
    @e
    public static final a a = l.a.a;
    
    @f
    e0 a(@e final e0 p0);
    
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final l b;
        
        static {
            a = new a();
            b = new l() {
                @f
                @Override
                public e0 a(@e final e0 e0) {
                    k0.p((Object)e0, "moduleDescriptor");
                    return null;
                }
            };
        }
        
        private a() {
        }
    }
}
