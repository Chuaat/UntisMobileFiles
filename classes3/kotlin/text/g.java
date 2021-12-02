// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¨\u0006\u0004" }, d2 = { "", "charsetName", "Ljava/nio/charset/Charset;", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@m6.g(name = "CharsetsKt")
public final class g
{
    @f
    private static final Charset a(final String charsetName) {
        final Charset forName = Charset.forName(charsetName);
        k0.o((Object)forName, "Charset.forName(charsetName)");
        return forName;
    }
}
