// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import androidx.annotation.p0;
import android.text.TextUtils;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008\u00c7\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Ljava/util/Locale;", "", "a", "(Ljava/util/Locale;)I", "layoutDirection", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class f
{
    @p0(17)
    public static final int a(@e final Locale locale) {
        k0.p((Object)locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
