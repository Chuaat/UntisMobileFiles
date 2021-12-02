// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lkotlin/ranges/f;", "", "T", "Lkotlin/ranges/g;", "value", "", "f", "(Ljava/lang/Comparable;)Z", "isEmpty", "a", "b", "h", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public interface f<T extends Comparable<? super T>> extends g<T>
{
    boolean f(@e final T p0);
    
    boolean h(@e final T p0, @e final T p1);
    
    boolean isEmpty();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        public static <T extends Comparable<? super T>> boolean a(@e final f<T> f, @e final T t) {
            k0.p(t, "value");
            return f.h(f.b(), t) && f.h(t, f.i());
        }
        
        public static <T extends Comparable<? super T>> boolean b(@e final f<T> f) {
            return f.h(f.b(), f.i()) ^ true;
        }
    }
}
