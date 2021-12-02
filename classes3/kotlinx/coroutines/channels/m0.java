// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.x0;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.t;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlinx.coroutines.q;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.j2;
import kotlinx.coroutines.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001c\u0010\u0012\u001a\u00028\u00008\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lkotlinx/coroutines/channels/m0;", "E", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "M0", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "", "toString", "J", "Ljava/lang/Object;", "K0", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/o;", "K", "Lkotlinx/coroutines/o;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class m0<E> extends k0
{
    private final E J;
    @m6.d
    @org.jetbrains.annotations.e
    public final o<j2> K;
    
    public m0(final E j, @org.jetbrains.annotations.e final o<? super j2> k) {
        this.J = j;
        this.K = (o<j2>)k;
    }
    
    @Override
    public void J0() {
        this.K.f0(q.d);
    }
    
    @Override
    public E K0() {
        return this.J;
    }
    
    @Override
    public void L0(@org.jetbrains.annotations.e final v<?> v) {
        final o<j2> k = this.K;
        final Throwable r0 = v.R0();
        final b1$a h = b1.H;
        ((kotlin.coroutines.d)k).resumeWith(b1.b(c1.a(r0)));
    }
    
    @f
    @Override
    public kotlinx.coroutines.internal.k0 M0(@f final d d) {
        final o<j2> k = this.K;
        final j2 a = j2.a;
        a c;
        if (d != null) {
            c = d.c;
        }
        else {
            c = null;
        }
        final Object i = k.k(a, c);
        if (i == null) {
            return null;
        }
        if (w0.b() && i != q.d) {
            throw new AssertionError();
        }
        if (d != null) {
            d.d();
        }
        return q.d;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('@');
        sb.append(x0.b(this));
        sb.append('(');
        sb.append(this.K0());
        sb.append(')');
        return sb.toString();
    }
}
