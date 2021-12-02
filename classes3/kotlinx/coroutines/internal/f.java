// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.e;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001ao\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000228\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0082\b\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0015\u001a\u00020\u00108\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/internal/h0;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/i0;", "d", "(Lkotlinx/coroutines/internal/h0;JLn6/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/g;", "N", "c", "(Lkotlinx/coroutines/internal/g;)Lkotlinx/coroutines/internal/g;", "Lkotlinx/coroutines/internal/k0;", "b", "Lkotlinx/coroutines/internal/k0;", "getCLOSED$annotations", "()V", "CLOSED", "", "a", "I", "POINTERS_SHIFT", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class f
{
    private static final int a = 16;
    private static final k0 b;
    
    static {
        b = new k0("CLOSED");
    }
    
    public static final /* synthetic */ k0 b() {
        return f.b;
    }
    
    @e
    public static final <N extends g<N>> N c(@e N n) {
        while (true) {
            final Object a = g.a((g<g>)n);
            if (a == b()) {
                return n;
            }
            final g<N> g = (N)a;
            if (g == null) {
                if (n.j()) {
                    return n;
                }
                continue;
            }
            else {
                n = (N)g;
            }
        }
    }
    
    private static final <S extends h0<S>> Object d(final S n, final long n2, final p<? super Long, ? super S, ? extends S> p3) {
        g<S> g = (g<S>)n;
        while (((h0)g).o() < n2 || ((h0)g).g()) {
            final Object a = kotlinx.coroutines.internal.g.a((g<g>)g);
            if (a == b()) {
                return i0.b(b());
            }
            Object o = a;
            if (o == null) {
                final h0 h0 = (h0)p3.invoke((Object)(((h0)g).o() + 1L), (Object)g);
                if (!g.m(h0)) {
                    continue;
                }
                o = h0;
                if (((h0)g).g()) {
                    g.l();
                    o = h0;
                }
            }
            g = (g<S>)o;
        }
        return i0.b(g);
    }
}
