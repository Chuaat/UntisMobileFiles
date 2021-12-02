// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.style.UnderlineSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.SubscriptSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.BackgroundColorSpan;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import androidx.annotation.l;
import org.jetbrains.annotations.e;
import android.text.SpannableStringBuilder;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001aD\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a3\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b" }, d2 = { "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lkotlin/j2;", "Lkotlin/s;", "builderAction", "Landroid/text/SpannedString;", "c", "", "", "spans", "f", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Ln6/l;)Landroid/text/SpannableStringBuilder;", "span", "e", "b", "g", "l", "", "color", "d", "a", "i", "", "proportion", "h", "k", "j", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final SpannableStringBuilder a(@e final SpannableStringBuilder spannableStringBuilder, @l int length, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(length);
        length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder b(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final StyleSpan styleSpan = new StyleSpan(1);
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannedString c(@e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)l, "builderAction");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        l.invoke((Object)spannableStringBuilder);
        return new SpannedString((CharSequence)spannableStringBuilder);
    }
    
    @e
    public static final SpannableStringBuilder d(@e final SpannableStringBuilder spannableStringBuilder, @l int length, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(length);
        length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder e(@e final SpannableStringBuilder spannableStringBuilder, @e final Object o, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p(o, "span");
        k0.p((Object)l, "builderAction");
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan(o, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder f(@e final SpannableStringBuilder spannableStringBuilder, @e final Object[] array, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)array, "spans");
        k0.p((Object)l, "builderAction");
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        final int length2 = array.length;
        int i = 0;
        while (i < length2) {
            final Object o = array[i];
            ++i;
            spannableStringBuilder.setSpan(o, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder g(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final StyleSpan styleSpan = new StyleSpan(2);
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder h(@e final SpannableStringBuilder spannableStringBuilder, final float n, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(n);
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder i(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder j(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final SubscriptSpan subscriptSpan = new SubscriptSpan();
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder k(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
    
    @e
    public static final SpannableStringBuilder l(@e final SpannableStringBuilder spannableStringBuilder, @e final n6.l<? super SpannableStringBuilder, j2> l) {
        k0.p((Object)spannableStringBuilder, "<this>");
        k0.p((Object)l, "builderAction");
        final UnderlineSpan underlineSpan = new UnderlineSpan();
        final int length = spannableStringBuilder.length();
        l.invoke((Object)spannableStringBuilder);
        spannableStringBuilder.setSpan((Object)underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
