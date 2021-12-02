// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import m6.d;
import org.jetbrains.annotations.e;

public final class x extends w implements k
{
    @e
    public static final a K;
    @d
    public static boolean L;
    private boolean J;
    
    static {
        K = new a(null);
    }
    
    public x(@e final k0 k0, @e final k0 k2) {
        kotlin.jvm.internal.k0.p((Object)k0, "lowerBound");
        kotlin.jvm.internal.k0.p((Object)k2, "upperBound");
        super(k0, k2);
    }
    
    private final void Z0() {
        if (x.L) {
            if (!this.J) {
                this.J = true;
                z.b(this.V0());
                z.b(this.W0());
                kotlin.jvm.internal.k0.g((Object)this.V0(), (Object)this.W0());
                f.a.d(this.V0(), this.W0());
            }
        }
    }
    
    @Override
    public boolean L() {
        return this.V0().N0().c() instanceof b1 && kotlin.jvm.internal.k0.g((Object)this.V0().N0(), (Object)this.W0().N0());
    }
    
    @e
    @Override
    public c0 O(@e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "replacement");
        final j1 q0 = c0.Q0();
        j1 d;
        if (q0 instanceof w) {
            d = q0;
        }
        else {
            if (!(q0 instanceof k0)) {
                throw new h0();
            }
            final d0 a = d0.a;
            final k0 k0 = (k0)q0;
            d = d0.d(k0, k0.U0(true));
        }
        return h1.b(d, q0);
    }
    
    @e
    @Override
    public j1 R0(final boolean b) {
        final d0 a = d0.a;
        return d0.d(this.V0().U0(b), this.W0().U0(b));
    }
    
    @e
    @Override
    public j1 T0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        final d0 a = d0.a;
        return d0.d(this.V0().V0(g), this.W0().V0(g));
    }
    
    @e
    @Override
    public k0 U0() {
        this.Z0();
        return this.V0();
    }
    
    @e
    @Override
    public String X0(@e final c c, @e final kotlin.reflect.jvm.internal.impl.renderer.f f) {
        kotlin.jvm.internal.k0.p((Object)c, "renderer");
        kotlin.jvm.internal.k0.p((Object)f, "options");
        if (f.p()) {
            final StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(c.y(this.V0()));
            sb.append("..");
            sb.append(c.y(this.W0()));
            sb.append(')');
            return sb.toString();
        }
        return c.v(c.y(this.V0()), c.y(this.W0()), kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(this));
    }
    
    @e
    public w Y0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return new x((k0)g.g(this.V0()), (k0)g.g(this.W0()));
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
