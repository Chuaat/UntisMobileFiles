// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.b;

public abstract class j extends b implements m
{
    @org.jetbrains.annotations.e
    private final e H;
    
    public j(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final e h) {
        if (g == null) {
            L(0);
        }
        if (h == null) {
            L(1);
        }
        super(g);
        this.H = h;
    }
    
    private static /* synthetic */ void L(final int n) {
        String format;
        if (n != 2 && n != 3 && n != 5 && n != 6) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2 && n != 3 && n != 5 && n != 6) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "annotations";
                break;
            }
            case 4: {
                args[0] = "descriptor";
                break;
            }
            case 2:
            case 3:
            case 5:
            case 6: {
                args[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            }
            case 1: {
                args[0] = "name";
                break;
            }
        }
        if (n != 2) {
            if (n != 3) {
                if (n != 5 && n != 6) {
                    args[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                }
                else {
                    args[1] = "toString";
                }
            }
            else {
                args[1] = "getOriginal";
            }
        }
        else {
            args[1] = "getName";
        }
        if (n != 2 && n != 3) {
            if (n != 4) {
                if (n != 5 && n != 6) {
                    args[2] = "<init>";
                }
            }
            else {
                args[2] = "toString";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 2 && n != 3 && n != 5 && n != 6) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @org.jetbrains.annotations.e
    public static String M(@org.jetbrains.annotations.e final m m) {
        if (m == null) {
            L(4);
        }
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(c.j.s(m));
            sb.append("[");
            sb.append(m.getClass().getSimpleName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(m)));
            sb.append("]");
            final String string = sb.toString();
            if (string == null) {
                L(5);
            }
            return string;
        }
        finally {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(m.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(m.getName());
            final String string2 = sb2.toString();
            if (string2 == null) {
                L(6);
            }
            return string2;
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m b() {
        return this;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e getName() {
        final e h = this.H;
        if (h == null) {
            L(2);
        }
        return h;
    }
    
    @Override
    public String toString() {
        return M(this);
    }
}
