// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import android.util.Log;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.util.SparseArray;

public class c
{
    public static final String h = "ConstraintLayoutStates";
    private static final boolean i = false;
    private final ConstraintLayout a;
    e b;
    int c;
    int d;
    private SparseArray<a> e;
    private SparseArray<e> f;
    private g g;
    
    c(final Context context, final ConstraintLayout a, final int n) {
        this.c = -1;
        this.d = -1;
        this.e = (SparseArray<a>)new SparseArray();
        this.f = (SparseArray<e>)new SparseArray();
        this.g = null;
        this.a = a;
        this.a(context, n);
    }
    
    private void a(final Context context, int n) {
        final XmlResourceParser xml = context.getResources().getXml(n);
        a a = null;
        try {
            n = ((XmlPullParser)xml).getEventType();
            while (true) {
                final int n2 = 1;
                if (n == 1) {
                    break;
                }
                a a2;
                if (n != 0) {
                    if (n != 2) {
                        a2 = a;
                    }
                    else {
                        final String name = ((XmlPullParser)xml).getName();
                        Label_0189: {
                            switch (name.hashCode()) {
                                case 1901439077: {
                                    if (name.equals("Variant")) {
                                        n = 3;
                                        break Label_0189;
                                    }
                                    break;
                                }
                                case 1657696882: {
                                    if (name.equals("layoutDescription")) {
                                        n = 0;
                                        break Label_0189;
                                    }
                                    break;
                                }
                                case 1382829617: {
                                    if (name.equals("StateSet")) {
                                        n = n2;
                                        break Label_0189;
                                    }
                                    break;
                                }
                                case 80204913: {
                                    if (name.equals("State")) {
                                        n = 2;
                                        break Label_0189;
                                    }
                                    break;
                                }
                                case -1349929691: {
                                    if (name.equals("ConstraintSet")) {
                                        n = 4;
                                        break Label_0189;
                                    }
                                    break;
                                }
                            }
                            n = -1;
                        }
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    a2 = a;
                                }
                                else {
                                    this.c(context, (XmlPullParser)xml);
                                    a2 = a;
                                }
                            }
                            else {
                                final b b = new b(context, (XmlPullParser)xml);
                                if ((a2 = a) != null) {
                                    a.a(b);
                                    a2 = a;
                                }
                            }
                        }
                        else {
                            a2 = new a(context, (XmlPullParser)xml);
                            this.e.put(a2.a, (Object)a2);
                        }
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                    a2 = a;
                }
                n = ((XmlPullParser)xml).next();
                a = a2;
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    private void c(final Context context, final XmlPullParser xmlPullParser) {
        final e e = new e();
        for (int attributeCount = xmlPullParser.getAttributeCount(), i = 0; i < attributeCount; ++i) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null) {
                if (attributeValue != null) {
                    if ("id".equals(attributeName)) {
                        int identifier;
                        if (attributeValue.contains("/")) {
                            identifier = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                        }
                        else {
                            identifier = -1;
                        }
                        int int1 = identifier;
                        if (identifier == -1) {
                            if (attributeValue.length() > 1) {
                                int1 = Integer.parseInt(attributeValue.substring(1));
                            }
                            else {
                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                int1 = identifier;
                            }
                        }
                        e.x0(context, xmlPullParser);
                        this.f.put(int1, (Object)e);
                        break;
                    }
                }
            }
        }
    }
    
    public boolean b(int d, final float n, final float n2) {
        final int c = this.c;
        if (c != d) {
            return true;
        }
        Object o;
        if (d == -1) {
            o = this.e.valueAt(0);
        }
        else {
            o = this.e.get(c);
        }
        final a a = (a)o;
        d = this.d;
        return (d == -1 || !((b)a.b.get(d)).a(n, n2)) && this.d != a.b(n, n2);
    }
    
    public void d(final g g) {
        this.g = g;
    }
    
    public void e(int i, final float f, final float f2) {
        final int c = this.c;
        if (c == i) {
            Object o;
            if (i == -1) {
                o = this.e.valueAt(0);
            }
            else {
                o = this.e.get(c);
            }
            final a a = (a)o;
            i = this.d;
            if (i != -1 && ((b)a.b.get(i)).a(f, f2)) {
                return;
            }
            final int b = a.b(f, f2);
            if (this.d == b) {
                return;
            }
            e e;
            if (b == -1) {
                e = this.b;
            }
            else {
                e = ((b)a.b.get(b)).g;
            }
            if (b == -1) {
                i = a.c;
            }
            else {
                i = ((b)a.b.get(b)).f;
            }
            if (e == null) {
                return;
            }
            this.d = b;
            final g g = this.g;
            if (g != null) {
                g.b(-1, i);
            }
            e.r(this.a);
            final g g2 = this.g;
            if (g2 != null) {
                g2.a(-1, i);
            }
        }
        else {
            this.c = i;
            final a a2 = (a)this.e.get(i);
            final int b2 = a2.b(f, f2);
            e e2;
            if (b2 == -1) {
                e2 = a2.d;
            }
            else {
                e2 = ((b)a2.b.get(b2)).g;
            }
            int n;
            if (b2 == -1) {
                n = a2.c;
            }
            else {
                n = ((b)a2.b.get(b2)).f;
            }
            if (e2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("NO Constraint set found ! id=");
                sb.append(i);
                sb.append(", dim =");
                sb.append(f);
                sb.append(", ");
                sb.append(f2);
                Log.v("ConstraintLayoutStates", sb.toString());
                return;
            }
            this.d = b2;
            final g g3 = this.g;
            if (g3 != null) {
                g3.b(i, n);
            }
            e2.r(this.a);
            final g g4 = this.g;
            if (g4 != null) {
                g4.a(i, n);
            }
        }
    }
    
    static class a
    {
        int a;
        ArrayList<b> b;
        int c;
        e d;
        
        public a(final Context context, final XmlPullParser xmlPullParser) {
            this.b = new ArrayList<b>();
            this.c = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.yl);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.zl) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                }
                else if (index == j.m.Al) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        (this.d = new e()).G(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        
        void a(final b e) {
            this.b.add(e);
        }
        
        public int b(final float n, final float n2) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i).a(n, n2)) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    static class b
    {
        int a;
        float b;
        float c;
        float d;
        float e;
        int f;
        e g;
        
        public b(final Context context, final XmlPullParser xmlPullParser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.Ln);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.Mn) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if ("layout".equals(resourceTypeName)) {
                        (this.g = new e()).G(context, this.f);
                    }
                }
                else if (index == j.m.Nn) {
                    this.e = obtainStyledAttributes.getDimension(index, this.e);
                }
                else if (index == j.m.On) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                }
                else if (index == j.m.Pn) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                }
                else if (index == j.m.Qn) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                }
                else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
        
        boolean a(final float n, final float n2) {
            return (Float.isNaN(this.b) || n >= this.b) && (Float.isNaN(this.c) || n2 >= this.c) && (Float.isNaN(this.d) || n <= this.d) && (Float.isNaN(this.e) || n2 <= this.e);
        }
    }
}
