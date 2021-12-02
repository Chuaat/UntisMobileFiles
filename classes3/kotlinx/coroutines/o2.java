// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.coroutines.d;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "kotlinx/coroutines/p2", "kotlinx/coroutines/q2" }, d2 = {}, k = 4, mv = { 1, 4, 2 })
public final class o2
{
    public static final void A(@e final g g) {
        q2.y(g);
    }
    
    public static final void B(@e final k2 k2) {
        q2.z(k2);
    }
    
    @e
    public static final k2 C(@e final g g) {
        return q2.A(g);
    }
    
    public static final boolean D(@e final g g) {
        return q2.B(g);
    }
    
    @f2
    @e
    public static final l1 a(@e final a<j2> a) {
        return q2.a(a);
    }
    
    @e
    public static final b0 b(@f final k2 k2) {
        return q2.b(k2);
    }
    
    public static final void g(@e final g g, @f final CancellationException ex) {
        q2.g(g, ex);
    }
    
    public static final void h(@e final k2 k2, @e final String s, @f final Throwable t) {
        q2.h(k2, s, t);
    }
    
    @f
    public static final Object m(@e final k2 k2, @e final d<? super j2> d) {
        return q2.m(k2, d);
    }
    
    public static final void p(@e final g g, @f final CancellationException ex) {
        q2.p(g, ex);
    }
    
    public static final void s(@e final k2 k2, @f final CancellationException ex) {
        q2.s(k2, ex);
    }
    
    public static final void x(@e final o<?> o, @e final Future<?> future) {
        p2.a(o, future);
    }
    
    @f2
    @e
    public static final l1 y(@e final k2 k2, @e final Future<?> future) {
        return p2.b(k2, future);
    }
    
    @e
    public static final l1 z(@e final k2 k2, @e final l1 l1) {
        return q2.x(k2, l1);
    }
}
