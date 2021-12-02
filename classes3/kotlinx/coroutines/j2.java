// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/j2;", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class j2 extends r2
{
    private final l<Throwable, kotlin.j2> K;
    
    public j2(@org.jetbrains.annotations.e final l<? super Throwable, kotlin.j2> k) {
        this.K = (l<Throwable, kotlin.j2>)k;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        this.K.invoke((Object)t);
    }
}
