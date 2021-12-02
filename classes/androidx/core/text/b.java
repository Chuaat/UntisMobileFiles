// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b¨\u0006\u0005" }, d2 = { "", "", "a", "", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    public static final boolean a(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }
    
    public static final int b(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
