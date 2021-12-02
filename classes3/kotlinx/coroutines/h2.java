// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/h2;", "Lkotlinx/coroutines/m;", "", "cause", "Lkotlin/j2;", "a", "", "toString", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class h2 extends m
{
    private final l<Throwable, j2> G;
    
    public h2(@e final l<? super Throwable, j2> g) {
        this.G = (l<Throwable, j2>)g;
    }
    
    @Override
    public void a(@f final Throwable t) {
        this.G.invoke((Object)t);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(x0.a(this.G));
        sb.append('@');
        sb.append(x0.b(this));
        sb.append(']');
        return sb.toString();
    }
}
