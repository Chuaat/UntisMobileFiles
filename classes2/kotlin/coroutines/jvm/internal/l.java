// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.coroutines.i;
import kotlin.coroutines.g;
import kotlin.c1;
import org.jetbrains.annotations.f;
import kotlin.b1;
import kotlin.Metadata;
import kotlin.j2;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0002R0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014" }, d2 = { "Lkotlin/coroutines/jvm/internal/l;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "Lkotlin/b1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "b", "G", "Lkotlin/b1;", "d", "()Lkotlin/b1;", "e", "(Lkotlin/b1;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class l implements d<j2>
{
    @f
    private b1<j2> G;
    
    public l() {
    }
    
    public final void b() {
        synchronized (this) {
            b1<j2> g;
            while (true) {
                g = this.G;
                if (g != null) {
                    break;
                }
                this.wait();
            }
            c1.n(g.l());
        }
    }
    
    @f
    public final b1<j2> d() {
        return this.G;
    }
    
    public final void e(@f final b1<j2> g) {
        this.G = g;
    }
    
    @e
    @Override
    public g getContext() {
        return i.H;
    }
    
    @Override
    public void resumeWith(@e final Object o) {
        synchronized (this) {
            this.G = (b1<j2>)b1.a(o);
            this.notifyAll();
            final j2 a = j2.a;
        }
    }
}
