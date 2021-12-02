// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.os.Build$VERSION;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.k0;
import androidx.core.content.res.g;
import androidx.annotation.y0;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.a;
import android.content.res.ColorStateList;
import androidx.annotation.p0;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class u0
{
    private final Context a;
    private final TypedArray b;
    private TypedValue c;
    
    private u0(final Context a, final TypedArray b) {
        this.a = a;
        this.b = b;
    }
    
    public static u0 E(final Context context, final int n, final int[] array) {
        return new u0(context, context.obtainStyledAttributes(n, array));
    }
    
    public static u0 F(final Context context, final AttributeSet set, final int[] array) {
        return new u0(context, context.obtainStyledAttributes(set, array));
    }
    
    public static u0 G(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new u0(context, context.obtainStyledAttributes(set, array, n, n2));
    }
    
    public boolean A(final int n, final TypedValue typedValue) {
        return this.b.getValue(n, typedValue);
    }
    
    public TypedArray B() {
        return this.b;
    }
    
    public boolean C(final int n) {
        return this.b.hasValue(n);
    }
    
    public int D() {
        return this.b.length();
    }
    
    public TypedValue H(final int n) {
        return this.b.peekValue(n);
    }
    
    public void I() {
        this.b.recycle();
    }
    
    public boolean a(final int n, final boolean b) {
        return this.b.getBoolean(n, b);
    }
    
    @p0(21)
    public int b() {
        return this.b.getChangingConfigurations();
    }
    
    public int c(final int n, final int n2) {
        return this.b.getColor(n, n2);
    }
    
    public ColorStateList d(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList c = androidx.appcompat.content.res.a.c(this.a, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return this.b.getColorStateList(n);
    }
    
    public float e(final int n, final float n2) {
        return this.b.getDimension(n, n2);
    }
    
    public int f(final int n, final int n2) {
        return this.b.getDimensionPixelOffset(n, n2);
    }
    
    public int g(final int n, final int n2) {
        return this.b.getDimensionPixelSize(n, n2);
    }
    
    public Drawable h(final int n) {
        if (this.b.hasValue(n)) {
            final int resourceId = this.b.getResourceId(n, 0);
            if (resourceId != 0) {
                return androidx.appcompat.content.res.a.d(this.a, resourceId);
            }
        }
        return this.b.getDrawable(n);
    }
    
    public Drawable i(int resourceId) {
        if (this.b.hasValue(resourceId)) {
            resourceId = this.b.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return j.b().d(this.a, resourceId, true);
            }
        }
        return null;
    }
    
    public float j(final int n, final float n2) {
        return this.b.getFloat(n, n2);
    }
    
    @k0
    public Typeface k(@y0 int resourceId, final int n, @k0 final g.c c) {
        resourceId = this.b.getResourceId(resourceId, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return g.j(this.a, resourceId, this.c, n, c);
    }
    
    public float l(final int n, final int n2, final int n3, final float n4) {
        return this.b.getFraction(n, n2, n3, n4);
    }
    
    public int m(final int n) {
        return this.b.getIndex(n);
    }
    
    public int n() {
        return this.b.getIndexCount();
    }
    
    public int o(final int n, final int n2) {
        return this.b.getInt(n, n2);
    }
    
    public int p(final int n, final int n2) {
        return this.b.getInteger(n, n2);
    }
    
    public int q(final int n, final int n2) {
        return this.b.getLayoutDimension(n, n2);
    }
    
    public int r(final int n, final String s) {
        return this.b.getLayoutDimension(n, s);
    }
    
    public String s(final int n) {
        return this.b.getNonResourceString(n);
    }
    
    public String t() {
        return this.b.getPositionDescription();
    }
    
    public int u(final int n, final int n2) {
        return this.b.getResourceId(n, n2);
    }
    
    public Resources v() {
        return this.b.getResources();
    }
    
    public String w(final int n) {
        return this.b.getString(n);
    }
    
    public CharSequence x(final int n) {
        return this.b.getText(n);
    }
    
    public CharSequence[] y(final int n) {
        return this.b.getTextArray(n);
    }
    
    public int z(final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            return this.b.getType(n);
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        this.b.getValue(n, this.c);
        return this.c.type;
    }
}
