// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.text.Spanned;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.content.ClipData;
import android.widget.TextView;
import android.util.Log;
import androidx.core.view.c;
import android.view.View;
import android.text.Spannable;
import android.text.Selection;
import android.text.Editable;
import android.os.Build$VERSION;
import android.content.ClipData$Item;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import androidx.core.view.b0;

@t0({ t0.a.I })
public final class t implements b0
{
    private static final String a = "ReceiveContent";
    
    private static CharSequence b(@j0 final Context context, @j0 final ClipData$Item clipData$Item, final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            return t.a.a(context, clipData$Item, n);
        }
        return b.a(context, clipData$Item, n);
    }
    
    private static void c(@j0 final Editable editable, @j0 final CharSequence charSequence) {
        final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
        final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
        final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection((Spannable)editable, max2);
        editable.replace(max, max2, charSequence);
    }
    
    @k0
    @Override
    public c a(@j0 final View view, @j0 final c obj) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(obj);
            Log.d("ReceiveContent", sb.toString());
        }
        if (obj.g() == 2) {
            return obj;
        }
        final ClipData c = obj.c();
        final int e = obj.e();
        final TextView textView = (TextView)view;
        final Editable editable = (Editable)textView.getText();
        final Context context = textView.getContext();
        int i = 0;
        int n = 0;
        while (i < c.getItemCount()) {
            final CharSequence b = b(context, c.getItemAt(i), e);
            int n2 = n;
            if (b != null) {
                if (n == 0) {
                    c(editable, b);
                    n2 = 1;
                }
                else {
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), b);
                    n2 = n;
                }
            }
            ++i;
            n = n2;
        }
        return null;
    }
    
    @p0(16)
    private static final class a
    {
        static CharSequence a(@j0 final Context context, @j0 final ClipData$Item clipData$Item, final int n) {
            if ((n & 0x1) != 0x0) {
                CharSequence charSequence2;
                final CharSequence charSequence = charSequence2 = clipData$Item.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence2 = charSequence.toString();
                }
                return charSequence2;
            }
            return clipData$Item.coerceToStyledText(context);
        }
    }
    
    private static final class b
    {
        static CharSequence a(@j0 final Context context, @j0 final ClipData$Item clipData$Item, final int n) {
            CharSequence charSequence2;
            final CharSequence charSequence = charSequence2 = clipData$Item.coerceToText(context);
            if ((n & 0x1) != 0x0) {
                charSequence2 = charSequence;
                if (charSequence instanceof Spanned) {
                    charSequence2 = charSequence.toString();
                }
            }
            return charSequence2;
        }
    }
}
