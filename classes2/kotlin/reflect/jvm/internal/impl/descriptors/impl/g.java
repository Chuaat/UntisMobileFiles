// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;

public abstract class g extends a
{
    private final m M;
    private final w0 N;
    private final boolean O;
    
    protected g(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final w0 n2, final boolean o) {
        if (n == null) {
            O(0);
        }
        if (m == null) {
            O(1);
        }
        if (e == null) {
            O(2);
        }
        if (n2 == null) {
            O(3);
        }
        super(n, e);
        this.M = m;
        this.N = n2;
        this.O = o;
    }
    
    private static /* synthetic */ void O(final int n) {
        String format;
        if (n != 4 && n != 5) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 4 && n != 5) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4 && n != 5) {
                        args[0] = "storageManager";
                    }
                    else {
                        args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
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
            args[0] = "containingDeclaration";
        }
        if (n != 4) {
            if (n != 5) {
                args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            }
            else {
                args[1] = "getSource";
            }
        }
        else {
            args[1] = "getContainingDeclaration";
        }
        if (n != 4 && n != 5) {
            args[2] = "<init>";
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 4 && n != 5) {
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
        final m m = this.M;
        if (m == null) {
            O(4);
        }
        return m;
    }
    
    @Override
    public boolean isExternal() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 k() {
        final w0 n = this.N;
        if (n == null) {
            O(5);
        }
        return n;
    }
}
