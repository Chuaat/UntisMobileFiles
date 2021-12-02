// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import kotlin.Metadata;
import o6.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002¨\u0006\n" }, d2 = { "Lkotlin/collections/r0;", "T", "", "Lkotlin/collections/q0;", "", "iterator", "Lkotlin/Function0;", "iteratorFactory", "<init>", "(Ln6/a;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class r0<T> implements Iterable<q0<? extends T>>, a
{
    private final n6.a<Iterator<T>> G;
    
    public r0(@e final n6.a<? extends Iterator<? extends T>> g) {
        k0.p(g, "iteratorFactory");
        this.G = (n6.a<Iterator<T>>)g;
    }
    
    @e
    @Override
    public Iterator<q0<T>> iterator() {
        return (Iterator<q0<T>>)new s0(this.G.invoke());
    }
}
