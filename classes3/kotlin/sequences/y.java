// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.collections.v;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e" }, d2 = { "Lkotlin/sequences/y;", "T", "R", "Lkotlin/sequences/m;", "", "iterator", "a", "Lkotlin/sequences/m;", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lkotlin/sequences/m;Ln6/p;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class y<T, R> implements m<R>
{
    private final m<T> a;
    private final p<Integer, T, R> b;
    
    public y(@e final m<? extends T> a, @e final p<? super Integer, ? super T, ? extends R> b) {
        k0.p((Object)a, "sequence");
        k0.p((Object)b, "transformer");
        this.a = (m<T>)a;
        this.b = (p<Integer, T, R>)b;
    }
    
    public static final /* synthetic */ m c(final y y) {
        return y.a;
    }
    
    public static final /* synthetic */ p d(final y y) {
        return y.b;
    }
    
    @e
    @Override
    public Iterator<R> iterator() {
        return new Iterator<R>() {
            @e
            private final Iterator<T> G = y.c(y.this).iterator();
            private int H;
            final /* synthetic */ y I;
            
            public final int a() {
                return this.H;
            }
            
            @e
            public final Iterator<T> b() {
                return this.G;
            }
            
            public final void c(final int h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext();
            }
            
            @Override
            public R next() {
                final p d = y.d(this.I);
                final int i = this.H++;
                if (i < 0) {
                    v.W();
                }
                return (R)d.invoke((Object)i, (Object)this.G.next());
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
