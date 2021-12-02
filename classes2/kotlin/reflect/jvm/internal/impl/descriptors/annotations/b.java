// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.e;

public class b implements a
{
    private final g G;
    
    public b(@e final g g) {
        if (g == null) {
            L(0);
        }
        this.G = g;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 1) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            args[0] = "annotations";
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (n != 1) {
            args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        else {
            args[1] = "getAnnotations";
        }
        if (n != 1) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 1) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @e
    @Override
    public g getAnnotations() {
        final g g = this.G;
        if (g == null) {
            L(1);
        }
        return g;
    }
}
