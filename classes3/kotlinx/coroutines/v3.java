// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import kotlin.w;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.j2;
import n6.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lkotlinx/coroutines/v3;", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "b", "(I)Ljava/lang/Void;", "g", "()V", "a", "c", "(Ljava/lang/Throwable;)V", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "G", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/l1;", "H", "Lkotlinx/coroutines/l1;", "cancelHandle", "Lkotlinx/coroutines/k2;", "I", "Lkotlinx/coroutines/k2;", "job", "<init>", "(Lkotlinx/coroutines/k2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class v3 implements l<Throwable, j2>
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater J;
    private final Thread G;
    private l1 H;
    private final k2 I;
    private volatile /* synthetic */ int _state;
    
    static {
        J = AtomicIntegerFieldUpdater.newUpdater(v3.class, "_state");
    }
    
    public v3(@e final k2 i) {
        this.I = i;
        this._state = 0;
        this.G = Thread.currentThread();
    }
    
    private final Void b(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal state ");
        sb.append(i);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void a() {
        while (true) {
            final int state = this._state;
            if (state != 0) {
                if (state == 2) {
                    continue;
                }
                if (state == 3) {
                    Thread.interrupted();
                    return;
                }
                this.b(state);
                throw new w();
            }
            else {
                if (v3.J.compareAndSet(this, state, 1)) {
                    final l1 h = this.H;
                    if (h != null) {
                        h.dispose();
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public void c(@f final Throwable t) {
        int state;
        do {
            state = this._state;
            if (state != 0) {
                if (state != 1 && state != 2 && state != 3) {
                    this.b(state);
                    throw new w();
                }
                return;
            }
        } while (!v3.J.compareAndSet(this, state, 2));
        this.G.interrupt();
        this._state = 3;
    }
    
    public final void g() {
        this.H = this.I.C(true, true, (l<? super Throwable, j2>)this);
        int state;
        do {
            state = this._state;
            if (state != 0) {
                if (state != 2 && state != 3) {
                    this.b(state);
                    throw new w();
                }
            }
        } while (!v3.J.compareAndSet(this, state, 0));
    }
}
