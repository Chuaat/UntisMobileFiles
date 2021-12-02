// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.g0;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

public final class p0 extends z0
{
    @e
    private final b1 a;
    @e
    private final b0 b;
    
    public p0(@e final b1 a) {
        k0.p((Object)a, "typeParameter");
        this.a = a;
        this.b = d0.b(g0.H, (a)new a<c0>() {
            final /* synthetic */ p0 G;
            
            @e
            public final c0 a() {
                return q0.a(p0.e(this.G));
            }
        });
    }
    
    public static final /* synthetic */ b1 e(final p0 p) {
        return p.a;
    }
    
    private final c0 f() {
        return (c0)this.b.getValue();
    }
    
    @e
    @Override
    public c0 a() {
        return this.f();
    }
    
    @e
    @Override
    public y0 b(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @e
    @Override
    public k1 c() {
        return k1.M;
    }
    
    @Override
    public boolean d() {
        return true;
    }
}
