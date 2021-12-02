// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import org.jetbrains.annotations.e;

public final class a extends n
{
    @e
    private final k0 H;
    @e
    private final k0 I;
    
    public a(@e final k0 h, @e final k0 i) {
        kotlin.jvm.internal.k0.p((Object)h, "delegate");
        kotlin.jvm.internal.k0.p((Object)i, "abbreviation");
        this.H = h;
        this.I = i;
    }
    
    @e
    @Override
    protected k0 W0() {
        return this.H;
    }
    
    @e
    public final k0 Z() {
        return this.W0();
    }
    
    @e
    public final k0 Z0() {
        return this.I;
    }
    
    @e
    public a a1(final boolean b) {
        return new a(this.W0().U0(b), this.I.U0(b));
    }
    
    @e
    public a b1(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return new a((k0)g.g(this.W0()), (k0)g.g(this.I));
    }
    
    @e
    public a c1(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new a(this.W0().V0(g), this.I);
    }
    
    @e
    public a d1(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        return new a(k0, this.I);
    }
}
