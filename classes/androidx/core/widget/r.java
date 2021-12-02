// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.view.ActionMode;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import android.view.Menu;
import android.text.Editable;
import java.util.Iterator;
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.lang.reflect.Method;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.s;
import android.util.Log;
import android.graphics.Paint;
import android.text.TextPaint;
import android.icu.text.DecimalFormatSymbols;
import android.text.method.PasswordTransformationMethod;
import androidx.annotation.p0;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.t0;
import androidx.annotation.k0;
import android.view.ActionMode$Callback;
import androidx.annotation.x0;
import androidx.core.text.g;
import android.graphics.Paint$FontMetricsInt;
import android.os.Build$VERSION;
import androidx.core.util.n;
import androidx.annotation.n0;
import androidx.annotation.b0;
import androidx.annotation.j0;
import android.widget.TextView;
import java.lang.reflect.Field;

public final class r
{
    private static final String a = "TextViewCompat";
    public static final int b = 0;
    public static final int c = 1;
    private static Field d;
    private static boolean e = false;
    private static Field f;
    private static boolean g = false;
    private static Field h;
    private static boolean i = false;
    private static Field j;
    private static boolean k = false;
    private static final int l = 1;
    
    private r() {
    }
    
    public static void A(@j0 final TextView textView, @b0(from = 0L) @n0 final int firstBaselineToTopHeight) {
        n.d(firstBaselineToTopHeight);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int a;
        if (sdk_INT >= 16 && !textView.getIncludeFontPadding()) {
            a = fontMetricsInt.ascent;
        }
        else {
            a = fontMetricsInt.top;
        }
        if (firstBaselineToTopHeight > Math.abs(a)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight + a, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }
    
    public static void B(@j0 final TextView textView, @b0(from = 0L) @n0 final int n) {
        n.d(n);
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int a;
        if (Build$VERSION.SDK_INT >= 16 && !textView.getIncludeFontPadding()) {
            a = fontMetricsInt.descent;
        }
        else {
            a = fontMetricsInt.bottom;
        }
        if (n > Math.abs(a)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n - a);
        }
    }
    
    public static void C(@j0 final TextView textView, @b0(from = 0L) @n0 final int n) {
        n.d(n);
        final int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            textView.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public static void D(@j0 final TextView textView, @j0 g f) {
        if (Build$VERSION.SDK_INT >= 29) {
            f = (g)f.f();
        }
        else if (!o(textView).a(f.e())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText((CharSequence)f);
    }
    
    public static void E(@j0 final TextView textView, @x0 final int textAppearance) {
        if (Build$VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(textAppearance);
        }
        else {
            textView.setTextAppearance(textView.getContext(), textAppearance);
        }
    }
    
    public static void F(@j0 final TextView textView, @j0 final g.a a) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18) {
            textView.setTextDirection(m(a.d()));
        }
        if (sdk_INT < 23) {
            final float textScaleX = a.e().getTextScaleX();
            textView.getPaint().set(a.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX(textScaleX / 2.0f + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
        else {
            textView.getPaint().set(a.e());
            textView.setBreakStrategy(a.b());
            textView.setHyphenationFrequency(a.c());
        }
    }
    
    @k0
    @t0({ t0.a.I })
    public static ActionMode$Callback G(@k0 final ActionMode$Callback actionMode$Callback) {
        ActionMode$Callback d = actionMode$Callback;
        if (actionMode$Callback instanceof b) {
            d = actionMode$Callback;
            if (Build$VERSION.SDK_INT >= 26) {
                d = ((b)actionMode$Callback).d();
            }
        }
        return d;
    }
    
    @k0
    @t0({ t0.a.I })
    public static ActionMode$Callback H(@j0 final TextView textView, @k0 final ActionMode$Callback actionMode$Callback) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26 && sdk_INT <= 27 && !(actionMode$Callback instanceof b) && actionMode$Callback != null) {
            return (ActionMode$Callback)new b(actionMode$Callback, textView);
        }
        return actionMode$Callback;
    }
    
    public static int a(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b)textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }
    
    public static int b(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b)textView).getAutoSizeMinTextSize();
        }
        return -1;
    }
    
    public static int c(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b)textView).getAutoSizeStepGranularity();
        }
        return -1;
    }
    
    @j0
    public static int[] d(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextAvailableSizes();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b)textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }
    
    public static int e(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b)textView).getAutoSizeTextType();
        }
        return 0;
    }
    
    @k0
    public static ColorStateList f(@j0 final TextView textView) {
        n.g(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintList();
        }
        if (textView instanceof w) {
            return ((w)textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }
    
    @k0
    public static PorterDuff$Mode g(@j0 final TextView textView) {
        n.g(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintMode();
        }
        if (textView instanceof w) {
            return ((w)textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }
    
    @j0
    public static Drawable[] h(@j0 final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (sdk_INT >= 17) {
            final int layoutDirection = textView.getLayoutDirection();
            boolean b = true;
            if (layoutDirection != 1) {
                b = false;
            }
            final Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (b) {
                final Drawable drawable = compoundDrawables[2];
                final Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }
    
    public static int i(@j0 final TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }
    
    public static int j(@j0 final TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }
    
    public static int k(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!r.g) {
            r.f = p("mMaxMode");
            r.g = true;
        }
        final Field f = r.f;
        if (f != null && q(f, textView) == 1) {
            if (!r.e) {
                r.d = p("mMaximum");
                r.e = true;
            }
            final Field d = r.d;
            if (d != null) {
                return q(d, textView);
            }
        }
        return -1;
    }
    
    public static int l(@j0 final TextView textView) {
        if (Build$VERSION.SDK_INT >= 16) {
            return textView.getMinLines();
        }
        if (!r.k) {
            r.j = p("mMinMode");
            r.k = true;
        }
        final Field j = r.j;
        if (j != null && q(j, textView) == 1) {
            if (!r.i) {
                r.h = p("mMinimum");
                r.i = true;
            }
            final Field h = r.h;
            if (h != null) {
                return q(h, textView);
            }
        }
        return -1;
    }
    
    @p0(18)
    private static int m(@j0 final TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
    
    @p0(18)
    private static TextDirectionHeuristic n(@j0 final TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 28 && (textView.getInputType() & 0xF) == 0x3) {
            final byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        else {
            if (textView.getLayoutDirection() == 1) {
                b = true;
            }
            switch (textView.getTextDirection()) {
                default: {
                    TextDirectionHeuristic textDirectionHeuristic;
                    if (b) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    return textDirectionHeuristic;
                }
                case 7: {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                case 6: {
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                }
                case 5: {
                    return TextDirectionHeuristics.LOCALE;
                }
                case 4: {
                    return TextDirectionHeuristics.RTL;
                }
                case 3: {
                    return TextDirectionHeuristics.LTR;
                }
                case 2: {
                    return TextDirectionHeuristics.ANYRTL_LTR;
                }
            }
        }
    }
    
    @j0
    public static g.a o(@j0 final TextView textView) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return new g.a(textView.getTextMetricsParams());
        }
        final g.a.a a = new g.a.a(new TextPaint((Paint)textView.getPaint()));
        if (sdk_INT >= 23) {
            a.b(textView.getBreakStrategy());
            a.c(textView.getHyphenationFrequency());
        }
        if (sdk_INT >= 18) {
            a.d(n(textView));
        }
        return a.a();
    }
    
    private static Field p(final String s) {
        Field declaredField = null;
        try {
            final Field field = declaredField = TextView.class.getDeclaredField(s);
            field.setAccessible(true);
            declaredField = field;
        }
        catch (NoSuchFieldException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve ");
            sb.append(s);
            sb.append(" field.");
            Log.e("TextViewCompat", sb.toString());
        }
        return declaredField;
    }
    
    private static int q(final Field field, final TextView obj) {
        try {
            return field.getInt(obj);
        }
        catch (IllegalAccessException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            Log.d("TextViewCompat", sb.toString());
            return -1;
        }
    }
    
    public static void r(@j0 final TextView textView, final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (Build$VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b)textView).setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
    }
    
    public static void s(@j0 final TextView textView, @j0 final int[] array, final int n) throws IllegalArgumentException {
        if (Build$VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b)textView).setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
    }
    
    public static void t(@j0 final TextView textView, final int n) {
        if (Build$VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(n);
        }
        else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b)textView).setAutoSizeTextTypeWithDefaults(n);
        }
    }
    
    public static void u(@j0 final TextView textView, @k0 final ColorStateList list) {
        n.g(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(list);
        }
        else if (textView instanceof w) {
            ((w)textView).setSupportCompoundDrawablesTintList(list);
        }
    }
    
    public static void v(@j0 final TextView textView, @k0 final PorterDuff$Mode porterDuff$Mode) {
        n.g(textView);
        if (Build$VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(porterDuff$Mode);
        }
        else if (textView instanceof w) {
            ((w)textView).setSupportCompoundDrawablesTintMode(porterDuff$Mode);
        }
    }
    
    public static void w(@j0 final TextView textView, @k0 Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
        else if (sdk_INT >= 17) {
            final int layoutDirection = textView.getLayoutDirection();
            boolean b = true;
            if (layoutDirection != 1) {
                b = false;
            }
            Drawable drawable5;
            if (b) {
                drawable5 = drawable3;
            }
            else {
                drawable5 = drawable;
            }
            if (!b) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }
        else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }
    
    public static void x(@j0 final TextView textView, @s int n, @s final int n2, @s final int n3, @s final int n4) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
        }
        else if (sdk_INT >= 17) {
            final int layoutDirection = textView.getLayoutDirection();
            boolean b = true;
            if (layoutDirection != 1) {
                b = false;
            }
            int n5;
            if (b) {
                n5 = n3;
            }
            else {
                n5 = n;
            }
            if (!b) {
                n = n3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(n5, n2, n, n4);
        }
        else {
            textView.setCompoundDrawablesWithIntrinsicBounds(n, n2, n3, n4);
        }
    }
    
    public static void y(@j0 final TextView textView, @k0 Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 18) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
        else if (sdk_INT >= 17) {
            final int layoutDirection = textView.getLayoutDirection();
            boolean b = true;
            if (layoutDirection != 1) {
                b = false;
            }
            Drawable drawable5;
            if (b) {
                drawable5 = drawable3;
            }
            else {
                drawable5 = drawable;
            }
            if (!b) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        }
        else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
    
    public static void z(@j0 final TextView textView, @j0 final ActionMode$Callback actionMode$Callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, actionMode$Callback));
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
    
    @p0(26)
    private static class b implements ActionMode$Callback
    {
        private static final int g = 100;
        private final ActionMode$Callback a;
        private final TextView b;
        private Class<?> c;
        private Method d;
        private boolean e;
        private boolean f;
        
        b(final ActionMode$Callback a, final TextView b) {
            this.a = a;
            this.b = b;
            this.f = false;
        }
        
        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
        
        private Intent b(final ResolveInfo resolveInfo, final TextView textView) {
            final Intent putExtra = this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", this.e(textView) ^ true);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }
        
        private List<ResolveInfo> c(final Context context, final PackageManager packageManager) {
            final ArrayList<ResolveInfo> list = new ArrayList<ResolveInfo>();
            if (!(context instanceof Activity)) {
                return list;
            }
            for (final ResolveInfo resolveInfo : packageManager.queryIntentActivities(this.a(), 0)) {
                if (this.f(resolveInfo, context)) {
                    list.add(resolveInfo);
                }
            }
            return list;
        }
        
        private boolean e(final TextView textView) {
            return textView instanceof Editable && textView.onCheckIsTextEditor() && textView.isEnabled();
        }
        
        private boolean f(final ResolveInfo resolveInfo, final Context context) {
            final boolean equals = context.getPackageName().equals(resolveInfo.activityInfo.packageName);
            final boolean b = true;
            if (equals) {
                return true;
            }
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            final String permission = activityInfo.permission;
            boolean b2 = b;
            if (permission != null) {
                b2 = (context.checkSelfPermission(permission) == 0 && b);
            }
            return b2;
        }
        
        private void g(final Menu obj) {
            final Context context = this.b.getContext();
            final PackageManager packageManager = context.getPackageManager();
            if (!this.f) {
                this.f = true;
                try {
                    final Class<?> forName = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = forName;
                    this.d = forName.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.e = true;
                }
                catch (ClassNotFoundException | NoSuchMethodException ex) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                Label_0132: {
                    if (this.e && this.c.isInstance(obj)) {
                        final Method method = this.d;
                        break Label_0132;
                    }
                    try {
                        final Method method = obj.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                        for (int i = obj.size() - 1; i >= 0; --i) {
                            final MenuItem item = obj.getItem(i);
                            if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                                method.invoke(obj, i);
                            }
                        }
                        final List<ResolveInfo> c = this.c(context, packageManager);
                        for (int j = 0; j < c.size(); ++j) {
                            final ResolveInfo resolveInfo = c.get(j);
                            obj.add(0, 0, j + 100, resolveInfo.loadLabel(packageManager)).setIntent(this.b(resolveInfo, this.b)).setShowAsAction(1);
                        }
                    }
                    catch (IllegalAccessException ex2) {}
                }
            }
            catch (NoSuchMethodException ex3) {}
            catch (IllegalAccessException ex4) {}
            catch (InvocationTargetException ex5) {}
        }
        
        @j0
        ActionMode$Callback d() {
            return this.a;
        }
        
        public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }
        
        public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }
        
        public void onDestroyActionMode(final ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }
        
        public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
            this.g(menu);
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }
}
