// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import c.a;
import android.util.AttributeSet;
import androidx.annotation.b1;
import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.annotation.p0;
import android.text.StaticLayout$Builder;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import android.util.Log;
import android.text.StaticLayout;
import android.text.method.TransformationMethod;
import android.text.Layout$Alignment;
import android.view.View;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.content.Context;
import androidx.annotation.j0;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.reflect.Field;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;

class x
{
    private static final String l = "ACTVAutoSizeHelper";
    private static final RectF m;
    private static final int n = 12;
    private static final int o = 112;
    private static final int p = 1;
    @SuppressLint({ "BanConcurrentHashMap" })
    private static ConcurrentHashMap<String, Method> q;
    @SuppressLint({ "BanConcurrentHashMap" })
    private static ConcurrentHashMap<String, Field> r;
    static final float s = -1.0f;
    private static final int t = 1048576;
    private int a;
    private boolean b;
    private float c;
    private float d;
    private float e;
    private int[] f;
    private boolean g;
    private TextPaint h;
    @j0
    private final TextView i;
    private final Context j;
    private final c k;
    
    static {
        m = new RectF();
        x.q = new ConcurrentHashMap<String, Method>();
        x.r = new ConcurrentHashMap<String, Field>();
    }
    
    x(@j0 final TextView i) {
        this.a = 0;
        this.b = false;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new int[0];
        this.g = false;
        this.i = i;
        this.j = i.getContext();
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object k;
        if (sdk_INT >= 29) {
            k = new b();
        }
        else if (sdk_INT >= 23) {
            k = new a();
        }
        else {
            k = new c();
        }
        this.k = (c)k;
    }
    
    private void A(final TypedArray typedArray) {
        final int length = typedArray.length();
        final int[] array = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; ++i) {
                array[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = this.c(array);
            this.B();
        }
    }
    
    private boolean B() {
        final int[] f = this.f;
        final int length = f.length;
        final boolean g = length > 0;
        this.g = g;
        if (g) {
            this.a = 1;
            this.d = (float)f[0];
            this.e = (float)f[length - 1];
            this.c = -1.0f;
        }
        return g;
    }
    
    private boolean C(final int n, final RectF rectF) {
        final CharSequence text = this.i.getText();
        final TransformationMethod transformationMethod = this.i.getTransformationMethod();
        CharSequence charSequence = text;
        if (transformationMethod != null) {
            final CharSequence transformation = transformationMethod.getTransformation(text, (View)this.i);
            charSequence = text;
            if (transformation != null) {
                charSequence = transformation;
            }
        }
        int maxLines;
        if (Build$VERSION.SDK_INT >= 16) {
            maxLines = this.i.getMaxLines();
        }
        else {
            maxLines = -1;
        }
        this.q(n);
        final StaticLayout e = this.e(charSequence, r(this.i, "getLayoutAlignment", Layout$Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == charSequence.length())) && e.getHeight() <= rectF.bottom;
    }
    
    private boolean D() {
        return this.i instanceof AppCompatEditText ^ true;
    }
    
    private void E(final float d, final float n, final float n2) throws IllegalArgumentException {
        if (d <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(d);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= d) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(n);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(d);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (n2 > 0.0f) {
            this.a = 1;
            this.d = d;
            this.e = n;
            this.c = n2;
            this.g = false;
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("The auto-size step granularity (");
        sb3.append(n2);
        sb3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    private static <T> T a(@j0 Object value, @j0 final String str, @j0 final T t) {
        try {
            final Field o = o(str);
            if (o == null) {
                return t;
            }
            value = o.get(value);
            return (T)value;
        }
        catch (IllegalAccessException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), (Throwable)ex);
            return t;
        }
    }
    
    private int[] c(int[] a) {
        final int length = a.length;
        if (length == 0) {
            return a;
        }
        Arrays.sort(a);
        final ArrayList<Comparable<? super Integer>> list = new ArrayList<Comparable<? super Integer>>();
        final int n = 0;
        for (final int n2 : a) {
            if (n2 > 0 && Collections.binarySearch(list, n2) < 0) {
                list.add(n2);
            }
        }
        if (length == list.size()) {
            return a;
        }
        final int size = list.size();
        a = new int[size];
        for (int j = n; j < size; ++j) {
            a[j] = list.get(j);
        }
        return a;
    }
    
    private void d() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }
    
    @p0(23)
    private StaticLayout f(CharSequence obtain, final Layout$Alignment alignment, int maxLines, final int n) {
        obtain = (CharSequence)StaticLayout$Builder.obtain(obtain, 0, obtain.length(), this.h, maxLines);
        final StaticLayout$Builder setHyphenationFrequency = ((StaticLayout$Builder)obtain).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        maxLines = n;
        if (n == -1) {
            maxLines = Integer.MAX_VALUE;
        }
        setHyphenationFrequency.setMaxLines(maxLines);
        try {
            this.k.a((StaticLayout$Builder)obtain, this.i);
        }
        catch (ClassCastException ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return ((StaticLayout$Builder)obtain).build();
    }
    
    private StaticLayout g(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n) {
        return new StaticLayout(charSequence, this.h, n, layout$Alignment, (float)a(this.i, "mSpacingMult", 1.0f), (float)a(this.i, "mSpacingAdd", 0.0f), (boolean)a(this.i, "mIncludePad", Boolean.TRUE));
    }
    
    @p0(16)
    private StaticLayout h(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n) {
        return new StaticLayout(charSequence, this.h, n, layout$Alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }
    
    private int i(final RectF rectF) {
        final int length = this.f.length;
        if (length != 0) {
            int n = length - 1;
            int i = 1;
            int n2 = 0;
            while (i <= n) {
                final int n3 = (i + n) / 2;
                if (this.C(this.f[n3], rectF)) {
                    n2 = i;
                    i = n3 + 1;
                }
                else {
                    n2 = (n = n3 - 1);
                }
            }
            return this.f[n2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }
    
    @k0
    private static Field o(@j0 final String s) {
        try {
            Field field;
            if ((field = x.r.get(s)) == null) {
                final Field declaredField = TextView.class.getDeclaredField(s);
                if ((field = declaredField) != null) {
                    declaredField.setAccessible(true);
                    x.r.put(s, declaredField);
                    field = declaredField;
                }
            }
            return field;
        }
        catch (NoSuchFieldException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(s);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    @k0
    private static Method p(@j0 final String s) {
        try {
            Method method;
            if ((method = x.q.get(s)) == null) {
                final Method declaredMethod = TextView.class.getDeclaredMethod(s, (Class<?>[])new Class[0]);
                if ((method = declaredMethod) != null) {
                    declaredMethod.setAccessible(true);
                    x.q.put(s, declaredMethod);
                    method = declaredMethod;
                }
            }
            return method;
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(s);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    static <T> T r(@j0 Object obj, @j0 final String str, @j0 T invoke) {
        try {
            try {
                obj = (invoke = (T)p(str).invoke(obj, new Object[0]));
            }
            finally {}
        }
        catch (Exception ex) {
            obj = new StringBuilder();
            ((StringBuilder)obj).append("Failed to invoke TextView#");
            ((StringBuilder)obj).append(str);
            ((StringBuilder)obj).append("() method");
            Log.w("ACTVAutoSizeHelper", ((StringBuilder)obj).toString(), (Throwable)ex);
        }
        return invoke;
    }
    
    private void x(final float textSize) {
        if (textSize != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(textSize);
            final boolean b = Build$VERSION.SDK_INT >= 18 && this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    final Method p = p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.i, new Object[0]);
                    }
                }
                catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", (Throwable)ex);
                }
                if (!b) {
                    this.i.requestLayout();
                }
                else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }
    
    private boolean z() {
        final boolean d = this.D();
        int i = 0;
        if (d && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                final int n = (int)Math.floor((this.e - this.d) / this.c) + 1;
                final int[] array = new int[n];
                while (i < n) {
                    array[i] = Math.round(this.d + i * this.c);
                    ++i;
                }
                this.f = this.c(array);
            }
            this.b = true;
        }
        else {
            this.b = false;
        }
        return this.b;
    }
    
    @t0({ t0.a.I })
    void b() {
        if (!this.s()) {
            return;
        }
        Label_0180: {
            if (this.b) {
                if (this.i.getMeasuredHeight() > 0) {
                    if (this.i.getMeasuredWidth() > 0) {
                        int n;
                        if (this.k.b(this.i)) {
                            n = 1048576;
                        }
                        else {
                            n = this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
                        }
                        final int n2 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
                        if (n > 0) {
                            if (n2 > 0) {
                                final RectF m = x.m;
                                synchronized (m) {
                                    m.setEmpty();
                                    m.right = (float)n;
                                    m.bottom = (float)n2;
                                    final float n3 = (float)this.i(m);
                                    if (n3 != this.i.getTextSize()) {
                                        this.y(0, n3);
                                    }
                                    break Label_0180;
                                }
                            }
                        }
                    }
                }
                return;
            }
        }
        this.b = true;
    }
    
    @b1
    StaticLayout e(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n, final int n2) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return this.f(charSequence, layout$Alignment, n, n2);
        }
        if (sdk_INT >= 16) {
            return this.h(charSequence, layout$Alignment, n);
        }
        return this.g(charSequence, layout$Alignment, n);
    }
    
    @t0({ t0.a.I })
    int j() {
        return Math.round(this.e);
    }
    
    @t0({ t0.a.I })
    int k() {
        return Math.round(this.d);
    }
    
    @t0({ t0.a.I })
    int l() {
        return Math.round(this.c);
    }
    
    @t0({ t0.a.I })
    int[] m() {
        return this.f;
    }
    
    @t0({ t0.a.I })
    int n() {
        return this.a;
    }
    
    @b1
    void q(final int n) {
        final TextPaint h = this.h;
        if (h == null) {
            this.h = new TextPaint();
        }
        else {
            h.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float)n);
    }
    
    @t0({ t0.a.I })
    boolean s() {
        return this.D() && this.a != 0;
    }
    
    void t(@k0 final AttributeSet set, int n) {
        final Context j = this.j;
        final int[] j2 = c.a.n.J0;
        final TypedArray obtainStyledAttributes = j.obtainStyledAttributes(set, j2, n, 0);
        final TextView i = this.i;
        androidx.core.view.j0.x1((View)i, i.getContext(), j2, set, obtainStyledAttributes, n, 0);
        n = c.a.n.P0;
        if (obtainStyledAttributes.hasValue(n)) {
            this.a = obtainStyledAttributes.getInt(n, 0);
        }
        n = c.a.n.O0;
        float dimension;
        if (obtainStyledAttributes.hasValue(n)) {
            dimension = obtainStyledAttributes.getDimension(n, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        n = c.a.n.M0;
        float dimension2;
        if (obtainStyledAttributes.hasValue(n)) {
            dimension2 = obtainStyledAttributes.getDimension(n, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        n = c.a.n.L0;
        float dimension3;
        if (obtainStyledAttributes.hasValue(n)) {
            dimension3 = obtainStyledAttributes.getDimension(n, -1.0f);
        }
        else {
            dimension3 = -1.0f;
        }
        n = c.a.n.N0;
        if (obtainStyledAttributes.hasValue(n)) {
            n = obtainStyledAttributes.getResourceId(n, 0);
            if (n > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(n);
                this.A(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (this.D()) {
            if (this.a == 1) {
                if (!this.g) {
                    final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension2 = dimension3;
                    if (dimension3 == -1.0f) {
                        applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n2 = dimension;
                    if (dimension == -1.0f) {
                        n2 = 1.0f;
                    }
                    this.E(applyDimension, applyDimension2, n2);
                }
                this.z();
            }
        }
        else {
            this.a = 0;
        }
    }
    
    @t0({ t0.a.I })
    void u(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (this.D()) {
            final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.E(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (this.z()) {
                this.b();
            }
        }
    }
    
    @t0({ t0.a.I })
    void v(@j0 final int[] array, final int n) throws IllegalArgumentException {
        if (this.D()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                this.f = this.c(copy);
                if (!this.B()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(array));
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                this.g = false;
            }
            if (this.z()) {
                this.b();
            }
        }
    }
    
    @t0({ t0.a.I })
    void w(final int i) {
        if (this.D()) {
            if (i != 0) {
                if (i != 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                this.E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (this.z()) {
                    this.b();
                }
            }
            else {
                this.d();
            }
        }
    }
    
    @t0({ t0.a.I })
    void y(final int n, final float n2) {
        final Context j = this.j;
        Resources resources;
        if (j == null) {
            resources = Resources.getSystem();
        }
        else {
            resources = j.getResources();
        }
        this.x(TypedValue.applyDimension(n, n2, resources.getDisplayMetrics()));
    }
    
    @p0(23)
    private static class a extends c
    {
        a() {
        }
        
        @Override
        void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
            staticLayout$Builder.setTextDirection((TextDirectionHeuristic)x.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }
    
    @p0(29)
    private static class b extends a
    {
        b() {
        }
        
        @Override
        void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
            staticLayout$Builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
        
        @Override
        boolean b(final TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }
    
    private static class c
    {
        c() {
        }
        
        void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
        }
        
        boolean b(final TextView textView) {
            return x.r(textView, "getHorizontallyScrolling", Boolean.FALSE);
        }
    }
}
