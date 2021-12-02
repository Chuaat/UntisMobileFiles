// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.r;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;

public abstract class c0 implements a, i
{
    private int G;
    
    private c0() {
    }
    
    private final int L0() {
        if (e0.a(this)) {
            return super.hashCode();
        }
        return (this.N0().hashCode() * 31 + this.M0().hashCode()) * 31 + (this.O0() ? 1 : 0);
    }
    
    @e
    public abstract List<y0> M0();
    
    @e
    public abstract w0 N0();
    
    public abstract boolean O0();
    
    @e
    public abstract c0 P0(@e final g p0);
    
    @e
    public abstract j1 Q0();
    
    @Override
    public final boolean equals(@f final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c0)) {
            return false;
        }
        final boolean o2 = this.O0();
        final c0 c0 = (c0)o;
        if (o2 != c0.O0() || !r.a.a(this.Q0(), c0.Q0())) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int g = this.G;
        if (g != 0) {
            return g;
        }
        return this.G = this.L0();
    }
    
    @e
    public abstract h x();
}
