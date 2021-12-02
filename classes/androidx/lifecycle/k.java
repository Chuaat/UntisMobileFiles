// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.m0;
import kotlinx.coroutines.z1;
import androidx.annotation.d;
import android.annotation.SuppressLint;
import kotlinx.coroutines.w2;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlinx.coroutines.i1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.annotation.g0;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0017" }, d2 = { "Landroidx/lifecycle/k;", "", "", "b", "Ljava/lang/Runnable;", "runnable", "Lkotlin/j2;", "d", "f", "g", "e", "c", "h", "Z", "isDraining", "Ljava/util/Queue;", "Ljava/util/Queue;", "queue", "a", "paused", "finished", "<init>", "()V", "lifecycle-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    private boolean a;
    private boolean b;
    private boolean c;
    private final Queue<Runnable> d;
    
    public k() {
        this.a = true;
        this.d = new ArrayDeque<Runnable>();
    }
    
    @g0
    private final boolean b() {
        return this.b || !this.a;
    }
    
    @g0
    private final void d(final Runnable runnable) {
        if (this.d.offer(runnable)) {
            this.c();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
    
    @g0
    public final void c() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while ((this.d.isEmpty() ^ true) && this.b()) {
                final Runnable runnable = this.d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        finally {
            this.c = false;
        }
    }
    
    @g0
    public final void e() {
        this.b = true;
        this.c();
    }
    
    @g0
    public final void f() {
        this.a = true;
    }
    
    @g0
    public final void g() {
        if (!this.a) {
            return;
        }
        if (this.b ^ true) {
            this.a = false;
            this.c();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
    
    @SuppressLint({ "WrongThread" })
    @d
    @z1
    public final void h(@e final Runnable runnable) {
        k0.q((Object)runnable, "runnable");
        final w2 m = i1.e().M();
        final i h = i.H;
        if (((m0)m).K((g)h)) {
            ((m0)m).H((g)h, (Runnable)new Runnable() {
                @Override
                public final void run() {
                    k.this.d(runnable);
                }
            });
        }
        else {
            this.d(runnable);
        }
    }
}
