// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b" }, d2 = { "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "", "completion", "<init>", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class j extends a
{
    public j(@f final d<Object> d) {
        super(d);
        if (d != null && d.getContext() != i.H) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g getContext() {
        return i.H;
    }
}
