// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.util.SparseArray;

public class m
{
    public static final String h = "ConstraintLayoutStates";
    private static final boolean i = false;
    int a;
    e b;
    int c;
    int d;
    private SparseArray<a> e;
    private SparseArray<e> f;
    private g g;
    
    public m(final Context context, final XmlPullParser xmlPullParser) {
        this.a = -1;
        this.c = -1;
        this.d = -1;
        this.e = (SparseArray<a>)new SparseArray();
        this.f = (SparseArray<e>)new SparseArray();
        this.g = null;
        this.b(context, xmlPullParser);
    }
    
    private void b(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.Kl);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == j.m.Ll) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        obtainStyledAttributes.recycle();
        a a = null;
        try {
            int n = xmlPullParser.getEventType();
            while (true) {
                final int n2 = 1;
                if (n == 1) {
                    return;
                }
                a a2;
                if (n != 0) {
                    if (n != 2) {
                        if (n != 3) {
                            a2 = a;
                        }
                        else {
                            a2 = a;
                            if ("StateSet".equals(xmlPullParser.getName())) {
                                break;
                            }
                        }
                    }
                    else {
                        final String name = xmlPullParser.getName();
                        int n3 = 0;
                        Label_0255: {
                            switch (name.hashCode()) {
                                case 1901439077: {
                                    if (name.equals("Variant")) {
                                        n3 = 3;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case 1382829617: {
                                    if (name.equals("StateSet")) {
                                        n3 = n2;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case 1301459538: {
                                    if (name.equals("LayoutDescription")) {
                                        n3 = 0;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case 80204913: {
                                    if (name.equals("State")) {
                                        n3 = 2;
                                        break Label_0255;
                                    }
                                    break;
                                }
                            }
                            n3 = -1;
                        }
                        if (n3 != 2) {
                            if (n3 != 3) {
                                a2 = a;
                            }
                            else {
                                final b b = new b(context, xmlPullParser);
                                if ((a2 = a) != null) {
                                    a.a(b);
                                    a2 = a;
                                }
                            }
                        }
                        else {
                            a2 = new a(context, xmlPullParser);
                            this.e.put(a2.a, (Object)a2);
                        }
                    }
                }
                else {
                    xmlPullParser.getName();
                    a2 = a;
                }
                n = xmlPullParser.next();
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
    
    public int a(final int n, final int n2, final float n3, final float n4) {
        final a a = (a)this.e.get(n2);
        if (a == null) {
            return n2;
        }
        if (n3 != -1.0f && n4 != -1.0f) {
            b b = null;
            for (final b b2 : a.b) {
                if (b2.a(n3, n4)) {
                    if (n == b2.f) {
                        return n;
                    }
                    b = b2;
                }
            }
            if (b != null) {
                return b.f;
            }
            return a.c;
        }
        else {
            if (a.c == n) {
                return n;
            }
            final Iterator<b> iterator2 = a.b.iterator();
            while (iterator2.hasNext()) {
                if (n == ((b)iterator2.next()).f) {
                    return n;
                }
            }
            return a.c;
        }
    }
    
    public boolean c(int d, final float n, final float n2) {
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
    
    public int e(final int n, final int n2, final int n3) {
        return this.f(-1, n, (float)n2, (float)n3);
    }
    
    public int f(int n, int b, final float n2, final float n3) {
        if (n == b) {
            Object o;
            if (b == -1) {
                o = this.e.valueAt(0);
            }
            else {
                o = this.e.get(this.c);
            }
            final a a = (a)o;
            if (a == null) {
                return -1;
            }
            if (this.d != -1 && ((b)a.b.get(n)).a(n2, n3)) {
                return n;
            }
            b = a.b(n2, n3);
            if (n == b) {
                return n;
            }
            if (b == -1) {
                n = a.c;
            }
            else {
                n = ((b)a.b.get(b)).f;
            }
            return n;
        }
        else {
            final a a2 = (a)this.e.get(b);
            if (a2 == null) {
                return -1;
            }
            n = a2.b(n2, n3);
            if (n == -1) {
                n = a2.c;
            }
            else {
                n = ((b)a2.b.get(n)).f;
            }
            return n;
        }
    }
    
    static class a
    {
        int a;
        ArrayList<b> b;
        int c;
        boolean d;
        
        public a(final Context context, final XmlPullParser xmlPullParser) {
            this.b = new ArrayList<b>();
            this.c = -1;
            int i = 0;
            this.d = false;
            TypedArray obtainStyledAttributes;
            for (obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.yl); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.zl) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                }
                else if (index == j.m.Al) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        this.d = true;
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
        boolean g;
        
        public b(final Context context, final XmlPullParser xmlPullParser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            int i = 0;
            this.g = false;
            TypedArray obtainStyledAttributes;
            for (obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.Ln); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.Mn) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if ("layout".equals(resourceTypeName)) {
                        this.g = true;
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
