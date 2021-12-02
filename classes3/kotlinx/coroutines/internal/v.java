// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import java.util.List;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001d" }, d2 = { "Lkotlinx/coroutines/internal/v;", "", "E", "Lkotlin/j2;", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "f", "(Ln6/l;)Ljava/util/List;", "d", "()Z", "", "c", "()I", "size", "e", "isEmpty", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class v<E>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private volatile /* synthetic */ Object _cur;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_cur");
    }
    
    public v(final boolean b) {
        this._cur = new w(8, b);
    }
    
    public final boolean a(@e final E e) {
        while (true) {
            final w w = (w)this._cur;
            final int a = w.a(e);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                if (a != 2) {
                    continue;
                }
                return false;
            }
            else {
                v.a.compareAndSet(this, w, w.k());
            }
        }
    }
    
    public final void b() {
        while (true) {
            final w w = (w)this._cur;
            if (w.d()) {
                break;
            }
            v.a.compareAndSet(this, w, w.k());
        }
    }
    
    public final int c() {
        return ((w)this._cur).f();
    }
    
    public final boolean d() {
        return ((w)this._cur).g();
    }
    
    public final boolean e() {
        return ((w)this._cur).h();
    }
    
    @e
    public final <R> List<R> f(@e final l<? super E, ? extends R> l) {
        return ((w)this._cur).i(l);
    }
    
    @f
    public final E g() {
        Object l;
        while (true) {
            final w w = (w)this._cur;
            l = w.l();
            if (l != kotlinx.coroutines.internal.w.s) {
                break;
            }
            v.a.compareAndSet(this, w, w.k());
        }
        return (E)l;
    }
}
