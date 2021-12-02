// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class q extends b1
{
    @e
    public static final a e;
    @e
    private final b1 c;
    @e
    private final b1 d;
    
    static {
        e = new a(null);
    }
    
    private q(final b1 c, final b1 d) {
        this.c = c;
        this.d = d;
    }
    
    @k
    @e
    public static final b1 h(@e final b1 b1, @e final b1 b2) {
        return q.e.a(b1, b2);
    }
    
    @Override
    public boolean a() {
        return this.c.a() || this.d.a();
    }
    
    @Override
    public boolean b() {
        return this.c.b() || this.d.b();
    }
    
    @e
    @Override
    public g d(@e final g g) {
        k0.p((Object)g, "annotations");
        return this.d.d(this.c.d(g));
    }
    
    @f
    @Override
    public y0 e(@e final c0 c0) {
        k0.p((Object)c0, "key");
        y0 y0;
        if ((y0 = this.c.e(c0)) == null) {
            y0 = this.d.e(c0);
        }
        return y0;
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @e
    @Override
    public c0 g(@e final c0 c0, @e final k1 k1) {
        k0.p((Object)c0, "topLevelType");
        k0.p((Object)k1, "position");
        return this.d.g(this.c.g(c0, k1), k1);
    }
    
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final b1 a(@e final b1 b1, @e final b1 b2) {
            k0.p((Object)b1, "first");
            k0.p((Object)b2, "second");
            if (b1.f()) {
                return b2;
            }
            if (b2.f()) {
                return b1;
            }
            return new q(b1, b2, null);
        }
    }
}
