// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.j2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/m3;", "Lkotlinx/coroutines/a;", "Lkotlin/j2;", "", "exception", "", "G0", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
class m3 extends a<j2>
{
    public m3(@e final g g, final boolean b) {
        super(g, b);
    }
    
    @Override
    protected boolean G0(@e final Throwable t) {
        o0.b(this.getContext(), t);
        return true;
    }
}
