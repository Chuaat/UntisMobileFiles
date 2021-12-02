// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.Spanned;
import android.text.SpannableString;
import kotlin.ranges.k;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.text.Spannable;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0087\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086\n¨\u0006\u000e" }, d2 = { "", "Landroid/text/Spannable;", "d", "Lkotlin/j2;", "a", "", "start", "end", "", "span", "b", "Lkotlin/ranges/k;", "range", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class i
{
    @SuppressLint({ "SyntheticAccessor" })
    public static final void a(@e final Spannable spannable) {
        k0.p((Object)spannable, "<this>");
        final int length = ((Spanned)spannable).length();
        int i = 0;
        final Object[] spans = ((Spanned)spannable).getSpans(0, length, (Class)Object.class);
        k0.o((Object)spans, "getSpans(start, end, T::class.java)");
        while (i < spans.length) {
            spannable.removeSpan(spans[i]);
            ++i;
        }
    }
    
    public static final void b(@e final Spannable spannable, final int n, final int n2, @e final Object o) {
        k0.p((Object)spannable, "<this>");
        k0.p(o, "span");
        spannable.setSpan(o, n, n2, 17);
    }
    
    public static final void c(@e final Spannable spannable, @e final k k, @e final Object o) {
        k0.p((Object)spannable, "<this>");
        k0.p((Object)k, "range");
        k0.p(o, "span");
        spannable.setSpan(o, (int)k.v(), (int)k.t(), 17);
    }
    
    @e
    public static final Spannable d(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "<this>");
        final SpannableString value = SpannableString.valueOf(charSequence);
        k0.o((Object)value, "valueOf(this)");
        return (Spannable)value;
    }
}
