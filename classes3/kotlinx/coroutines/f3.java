// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.j2;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/f3;", "T", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/p;", "K", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class f3<T> extends r2
{
    private final p<T> K;
    
    public f3(@org.jetbrains.annotations.e final p<? super T> k) {
        this.K = (p<T>)k;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        final Object f0 = this.K0().F0();
        if (w0.b() && !(f0 instanceof d2 ^ true)) {
            throw new AssertionError();
        }
        p<T> p;
        Object o;
        if (f0 instanceof d0) {
            p = this.K;
            final Throwable a = ((d0)f0).a;
            final b1$a h = b1.H;
            o = c1.a(a);
        }
        else {
            p = this.K;
            o = t2.o(f0);
            final b1$a h2 = b1.H;
        }
        ((kotlin.coroutines.d)p).resumeWith(b1.b(o));
    }
}
