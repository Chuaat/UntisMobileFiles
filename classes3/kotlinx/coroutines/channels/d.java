// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.u1;
import kotlinx.coroutines.x0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.o0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/channels/d;", "E", "Lkotlinx/coroutines/channels/p;", "Lkotlinx/coroutines/channels/f;", "", "cause", "Lkotlin/j2;", "Y0", "exception", "", "G0", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/o;", "channel", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/o;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
class d<E> extends p<E> implements f<E>
{
    public d(@e final g g, @e final o<E> o, final boolean b) {
        super(g, o, b);
    }
    
    @Override
    protected boolean G0(@e final Throwable t) {
        o0.b(this.getContext(), t);
        return true;
    }
    
    @Override
    protected void Y0(@org.jetbrains.annotations.f final Throwable t) {
        final o<E> z1 = this.z1();
        CancellationException a = null;
        final CancellationException ex = null;
        if (t != null) {
            Throwable t2;
            if (!(t instanceof CancellationException)) {
                t2 = ex;
            }
            else {
                t2 = t;
            }
            a = (CancellationException)t2;
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(x0.a(this));
                sb.append(" was cancelled");
                a = u1.a(sb.toString(), t);
            }
        }
        z1.d(a);
    }
}
