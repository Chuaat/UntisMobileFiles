// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.widget.TextView;
import android.widget.TextView$BufferType;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.graphics.PorterDuff$Mode;
import androidx.core.content.d;
import android.text.SpannableString;
import android.text.Spannable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class TextViewWithImages extends AppCompatTextView
{
    private static final String L = "drawable";
    public static final String M = "\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E";
    
    public TextViewWithImages(final Context context) {
        super(context);
    }
    
    public TextViewWithImages(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public TextViewWithImages(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private static Spannable h(final Context context, final String s, final int n, final int n2) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        if (s.contains("{today}")) {
            final int index = s.indexOf("{today}");
            final Drawable mutate = d.i(context, 2131230953).mutate();
            mutate.setColorFilter(n2, PorterDuff$Mode.MULTIPLY);
            mutate.setBounds(0, 0, n, n);
            ((Spannable)spannableString).setSpan((Object)new ImageSpan(mutate, 0), index, index + 7, 33);
        }
        if (s.contains("{arrow_right}")) {
            final int index2 = s.indexOf("{arrow_right}");
            final Drawable mutate2 = d.i(context, 2131230866).mutate();
            mutate2.setColorFilter(n2, PorterDuff$Mode.MULTIPLY);
            mutate2.setBounds(0, 0, n, n);
            ((Spannable)spannableString).setSpan((Object)new ImageSpan(mutate2, 0), index2, index2 + 13, 33);
        }
        if (s.contains("{arrow_left}")) {
            final int index3 = s.indexOf("{arrow_left}");
            final Drawable mutate3 = d.i(context, 2131230864).mutate();
            mutate3.setColorFilter(n2, PorterDuff$Mode.MULTIPLY);
            mutate3.setBounds(0, 0, n, n);
            ((Spannable)spannableString).setSpan((Object)new ImageSpan(mutate3, 0), index3, index3 + 12, 33);
        }
        return (Spannable)spannableString;
    }
    
    public void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        super.setText((CharSequence)h(((TextView)this).getContext(), charSequence.toString(), ((TextView)this).getLineHeight(), ((TextView)this).getCurrentTextColor()), TextView$BufferType.SPANNABLE);
    }
}
