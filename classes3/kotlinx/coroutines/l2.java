// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lkotlinx/coroutines/l2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/k0;", "", "fillInStackTrace", "b", "", "toString", "", "other", "", "equals", "", "hashCode", "Lkotlinx/coroutines/k2;", "G", "Lkotlinx/coroutines/k2;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/k2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class l2 extends CancellationException implements k0<l2>
{
    @d
    @e
    public final k2 G;
    
    public l2(@e final String message, @f final Throwable cause, @e final k2 g) {
        super(message);
        this.G = g;
        if (cause != null) {
            this.initCause(cause);
        }
    }
    
    @f
    public l2 b() {
        if (w0.d()) {
            final String message = this.getMessage();
            kotlin.jvm.internal.k0.m((Object)message);
            return new l2(message, this, this.G);
        }
        return null;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o != this) {
            if (o instanceof l2) {
                final l2 l2 = (l2)o;
                if (kotlin.jvm.internal.k0.g((Object)l2.getMessage(), (Object)this.getMessage()) && kotlin.jvm.internal.k0.g((Object)l2.G, (Object)this.G) && kotlin.jvm.internal.k0.g((Object)l2.getCause(), (Object)this.getCause())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    @Override
    public Throwable fillInStackTrace() {
        if (w0.d()) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public int hashCode() {
        final String message = this.getMessage();
        kotlin.jvm.internal.k0.m((Object)message);
        final int hashCode = message.hashCode();
        final int hashCode2 = this.G.hashCode();
        final Throwable cause = this.getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.G);
        return sb.toString();
    }
}
