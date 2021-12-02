// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import n6.l;
import kotlin.q;
import kotlin.coroutines.b;
import kotlinx.coroutines.internal.j;
import java.util.Objects;
import kotlin.coroutines.d;
import org.jetbrains.annotations.f;
import kotlin.coroutines.e$a;
import kotlin.coroutines.g$b;
import kotlin.k;
import kotlin.i;
import kotlin.coroutines.g;
import kotlin.coroutines.g$c;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH&J\u001c\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0017J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0017J\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g;", "context", "", "K", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "J", "T", "Lkotlin/coroutines/d;", "continuation", "n", "h", "other", "L", "", "toString", "<init>", "()V", "G", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class m0 extends kotlin.coroutines.a implements e
{
    @org.jetbrains.annotations.e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    public m0() {
        super((g$c)e.q);
    }
    
    public abstract void H(@org.jetbrains.annotations.e final g p0, @org.jetbrains.annotations.e final Runnable p1);
    
    @f2
    public void J(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final Runnable runnable) {
        this.H(g, runnable);
    }
    
    public boolean K(@org.jetbrains.annotations.e final g g) {
        return true;
    }
    
    @i(level = k.H, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @org.jetbrains.annotations.e
    public final m0 L(@org.jetbrains.annotations.e final m0 m0) {
        return m0;
    }
    
    @f
    public <E extends g$b> E get(@org.jetbrains.annotations.e final g$c<E> g$c) {
        return (E)e$a.b((e)this, (g$c)g$c);
    }
    
    @f2
    public void h(@org.jetbrains.annotations.e final d<?> obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        final p o = ((j)obj).o();
        if (o != null) {
            o.s();
        }
    }
    
    @org.jetbrains.annotations.e
    public g minusKey(@org.jetbrains.annotations.e final g$c<?> g$c) {
        return e$a.c((e)this, (g$c)g$c);
    }
    
    @org.jetbrains.annotations.e
    public final <T> d<T> n(@org.jetbrains.annotations.e final d<? super T> d) {
        return (d<T>)new j(this, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @org.jetbrains.annotations.e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('@');
        sb.append(x0.b(this));
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "kotlinx/coroutines/m0$a", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/m0;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    @q
    public static final class a extends b<e, m0>
    {
        private a() {
            super((g$c)e.q, (l)m0$a$a.G);
        }
    }
}
