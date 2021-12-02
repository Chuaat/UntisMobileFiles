// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.o0;
import kotlin.j2;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0016\u0010\u000f\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016" }, d2 = { "Lkotlinx/coroutines/channels/e0;", "E", "Lkotlinx/coroutines/channels/p;", "Lkotlinx/coroutines/channels/f0;", "Lkotlin/j2;", "value", "E1", "(Lkotlin/j2;)V", "", "cause", "", "handled", "u1", "a", "()Z", "isActive", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/o;", "channel", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class e0<E> extends p<E> implements f0<E>
{
    public e0(@e final g g, @e final o<E> o) {
        super(g, o, true);
    }
    
    protected void E1(@e final j2 j2) {
        l0.a.a(this.z1(), null, 1, null);
    }
    
    @Override
    public boolean a() {
        return super.a();
    }
    
    @Override
    protected void u1(@e final Throwable t, final boolean b) {
        if (!this.z1().I(t) && !b) {
            o0.b(this.getContext(), t);
        }
    }
}
