// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public class h extends a
{
    public h(@org.jetbrains.annotations.e final c0 c0) {
        if (c0 == null) {
            c(0);
        }
        this(c0, null);
    }
    
    private h(@org.jetbrains.annotations.e final c0 c0, @f final e e) {
        if (c0 == null) {
            c(1);
        }
        super(c0, e);
    }
    
    private static /* synthetic */ void c(final int n) {
        final Object[] args = new Object[3];
        if (n != 2) {
            args[0] = "type";
        }
        else {
            args[0] = "newType";
        }
        args[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (n != 2) {
            args[2] = "<init>";
        }
        else {
            args[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", args));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{Transient} : ");
        sb.append(this.a());
        return sb.toString();
    }
}
