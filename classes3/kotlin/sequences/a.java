// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R0\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0006*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lkotlin/sequences/a;", "T", "Lkotlin/sequences/m;", "", "iterator", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "sequence", "<init>", "(Lkotlin/sequences/m;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class a<T> implements m<T>
{
    private final AtomicReference<m<T>> a;
    
    public a(@e final m<? extends T> initialValue) {
        k0.p((Object)initialValue, "sequence");
        this.a = new AtomicReference<m<T>>((m<T>)initialValue);
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        final m<T> m = this.a.getAndSet(null);
        if (m != null) {
            return m.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
