// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.g;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.e;
import kotlin.y0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078G@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001d\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001b\u0010#\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\u001a\u0010\"R\u001b\u0010$\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\u0014\u0010\"¨\u0006)" }, d2 = { "Lkotlinx/coroutines/debug/internal/c;", "", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "", "Ljava/lang/StackTraceElement;", "g", "Ljava/util/List;", "h", "()Ljava/util/List;", "lastObservedStackTrace", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "a", "()Lkotlin/coroutines/g;", "context", "", "b", "J", "f", "()J", "sequenceNumber", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "state", "c", "creationStackTrace", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/jvm/internal/e;", "()Lkotlin/coroutines/jvm/internal/e;", "lastObservedFrame", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/d;", "source", "<init>", "(Lkotlinx/coroutines/debug/internal/d;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public final class c
{
    @f
    private final e a;
    private final long b;
    @org.jetbrains.annotations.e
    private final List<StackTraceElement> c;
    @org.jetbrains.annotations.e
    private final String d;
    @f
    private final Thread e;
    @f
    private final e f;
    @org.jetbrains.annotations.e
    private final List<StackTraceElement> g;
    @org.jetbrains.annotations.e
    private final g h;
    
    public c(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.e final g h) {
        this.h = h;
        this.a = (e)d.c();
        this.b = d.f;
        this.c = d.d();
        this.d = d.f();
        this.e = d.c;
        this.f = d.e();
        this.g = d.g();
    }
    
    @org.jetbrains.annotations.e
    public final g a() {
        return this.h;
    }
    
    @f
    public final e b() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final List<StackTraceElement> c() {
        return this.c;
    }
    
    @f
    public final e d() {
        return this.f;
    }
    
    @f
    public final Thread e() {
        return this.e;
    }
    
    public final long f() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final String g() {
        return this.d;
    }
    
    @m6.g(name = "lastObservedStackTrace")
    @org.jetbrains.annotations.e
    public final List<StackTraceElement> h() {
        return this.g;
    }
}
