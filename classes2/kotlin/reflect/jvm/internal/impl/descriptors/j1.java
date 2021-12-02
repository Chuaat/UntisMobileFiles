// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public abstract class j1
{
    @e
    private final String a;
    private final boolean b;
    
    protected j1(@e final String a, final boolean b) {
        k0.p(a, "name");
        this.a = a;
        this.b = b;
    }
    
    @f
    public Integer a(@e final j1 j1) {
        k0.p(j1, "visibility");
        return i1.a.a(this, j1);
    }
    
    @e
    public String b() {
        return this.a;
    }
    
    public final boolean c() {
        return this.b;
    }
    
    @e
    public j1 d() {
        return this;
    }
    
    @e
    @Override
    public final String toString() {
        return this.b();
    }
}
