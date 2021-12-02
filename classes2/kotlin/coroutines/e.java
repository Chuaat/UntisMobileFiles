// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import java.util.Objects;
import kotlin.jvm.internal.k0;
import n6.p;
import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¨\u0006\u0011" }, d2 = { "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g$b;", "T", "Lkotlin/coroutines/d;", "continuation", "n", "Lkotlin/j2;", "h", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "minusKey", "q", "b", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public interface e extends g.b
{
    @org.jetbrains.annotations.e
    public static final b q = b.G;
    
    @f
     <E extends g.b> E get(@org.jetbrains.annotations.e final c<E> p0);
    
    void h(@org.jetbrains.annotations.e final d<?> p0);
    
    @org.jetbrains.annotations.e
    g minusKey(@org.jetbrains.annotations.e final c<?> p0);
    
    @org.jetbrains.annotations.e
     <T> d<T> n(@org.jetbrains.annotations.e final d<? super T> p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        public static <R> R a(@org.jetbrains.annotations.e final e e, final R r, @org.jetbrains.annotations.e final p<? super R, ? super g.b, ? extends R> p3) {
            k0.p(p3, "operation");
            return g.b.a.a((g.b)e, r, p3);
        }
        
        @f
        public static <E extends g.b> E b(@org.jetbrains.annotations.e e obj, @org.jetbrains.annotations.e final c<E> c) {
            k0.p(c, "key");
            final boolean b = c instanceof kotlin.coroutines.b;
            final g.b b2 = null;
            if (b) {
                final kotlin.coroutines.b<B, g.b> b3 = (kotlin.coroutines.b<B, g.b>)c;
                g.b b4 = b2;
                if (b3.a(((g.b)obj).getKey())) {
                    b4 = b3.b(obj);
                    if (!(b4 instanceof g.b)) {
                        b4 = b2;
                    }
                }
                return (E)b4;
            }
            if (e.q == c) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type E");
            }
            else {
                obj = null;
            }
            return (E)obj;
        }
        
        @org.jetbrains.annotations.e
        public static g c(@org.jetbrains.annotations.e e h, @org.jetbrains.annotations.e final c<?> c) {
            k0.p(c, "key");
            if (c instanceof kotlin.coroutines.b) {
                final kotlin.coroutines.b b = (kotlin.coroutines.b)c;
                Object h2 = h;
                if (b.a(((g.b)h).getKey())) {
                    h2 = h;
                    if (b.b(h) != null) {
                        h2 = i.H;
                    }
                }
                return (g)h2;
            }
            if (e.q == c) {
                h = (e)i.H;
            }
            return h;
        }
        
        @org.jetbrains.annotations.e
        public static g d(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g g) {
            k0.p(g, "context");
            return kotlin.coroutines.g.b.a.d((g.b)e, g);
        }
        
        public static void e(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final d<?> d) {
            k0.p(d, "continuation");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlin/coroutines/e$b", "Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/e;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class b implements c<e>
    {
        static final /* synthetic */ b G;
        
        static {
            G = new b();
        }
        
        private b() {
        }
    }
}
