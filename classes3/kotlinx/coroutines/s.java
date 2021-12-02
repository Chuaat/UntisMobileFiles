// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/s;", "Lkotlinx/coroutines/d0;", "", "c", "()Z", "Lkotlin/coroutines/d;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class s extends d0
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater c;
    private volatile /* synthetic */ int _resumed;
    
    static {
        c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed");
    }
    
    public s(@e final d<?> obj, @f Throwable t, final boolean b) {
        if (t == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(obj);
            sb.append(" was cancelled normally");
            t = new CancellationException(sb.toString());
        }
        super(t, b);
        this._resumed = 0;
    }
    
    public final boolean c() {
        return s.c.compareAndSet(this, 0, 1);
    }
}
