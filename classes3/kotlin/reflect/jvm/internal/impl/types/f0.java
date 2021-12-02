// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.i;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public final class f0 extends l1
{
    @e
    private final n H;
    @e
    private final a<c0> I;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i<c0> J;
    
    public f0(@e final n h, @e final a<? extends c0> i) {
        k0.p((Object)h, "storageManager");
        k0.p((Object)i, "computation");
        this.H = h;
        this.I = (a<c0>)i;
        this.J = h.g(i);
    }
    
    public static final /* synthetic */ a T0(final f0 f0) {
        return f0.I;
    }
    
    @e
    @Override
    protected c0 R0() {
        return (c0)((a)this.J).invoke();
    }
    
    @Override
    public boolean S0() {
        return this.J.v();
    }
    
    @e
    public f0 U0(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return new f0(this.H, (a<? extends c0>)new a<c0>() {
            final /* synthetic */ f0 H;
            
            @e
            public final c0 a() {
                return g.g((c0)f0.T0(this.H).invoke());
            }
        });
    }
}
