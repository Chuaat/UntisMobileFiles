// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import org.jetbrains.annotations.e;
import kotlin.s0;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086\b¨\u0006\f" }, d2 = { "", "Lkotlin/s0;", "", "", "pairs", "Landroidx/work/f;", "b", "([Lkotlin/s0;)Landroidx/work/f;", "T", "key", "", "a", "work-runtime-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class g
{
    @e
    public static final f b(@e final s0<String, ?>... array) {
        k0.p((Object)array, "pairs");
        final f.a a = new f.a();
        for (final s0<String, ?> s0 : array) {
            a.b((String)s0.e(), s0.f());
        }
        final f a2 = a.a();
        k0.o((Object)a2, "dataBuilder.build()");
        return a2;
    }
}
