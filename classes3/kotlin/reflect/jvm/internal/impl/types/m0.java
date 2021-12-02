// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import org.jetbrains.annotations.e;

public final class m0 extends n implements g1
{
    @e
    private final k0 H;
    @e
    private final c0 I;
    
    public m0(@e final k0 h, @e final c0 i) {
        kotlin.jvm.internal.k0.p((Object)h, "delegate");
        kotlin.jvm.internal.k0.p((Object)i, "enhancement");
        this.H = h;
        this.I = i;
    }
    
    @e
    @Override
    public j1 G0() {
        return this.W0();
    }
    
    @e
    @Override
    public c0 M() {
        return this.I;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        return (k0)h1.d(this.G0().R0(b), this.M().Q0().R0(b));
    }
    
    @e
    @Override
    public k0 V0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return (k0)h1.d(this.G0().T0(g), this.M());
    }
    
    @e
    @Override
    protected k0 W0() {
        return this.H;
    }
    
    @e
    public m0 Z0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return new m0((k0)g.g(this.W0()), g.g(this.M()));
    }
    
    @e
    public m0 a1(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        return new m0(k0, this.M());
    }
}
