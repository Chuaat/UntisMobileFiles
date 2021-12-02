// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;

public abstract class o extends n
{
    @e
    private final k0 H;
    
    public o(@e final k0 h) {
        kotlin.jvm.internal.k0.p((Object)h, "delegate");
        this.H = h;
    }
    
    @e
    @Override
    public k0 U0(final boolean b) {
        if (b == this.O0()) {
            return this;
        }
        return this.W0().U0(b).V0(this.getAnnotations());
    }
    
    @e
    @Override
    protected k0 W0() {
        return this.H;
    }
    
    @e
    public o Z0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        o o;
        if (g != this.getAnnotations()) {
            o = new kotlin.reflect.jvm.internal.impl.types.i(this, g);
        }
        else {
            o = this;
        }
        return o;
    }
}
