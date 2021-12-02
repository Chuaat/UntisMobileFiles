// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0010" }, d2 = { "Lkotlin/sequences/l;", "T1", "T2", "V", "Lkotlin/sequences/m;", "", "iterator", "b", "Lkotlin/sequences/m;", "sequence2", "a", "sequence1", "Lkotlin/Function2;", "transform", "<init>", "(Lkotlin/sequences/m;Lkotlin/sequences/m;Ln6/p;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class l<T1, T2, V> implements m<V>
{
    private final m<T1> a;
    private final m<T2> b;
    private final p<T1, T2, V> c;
    
    public l(@e final m<? extends T1> a, @e final m<? extends T2> b, @e final p<? super T1, ? super T2, ? extends V> c) {
        k0.p((Object)a, "sequence1");
        k0.p((Object)b, "sequence2");
        k0.p((Object)c, "transform");
        this.a = (m<T1>)a;
        this.b = (m<T2>)b;
        this.c = (p<T1, T2, V>)c;
    }
    
    public static final /* synthetic */ m c(final l l) {
        return l.a;
    }
    
    public static final /* synthetic */ m d(final l l) {
        return l.b;
    }
    
    public static final /* synthetic */ p e(final l l) {
        return l.c;
    }
    
    @e
    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            @e
            private final Iterator<T1> G = l.c(l.this).iterator();
            @e
            private final Iterator<T2> H = l.d(l.this).iterator();
            final /* synthetic */ l I;
            
            @e
            public final Iterator<T1> a() {
                return this.G;
            }
            
            @e
            public final Iterator<T2> b() {
                return this.H;
            }
            
            @Override
            public boolean hasNext() {
                return this.G.hasNext() && this.H.hasNext();
            }
            
            @Override
            public V next() {
                return (V)l.e(this.I).invoke((Object)this.G.next(), (Object)this.H.next());
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
