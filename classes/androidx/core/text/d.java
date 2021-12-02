// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import kotlin.jvm.internal.k0;
import android.text.Spanned;
import android.text.Html$TagHandler;
import org.jetbrains.annotations.f;
import android.text.Html$ImageGetter;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b¨\u0006\u000b" }, d2 = { "", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "a", "option", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @e
    public static final Spanned a(@e final String s, final int n, @f final Html$ImageGetter html$ImageGetter, @f final Html$TagHandler html$TagHandler) {
        k0.p((Object)s, "<this>");
        final Spanned b = c.b(s, n, html$ImageGetter, html$TagHandler);
        k0.o((Object)b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }
    
    @e
    public static final String c(@e final Spanned spanned, final int n) {
        k0.p((Object)spanned, "<this>");
        final String c = androidx.core.text.c.c(spanned, n);
        k0.o((Object)c, "toHtml(this, option)");
        return c;
    }
}
