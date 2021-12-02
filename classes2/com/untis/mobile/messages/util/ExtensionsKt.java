// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import java.text.DecimalFormat;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.widget.ImageView;
import kotlin.io.n;
import java.io.File;
import kotlin.jvm.internal.k0;
import android.widget.Button;
import kotlin.collections.y0;
import kotlin.s0;
import kotlin.n1;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0012\u0010\b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\u0006*\u00020\n\"\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Landroid/widget/TextView;", "", "resId", "Lkotlin/j2;", "setTextStyle", "Landroid/widget/ImageView;", "", "fileName", "setAttachmentTypeIcon", "Landroid/widget/Button;", "", "toFileSizeUnit", "", "fileTypesIcons", "Ljava/util/Map;", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class ExtensionsKt
{
    @e
    private static final Map<String, Integer> fileTypesIcons;
    
    static {
        final s0<String, Integer> a = n1.a("avi", 2131230955);
        final s0<String, Integer> a2 = n1.a("bmp", 2131230956);
        final s0<String, Integer> a3 = n1.a("doc", 2131230957);
        final s0<String, Integer> a4 = n1.a("eps", 2131230958);
        final Integer value = 2131230959;
        fileTypesIcons = y0.W(a, a2, a3, a4, n1.a("jpg", value), n1.a("jpeg", value), n1.a("mov", 2131230960), n1.a("mp4", 2131230961), n1.a("pdf", 2131230962), n1.a("png", 2131230963), n1.a("ppt", 2131230964), n1.a("psd", 2131230965), n1.a("rar", 2131230966), n1.a("rtf", 2131230967), n1.a("txt", 2131230968), n1.a("xls", 2131230970), n1.a("zip", 2131230971));
    }
    
    public static final void setAttachmentTypeIcon(@e final Button button, @e final String pathname) {
        k0.p(button, "<this>");
        k0.p(pathname, "fileName");
        final String y = n.Y(new File(pathname));
        final Map<String, Integer> fileTypesIcons = ExtensionsKt.fileTypesIcons;
        int intValue;
        if (fileTypesIcons.containsKey(y)) {
            intValue = y0.K((Map<String, ? extends Number>)fileTypesIcons, y).intValue();
        }
        else {
            intValue = 2131230969;
        }
        button.setCompoundDrawablesWithIntrinsicBounds(intValue, 0, 0, 0);
    }
    
    public static final void setAttachmentTypeIcon(@e final ImageView imageView, @e final String pathname) {
        k0.p(imageView, "<this>");
        k0.p(pathname, "fileName");
        final String y = n.Y(new File(pathname));
        final Map<String, Integer> fileTypesIcons = ExtensionsKt.fileTypesIcons;
        int intValue;
        if (fileTypesIcons.containsKey(y)) {
            intValue = y0.K((Map<String, ? extends Number>)fileTypesIcons, y).intValue();
        }
        else {
            intValue = 2131230969;
        }
        imageView.setImageResource(intValue);
    }
    
    public static final void setTextStyle(@e final TextView textView, final int textAppearance) {
        k0.p(textView, "<this>");
        if (Build$VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(textAppearance);
        }
        else {
            textView.setTextAppearance(textView.getContext(), textAppearance);
        }
    }
    
    @e
    public static final String toFileSizeUnit(final long n) {
        if (n <= 0L) {
            return "0";
        }
        final double a = (double)n;
        final int n2 = (int)(Math.log10(a) / Math.log10(1024.0));
        return k0.C(new DecimalFormat("#,##0.#").format(a / Math.pow(1024.0, n2)), (new String[] { "b", "kb", "mb", "gb", "tb" })[n2]);
    }
}
