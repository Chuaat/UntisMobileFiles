// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import java.util.Iterator;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013" }, d2 = { "Lkotlin/sequences/b;", "T", "K", "Lkotlin/collections/c;", "Lkotlin/j2;", "a", "", "J", "Ljava/util/Iterator;", "source", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "I", "Ljava/util/HashSet;", "observed", "Lkotlin/Function1;", "keySelector", "<init>", "(Ljava/util/Iterator;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class b<T, K> extends c<T>
{
    private final HashSet<K> I;
    private final Iterator<T> J;
    private final l<T, K> K;
    
    public b(@e final Iterator<? extends T> j, @e final l<? super T, ? extends K> k) {
        k0.p((Object)j, "source");
        k0.p((Object)k, "keySelector");
        this.J = (Iterator<T>)j;
        this.K = (l<T, K>)k;
        this.I = new HashSet<K>();
    }
    
    protected void a() {
        while (this.J.hasNext()) {
            final T next = this.J.next();
            if (this.I.add((K)this.K.invoke((Object)next))) {
                this.c((Object)next);
                return;
            }
        }
        this.b();
    }
}
