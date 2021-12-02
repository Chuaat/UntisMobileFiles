// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.y0;
import kotlin.Metadata;
import kotlin.coroutines.g$c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c2\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003R\u001a\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/internal/r0;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/internal/q0;", "Ljava/lang/ThreadLocal;", "a", "threadLocal", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "G", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public final class r0 implements g$c<q0<?>>
{
    private final ThreadLocal<?> G;
    
    public r0(@e final ThreadLocal<?> g) {
        this.G = g;
    }
    
    private final ThreadLocal<?> a() {
        return this.G;
    }
    
    @e
    public final r0 b(@e final ThreadLocal<?> threadLocal) {
        return new r0(threadLocal);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof r0 && k0.g((Object)this.G, (Object)((r0)o).G));
    }
    
    @Override
    public int hashCode() {
        final ThreadLocal<?> g = this.G;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocalKey(threadLocal=");
        sb.append(this.G);
        sb.append(")");
        return sb.toString();
    }
}
