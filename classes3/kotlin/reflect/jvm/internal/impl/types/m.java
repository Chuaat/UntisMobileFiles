// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public class m extends b1
{
    @e
    private final b1 c;
    
    public m(@e final b1 c) {
        k0.p((Object)c, "substitution");
        this.c = c;
    }
    
    @Override
    public boolean a() {
        return this.c.a();
    }
    
    @Override
    public boolean b() {
        return this.c.b();
    }
    
    @e
    @Override
    public g d(@e final g g) {
        k0.p((Object)g, "annotations");
        return this.c.d(g);
    }
    
    @f
    @Override
    public y0 e(@e final c0 c0) {
        k0.p((Object)c0, "key");
        return this.c.e(c0);
    }
    
    @Override
    public boolean f() {
        return this.c.f();
    }
    
    @e
    @Override
    public c0 g(@e final c0 c0, @e final k1 k1) {
        k0.p((Object)c0, "topLevelType");
        k0.p((Object)k1, "position");
        return this.c.g(c0, k1);
    }
}
