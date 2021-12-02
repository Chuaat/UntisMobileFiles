// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.view.View$OnClickListener;
import android.util.AttributeSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.d;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.graphics.RectF;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.TypedArray;
import android.util.Xml;
import java.io.PrintStream;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import androidx.constraintlayout.widget.j;
import android.content.Context;
import android.view.MotionEvent;
import android.util.SparseIntArray;
import java.util.HashMap;
import androidx.constraintlayout.widget.e;
import android.util.SparseArray;
import java.util.ArrayList;
import androidx.constraintlayout.widget.m;

public class u
{
    private static final int A = -1;
    private static final int B = -2;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    private static final String F = "MotionScene";
    private static final String G = "Transition";
    private static final String H = "OnSwipe";
    private static final String I = "OnClick";
    private static final String J = "StateSet";
    private static final String K = "Include";
    private static final String L = "include";
    private static final String M = "KeyFrameSet";
    private static final String N = "ConstraintSet";
    private static final String O = "ViewTransition";
    static final int P = 0;
    static final int Q = 1;
    static final int R = 2;
    static final int S = 3;
    static final int T = 4;
    static final int U = 5;
    static final int V = 6;
    private static final String v = "MotionScene";
    private static final boolean w = false;
    private static final int x = 8;
    static final int y = 0;
    static final int z = 1;
    private final s a;
    m b;
    b c;
    private boolean d;
    private ArrayList<b> e;
    private b f;
    private ArrayList<b> g;
    private SparseArray<e> h;
    private HashMap<String, Integer> i;
    private SparseIntArray j;
    private boolean k;
    private int l;
    private int m;
    private MotionEvent n;
    private boolean o;
    private boolean p;
    private s.i q;
    private boolean r;
    final c0 s;
    float t;
    float u;
    
    u(final Context context, final s a, int t1) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = new ArrayList<b>();
        this.f = null;
        this.g = new ArrayList<b>();
        this.h = (SparseArray<e>)new SparseArray();
        this.i = new HashMap<String, Integer>();
        this.j = new SparseIntArray();
        this.k = false;
        this.l = 400;
        this.m = 0;
        this.o = false;
        this.p = false;
        this.a = a;
        this.s = new c0(a);
        this.V(context, t1);
        final SparseArray<e> h = this.h;
        t1 = androidx.constraintlayout.widget.j.g.T1;
        h.put(t1, (Object)new e());
        this.i.put("motion_base", t1);
    }
    
    public u(final s a) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = new ArrayList<b>();
        this.f = null;
        this.g = new ArrayList<b>();
        this.h = (SparseArray<e>)new SparseArray();
        this.i = new HashMap<String, Integer>();
        this.j = new SparseIntArray();
        this.k = false;
        this.l = 400;
        this.m = 0;
        this.o = false;
        this.p = false;
        this.a = a;
        this.s = new c0(a);
    }
    
    static String A(final Context context, final int n, final XmlPullParser xmlPullParser) {
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(c.i(context, n));
        sb.append(".xml:");
        sb.append(xmlPullParser.getLineNumber());
        sb.append(") \"");
        sb.append(xmlPullParser.getName());
        sb.append("\"");
        return sb.toString();
    }
    
    private int G(final int n) {
        final m b = this.b;
        if (b != null) {
            final int e = b.e(n, -1, -1);
            if (e != -1) {
                return e;
            }
        }
        return n;
    }
    
    private boolean R(final int n) {
        for (int i = this.j.get(n), size = this.j.size(); i > 0; i = this.j.get(i), --size) {
            if (i == n) {
                return true;
            }
            if (size < 0) {
                return true;
            }
        }
        return false;
    }
    
    private boolean T() {
        return this.q != null;
    }
    
    private void V(final Context context, final int n) {
        final XmlResourceParser xml = context.getResources().getXml(n);
        b b = null;
        try {
            int n2 = ((XmlPullParser)xml).getEventType();
            while (true) {
                final int n3 = 1;
                if (n2 == 1) {
                    break;
                }
                b o;
                if (n2 != 0) {
                    if (n2 != 2) {
                        o = b;
                    }
                    else {
                        final String name = ((XmlPullParser)xml).getName();
                        if (this.k) {
                            final PrintStream out = System.out;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("parsing = ");
                            sb.append(name);
                            out.println(sb.toString());
                        }
                        int n4 = 0;
                        Label_0375: {
                            switch (name.hashCode()) {
                                case 1942574248: {
                                    if (name.equals("include")) {
                                        n4 = 6;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 1382829617: {
                                    if (name.equals("StateSet")) {
                                        n4 = 4;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 793277014: {
                                    if (name.equals("MotionScene")) {
                                        n4 = 0;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 327855227: {
                                    if (name.equals("OnSwipe")) {
                                        n4 = 2;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 312750793: {
                                    if (name.equals("OnClick")) {
                                        n4 = 3;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 269306229: {
                                    if (name.equals("Transition")) {
                                        n4 = n3;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case 61998586: {
                                    if (name.equals("ViewTransition")) {
                                        n4 = 9;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case -687739768: {
                                    if (name.equals("Include")) {
                                        n4 = 7;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case -1239391468: {
                                    if (name.equals("KeyFrameSet")) {
                                        n4 = 8;
                                        break Label_0375;
                                    }
                                    break;
                                }
                                case -1349929691: {
                                    if (name.equals("ConstraintSet")) {
                                        n4 = 5;
                                        break Label_0375;
                                    }
                                    break;
                                }
                            }
                            n4 = -1;
                        }
                        switch (n4) {
                            default: {
                                o = b;
                                break;
                            }
                            case 9: {
                                this.s.b(new b0(context, (XmlPullParser)xml));
                                o = b;
                                break;
                            }
                            case 8: {
                                final i e = new i(context, (XmlPullParser)xml);
                                o = b;
                                if (b != null) {
                                    b.k.add(e);
                                    o = b;
                                    break;
                                }
                                break;
                            }
                            case 6:
                            case 7: {
                                this.b0(context, (XmlPullParser)xml);
                                o = b;
                                break;
                            }
                            case 5: {
                                this.Z(context, (XmlPullParser)xml);
                                o = b;
                                break;
                            }
                            case 4: {
                                this.b = new m(context, (XmlPullParser)xml);
                                o = b;
                                break;
                            }
                            case 3: {
                                o = b;
                                if (b != null) {
                                    b.v(context, (XmlPullParser)xml);
                                    o = b;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (b == null) {
                                    final String resourceEntryName = context.getResources().getResourceEntryName(n);
                                    final int lineNumber = ((XmlPullParser)xml).getLineNumber();
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(" OnSwipe (");
                                    sb2.append(resourceEntryName);
                                    sb2.append(".xml:");
                                    sb2.append(lineNumber);
                                    sb2.append(")");
                                    Log.v("MotionScene", sb2.toString());
                                }
                                if ((o = b) != null) {
                                    b.l = new x(context, this.a, (XmlPullParser)xml);
                                    o = b;
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                final ArrayList<b> e2 = this.e;
                                o = new b(this, context, (XmlPullParser)xml);
                                e2.add(o);
                                if (this.c == null && !o.b) {
                                    this.c = o;
                                    if (o.l != null) {
                                        this.c.l.C(this.r);
                                    }
                                }
                                if (o.b) {
                                    if (o.c == -1) {
                                        this.f = o;
                                    }
                                    else {
                                        this.g.add(o);
                                    }
                                    this.e.remove(o);
                                }
                                break;
                            }
                            case 0: {
                                this.c0(context, (XmlPullParser)xml);
                                o = b;
                                break;
                            }
                        }
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                    o = b;
                }
                n2 = ((XmlPullParser)xml).next();
                b = o;
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    private int Z(final Context context, final XmlPullParser xmlPullParser) {
        final e e = new e();
        e.a1(false);
        final int attributeCount = xmlPullParser.getAttributeCount();
        int n = 0;
        int v = -1;
        int v2 = -1;
        while (true) {
            int n2 = 1;
            if (n >= attributeCount) {
                break;
            }
            final String attributeName = xmlPullParser.getAttributeName(n);
            final String attributeValue = xmlPullParser.getAttributeValue(n);
            if (this.k) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("id string = ");
                sb.append(attributeValue);
                out.println(sb.toString());
            }
            attributeName.hashCode();
            Label_0209: {
                switch (attributeName) {
                    case "id": {
                        n2 = 2;
                        break Label_0209;
                    }
                    case "deriveConstraintsFrom": {
                        break Label_0209;
                    }
                    case "ConstraintRotate": {
                        n2 = 0;
                        break Label_0209;
                    }
                    default:
                        break;
                }
                n2 = -1;
            }
            switch (n2) {
                case 2: {
                    v = this.v(context, attributeValue);
                    this.i.put(q0(attributeValue), v);
                    e.b = androidx.constraintlayout.motion.widget.c.i(context, v);
                    break;
                }
                case 1: {
                    v2 = this.v(context, attributeValue);
                    break;
                }
                case 0: {
                    e.d = Integer.parseInt(attributeValue);
                    break;
                }
            }
            ++n;
        }
        if (v != -1) {
            if (this.a.O0 != 0) {
                e.z1(true);
            }
            e.x0(context, xmlPullParser);
            if (v2 != -1) {
                this.j.put(v, v2);
            }
            this.h.put(v, (Object)e);
        }
        return v;
    }
    
    private int a0(final Context context, int i) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                name = ((XmlPullParser)xml).getName();
                if (2 == i && "ConstraintSet".equals(name)) {
                    return this.Z(context, (XmlPullParser)xml);
                }
            }
            return -1;
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
        return -1;
    }
    
    private void b0(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.m.vo);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.j.m.wo) {
                this.a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private void c0(final Context context, final XmlPullParser xmlPullParser) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.j.m.hk);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.j.m.ik) {
                if ((this.l = obtainStyledAttributes.getInt(index, this.l)) < 8) {
                    this.l = 8;
                }
            }
            else if (index == androidx.constraintlayout.widget.j.m.jk) {
                this.m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private void g0(int value, final s s) {
        final e e = (e)this.h.get(value);
        e.c = e.b;
        value = this.j.get(value);
        if (value > 0) {
            this.g0(value, s);
            final e e2 = (e)this.h.get(value);
            if (e2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(androidx.constraintlayout.motion.widget.c.i(this.a.getContext(), value));
                Log.e("MotionScene", sb.toString());
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(e.c);
            sb2.append("/");
            sb2.append(e2.c);
            e.c = sb2.toString();
            e.J0(e2);
        }
        else {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(e.c);
            sb3.append("  layout");
            e.c = sb3.toString();
            e.I0(s);
        }
        e.q(e);
    }
    
    public static String q0(final String s) {
        if (s == null) {
            return "";
        }
        final int index = s.indexOf(47);
        if (index < 0) {
            return s;
        }
        return s.substring(index + 1);
    }
    
    private int v(final Context context, final String s) {
        int identifier;
        if (s.contains("/")) {
            final int i = identifier = context.getResources().getIdentifier(s.substring(s.indexOf(47) + 1), "id", context.getPackageName());
            if (this.k) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append("id getMap res = ");
                sb.append(i);
                out.println(sb.toString());
                identifier = i;
            }
        }
        else {
            identifier = -1;
        }
        int int1;
        if ((int1 = identifier) == -1) {
            if (s.length() > 1) {
                int1 = Integer.parseInt(s.substring(1));
            }
            else {
                Log.e("MotionScene", "error in parsing id");
                int1 = identifier;
            }
        }
        return int1;
    }
    
    private int w(final b b) {
        final int o = b.a;
        if (o != -1) {
            for (int i = 0; i < this.e.size(); ++i) {
                if (this.e.get(i).a == o) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }
    
    float B() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.i();
        }
        return 0.0f;
    }
    
    float C() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.j();
        }
        return 0.0f;
    }
    
    boolean D() {
        final b c = this.c;
        return c != null && c.l != null && this.c.l.k();
    }
    
    public float E(final View view, final int n) {
        return 0.0f;
    }
    
    float F(final float n, final float n2) {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.l(n, n2);
        }
        return 0.0f;
    }
    
    int H() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.m();
        }
        return 0;
    }
    
    float I() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.n();
        }
        return 0.0f;
    }
    
    float J() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.o();
        }
        return 0.0f;
    }
    
    float K() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.p();
        }
        return 0.0f;
    }
    
    float L() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.q();
        }
        return 0.0f;
    }
    
    public float M() {
        final b c = this.c;
        if (c != null) {
            return c.i;
        }
        return 0.0f;
    }
    
    int N() {
        final b c = this.c;
        if (c == null) {
            return -1;
        }
        return c.d;
    }
    
    public b O(final int n) {
        for (final b b : this.e) {
            if (b.a == n) {
                return b;
            }
        }
        return null;
    }
    
    int P(final int n) {
        final Iterator<b> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().d == n) {
                return 0;
            }
        }
        return 1;
    }
    
    public List<b> Q(int g) {
        g = this.G(g);
        final ArrayList<b> list = new ArrayList<b>();
        for (final b e : this.e) {
            if (e.d == g || e.c == g) {
                list.add(e);
            }
        }
        return list;
    }
    
    boolean S(final View view, final int n) {
        final b c = this.c;
        if (c == null) {
            return false;
        }
        final Iterator iterator = c.k.iterator();
        while (iterator.hasNext()) {
            final Iterator<f> iterator2 = iterator.next().d(view.getId()).iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().a == n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean U(final int n) {
        return this.s.h(n);
    }
    
    public int W(final String key) {
        final Integer n = this.i.get(key);
        if (n == null) {
            return 0;
        }
        return n;
    }
    
    public String X(final int n) {
        for (final Map.Entry<String, Integer> entry : this.i.entrySet()) {
            final Integer n2 = entry.getValue();
            if (n2 == null) {
                continue;
            }
            if (n2 == n) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    protected void Y(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    void d0(final float n, final float n2) {
        final b c = this.c;
        if (c != null && c.l != null) {
            this.c.l.v(n, n2);
        }
    }
    
    void e0(final float n, final float n2) {
        final b c = this.c;
        if (c != null && c.l != null) {
            this.c.l.w(n, n2);
        }
    }
    
    public void f(final s s, final int n) {
        for (final b b : this.e) {
            if (b.m.size() > 0) {
                final Iterator iterator2 = b.m.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().c(s);
                }
            }
        }
        for (final b b2 : this.g) {
            if (b2.m.size() > 0) {
                final Iterator iterator4 = b2.m.iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().c(s);
                }
            }
        }
        for (final b b3 : this.e) {
            if (b3.m.size() > 0) {
                final Iterator iterator6 = b3.m.iterator();
                while (iterator6.hasNext()) {
                    iterator6.next().a(s, n, b3);
                }
            }
        }
        for (final b b4 : this.g) {
            if (b4.m.size() > 0) {
                final Iterator iterator8 = b4.m.iterator();
                while (iterator8.hasNext()) {
                    iterator8.next().a(s, n, b4);
                }
            }
        }
    }
    
    void f0(final MotionEvent n, int w0, final s s) {
        final RectF rectF = new RectF();
        if (this.q == null) {
            this.q = this.a.T0();
        }
        this.q.e(n);
        Label_0395: {
            if (w0 != -1) {
                final int action = n.getAction();
                final boolean b = false;
                if (action == 0) {
                    this.t = n.getRawX();
                    this.u = n.getRawY();
                    this.n = n;
                    this.o = false;
                    if (this.c.l != null) {
                        final RectF g = this.c.l.g(this.a, rectF);
                        if (g != null && !g.contains(this.n.getX(), this.n.getY())) {
                            this.n = null;
                            this.o = true;
                            return;
                        }
                        final RectF r = this.c.l.r(this.a, rectF);
                        if (r != null && !r.contains(this.n.getX(), this.n.getY())) {
                            this.p = true;
                        }
                        else {
                            this.p = false;
                        }
                        this.c.l.z(this.t, this.u);
                    }
                    return;
                }
                if (action == 2) {
                    if (!this.o) {
                        final float n2 = n.getRawY() - this.u;
                        final float n3 = n.getRawX() - this.t;
                        if (n3 != 0.0 || n2 != 0.0) {
                            final MotionEvent n4 = this.n;
                            if (n4 != null) {
                                final b j = this.j(w0, n3, n2, n4);
                                if (j != null) {
                                    s.setTransition(j);
                                    final RectF r2 = this.c.l.r(this.a, rectF);
                                    boolean p3 = b;
                                    if (r2 != null) {
                                        p3 = b;
                                        if (!r2.contains(this.n.getX(), this.n.getY())) {
                                            p3 = true;
                                        }
                                    }
                                    this.p = p3;
                                    this.c.l.F(this.t, this.u);
                                }
                                break Label_0395;
                            }
                        }
                        return;
                    }
                }
            }
        }
        if (this.o) {
            return;
        }
        final b c = this.c;
        if (c != null && c.l != null && !this.p) {
            this.c.l.t(n, this.q, w0, this);
        }
        this.t = n.getRawX();
        this.u = n.getRawY();
        if (n.getAction() == 1) {
            final s.i q = this.q;
            if (q != null) {
                q.a();
                this.q = null;
                w0 = s.w0;
                if (w0 != -1) {
                    this.i(s, w0);
                }
            }
        }
    }
    
    public void g(final b b) {
        final int w = this.w(b);
        if (w == -1) {
            this.e.add(b);
        }
        else {
            this.e.set(w, b);
        }
    }
    
    public boolean h(final int n, final o o) {
        return this.s.e(n, o);
    }
    
    void h0(final s s) {
        for (int i = 0; i < this.h.size(); ++i) {
            final int key = this.h.keyAt(i);
            if (this.R(key)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            this.g0(key, s);
        }
    }
    
    boolean i(final s s, final int n) {
        if (this.T()) {
            return false;
        }
        if (this.d) {
            return false;
        }
        for (final b b : this.e) {
            if (b.n == 0) {
                continue;
            }
            final b c = this.c;
            if (c == b && c.L(2)) {
                continue;
            }
            if (n == b.d && (b.n == 4 || b.n == 2)) {
                final s.m j = androidx.constraintlayout.motion.widget.s.m.J;
                s.setState(j);
                s.setTransition(b);
                if (b.n == 4) {
                    s.h1();
                    s.setState(androidx.constraintlayout.motion.widget.s.m.H);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.I);
                }
                else {
                    s.setProgress(1.0f);
                    s.y0(true);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.H);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.I);
                    s.setState(j);
                    s.U0();
                }
                return true;
            }
            if (n == b.c && (b.n == 3 || b.n == 1)) {
                final s.m i = androidx.constraintlayout.motion.widget.s.m.J;
                s.setState(i);
                s.setTransition(b);
                if (b.n == 3) {
                    s.j1();
                    s.setState(androidx.constraintlayout.motion.widget.s.m.H);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.I);
                }
                else {
                    s.setProgress(0.0f);
                    s.y0(true);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.H);
                    s.setState(androidx.constraintlayout.motion.widget.s.m.I);
                    s.setState(i);
                    s.U0();
                }
                return true;
            }
        }
        return false;
    }
    
    public void i0(final b b) {
        final int w = this.w(b);
        if (w != -1) {
            this.e.remove(w);
        }
    }
    
    public b j(final int n, final float n2, final float n3, final MotionEvent motionEvent) {
        if (n != -1) {
            final List<b> q = this.Q(n);
            float n4 = 0.0f;
            b b = null;
            final RectF rectF = new RectF();
            for (final b b2 : q) {
                if (b2.o) {
                    continue;
                }
                if (b2.l == null) {
                    continue;
                }
                b2.l.C(this.r);
                final RectF r = b2.l.r(this.a, rectF);
                if (r != null && motionEvent != null && !r.contains(motionEvent.getX(), motionEvent.getY())) {
                    continue;
                }
                final RectF g = b2.l.g(this.a, rectF);
                if (g != null && motionEvent != null && !g.contains(motionEvent.getX(), motionEvent.getY())) {
                    continue;
                }
                float a = b2.l.a(n2, n3);
                if (b2.l.l) {
                    a = a;
                    if (motionEvent != null) {
                        final float n5 = motionEvent.getX() - b2.l.i;
                        final float n6 = motionEvent.getY() - b2.l.j;
                        a = (float)(Math.atan2(n3 + n6, n2 + n5) - Math.atan2(n5, n6)) * 10.0f;
                    }
                }
                float n7;
                if (b2.c == n) {
                    n7 = -1.0f;
                }
                else {
                    n7 = 1.1f;
                }
                final float n8 = a * n7;
                if (n8 <= n4) {
                    continue;
                }
                b = b2;
                n4 = n8;
            }
            return b;
        }
        return this.c;
    }
    
    public void j0(final int n, final e e) {
        this.h.put(n, (Object)e);
    }
    
    public void k(final boolean d) {
        this.d = d;
    }
    
    public void k0(final int l) {
        final b c = this.c;
        if (c != null) {
            c.O(l);
        }
        else {
            this.l = l;
        }
    }
    
    public void l(final int n, final boolean b) {
        this.s.f(n, b);
    }
    
    public void l0(final View view, final int n, final String s, final Object o) {
        final b c = this.c;
        if (c == null) {
            return;
        }
        final Iterator iterator = c.k.iterator();
        while (iterator.hasNext()) {
            final Iterator<f> iterator2 = iterator.next().d(view.getId()).iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().a == n) {
                    if (o != null) {
                        (float)o;
                    }
                    s.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }
    
    public int m() {
        final b c = this.c;
        int k;
        if (c != null) {
            k = c.p;
        }
        else {
            k = -1;
        }
        return k;
    }
    
    public void m0(final boolean r) {
        this.r = r;
        final b c = this.c;
        if (c != null && c.l != null) {
            this.c.l.C(this.r);
        }
    }
    
    int n() {
        final b c = this.c;
        if (c != null && c.l != null) {
            return this.c.l.e();
        }
        return 0;
    }
    
    void n0(final int n, final int n2) {
        final m b = this.b;
        int e = 0;
        int e2 = 0;
        Label_0065: {
            int n3;
            if (b != null) {
                e = b.e(n, -1, -1);
                if (e == -1) {
                    e = n;
                }
                e2 = this.b.e(n2, -1, -1);
                n3 = e;
                if (e2 != -1) {
                    break Label_0065;
                }
            }
            else {
                n3 = n;
            }
            e2 = n2;
            e = n3;
        }
        final b c = this.c;
        if (c != null && c.c == n2 && this.c.d == n) {
            return;
        }
        for (final b c2 : this.e) {
            if ((c2.c == e2 && c2.d == e) || (c2.c == n2 && c2.d == n)) {
                this.c = c2;
                if (c2 != null && c2.l != null) {
                    this.c.l.C(this.r);
                }
                return;
            }
        }
        b f = this.f;
        for (final b b2 : this.g) {
            if (b2.c == n2) {
                f = b2;
            }
        }
        final b b3 = new b(this, f);
        b3.d = e;
        b3.c = e2;
        if (e != -1) {
            this.e.add(b3);
        }
        this.c = b3;
    }
    
    e o(final int n) {
        return this.p(n, -1, -1);
    }
    
    public void o0(final b c) {
        this.c = c;
        if (c != null && c.l != null) {
            this.c.l.C(this.r);
        }
    }
    
    e p(final int i, int e, final int n) {
        if (this.k) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("id ");
            sb.append(i);
            out.println(sb.toString());
            final PrintStream out2 = System.out;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("size ");
            sb2.append(this.h.size());
            out2.println(sb2.toString());
        }
        final m b = this.b;
        int n2 = i;
        if (b != null) {
            e = b.e(i, e, n);
            n2 = i;
            if (e != -1) {
                n2 = e;
            }
        }
        Object o;
        if (this.h.get(n2) == null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Warning could not find ConstraintSet id/");
            sb3.append(androidx.constraintlayout.motion.widget.c.i(this.a.getContext(), n2));
            sb3.append(" In MotionScene");
            Log.e("MotionScene", sb3.toString());
            final SparseArray<e> h = this.h;
            o = h.get(h.keyAt(0));
        }
        else {
            o = this.h.get(n2);
        }
        return (e)o;
    }
    
    void p0() {
        final b c = this.c;
        if (c != null && c.l != null) {
            this.c.l.G();
        }
    }
    
    public e q(final Context context, final String s) {
        if (this.k) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("id ");
            sb.append(s);
            out.println(sb.toString());
            final PrintStream out2 = System.out;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("size ");
            sb2.append(this.h.size());
            out2.println(sb2.toString());
        }
        for (int i = 0; i < this.h.size(); ++i) {
            final int key = this.h.keyAt(i);
            final String resourceName = context.getResources().getResourceName(key);
            if (this.k) {
                final PrintStream out3 = System.out;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Id for <");
                sb3.append(i);
                sb3.append("> is <");
                sb3.append(resourceName);
                sb3.append("> looking for <");
                sb3.append(s);
                sb3.append(">");
                out3.println(sb3.toString());
            }
            if (s.equals(resourceName)) {
                return (e)this.h.get(key);
            }
        }
        return null;
    }
    
    public int[] r() {
        final int size = this.h.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.h.keyAt(i);
        }
        return array;
    }
    
    boolean r0() {
        final Iterator<b> iterator = this.e.iterator();
        do {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (hasNext) {
                continue;
            }
            final b c = this.c;
            if (c == null || c.l == null) {
                b = false;
            }
            return b;
        } while (iterator.next().l == null);
        return true;
    }
    
    public ArrayList<b> s() {
        return this.e;
    }
    
    public boolean s0(final s s) {
        return s == this.a && s.r0 == this;
    }
    
    public int t() {
        final b c = this.c;
        if (c != null) {
            return c.h;
        }
        return this.l;
    }
    
    public void t0(final int n, final View... array) {
        this.s.m(n, array);
    }
    
    int u() {
        final b c = this.c;
        if (c == null) {
            return -1;
        }
        return c.c;
    }
    
    public Interpolator x() {
        final int g = this.c.e;
        if (g == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (g == -1) {
            return (Interpolator)new Interpolator() {
                final /* synthetic */ d a = androidx.constraintlayout.core.motion.utils.d.c(androidx.constraintlayout.motion.widget.u.this.c.f);
                
                public float getInterpolation(final float n) {
                    return (float)this.a.a(n);
                }
            };
        }
        if (g == 0) {
            return (Interpolator)new AccelerateDecelerateInterpolator();
        }
        if (g == 1) {
            return (Interpolator)new AccelerateInterpolator();
        }
        if (g == 2) {
            return (Interpolator)new DecelerateInterpolator();
        }
        if (g == 4) {
            return (Interpolator)new BounceInterpolator();
        }
        if (g == 5) {
            return (Interpolator)new OvershootInterpolator();
        }
        if (g != 6) {
            return null;
        }
        return (Interpolator)new AnticipateInterpolator();
    }
    
    f y(final Context context, final int n, final int n2, final int n3) {
        final b c = this.c;
        if (c == null) {
            return null;
        }
        for (final i i : c.k) {
            for (final Integer n4 : i.e()) {
                if (n2 == n4) {
                    for (final f f : i.d(n4)) {
                        if (f.a == n3 && f.d == n) {
                            return f;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public void z(final o o) {
        final b c = this.c;
        if (c == null) {
            final b f = this.f;
            if (f != null) {
                final Iterator iterator = f.k.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(o);
                }
            }
            return;
        }
        final Iterator iterator2 = c.k.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().b(o);
        }
    }
    
    public static class b
    {
        public static final int s = 0;
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 4;
        static final int x = 1;
        static final int y = 2;
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private String f;
        private int g;
        private int h;
        private float i;
        private final u j;
        private ArrayList<i> k;
        private x l;
        private ArrayList<a> m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;
        
        public b(final int a, final u j, final int d, final int c) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<i>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = a;
            this.j = j;
            this.d = d;
            this.c = c;
            this.h = j.l;
            this.q = j.m;
        }
        
        b(final u j, final Context context, final XmlPullParser xmlPullParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<i>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = j.l;
            this.q = j.m;
            this.y(this.j = j, context, Xml.asAttributeSet(xmlPullParser));
        }
        
        b(final u j, final b b) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<i>();
            this.l = null;
            this.m = new ArrayList<a>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = j;
            this.h = j.l;
            if (b != null) {
                this.p = b.p;
                this.e = b.e;
                this.f = b.f;
                this.g = b.g;
                this.h = b.h;
                this.k = b.k;
                this.i = b.i;
                this.q = b.q;
            }
        }
        
        private void x(final u u, final Context context, final TypedArray typedArray) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                e e;
                SparseArray sparseArray;
                int n;
                if (index == androidx.constraintlayout.widget.j.m.Cn) {
                    this.c = typedArray.getResourceId(index, -1);
                    final String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        e = new e();
                        e.w0(context, this.c);
                        sparseArray = u.h;
                        n = this.c;
                    }
                    else {
                        if ("xml".equals(resourceTypeName)) {
                            this.c = u.a0(context, this.c);
                        }
                        continue;
                    }
                }
                else if (index == androidx.constraintlayout.widget.j.m.Dn) {
                    this.d = typedArray.getResourceId(index, this.d);
                    final String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        e = new e();
                        e.w0(context, this.d);
                        sparseArray = u.h;
                        n = this.d;
                    }
                    else {
                        if ("xml".equals(resourceTypeName2)) {
                            this.d = u.a0(context, this.d);
                        }
                        continue;
                    }
                }
                else {
                    if (index == androidx.constraintlayout.widget.j.m.Gn) {
                        final int type = typedArray.peekValue(index).type;
                        if (type == 1) {
                            if ((this.g = typedArray.getResourceId(index, -1)) == -1) {
                                continue;
                            }
                        }
                        else {
                            if (type != 3) {
                                this.e = typedArray.getInteger(index, this.e);
                                continue;
                            }
                            final String string = typedArray.getString(index);
                            if ((this.f = string) == null) {
                                continue;
                            }
                            if (string.indexOf("/") <= 0) {
                                this.e = -1;
                                continue;
                            }
                            this.g = typedArray.getResourceId(index, -1);
                        }
                        this.e = -2;
                        continue;
                    }
                    if (index == androidx.constraintlayout.widget.j.m.En) {
                        if ((this.h = typedArray.getInt(index, this.h)) < 8) {
                            this.h = 8;
                        }
                        continue;
                    }
                    else {
                        if (index == androidx.constraintlayout.widget.j.m.In) {
                            this.i = typedArray.getFloat(index, this.i);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.Bn) {
                            this.n = typedArray.getInteger(index, this.n);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.An) {
                            this.a = typedArray.getResourceId(index, this.a);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.Jn) {
                            this.o = typedArray.getBoolean(index, this.o);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.Hn) {
                            this.p = typedArray.getInteger(index, -1);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.Fn) {
                            this.q = typedArray.getInteger(index, 0);
                            continue;
                        }
                        if (index == androidx.constraintlayout.widget.j.m.Kn) {
                            this.r = typedArray.getInteger(index, 0);
                        }
                        continue;
                    }
                }
                sparseArray.append(n, (Object)e);
            }
            if (this.d == -1) {
                this.b = true;
            }
        }
        
        private void y(final u u, final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.zn);
            this.x(u, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
        
        public int A() {
            return this.h;
        }
        
        public int B() {
            return this.c;
        }
        
        public int C() {
            return this.a;
        }
        
        public List<i> D() {
            return this.k;
        }
        
        public int E() {
            return this.q;
        }
        
        public List<a> F() {
            return this.m;
        }
        
        public int G() {
            return this.p;
        }
        
        public float H() {
            return this.i;
        }
        
        public int I() {
            return this.d;
        }
        
        public x J() {
            return this.l;
        }
        
        public boolean K() {
            return this.o ^ true;
        }
        
        public boolean L(final int n) {
            return (n & this.r) != 0x0;
        }
        
        public void M(final int n) {
            while (true) {
                for (final a o : this.m) {
                    if (o.H == n) {
                        if (o != null) {
                            this.m.remove(o);
                        }
                        return;
                    }
                }
                a o = null;
                continue;
            }
        }
        
        public void N(final int n) {
            this.n = n;
        }
        
        public void O(final int a) {
            this.h = Math.max(a, 8);
        }
        
        public void P(final boolean b) {
            this.Q(b);
        }
        
        public void Q(final boolean b) {
            this.o = (b ^ true);
        }
        
        public void R(final int e, final String f, final int g) {
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public void S(final int q) {
            this.q = q;
        }
        
        public void T(final v v) {
            x l;
            if (v == null) {
                l = null;
            }
            else {
                l = new x(this.j.a, v);
            }
            this.l = l;
        }
        
        public void U(final int n) {
            final x j = this.J();
            if (j != null) {
                j.E(n);
            }
        }
        
        public void V(final int p) {
            this.p = p;
        }
        
        public void W(final float i) {
            this.i = i;
        }
        
        public void X(final int r) {
            this.r = r;
        }
        
        public void t(final i e) {
            this.k.add(e);
        }
        
        public void u(final int n, final int i) {
            for (final a a : this.m) {
                if (a.H == n) {
                    a.I = i;
                    return;
                }
            }
            this.m.add(new a(this, n, i));
        }
        
        public void v(final Context context, final XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }
        
        public String w(final Context context) {
            String resourceEntryName;
            if (this.d == -1) {
                resourceEntryName = "null";
            }
            else {
                resourceEntryName = context.getResources().getResourceEntryName(this.d);
            }
            String s;
            if (this.c == -1) {
                final StringBuilder sb = new StringBuilder();
                sb.append(resourceEntryName);
                sb.append(" -> null");
                s = sb.toString();
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(resourceEntryName);
                sb2.append(" -> ");
                sb2.append(context.getResources().getResourceEntryName(this.c));
                s = sb2.toString();
            }
            return s;
        }
        
        public int z() {
            return this.n;
        }
        
        public static class a implements View$OnClickListener
        {
            public static final int J = 1;
            public static final int K = 17;
            public static final int L = 16;
            public static final int M = 256;
            public static final int N = 4096;
            private final b G;
            int H;
            int I;
            
            public a(final Context context, final b g, final XmlPullParser xmlPullParser) {
                this.H = -1;
                this.I = 17;
                this.G = g;
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.m.ok);
                for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                    final int index = obtainStyledAttributes.getIndex(i);
                    if (index == j.m.qk) {
                        this.H = obtainStyledAttributes.getResourceId(index, this.H);
                    }
                    else if (index == j.m.pk) {
                        this.I = obtainStyledAttributes.getInt(index, this.I);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            
            public a(final b g, final int h, final int i) {
                this.H = -1;
                this.I = 17;
                this.G = g;
                this.H = h;
                this.I = i;
            }
            
            public void a(s viewById, final int n, final b b) {
                final int h = this.H;
                if (h != -1) {
                    viewById = (s)viewById.findViewById(h);
                }
                if (viewById == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("OnClick could not find id ");
                    sb.append(this.H);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                final int c = b.d;
                final int a = b.c;
                if (c == -1) {
                    ((View)viewById).setOnClickListener((View$OnClickListener)this);
                    return;
                }
                final int i = this.I;
                final boolean b2 = false;
                final boolean b3 = (i & 0x1) != 0x0 && n == c;
                final boolean b4 = (i & 0x100) != 0x0 && n == c;
                final boolean b5 = (i & 0x1) != 0x0 && n == c;
                final boolean b6 = (i & 0x10) != 0x0 && n == a;
                boolean b7 = b2;
                if ((i & 0x1000) != 0x0) {
                    b7 = b2;
                    if (n == a) {
                        b7 = true;
                    }
                }
                if (b5 | (b3 | b4) | b6 | b7) {
                    ((View)viewById).setOnClickListener((View$OnClickListener)this);
                }
            }
            
            boolean b(final b b, final s s) {
                final b g = this.G;
                final boolean b2 = true;
                boolean b3 = true;
                if (g == b) {
                    return true;
                }
                final int a = g.c;
                final int c = this.G.d;
                final int w0 = s.w0;
                if (c == -1) {
                    if (w0 == a) {
                        b3 = false;
                    }
                    return b3;
                }
                boolean b4 = b2;
                if (w0 != c) {
                    b4 = (w0 == a && b2);
                }
                return b4;
            }
            
            public void c(final s s) {
                final int h = this.H;
                if (h == -1) {
                    return;
                }
                final View viewById = s.findViewById(h);
                if (viewById == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" (*)  could not find id ");
                    sb.append(this.H);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                viewById.setOnClickListener((View$OnClickListener)null);
            }
            
            public void onClick(final View view) {
                final s d = this.G.j.a;
                if (!d.P0()) {
                    return;
                }
                if (this.G.d != -1) {
                    final b c = this.G.j.c;
                    final int i = this.I;
                    final int n = 0;
                    final boolean b = (i & 0x1) != 0x0 || (i & 0x100) != 0x0;
                    final boolean b2 = (i & 0x10) != 0x0 || (i & 0x1000) != 0x0;
                    boolean b3;
                    int n2;
                    if (b && b2) {
                        final b c2 = this.G.j.c;
                        final b g = this.G;
                        if (c2 != g) {
                            d.setTransition(g);
                        }
                        b3 = b2;
                        n2 = n;
                        if (d.getCurrentState() != d.getEndState()) {
                            if (d.getProgress() > 0.5f) {
                                b3 = b2;
                                n2 = n;
                            }
                            else {
                                b3 = false;
                                n2 = (b ? 1 : 0);
                            }
                        }
                    }
                    else {
                        n2 = (b ? 1 : 0);
                        b3 = b2;
                    }
                    if (this.b(c, d)) {
                        if (n2 != 0 && (this.I & 0x1) != 0x0) {
                            d.setTransition(this.G);
                            d.h1();
                        }
                        else if (b3 && (this.I & 0x10) != 0x0) {
                            d.setTransition(this.G);
                            d.j1();
                        }
                        else {
                            float progress;
                            if (n2 != 0 && (this.I & 0x100) != 0x0) {
                                d.setTransition(this.G);
                                progress = 1.0f;
                            }
                            else {
                                if (!b3 || (this.I & 0x1000) == 0x0) {
                                    return;
                                }
                                d.setTransition(this.G);
                                progress = 0.0f;
                            }
                            d.setProgress(progress);
                        }
                    }
                    return;
                }
                final int currentState = d.getCurrentState();
                if (currentState == -1) {
                    d.k1(this.G.c);
                    return;
                }
                final b transition = new b(this.G.j, this.G);
                transition.d = currentState;
                transition.c = this.G.c;
                d.setTransition(transition);
                d.h1();
            }
        }
    }
}
