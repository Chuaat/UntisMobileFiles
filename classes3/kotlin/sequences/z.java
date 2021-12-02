// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J5\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010" }, d2 = { "Lkotlin/sequences/z;", "T", "R", "Lkotlin/sequences/m;", "", "iterator", "E", "Lkotlin/Function1;", "e", "(Ln6/l;)Lkotlin/sequences/m;", "a", "Lkotlin/sequences/m;", "sequence", "transformer", "<init>", "(Lkotlin/sequences/m;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class z<T, R> implements m<R>
{
    private final m<T> a;
    private final l<T, R> b;
    
    public z(@e final m<? extends T> a, @e final l<? super T, ? extends R> b) {
        k0.p((Object)a, "sequence");
        k0.p((Object)b, "transformer");
        this.a = (m<T>)a;
        this.b = (l<T, R>)b;
    }
    
    public static final /* synthetic */ m c(final z z) {
        return z.a;
    }
    
    public static final /* synthetic */ l d(final z z) {
        return z.b;
    }
    
    @e
    public final <E> m<E> e(@e final l<? super R, ? extends Iterator<? extends E>> l) {
        k0.p((Object)l, "iterator");
        return new i<Object, Object, E>(this.a, this.b, l);
    }
    
    @e
    @Override
    public Iterator<R> iterator() {
        return new Iterator<R>() {
            @e
            private final Iterator<T> G = z.c(z.this).iterator();
            final /* synthetic */ z H;
            
            @e
            public final Iterator<T> a() {
                return this.G;
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext();
            }
            
            @Override
            public R next() {
                return (R)z.d(this.H).invoke((Object)this.G.next());
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
