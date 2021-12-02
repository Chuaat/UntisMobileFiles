// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\u00028\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00028\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlin/ranges/g;", "", "T", "", "value", "", "f", "(Ljava/lang/Comparable;)Z", "isEmpty", "b", "()Ljava/lang/Comparable;", "start", "i", "endInclusive", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public interface g<T extends Comparable<? super T>>
{
    @e
    T b();
    
    boolean f(@e final T p0);
    
    @e
    T i();
    
    boolean isEmpty();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        public static <T extends Comparable<? super T>> boolean a(@e final g<T> g, @e final T t) {
            k0.p(t, "value");
            return t.compareTo((Object)g.b()) >= 0 && t.compareTo((Object)g.i()) <= 0;
        }
        
        public static <T extends Comparable<? super T>> boolean b(@e final g<T> g) {
            return g.b().compareTo((Object)g.i()) > 0;
        }
    }
}
