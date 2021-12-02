// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.p;
import kotlin.j2;
import kotlin.jvm.internal.j1;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001&B\u0017\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J*\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'" }, d2 = { "Lkotlin/coroutines/c;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "k", "Lkotlin/coroutines/g$b;", "element", "", "e", "context", "i", "", "l", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "minusKey", "other", "equals", "hashCode", "", "toString", "H", "Lkotlin/coroutines/g$b;", "G", "Lkotlin/coroutines/g;", "left", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public final class c implements g, Serializable
{
    private final g G;
    private final b H;
    
    public c(@e final g g, @e final b h) {
        k0.p(g, "left");
        k0.p(h, "element");
        this.G = g;
        this.H = h;
    }
    
    private final boolean e(final b b) {
        return k0.g(this.get(b.getKey()), b);
    }
    
    private final boolean i(c c) {
        while (this.e(c.H)) {
            final g g = c.G;
            if (!(g instanceof c)) {
                Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return this.e((b)g);
            }
            c = (c)g;
        }
        return false;
    }
    
    private final int k() {
        int n = 2;
        c c = this;
        while (true) {
            g g;
            if (!((g = c.G) instanceof c)) {
                g = null;
            }
            c = (c)g;
            if (c == null) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    private final Object l() {
        final int k = this.k();
        final g[] array = new g[k];
        final j1.f f = new j1.f();
        boolean b = false;
        f.G = 0;
        this.fold(j2.a, new p<j2, b, j2>() {
            public final void a(@e final j2 j2, @e final b b) {
                k0.p(j2, "<anonymous parameter 0>");
                k0.p(b, "element");
                array[f.G++] = b;
            }
        });
        if (f.G == k) {
            b = true;
        }
        if (b) {
            return new a(array);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof c) {
                final c c = (c)o;
                if (c.k() == this.k() && c.i(this)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public <R> R fold(final R r, @e final p<? super R, ? super b, ? extends R> p2) {
        k0.p(p2, "operation");
        return (R)p2.invoke(this.G.fold(r, p2), this.H);
    }
    
    @f
    @Override
    public <E extends b> E get(@e final g.c<E> c) {
        k0.p(c, "key");
        c c2 = this;
        while (true) {
            final b value = c2.H.get(c);
            if (value != null) {
                return (E)value;
            }
            final g g = c2.G;
            if (!(g instanceof c)) {
                return g.get(c);
            }
            c2 = (c)g;
        }
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode() + this.H.hashCode();
    }
    
    @e
    @Override
    public g minusKey(@e final g.c<?> c) {
        k0.p(c, "key");
        if (this.H.get(c) != null) {
            return this.G;
        }
        final g minusKey = this.G.minusKey(c);
        Object h;
        if (minusKey == this.G) {
            h = this;
        }
        else if (minusKey == i.H) {
            h = this.H;
        }
        else {
            h = new c(minusKey, this.H);
        }
        return (g)h;
    }
    
    @e
    @Override
    public g plus(@e final g g) {
        k0.p(g, "context");
        return kotlin.coroutines.g.a.a(this, g);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.fold("", c$b.G));
        sb.append("]");
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\tB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "kotlin/coroutines/c$a", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "b", "", "Lkotlin/coroutines/g;", "G", "[Lkotlin/coroutines/g;", "a", "()[Lkotlin/coroutines/g;", "elements", "<init>", "([Lkotlin/coroutines/g;)V", "I", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements Serializable
    {
        private static final long H = 0L;
        @e
        public static final c.a.a I;
        @e
        private final g[] G;
        
        static {
            I = new c.a.a(null);
        }
        
        public a(@e final g[] g) {
            k0.p(g, "elements");
            this.G = g;
        }
        
        private final Object b() {
            final g[] g = this.G;
            g g2 = i.H;
            for (int length = g.length, i = 0; i < length; ++i) {
                g2 = g2.plus(g[i]);
            }
            return g2;
        }
        
        @e
        public final g[] a() {
            return this.G;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "kotlin/coroutines/c$a$a", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        public static final class a
        {
            private a() {
            }
        }
    }
}
