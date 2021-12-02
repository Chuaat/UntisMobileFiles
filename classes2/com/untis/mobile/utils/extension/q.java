// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import android.widget.TextView;
import kotlin.text.s;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$LayoutParams;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\f\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003\u001a\n\u0010\r\u001a\u00020\u0005*\u00020\u0000¨\u0006\u000e" }, d2 = { "Landroidx/appcompat/widget/AppCompatTextView;", "", "duplicate", "", "defaultNonVisibility", "Lkotlin/j2;", "d", "Landroid/view/View;", "", "valueX", "a", "height", "b", "c", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class q
{
    public static final void a(@e final View view, final float n) {
        k0.p(view, "<this>");
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "translationX", new float[] { n });
        ofFloat.setDuration(400L);
        ofFloat.start();
    }
    
    public static final void b(@e final View view, final int height) {
        k0.p(view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }
    
    public static final void c(@e final AppCompatTextView appCompatTextView) {
        k0.p(appCompatTextView, "<this>");
        ((TextView)appCompatTextView).setPaintFlags(((TextView)appCompatTextView).getPaintFlags() | 0x10);
    }
    
    public static final void d(@e final AppCompatTextView appCompatTextView, @e final String s, final int n) {
        k0.p(appCompatTextView, "<this>");
        k0.p(s, "duplicate");
        final CharSequence text = appCompatTextView.getText();
        String string;
        if (text == null) {
            string = null;
        }
        else {
            string = text.toString();
        }
        final boolean b = string == null || s.U1((CharSequence)string);
        int visibility = n;
        if (!b) {
            if (s.K1(s, string, true)) {
                visibility = n;
            }
            else {
                visibility = 0;
            }
        }
        ((TextView)appCompatTextView).setVisibility(visibility);
    }
}
