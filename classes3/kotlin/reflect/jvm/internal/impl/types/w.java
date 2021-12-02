// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.model.g;

public abstract class w extends j1 implements g
{
    @e
    private final k0 H;
    @e
    private final k0 I;
    
    public w(@e final k0 h, @e final k0 i) {
        kotlin.jvm.internal.k0.p((Object)h, "lowerBound");
        kotlin.jvm.internal.k0.p((Object)i, "upperBound");
        super(null);
        this.H = h;
        this.I = i;
    }
    
    @e
    @Override
    public List<y0> M0() {
        return this.U0().M0();
    }
    
    @e
    @Override
    public w0 N0() {
        return this.U0().N0();
    }
    
    @Override
    public boolean O0() {
        return this.U0().O0();
    }
    
    @e
    public abstract k0 U0();
    
    @e
    public final k0 V0() {
        return this.H;
    }
    
    @e
    public final k0 W0() {
        return this.I;
    }
    
    @e
    public abstract String X0(@e final c p0, @e final f p1);
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return ((a)this.U0()).getAnnotations();
    }
    
    @e
    @Override
    public String toString() {
        return c.j.y(this);
    }
    
    @e
    @Override
    public h x() {
        return this.U0().x();
    }
}
