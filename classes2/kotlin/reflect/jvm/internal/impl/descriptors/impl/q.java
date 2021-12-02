// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public class q extends c
{
    private final e J;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c K;
    
    public q(@org.jetbrains.annotations.e final e j) {
        if (j == null) {
            L(0);
        }
        super(g.r.b());
        this.J = j;
        this.K = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c(j, (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c)null);
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 1 && n != 2) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1 && n != 2) {
            if (n != 3) {
                args[0] = "descriptor";
            }
            else {
                args[0] = "newOwner";
            }
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (n != 1) {
            if (n != 2) {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            }
            else {
                args[1] = "getContainingDeclaration";
            }
        }
        else {
            args[1] = "getValue";
        }
        if (n != 1 && n != 2) {
            if (n != 3) {
                args[2] = "<init>";
            }
            else {
                args[2] = "copy";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 1 && n != 2) {
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
        final e j = this.J;
        if (j == null) {
            L(2);
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e getValue() {
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c k = this.K;
        if (k == null) {
            L(1);
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)k;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class ");
        sb.append(this.J.getName());
        sb.append("::this");
        return sb.toString();
    }
}
