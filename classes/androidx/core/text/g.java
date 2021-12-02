// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import android.text.TextDirectionHeuristics;
import androidx.core.util.i;
import android.text.PrecomputedText$Params$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.t0;
import androidx.annotation.b0;
import androidx.annotation.a1;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import android.annotation.SuppressLint;
import android.text.PrecomputedText$Params;
import android.text.Layout$Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import androidx.core.os.t;
import androidx.core.util.n;
import android.text.SpannableString;
import androidx.annotation.p0;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.text.PrecomputedText;
import androidx.annotation.w;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import android.text.Spannable;

public class g implements Spannable
{
    private static final char K = '\n';
    private static final Object L;
    @j0
    @w("sLock")
    private static Executor M;
    @j0
    private final Spannable G;
    @j0
    private final a H;
    @j0
    private final int[] I;
    @k0
    private final PrecomputedText J;
    
    static {
        L = new Object();
    }
    
    @p0(28)
    private g(@j0 PrecomputedText precomputedText, @j0 final a h) {
        this.G = (Spannable)precomputedText;
        this.H = h;
        this.I = null;
        if (Build$VERSION.SDK_INT < 29) {
            precomputedText = null;
        }
        this.J = precomputedText;
    }
    
    private g(@j0 final CharSequence charSequence, @j0 final a h, @j0 final int[] i) {
        this.G = (Spannable)new SpannableString(charSequence);
        this.H = h;
        this.I = i;
        this.J = null;
    }
    
    @SuppressLint({ "NewApi" })
    public static g a(@j0 final CharSequence charSequence, @j0 final a a) {
        n.g(charSequence);
        n.g(a);
        try {
            t.b("PrecomputedText");
            if (Build$VERSION.SDK_INT >= 29) {
                final PrecomputedText$Params e = a.e;
                if (e != null) {
                    return new g(PrecomputedText.create(charSequence, e), a);
                }
            }
            final ArrayList<Integer> list = new ArrayList<Integer>();
            final int length = charSequence.length();
            int i = 0;
            while (i < length) {
                i = TextUtils.indexOf(charSequence, '\n', i, length);
                if (i < 0) {
                    i = length;
                }
                else {
                    ++i;
                }
                list.add(i);
            }
            final int[] array = new int[list.size()];
            for (int j = 0; j < list.size(); ++j) {
                array[j] = list.get(j);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), a.e(), Integer.MAX_VALUE).setBreakStrategy(a.b()).setHyphenationFrequency(a.c()).setTextDirection(a.d()).build();
            }
            else if (sdk_INT >= 21) {
                new StaticLayout(charSequence, a.e(), Integer.MAX_VALUE, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new g(charSequence, a, array);
        }
        finally {
            t.d();
        }
    }
    
    @a1
    public static Future<g> g(@j0 final CharSequence charSequence, @j0 a a, @k0 final Executor executor) {
        a = (a)new b(a, charSequence);
        final Executor executor2 = executor;
        if (executor == null) {
            synchronized (g.L) {
                if (g.M == null) {
                    g.M = Executors.newFixedThreadPool(1);
                }
                final Executor m = g.M;
            }
        }
        executor2.execute((Runnable)a);
        return (Future<g>)a;
    }
    
    @SuppressLint({ "NewApi" })
    @b0(from = 0L)
    public int b() {
        if (Build$VERSION.SDK_INT >= 29) {
            return this.J.getParagraphCount();
        }
        return this.I.length;
    }
    
    @SuppressLint({ "NewApi" })
    @b0(from = 0L)
    public int c(@b0(from = 0L) final int n) {
        n.c(n, 0, this.b(), "paraIndex");
        if (Build$VERSION.SDK_INT >= 29) {
            return this.J.getParagraphEnd(n);
        }
        return this.I[n];
    }
    
    public char charAt(final int n) {
        return this.G.charAt(n);
    }
    
    @SuppressLint({ "NewApi" })
    @b0(from = 0L)
    public int d(@b0(from = 0L) int n) {
        final int b = this.b();
        final int n2 = 0;
        n.c(n, 0, b, "paraIndex");
        if (Build$VERSION.SDK_INT >= 29) {
            return this.J.getParagraphStart(n);
        }
        if (n == 0) {
            n = n2;
        }
        else {
            n = this.I[n - 1];
        }
        return n;
    }
    
    @j0
    public a e() {
        return this.H;
    }
    
    @k0
    @p0(28)
    @t0({ t0.a.I })
    public PrecomputedText f() {
        final Spannable g = this.G;
        if (g instanceof PrecomputedText) {
            return (PrecomputedText)g;
        }
        return null;
    }
    
    public int getSpanEnd(final Object o) {
        return this.G.getSpanEnd(o);
    }
    
    public int getSpanFlags(final Object o) {
        return this.G.getSpanFlags(o);
    }
    
    public int getSpanStart(final Object o) {
        return this.G.getSpanStart(o);
    }
    
    @SuppressLint({ "NewApi" })
    public <T> T[] getSpans(final int n, final int n2, final Class<T> clazz) {
        if (Build$VERSION.SDK_INT >= 29) {
            return (T[])this.J.getSpans(n, n2, (Class)clazz);
        }
        return (T[])this.G.getSpans(n, n2, (Class)clazz);
    }
    
    public int length() {
        return this.G.length();
    }
    
    public int nextSpanTransition(final int n, final int n2, final Class clazz) {
        return this.G.nextSpanTransition(n, n2, clazz);
    }
    
    @SuppressLint({ "NewApi" })
    public void removeSpan(final Object o) {
        if (!(o instanceof MetricAffectingSpan)) {
            if (Build$VERSION.SDK_INT >= 29) {
                this.J.removeSpan(o);
            }
            else {
                this.G.removeSpan(o);
            }
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }
    
    @SuppressLint({ "NewApi" })
    public void setSpan(final Object o, final int n, final int n2, final int n3) {
        if (!(o instanceof MetricAffectingSpan)) {
            if (Build$VERSION.SDK_INT >= 29) {
                this.J.setSpan(o, n, n2, n3);
            }
            else {
                this.G.setSpan(o, n, n2, n3);
            }
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }
    
    public CharSequence subSequence(final int n, final int n2) {
        return this.G.subSequence(n, n2);
    }
    
    @j0
    @Override
    public String toString() {
        return this.G.toString();
    }
    
    public static final class a
    {
        @j0
        private final TextPaint a;
        @k0
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText$Params e;
        
        @p0(28)
        public a(@j0 PrecomputedText$Params e) {
            this.a = e.getTextPaint();
            this.b = e.getTextDirection();
            this.c = e.getBreakStrategy();
            this.d = e.getHyphenationFrequency();
            if (Build$VERSION.SDK_INT < 29) {
                e = null;
            }
            this.e = e;
        }
        
        @SuppressLint({ "NewApi" })
        a(@j0 final TextPaint a, @j0 final TextDirectionHeuristic textDirectionHeuristic, final int n, final int n2) {
            PrecomputedText$Params build;
            if (Build$VERSION.SDK_INT >= 29) {
                build = new PrecomputedText$Params$Builder(a).setBreakStrategy(n).setHyphenationFrequency(n2).setTextDirection(textDirectionHeuristic).build();
            }
            else {
                build = null;
            }
            this.e = build;
            this.a = a;
            this.b = textDirectionHeuristic;
            this.c = n;
            this.d = n2;
        }
        
        @t0({ t0.a.I })
        public boolean a(@j0 final g.a a) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                if (this.c != a.b()) {
                    return false;
                }
                if (this.d != a.c()) {
                    return false;
                }
            }
            if (this.a.getTextSize() != a.e().getTextSize()) {
                return false;
            }
            if (this.a.getTextScaleX() != a.e().getTextScaleX()) {
                return false;
            }
            if (this.a.getTextSkewX() != a.e().getTextSkewX()) {
                return false;
            }
            if (sdk_INT >= 21) {
                if (this.a.getLetterSpacing() != a.e().getLetterSpacing()) {
                    return false;
                }
                if (!TextUtils.equals((CharSequence)this.a.getFontFeatureSettings(), (CharSequence)a.e().getFontFeatureSettings())) {
                    return false;
                }
            }
            if (this.a.getFlags() != a.e().getFlags()) {
                return false;
            }
            if (sdk_INT >= 24) {
                if (!this.a.getTextLocales().equals((Object)a.e().getTextLocales())) {
                    return false;
                }
            }
            else if (sdk_INT >= 17 && !this.a.getTextLocale().equals(a.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (a.e().getTypeface() != null) {
                    return false;
                }
            }
            else if (!this.a.getTypeface().equals((Object)a.e().getTypeface())) {
                return false;
            }
            return true;
        }
        
        @p0(23)
        public int b() {
            return this.c;
        }
        
        @p0(23)
        public int c() {
            return this.d;
        }
        
        @k0
        @p0(18)
        public TextDirectionHeuristic d() {
            return this.b;
        }
        
        @j0
        public TextPaint e() {
            return this.a;
        }
        
        @Override
        public boolean equals(@k0 final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof g.a)) {
                return false;
            }
            final g.a a = (g.a)o;
            return this.a(a) && (Build$VERSION.SDK_INT < 18 || this.b == a.d());
        }
        
        @Override
        public int hashCode() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                return i.b(this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocales(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d);
            }
            if (sdk_INT >= 21) {
                return i.b(this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d);
            }
            if (sdk_INT >= 18) {
                return i.b(this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.b, this.c, this.d);
            }
            if (sdk_INT >= 17) {
                return i.b(this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.b, this.c, this.d);
            }
            return i.b(this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getFlags(), this.a.getTypeface(), this.b, this.c, this.d);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(this.a.getTextSize());
            sb.append(sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(this.a.getTextScaleX());
            sb.append(sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(this.a.getTextSkewX());
            sb.append(sb4.toString());
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(", letterSpacing=");
                sb5.append(this.a.getLetterSpacing());
                sb.append(sb5.toString());
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(", elegantTextHeight=");
                sb6.append(this.a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            Label_0285: {
                StringBuilder sb7;
                Object obj;
                if (sdk_INT >= 24) {
                    sb7 = new StringBuilder();
                    sb7.append(", textLocale=");
                    obj = this.a.getTextLocales();
                }
                else {
                    if (sdk_INT < 17) {
                        break Label_0285;
                    }
                    sb7 = new StringBuilder();
                    sb7.append(", textLocale=");
                    obj = this.a.getTextLocale();
                }
                sb7.append(obj);
                sb.append(sb7.toString());
            }
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(", typeface=");
            sb8.append(this.a.getTypeface());
            sb.append(sb8.toString());
            if (sdk_INT >= 26) {
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(", variationSettings=");
                sb9.append(this.a.getFontVariationSettings());
                sb.append(sb9.toString());
            }
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(", textDir=");
            sb10.append(this.b);
            sb.append(sb10.toString());
            final StringBuilder sb11 = new StringBuilder();
            sb11.append(", breakStrategy=");
            sb11.append(this.c);
            sb.append(sb11.toString());
            final StringBuilder sb12 = new StringBuilder();
            sb12.append(", hyphenationFrequency=");
            sb12.append(this.d);
            sb.append(sb12.toString());
            sb.append("}");
            return sb.toString();
        }
        
        public static class a
        {
            @j0
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;
            
            public a(@j0 final TextPaint a) {
                this.a = a;
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                }
                else {
                    this.d = 0;
                    this.c = 0;
                }
                TextDirectionHeuristic firststrong_LTR;
                if (sdk_INT >= 18) {
                    firststrong_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                else {
                    firststrong_LTR = null;
                }
                this.b = firststrong_LTR;
            }
            
            @j0
            public g.a a() {
                return new g.a(this.a, this.b, this.c, this.d);
            }
            
            @p0(23)
            public a b(final int c) {
                this.c = c;
                return this;
            }
            
            @p0(23)
            public a c(final int d) {
                this.d = d;
                return this;
            }
            
            @p0(18)
            public a d(@j0 final TextDirectionHeuristic b) {
                this.b = b;
                return this;
            }
        }
    }
    
    private static class b extends FutureTask<g>
    {
        b(@j0 final g.a a, @j0 final CharSequence charSequence) {
            super(new a(a, charSequence));
        }
        
        private static class a implements Callable<g>
        {
            private g.a G;
            private CharSequence H;
            
            a(@j0 final g.a g, @j0 final CharSequence h) {
                this.G = g;
                this.H = h;
            }
            
            public g a() throws Exception {
                return g.a(this.H, this.G);
            }
        }
    }
}
