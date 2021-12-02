// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.inputmethod;

import androidx.annotation.p0;
import android.text.SpannableStringBuilder;
import androidx.core.util.n;
import androidx.annotation.k0;
import android.text.TextUtils;
import androidx.annotation.j0;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.b1;

public final class a
{
    public static final int a = 16777216;
    public static final int b = Integer.MIN_VALUE;
    private static final String[] c;
    private static final String d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @b1
    static final int i = 2048;
    @b1
    static final int j = 1024;
    
    static {
        c = new String[0];
    }
    
    @Deprecated
    public a() {
    }
    
    @j0
    public static String[] a(final EditorInfo editorInfo) {
        if (Build$VERSION.SDK_INT >= 25) {
            String[] array = editorInfo.contentMimeTypes;
            if (array == null) {
                array = androidx.core.view.inputmethod.a.c;
            }
            return array;
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return androidx.core.view.inputmethod.a.c;
        }
        String[] array2;
        if ((array2 = extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) == null) {
            array2 = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (array2 == null) {
            array2 = androidx.core.view.inputmethod.a.c;
        }
        return array2;
    }
    
    @k0
    public static CharSequence b(@j0 final EditorInfo editorInfo, final int n) {
        if (Build$VERSION.SDK_INT >= 30) {
            return androidx.core.view.inputmethod.a.a.a(editorInfo, n);
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return null;
        }
        int initialSelStart = editorInfo.initialSelStart;
        final int initialSelEnd = editorInfo.initialSelEnd;
        int n2;
        if (initialSelStart > initialSelEnd) {
            n2 = initialSelEnd;
        }
        else {
            n2 = initialSelStart;
        }
        if (initialSelStart <= initialSelEnd) {
            initialSelStart = initialSelEnd;
        }
        final int int1 = extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        final int int2 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || int2 - int1 != initialSelStart - n2) {
            return null;
        }
        final CharSequence charSequence = editorInfo.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if (charSequence == null) {
            return null;
        }
        CharSequence charSequence2;
        if ((n & 0x1) != 0x0) {
            charSequence2 = charSequence.subSequence(int1, int2);
        }
        else {
            charSequence2 = TextUtils.substring(charSequence, int1, int2);
        }
        return charSequence2;
    }
    
    @k0
    public static CharSequence c(@j0 final EditorInfo editorInfo, int a, final int n) {
        if (Build$VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, a, n);
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return null;
        }
        final CharSequence charSequence = extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if (charSequence == null) {
            return null;
        }
        final int int1 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        a = Math.min(a, charSequence.length() - int1) + int1;
        CharSequence charSequence2;
        if ((n & 0x1) != 0x0) {
            charSequence2 = charSequence.subSequence(int1, a);
        }
        else {
            charSequence2 = TextUtils.substring(charSequence, int1, a);
        }
        return charSequence2;
    }
    
    @k0
    public static CharSequence d(@j0 final EditorInfo editorInfo, int a, final int n) {
        if (Build$VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, a, n);
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return null;
        }
        final CharSequence charSequence = extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if (charSequence == null) {
            return null;
        }
        final int int1 = editorInfo.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        a = int1 - Math.min(a, int1);
        CharSequence charSequence2;
        if ((n & 0x1) != 0x0) {
            charSequence2 = charSequence.subSequence(a, int1);
        }
        else {
            charSequence2 = TextUtils.substring(charSequence, a, int1);
        }
        return charSequence2;
    }
    
    static int e(final EditorInfo editorInfo) {
        if (Build$VERSION.SDK_INT >= 25) {
            return 1;
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return 0;
        }
        final boolean containsKey = extras.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        final boolean containsKey2 = editorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (containsKey2) {
            return 2;
        }
        return 0;
    }
    
    private static boolean f(final CharSequence charSequence, final int n, final int n2) {
        if (n2 != 0) {
            return n2 == 1 && Character.isHighSurrogate(charSequence.charAt(n));
        }
        return Character.isLowSurrogate(charSequence.charAt(n));
    }
    
    private static boolean g(int n) {
        n &= 0xFFF;
        return n == 129 || n == 225 || n == 18;
    }
    
    public static void h(@j0 final EditorInfo editorInfo, @k0 final String[] contentMimeTypes) {
        if (Build$VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = contentMimeTypes;
        }
        else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", contentMimeTypes);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", contentMimeTypes);
        }
    }
    
    public static void i(@j0 final EditorInfo editorInfo, @j0 final CharSequence charSequence, final int n) {
        n.g(charSequence);
        if (Build$VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.a.a.d(editorInfo, charSequence, n);
            return;
        }
        final int initialSelStart = editorInfo.initialSelStart;
        final int initialSelEnd = editorInfo.initialSelEnd;
        int n2;
        if (initialSelStart > initialSelEnd) {
            n2 = initialSelEnd - n;
        }
        else {
            n2 = initialSelStart - n;
        }
        int n3;
        if (initialSelStart > initialSelEnd) {
            n3 = initialSelStart - n;
        }
        else {
            n3 = initialSelEnd - n;
        }
        final int length = charSequence.length();
        if (n < 0 || n2 < 0 || n3 > length) {
            k(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            k(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            k(editorInfo, charSequence, n2, n3);
            return;
        }
        l(editorInfo, charSequence, n2, n3);
    }
    
    public static void j(@j0 final EditorInfo editorInfo, @j0 final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 30) {
            androidx.core.view.inputmethod.a.a.d(editorInfo, charSequence, 0);
        }
        else {
            i(editorInfo, charSequence, 0);
        }
    }
    
    private static void k(final EditorInfo editorInfo, final CharSequence charSequence, final int n, final int n2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        Object o;
        if (charSequence != null) {
            o = new SpannableStringBuilder(charSequence);
        }
        else {
            o = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)o);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n2);
    }
    
    private static void l(final EditorInfo editorInfo, CharSequence charSequence, int n, final int n2) {
        final int n3 = n2 - n;
        int n4;
        if (n3 > 1024) {
            n4 = 0;
        }
        else {
            n4 = n3;
        }
        final int length = charSequence.length();
        final int n5 = 2048 - n4;
        final int min = Math.min(length - n2, n5 - Math.min(n, (int)(n5 * 0.8)));
        final int min2 = Math.min(n, n5 - min);
        final int n6 = n - min2;
        int n7 = min2;
        n = n6;
        if (f(charSequence, n6, 0)) {
            n = n6 + 1;
            n7 = min2 - 1;
        }
        int n8 = min;
        if (f(charSequence, n2 + min - 1, 1)) {
            n8 = min - 1;
        }
        if (n4 != n3) {
            charSequence = TextUtils.concat(new CharSequence[] { charSequence.subSequence(n, n + n7), charSequence.subSequence(n2, n8 + n2) });
        }
        else {
            charSequence = charSequence.subSequence(n, n7 + n4 + n8 + n);
        }
        n = n7 + 0;
        k(editorInfo, charSequence, n, n4 + n);
    }
    
    @p0(30)
    private static class a
    {
        static CharSequence a(@j0 final EditorInfo editorInfo, final int n) {
            return editorInfo.getInitialSelectedText(n);
        }
        
        static CharSequence b(@j0 final EditorInfo editorInfo, final int n, final int n2) {
            return editorInfo.getInitialTextAfterCursor(n, n2);
        }
        
        static CharSequence c(@j0 final EditorInfo editorInfo, final int n, final int n2) {
            return editorInfo.getInitialTextBeforeCursor(n, n2);
        }
        
        static void d(@j0 final EditorInfo editorInfo, final CharSequence charSequence, final int n) {
            editorInfo.setInitialSurroundingSubText(charSequence, n);
        }
    }
}
