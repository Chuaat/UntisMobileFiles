// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.k0;
import java.util.Objects;
import kotlin.jvm.internal.w;

public enum e
{
    H((String)null, 1, (w)null), 
    I((String)null, 1, (w)null), 
    J((String)null, 1, (w)null), 
    K("get"), 
    L("set"), 
    M((String)null, 1, (w)null), 
    N("param"), 
    O("setparam"), 
    P("delegate");
    
    @org.jetbrains.annotations.e
    private final String G;
    
    private e(final String s) {
        g = s;
        if (s == null) {
            g = this.name();
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            g = g.toLowerCase();
            k0.o(g, "(this as java.lang.String).toLowerCase()");
        }
        this.G = g;
    }
    
    @org.jetbrains.annotations.e
    public final String b() {
        return this.G;
    }
}
