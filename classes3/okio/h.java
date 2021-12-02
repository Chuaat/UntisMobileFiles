// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import java.util.zip.Inflater;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0005" }, d2 = { "Lokio/r0;", "Ljava/util/zip/Inflater;", "inflater", "Lokio/b0;", "a", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "-InflaterSourceExtensions")
public final class h
{
    @e
    public static final b0 a(@e final r0 r0, @e final Inflater inflater) {
        k0.p((Object)r0, "$this$inflate");
        k0.p((Object)inflater, "inflater");
        return new b0(r0, inflater);
    }
}
