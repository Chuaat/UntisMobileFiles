// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.internal.f;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.Enumeration;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b¨\u0006\u0004" }, d2 = { "T", "Ljava/util/Enumeration;", "Lkotlin/sequences/m;", "f", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/sequences/SequencesKt")
class r extends q
{
    public r() {
    }
    
    @f
    private static final <T> m<T> f(final Enumeration<T> enumeration) {
        return p.h((Iterator<? extends T>)v.f0((Enumeration)enumeration));
    }
}
