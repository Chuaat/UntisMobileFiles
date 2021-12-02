// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import org.jetbrains.annotations.f;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/debug/internal/k;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "H", "Ljava/lang/StackTraceElement;", "stackTraceElement", "G", "Lkotlin/coroutines/jvm/internal/e;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class k implements e
{
    @f
    private final e G;
    private final StackTraceElement H;
    
    public k(@f final e g, @org.jetbrains.annotations.e final StackTraceElement h) {
        this.G = g;
        this.H = h;
    }
    
    @f
    public e getCallerFrame() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    public StackTraceElement getStackTraceElement() {
        return this.H;
    }
}
