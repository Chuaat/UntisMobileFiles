// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.jvm.internal.w;

public abstract class l1 extends c0
{
    public l1() {
        super(null);
    }
    
    @e
    @Override
    public List<y0> M0() {
        return this.R0().M0();
    }
    
    @e
    @Override
    public w0 N0() {
        return this.R0().N0();
    }
    
    @Override
    public boolean O0() {
        return this.R0().O0();
    }
    
    @e
    @Override
    public final j1 Q0() {
        c0 c0;
        for (c0 = this.R0(); c0 instanceof l1; c0 = ((l1)c0).R0()) {}
        return (j1)c0;
    }
    
    @e
    protected abstract c0 R0();
    
    public boolean S0() {
        return true;
    }
    
    @e
    public g getAnnotations() {
        return ((a)this.R0()).getAnnotations();
    }
    
    @e
    @Override
    public String toString() {
        String string;
        if (this.S0()) {
            string = this.R0().toString();
        }
        else {
            string = "<Not computed yet>";
        }
        return string;
    }
    
    @e
    @Override
    public h x() {
        return this.R0().x();
    }
}
