// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

public interface p
{
    public static final p a = new p() {
        private static /* synthetic */ void c(final int n) {
            final Object[] args = new Object[3];
            if (n != 1) {
                args[0] = "descriptor";
            }
            else {
                args[0] = "unresolvedSuperClasses";
            }
            args[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (n != 2) {
                args[2] = "reportIncompleteHierarchy";
            }
            else {
                args[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
        }
        
        @Override
        public void a(@e final b b) {
            if (b == null) {
                c(2);
            }
        }
        
        @Override
        public void b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final List<String> list) {
            if (e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    };
    
    void a(@e final b p0);
    
    void b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e p0, @e final List<String> p1);
}
