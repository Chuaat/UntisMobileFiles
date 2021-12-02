// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR*\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\b\u001a\u00020\u00028@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/s3;", "", "Lkotlinx/coroutines/p1;", "a", "()Lkotlinx/coroutines/p1;", "Lkotlin/j2;", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/p1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "Ljava/lang/ThreadLocal;", "ref", "b", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class s3
{
    private static final ThreadLocal<p1> a;
    @e
    public static final s3 b;
    
    static {
        b = new s3();
        a = new ThreadLocal<p1>();
    }
    
    private s3() {
    }
    
    @f
    public final p1 a() {
        return s3.a.get();
    }
    
    @e
    public final p1 b() {
        final ThreadLocal<p1> a = s3.a;
        p1 a2 = a.get();
        if (a2 == null) {
            a2 = s1.a();
            a.set(a2);
        }
        return a2;
    }
    
    public final void c() {
        s3.a.set(null);
    }
    
    public final void d(@e final p1 value) {
        s3.a.set(value);
    }
}
