// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.o;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/channels/n0;", "E", "Lkotlinx/coroutines/channels/m0;", "", "C0", "Lkotlin/j2;", "N0", "pollResult", "Lkotlinx/coroutines/o;", "cont", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/o;Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class n0<E> extends m0<E>
{
    @m6.d
    @org.jetbrains.annotations.e
    public final l<E, j2> L;
    
    public n0(final E e, @org.jetbrains.annotations.e final o<? super j2> o, @org.jetbrains.annotations.e final l<? super E, j2> l) {
        super(e, o);
        this.L = (l<E, j2>)l;
    }
    
    @Override
    public boolean C0() {
        if (!super.C0()) {
            return false;
        }
        this.N0();
        return true;
    }
    
    @Override
    public void N0() {
        c0.b(this.L, this.K0(), ((kotlin.coroutines.d)super.K).getContext());
    }
}
