// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.core.os.b;
import java.util.Arrays;
import android.content.Intent;
import kotlin.s0;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.VectorDrawable;
import com.untis.mobile.utils.v;
import org.joda.time.t;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import android.content.Context;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022.\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006\u001a%\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014\u001a\u0014\u0010!\u001a\u00020\u001d*\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u001f\u001a\u0014\u0010#\u001a\u00020\"*\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u0014¨\u0006$" }, d2 = { "Landroid/content/Context;", "context", "Ljava/lang/Class;", "cls", "", "Lkotlin/s0;", "", "", "pairs", "Landroid/content/Intent;", "i", "(Landroid/content/Context;Ljava/lang/Class;[Lkotlin/s0;)Landroid/content/Intent;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "key", "d", "", "b", "(Landroidx/appcompat/app/e;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "", "a", "(Landroidx/appcompat/app/e;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "", "c", "Lkotlin/j2;", "j", "drawableId", "notificationCount", "Landroid/graphics/drawable/Drawable;", "e", "Lorg/joda/time/t;", "date", "f", "Landroid/graphics/Bitmap;", "h", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    @f
    public static final Integer a(@org.jetbrains.annotations.e final androidx.appcompat.app.e e, @f final Bundle bundle, @org.jetbrains.annotations.e final String s) {
        k0.p(e, "<this>");
        k0.p(s, "key");
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)e).getIntent().getExtras();
        }
        Integer value;
        if (extras == null) {
            value = null;
        }
        else {
            value = extras.getInt(s);
        }
        return value;
    }
    
    @f
    public static final Long b(@org.jetbrains.annotations.e final androidx.appcompat.app.e e, @f final Bundle bundle, @org.jetbrains.annotations.e final String s) {
        k0.p(e, "<this>");
        k0.p(s, "key");
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)e).getIntent().getExtras();
        }
        Long value;
        if (extras == null) {
            value = null;
        }
        else {
            value = extras.getLong(s);
        }
        return value;
    }
    
    @f
    public static final long[] c(@org.jetbrains.annotations.e final androidx.appcompat.app.e e, @f final Bundle bundle, @org.jetbrains.annotations.e final String s) {
        k0.p(e, "<this>");
        k0.p(s, "key");
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)e).getIntent().getExtras();
        }
        long[] longArray;
        if (extras == null) {
            longArray = null;
        }
        else {
            longArray = extras.getLongArray(s);
        }
        return longArray;
    }
    
    @f
    public static final String d(@org.jetbrains.annotations.e final androidx.appcompat.app.e e, @f final Bundle bundle, @org.jetbrains.annotations.e final String s) {
        k0.p(e, "<this>");
        k0.p(s, "key");
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)e).getIntent().getExtras();
        }
        String string;
        if (extras == null) {
            string = null;
        }
        else {
            string = extras.getString(s);
        }
        return string;
    }
    
    @f
    public static final Drawable e(@org.jetbrains.annotations.e final Context context, @s int n, final int i) {
        k0.p(context, "<this>");
        if (i < 1) {
            return d.i(context, n);
        }
        String value;
        if (i < 10) {
            value = String.valueOf(i);
        }
        else {
            value = "9+";
        }
        final Bitmap h = h(context, n);
        final Canvas canvas = new Canvas(h);
        final Paint paint = new Paint(1);
        paint.setColor(d.f(context, 2131100026));
        paint.setAlpha(255);
        paint.setTextSize(canvas.getHeight() * 0.4f);
        paint.setTextAlign(Paint$Align.CENTER);
        paint.setStyle(Paint$Style.FILL_AND_STROKE);
        final Rect rect = new Rect();
        paint.getTextBounds(value, 0, value.length(), rect);
        if (rect.height() > rect.width()) {
            n = rect.height();
        }
        else {
            n = rect.width();
        }
        final float n2 = n * 0.5f + context.getResources().getDimension(2131165667);
        final float n3 = 0.0f + n2;
        final Xfermode xfermode = paint.getXfermode();
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        canvas.drawCircle(canvas.getWidth() - n3, canvas.getHeight() - n3, n2, paint);
        paint.setXfermode(xfermode);
        paint.setColor(d.f(context, 2131100026));
        paint.setStyle(Paint$Style.STROKE);
        canvas.drawCircle(canvas.getWidth() - n3, canvas.getHeight() - n3, n2, paint);
        paint.setColor(d.f(context, 2131100026));
        paint.setStyle(Paint$Style.FILL_AND_STROKE);
        if (canvas.getHeight() > 90) {
            paint.setStrokeWidth(context.getResources().getDimension(2131165668));
        }
        canvas.drawText(value, canvas.getWidth() - n3, canvas.getHeight() - n3 + rect.height() * 0.5f, paint);
        return (Drawable)new BitmapDrawable(context.getResources(), h);
    }
    
    @org.jetbrains.annotations.e
    public static final Drawable f(@org.jetbrains.annotations.e final Context context, @org.jetbrains.annotations.e final t t) {
        k0.p(context, "<this>");
        k0.p(t, "date");
        final String g4 = t.g4("d");
        final Bitmap h = h(context, 2131231163);
        final Canvas canvas = new Canvas(h);
        final Paint paint = new Paint(1);
        paint.setColor(d.f(context, 2131100026));
        paint.setAlpha(255);
        paint.setTextSize(canvas.getHeight() * 0.4f);
        paint.setTextAlign(Paint$Align.CENTER);
        paint.setStyle(Paint$Style.FILL_AND_STROKE);
        final Rect rect = new Rect();
        paint.getTextBounds(g4, 0, g4.length(), rect);
        canvas.drawText(g4, canvas.getWidth() * 0.5f, canvas.getHeight() * 0.66f + rect.height() * 0.5f, paint);
        return (Drawable)new BitmapDrawable(context.getResources(), h);
    }
    
    @org.jetbrains.annotations.e
    public static final Bitmap h(@org.jetbrains.annotations.e final Context context, @s final int n) throws Exception {
        k0.p(context, "<this>");
        final Drawable i = d.i(context, n);
        if (i instanceof VectorDrawable) {
            final VectorDrawable vectorDrawable = (VectorDrawable)i;
            final Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmap);
            vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            vectorDrawable.draw(canvas);
            k0.o(bitmap, "bitmap");
            return bitmap;
        }
        throw new IllegalArgumentException("not a vector drawable".toString());
    }
    
    @org.jetbrains.annotations.e
    public static final Intent i(@org.jetbrains.annotations.e final Context context, @org.jetbrains.annotations.e final Class<?> clazz, @org.jetbrains.annotations.e final s0<String, ?>... original) {
        k0.p(context, "context");
        k0.p(clazz, "cls");
        k0.p(original, "pairs");
        final Intent intent = new Intent(context, (Class)clazz);
        intent.putExtras(b.a((s0[])Arrays.copyOf(original, original.length)));
        return intent;
    }
    
    public static final void j(@org.jetbrains.annotations.e final Context context) {
        k0.p(context, "<this>");
        final InputMethodManager inputMethodManager = (InputMethodManager)d.o(context, (Class)InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(1, 0);
        }
    }
}
