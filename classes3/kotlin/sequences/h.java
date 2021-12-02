// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.f;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010" }, d2 = { "Lkotlin/sequences/h;", "T", "Lkotlin/sequences/m;", "", "iterator", "a", "Lkotlin/sequences/m;", "sequence", "", "b", "Z", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/m;ZLn6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class h<T> implements m<T>
{
    private final m<T> a;
    private final boolean b;
    private final l<T, Boolean> c;
    
    public h(@e final m<? extends T> a, final boolean b, @e final l<? super T, Boolean> c) {
        k0.p((Object)a, "sequence");
        k0.p((Object)c, "predicate");
        this.a = (m<T>)a;
        this.b = b;
        this.c = (l<T, Boolean>)c;
    }
    
    public static final /* synthetic */ l c(final h h) {
        return h.c;
    }
    
    public static final /* synthetic */ boolean d(final h h) {
        return h.b;
    }
    
    public static final /* synthetic */ m e(final h h) {
        return h.a;
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @e
            private final Iterator<T> G = h.e(h.this).iterator();
            private int H = -1;
            @f
            private T I;
            final /* synthetic */ h J;
            
            private final void a() {
                while (true) {
                    while (this.G.hasNext()) {
                        final T next = this.G.next();
                        if ((boolean)h.c(this.J).invoke((Object)next) == h.d(this.J)) {
                            this.I = next;
                            final int h = 1;
                            this.H = h;
                            return;
                        }
                    }
                    final int h = 0;
                    continue;
                }
            }
            
            @e
            public final Iterator<T> b() {
                return this.G;
            }
            
            @f
            public final T c() {
                return this.I;
            }
            
            public final int d() {
                return this.H;
            }
            
            public final void e(@f final T i) {
                this.I = i;
            }
            
            public final void f(final int h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                if (this.H == -1) {
                    this.a();
                }
                final int h = this.H;
                boolean b = true;
                if (h != 1) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public T next() {
                if (this.H == -1) {
                    this.a();
                }
                if (this.H != 0) {
                    final T i = this.I;
                    this.I = null;
                    this.H = -1;
                    return i;
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
