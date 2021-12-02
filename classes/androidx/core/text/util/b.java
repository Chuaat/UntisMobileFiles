// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text.util;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Collections;
import android.webkit.WebView;
import android.os.Build$VERSION;
import java.util.regex.Matcher;
import java.util.Locale;
import java.util.Iterator;
import androidx.core.util.l;
import java.util.ArrayList;
import android.text.style.URLSpan;
import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.util.Linkify$TransformFilter;
import android.text.util.Linkify$MatchFilter;
import android.text.util.Linkify;
import androidx.annotation.k0;
import java.util.regex.Pattern;
import android.text.method.LinkMovementMethod;
import androidx.annotation.j0;
import android.widget.TextView;
import java.util.Comparator;

public final class b
{
    private static final String[] a;
    private static final Comparator<b> b;
    
    static {
        a = new String[0];
        b = new Comparator<b>() {
            public int a(final b b, final b b2) {
                final int c = b.c;
                final int c2 = b2.c;
                if (c < c2) {
                    return -1;
                }
                if (c > c2) {
                    return 1;
                }
                final int d = b.d;
                final int d2 = b2.d;
                if (d < d2) {
                    return 1;
                }
                if (d > d2) {
                    return -1;
                }
                return 0;
            }
        };
    }
    
    private b() {
    }
    
    private static void a(@j0 final TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
    
    public static void b(@j0 final TextView textView, @j0 final Pattern pattern, @k0 final String s) {
        if (p()) {
            Linkify.addLinks(textView, pattern, s);
            return;
        }
        d(textView, pattern, s, null, null, null);
    }
    
    public static void c(@j0 final TextView textView, @j0 final Pattern pattern, @k0 final String s, @k0 final Linkify$MatchFilter linkify$MatchFilter, @k0 final Linkify$TransformFilter linkify$TransformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, s, linkify$MatchFilter, linkify$TransformFilter);
            return;
        }
        d(textView, pattern, s, null, linkify$MatchFilter, linkify$TransformFilter);
    }
    
    @SuppressLint({ "NewApi" })
    public static void d(@j0 final TextView textView, @j0 final Pattern pattern, @k0 final String s, @k0 final String[] array, @k0 final Linkify$MatchFilter linkify$MatchFilter, @k0 final Linkify$TransformFilter linkify$TransformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, s, array, linkify$MatchFilter, linkify$TransformFilter);
            return;
        }
        final SpannableString value = SpannableString.valueOf(textView.getText());
        if (h((Spannable)value, pattern, s, array, linkify$MatchFilter, linkify$TransformFilter)) {
            textView.setText((CharSequence)value);
            a(textView);
        }
    }
    
    public static boolean e(@j0 final Spannable spannable, final int n) {
        if (p()) {
            return Linkify.addLinks(spannable, n);
        }
        if (n == 0) {
            return false;
        }
        final URLSpan[] array = (URLSpan[])spannable.getSpans(0, spannable.length(), (Class)URLSpan.class);
        for (int i = array.length - 1; i >= 0; --i) {
            spannable.removeSpan((Object)array[i]);
        }
        if ((n & 0x4) != 0x0) {
            Linkify.addLinks(spannable, 4);
        }
        final ArrayList<b> list = new ArrayList<b>();
        if ((n & 0x1) != 0x0) {
            l(list, spannable, l.w, new String[] { "http://", "https://", "rtsp://" }, Linkify.sUrlMatchFilter, null);
        }
        if ((n & 0x2) != 0x0) {
            l(list, spannable, l.A, new String[] { "mailto:" }, null, null);
        }
        if ((n & 0x8) != 0x0) {
            m(list, spannable);
        }
        o(list, spannable);
        if (list.size() == 0) {
            return false;
        }
        for (final b b : list) {
            if (b.a == null) {
                j(b.b, b.c, b.d, spannable);
            }
        }
        return true;
    }
    
    public static boolean f(@j0 final Spannable spannable, @j0 final Pattern pattern, @k0 final String s) {
        if (p()) {
            return Linkify.addLinks(spannable, pattern, s);
        }
        return h(spannable, pattern, s, null, null, null);
    }
    
    public static boolean g(@j0 final Spannable spannable, @j0 final Pattern pattern, @k0 final String s, @k0 final Linkify$MatchFilter linkify$MatchFilter, @k0 final Linkify$TransformFilter linkify$TransformFilter) {
        if (p()) {
            return Linkify.addLinks(spannable, pattern, s, linkify$MatchFilter, linkify$TransformFilter);
        }
        return h(spannable, pattern, s, null, linkify$MatchFilter, linkify$TransformFilter);
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean h(@j0 final Spannable input, @j0 final Pattern pattern, @k0 final String s, @k0 final String[] array, @k0 final Linkify$MatchFilter linkify$MatchFilter, @k0 final Linkify$TransformFilter linkify$TransformFilter) {
        if (p()) {
            return Linkify.addLinks(input, pattern, s, array, linkify$MatchFilter, linkify$TransformFilter);
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "";
        }
        String[] a = null;
        Label_0045: {
            if (array != null) {
                a = array;
                if (array.length >= 1) {
                    break Label_0045;
                }
            }
            a = androidx.core.text.util.b.a;
        }
        final String[] array2 = new String[a.length + 1];
        array2[0] = s2.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < a.length) {
            final String s3 = a[i];
            ++i;
            String lowerCase;
            if (s3 == null) {
                lowerCase = "";
            }
            else {
                lowerCase = s3.toLowerCase(Locale.ROOT);
            }
            array2[i] = lowerCase;
        }
        final Matcher matcher = pattern.matcher((CharSequence)input);
        boolean b = false;
        while (matcher.find()) {
            final int start = matcher.start();
            final int end = matcher.end();
            if (linkify$MatchFilter == null || linkify$MatchFilter.acceptMatch((CharSequence)input, start, end)) {
                j(n(matcher.group(0), array2, matcher, linkify$TransformFilter), start, end, input);
                b = true;
            }
        }
        return b;
    }
    
    public static boolean i(@j0 final TextView textView, final int n) {
        if (p()) {
            return Linkify.addLinks(textView, n);
        }
        if (n == 0) {
            return false;
        }
        final CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (e((Spannable)text, n)) {
                a(textView);
                return true;
            }
            return false;
        }
        else {
            final SpannableString value = SpannableString.valueOf(text);
            if (e((Spannable)value, n)) {
                a(textView);
                textView.setText((CharSequence)value);
                return true;
            }
            return false;
        }
    }
    
    private static void j(final String s, final int n, final int n2, final Spannable spannable) {
        spannable.setSpan((Object)new URLSpan(s), n, n2, 33);
    }
    
    private static String k(final String s) {
        if (Build$VERSION.SDK_INT >= 28) {
            return WebView.findAddress(s);
        }
        return androidx.core.text.util.a.c(s);
    }
    
    private static void l(final ArrayList<b> list, final Spannable input, final Pattern pattern, final String[] array, final Linkify$MatchFilter linkify$MatchFilter, final Linkify$TransformFilter linkify$TransformFilter) {
        final Matcher matcher = pattern.matcher((CharSequence)input);
        while (matcher.find()) {
            final int start = matcher.start();
            final int end = matcher.end();
            if (linkify$MatchFilter == null || linkify$MatchFilter.acceptMatch((CharSequence)input, start, end)) {
                final b e = new b();
                e.b = n(matcher.group(0), array, matcher, linkify$TransformFilter);
                e.c = start;
                e.d = end;
                list.add(e);
            }
        }
    }
    
    private static void m(final ArrayList<b> p0, final Spannable p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //     4: astore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aload_1        
        //     8: invokestatic    androidx/core/text/util/b.k:(Ljava/lang/String;)Ljava/lang/String;
        //    11: astore_3       
        //    12: aload_3        
        //    13: ifnull          131
        //    16: aload_1        
        //    17: aload_3        
        //    18: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    21: istore          4
        //    23: iload           4
        //    25: ifge            31
        //    28: goto            131
        //    31: new             Landroidx/core/text/util/b$b;
        //    34: astore          5
        //    36: aload           5
        //    38: invokespecial   androidx/core/text/util/b$b.<init>:()V
        //    41: aload_3        
        //    42: invokevirtual   java/lang/String.length:()I
        //    45: iload           4
        //    47: iadd           
        //    48: istore          6
        //    50: aload           5
        //    52: iload           4
        //    54: iload_2        
        //    55: iadd           
        //    56: putfield        androidx/core/text/util/b$b.c:I
        //    59: iload_2        
        //    60: iload           6
        //    62: iadd           
        //    63: istore_2       
        //    64: aload           5
        //    66: iload_2        
        //    67: putfield        androidx/core/text/util/b$b.d:I
        //    70: aload_1        
        //    71: iload           6
        //    73: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    76: astore_1       
        //    77: aload_3        
        //    78: ldc_w           "UTF-8"
        //    81: invokestatic    java/net/URLEncoder.encode:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    84: astore_3       
        //    85: new             Ljava/lang/StringBuilder;
        //    88: astore          7
        //    90: aload           7
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: aload           7
        //    97: ldc_w           "geo:0,0?q="
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload           7
        //   106: aload_3        
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload           5
        //   113: aload           7
        //   115: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   118: putfield        androidx/core/text/util/b$b.b:Ljava/lang/String;
        //   121: aload_0        
        //   122: aload           5
        //   124: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   127: pop            
        //   128: goto            7
        //   131: return         
        //   132: astore_0       
        //   133: goto            131
        //   136: astore          5
        //   138: goto            7
        //    Signature:
        //  (Ljava/util/ArrayList<Landroidx/core/text/util/b$b;>;Landroid/text/Spannable;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  7      12     132    136    Ljava/lang/UnsupportedOperationException;
        //  16     23     132    136    Ljava/lang/UnsupportedOperationException;
        //  31     59     132    136    Ljava/lang/UnsupportedOperationException;
        //  64     77     132    136    Ljava/lang/UnsupportedOperationException;
        //  77     85     136    141    Ljava/io/UnsupportedEncodingException;
        //  77     85     132    136    Ljava/lang/UnsupportedOperationException;
        //  85     128    132    136    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0131:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static String n(@j0 String string, @j0 final String[] array, final Matcher matcher, @k0 final Linkify$TransformFilter linkify$TransformFilter) {
        String transformUrl = string;
        if (linkify$TransformFilter != null) {
            transformUrl = linkify$TransformFilter.transformUrl(matcher, string);
        }
        int n = 0;
        int n2;
        while (true) {
            final int length = array.length;
            final boolean b = true;
            if (n >= length) {
                n2 = 0;
                string = transformUrl;
                break;
            }
            if (transformUrl.regionMatches(true, 0, array[n], 0, array[n].length())) {
                n2 = (b ? 1 : 0);
                string = transformUrl;
                if (!transformUrl.regionMatches(false, 0, array[n], 0, array[n].length())) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(array[n]);
                    sb.append(transformUrl.substring(array[n].length()));
                    string = sb.toString();
                    n2 = (b ? 1 : 0);
                    break;
                }
                break;
            }
            else {
                ++n;
            }
        }
        String string2 = string;
        if (n2 == 0) {
            string2 = string;
            if (array.length > 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(array[0]);
                sb2.append(string);
                string2 = sb2.toString();
            }
        }
        return string2;
    }
    
    private static void o(final ArrayList<b> list, final Spannable spannable) {
        final int length = spannable.length();
        final int n = 0;
        final URLSpan[] array = (URLSpan[])spannable.getSpans(0, length, (Class)URLSpan.class);
        for (int i = 0; i < array.length; ++i) {
            final b e = new b();
            e.a = array[i];
            e.c = spannable.getSpanStart((Object)array[i]);
            e.d = spannable.getSpanEnd((Object)array[i]);
            list.add(e);
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)androidx.core.text.util.b.b);
        int size = list.size();
        int j = n;
        while (j < size - 1) {
            final b b = list.get(j);
            final int index = j + 1;
            final b b2 = list.get(index);
            final int c = b.c;
            final int c2 = b2.c;
            if (c <= c2) {
                final int d = b.d;
                if (d > c2) {
                    final int d2 = b2.d;
                    int n2;
                    if (d2 > d && d - c <= d2 - c2) {
                        if (d - c < d2 - c2) {
                            n2 = j;
                        }
                        else {
                            n2 = -1;
                        }
                    }
                    else {
                        n2 = index;
                    }
                    if (n2 != -1) {
                        final URLSpan a = list.get(n2).a;
                        if (a != null) {
                            spannable.removeSpan((Object)a);
                        }
                        list.remove(n2);
                        --size;
                        continue;
                    }
                }
            }
            j = index;
        }
    }
    
    private static boolean p() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    private static class b
    {
        URLSpan a;
        String b;
        int c;
        int d;
        
        b() {
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
}
