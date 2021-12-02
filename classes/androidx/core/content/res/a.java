// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.t;
import androidx.annotation.l;
import androidx.annotation.n;
import android.content.res.TypedArray;
import android.util.StateSet;
import android.util.Log;
import androidx.annotation.d1;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import androidx.annotation.j0;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class a
{
    private static final ThreadLocal<TypedValue> a;
    
    static {
        a = new ThreadLocal<TypedValue>();
    }
    
    private a() {
    }
    
    @j0
    public static ColorStateList a(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSet, resources$Theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    @j0
    public static ColorStateList b(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, set, resources$Theme);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    @j0
    private static TypedValue c() {
        final ThreadLocal<TypedValue> a = androidx.core.content.res.a.a;
        TypedValue value;
        if ((value = a.get()) == null) {
            value = new TypedValue();
            a.set(value);
        }
        return value;
    }
    
    @k0
    public static ColorStateList d(@j0 final Resources resources, @d1 final int n, @k0 final Resources$Theme resources$Theme) {
        try {
            return a(resources, (XmlPullParser)resources.getXml(n), resources$Theme);
        }
        catch (Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            return null;
        }
    }
    
    private static ColorStateList e(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final int n = xmlPullParser.getDepth() + 1;
        int[][] array = new int[20][];
        int[] array2 = new int[20];
        int n2 = 0;
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            int[] a = array2;
            int[][] array3 = array;
            int n3 = n2;
            if (next == 2) {
                a = array2;
                array3 = array;
                n3 = n2;
                if (depth <= n) {
                    if (!xmlPullParser.getName().equals("item")) {
                        a = array2;
                        array3 = array;
                        n3 = n2;
                    }
                    else {
                        final TypedArray h = h(resources, resources$Theme, set, k.a.j.d);
                        final int e = k.a.j.e;
                        final int resourceId = h.getResourceId(e, -1);
                        int e2 = e;
                        int n4 = 0;
                        Label_0213: {
                            if (resourceId != -1) {
                                e2 = e;
                                if (!f(resources, resourceId)) {
                                    try {
                                        n4 = a(resources, (XmlPullParser)resources.getXml(resourceId), resources$Theme).getDefaultColor();
                                        break Label_0213;
                                    }
                                    catch (Exception ex) {
                                        e2 = k.a.j.e;
                                    }
                                }
                            }
                            n4 = h.getColor(e2, -65281);
                        }
                        float float1 = 1.0f;
                        int n5 = k.a.j.f;
                        Label_0262: {
                            if (!h.hasValue(n5)) {
                                n5 = k.a.j.g;
                                if (!h.hasValue(n5)) {
                                    break Label_0262;
                                }
                            }
                            float1 = h.getFloat(n5, 1.0f);
                        }
                        h.recycle();
                        final int attributeCount = set.getAttributeCount();
                        final int[] array4 = new int[attributeCount];
                        int i = 0;
                        int n6 = 0;
                        while (i < attributeCount) {
                            final int attributeNameResource = set.getAttributeNameResource(i);
                            int n7 = n6;
                            if (attributeNameResource != 16843173) {
                                n7 = n6;
                                if (attributeNameResource != 16843551) {
                                    n7 = n6;
                                    if (attributeNameResource != k.a.a.a) {
                                        int n8;
                                        if (set.getAttributeBooleanValue(i, false)) {
                                            n8 = attributeNameResource;
                                        }
                                        else {
                                            n8 = -attributeNameResource;
                                        }
                                        array4[n6] = n8;
                                        n7 = n6 + 1;
                                    }
                                }
                            }
                            ++i;
                            n6 = n7;
                        }
                        final int[] trimStateSet = StateSet.trimStateSet(array4, n6);
                        a = f.a(array2, n2, g(n4, float1));
                        array3 = f.c(array, n2, trimStateSet);
                        n3 = n2 + 1;
                    }
                }
            }
            array2 = a;
            array = array3;
            n2 = n3;
        }
        final int[] array5 = new int[n2];
        final int[][] array6 = new int[n2][];
        System.arraycopy(array2, 0, array5, 0, n2);
        System.arraycopy(array, 0, array6, 0, n2);
        return new ColorStateList(array6, array5);
    }
    
    private static boolean f(@j0 final Resources resources, @n int type) {
        final TypedValue c = c();
        boolean b = true;
        resources.getValue(type, c, true);
        type = c.type;
        if (type < 28 || type > 31) {
            b = false;
        }
        return b;
    }
    
    @l
    private static int g(@l final int n, @t(from = 0.0, to = 1.0) final float n2) {
        return (n & 0xFFFFFF) | Math.round(Color.alpha(n) * n2) << 24;
    }
    
    private static TypedArray h(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        TypedArray typedArray;
        if (resources$Theme == null) {
            typedArray = resources.obtainAttributes(set, array);
        }
        else {
            typedArray = resources$Theme.obtainStyledAttributes(set, array, 0, 0);
        }
        return typedArray;
    }
}
