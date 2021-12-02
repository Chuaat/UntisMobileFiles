// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.util.Xml;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.Intent;
import org.xmlpull.v1.XmlPullParser;
import android.view.InflateException;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.HashMap;

class k
{
    private static final Class<?>[] e;
    private static final HashMap<String, Constructor> f;
    private static final String g = "intent";
    private static final String h = "extra";
    private final Context a;
    private final Object[] b;
    private l c;
    private String[] d;
    
    static {
        e = new Class[] { Context.class, AttributeSet.class };
        f = new HashMap<String, Constructor>();
    }
    
    public k(final Context a, final l l) {
        this.b = new Object[2];
        this.a = a;
        this.g(l);
    }
    
    private Preference a(@j0 final String s, @k0 final String[] array, final AttributeSet set) throws ClassNotFoundException, InflateException {
        Label_0219: {
            Constructor<?> constructor;
            if ((constructor = k.f.get(s)) != null) {
                break Label_0219;
            }
            try {
                final ClassLoader classLoader = this.a.getClassLoader();
                Class<?> forName2;
                if (array != null && array.length != 0) {
                    final int length = array.length;
                    final Class<?> clazz = null;
                    final ClassNotFoundException ex = null;
                    int n = 0;
                    Class<?> forName;
                    while (true) {
                        forName = clazz;
                        if (n < length) {
                            final String str = array[n];
                            try {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(s);
                                forName = Class.forName(sb.toString(), false, classLoader);
                            }
                            catch (ClassNotFoundException ex) {
                                ++n;
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                    if ((forName2 = forName) == null) {
                        if (ex == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(set.getPositionDescription());
                            sb2.append(": Error inflating class ");
                            sb2.append(s);
                            throw new InflateException(sb2.toString());
                        }
                        throw ex;
                    }
                }
                else {
                    forName2 = Class.forName(s, false, classLoader);
                }
                constructor = forName2.getConstructor(k.e);
                constructor.setAccessible(true);
                k.f.put(s, constructor);
                final Object[] b = this.b;
                b[1] = set;
                return (Preference)constructor.newInstance(b);
            }
            catch (Exception ex3) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(set.getPositionDescription());
                sb3.append(": Error inflating class ");
                sb3.append(s);
                final InflateException ex2 = new InflateException(sb3.toString());
                ex2.initCause((Throwable)ex3);
                throw ex2;
            }
            catch (ClassNotFoundException ex4) {
                throw ex4;
            }
        }
    }
    
    private Preference b(String o, final AttributeSet set) {
        try {
            if (-1 == ((String)o).indexOf(46)) {
                o = this.h((String)o, set);
            }
            else {
                o = this.a((String)o, null, set);
            }
            return (Preference)o;
        }
        catch (Exception ex2) {
            final StringBuilder sb = new StringBuilder();
            sb.append(set.getPositionDescription());
            sb.append(": Error inflating class ");
            sb.append((String)o);
            final InflateException ex = new InflateException(sb.toString());
            ex.initCause((Throwable)ex2);
            throw ex;
        }
        catch (ClassNotFoundException ex4) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(set.getPositionDescription());
            sb2.append(": Error inflating class (not found)");
            sb2.append((String)o);
            final InflateException ex3 = new InflateException(sb2.toString());
            ex3.initCause((Throwable)ex4);
            throw ex3;
        }
        catch (InflateException ex5) {
            throw ex5;
        }
    }
    
    private void g(final l c) {
        this.c = c;
        final StringBuilder sb = new StringBuilder();
        sb.append(Preference.class.getPackage().getName());
        sb.append(".");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(SwitchPreference.class.getPackage().getName());
        sb2.append(".");
        this.k(new String[] { string, sb2.toString() });
    }
    
    @j0
    private PreferenceGroup i(final PreferenceGroup preferenceGroup, @j0 final PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.E0(this.c);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }
    
    private void j(final XmlPullParser xmlPullParser, final Preference preference, final AttributeSet set) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        while (true) {
            final int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            if ("intent".equals(name)) {
                try {
                    preference.A1(Intent.parseIntent(this.c().getResources(), xmlPullParser, set));
                    continue;
                }
                catch (IOException ex2) {
                    final XmlPullParserException ex = new XmlPullParserException("Error parsing preference");
                    ex.initCause((Throwable)ex2);
                    throw ex;
                }
            }
            if ("extra".equals(name)) {
                this.c().getResources().parseBundleExtra("extra", set, preference.o());
                try {
                    l(xmlPullParser);
                    continue;
                }
                catch (IOException ex4) {
                    final XmlPullParserException ex3 = new XmlPullParserException("Error parsing preference");
                    ex3.initCause((Throwable)ex4);
                    throw ex3;
                }
            }
            final Preference b = this.b(name, set);
            ((PreferenceGroup)preference).i2(b);
            this.j(xmlPullParser, b, set);
        }
    }
    
    private static void l(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        final int depth = xmlPullParser.getDepth();
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 1 && (next != 3 || xmlPullParser.getDepth() > depth));
    }
    
    public Context c() {
        return this.a;
    }
    
    public String[] d() {
        return this.d;
    }
    
    public Preference e(final int n, @k0 final PreferenceGroup preferenceGroup) {
        final XmlResourceParser xml = this.c().getResources().getXml(n);
        try {
            return this.f((XmlPullParser)xml, preferenceGroup);
        }
        finally {
            xml.close();
        }
    }
    
    public Preference f(final XmlPullParser xmlPullParser, @k0 PreferenceGroup i) {
        synchronized (this.b) {
            final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
            this.b[0] = this.a;
            try {
                int next;
                do {
                    next = xmlPullParser.next();
                } while (next != 2 && next != 1);
                if (next == 2) {
                    i = this.i(i, (PreferenceGroup)this.b(xmlPullParser.getName(), attributeSet));
                    this.j(xmlPullParser, i, attributeSet);
                    return i;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": No start tag found!");
                throw new InflateException(sb.toString());
            }
            catch (IOException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(xmlPullParser.getPositionDescription());
                sb2.append(": ");
                sb2.append(ex.getMessage());
                final InflateException ex2 = new InflateException(sb2.toString());
                ex2.initCause((Throwable)ex);
                throw ex2;
            }
            catch (XmlPullParserException ex4) {
                final InflateException ex3 = new InflateException(ex4.getMessage());
                ex3.initCause((Throwable)ex4);
                throw ex3;
            }
            catch (InflateException ex5) {
                throw ex5;
            }
        }
    }
    
    protected Preference h(final String s, final AttributeSet set) throws ClassNotFoundException {
        return this.a(s, this.d, set);
    }
    
    public void k(final String[] d) {
        this.d = d;
    }
}
