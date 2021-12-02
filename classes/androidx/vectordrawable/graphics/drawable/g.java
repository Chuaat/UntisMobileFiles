// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.view.InflateException;
import androidx.core.graphics.o;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.view.animation.Interpolator;

@t0({ t0.a.I })
public class g implements Interpolator
{
    private static final float c = 0.002f;
    public static final int d = 3000;
    public static final double e = 1.0E-5;
    private float[] a;
    private float[] b;
    
    public g(final Context context, final AttributeSet set, final XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), set, xmlPullParser);
    }
    
    public g(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final XmlPullParser xmlPullParser) {
        final TypedArray s = i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.r0);
        this.d(s, xmlPullParser);
        s.recycle();
    }
    
    private void a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(n, n2, n3, n4, 1.0f, 1.0f);
        this.b(path);
    }
    
    private void b(final Path path) {
        int i = 0;
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final float length = pathMeasure.getLength();
        final int min = Math.min(3000, (int)(length / 0.002f) + 1);
        if (min > 0) {
            this.a = new float[min];
            this.b = new float[min];
            final float[] array = new float[2];
            for (int j = 0; j < min; ++j) {
                pathMeasure.getPosTan(j * length / (min - 1), array, (float[])null);
                this.a[j] = array[0];
                this.b[j] = array[1];
            }
            if (Math.abs(this.a[0]) <= 1.0E-5 && Math.abs(this.b[0]) <= 1.0E-5) {
                final float[] a = this.a;
                final int n = min - 1;
                if (Math.abs(a[n] - 1.0f) <= 1.0E-5 && Math.abs(this.b[n] - 1.0f) <= 1.0E-5) {
                    float n2 = 0.0f;
                    float f;
                    for (int n3 = 0; i < min; ++i, n2 = f, ++n3) {
                        final float[] a2 = this.a;
                        f = a2[n3];
                        if (f < n2) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("The Path cannot loop back on itself, x :");
                            sb.append(f);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        a2[i] = f;
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    }
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.a[0]);
            sb2.append(",");
            sb2.append(this.b[0]);
            sb2.append(" end:");
            final float[] a3 = this.a;
            final int n4 = min - 1;
            sb2.append(a3[n4]);
            sb2.append(",");
            sb2.append(this.b[n4]);
            throw new IllegalArgumentException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    private void c(final float n, final float n2) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(n, n2, 1.0f, 1.0f);
        this.b(path);
    }
    
    private void d(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
        if (i.r(xmlPullParser, "pathData")) {
            final String m = i.m(typedArray, xmlPullParser, "pathData", 4);
            final Path e = o.e(m);
            if (e == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The path is null, which is created from ");
                sb.append(m);
                throw new InflateException(sb.toString());
            }
            this.b(e);
        }
        else {
            if (!i.r(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!i.r(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            final float j = i.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            final float i = androidx.core.content.res.i.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            final boolean r = androidx.core.content.res.i.r(xmlPullParser, "controlX2");
            if (r != androidx.core.content.res.i.r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (!r) {
                this.c(j, i);
            }
            else {
                this.a(j, i, androidx.core.content.res.i.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), androidx.core.content.res.i.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        }
    }
    
    public float getInterpolation(float n) {
        if (n <= 0.0f) {
            return 0.0f;
        }
        if (n >= 1.0f) {
            return 1.0f;
        }
        int n2 = 0;
        int n3 = this.a.length - 1;
        while (n3 - n2 > 1) {
            final int n4 = (n2 + n3) / 2;
            if (n < this.a[n4]) {
                n3 = n4;
            }
            else {
                n2 = n4;
            }
        }
        final float[] a = this.a;
        final float n5 = a[n3] - a[n2];
        if (n5 == 0.0f) {
            return this.b[n2];
        }
        final float n6 = (n - a[n2]) / n5;
        final float[] b = this.b;
        n = b[n2];
        return n + n6 * (b[n3] - n);
    }
}
