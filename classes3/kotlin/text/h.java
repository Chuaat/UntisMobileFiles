// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.ranges.o;
import org.jetbrains.annotations.f;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.s0;
import n6.p;
import kotlin.Metadata;
import kotlin.ranges.k;
import kotlin.sequences.m;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012:\u0010\u0015\u001a6\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00130\u000f¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0018" }, d2 = { "Lkotlin/text/h;", "Lkotlin/sequences/m;", "Lkotlin/ranges/k;", "", "iterator", "", "b", "I", "startIndex", "", "a", "Ljava/lang/CharSequence;", "input", "c", "limit", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "currentIndex", "Lkotlin/s0;", "Lkotlin/s;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILn6/p;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class h implements m<k>
{
    private final CharSequence a;
    private final int b;
    private final int c;
    private final p<CharSequence, Integer, s0<Integer, Integer>> d;
    
    public h(@e final CharSequence a, final int b, final int c, @e final p<? super CharSequence, ? super Integer, s0<Integer, Integer>> d) {
        k0.p((Object)a, "input");
        k0.p((Object)d, "getNextMatch");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (p<CharSequence, Integer, s0<Integer, Integer>>)d;
    }
    
    public static final /* synthetic */ p c(final h h) {
        return h.d;
    }
    
    public static final /* synthetic */ CharSequence d(final h h) {
        return h.a;
    }
    
    public static final /* synthetic */ int e(final h h) {
        return h.c;
    }
    
    public static final /* synthetic */ int f(final h h) {
        return h.b;
    }
    
    @e
    @Override
    public Iterator<k> iterator() {
        return new Iterator<k>() {
            private int G = -1;
            private int H;
            private int I;
            @f
            private k J;
            private int K;
            final /* synthetic */ h L;
            
            {
                final int b = o.B(h.f(h.this), 0, h.d(h.this).length());
                this.H = b;
                this.I = b;
            }
            
            private final void a() {
                final int i = this.I;
                int n = 0;
                if (i < 0) {
                    this.G = 0;
                    this.J = null;
                }
                else {
                    final int e = h.e(this.L);
                    final int n2 = -1;
                    int k = 0;
                    Label_0111: {
                        k j;
                        if ((e > 0 && ++this.K >= h.e(this.L)) || this.I > h.d(this.L).length()) {
                            j = new k(this.H, s.i3(h.d(this.L)));
                        }
                        else {
                            final s0 s0 = (s0)h.c(this.L).invoke((Object)h.d(this.L), (Object)this.I);
                            if (s0 != null) {
                                final int intValue = ((Number)s0.a()).intValue();
                                final int intValue2 = ((Number)s0.b()).intValue();
                                this.J = o.n1(this.H, intValue);
                                final int h = intValue + intValue2;
                                this.H = h;
                                if (intValue2 == 0) {
                                    n = 1;
                                }
                                k = h + n;
                                break Label_0111;
                            }
                            j = new k(this.H, s.i3(h.d(this.L)));
                        }
                        this.J = j;
                        k = n2;
                    }
                    this.I = k;
                    this.G = 1;
                }
            }
            
            public final int b() {
                return this.K;
            }
            
            public final int c() {
                return this.H;
            }
            
            @f
            public final k d() {
                return this.J;
            }
            
            public final int e() {
                return this.I;
            }
            
            public final int f() {
                return this.G;
            }
            
            @e
            public k g() {
                if (this.G == -1) {
                    this.a();
                }
                if (this.G != 0) {
                    final k j = this.J;
                    Objects.requireNonNull(j, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.J = null;
                    this.G = -1;
                    return j;
                }
                throw new NoSuchElementException();
            }
            
            public final void h(final int k) {
                this.K = k;
            }
            
            @Override
            public boolean hasNext() {
                if (this.G == -1) {
                    this.a();
                }
                final int g = this.G;
                boolean b = true;
                if (g != 1) {
                    b = false;
                }
                return b;
            }
            
            public final void i(final int h) {
                this.H = h;
            }
            
            public final void k(@f final k j) {
                this.J = j;
            }
            
            public final void o(final int i) {
                this.I = i;
            }
            
            public final void p(final int g) {
                this.G = g;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
