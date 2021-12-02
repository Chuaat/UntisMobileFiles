// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00038D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00038D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00038D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/channels/j0;", "E", "Lkotlinx/coroutines/channels/a;", "", "b0", "()Z", "isBufferEmpty", "w", "isBufferAlwaysFull", "x", "isBufferFull", "a0", "isBufferAlwaysEmpty", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class j0<E> extends a<E>
{
    public j0(@org.jetbrains.annotations.f final l<? super E, j2> l) {
        super(l);
    }
    
    @Override
    protected final boolean a0() {
        return true;
    }
    
    @Override
    protected final boolean b0() {
        return true;
    }
    
    @Override
    protected final boolean w() {
        return true;
    }
    
    @Override
    protected final boolean x() {
        return true;
    }
}
