// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.storage.j;

public abstract class m0 extends l0
{
    private final boolean M;
    protected kotlin.reflect.jvm.internal.impl.storage.j<g<?>> N;
    
    public m0(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @f final c0 c0, final boolean i, @e final w0 w0) {
        if (m == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (w0 == null) {
            L(3);
        }
        super(m, g, e, c0, w0);
        this.M = i;
    }
    
    private static /* synthetic */ void L(final int n) {
        final Object[] args = new Object[3];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        args[0] = "containingDeclaration";
                    }
                    else {
                        args[0] = "compileTimeInitializer";
                    }
                }
                else {
                    args[0] = "source";
                }
            }
            else {
                args[0] = "name";
            }
        }
        else {
            args[0] = "annotations";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (n != 4) {
            args[2] = "<init>";
        }
        else {
            args[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    public void M0(@e final kotlin.reflect.jvm.internal.impl.storage.j<g<?>> n) {
        if (n == null) {
            L(4);
        }
        this.N = n;
    }
    
    @f
    @Override
    public g<?> a0() {
        final kotlin.reflect.jvm.internal.impl.storage.j<g<?>> n = this.N;
        if (n != null) {
            return (g<?>)((a<g>)n).invoke();
        }
        return null;
    }
    
    @Override
    public boolean n0() {
        return this.M;
    }
}
