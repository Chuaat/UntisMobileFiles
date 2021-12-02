// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import kotlin.reflect.jvm.internal.impl.types.k0;

public final class a extends k0 implements d
{
    @e
    private final y0 H;
    @e
    private final b I;
    private final boolean J;
    @e
    private final g K;
    
    public a(@e final y0 h, @e final b i, final boolean j, @e final g k) {
        kotlin.jvm.internal.k0.p((Object)h, "typeProjection");
        kotlin.jvm.internal.k0.p((Object)i, "constructor");
        kotlin.jvm.internal.k0.p((Object)k, "annotations");
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @e
    @Override
    public List<y0> M0() {
        return (List<y0>)v.E();
    }
    
    @Override
    public boolean O0() {
        return this.J;
    }
    
    @e
    public b W0() {
        return this.I;
    }
    
    @e
    public a X0(final boolean b) {
        if (b == this.O0()) {
            return this;
        }
        return new a(this.H, this.W0(), b, this.getAnnotations());
    }
    
    @e
    public a Y0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        final y0 b = this.H.b(g);
        kotlin.jvm.internal.k0.o((Object)b, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(b, this.W0(), this.O0(), this.getAnnotations());
    }
    
    @e
    public a Z0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new a(this.H, this.W0(), this.O0(), g);
    }
    
    @e
    public g getAnnotations() {
        return this.K;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.H);
        sb.append(')');
        String str;
        if (this.O0()) {
            str = "?";
        }
        else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
    
    @e
    @Override
    public h x() {
        final h i = u.i("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        kotlin.jvm.internal.k0.o((Object)i, "createErrorScope(\n            \"No member resolution should be done on captured type, it used only during constraint system resolution\", true\n        )");
        return i;
    }
}
