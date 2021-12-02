// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

public abstract class e extends k0
{
    @org.jetbrains.annotations.e
    private final w0 H;
    private final boolean I;
    @org.jetbrains.annotations.e
    private final w0 J;
    @org.jetbrains.annotations.e
    private final h K;
    
    public e(@org.jetbrains.annotations.e final w0 h, final boolean i, @org.jetbrains.annotations.e final w0 j, @org.jetbrains.annotations.e final h k) {
        kotlin.jvm.internal.k0.p((Object)h, "originalTypeVariable");
        kotlin.jvm.internal.k0.p((Object)j, "constructor");
        kotlin.jvm.internal.k0.p((Object)k, "memberScope");
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<y0> M0() {
        return (List<y0>)v.E();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public w0 N0() {
        return this.J;
    }
    
    @Override
    public boolean O0() {
        return this.I;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 U0(final boolean b) {
        e x0;
        if (b == this.O0()) {
            x0 = this;
        }
        else {
            x0 = this.X0(b);
        }
        return x0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 V0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return this;
    }
    
    @org.jetbrains.annotations.e
    protected final w0 W0() {
        return this.H;
    }
    
    @org.jetbrains.annotations.e
    public abstract e X0(final boolean p0);
    
    @org.jetbrains.annotations.e
    public e Y0(@org.jetbrains.annotations.e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return kotlin.jvm.internal.k0.C("NonFixed: ", (Object)this.H);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public h x() {
        return this.K;
    }
}
