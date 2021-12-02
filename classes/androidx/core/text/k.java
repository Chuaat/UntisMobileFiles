// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086\b¨\u0006\u0002" }, d2 = { "", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    @e
    public static final String a(@e String htmlEncode) {
        k0.p((Object)htmlEncode, "<this>");
        htmlEncode = TextUtils.htmlEncode(htmlEncode);
        k0.o((Object)htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
