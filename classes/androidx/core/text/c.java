// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import android.text.Html$TagHandler;
import androidx.annotation.k0;
import android.text.Html$ImageGetter;
import android.text.Html;
import android.os.Build$VERSION;
import android.text.Spanned;
import androidx.annotation.j0;
import android.annotation.SuppressLint;

@SuppressLint({ "InlinedApi" })
public final class c
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 256;
    public static final int j = 0;
    public static final int k = 63;
    
    private c() {
    }
    
    @j0
    public static Spanned a(@j0 final String s, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return Html.fromHtml(s, n);
        }
        return Html.fromHtml(s);
    }
    
    @j0
    public static Spanned b(@j0 final String s, final int n, @k0 final Html$ImageGetter html$ImageGetter, @k0 final Html$TagHandler html$TagHandler) {
        if (Build$VERSION.SDK_INT >= 24) {
            return Html.fromHtml(s, n, html$ImageGetter, html$TagHandler);
        }
        return Html.fromHtml(s, html$ImageGetter, html$TagHandler);
    }
    
    @j0
    public static String c(@j0 final Spanned spanned, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return Html.toHtml(spanned, n);
        }
        return Html.toHtml(spanned);
    }
}
