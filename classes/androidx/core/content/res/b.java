// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import android.util.Log;
import java.io.IOException;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import androidx.annotation.n;
import androidx.annotation.j0;
import android.content.res.Resources;
import androidx.annotation.l;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class b
{
    private static final String d = "ComplexColorCompat";
    private final Shader a;
    private final ColorStateList b;
    private int c;
    
    private b(final Shader a, final ColorStateList b, @l final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    private static b a(@j0 final Resources resources, @n int next, @k0 final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        final XmlResourceParser xml = resources.getXml(next);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        do {
            next = ((XmlPullParser)xml).next();
        } while (next != 2 && next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        final String name = ((XmlPullParser)xml).getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(e.c(resources, (XmlPullParser)xml, attributeSet, resources$Theme));
        }
        if (name.equals("selector")) {
            return c(a.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((XmlPullParser)xml).getPositionDescription());
        sb.append(": unsupported complex color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    static b b(@l final int n) {
        return new b(null, null, n);
    }
    
    static b c(@j0 final ColorStateList list) {
        return new b(null, list, list.getDefaultColor());
    }
    
    static b d(@j0 final Shader shader) {
        return new b(shader, null, 0);
    }
    
    @k0
    public static b g(@j0 final Resources resources, @n final int n, @k0 final Resources$Theme resources$Theme) {
        try {
            return a(resources, n, resources$Theme);
        }
        catch (Exception ex) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)ex);
            return null;
        }
    }
    
    @l
    public int e() {
        return this.c;
    }
    
    @k0
    public Shader f() {
        return this.a;
    }
    
    public boolean h() {
        return this.a != null;
    }
    
    public boolean i() {
        if (this.a == null) {
            final ColorStateList b = this.b;
            if (b != null && b.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean j(final int[] array) {
        if (this.i()) {
            final ColorStateList b = this.b;
            final int colorForState = b.getColorForState(array, b.getDefaultColor());
            if (colorForState != this.c) {
                final boolean b2 = true;
                this.c = colorForState;
                return b2;
            }
        }
        return false;
    }
    
    public void k(@l final int c) {
        this.c = c;
    }
    
    public boolean l() {
        return this.h() || this.c != 0;
    }
}
