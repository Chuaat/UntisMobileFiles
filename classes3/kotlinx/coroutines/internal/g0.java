// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import n6.l;
import kotlinx.coroutines.j0;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g;
import kotlin.coroutines.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 " }, d2 = { "Lkotlinx/coroutines/internal/g0;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "", "state", "Lkotlin/j2;", "e0", "r1", "Lkotlin/coroutines/d;", "J", "Lkotlin/coroutines/d;", "uCont", "Lkotlinx/coroutines/k2;", "z1", "()Lkotlinx/coroutines/k2;", "parent", "", "L0", "()Z", "isScopedCoroutine", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class g0<T> extends a<T> implements e
{
    @m6.d
    @org.jetbrains.annotations.e
    public final d<T> J;
    
    public g0(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final d<? super T> j) {
        super(g, true);
        this.J = (d<T>)j;
    }
    
    protected final boolean L0() {
        return true;
    }
    
    protected void e0(@f final Object o) {
        k.g(b.d((d)this.J), j0.a(o, (kotlin.coroutines.d<? super Object>)this.J), null, 2, null);
    }
    
    @f
    public final e getCallerFrame() {
        Object j;
        if (!((j = this.J) instanceof e)) {
            j = null;
        }
        return (e)j;
    }
    
    @f
    public final StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @Override
    protected void r1(@f final Object o) {
        final d<T> j = this.J;
        j.resumeWith(j0.a(o, (kotlin.coroutines.d<? super Object>)j));
    }
    
    @f
    public final k2 z1() {
        return (k2)super.I.get((g$c)k2.t);
    }
}
