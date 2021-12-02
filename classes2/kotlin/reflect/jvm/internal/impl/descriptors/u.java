// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public abstract class u
{
    protected u() {
    }
    
    @f
    public final Integer a(@e final u u) {
        k0.p(u, "visibility");
        return this.b().a(u.b());
    }
    
    @e
    public abstract j1 b();
    
    @e
    public abstract String c();
    
    public final boolean d() {
        return this.b().c();
    }
    
    public abstract boolean e(@f final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e p0, @e final q p1, @e final m p2);
    
    @e
    public abstract u f();
    
    @e
    @Override
    public final String toString() {
        return this.b().toString();
    }
}
