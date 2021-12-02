// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.u0;
import android.content.res.TypedArray;
import android.view.SubMenu;
import androidx.core.view.p;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.Constructor;
import android.util.Log;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import o.a;
import androidx.annotation.e0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import androidx.core.view.b;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.t0;
import android.view.MenuInflater;

@t0({ t0.a.I })
public class g extends MenuInflater
{
    static final String e = "SupportMenuInflater";
    private static final String f = "menu";
    private static final String g = "group";
    private static final String h = "item";
    static final int i = 0;
    static final Class<?>[] j;
    static final Class<?>[] k;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;
    
    static {
        k = (j = new Class[] { Context.class });
    }
    
    public g(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    private Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    private void c(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) throws XmlPullParserException, IOException {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                int n = xmlPullParser.next();
                if ((i = n) == 1) {
                    String anObject = null;
                    int j = 0;
                    int n2 = 0;
                    while (j == 0) {
                        if (n == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n3;
                        int n4;
                        String name;
                        if (n != 2) {
                            if (n != 3) {
                                n3 = j;
                                n4 = n2;
                                name = anObject;
                            }
                            else {
                                final String name2 = xmlPullParser.getName();
                                if (n2 != 0 && name2.equals(anObject)) {
                                    name = null;
                                    n4 = 0;
                                    n3 = j;
                                }
                                else if (name2.equals("group")) {
                                    b.h();
                                    n3 = j;
                                    n4 = n2;
                                    name = anObject;
                                }
                                else if (name2.equals("item")) {
                                    n3 = j;
                                    n4 = n2;
                                    name = anObject;
                                    if (!b.d()) {
                                        final androidx.core.view.b a = b.A;
                                        if (a != null && a.b()) {
                                            b.b();
                                            n3 = j;
                                            n4 = n2;
                                            name = anObject;
                                        }
                                        else {
                                            b.a();
                                            n3 = j;
                                            n4 = n2;
                                            name = anObject;
                                        }
                                    }
                                }
                                else {
                                    n3 = j;
                                    n4 = n2;
                                    name = anObject;
                                    if (name2.equals("menu")) {
                                        n3 = 1;
                                        n4 = n2;
                                        name = anObject;
                                    }
                                }
                            }
                        }
                        else if (n2 != 0) {
                            n3 = j;
                            n4 = n2;
                            name = anObject;
                        }
                        else {
                            name = xmlPullParser.getName();
                            if (name.equals("group")) {
                                b.f(set);
                                n3 = j;
                                n4 = n2;
                                name = anObject;
                            }
                            else if (name.equals("item")) {
                                b.g(set);
                                n3 = j;
                                n4 = n2;
                                name = anObject;
                            }
                            else if (name.equals("menu")) {
                                this.c(xmlPullParser, set, (Menu)b.b());
                                n3 = j;
                                n4 = n2;
                                name = anObject;
                            }
                            else {
                                n4 = 1;
                                n3 = j;
                            }
                        }
                        final int next = xmlPullParser.next();
                        j = n3;
                        n2 = n4;
                        anObject = name;
                        n = next;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                final int n = xmlPullParser.next();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expecting menu, got ");
        sb.append(name3);
        throw new RuntimeException(sb.toString());
    }
    
    Object b() {
        if (this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }
    
    public void inflate(@e0 final int n, final Menu menu) {
        if (!(menu instanceof o.a)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser = layout = this.c.getResources().getLayout(n);
                this.c((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
            }
        }
        catch (IOException ex) {}
        catch (XmlPullParserException ex2) {}
    }
    
    private static class a implements MenuItem$OnMenuItemClickListener
    {
        private static final Class<?>[] I;
        private Object G;
        private Method H;
        
        static {
            I = new Class[] { MenuItem.class };
        }
        
        public a(final Object g, final String s) {
            this.G = g;
            final Class<?> class1 = g.getClass();
            try {
                this.H = class1.getMethod(s, a.I);
            }
            catch (Exception ex2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(s);
                sb.append(" in class ");
                sb.append(class1.getName());
                final InflateException ex = new InflateException(sb.toString());
                ex.initCause((Throwable)ex2);
                throw ex;
            }
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.H.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.H.invoke(this.G, menuItem);
                }
                this.H.invoke(this.G, menuItem);
                return true;
            }
            catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    private class b
    {
        private static final int G = 0;
        private static final int H = 0;
        private static final int I = 0;
        private static final int J = 0;
        private static final int K = 0;
        private static final boolean L = false;
        private static final boolean M = true;
        private static final boolean N = true;
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D;
        private PorterDuff$Mode E;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;
        
        public b(final Menu a) {
            this.D = null;
            this.E = null;
            this.a = a;
            this.h();
        }
        
        private char c(final String s) {
            if (s == null) {
                return '\0';
            }
            return s.charAt(0);
        }
        
        private <T> T e(final String s, final Class<?>[] parameterTypes, final Object[] initargs) {
            try {
                final Constructor<?> constructor = Class.forName(s, false, androidx.appcompat.view.g.this.c.getClassLoader()).getConstructor(parameterTypes);
                constructor.setAccessible(true);
                return (T)constructor.newInstance(initargs);
            }
            catch (Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(s);
                Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        
        private void i(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            final int r = this.r;
            boolean b = false;
            setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            final int v = this.v;
            if (v >= 0) {
                menuItem.setShowAsAction(v);
            }
            if (this.z != null) {
                if (androidx.appcompat.view.g.this.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(androidx.appcompat.view.g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof j) {
                    ((j)menuItem).w(true);
                }
                else if (menuItem instanceof k) {
                    ((k)menuItem).j(true);
                }
            }
            final String x = this.x;
            if (x != null) {
                menuItem.setActionView((View)this.e(x, androidx.appcompat.view.g.j, androidx.appcompat.view.g.this.a));
                b = true;
            }
            final int w = this.w;
            if (w > 0) {
                if (!b) {
                    menuItem.setActionView(w);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            final androidx.core.view.b a = this.A;
            if (a != null) {
                androidx.core.view.p.l(menuItem, a);
            }
            androidx.core.view.p.p(menuItem, this.B);
            androidx.core.view.p.w(menuItem, this.C);
            androidx.core.view.p.o(menuItem, this.n, this.o);
            androidx.core.view.p.s(menuItem, this.p, this.q);
            final PorterDuff$Mode e = this.E;
            if (e != null) {
                androidx.core.view.p.r(menuItem, e);
            }
            final ColorStateList d = this.D;
            if (d != null) {
                androidx.core.view.p.q(menuItem, d);
            }
        }
        
        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }
        
        public SubMenu b() {
            this.h = true;
            final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(addSubMenu.getItem());
            return addSubMenu;
        }
        
        public boolean d() {
            return this.h;
        }
        
        public void f(final AttributeSet set) {
            final TypedArray obtainStyledAttributes = androidx.appcompat.view.g.this.c.obtainStyledAttributes(set, c.a.n.f5);
            this.b = obtainStyledAttributes.getResourceId(c.a.n.h5, 0);
            this.c = obtainStyledAttributes.getInt(c.a.n.j5, 0);
            this.d = obtainStyledAttributes.getInt(c.a.n.k5, 0);
            this.e = obtainStyledAttributes.getInt(c.a.n.l5, 0);
            this.f = obtainStyledAttributes.getBoolean(c.a.n.i5, true);
            this.g = obtainStyledAttributes.getBoolean(c.a.n.g5, true);
            obtainStyledAttributes.recycle();
        }
        
        public void g(final AttributeSet set) {
            final u0 f = u0.F(androidx.appcompat.view.g.this.c, set, c.a.n.m5);
            this.i = f.u(c.a.n.p5, 0);
            this.j = ((f.o(c.a.n.s5, this.c) & 0xFFFF0000) | (f.o(c.a.n.t5, this.d) & 0xFFFF));
            this.k = f.x(c.a.n.u5);
            this.l = f.x(c.a.n.v5);
            this.m = f.u(c.a.n.n5, 0);
            this.n = this.c(f.w(c.a.n.w5));
            this.o = f.o(c.a.n.D5, 4096);
            this.p = this.c(f.w(c.a.n.x5));
            this.q = f.o(c.a.n.H5, 4096);
            final int y5 = c.a.n.y5;
            int r;
            if (f.C(y5)) {
                r = (f.a(y5, false) ? 1 : 0);
            }
            else {
                r = this.e;
            }
            this.r = r;
            this.s = f.a(c.a.n.q5, false);
            this.t = f.a(c.a.n.r5, this.f);
            this.u = f.a(c.a.n.o5, this.g);
            this.v = f.o(c.a.n.I5, -1);
            this.z = f.w(c.a.n.z5);
            this.w = f.u(c.a.n.A5, 0);
            this.x = f.w(c.a.n.C5);
            final String w = f.w(c.a.n.B5);
            this.y = w;
            final boolean b = w != null;
            if (b && this.w == 0 && this.x == null) {
                this.A = (androidx.core.view.b)this.e(w, androidx.appcompat.view.g.k, androidx.appcompat.view.g.this.b);
            }
            else {
                if (b) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = f.x(c.a.n.E5);
            this.C = f.x(c.a.n.J5);
            final int g5 = c.a.n.G5;
            if (f.C(g5)) {
                this.E = b0.e(f.o(g5, -1), this.E);
            }
            else {
                this.E = null;
            }
            final int f2 = c.a.n.F5;
            if (f.C(f2)) {
                this.D = f.d(f2);
            }
            else {
                this.D = null;
            }
            f.I();
            this.h = false;
        }
        
        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }
}
