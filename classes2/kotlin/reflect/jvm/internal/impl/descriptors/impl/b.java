// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.storage.n;

public abstract class b extends e
{
    public b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final k1 k1, final boolean b, final int n2, @org.jetbrains.annotations.e final w0 w0, @org.jetbrains.annotations.e final z0 z0) {
        if (n == null) {
            L(0);
        }
        if (m == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (k1 == null) {
            L(3);
        }
        if (w0 == null) {
            L(4);
        }
        if (z0 == null) {
            L(5);
        }
        super(n, m, g.r.b(), e, k1, b, n2, w0, z0);
    }
    
    private static /* synthetic */ void L(final int n) {
        final Object[] args = new Object[3];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            args[0] = "storageManager";
                        }
                        else {
                            args[0] = "supertypeLoopChecker";
                        }
                    }
                    else {
                        args[0] = "source";
                    }
                }
                else {
                    args[0] = "variance";
                }
            }
            else {
                args[0] = "name";
            }
        }
        else {
            args[0] = "containingDeclaration";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        args[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    @Override
    public String toString() {
        final boolean r = this.r();
        String string = "";
        String s;
        if (r) {
            s = "reified ";
        }
        else {
            s = "";
        }
        if (this.v() != k1.K) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.v());
            sb.append(" ");
            string = sb.toString();
        }
        return String.format("%s%s%s", s, string, this.getName());
    }
}
