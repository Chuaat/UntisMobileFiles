// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.n;

public final class g extends n implements h0
{
    @e
    private final k0 H;
    
    public g(@e final k0 h) {
        kotlin.jvm.internal.k0.p((Object)h, "delegate");
        this.H = h;
    }
    
    private final k0 Z0(final k0 k0) {
        final k0 u0 = k0.U0(false);
        if (!a.i(k0)) {
            return u0;
        }
        return new g(u0);
    }
    
    @Override
    public boolean L() {
        return true;
    }
    
    @e
    @Override
    public c0 O(@e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "replacement");
        final j1 q0 = c0.Q0();
        if (!a.i(q0) && !f1.l(q0)) {
            return q0;
        }
        j1 j1;
        if (q0 instanceof k0) {
            j1 = this.Z0((k0)q0);
        }
        else {
            if (!(q0 instanceof w)) {
                throw new IllegalStateException(kotlin.jvm.internal.k0.C("Incorrect type: ", (Object)q0).toString());
            }
            final d0 a = d0.a;
            final w w = (w)q0;
            j1 = h1.d(d0.d(this.Z0(w.V0()), this.Z0(w.W0())), h1.a(q0));
        }
        return j1;
    }
    
    @Override
    public boolean O0() {
        return false;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        k0 u0;
        if (b) {
            u0 = this.W0().U0(true);
        }
        else {
            u0 = this;
        }
        return u0;
    }
    
    @e
    @Override
    protected k0 W0() {
        return this.H;
    }
    
    @e
    public g a1(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new g(this.W0().V0(g));
    }
    
    @e
    public g b1(@e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        return new g(k0);
    }
}
