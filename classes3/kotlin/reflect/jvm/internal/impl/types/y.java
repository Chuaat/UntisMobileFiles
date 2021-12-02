// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class y extends w implements g1
{
    @e
    private final w J;
    @e
    private final c0 K;
    
    public y(@e final w j, @e final c0 k) {
        k0.p((Object)j, "origin");
        k0.p((Object)k, "enhancement");
        super(j.V0(), j.W0());
        this.J = j;
        this.K = k;
    }
    
    @e
    @Override
    public c0 M() {
        return this.K;
    }
    
    @e
    @Override
    public j1 R0(final boolean b) {
        return h1.d(this.Y0().R0(b), this.M().Q0().R0(b));
    }
    
    @e
    @Override
    public j1 T0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        k0.p((Object)g, "newAnnotations");
        return h1.d(this.Y0().T0(g), this.M());
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.k0 U0() {
        return this.Y0().U0();
    }
    
    @e
    @Override
    public String X0(@e final c c, @e final f f) {
        k0.p((Object)c, "renderer");
        k0.p((Object)f, "options");
        if (f.g()) {
            return c.y(this.M());
        }
        return this.Y0().X0(c, f);
    }
    
    @e
    public w Y0() {
        return this.J;
    }
    
    @e
    public y Z0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return new y((w)g.g(this.Y0()), g.g(this.M()));
    }
}
