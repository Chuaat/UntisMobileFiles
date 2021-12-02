// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public enum b0
{
    @e
    public static final a G;
    
    H, 
    I, 
    J, 
    K;
    
    static {
        G = new a(null);
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final b0 a(final boolean b, final boolean b2, final boolean b3) {
            b0 b4;
            if (b) {
                b4 = b0.I;
            }
            else if (b2) {
                b4 = b0.K;
            }
            else if (b3) {
                b4 = b0.J;
            }
            else {
                b4 = b0.H;
            }
            return b4;
        }
    }
}
