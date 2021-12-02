// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.e;

public interface w0
{
    public static final w0 a = new w0() {
        private static /* synthetic */ void d(final int n) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }
        
        @e
        @Override
        public x0 a() {
            final x0 a = x0.a;
            if (a == null) {
                d(0);
            }
            return a;
        }
        
        @Override
        public String toString() {
            return "NO_SOURCE";
        }
    };
    
    @e
    x0 a();
}
