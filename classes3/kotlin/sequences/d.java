// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlin/sequences/d;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "", "n", "b", "a", "", "iterator", "Lkotlin/sequences/m;", "sequence", "I", "count", "<init>", "(Lkotlin/sequences/m;I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class d<T> implements m<T>, e<T>
{
    private final m<T> a;
    private final int b;
    
    public d(@org.jetbrains.annotations.e final m<? extends T> a, final int n) {
        k0.p((Object)a, "sequence");
        this.a = (m<T>)a;
        this.b = n;
        if (n >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("count must be non-negative, but was ");
        sb.append(n);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final /* synthetic */ int c(final d d) {
        return d.b;
    }
    
    public static final /* synthetic */ m d(final d d) {
        return d.a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m<T> a(final int n) {
        final int b = this.b;
        final int n2 = b + n;
        Object o;
        if (n2 < 0) {
            o = new w<T>(this, n);
        }
        else {
            o = new v(this.a, b, n2);
        }
        return (m<T>)o;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m<T> b(final int n) {
        final int n2 = this.b + n;
        d d;
        if (n2 < 0) {
            d = new d(this, n);
        }
        else {
            d = new d(this.a, n2);
        }
        return d;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @org.jetbrains.annotations.e
            private final Iterator<T> G = d.d(d.this).iterator();
            private int H = d.c(d.this);
            
            private final void a() {
                while (this.H > 0 && this.G.hasNext()) {
                    this.G.next();
                    --this.H;
                }
            }
            
            @org.jetbrains.annotations.e
            public final Iterator<T> b() {
                return this.G;
            }
            
            public final int c() {
                return this.H;
            }
            
            public final void d(final int h) {
                this.H = h;
            }
            
            @Override
            public boolean hasNext() {
                this.a();
                return this.G.hasNext();
            }
            
            @Override
            public T next() {
                this.a();
                return this.G.next();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
