// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.name.e;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.c0;

public class d implements c
{
    private final c0 a;
    private final Map<e, g<?>> b;
    private final w0 c;
    
    public d(@org.jetbrains.annotations.e final c0 a, @org.jetbrains.annotations.e final Map<e, g<?>> b, @org.jetbrains.annotations.e final w0 c) {
        if (a == null) {
            c(0);
        }
        if (b == null) {
            c(1);
        }
        if (c == null) {
            c(2);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static /* synthetic */ void c(final int n) {
        String format;
        if (n != 3 && n != 4 && n != 5) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 3 && n != 4 && n != 5) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4 && n != 5) {
                    args[0] = "annotationType";
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            }
            else {
                args[0] = "source";
            }
        }
        else {
            args[0] = "valueArguments";
        }
        if (n != 3) {
            if (n != 4) {
                if (n != 5) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
                else {
                    args[1] = "getSource";
                }
            }
            else {
                args[1] = "getAllValueArguments";
            }
        }
        else {
            args[1] = "getType";
        }
        if (n != 3 && n != 4 && n != 5) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 3 && n != 4 && n != 5) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public c0 a() {
        final c0 a = this.a;
        if (a == null) {
            c(3);
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Map<e, g<?>> b() {
        final Map<e, g<?>> b = this.b;
        if (b == null) {
            c(4);
        }
        return b;
    }
    
    @f
    @Override
    public b f() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.c.a.a(this);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 k() {
        final w0 c = this.c;
        if (c == null) {
            c(5);
        }
        return c;
    }
    
    @Override
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.g.t((c)this, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.e)null);
    }
}
