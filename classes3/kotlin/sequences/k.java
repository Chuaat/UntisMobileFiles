// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.collections.v;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.collections.q0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lkotlin/sequences/k;", "T", "Lkotlin/sequences/m;", "Lkotlin/collections/q0;", "", "iterator", "a", "Lkotlin/sequences/m;", "sequence", "<init>", "(Lkotlin/sequences/m;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class k<T> implements m<q0<? extends T>>
{
    private final m<T> a;
    
    public k(@e final m<? extends T> a) {
        k0.p((Object)a, "sequence");
        this.a = (m<T>)a;
    }
    
    public static final /* synthetic */ m c(final k k) {
        return k.a;
    }
    
    @e
    @Override
    public Iterator<q0<T>> iterator() {
        return (Iterator<q0<T>>)new Iterator<q0<? extends T>>() {
            @e
            private final Iterator<T> G = k.c(k.this).iterator();
            private int H;
            
            public final int a() {
                return this.H;
            }
            
            @e
            public final Iterator<T> b() {
                return this.G;
            }
            
            @e
            public q0<T> c() {
                final int n = this.H++;
                if (n < 0) {
                    v.W();
                }
                return (q0<T>)new q0(n, (Object)this.G.next());
            }
            
            public final void d(final int h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
