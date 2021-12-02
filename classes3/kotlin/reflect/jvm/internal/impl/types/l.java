// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.checker.o;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.model.e;

public final class l extends n implements k, e
{
    @org.jetbrains.annotations.e
    public static final a J;
    @org.jetbrains.annotations.e
    private final k0 H;
    private final boolean I;
    
    static {
        J = new a(null);
    }
    
    private l(final k0 h, final boolean i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    public boolean L() {
        return this.W0().N0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n || this.W0().N0().c() instanceof b1;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public c0 O(@org.jetbrains.annotations.e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "replacement");
        return n0.e(c0.Q0(), this.I);
    }
    
    @Override
    public boolean O0() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public k0 U0(final boolean b) {
        k0 u0;
        if (b) {
            u0 = this.W0().U0(b);
        }
        else {
            u0 = this;
        }
        return u0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected k0 W0() {
        return this.H;
    }
    
    @org.jetbrains.annotations.e
    public final k0 Z0() {
        return this.H;
    }
    
    @org.jetbrains.annotations.e
    public l a1(@org.jetbrains.annotations.e final g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new l(this.W0().V0(g), this.I);
    }
    
    @org.jetbrains.annotations.e
    public l b1(@org.jetbrains.annotations.e final k0 k0) {
        kotlin.jvm.internal.k0.p((Object)k0, "delegate");
        return new l(k0, this.I);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.W0());
        sb.append("!!");
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final boolean a(final j1 j1) {
            return j1.N0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n || j1.N0().c() instanceof b1 || j1 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i;
        }
        
        private final boolean c(final j1 j1, final boolean b) {
            if (!this.a(j1)) {
                return false;
            }
            if (b && j1.N0().c() instanceof b1) {
                return f1.l(j1);
            }
            return o.a.a(j1) ^ true;
        }
        
        @f
        public final l b(@org.jetbrains.annotations.e final j1 j1, final boolean b) {
            kotlin.jvm.internal.k0.p((Object)j1, "type");
            final boolean b2 = j1 instanceof l;
            l l = null;
            if (b2) {
                l = (l)j1;
            }
            else if (this.c(j1, b)) {
                if (j1 instanceof kotlin.reflect.jvm.internal.impl.types.w) {
                    final kotlin.reflect.jvm.internal.impl.types.w w = (kotlin.reflect.jvm.internal.impl.types.w)j1;
                    kotlin.jvm.internal.k0.g((Object)w.V0().N0(), (Object)w.W0().N0());
                }
                l = new l(z.c(j1), b, null);
            }
            return l;
        }
    }
}
