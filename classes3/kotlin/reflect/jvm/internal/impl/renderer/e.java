// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.k0;
import kotlin.collections.m;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import m6.d;
import java.util.Set;

public enum e
{
    @org.jetbrains.annotations.e
    public static final a H;
    @d
    @org.jetbrains.annotations.e
    public static final Set<e> I;
    @d
    @org.jetbrains.annotations.e
    public static final Set<e> J;
    
    K(true), 
    L(true), 
    M(true), 
    N(false), 
    O(true), 
    P(true), 
    Q(true), 
    R(true), 
    S(true), 
    T(true), 
    U(true), 
    V(true), 
    W(true), 
    X(true);
    
    private final boolean G;
    
    static {
        H = new a(null);
        final e[] values = values();
        final ArrayList<e> list = new ArrayList<e>();
        for (final e e : values) {
            if (e.b()) {
                list.add(e);
            }
        }
        I = v.N5((Iterable)list);
        J = m.Gy((Object[])values());
    }
    
    private e(final boolean g) {
        this.G = g;
    }
    
    public final boolean b() {
        return this.G;
    }
    
    public static final class a
    {
        private a() {
        }
    }
}
