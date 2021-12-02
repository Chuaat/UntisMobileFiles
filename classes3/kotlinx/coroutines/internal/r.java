// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.k0;
import java.util.Objects;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/internal/r;", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lkotlin/j2;", "block", "J0", "", "C0", "B0", "L0", "()V", "z0", "()Z", "isRemoved", "K0", "isEmpty", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class r extends t
{
    @f
    @Override
    protected t B0() {
        return null;
    }
    
    @Override
    public final boolean C0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
    
    public final boolean K0() {
        return this.u0() == this;
    }
    
    public final void L0() {
        final Object u0 = this.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        t t = (t)u0;
        t t2 = this;
        while (k0.g((Object)t, (Object)this) ^ true) {
            final t v0 = t.v0();
            t.I0(t2, v0);
            t2 = t;
            t = v0;
        }
        final Object u2 = this.u0();
        Objects.requireNonNull(u2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        this.I0(t2, (t)u2);
    }
    
    @Override
    public boolean z0() {
        return false;
    }
}
