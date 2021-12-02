// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b" }, d2 = { "T", "Lkotlin/coroutines/d;", "completion", "a", "frame", "Lkotlin/j2;", "b", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    @e1(version = "1.3")
    @e
    public static final <T> d<T> a(@e final d<? super T> d) {
        k0.p(d, "completion");
        return (d<T>)d;
    }
    
    @e1(version = "1.3")
    public static final void b(@e final d<?> d) {
        k0.p(d, "frame");
    }
    
    @e1(version = "1.3")
    public static final void c(@e final d<?> d) {
        k0.p(d, "frame");
    }
}
