// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r" }, d2 = { "Lkotlin/sequences/c;", "T", "K", "Lkotlin/sequences/m;", "", "iterator", "a", "Lkotlin/sequences/m;", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Lkotlin/sequences/m;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class c<T, K> implements m<T>
{
    private final m<T> a;
    private final l<T, K> b;
    
    public c(@e final m<? extends T> a, @e final l<? super T, ? extends K> b) {
        k0.p((Object)a, "source");
        k0.p((Object)b, "keySelector");
        this.a = (m<T>)a;
        this.b = (l<T, K>)b;
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)new b(this.a.iterator(), (n6.l<? super Object, ?>)this.b);
    }
}
