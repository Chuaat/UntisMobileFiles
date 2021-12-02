// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;

public abstract class a implements e
{
    protected final c0 a;
    private final e b;
    
    public a(@org.jetbrains.annotations.e final c0 a, @f final e e) {
        if (a == null) {
            c(0);
        }
        this.a = a;
        e b;
        if (e != null) {
            b = e;
        }
        else {
            b = this;
        }
        this.b = b;
    }
    
    private static /* synthetic */ void c(final int n) {
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
            args[0] = "receiverType";
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (n != 1) {
            if (n != 2) {
                args[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            }
            else {
                args[1] = "getOriginal";
            }
        }
        else {
            args[1] = "getType";
        }
        if (n != 1 && n != 2) {
            args[2] = "<init>";
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
    public c0 a() {
        final c0 a = this.a;
        if (a == null) {
            c(1);
        }
        return a;
    }
}
