// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import n6.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.List;
import org.jetbrains.annotations.e;

final class l0 extends k0
{
    @e
    private final w0 H;
    @e
    private final List<y0> I;
    private final boolean J;
    @e
    private final h K;
    @e
    private final l<g, k0> L;
    
    public l0(@e final w0 h, @e final List<? extends y0> i, final boolean j, @e final h k, @e final l<? super g, ? extends k0> l) {
        kotlin.jvm.internal.k0.p((Object)h, "constructor");
        kotlin.jvm.internal.k0.p((Object)i, "arguments");
        kotlin.jvm.internal.k0.p((Object)k, "memberScope");
        kotlin.jvm.internal.k0.p((Object)l, "refinedTypeFactory");
        this.H = h;
        this.I = (List<y0>)i;
        this.J = j;
        this.K = k;
        this.L = (l<g, k0>)l;
        if (!(this.x() instanceof u.d)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("SimpleTypeImpl should not be created for error type: ");
        sb.append(this.x());
        sb.append('\n');
        sb.append(this.N0());
        throw new IllegalStateException(sb.toString());
    }
    
    @e
    @Override
    public List<y0> M0() {
        return this.I;
    }
    
    @e
    @Override
    public w0 N0() {
        return this.H;
    }
    
    @Override
    public boolean O0() {
        return this.J;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        k0 k0;
        if (b == this.O0()) {
            k0 = this;
        }
        else if (b) {
            k0 = new i0(this);
        }
        else {
            k0 = new g0(this);
        }
        return k0;
    }
    
    @e
    @Override
    public k0 V0(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        k0 k0;
        if (g.isEmpty()) {
            k0 = this;
        }
        else {
            k0 = new kotlin.reflect.jvm.internal.impl.types.i(this, g);
        }
        return k0;
    }
    
    @e
    public k0 W0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        k0 k0;
        if ((k0 = (k0)this.L.invoke((Object)g)) == null) {
            k0 = this;
        }
        return k0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
    }
    
    @e
    @Override
    public h x() {
        return this.K;
    }
}
