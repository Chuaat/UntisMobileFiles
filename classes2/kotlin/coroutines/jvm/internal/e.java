// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007" }, d2 = { "Lkotlin/coroutines/jvm/internal/e;", "", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public interface e
{
    @f
    e getCallerFrame();
    
    @f
    StackTraceElement getStackTraceElement();
}
