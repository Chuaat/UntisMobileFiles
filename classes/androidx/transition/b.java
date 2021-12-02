// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Path;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;

public class b extends w
{
    private static final float g = 0.0f;
    private static final float h = 70.0f;
    private static final float i;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    
    static {
        i = (float)Math.tan(Math.toRadians(35.0));
    }
    
    public b() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = androidx.transition.b.i;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 70.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = androidx.transition.b.i;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, f0.j);
        final XmlPullParser xmlPullParser = (XmlPullParser)set;
        this.g(androidx.core.content.res.i.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f(androidx.core.content.res.i.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.e(androidx.core.content.res.i.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
    
    private static float h(final float n) {
        if (n >= 0.0f && n <= 90.0f) {
            return (float)Math.tan(Math.toRadians(n / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }
    
    @Override
    public Path a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(n, n2);
        final float a = n3 - n;
        final float a2 = n4 - n2;
        final float n5 = a * a + a2 * a2;
        final float n6 = (n + n3) / 2.0f;
        final float n7 = (n2 + n4) / 2.0f;
        final float n8 = 0.25f * n5;
        final boolean b = n2 > n4;
        float n9;
        float n10;
        float n11;
        if (Math.abs(a) < Math.abs(a2)) {
            final float abs = Math.abs(n5 / (a2 * 2.0f));
            if (b) {
                n9 = abs + n4;
                n10 = n3;
            }
            else {
                n9 = abs + n2;
                n10 = n;
            }
            n11 = this.e;
        }
        else {
            final float n12 = n5 / (a * 2.0f);
            if (b) {
                n9 = n2;
                n10 = n12 + n;
            }
            else {
                n10 = n3 - n12;
                n9 = n4;
            }
            n11 = this.d;
        }
        float n13 = n8 * n11 * n11;
        final float n14 = n6 - n10;
        final float n15 = n7 - n9;
        final float n16 = n14 * n14 + n15 * n15;
        final float f = this.f;
        final float n17 = n8 * f * f;
        if (n16 >= n13) {
            if (n16 > n17) {
                n13 = n17;
            }
            else {
                n13 = 0.0f;
            }
        }
        float n18 = n9;
        float n19 = n10;
        if (n13 != 0.0f) {
            final float n20 = (float)Math.sqrt(n13 / n16);
            n19 = (n10 - n6) * n20 + n6;
            n18 = n7 + n20 * (n9 - n7);
        }
        path.cubicTo((n + n19) / 2.0f, (n2 + n18) / 2.0f, (n19 + n3) / 2.0f, (n18 + n4) / 2.0f, n3, n4);
        return path;
    }
    
    public float b() {
        return this.c;
    }
    
    public float c() {
        return this.a;
    }
    
    public float d() {
        return this.b;
    }
    
    public void e(final float c) {
        this.c = c;
        this.f = h(c);
    }
    
    public void f(final float a) {
        this.a = a;
        this.d = h(a);
    }
    
    public void g(final float b) {
        this.b = b;
        this.e = h(b);
    }
}
