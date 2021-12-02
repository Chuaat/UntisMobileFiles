// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u001a\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0016\u0010&\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006'" }, d2 = { "Lkotlinx/coroutines/o;", "T", "Lkotlin/coroutines/d;", "value", "", "idempotent", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "onCancellation", "S", "(Ljava/lang/Object;Ljava/lang/Object;Ln6/l;)Ljava/lang/Object;", "exception", "D", "token", "f0", "H", "", "c", "Lkotlinx/coroutines/CompletionHandler;", "handler", "t", "Lkotlinx/coroutines/m0;", "F", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "E", "Z", "(Ljava/lang/Object;Ln6/l;)V", "isCancelled", "()Z", "a", "isActive", "g", "isCompleted", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface o<T> extends d<T>
{
    @f2
    @f
    Object D(@e final Throwable p0);
    
    @z1
    void E(@e final m0 p0, @e final Throwable p1);
    
    @z1
    void F(@e final m0 p0, final T p1);
    
    @f2
    void H();
    
    @f2
    @f
    Object S(final T p0, @f final Object p1, @f final l<? super Throwable, j2> p2);
    
    @z1
    void Z(final T p0, @f final l<? super Throwable, j2> p1);
    
    boolean a();
    
    boolean c(@f final Throwable p0);
    
    @f2
    void f0(@e final Object p0);
    
    boolean g();
    
    boolean isCancelled();
    
    @f2
    @f
    Object k(final T p0, @f final Object p1);
    
    void t(@e final l<? super Throwable, j2> p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
