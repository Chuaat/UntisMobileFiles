// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;

public abstract class i
{
    public abstract void a(@e final b p0);
    
    public abstract void b(@e final b p0, @e final b p1);
    
    public abstract void c(@e final b p0, @e final b p1);
    
    public void d(@e final b b, @e final Collection<? extends b> collection) {
        k0.p((Object)b, "member");
        k0.p((Object)collection, "overridden");
        b.A0((Collection)collection);
    }
}
