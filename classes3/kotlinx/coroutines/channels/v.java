// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.x0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\r\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b!\u0010\"J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J#\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0019\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018¨\u0006#" }, d2 = { "Lkotlinx/coroutines/channels/v;", "E", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/channels/i0;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "M0", "Lkotlin/j2;", "J0", "value", "b0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/t$d;)Lkotlinx/coroutines/internal/k0;", "A", "(Ljava/lang/Object;)V", "closed", "L0", "", "toString", "O0", "()Lkotlinx/coroutines/channels/v;", "offerResult", "", "Q0", "()Ljava/lang/Throwable;", "receiveException", "P0", "pollResult", "J", "Ljava/lang/Throwable;", "closeCause", "R0", "sendException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class v<E> extends k0 implements i0<E>
{
    @m6.d
    @f
    public final Throwable J;
    
    public v(@f final Throwable j) {
        this.J = j;
    }
    
    @Override
    public void A(final E e) {
    }
    
    @Override
    public void J0() {
    }
    
    @Override
    public void L0(@org.jetbrains.annotations.e final v<?> v) {
        if (!w0.b()) {
            return;
        }
        throw new AssertionError();
    }
    
    @f
    @Override
    public kotlinx.coroutines.internal.k0 M0(@f final d d) {
        final kotlinx.coroutines.internal.k0 d2 = q.d;
        if (d != null) {
            d.d();
        }
        return d2;
    }
    
    @org.jetbrains.annotations.e
    public v<E> O0() {
        return this;
    }
    
    @org.jetbrains.annotations.e
    public v<E> P0() {
        return this;
    }
    
    @org.jetbrains.annotations.e
    public final Throwable Q0() {
        Throwable j = this.J;
        if (j == null) {
            j = new w("Channel was closed");
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    public final Throwable R0() {
        Throwable j = this.J;
        if (j == null) {
            j = new x("Channel was closed");
        }
        return j;
    }
    
    @f
    @Override
    public kotlinx.coroutines.internal.k0 b0(final E e, @f final d d) {
        final kotlinx.coroutines.internal.k0 d2 = q.d;
        if (d != null) {
            d.d();
        }
        return d2;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Closed@");
        sb.append(x0.b(this));
        sb.append('[');
        sb.append(this.J);
        sb.append(']');
        return sb.toString();
    }
}
