// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.p;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n;

public abstract class k extends j implements n
{
    @e
    private final m I;
    @e
    private final w0 J;
    
    protected k(@e final m i, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 j) {
        if (i == null) {
            L(0);
        }
        if (g == null) {
            L(1);
        }
        if (e == null) {
            L(2);
        }
        if (j == null) {
            L(3);
        }
        super(g, e);
        this.I = i;
        this.J = j;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 4 && n != 5 && n != 6) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4 && n != 5 && n != 6) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "containingDeclaration";
                break;
            }
            case 4:
            case 5:
            case 6: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            }
            case 3: {
                args[0] = "source";
                break;
            }
            case 2: {
                args[0] = "name";
                break;
            }
            case 1: {
                args[0] = "annotations";
                break;
            }
        }
        if (n != 4) {
            if (n != 5) {
                if (n != 6) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                }
                else {
                    args[1] = "getSource";
                }
            }
            else {
                args[1] = "getContainingDeclaration";
            }
        }
        else {
            args[1] = "getOriginal";
        }
        if (n != 4 && n != 5 && n != 6) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 4 && n != 5 && n != 6) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @e
    public p O() {
        final p p = (p)super.b();
        if (p == null) {
            L(4);
        }
        return p;
    }
    
    @e
    @Override
    public m c() {
        final m i = this.I;
        if (i == null) {
            L(5);
        }
        return i;
    }
    
    @e
    @Override
    public w0 k() {
        final w0 j = this.J;
        if (j == null) {
            L(6);
        }
        return j;
    }
}
