// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public abstract class r extends u
{
    @e
    private final j1 a;
    
    public r(@e final j1 a) {
        k0.p(a, "delegate");
        this.a = a;
    }
    
    @e
    @Override
    public j1 b() {
        return this.a;
    }
    
    @e
    @Override
    public String c() {
        return this.b().b();
    }
    
    @e
    @Override
    public u f() {
        final u j = t.j(this.b().d());
        k0.o(j, "toDescriptorVisibility(delegate.normalize())");
        return j;
    }
}
