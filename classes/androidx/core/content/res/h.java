// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import androidx.annotation.c;
import androidx.annotation.p0;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.q;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a1\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d*\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\"" }, d2 = { "Landroid/content/res/TypedArray;", "", "index", "Lkotlin/j2;", "a", "", "b", "c", "Landroid/content/res/ColorStateList;", "d", "", "e", "f", "g", "Landroid/graphics/drawable/Drawable;", "h", "i", "Landroid/graphics/Typeface;", "j", "k", "l", "m", "", "n", "", "p", "", "o", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "q", "(Landroid/content/res/TypedArray;Ln6/l;)Ljava/lang/Object;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    private static final void a(final TypedArray typedArray, @y0 final int n) {
        if (typedArray.hasValue(n)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }
    
    public static final boolean b(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getBoolean(n, false);
    }
    
    @l
    public static final int c(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getColor(n, 0);
    }
    
    @e
    public static final ColorStateList d(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final ColorStateList colorStateList = typedArray.getColorStateList(n);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }
    
    public static final float e(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getDimension(n, 0.0f);
    }
    
    @q
    public static final int f(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getDimensionPixelOffset(n, 0);
    }
    
    @q
    public static final int g(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getDimensionPixelSize(n, 0);
    }
    
    @e
    public static final Drawable h(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final Drawable drawable = typedArray.getDrawable(n);
        k0.m((Object)drawable);
        return drawable;
    }
    
    public static final float i(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getFloat(n, 0.0f);
    }
    
    @p0(26)
    @e
    public static final Typeface j(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final Typeface font = typedArray.getFont(n);
        k0.m((Object)font);
        return font;
    }
    
    public static final int k(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getInt(n, 0);
    }
    
    public static final int l(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getInteger(n, 0);
    }
    
    @c
    public static final int m(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        return typedArray.getResourceId(n, 0);
    }
    
    @e
    public static final String n(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final String string = typedArray.getString(n);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }
    
    @e
    public static final CharSequence[] o(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final CharSequence[] textArray = typedArray.getTextArray(n);
        k0.o((Object)textArray, "getTextArray(index)");
        return textArray;
    }
    
    @e
    public static final CharSequence p(@e final TypedArray typedArray, @y0 final int n) {
        k0.p((Object)typedArray, "<this>");
        a(typedArray, n);
        final CharSequence text = typedArray.getText(n);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }
    
    public static final <R> R q(@e final TypedArray typedArray, @e final n6.l<? super TypedArray, ? extends R> l) {
        k0.p((Object)typedArray, "<this>");
        k0.p((Object)l, "block");
        final Object invoke = l.invoke((Object)typedArray);
        typedArray.recycle();
        return (R)invoke;
    }
}
