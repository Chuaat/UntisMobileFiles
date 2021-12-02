// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.collections.v;
import java.util.List;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.j1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.model.b;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import kotlin.reflect.jvm.internal.impl.types.k0;

public final class i extends k0 implements d
{
    @e
    private final b H;
    @e
    private final j I;
    @f
    private final j1 J;
    @e
    private final g K;
    private final boolean L;
    private final boolean M;
    
    public i(@e final b h, @e final j i, @f final j1 j, @e final g k, final boolean l, final boolean m) {
        kotlin.jvm.internal.k0.p((Object)h, "captureStatus");
        kotlin.jvm.internal.k0.p((Object)i, "constructor");
        kotlin.jvm.internal.k0.p((Object)k, "annotations");
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    public i(@e final b b, @f final j1 j1, @e final y0 y0, @e final b1 b2) {
        kotlin.jvm.internal.k0.p((Object)b, "captureStatus");
        kotlin.jvm.internal.k0.p((Object)y0, "projection");
        kotlin.jvm.internal.k0.p((Object)b2, "typeParameter");
        this(b, new j(y0, null, null, b2, 6, null), j1, null, false, false, 56, null);
    }
    
    @e
    @Override
    public List<y0> M0() {
        return (List<y0>)v.E();
    }
    
    @Override
    public boolean O0() {
        return this.L;
    }
    
    @e
    public final b W0() {
        return this.H;
    }
    
    @e
    public j X0() {
        return this.I;
    }
    
    @f
    public final j1 Y0() {
        return this.J;
    }
    
    public final boolean Z0() {
        return this.M;
    }
    
    @e
    public i a1(final boolean b) {
        return new i(this.H, this.X0(), this.J, this.getAnnotations(), b, false, 32, null);
    }
    
    @e
    public i b1(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        final b h = this.H;
        final j i = this.X0().i(g);
        final j1 j = this.J;
        j1 q0;
        if (j == null) {
            q0 = null;
        }
        else {
            q0 = g.g(j).Q0();
        }
        return new i(h, i, q0, this.getAnnotations(), this.O0(), false, 32, null);
    }
    
    @e
    public i c1(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new i(this.H, this.X0(), this.J, g, this.O0(), false, 32, null);
    }
    
    @e
    public g getAnnotations() {
        return this.K;
    }
    
    @e
    @Override
    public h x() {
        final h i = u.i("No member resolution should be done on captured type!", true);
        kotlin.jvm.internal.k0.o((Object)i, "createErrorScope(\"No member resolution should be done on captured type!\", true)");
        return i;
    }
}
