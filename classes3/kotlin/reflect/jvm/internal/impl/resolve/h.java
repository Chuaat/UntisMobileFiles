// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

public abstract class h extends i
{
    @Override
    public void b(@e final b b, @e final b b2) {
        k0.p((Object)b, "first");
        k0.p((Object)b2, "second");
        this.e(b, b2);
    }
    
    @Override
    public void c(@e final b b, @e final b b2) {
        k0.p((Object)b, "fromSuper");
        k0.p((Object)b2, "fromCurrent");
        this.e(b, b2);
    }
    
    protected abstract void e(@e final b p0, @e final b p1);
}
