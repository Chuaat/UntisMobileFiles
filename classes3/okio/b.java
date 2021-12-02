// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import java.util.zip.Deflater;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0005" }, d2 = { "Lokio/p0;", "Ljava/util/zip/Deflater;", "deflater", "Lokio/s;", "a", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "-DeflaterSinkExtensions")
public final class b
{
    @e
    public static final s a(@e final p0 p2, @e final Deflater deflater) {
        k0.p((Object)p2, "$this$deflate");
        k0.p((Object)deflater, "deflater");
        return new s(p2, deflater);
    }
}
