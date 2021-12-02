// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;

public class b extends a implements d
{
    private final kotlin.reflect.jvm.internal.impl.descriptors.a c;
    
    public b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a c, @org.jetbrains.annotations.e final c0 c2, @f final e e) {
        if (c == null) {
            c(0);
        }
        if (c2 == null) {
            c(1);
        }
        super(c2, e);
        this.c = c;
    }
    
    private static /* synthetic */ void c(final int n) {
        String format;
        if (n != 2) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    args[0] = "callableDescriptor";
                }
                else {
                    args[0] = "newType";
                }
            }
            else {
                args[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
            }
        }
        else {
            args[0] = "receiverType";
        }
        if (n != 2) {
            args[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        }
        else {
            args[1] = "getDeclarationDescriptor";
        }
        if (n != 2) {
            if (n != 3) {
                args[2] = "<init>";
            }
            else {
                args[2] = "replaceType";
            }
        }
        final String format2 = String.format(format, args);
        RuntimeException ex;
        if (n != 2) {
            ex = new IllegalArgumentException(format2);
        }
        else {
            ex = new IllegalStateException(format2);
        }
        throw ex;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a());
        sb.append(": Ext {");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
