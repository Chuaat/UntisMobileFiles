// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

final class c implements b1
{
    @e
    private final b1 G;
    @e
    private final m H;
    private final int I;
    
    public c(@e final b1 g, @e final m h, final int i) {
        k0.p(g, "originalDescriptor");
        k0.p(h, "declarationDescriptor");
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.k0 A() {
        return this.G.A();
    }
    
    public <R, D> R P(final o<R, D> o, final D n) {
        return this.G.P(o, n);
    }
    
    @e
    @Override
    public b1 b() {
        final b1 b = this.G.b();
        k0.o(b, "originalDescriptor.original");
        return b;
    }
    
    @e
    public m c() {
        return this.H;
    }
    
    @e
    public g getAnnotations() {
        return this.G.getAnnotations();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        return this.G.getName();
    }
    
    @e
    @Override
    public List<c0> getUpperBounds() {
        return this.G.getUpperBounds();
    }
    
    @Override
    public int i() {
        return this.I + this.G.i();
    }
    
    @e
    public w0 k() {
        return this.G.k();
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.w0 l() {
        return this.G.l();
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.storage.n l0() {
        return this.G.l0();
    }
    
    @Override
    public boolean r() {
        return this.G.r();
    }
    
    @Override
    public boolean s0() {
        return true;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append("[inner-copy]");
        return sb.toString();
    }
    
    @e
    @Override
    public k1 v() {
        return this.G.v();
    }
}
