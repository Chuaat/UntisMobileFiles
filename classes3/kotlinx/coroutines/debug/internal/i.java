// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import org.jetbrains.annotations.f;
import java.lang.ref.ReferenceQueue;
import m6.d;
import kotlin.Metadata;
import java.lang.ref.WeakReference;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/debug/internal/i;", "T", "Ljava/lang/ref/WeakReference;", "", "a", "I", "hash", "ref", "Ljava/lang/ref/ReferenceQueue;", "queue", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class i<T> extends WeakReference<T>
{
    @d
    public final int a;
    
    public i(final T referent, @f final ReferenceQueue<T> q) {
        super(referent, q);
        int hashCode;
        if (referent != null) {
            hashCode = referent.hashCode();
        }
        else {
            hashCode = 0;
        }
        this.a = hashCode;
    }
}
