// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import org.jetbrains.annotations.f;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016R\u001e\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "Lkotlinx/coroutines/flow/internal/b0;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "G", "Lkotlin/coroutines/d;", "uCont", "Lkotlin/coroutines/g;", "H", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class b0<T> implements d<T>, e
{
    private final d<T> G;
    @org.jetbrains.annotations.e
    private final g H;
    
    public b0(@org.jetbrains.annotations.e final d<? super T> g, @org.jetbrains.annotations.e final g h) {
        this.G = (d<T>)g;
        this.H = h;
    }
    
    @f
    public e getCallerFrame() {
        Object g;
        if (!((g = this.G) instanceof e)) {
            g = null;
        }
        return (e)g;
    }
    
    @org.jetbrains.annotations.e
    public g getContext() {
        return this.H;
    }
    
    @f
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    public void resumeWith(@org.jetbrains.annotations.e final Object o) {
        this.G.resumeWith(o);
    }
}
