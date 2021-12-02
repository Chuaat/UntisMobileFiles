// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.NoSuchElementException;
import o6.a;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0015" }, d2 = { "Lkotlin/sequences/v;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "", "n", "b", "a", "", "iterator", "I", "startIndex", "f", "()I", "count", "Lkotlin/sequences/m;", "sequence", "c", "endIndex", "<init>", "(Lkotlin/sequences/m;II)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class v<T> implements m<T>, e<T>
{
    private final m<T> a;
    private final int b;
    private final int c;
    
    public v(@org.jetbrains.annotations.e final m<? extends T> a, final int i, final int j) {
        k0.p((Object)a, "sequence");
        this.a = (m<T>)a;
        this.b = i;
        this.c = j;
        final int n = 1;
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("startIndex should be non-negative, but is ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j < 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex should be non-negative, but is ");
            sb2.append(j);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n2;
        if (j >= i) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex should be not less than startIndex, but was ");
        sb3.append(j);
        sb3.append(" < ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public static final /* synthetic */ int c(final v v) {
        return v.c;
    }
    
    public static final /* synthetic */ m d(final v v) {
        return v.a;
    }
    
    public static final /* synthetic */ int e(final v v) {
        return v.b;
    }
    
    private final int f() {
        return this.c - this.b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m<T> a(final int n) {
        v v;
        if (n >= this.f()) {
            v = this;
        }
        else {
            final m<T> a = this.a;
            final int b = this.b;
            v = new v(a, b, n + b);
        }
        return v;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public m<T> b(final int n) {
        m<T> j;
        if (n >= this.f()) {
            j = p.j();
        }
        else {
            j = new v(this.a, this.b + n, this.c);
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @org.jetbrains.annotations.e
            private final Iterator<T> G = v.d(v.this).iterator();
            private int H;
            final /* synthetic */ v I;
            
            private final void a() {
                while (this.H < v.e(this.I) && this.G.hasNext()) {
                    this.G.next();
                    ++this.H;
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
                return this.H < v.c(this.I) && this.G.hasNext();
            }
            
            @Override
            public T next() {
                this.a();
                if (this.H < v.c(this.I)) {
                    ++this.H;
                    return this.G.next();
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
