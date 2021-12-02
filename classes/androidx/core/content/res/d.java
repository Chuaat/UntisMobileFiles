// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import androidx.annotation.j0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.util.Base64;
import k.a;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import androidx.annotation.e;
import androidx.annotation.k0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class d
{
    private static final int a = 400;
    private static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = -1;
    private static final int f = 500;
    
    private d() {
    }
    
    private static int a(final TypedArray typedArray, final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            return typedArray.getType(n);
        }
        final TypedValue typedValue = new TypedValue();
        typedArray.getValue(n, typedValue);
        return typedValue.type;
    }
    
    @k0
    public static a b(final XmlPullParser xmlPullParser, final Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    public static List<List<byte[]>> c(final Resources resources, @androidx.annotation.e int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            final ArrayList<List<byte[]>> list = new ArrayList<List<byte[]>>();
            if (a(obtainTypedArray, 0) == 1) {
                int resourceId;
                for (i = 0; i < obtainTypedArray.length(); ++i) {
                    resourceId = obtainTypedArray.getResourceId(i, 0);
                    if (resourceId != 0) {
                        list.add(h(resources.getStringArray(resourceId)));
                    }
                }
            }
            else {
                list.add(h(resources.getStringArray(i)));
            }
            return list;
        }
        finally {
            obtainTypedArray.recycle();
        }
    }
    
    @k0
    private static a d(final XmlPullParser xmlPullParser, final Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String)null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }
    
    @k0
    private static a e(final XmlPullParser xmlPullParser, final Resources resources) throws XmlPullParserException, IOException {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k.a.j.h);
        final String string = obtainAttributes.getString(k.a.j.i);
        final String string2 = obtainAttributes.getString(k.a.j.m);
        final String string3 = obtainAttributes.getString(k.a.j.n);
        final int resourceId = obtainAttributes.getResourceId(k.a.j.j, 0);
        final int integer = obtainAttributes.getInteger(k.a.j.k, 1);
        final int integer2 = obtainAttributes.getInteger(k.a.j.l, 500);
        final String string4 = obtainAttributes.getString(k.a.j.o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return (a)new e(new d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        final ArrayList<d> list = new ArrayList<d>();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) {
                continue;
            }
            if (xmlPullParser.getName().equals("font")) {
                list.add(f(xmlPullParser, resources));
            }
            else {
                g(xmlPullParser);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (a)new c((d[])list.toArray(new d[list.size()]));
    }
    
    private static d f(final XmlPullParser xmlPullParser, final Resources resources) throws XmlPullParserException, IOException {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), k.a.j.p);
        int n = k.a.j.y;
        if (!obtainAttributes.hasValue(n)) {
            n = k.a.j.r;
        }
        final int int1 = obtainAttributes.getInt(n, 400);
        int n2 = k.a.j.w;
        if (!obtainAttributes.hasValue(n2)) {
            n2 = k.a.j.s;
        }
        final boolean b = 1 == obtainAttributes.getInt(n2, 0);
        int n3 = k.a.j.z;
        if (!obtainAttributes.hasValue(n3)) {
            n3 = k.a.j.t;
        }
        int n4 = k.a.j.x;
        if (!obtainAttributes.hasValue(n4)) {
            n4 = k.a.j.u;
        }
        final String string = obtainAttributes.getString(n4);
        final int int2 = obtainAttributes.getInt(n3, 0);
        int n5 = k.a.j.v;
        if (!obtainAttributes.hasValue(n5)) {
            n5 = k.a.j.q;
        }
        final int resourceId = obtainAttributes.getResourceId(n5, 0);
        final String string2 = obtainAttributes.getString(n5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, int1, b, string, int2, resourceId);
    }
    
    private static void g(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            final int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                }
                --i;
            }
            else {
                ++i;
            }
        }
    }
    
    private static List<byte[]> h(final String[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    public interface a
    {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }
    
    public static final class c implements a
    {
        @j0
        private final d[] a;
        
        public c(@j0 final d[] a) {
            this.a = a;
        }
        
        @j0
        public d[] a() {
            return this.a;
        }
    }
    
    public static final class d
    {
        @j0
        private final String a;
        private int b;
        private boolean c;
        private String d;
        private int e;
        private int f;
        
        public d(@j0 final String a, final int b, final boolean c, @k0 final String d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @j0
        public String a() {
            return this.a;
        }
        
        public int b() {
            return this.f;
        }
        
        public int c() {
            return this.e;
        }
        
        @k0
        public String d() {
            return this.d;
        }
        
        public int e() {
            return this.b;
        }
        
        public boolean f() {
            return this.c;
        }
    }
    
    public static final class e implements a
    {
        @j0
        private final d a;
        private final int b;
        private final int c;
        @k0
        private final String d;
        
        public e(@j0 final d d, final int n, final int n2) {
            this(d, n, n2, null);
        }
        
        @t0({ t0.a.G })
        public e(@j0 final d a, final int c, final int b, @k0 final String d) {
            this.a = a;
            this.c = c;
            this.b = b;
            this.d = d;
        }
        
        public int a() {
            return this.c;
        }
        
        @j0
        public d b() {
            return this.a;
        }
        
        @k0
        @t0({ t0.a.G })
        public String c() {
            return this.d;
        }
        
        public int d() {
            return this.b;
        }
    }
}
