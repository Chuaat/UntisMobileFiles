// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.content.res.Resources$NotFoundException;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.view.InflateException;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Constructor;
import androidx.collection.a;

public class h0
{
    private static final Class<?>[] b;
    private static final a<String, Constructor<?>> c;
    private final Context a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new a<String, Constructor<?>>();
    }
    
    private h0(@j0 final Context a) {
        this.a = a;
    }
    
    private Object a(final AttributeSet set, final Class<?> clazz, final String str) {
        final String attributeValue = set.getAttributeValue((String)null, "class");
        if (attributeValue != null) {
            try {
                final a<String, Constructor<?>> c = h0.c;
                synchronized (c) {
                    Constructor<?> constructor2;
                    final Constructor<Object> constructor = (Constructor<Object>)(constructor2 = c.get(attributeValue));
                    if (constructor == null) {
                        final Class<?> subclass = Class.forName(attributeValue, false, this.a.getClassLoader()).asSubclass(clazz);
                        constructor2 = constructor;
                        if (subclass != null) {
                            constructor2 = subclass.getConstructor(h0.b);
                            constructor2.setAccessible(true);
                            c.put(attributeValue, constructor2);
                        }
                    }
                    return constructor2.newInstance(this.a, set);
                }
            }
            catch (Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not instantiate ");
                sb.append(clazz);
                sb.append(" class ");
                sb.append(attributeValue);
                throw new InflateException(sb.toString(), (Throwable)ex);
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" tag must have a 'class' attribute");
        throw new InflateException(sb2.toString());
    }
    
    private g0 b(final XmlPullParser xmlPullParser, final AttributeSet set, final g0 g0) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        l0 l0;
        if (g0 instanceof l0) {
            l0 = (l0)g0;
        }
        else {
            l0 = null;
        }
        while (true) {
            g0 g2 = null;
            while (true) {
                final int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    return g2;
                }
                if (next != 2) {
                    continue;
                }
                final String name = xmlPullParser.getName();
                g0 g3;
                if ("fade".equals(name)) {
                    g3 = new l(this.a, set);
                }
                else if ("changeBounds".equals(name)) {
                    g3 = new e(this.a, set);
                }
                else if ("slide".equals(name)) {
                    g3 = new e0(this.a, set);
                }
                else if ("explode".equals(name)) {
                    g3 = new k(this.a, set);
                }
                else if ("changeImageTransform".equals(name)) {
                    g3 = new g(this.a, set);
                }
                else if ("changeTransform".equals(name)) {
                    g3 = new i(this.a, set);
                }
                else if ("changeClipBounds".equals(name)) {
                    g3 = new f(this.a, set);
                }
                else if ("autoTransition".equals(name)) {
                    g3 = new c(this.a, set);
                }
                else if ("changeScroll".equals(name)) {
                    g3 = new h(this.a, set);
                }
                else if ("transitionSet".equals(name)) {
                    g3 = new l0(this.a, set);
                }
                else if ("transition".equals(name)) {
                    g3 = (g0)this.a(set, g0.class, "transition");
                }
                else if ("targets".equals(name)) {
                    this.e(xmlPullParser, set, g0);
                    g3 = g2;
                }
                else {
                    w w;
                    if ("arcMotion".equals(name)) {
                        if (g0 == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        w = new b(this.a, set);
                    }
                    else if ("pathMotion".equals(name)) {
                        if (g0 == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        w = (w)this.a(set, w.class, "pathMotion");
                    }
                    else {
                        if (!"patternPathMotion".equals(name)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown scene name: ");
                            sb.append(xmlPullParser.getName());
                            throw new RuntimeException(sb.toString());
                        }
                        if (g0 == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        w = new y(this.a, set);
                    }
                    g0.C0(w);
                    g3 = g2;
                }
                g2 = g3;
                if (g3 == null) {
                    continue;
                }
                if (!xmlPullParser.isEmptyElementTag()) {
                    this.b(xmlPullParser, set, g3);
                }
                if (l0 != null) {
                    l0.N0(g3);
                    break;
                }
                if (g0 != null) {
                    throw new InflateException("Could not add transition to another transition.");
                }
                g2 = g3;
            }
        }
    }
    
    private androidx.transition.j0 c(final XmlPullParser xmlPullParser, final AttributeSet set, final ViewGroup viewGroup) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        androidx.transition.j0 j0 = null;
        while (true) {
            final int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return j0;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            if (name.equals("transitionManager")) {
                j0 = new androidx.transition.j0();
            }
            else {
                if (!name.equals("transition") || j0 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown scene name: ");
                    sb.append(xmlPullParser.getName());
                    throw new RuntimeException(sb.toString());
                }
                this.h(set, xmlPullParser, viewGroup, j0);
            }
        }
    }
    
    public static h0 d(final Context context) {
        return new h0(context);
    }
    
    @SuppressLint({ "RestrictedApi" })
    private void e(final XmlPullParser xmlPullParser, final AttributeSet set, final g0 g0) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
    Label_0258_Outer:
        while (true) {
            final int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next != 2) {
                continue;
            }
            if (xmlPullParser.getName().equals("target")) {
                final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(set, f0.a);
                final int l = androidx.core.content.res.i.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
            Block_12_Outer:
                while (true) {
                    if (l != 0) {
                        g0.b(l);
                        break Label_0258;
                    }
                    final int i = androidx.core.content.res.i.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (i != 0) {
                        g0.D(i, true);
                        break Label_0258;
                    }
                    String str = androidx.core.content.res.i.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                    if (str != null) {
                        g0.f(str);
                        break Label_0258;
                    }
                    str = androidx.core.content.res.i.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                    if (str != null) {
                        g0.H(str, true);
                        break Label_0258;
                    }
                    final String m = androidx.core.content.res.i.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                    Label_0223: {
                        if (m == null) {
                            break Label_0223;
                        }
                        str = m;
                        try {
                            g0.F(Class.forName(m), true);
                            obtainStyledAttributes.recycle();
                            continue Label_0258_Outer;
                            while (true) {
                                final String j;
                                str = j;
                                g0.d(Class.forName(j));
                                continue Block_12_Outer;
                                str = m;
                                j = androidx.core.content.res.i.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                continue;
                            }
                        }
                        // iftrue(Label_0258:, j == null)
                        catch (ClassNotFoundException cause) {
                            obtainStyledAttributes.recycle();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Could not create ");
                            sb.append(str);
                            throw new RuntimeException(sb.toString(), cause);
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown scene name: ");
        sb2.append(xmlPullParser.getName());
        throw new RuntimeException(sb2.toString());
    }
    
    @SuppressLint({ "RestrictedApi" })
    private void h(final AttributeSet set, final XmlPullParser xmlPullParser, final ViewGroup viewGroup, final androidx.transition.j0 j0) throws Resources$NotFoundException {
        final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(set, f0.b);
        final int l = androidx.core.content.res.i.l(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        final int i = androidx.core.content.res.i.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        final c0 c0 = null;
        c0 d;
        if (i < 0) {
            d = null;
        }
        else {
            d = androidx.transition.c0.d(viewGroup, i, this.a);
        }
        final int k = androidx.core.content.res.i.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        c0 d2;
        if (k < 0) {
            d2 = c0;
        }
        else {
            d2 = androidx.transition.c0.d(viewGroup, k, this.a);
        }
        if (l >= 0) {
            final g0 f = this.f(l);
            if (f != null) {
                if (d2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No toScene for transition ID ");
                    sb.append(l);
                    throw new RuntimeException(sb.toString());
                }
                if (d == null) {
                    j0.l(d2, f);
                }
                else {
                    j0.k(d, d2, f);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public g0 f(final int n) {
        final XmlResourceParser xml = this.a.getResources().getXml(n);
        try {
            try {
                final g0 b = this.b((XmlPullParser)xml, Xml.asAttributeSet((XmlPullParser)xml), null);
                xml.close();
                return b;
            }
            finally {}
        }
        catch (IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": ");
            sb.append(ex.getMessage());
            throw new InflateException(sb.toString(), (Throwable)ex);
        }
        catch (XmlPullParserException ex2) {
            throw new InflateException(ex2.getMessage(), (Throwable)ex2);
        }
        xml.close();
    }
    
    public androidx.transition.j0 g(final int n, final ViewGroup viewGroup) {
        final XmlResourceParser xml = this.a.getResources().getXml(n);
        try {
            try {
                final androidx.transition.j0 c = this.c((XmlPullParser)xml, Xml.asAttributeSet((XmlPullParser)xml), viewGroup);
                xml.close();
                return c;
            }
            finally {}
        }
        catch (IOException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": ");
            sb.append(ex.getMessage());
            final InflateException ex2 = new InflateException(sb.toString());
            ex2.initCause((Throwable)ex);
            throw ex2;
        }
        catch (XmlPullParserException ex4) {
            final InflateException ex3 = new InflateException(ex4.getMessage());
            ex3.initCause((Throwable)ex4);
            throw ex3;
        }
        xml.close();
    }
}
