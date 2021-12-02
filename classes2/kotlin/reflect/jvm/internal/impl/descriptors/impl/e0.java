// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;

public class e0 extends c
{
    private final m J;
    private final e K;
    
    public e0(@org.jetbrains.annotations.e final m j, @org.jetbrains.annotations.e final e k, @org.jetbrains.annotations.e final g g) {
        if (j == null) {
            L(0);
        }
        if (k == null) {
            L(1);
        }
        if (g == null) {
            L(2);
        }
        super(g);
        this.J = j;
        this.K = k;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 3 && n != 4) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 3 && n != 4) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    if (n != 5) {
                        args[0] = "containingDeclaration";
                    }
                    else {
                        args[0] = "newOwner";
                    }
                }
                else {
                    args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                }
            }
            else {
                args[0] = "annotations";
            }
        }
        else {
            args[0] = "value";
        }
        if (n != 3) {
            if (n != 4) {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            }
            else {
                args[1] = "getContainingDeclaration";
            }
        }
        else {
            args[1] = "getValue";
        }
        if (n != 3 && n != 4) {
            if (n != 5) {
                args[2] = "<init>";
            }
            else {
                args[2] = "copy";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 3 && n != 4) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m c() {
        final m j = this.J;
        if (j == null) {
            L(4);
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e getValue() {
        final e k = this.K;
        if (k == null) {
            L(3);
        }
        return k;
    }
}
