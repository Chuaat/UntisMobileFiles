// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/d0;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class d0
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater b;
    private volatile /* synthetic */ int _handled;
    @d
    @e
    public final Throwable a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_handled");
    }
    
    public d0(@e final Throwable a, final boolean handled) {
        this.a = a;
        this._handled = (handled ? 1 : 0);
    }
    
    public final boolean a() {
        return this._handled != 0;
    }
    
    public final boolean b() {
        return d0.b.compareAndSet(this, 0, 1);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('[');
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
