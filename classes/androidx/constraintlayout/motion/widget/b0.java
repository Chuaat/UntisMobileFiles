// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.d;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.util.Xml;
import android.view.View;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import androidx.constraintlayout.widget.a;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import androidx.constraintlayout.widget.e;

public class b0
{
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    private static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    private static final int M = -1;
    private static final int N = -2;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final int R = 3;
    static final int S = 4;
    static final int T = 5;
    static final int U = 6;
    private static String x = "ViewTransition";
    public static final String y = "ViewTransition";
    public static final String z = "KeyFrameSet";
    e a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    int f;
    i g;
    e.a h;
    private int i;
    private int j;
    private int k;
    private String l;
    private int m;
    private String n;
    private int o;
    Context p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    
    b0(final Context p2, final XmlPullParser xmlPullParser) {
        this.c = -1;
        this.d = false;
        this.e = 0;
        this.i = -1;
        this.j = -1;
        this.m = 0;
        this.n = null;
        this.o = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.p = p2;
        try {
            for (int i = xmlPullParser.getEventType(); i != 1; i = xmlPullParser.next()) {
                if (i != 2) {
                    if (i == 3) {
                        if ("ViewTransition".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                else {
                    final String name = xmlPullParser.getName();
                    int n = 0;
                    Label_0268: {
                        switch (name.hashCode()) {
                            case 1791837707: {
                                if (name.equals("CustomAttribute")) {
                                    n = 3;
                                    break Label_0268;
                                }
                                break;
                            }
                            case 366511058: {
                                if (name.equals("CustomMethod")) {
                                    n = 4;
                                    break Label_0268;
                                }
                                break;
                            }
                            case 61998586: {
                                if (name.equals("ViewTransition")) {
                                    n = 0;
                                    break Label_0268;
                                }
                                break;
                            }
                            case -1239391468: {
                                if (name.equals("KeyFrameSet")) {
                                    n = 1;
                                    break Label_0268;
                                }
                                break;
                            }
                            case -1962203927: {
                                if (name.equals("ConstraintOverride")) {
                                    n = 2;
                                    break Label_0268;
                                }
                                break;
                            }
                        }
                        n = -1;
                    }
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3 && n != 4) {
                                    final String x = b0.x;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(androidx.constraintlayout.motion.widget.c.f());
                                    sb.append(" unknown tag ");
                                    sb.append(name);
                                    Log.e(x, sb.toString());
                                    final String x2 = b0.x;
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(".xml:");
                                    sb2.append(xmlPullParser.getLineNumber());
                                    Log.e(x2, sb2.toString());
                                }
                                else {
                                    androidx.constraintlayout.widget.a.j(p2, xmlPullParser, this.h.g);
                                }
                            }
                            else {
                                this.h = androidx.constraintlayout.widget.e.w(p2, xmlPullParser);
                            }
                        }
                        else {
                            this.g = new i(p2, xmlPullParser);
                        }
                    }
                    else {
                        this.n(p2, xmlPullParser);
                    }
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    private void n(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.m.fo);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.j.m.go) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            }
            else if (index == androidx.constraintlayout.widget.j.m.oo) {
                if (androidx.constraintlayout.motion.widget.s.c2) {
                    if ((this.k = obtainStyledAttributes.getResourceId(index, this.k)) != -1) {
                        continue;
                    }
                }
                else if (obtainStyledAttributes.peekValue(index).type != 3) {
                    this.k = obtainStyledAttributes.getResourceId(index, this.k);
                    continue;
                }
                this.l = obtainStyledAttributes.getString(index);
            }
            else if (index == androidx.constraintlayout.widget.j.m.po) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            }
            else if (index == androidx.constraintlayout.widget.j.m.so) {
                this.d = obtainStyledAttributes.getBoolean(index, this.d);
            }
            else if (index == androidx.constraintlayout.widget.j.m.qo) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            }
            else if (index == androidx.constraintlayout.widget.j.m.ko) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            }
            else if (index == androidx.constraintlayout.widget.j.m.to) {
                this.j = obtainStyledAttributes.getInt(index, this.j);
            }
            else if (index == androidx.constraintlayout.widget.j.m.uo) {
                this.f = obtainStyledAttributes.getInt(index, this.f);
            }
            else if (index == androidx.constraintlayout.widget.j.m.no) {
                final int type = obtainStyledAttributes.peekValue(index).type;
                if (type == 1) {
                    if ((this.o = obtainStyledAttributes.getResourceId(index, -1)) == -1) {
                        continue;
                    }
                }
                else {
                    if (type != 3) {
                        this.m = obtainStyledAttributes.getInteger(index, this.m);
                        continue;
                    }
                    final String string = obtainStyledAttributes.getString(index);
                    this.n = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.m = -1;
                        continue;
                    }
                    this.o = obtainStyledAttributes.getResourceId(index, -1);
                }
                this.m = -2;
            }
            else if (index == androidx.constraintlayout.widget.j.m.ro) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            }
            else if (index == androidx.constraintlayout.widget.j.m.jo) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            }
            else if (index == androidx.constraintlayout.widget.j.m.mo) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            }
            else if (index == androidx.constraintlayout.widget.j.m.lo) {
                this.t = obtainStyledAttributes.getResourceId(index, this.t);
            }
            else if (index == androidx.constraintlayout.widget.j.m.io) {
                this.v = obtainStyledAttributes.getResourceId(index, this.v);
            }
            else if (index == androidx.constraintlayout.widget.j.m.ho) {
                this.u = obtainStyledAttributes.getInteger(index, this.u);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private void v(final u.b b, final View view) {
        final int i = this.i;
        if (i != -1) {
            b.O(i);
        }
        b.V(this.e);
        b.R(this.m, this.n, this.o);
        final int id = view.getId();
        final i g = this.g;
        if (g != null) {
            final ArrayList<f> d = g.d(-1);
            final i j = new i();
            final Iterator<f> iterator = d.iterator();
            while (iterator.hasNext()) {
                j.c(iterator.next().b().k(id));
            }
            b.t(j);
        }
    }
    
    void b(final c0 c0, final s s, final View view) {
        final o o = new o(view);
        o.Q(view);
        this.g.a(o);
        o.Z(s.getWidth(), s.getHeight(), (float)this.i, System.nanoTime());
        new b(c0, o, this.i, this.j, this.c, this.f(s.getContext()), this.q, this.r);
    }
    
    void c(final c0 c0, final s s, int i, final e e, final View... array) {
        if (this.d) {
            return;
        }
        final int f = this.f;
        final int n = 0;
        if (f == 2) {
            this.b(c0, s, array[0]);
            return;
        }
        if (f == 1) {
            final int[] constraintSetIds = s.getConstraintSetIds();
            for (int j = 0; j < constraintSetIds.length; ++j) {
                final int n2 = constraintSetIds[j];
                if (n2 != i) {
                    final e f2 = s.F0(n2);
                    for (int length = array.length, k = 0; k < length; ++k) {
                        final e.a k2 = f2.k0(array[k].getId());
                        final e.a h = this.h;
                        if (h != null) {
                            h.h(k2);
                            k2.g.putAll(this.h.g);
                        }
                    }
                }
            }
        }
        final e e2 = new e();
        e2.I(e);
        for (int length2 = array.length, l = 0; l < length2; ++l) {
            final e.a k3 = e2.k0(array[l].getId());
            final e.a h2 = this.h;
            if (h2 != null) {
                h2.h(k3);
                k3.g.putAll(this.h.g);
            }
        }
        s.p1(i, e2);
        final int l2 = androidx.constraintlayout.widget.j.g.L3;
        s.p1(l2, e);
        s.F(l2, -1, -1);
        final u.b transition = new u.b(-1, s.r0, l2, i);
        int length3;
        for (length3 = array.length, i = n; i < length3; ++i) {
            this.v(transition, array[i]);
        }
        s.setTransition(transition);
        s.i1(new a0(this, array));
    }
    
    boolean d(final View view) {
        final int s = this.s;
        final boolean b = false;
        final boolean b2 = s == -1 || view.getTag(s) != null;
        final int t = this.t;
        final boolean b3 = t == -1 || view.getTag(t) == null;
        boolean b4 = b;
        if (b2) {
            b4 = b;
            if (b3) {
                b4 = true;
            }
        }
        return b4;
    }
    
    int e() {
        return this.b;
    }
    
    Interpolator f(final Context context) {
        final int m = this.m;
        if (m == -2) {
            return AnimationUtils.loadInterpolator(context, this.o);
        }
        if (m == -1) {
            return (Interpolator)new Interpolator() {
                final /* synthetic */ d a = androidx.constraintlayout.core.motion.utils.d.c(b0.this.n);
                
                public float getInterpolation(final float n) {
                    return (float)this.a.a(n);
                }
            };
        }
        if (m == 0) {
            return (Interpolator)new AccelerateDecelerateInterpolator();
        }
        if (m == 1) {
            return (Interpolator)new AccelerateInterpolator();
        }
        if (m == 2) {
            return (Interpolator)new DecelerateInterpolator();
        }
        if (m == 4) {
            return (Interpolator)new BounceInterpolator();
        }
        if (m == 5) {
            return (Interpolator)new OvershootInterpolator();
        }
        if (m != 6) {
            return null;
        }
        return (Interpolator)new AnticipateInterpolator();
    }
    
    public int g() {
        return this.u;
    }
    
    public int h() {
        return this.w;
    }
    
    public int i() {
        return this.v;
    }
    
    public int j() {
        return this.c;
    }
    
    boolean k() {
        return this.d ^ true;
    }
    
    boolean m(final View view) {
        if (view == null) {
            return false;
        }
        if (this.k == -1 && this.l == null) {
            return false;
        }
        if (!this.d(view)) {
            return false;
        }
        if (view.getId() == this.k) {
            return true;
        }
        if (this.l == null) {
            return false;
        }
        if (view.getLayoutParams() instanceof ConstraintLayout.b) {
            final String b0 = ((ConstraintLayout.b)view.getLayoutParams()).b0;
            if (b0 != null && b0.matches(this.l)) {
                return true;
            }
        }
        return false;
    }
    
    void o(final boolean b) {
        this.d = (b ^ true);
    }
    
    void p(final int b) {
        this.b = b;
    }
    
    public void q(final int u) {
        this.u = u;
    }
    
    public void r(final int w) {
        this.w = w;
    }
    
    public void s(final int v) {
        this.v = v;
    }
    
    public void t(final int c) {
        this.c = c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewTransition(");
        sb.append(androidx.constraintlayout.motion.widget.c.i(this.p, this.b));
        sb.append(")");
        return sb.toString();
    }
    
    boolean u(final int n) {
        final int c = this.c;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (c == 1) {
            if (n == 0) {
                b3 = true;
            }
            return b3;
        }
        if (c == 2) {
            boolean b4 = b;
            if (n == 1) {
                b4 = true;
            }
            return b4;
        }
        boolean b5 = b2;
        if (c == 3) {
            b5 = b2;
            if (n == 0) {
                b5 = true;
            }
        }
        return b5;
    }
    
    static class b
    {
        private final int a;
        private final int b;
        long c;
        o d;
        int e;
        int f;
        g g;
        c0 h;
        Interpolator i;
        boolean j;
        float k;
        float l;
        long m;
        Rect n;
        boolean o;
        
        b(final c0 h, final o d, final int e, final int f, final int n, final Interpolator i, final int a, final int b) {
            this.g = new g();
            this.j = false;
            this.n = new Rect();
            this.o = false;
            this.h = h;
            this.d = d;
            this.e = e;
            this.f = f;
            final long nanoTime = System.nanoTime();
            this.c = nanoTime;
            this.m = nanoTime;
            this.h.c(this);
            this.i = i;
            this.a = a;
            this.b = b;
            if (n == 3) {
                this.o = true;
            }
            float l;
            if (e == 0) {
                l = Float.MAX_VALUE;
            }
            else {
                l = 1.0f / e;
            }
            this.l = l;
            this.a();
        }
        
        void a() {
            if (this.j) {
                this.c();
            }
            else {
                this.b();
            }
        }
        
        void b() {
            final long nanoTime = System.nanoTime();
            final long m = this.m;
            this.m = nanoTime;
            final float k = this.k + (float)((nanoTime - m) * 1.0E-6) * this.l;
            this.k = k;
            if (k >= 1.0f) {
                this.k = 1.0f;
            }
            final Interpolator i = this.i;
            float n;
            if (i == null) {
                n = this.k;
            }
            else {
                n = i.getInterpolation(this.k);
            }
            final o d = this.d;
            final boolean l = d.L(d.b, n, nanoTime, this.g);
            if (this.k >= 1.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, (Object)System.nanoTime());
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, (Object)null);
                }
                if (!this.o) {
                    this.h.k(this);
                }
            }
            if (this.k < 1.0f || l) {
                this.h.g();
            }
        }
        
        void c() {
            final long nanoTime = System.nanoTime();
            final long m = this.m;
            this.m = nanoTime;
            final float k = this.k - (float)((nanoTime - m) * 1.0E-6) * this.l;
            this.k = k;
            if (k < 0.0f) {
                this.k = 0.0f;
            }
            final Interpolator i = this.i;
            float n;
            if (i == null) {
                n = this.k;
            }
            else {
                n = i.getInterpolation(this.k);
            }
            final o d = this.d;
            final boolean l = d.L(d.b, n, nanoTime, this.g);
            if (this.k <= 0.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, (Object)System.nanoTime());
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, (Object)null);
                }
                this.h.k(this);
            }
            if (this.k > 0.0f || l) {
                this.h.g();
            }
        }
        
        public void d(final int n, final float n2, final float n3) {
            if (n != 1) {
                if (n == 2) {
                    this.d.J().getHitRect(this.n);
                    if (!this.n.contains((int)n2, (int)n3) && !this.j) {
                        this.e(true);
                    }
                }
                return;
            }
            if (!this.j) {
                this.e(true);
            }
        }
        
        void e(final boolean j) {
            this.j = j;
            if (j) {
                final int f = this.f;
                if (f != -1) {
                    float l;
                    if (f == 0) {
                        l = Float.MAX_VALUE;
                    }
                    else {
                        l = 1.0f / f;
                    }
                    this.l = l;
                }
            }
            this.h.g();
            this.m = System.nanoTime();
        }
    }
}
