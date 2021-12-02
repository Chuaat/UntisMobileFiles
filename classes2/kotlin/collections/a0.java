// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\n\u001a\"\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a0\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t" }, d2 = { "T", "", "h0", "Lkotlin/collections/q0;", "i0", "Lkotlin/Function1;", "Lkotlin/j2;", "operation", "g0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/CollectionsKt")
class a0 extends z
{
    public a0() {
    }
    
    public static final <T> void g0(@e final Iterator<? extends T> iterator, @e final l<? super T, j2> l) {
        k0.p(iterator, "$this$forEach");
        k0.p(l, "operation");
        while (iterator.hasNext()) {
            l.invoke((Object)iterator.next());
        }
    }
    
    @f
    private static final <T> Iterator<T> h0(final Iterator<? extends T> iterator) {
        k0.p(iterator, "$this$iterator");
        return (Iterator<T>)iterator;
    }
    
    @e
    public static final <T> Iterator<q0<T>> i0(@e final Iterator<? extends T> iterator) {
        k0.p(iterator, "$this$withIndex");
        return (Iterator<q0<T>>)new s0(iterator);
    }
}
