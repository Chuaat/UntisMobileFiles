// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import n6.p;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013" }, d2 = { "Lkotlin/coroutines/g;", "", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "context", "plus", "minusKey", "b", "c", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public interface g
{
     <R> R fold(final R p0, @e final p<? super R, ? super b, ? extends R> p1);
    
    @f
     <E extends b> E get(@e final c<E> p0);
    
    @e
    g minusKey(@e final c<?> p0);
    
    @e
    g plus(@e final g p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        @e
        public static g a(@e g g, @e final g g2) {
            k0.p(g2, "context");
            if (g2 != i.H) {
                g = g2.fold(g, (p<? super g, ? super b, ? extends g>)g$a$a.G);
            }
            return g;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016R\u001a\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011" }, d2 = { "kotlin/coroutines/g$b", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "minusKey", "getKey", "()Lkotlin/coroutines/g$c;", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public interface b extends g
    {
         <R> R fold(final R p0, @e final p<? super R, ? super b, ? extends R> p1);
        
        @f
         <E extends b> E get(@e final c<E> p0);
        
        @e
        c<?> getKey();
        
        @e
        g minusKey(@e final c<?> p0);
        
        @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
        public static final class a
        {
            public static <R> R a(@e final b b, final R r, @e final p<? super R, ? super b, ? extends R> p3) {
                k0.p(p3, "operation");
                return (R)p3.invoke(r, b);
            }
            
            @f
            public static <E extends b> E b(@e b b, @e final c<E> c) {
                k0.p(c, "key");
                if (!k0.g(b.getKey(), c)) {
                    b = null;
                }
                return (E)b;
            }
            
            @e
            public static g c(@e final b b, @e final c<?> c) {
                k0.p(c, "key");
                Object h = b;
                if (k0.g(b.getKey(), c)) {
                    h = i.H;
                }
                return (g)h;
            }
            
            @e
            public static g d(@e final b b, @e final g g) {
                k0.p(g, "context");
                return kotlin.coroutines.g.a.a(b, g);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004" }, d2 = { "kotlin/coroutines/g$c", "Lkotlin/coroutines/g$b;", "E", "", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public interface c<E extends b>
    {
    }
}
