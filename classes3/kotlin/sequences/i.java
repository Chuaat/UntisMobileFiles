// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.f;
import o6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0096\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e" }, d2 = { "Lkotlin/sequences/i;", "T", "R", "E", "Lkotlin/sequences/m;", "", "iterator", "a", "Lkotlin/sequences/m;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lkotlin/sequences/m;Ln6/l;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class i<T, R, E> implements m<E>
{
    private final m<T> a;
    private final l<T, R> b;
    private final l<R, Iterator<E>> c;
    
    public i(@e final m<? extends T> a, @e final l<? super T, ? extends R> b, @e final l<? super R, ? extends Iterator<? extends E>> c) {
        k0.p((Object)a, "sequence");
        k0.p((Object)b, "transformer");
        k0.p((Object)c, "iterator");
        this.a = (m<T>)a;
        this.b = (l<T, R>)b;
        this.c = (l<R, Iterator<E>>)c;
    }
    
    public static final /* synthetic */ l c(final i i) {
        return i.c;
    }
    
    public static final /* synthetic */ m d(final i i) {
        return i.a;
    }
    
    public static final /* synthetic */ l e(final i i) {
        return i.b;
    }
    
    @e
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @e
            private final Iterator<T> G = i.d(i.this).iterator();
            @f
            private Iterator<? extends E> H;
            final /* synthetic */ i I;
            
            private final boolean a() {
                final Iterator<? extends E> h = this.H;
                if (h != null && !h.hasNext()) {
                    this.H = null;
                }
                while (this.H == null) {
                    if (!this.G.hasNext()) {
                        return false;
                    }
                    final Iterator h2 = (Iterator)i.c(this.I).invoke(i.e(this.I).invoke((Object)this.G.next()));
                    if (h2.hasNext()) {
                        this.H = (Iterator<? extends E>)h2;
                        break;
                    }
                }
                return true;
            }
            
            @f
            public final Iterator<E> b() {
                return (Iterator<E>)this.H;
            }
            
            @e
            public final Iterator<T> c() {
                return this.G;
            }
            
            public final void d(@f final Iterator<? extends E> h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                return this.a();
            }
            
            @Override
            public E next() {
                if (this.a()) {
                    final Iterator<? extends E> h = this.H;
                    k0.m((Object)h);
                    return (E)h.next();
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
