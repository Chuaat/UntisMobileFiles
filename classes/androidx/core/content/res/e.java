// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import android.graphics.Shader$TileMode;
import java.util.List;
import java.util.ArrayList;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;
import android.graphics.LinearGradient;
import k.a;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.graphics.Shader;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import androidx.annotation.j0;
import android.content.res.Resources;
import androidx.annotation.l;
import androidx.annotation.k0;
import androidx.annotation.t0;

@t0({ t0.a.I })
final class e
{
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    
    private e() {
    }
    
    private static a a(@k0 final a a, @l final int n, @l final int n2, final boolean b, @l final int n3) {
        if (a != null) {
            return a;
        }
        if (b) {
            return new a(n, n3, n2);
        }
        return new a(n, n2);
    }
    
    static Shader b(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSet, resources$Theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    static Shader c(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        final String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        final TypedArray s = i.s(resources, resources$Theme, set, k.a.j.A);
        final float j = i.j(s, xmlPullParser, "startX", k.a.j.J, 0.0f);
        final float i = androidx.core.content.res.i.j(s, xmlPullParser, "startY", k.a.j.K, 0.0f);
        final float k = androidx.core.content.res.i.j(s, xmlPullParser, "endX", k.a.j.L, 0.0f);
        final float l = androidx.core.content.res.i.j(s, xmlPullParser, "endY", k.a.j.M, 0.0f);
        final float m = androidx.core.content.res.i.j(s, xmlPullParser, "centerX", k.a.j.E, 0.0f);
        final float j2 = androidx.core.content.res.i.j(s, xmlPullParser, "centerY", k.a.j.F, 0.0f);
        final int k2 = androidx.core.content.res.i.k(s, xmlPullParser, "type", k.a.j.D, 0);
        final int f = androidx.core.content.res.i.f(s, xmlPullParser, "startColor", k.a.j.B, 0);
        final boolean r = androidx.core.content.res.i.r(xmlPullParser, "centerColor");
        final int f2 = androidx.core.content.res.i.f(s, xmlPullParser, "centerColor", k.a.j.I, 0);
        final int f3 = androidx.core.content.res.i.f(s, xmlPullParser, "endColor", k.a.j.C, 0);
        final int k3 = androidx.core.content.res.i.k(s, xmlPullParser, "tileMode", k.a.j.H, 0);
        final float j3 = androidx.core.content.res.i.j(s, xmlPullParser, "gradientRadius", k.a.j.G, 0.0f);
        s.recycle();
        final a a = a(d(resources, xmlPullParser, set, resources$Theme), f, f3, r, f2);
        if (k2 != 1) {
            if (k2 != 2) {
                return (Shader)new LinearGradient(j, i, k, l, a.a, a.b, e(k3));
            }
            return (Shader)new SweepGradient(m, j2, a.a, a.b);
        }
        else {
            if (j3 > 0.0f) {
                return (Shader)new RadialGradient(m, j2, j3, a.a, a.b, e(k3));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }
    
    private static a d(@j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final int n = xmlPullParser.getDepth() + 1;
        final ArrayList<Float> list = new ArrayList<Float>(20);
        final ArrayList<Integer> list2 = new ArrayList<Integer>(20);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n) {
                continue;
            }
            if (!xmlPullParser.getName().equals("item")) {
                continue;
            }
            final TypedArray s = i.s(resources, resources$Theme, set, k.a.j.N);
            final int o = k.a.j.O;
            final boolean hasValue = s.hasValue(o);
            final int p4 = k.a.j.P;
            final boolean hasValue2 = s.hasValue(p4);
            if (!hasValue || !hasValue2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                throw new XmlPullParserException(sb.toString());
            }
            final int color = s.getColor(o, 0);
            final float float1 = s.getFloat(p4, 0.0f);
            s.recycle();
            list2.add(color);
            list.add(float1);
        }
        if (list2.size() > 0) {
            return new a(list2, list);
        }
        return null;
    }
    
    private static Shader$TileMode e(final int n) {
        if (n == 1) {
            return Shader$TileMode.REPEAT;
        }
        if (n != 2) {
            return Shader$TileMode.CLAMP;
        }
        return Shader$TileMode.MIRROR;
    }
    
    static final class a
    {
        final int[] a;
        final float[] b;
        
        a(@l final int n, @l final int n2) {
            this.a = new int[] { n, n2 };
            this.b = new float[] { 0.0f, 1.0f };
        }
        
        a(@l final int n, @l final int n2, @l final int n3) {
            this.a = new int[] { n, n2, n3 };
            this.b = new float[] { 0.0f, 0.5f, 1.0f };
        }
        
        a(@j0 final List<Integer> list, @j0 final List<Float> list2) {
            final int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; ++i) {
                this.a[i] = list.get(i);
                this.b[i] = list2.get(i);
            }
        }
    }
}
