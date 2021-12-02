// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import org.jetbrains.annotations.f;
import android.util.AttributeSet;
import kotlin.j2;
import android.content.res.TypedArray;
import n6.l;
import androidx.annotation.x0;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b\u00f8\u0001\u0000\u001a;\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014" }, d2 = { "", "T", "Landroid/content/Context;", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/j2;", "Lkotlin/s;", "block", "c", "resourceId", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    public static final void b(@org.jetbrains.annotations.e final Context context, @x0 final int n, @org.jetbrains.annotations.e final int[] array, @org.jetbrains.annotations.e final l<? super TypedArray, j2> l) {
        k0.p((Object)context, "<this>");
        k0.p((Object)array, "attrs");
        k0.p((Object)l, "block");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, array);
        k0.o((Object)obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        l.invoke((Object)obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public static final void c(@org.jetbrains.annotations.e final Context context, @f final AttributeSet set, @org.jetbrains.annotations.e final int[] array, @androidx.annotation.f final int n, @x0 final int n2, @org.jetbrains.annotations.e final l<? super TypedArray, j2> l) {
        k0.p((Object)context, "<this>");
        k0.p((Object)array, "attrs");
        k0.p((Object)l, "block");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array, n, n2);
        k0.o((Object)obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        l.invoke((Object)obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
