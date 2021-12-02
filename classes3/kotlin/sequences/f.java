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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\r" }, d2 = { "Lkotlin/sequences/f;", "T", "Lkotlin/sequences/m;", "", "iterator", "a", "Lkotlin/sequences/m;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/m;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class f<T> implements m<T>
{
    private final m<T> a;
    private final l<T, Boolean> b;
    
    public f(@e final m<? extends T> a, @e final l<? super T, Boolean> b) {
        k0.p((Object)a, "sequence");
        k0.p((Object)b, "predicate");
        this.a = (m<T>)a;
        this.b = (l<T, Boolean>)b;
    }
    
    public static final /* synthetic */ l c(final f f) {
        return f.b;
    }
    
    public static final /* synthetic */ m d(final f f) {
        return f.a;
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @e
            private final Iterator<T> G = f.d(f.this).iterator();
            private int H = -1;
            @org.jetbrains.annotations.f
            private T I;
            final /* synthetic */ f J;
            
            private final void a() {
                while (true) {
                    while (this.G.hasNext()) {
                        final T next = this.G.next();
                        if (!(boolean)f.c(this.J).invoke((Object)next)) {
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
            
            public final int b() {
                return this.H;
            }
            
            @e
            public final Iterator<T> c() {
                return this.G;
            }
            
            @org.jetbrains.annotations.f
            public final T d() {
                return this.I;
            }
            
            public final void e(final int h) {
                this.H = h;
            }
            
            public final void f(@org.jetbrains.annotations.f final T i) {
                this.I = i;
            }
            
            @Override
            public boolean hasNext() {
                if (this.H == -1) {
                    this.a();
                }
                final int h = this.H;
                boolean b = true;
                if (h != 1) {
                    b = (this.G.hasNext() && b);
                }
                return b;
            }
            
            @Override
            public T next() {
                if (this.H == -1) {
                    this.a();
                }
                if (this.H == 1) {
                    final T i = this.I;
                    this.I = null;
                    this.H = 0;
                    return i;
                }
                return this.G.next();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
