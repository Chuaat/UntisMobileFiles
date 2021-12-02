// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.test;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.t0;
import kotlin.Metadata;
import kotlinx.coroutines.internal.u0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B'\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0018¨\u0006#" }, d2 = { "Lkotlinx/coroutines/test/c;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/internal/u0;", "Lkotlin/j2;", "run", "other", "", "g", "", "toString", "I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/internal/t0;", "G", "Lkotlinx/coroutines/internal/t0;", "d", "()Lkotlinx/coroutines/internal/t0;", "b", "(Lkotlinx/coroutines/internal/t0;)V", "heap", "", "K", "J", "time", "H", "i", "()I", "f", "(I)V", "index", "count", "<init>", "(Ljava/lang/Runnable;JJ)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class c implements Comparable<c>, Runnable, u0
{
    @f
    private t0<?> G;
    private int H;
    private final Runnable I;
    private final long J;
    @d
    public final long K;
    
    public c(@e final Runnable i, final long j, final long k) {
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public void b(@f final t0<?> g) {
        this.G = g;
    }
    
    @f
    @Override
    public t0<?> d() {
        return this.G;
    }
    
    @Override
    public void f(final int h) {
        this.H = h;
    }
    
    public int g(@e final c c) {
        final long k = this.K;
        final long i = c.K;
        long j = k;
        long l = i;
        if (k == i) {
            j = this.J;
            l = c.J;
        }
        return lcmp(j, l);
    }
    
    @Override
    public int i() {
        return this.H;
    }
    
    @Override
    public void run() {
        this.I.run();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TimedRunnable(time=");
        sb.append(this.K);
        sb.append(", run=");
        sb.append(this.I);
        sb.append(')');
        return sb.toString();
    }
}
