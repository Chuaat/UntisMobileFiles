// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.k0;
import java.util.Objects;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.coroutines.g;
import kotlinx.coroutines.q3;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0018" }, d2 = { "Lkotlinx/coroutines/internal/v0;", "", "Lkotlinx/coroutines/q3;", "element", "value", "Lkotlin/j2;", "a", "Lkotlin/coroutines/g;", "context", "b", "", "c", "I", "i", "", "[Ljava/lang/Object;", "values", "d", "Lkotlin/coroutines/g;", "[Lkotlinx/coroutines/q3;", "elements", "n", "<init>", "(Lkotlin/coroutines/g;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class v0
{
    private final Object[] a;
    private final q3<Object>[] b;
    private int c;
    @d
    @e
    public final g d;
    
    public v0(@e final g d, final int n) {
        this.d = d;
        this.a = new Object[n];
        this.b = (q3<Object>[])new q3[n];
    }
    
    public final void a(@e final q3<?> obj, @f final Object o) {
        final Object[] a = this.a;
        final int c = this.c;
        a[c] = o;
        final q3<Object>[] b = this.b;
        this.c = c + 1;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        b[c] = (q3<Object>)obj;
    }
    
    public final void b(@e final g g) {
        int length = this.b.length;
        while (--length >= 0) {
            final q3<Object> q3 = this.b[length];
            k0.m((Object)q3);
            q3.Q(g, this.a[length]);
        }
    }
}
