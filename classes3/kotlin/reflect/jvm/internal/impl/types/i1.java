// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import org.jetbrains.annotations.e;

public final class i1 extends t
{
    @e
    private final String M;
    
    public i1(@e final String m, @e final w0 w0, @e final h h, @e final List<? extends y0> list, final boolean b) {
        kotlin.jvm.internal.k0.p((Object)m, "presentableName");
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        super(w0, h, list, b, null, 16, null);
        this.M = m;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        return new i1(this.W0(), this.N0(), this.x(), this.M0(), b);
    }
    
    @e
    @Override
    public String W0() {
        return this.M;
    }
    
    @e
    public i1 Y0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
}
