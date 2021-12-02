// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.sequences.p;
import kotlin.sequences.m;
import org.jetbrains.annotations.f;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.c;
import kotlin.k;
import kotlin.i;
import kotlin.j2;
import n6.l;
import kotlin.coroutines.g$c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b2\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u001c\u0010#\u001a\u00020\u00038V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020$8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\u001c\u0010)\u001a\u00020\u00038V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010\"\u001a\u0004\b)\u0010 R\u001c\u0010-\u001a\u00020\u00038V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010 R\u0016\u00101\u001a\u00020.8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063" }, d2 = { "Lkotlinx/coroutines/y2;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/k2;", "", "start", "Lkotlin/j2;", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "w", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/l1;", "N", "onCancelling", "invokeImmediately", "C", "d", "c", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "Y", "", "toString", "a", "()Z", "isActive$annotations", "()V", "isActive", "Lkotlin/sequences/m;", "q", "()Lkotlin/sequences/m;", "getChildren$annotations", "children", "isCancelled", "isCancelled$annotations", "g", "isCompleted$annotations", "isCompleted", "Lkotlinx/coroutines/selects/c;", "R", "()Lkotlinx/coroutines/selects/c;", "onJoin", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class y2 extends kotlin.coroutines.a implements k2
{
    @e
    public static final y2 G;
    
    static {
        G = new y2();
    }
    
    private y2() {
        super((g$c)k2.t);
    }
    
    @f2
    @e
    public l1 C(final boolean b, final boolean b2, @e final l<? super Throwable, j2> l) {
        return z2.G;
    }
    
    @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @e
    public k2 G(@e final k2 k2) {
        return a.i(this, k2);
    }
    
    @f2
    @e
    public l1 N(@e final l<? super Throwable, j2> l) {
        return z2.G;
    }
    
    @e
    public c R() {
        throw new UnsupportedOperationException("This job is always active");
    }
    
    @f2
    @e
    public u Y(@e final w w) {
        return z2.G;
    }
    
    public boolean a() {
        return true;
    }
    
    @f2
    public void d(@f final CancellationException ex) {
    }
    
    public boolean g() {
        return false;
    }
    
    public boolean isCancelled() {
        return false;
    }
    
    @e
    public m<k2> q() {
        return p.j();
    }
    
    @f2
    @f
    public Object s(@e final d<? super j2> d) {
        throw new UnsupportedOperationException("This job is always active");
    }
    
    @f2
    public boolean start() {
        return false;
    }
    
    @e
    public String toString() {
        return "NonCancellable";
    }
    
    @f2
    @e
    public CancellationException w() {
        throw new IllegalStateException("This job is always active");
    }
}
