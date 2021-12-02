// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import org.jetbrains.annotations.e;
import java.util.List;

public abstract class n extends k0
{
    @e
    @Override
    public List<y0> M0() {
        return this.W0().M0();
    }
    
    @e
    @Override
    public w0 N0() {
        return this.W0().N0();
    }
    
    @Override
    public boolean O0() {
        return this.W0().O0();
    }
    
    @e
    protected abstract k0 W0();
    
    @e
    public k0 X0(@e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return this.Y0((k0)g.g(this.W0()));
    }
    
    @e
    public abstract n Y0(@e final k0 p0);
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return ((a)this.W0()).getAnnotations();
    }
    
    @e
    @Override
    public h x() {
        return this.W0().x();
    }
}
