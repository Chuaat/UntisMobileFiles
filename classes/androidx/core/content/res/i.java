// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import android.util.AttributeSet;
import android.content.res.Resources;
import androidx.annotation.c;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import androidx.annotation.l;
import org.xmlpull.v1.XmlPullParser;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class i
{
    private static final String a = "http://schemas.android.com/apk/res/android";
    
    private i() {
    }
    
    public static int a(@j0 final Context context, final int n, final int n2) {
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n;
        }
        return n2;
    }
    
    public static boolean b(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2, final boolean b) {
        return typedArray.getBoolean(n, typedArray.getBoolean(n2, b));
    }
    
    @k0
    public static Drawable c(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2) {
        Drawable drawable;
        if ((drawable = typedArray.getDrawable(n)) == null) {
            drawable = typedArray.getDrawable(n2);
        }
        return drawable;
    }
    
    public static int d(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2, final int n3) {
        return typedArray.getInt(n, typedArray.getInt(n2, n3));
    }
    
    public static boolean e(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n, final boolean b) {
        if (!r(xmlPullParser, s)) {
            return b;
        }
        return typedArray.getBoolean(n, b);
    }
    
    @l
    public static int f(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n, @l final int n2) {
        if (!r(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getColor(n, n2);
    }
    
    @k0
    public static ColorStateList g(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @k0 final Resources$Theme resources$Theme, @j0 final String s, @y0 final int i) {
        if (!r(xmlPullParser, s)) {
            return null;
        }
        final TypedValue obj = new TypedValue();
        typedArray.getValue(i, obj);
        final int type = obj.type;
        if (type == 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (type >= 28 && type <= 31) {
            return h(obj);
        }
        return androidx.core.content.res.a.d(typedArray.getResources(), typedArray.getResourceId(i, 0), resources$Theme);
    }
    
    @j0
    private static ColorStateList h(@j0 final TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }
    
    public static b i(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @k0 final Resources$Theme resources$Theme, @j0 final String s, @y0 final int n, @l final int n2) {
        if (r(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            typedArray.getValue(n, typedValue);
            final int type = typedValue.type;
            if (type >= 28 && type <= 31) {
                return b.b(typedValue.data);
            }
            final b g = b.g(typedArray.getResources(), typedArray.getResourceId(n, 0), resources$Theme);
            if (g != null) {
                return g;
            }
        }
        return b.b(n2);
    }
    
    public static float j(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n, final float n2) {
        if (!r(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int k(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n, final int n2) {
        if (!r(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    @c
    public static int l(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n, @c final int n2) {
        if (!r(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getResourceId(n, n2);
    }
    
    @k0
    public static String m(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, @y0 final int n) {
        if (!r(xmlPullParser, s)) {
            return null;
        }
        return typedArray.getString(n);
    }
    
    @c
    public static int n(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2, @c final int n3) {
        return typedArray.getResourceId(n, typedArray.getResourceId(n2, n3));
    }
    
    @k0
    public static String o(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2) {
        String s;
        if ((s = typedArray.getString(n)) == null) {
            s = typedArray.getString(n2);
        }
        return s;
    }
    
    @k0
    public static CharSequence p(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2) {
        CharSequence charSequence;
        if ((charSequence = typedArray.getText(n)) == null) {
            charSequence = typedArray.getText(n2);
        }
        return charSequence;
    }
    
    @k0
    public static CharSequence[] q(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2) {
        CharSequence[] array;
        if ((array = typedArray.getTextArray(n)) == null) {
            array = typedArray.getTextArray(n2);
        }
        return array;
    }
    
    public static boolean r(@j0 final XmlPullParser xmlPullParser, @j0 final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    @j0
    public static TypedArray s(@j0 final Resources resources, @k0 final Resources$Theme resources$Theme, @j0 final AttributeSet set, @j0 final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
    
    @k0
    public static TypedValue t(@j0 final TypedArray typedArray, @j0 final XmlPullParser xmlPullParser, @j0 final String s, final int n) {
        if (!r(xmlPullParser, s)) {
            return null;
        }
        return typedArray.peekValue(n);
    }
}
