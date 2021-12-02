// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import n6.p;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "kotlinx/coroutines/i", "kotlinx/coroutines/j" }, d2 = {}, k = 4, mv = { 1, 4, 2 })
public final class h
{
    @e
    public static final <T> a1<T> a(@e final r0 r0, @e final g g, @e final u0 u0, @e final p<? super r0, ? super d<? super T>, ?> p4) {
        return j.a(r0, g, u0, p4);
    }
    
    @f
    public static final <T> Object c(@e final m0 m0, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return j.c(m0, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    private static final Object d(@e final m0 m0, @e final p p3, @e final d d) {
        return j.c(m0, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @e
    public static final k2 e(@e final r0 r0, @e final g g, @e final u0 u0, @e final p<? super r0, ? super d<? super j2>, ?> p4) {
        return j.e(r0, g, u0, p4);
    }
    
    public static final <T> T g(@e final g g, @e final p<? super r0, ? super d<? super T>, ?> p2) throws InterruptedException {
        return i.a(g, p2);
    }
    
    @f
    public static final <T> Object i(@e final g g, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return j.g(g, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
}
