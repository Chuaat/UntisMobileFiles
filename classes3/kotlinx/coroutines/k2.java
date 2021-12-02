// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b$a;
import n6.p;
import kotlin.coroutines.d;
import kotlin.sequences.m;
import org.jetbrains.annotations.f;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.c;
import kotlin.k;
import kotlin.i;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 -2\u00020\u0001:\u0001.J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0097\u0002R\u0016\u0010!\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010&\u001a\u00020#8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010 R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00000)8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/" }, d2 = { "Lkotlinx/coroutines/k2;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "w", "", "start", "cause", "Lkotlin/j2;", "d", "cancel", "", "c", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "Y", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/l1;", "N", "onCancelling", "invokeImmediately", "C", "other", "G", "a", "()Z", "isActive", "isCancelled", "Lkotlinx/coroutines/selects/c;", "R", "()Lkotlinx/coroutines/selects/c;", "onJoin", "g", "isCompleted", "Lkotlin/sequences/m;", "q", "()Lkotlin/sequences/m;", "children", "t", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface k2 extends g$b
{
    @e
    public static final b t = b.G;
    
    @f2
    @e
    l1 C(final boolean p0, final boolean p1, @e final l<? super Throwable, j2> p2);
    
    @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @e
    k2 G(@e final k2 p0);
    
    @e
    l1 N(@e final l<? super Throwable, j2> p0);
    
    @e
    c R();
    
    @f2
    @e
    u Y(@e final w p0);
    
    boolean a();
    
    void d(@f final CancellationException p0);
    
    boolean g();
    
    boolean isCancelled();
    
    @e
    m<k2> q();
    
    @f
    Object s(@e final d<? super j2> p0);
    
    boolean start();
    
    @f2
    @e
    CancellationException w();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <R> R d(@e final k2 k2, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return (R)g$b$a.a((g$b)k2, (Object)r, (p)p3);
        }
        
        @f
        public static <E extends g$b> E e(@e final k2 k2, @e final g$c<E> g$c) {
            return (E)g$b$a.b((g$b)k2, (g$c)g$c);
        }
        
        @e
        public static g g(@e final k2 k2, @e final g$c<?> g$c) {
            return g$b$a.c((g$b)k2, (g$c)g$c);
        }
        
        @e
        public static g h(@e final k2 k2, @e final g g) {
            return g$b$a.d((g$b)k2, g);
        }
        
        @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @e
        public static k2 i(@e final k2 k2, @e final k2 k3) {
            return k3;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlinx/coroutines/k2$b", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/k2;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class b implements g$c<k2>
    {
        static final /* synthetic */ b G;
        
        static {
            G = new b();
            final CoroutineExceptionHandler.b s = CoroutineExceptionHandler.s;
        }
        
        private b() {
        }
    }
}
