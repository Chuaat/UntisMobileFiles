// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.SpannedString;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import android.text.Spanned;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "", "Landroid/text/Spanned;", "c", "", "T", "", "start", "end", "", "a", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class j
{
    @e
    public static final Spanned c(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "<this>");
        final SpannedString value = SpannedString.valueOf(charSequence);
        k0.o((Object)value, "valueOf(this)");
        return (Spanned)value;
    }
}
