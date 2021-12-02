// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.NoSuchElementException;
import java.util.Objects;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import n6.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002¨\u0006\f" }, d2 = { "Lkotlin/sequences/j;", "", "T", "Lkotlin/sequences/m;", "", "iterator", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Ln6/a;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class j<T> implements m<T>
{
    private final a<T> a;
    private final l<T, T> b;
    
    public j(@e final a<? extends T> a, @e final l<? super T, ? extends T> b) {
        k0.p((Object)a, "getInitialValue");
        k0.p((Object)b, "getNextValue");
        this.a = (a<T>)a;
        this.b = (l<T, T>)b;
    }
    
    public static final /* synthetic */ a c(final j j) {
        return j.a;
    }
    
    public static final /* synthetic */ l d(final j j) {
        return j.b;
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @f
            private T G;
            private int H = -2;
            final /* synthetic */ j I;
            
            private final void a() {
                Object g;
                if (this.H == -2) {
                    g = j.c(this.I).invoke();
                }
                else {
                    final l d = j.d(this.I);
                    final T g2 = this.G;
                    k0.m((Object)g2);
                    g = d.invoke((Object)g2);
                }
                this.G = (T)g;
                this.H = ((g != null) ? 1 : 0);
            }
            
            @f
            public final T b() {
                return this.G;
            }
            
            public final int c() {
                return this.H;
            }
            
            public final void d(@f final T g) {
                this.G = g;
            }
            
            public final void e(final int h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                if (this.H < 0) {
                    this.a();
                }
                final int h = this.H;
                boolean b = true;
                if (h != 1) {
                    b = false;
                }
                return b;
            }
            
            @e
            @Override
            public T next() {
                if (this.H < 0) {
                    this.a();
                }
                if (this.H != 0) {
                    final T g = this.G;
                    Objects.requireNonNull(g, "null cannot be cast to non-null type T");
                    this.H = -1;
                    return g;
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
