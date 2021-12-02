// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.List;
import android.graphics.Rect;
import androidx.annotation.t0;
import androidx.annotation.y;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.InflateException;
import java.util.StringTokenizer;
import androidx.collection.m;
import androidx.collection.h;
import android.widget.ListView;
import androidx.core.view.j0;
import android.util.SparseArray;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.i;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import androidx.collection.a;

public abstract class g0 implements Cloneable
{
    private static final w A0;
    private static ThreadLocal<a<Animator, d>> B0;
    private static final String n0 = "Transition";
    static final boolean o0 = false;
    public static final int p0 = 1;
    private static final int q0 = 1;
    public static final int r0 = 2;
    public static final int s0 = 3;
    public static final int t0 = 4;
    private static final int u0 = 4;
    private static final String v0 = "instance";
    private static final String w0 = "name";
    private static final String x0 = "id";
    private static final String y0 = "itemId";
    private static final int[] z0;
    private String G;
    private long H;
    long I;
    private TimeInterpolator J;
    ArrayList<Integer> K;
    ArrayList<View> L;
    private ArrayList<String> M;
    private ArrayList<Class<?>> N;
    private ArrayList<Integer> O;
    private ArrayList<View> P;
    private ArrayList<Class<?>> Q;
    private ArrayList<String> R;
    private ArrayList<Integer> S;
    private ArrayList<View> T;
    private ArrayList<Class<?>> U;
    private o0 V;
    private o0 W;
    l0 X;
    private int[] Y;
    private ArrayList<n0> Z;
    private ArrayList<n0> a0;
    private ViewGroup b0;
    boolean c0;
    ArrayList<Animator> d0;
    private int e0;
    private boolean f0;
    private boolean g0;
    private ArrayList<h> h0;
    private ArrayList<Animator> i0;
    k0 j0;
    private f k0;
    private a<String, String> l0;
    private w m0;
    
    static {
        z0 = new int[] { 2, 1, 3, 4 };
        A0 = new w() {
            @Override
            public Path a(final float n, final float n2, final float n3, final float n4) {
                final Path path = new Path();
                path.moveTo(n, n2);
                path.lineTo(n3, n4);
                return path;
            }
        };
        g0.B0 = new ThreadLocal<a<Animator, d>>();
    }
    
    public g0() {
        this.G = this.getClass().getName();
        this.H = -1L;
        this.I = -1L;
        this.J = null;
        this.K = new ArrayList<Integer>();
        this.L = new ArrayList<View>();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = new o0();
        this.W = new o0();
        this.X = null;
        this.Y = androidx.transition.g0.z0;
        this.b0 = null;
        this.c0 = false;
        this.d0 = new ArrayList<Animator>();
        this.e0 = 0;
        this.f0 = false;
        this.g0 = false;
        this.h0 = null;
        this.i0 = new ArrayList<Animator>();
        this.m0 = androidx.transition.g0.A0;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public g0(final Context context, final AttributeSet set) {
        this.G = this.getClass().getName();
        this.H = -1L;
        this.I = -1L;
        this.J = null;
        this.K = new ArrayList<Integer>();
        this.L = new ArrayList<View>();
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = new o0();
        this.W = new o0();
        this.X = null;
        this.Y = androidx.transition.g0.z0;
        this.b0 = null;
        this.c0 = false;
        this.d0 = new ArrayList<Animator>();
        this.e0 = 0;
        this.f0 = false;
        this.g0 = false;
        this.h0 = null;
        this.i0 = new ArrayList<Animator>();
        this.m0 = androidx.transition.g0.A0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.c);
        final XmlResourceParser xmlResourceParser = (XmlResourceParser)set;
        final long n = i.k(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "duration", 1, -1);
        if (n >= 0L) {
            this.y0(n);
        }
        final long n2 = i.k(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "startDelay", 2, -1);
        if (n2 > 0L) {
            this.F0(n2);
        }
        final int l = i.l(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            this.A0((TimeInterpolator)AnimationUtils.loadInterpolator(context, l));
        }
        final String m = i.m(obtainStyledAttributes, (XmlPullParser)xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            this.B0(m0(m));
        }
        obtainStyledAttributes.recycle();
    }
    
    private ArrayList<Integer> B(final ArrayList<Integer> list, final int i, final boolean b) {
        ArrayList<Integer> list2 = list;
        if (i > 0) {
            final Integer value = i;
            if (b) {
                list2 = e.a(list, value);
            }
            else {
                list2 = e.b(list, value);
            }
        }
        return list2;
    }
    
    private static <T> ArrayList<T> C(final ArrayList<T> list, final T t, final boolean b) {
        ArrayList<T> list2 = list;
        if (t != null) {
            if (b) {
                list2 = e.a(list, t);
            }
            else {
                list2 = e.b(list, t);
            }
        }
        return list2;
    }
    
    private ArrayList<Class<?>> I(final ArrayList<Class<?>> list, final Class<?> clazz, final boolean b) {
        ArrayList<Class<?>> list2 = list;
        if (clazz != null) {
            if (b) {
                list2 = e.a(list, clazz);
            }
            else {
                list2 = e.b(list, clazz);
            }
        }
        return list2;
    }
    
    private ArrayList<View> J(final ArrayList<View> list, final View view, final boolean b) {
        ArrayList<View> list2 = list;
        if (view != null) {
            if (b) {
                list2 = e.a(list, view);
            }
            else {
                list2 = e.b(list, view);
            }
        }
        return list2;
    }
    
    private static a<Animator, d> V() {
        a<Animator, d> value;
        if ((value = g0.B0.get()) == null) {
            value = new a<Animator, d>();
            g0.B0.set(value);
        }
        return value;
    }
    
    private static boolean e0(final int n) {
        boolean b = true;
        if (n < 1 || n > 4) {
            b = false;
        }
        return b;
    }
    
    private void g(final a<View, n0> a, final a<View, n0> a2) {
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= a.size()) {
                break;
            }
            final n0 e = a.o(n2);
            if (this.f0(e.b)) {
                this.Z.add(e);
                this.a0.add(null);
            }
            ++n2;
        }
        while (i < a2.size()) {
            final n0 e2 = a2.o(i);
            if (this.f0(e2.b)) {
                this.a0.add(e2);
                this.Z.add(null);
            }
            ++i;
        }
    }
    
    private static boolean g0(final n0 n0, final n0 n2, final String s) {
        final Object value = n0.a.get(s);
        final Object value2 = n2.a.get(s);
        final boolean b = true;
        boolean b2;
        if (value == null && value2 == null) {
            b2 = false;
        }
        else {
            b2 = b;
            if (value != null) {
                if (value2 == null) {
                    b2 = b;
                }
                else {
                    b2 = (true ^ value.equals(value2));
                }
            }
        }
        return b2;
    }
    
    private void h0(final a<View, n0> a, final a<View, n0> a2, final SparseArray<View> sparseArray, final SparseArray<View> sparseArray2) {
        for (int size = sparseArray.size(), i = 0; i < size; ++i) {
            final View view = (View)sparseArray.valueAt(i);
            if (view != null && this.f0(view)) {
                final View view2 = (View)sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && this.f0(view2)) {
                    final n0 e = a.get(view);
                    final n0 e2 = a2.get(view2);
                    if (e != null && e2 != null) {
                        this.Z.add(e);
                        this.a0.add(e2);
                        a.remove(view);
                        a2.remove(view2);
                    }
                }
            }
        }
    }
    
    private static void i(final o0 o0, View view, final n0 n0) {
        o0.a.put(view, n0);
        final int id = view.getId();
        if (id >= 0) {
            if (o0.b.indexOfKey(id) >= 0) {
                o0.b.put(id, (Object)null);
            }
            else {
                o0.b.put(id, (Object)view);
            }
        }
        final String w0 = j0.w0(view);
        if (w0 != null) {
            if (o0.d.containsKey(w0)) {
                o0.d.put(w0, null);
            }
            else {
                o0.d.put(w0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                final long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (o0.c.m(itemIdAtPosition) >= 0) {
                    view = o0.c.j(itemIdAtPosition);
                    if (view != null) {
                        j0.O1(view, false);
                        o0.c.s(itemIdAtPosition, null);
                    }
                }
                else {
                    j0.O1(view, true);
                    o0.c.s(itemIdAtPosition, view);
                }
            }
        }
    }
    
    private void i0(final a<View, n0> a, final a<View, n0> a2) {
        for (int i = a.size() - 1; i >= 0; --i) {
            final View view = a.i(i);
            if (view != null && this.f0(view)) {
                final n0 e = a2.remove(view);
                if (e != null && this.f0(e.b)) {
                    this.Z.add(a.k(i));
                    this.a0.add(e);
                }
            }
        }
    }
    
    private static boolean j(final int[] array, final int n) {
        final int n2 = array[n];
        for (int i = 0; i < n; ++i) {
            if (array[i] == n2) {
                return true;
            }
        }
        return false;
    }
    
    private void j0(final a<View, n0> a, final a<View, n0> a2, final androidx.collection.h<View> h, final androidx.collection.h<View> h2) {
        for (int b = h.B(), i = 0; i < b; ++i) {
            final View view = h.C(i);
            if (view != null && this.f0(view)) {
                final View view2 = h2.j(h.r(i));
                if (view2 != null && this.f0(view2)) {
                    final n0 e = a.get(view);
                    final n0 e2 = a2.get(view2);
                    if (e != null && e2 != null) {
                        this.Z.add(e);
                        this.a0.add(e2);
                        a.remove(view);
                        a2.remove(view2);
                    }
                }
            }
        }
    }
    
    private void k0(final a<View, n0> a, final a<View, n0> a2, final a<String, View> a3, final a<String, View> a4) {
        for (int size = a3.size(), i = 0; i < size; ++i) {
            final View view = a3.o(i);
            if (view != null && this.f0(view)) {
                final View view2 = a4.get(a3.i(i));
                if (view2 != null && this.f0(view2)) {
                    final n0 e = a.get(view);
                    final n0 e2 = a2.get(view2);
                    if (e != null && e2 != null) {
                        this.Z.add(e);
                        this.a0.add(e2);
                        a.remove(view);
                        a2.remove(view2);
                    }
                }
            }
        }
    }
    
    private void l0(final o0 o0, final o0 o2) {
        final a<View, n0> a = new a<View, n0>(o0.a);
        final a<View, n0> a2 = new a<View, n0>(o2.a);
        int n = 0;
        while (true) {
            final int[] y = this.Y;
            if (n >= y.length) {
                break;
            }
            final int n2 = y[n];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            this.j0(a, a2, o0.c, o2.c);
                        }
                    }
                    else {
                        this.h0(a, a2, o0.b, o2.b);
                    }
                }
                else {
                    this.k0(a, a2, o0.d, o2.d);
                }
            }
            else {
                this.i0(a, a2);
            }
            ++n;
        }
        this.g(a, a2);
    }
    
    private static int[] m0(final String str) {
        final StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] array = new int[stringTokenizer.countTokens()];
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            final String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                array[n] = 3;
            }
            else if ("instance".equalsIgnoreCase(trim)) {
                array[n] = 1;
            }
            else if ("name".equalsIgnoreCase(trim)) {
                array[n] = 2;
            }
            else if ("itemId".equalsIgnoreCase(trim)) {
                array[n] = 4;
            }
            else {
                if (!trim.isEmpty()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown match type in matchOrder: '");
                    sb.append(trim);
                    sb.append("'");
                    throw new InflateException(sb.toString());
                }
                final int[] array2 = new int[array.length - 1];
                System.arraycopy(array, 0, array2, 0, n);
                --n;
                array = array2;
            }
            ++n;
        }
        return array;
    }
    
    private void n(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList<Integer> o = this.O;
        if (o != null && o.contains(id)) {
            return;
        }
        final ArrayList<View> p2 = this.P;
        if (p2 != null && p2.contains(view)) {
            return;
        }
        final ArrayList<Class<?>> q = this.Q;
        final int n = 0;
        if (q != null) {
            for (int size = q.size(), i = 0; i < size; ++i) {
                if (this.Q.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            final n0 n2 = new n0(view);
            if (b) {
                this.r(n2);
            }
            else {
                this.m(n2);
            }
            n2.c.add(this);
            this.q(n2);
            o0 o2;
            if (b) {
                o2 = this.V;
            }
            else {
                o2 = this.W;
            }
            i(o2, view, n2);
        }
        if (view instanceof ViewGroup) {
            final ArrayList<Integer> s = this.S;
            if (s != null && s.contains(id)) {
                return;
            }
            final ArrayList<View> t = this.T;
            if (t != null && t.contains(view)) {
                return;
            }
            final ArrayList<Class<?>> u = this.U;
            if (u != null) {
                for (int size2 = u.size(), j = 0; j < size2; ++j) {
                    if (this.U.get(j).isInstance(view)) {
                        return;
                    }
                }
            }
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int k = n; k < viewGroup.getChildCount(); ++k) {
                this.n(viewGroup.getChildAt(k), b);
            }
        }
    }
    
    private void v0(final Animator animator, final a<Animator, d> a) {
        if (animator != null) {
            animator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator o) {
                    a.remove(o);
                    androidx.transition.g0.this.d0.remove(o);
                }
                
                public void onAnimationStart(final Animator e) {
                    androidx.transition.g0.this.d0.add(e);
                }
            });
            this.l(animator);
        }
    }
    
    @androidx.annotation.j0
    public g0 A(@androidx.annotation.j0 final Class<?> clazz, final boolean b) {
        this.U = this.I(this.U, clazz, b);
        return this;
    }
    
    @androidx.annotation.j0
    public g0 A0(@androidx.annotation.k0 final TimeInterpolator j) {
        this.J = j;
        return this;
    }
    
    public void B0(final int... array) {
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length; ++i) {
                if (!e0(array[i])) {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
                if (j(array, i)) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
            this.Y = array.clone();
        }
        else {
            this.Y = androidx.transition.g0.z0;
        }
    }
    
    public void C0(@androidx.annotation.k0 final w w) {
        w a0 = w;
        if (w == null) {
            a0 = androidx.transition.g0.A0;
        }
        this.m0 = a0;
    }
    
    @androidx.annotation.j0
    public g0 D(@y final int n, final boolean b) {
        this.O = this.B(this.O, n, b);
        return this;
    }
    
    public void D0(@androidx.annotation.k0 final k0 j0) {
        this.j0 = j0;
    }
    
    @androidx.annotation.j0
    public g0 E(@androidx.annotation.j0 final View view, final boolean b) {
        this.P = this.J(this.P, view, b);
        return this;
    }
    
    g0 E0(final ViewGroup b0) {
        this.b0 = b0;
        return this;
    }
    
    @androidx.annotation.j0
    public g0 F(@androidx.annotation.j0 final Class<?> clazz, final boolean b) {
        this.Q = this.I(this.Q, clazz, b);
        return this;
    }
    
    @androidx.annotation.j0
    public g0 F0(final long h) {
        this.H = h;
        return this;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void G0() {
        if (this.e0 == 0) {
            final ArrayList<h> h0 = this.h0;
            if (h0 != null && h0.size() > 0) {
                final ArrayList list = (ArrayList)this.h0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    list.get(i).a(this);
                }
            }
            this.g0 = false;
        }
        ++this.e0;
    }
    
    @androidx.annotation.j0
    public g0 H(@androidx.annotation.j0 final String s, final boolean b) {
        this.R = C(this.R, s, b);
        return this;
    }
    
    String H0(String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(": ");
        String str2;
        str = (str2 = sb.toString());
        if (this.I != -1L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("dur(");
            sb2.append(this.I);
            sb2.append(") ");
            str2 = sb2.toString();
        }
        str = str2;
        if (this.H != -1L) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("dly(");
            sb3.append(this.H);
            sb3.append(") ");
            str = sb3.toString();
        }
        String string = str;
        if (this.J != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("interp(");
            sb4.append(this.J);
            sb4.append(") ");
            string = sb4.toString();
        }
        if (this.K.size() <= 0) {
            str = string;
            if (this.L.size() <= 0) {
                return str;
            }
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(string);
        sb5.append("tgts(");
        String str3 = sb5.toString();
        final int size = this.K.size();
        final int n = 0;
        str = str3;
        if (size > 0) {
            int index = 0;
            while (true) {
                str = str3;
                if (index >= this.K.size()) {
                    break;
                }
                str = str3;
                if (index > 0) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(str3);
                    sb6.append(", ");
                    str = sb6.toString();
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.K.get(index));
                str3 = sb7.toString();
                ++index;
            }
        }
        String str4 = str;
        if (this.L.size() > 0) {
            int index2 = n;
            while (true) {
                str4 = str;
                if (index2 >= this.L.size()) {
                    break;
                }
                String string2 = str;
                if (index2 > 0) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(str);
                    sb8.append(", ");
                    string2 = sb8.toString();
                }
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(string2);
                sb9.append(this.L.get(index2));
                str = sb9.toString();
                ++index2;
            }
        }
        final StringBuilder sb10 = new StringBuilder();
        sb10.append(str4);
        sb10.append(")");
        str = sb10.toString();
        return str;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    void L(final ViewGroup viewGroup) {
        final a<Animator, d> v = V();
        int i = v.size();
        if (viewGroup != null) {
            if (i != 0) {
                final j1 d = androidx.transition.y0.d((View)viewGroup);
                final a a = new a<Object, Object>(v);
                v.clear();
                --i;
                while (i >= 0) {
                    final d d2 = a.o(i);
                    if (d2.a != null && d != null && d.equals(d2.d)) {
                        ((Animator)a.i(i)).end();
                    }
                    --i;
                }
            }
        }
    }
    
    public long N() {
        return this.I;
    }
    
    @androidx.annotation.k0
    public Rect O() {
        final f k0 = this.k0;
        if (k0 == null) {
            return null;
        }
        return k0.a(this);
    }
    
    @androidx.annotation.k0
    public f P() {
        return this.k0;
    }
    
    @androidx.annotation.k0
    public TimeInterpolator Q() {
        return this.J;
    }
    
    n0 R(final View view, final boolean b) {
        final l0 x = this.X;
        if (x != null) {
            return x.R(view, b);
        }
        ArrayList<n0> list;
        if (b) {
            list = this.Z;
        }
        else {
            list = this.a0;
        }
        final n0 n0 = null;
        if (list == null) {
            return null;
        }
        final int size = list.size();
        final int n2 = -1;
        int index = 0;
        int index2;
        while (true) {
            index2 = n2;
            if (index >= size) {
                break;
            }
            final n0 n3 = list.get(index);
            if (n3 == null) {
                return null;
            }
            if (n3.b == view) {
                index2 = index;
                break;
            }
            ++index;
        }
        n0 n4 = n0;
        if (index2 >= 0) {
            ArrayList<n0> list2;
            if (b) {
                list2 = this.a0;
            }
            else {
                list2 = this.Z;
            }
            n4 = list2.get(index2);
        }
        return n4;
    }
    
    @androidx.annotation.j0
    public String S() {
        return this.G;
    }
    
    @androidx.annotation.j0
    public w T() {
        return this.m0;
    }
    
    @androidx.annotation.k0
    public k0 U() {
        return this.j0;
    }
    
    public long W() {
        return this.H;
    }
    
    @androidx.annotation.j0
    public List<Integer> X() {
        return this.K;
    }
    
    @androidx.annotation.k0
    public List<String> Y() {
        return this.M;
    }
    
    @androidx.annotation.k0
    public List<Class<?>> Z() {
        return this.N;
    }
    
    @androidx.annotation.j0
    public g0 a(@androidx.annotation.j0 final h e) {
        if (this.h0 == null) {
            this.h0 = new ArrayList<h>();
        }
        this.h0.add(e);
        return this;
    }
    
    @androidx.annotation.j0
    public List<View> a0() {
        return this.L;
    }
    
    @androidx.annotation.j0
    public g0 b(@y final int i) {
        if (i != 0) {
            this.K.add(i);
        }
        return this;
    }
    
    @androidx.annotation.k0
    public String[] b0() {
        return null;
    }
    
    @androidx.annotation.j0
    public g0 c(@androidx.annotation.j0 final View e) {
        this.L.add(e);
        return this;
    }
    
    @androidx.annotation.k0
    public n0 c0(@androidx.annotation.j0 final View view, final boolean b) {
        final l0 x = this.X;
        if (x != null) {
            return x.c0(view, b);
        }
        o0 o0;
        if (b) {
            o0 = this.V;
        }
        else {
            o0 = this.W;
        }
        return (n0)o0.a.get(view);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void cancel() {
        for (int i = this.d0.size() - 1; i >= 0; --i) {
            this.d0.get(i).cancel();
        }
        final ArrayList<h> h0 = this.h0;
        if (h0 != null && h0.size() > 0) {
            final ArrayList list = (ArrayList)this.h0.clone();
            for (int size = list.size(), j = 0; j < size; ++j) {
                list.get(j).d(this);
            }
        }
    }
    
    @androidx.annotation.j0
    public g0 d(@androidx.annotation.j0 final Class<?> e) {
        if (this.N == null) {
            this.N = new ArrayList<Class<?>>();
        }
        this.N.add(e);
        return this;
    }
    
    public boolean d0(@androidx.annotation.k0 final n0 n0, @androidx.annotation.k0 final n0 n2) {
        boolean b2;
        final boolean b = b2 = false;
        if (n0 != null) {
            b2 = b;
            if (n2 != null) {
                final String[] b3 = this.b0();
                if (b3 != null) {
                    final int length = b3.length;
                    int n3 = 0;
                    while (true) {
                        b2 = b;
                        if (n3 >= length) {
                            return b2;
                        }
                        if (g0(n0, n2, b3[n3])) {
                            break;
                        }
                        ++n3;
                    }
                }
                else {
                    final Iterator<String> iterator = n0.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!g0(n0, n2, iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    @androidx.annotation.j0
    public g0 f(@androidx.annotation.j0 final String e) {
        if (this.M == null) {
            this.M = new ArrayList<String>();
        }
        this.M.add(e);
        return this;
    }
    
    boolean f0(final View view) {
        final int id = view.getId();
        final ArrayList<Integer> o = this.O;
        if (o != null && o.contains(id)) {
            return false;
        }
        final ArrayList<View> p = this.P;
        if (p != null && p.contains(view)) {
            return false;
        }
        final ArrayList<Class<?>> q = this.Q;
        if (q != null) {
            for (int size = q.size(), i = 0; i < size; ++i) {
                if (this.Q.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.R != null && androidx.core.view.j0.w0(view) != null && this.R.contains(androidx.core.view.j0.w0(view))) {
            return false;
        }
        if (this.K.size() == 0 && this.L.size() == 0) {
            final ArrayList<Class<?>> n = this.N;
            if (n == null || n.isEmpty()) {
                final ArrayList<String> m = this.M;
                if (m == null || m.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.K.contains(id) || this.L.contains(view)) {
            return true;
        }
        final ArrayList<String> j = this.M;
        if (j != null && j.contains(androidx.core.view.j0.w0(view))) {
            return true;
        }
        if (this.N != null) {
            for (int k = 0; k < this.N.size(); ++k) {
                if (this.N.get(k).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void l(final Animator animator) {
        if (animator == null) {
            this.x();
        }
        else {
            if (this.N() >= 0L) {
                animator.setDuration(this.N());
            }
            if (this.W() >= 0L) {
                animator.setStartDelay(this.W() + animator.getStartDelay());
            }
            if (this.Q() != null) {
                animator.setInterpolator(this.Q());
            }
            animator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    androidx.transition.g0.this.x();
                    animator.removeListener((Animator$AnimatorListener)this);
                }
            });
            animator.start();
        }
    }
    
    public abstract void m(@androidx.annotation.j0 final n0 p0);
    
    @t0({ androidx.annotation.t0.a.I })
    public void n0(final View view) {
        if (!this.g0) {
            final a<Animator, d> v = V();
            int i = v.size();
            final j1 d = androidx.transition.y0.d(view);
            --i;
            while (i >= 0) {
                final d d2 = v.o(i);
                if (d2.a != null && d.equals(d2.d)) {
                    androidx.transition.a.b(v.i(i));
                }
                --i;
            }
            final ArrayList<h> h0 = this.h0;
            if (h0 != null && h0.size() > 0) {
                final ArrayList list = (ArrayList)this.h0.clone();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    list.get(j).b(this);
                }
            }
            this.f0 = true;
        }
    }
    
    void o0(final ViewGroup viewGroup) {
        this.Z = new ArrayList<n0>();
        this.a0 = new ArrayList<n0>();
        this.l0(this.V, this.W);
        final a<Animator, d> v = V();
        int i = v.size();
        final j1 d = androidx.transition.y0.d((View)viewGroup);
        --i;
        while (i >= 0) {
            final Animator animator = v.i(i);
            if (animator != null) {
                final d d2 = v.get(animator);
                if (d2 != null && d2.a != null && d.equals(d2.d)) {
                    final n0 c = d2.c;
                    final View a = d2.a;
                    final n0 c2 = this.c0(a, true);
                    n0 r;
                    final n0 n0 = r = this.R(a, (boolean)(1 != 0));
                    if (c2 == null && (r = n0) == null) {
                        r = this.W.a.get(a);
                    }
                    if ((c2 != null || r != null) && d2.e.d0(c, r)) {
                        if (!animator.isRunning() && !animator.isStarted()) {
                            v.remove(animator);
                        }
                        else {
                            animator.cancel();
                        }
                    }
                }
            }
            --i;
        }
        this.w(viewGroup, this.V, this.W, this.Z, this.a0);
        this.w0();
    }
    
    @androidx.annotation.j0
    public g0 p0(@androidx.annotation.j0 final h o) {
        final ArrayList<h> h0 = this.h0;
        if (h0 == null) {
            return this;
        }
        h0.remove(o);
        if (this.h0.size() == 0) {
            this.h0 = null;
        }
        return this;
    }
    
    void q(final n0 n0) {
        if (this.j0 != null && !n0.a.isEmpty()) {
            final String[] b = this.j0.b();
            if (b == null) {
                return;
            }
            final int n2 = 0;
            int i = 0;
            while (true) {
                while (i < b.length) {
                    if (!n0.a.containsKey(b[i])) {
                        final int n3 = n2;
                        if (n3 == 0) {
                            this.j0.a(n0);
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final int n3 = 1;
                continue;
            }
        }
    }
    
    @androidx.annotation.j0
    public g0 q0(@y final int i) {
        if (i != 0) {
            this.K.remove((Object)i);
        }
        return this;
    }
    
    public abstract void r(@androidx.annotation.j0 final n0 p0);
    
    @androidx.annotation.j0
    public g0 r0(@androidx.annotation.j0 final View o) {
        this.L.remove(o);
        return this;
    }
    
    void s(final ViewGroup viewGroup, final boolean b) {
        this.t(b);
        final int size = this.K.size();
        final int n = 0;
        Label_0301: {
            if (size > 0 || this.L.size() > 0) {
                final ArrayList<String> m = this.M;
                if (m == null || m.isEmpty()) {
                    final ArrayList<Class<?>> n2 = this.N;
                    if (n2 == null || n2.isEmpty()) {
                        for (int i = 0; i < this.K.size(); ++i) {
                            final View viewById = viewGroup.findViewById((int)this.K.get(i));
                            if (viewById != null) {
                                final n0 n3 = new n0(viewById);
                                if (b) {
                                    this.r(n3);
                                }
                                else {
                                    this.m(n3);
                                }
                                n3.c.add(this);
                                this.q(n3);
                                o0 o0;
                                if (b) {
                                    o0 = this.V;
                                }
                                else {
                                    o0 = this.W;
                                }
                                i(o0, viewById, n3);
                            }
                        }
                        for (int j = 0; j < this.L.size(); ++j) {
                            final View view = this.L.get(j);
                            final n0 n4 = new n0(view);
                            if (b) {
                                this.r(n4);
                            }
                            else {
                                this.m(n4);
                            }
                            n4.c.add(this);
                            this.q(n4);
                            o0 o2;
                            if (b) {
                                o2 = this.V;
                            }
                            else {
                                o2 = this.W;
                            }
                            i(o2, view, n4);
                        }
                        break Label_0301;
                    }
                }
            }
            this.n((View)viewGroup, b);
        }
        if (!b) {
            final a<String, String> l0 = this.l0;
            if (l0 != null) {
                final int size2 = l0.size();
                final ArrayList list = new ArrayList<View>(size2);
                int n5 = 0;
                int k;
                while (true) {
                    k = n;
                    if (n5 >= size2) {
                        break;
                    }
                    list.add(this.V.d.remove(this.l0.i(n5)));
                    ++n5;
                }
                while (k < size2) {
                    final View view2 = list.get(k);
                    if (view2 != null) {
                        this.V.d.put(this.l0.o(k), view2);
                    }
                    ++k;
                }
            }
        }
    }
    
    @androidx.annotation.j0
    public g0 s0(@androidx.annotation.j0 final Class<?> o) {
        final ArrayList<Class<?>> n = this.N;
        if (n != null) {
            n.remove(o);
        }
        return this;
    }
    
    void t(final boolean b) {
        o0 o0;
        if (b) {
            this.V.a.clear();
            this.V.b.clear();
            o0 = this.V;
        }
        else {
            this.W.a.clear();
            this.W.b.clear();
            o0 = this.W;
        }
        o0.c.b();
    }
    
    @androidx.annotation.j0
    public g0 t0(@androidx.annotation.j0 final String o) {
        final ArrayList<String> m = this.M;
        if (m != null) {
            m.remove(o);
        }
        return this;
    }
    
    @Override
    public String toString() {
        return this.H0("");
    }
    
    public g0 u() {
        try {
            final g0 g0 = (g0)super.clone();
            g0.i0 = new ArrayList<Animator>();
            g0.V = new o0();
            g0.W = new o0();
            g0.Z = null;
            g0.a0 = null;
            return g0;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void u0(final View view) {
        if (this.f0) {
            if (!this.g0) {
                final a<Animator, d> v = V();
                int i = v.size();
                final j1 d = androidx.transition.y0.d(view);
                --i;
                while (i >= 0) {
                    final d d2 = v.o(i);
                    if (d2.a != null && d.equals(d2.d)) {
                        androidx.transition.a.c(v.i(i));
                    }
                    --i;
                }
                final ArrayList<h> h0 = this.h0;
                if (h0 != null && h0.size() > 0) {
                    final ArrayList list = (ArrayList)this.h0.clone();
                    for (int size = list.size(), j = 0; j < size; ++j) {
                        list.get(j).e(this);
                    }
                }
            }
            this.f0 = false;
        }
    }
    
    @androidx.annotation.k0
    public Animator v(@androidx.annotation.j0 final ViewGroup viewGroup, @androidx.annotation.k0 final n0 n0, @androidx.annotation.k0 final n0 n2) {
        return null;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void w(final ViewGroup viewGroup, final o0 o0, final o0 o2, final ArrayList<n0> list, final ArrayList<n0> list2) {
        final a<Animator, d> v = V();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final int size = list.size();
        long b = Long.MAX_VALUE;
        long min;
        int n11;
        for (int i = 0; i < size; i = n11 + 1, b = min) {
            final n0 n0 = list.get(i);
            final n0 n2 = list2.get(i);
            n0 n3;
            if ((n3 = n0) != null) {
                n3 = n0;
                if (!n0.c.contains(this)) {
                    n3 = null;
                }
            }
            n0 n4;
            if ((n4 = n2) != null) {
                n4 = n2;
                if (!n2.c.contains(this)) {
                    n4 = null;
                }
            }
            if ((n3 != null || n4 != null) && (n3 == null || n4 == null || this.d0(n3, n4))) {
                Animator v2 = this.v(viewGroup, n3, n4);
                if (v2 != null) {
                    n0 n10;
                    View b4;
                    if (n4 != null) {
                        final View b2 = n4.b;
                        final String[] b3 = this.b0();
                        n0 n9 = null;
                        Label_0411: {
                            if (b3 != null && b3.length > 0) {
                                final n0 n5 = new n0(b2);
                                final n0 n6 = o2.a.get(b2);
                                int n7 = i;
                                if (n6 != null) {
                                    int n8 = 0;
                                    while (true) {
                                        n7 = i;
                                        if (n8 >= b3.length) {
                                            break;
                                        }
                                        n5.a.put(b3[n8], n6.a.get(b3[n8]));
                                        ++n8;
                                    }
                                }
                                i = n7;
                                for (int size2 = v.size(), j = 0; j < size2; ++j) {
                                    final d d = v.get(v.i(j));
                                    if (d.c != null && d.a == b2 && d.b.equals(this.S()) && d.c.equals(n5)) {
                                        v2 = null;
                                        n9 = n5;
                                        break Label_0411;
                                    }
                                }
                                n9 = n5;
                            }
                            else {
                                n9 = null;
                            }
                        }
                        n10 = n9;
                        b4 = b2;
                    }
                    else {
                        b4 = n3.b;
                        n10 = null;
                    }
                    min = b;
                    n11 = i;
                    if (v2 != null) {
                        final k0 j2 = this.j0;
                        min = b;
                        if (j2 != null) {
                            final long c = j2.c(viewGroup, this, n3, n4);
                            sparseIntArray.put(this.i0.size(), (int)c);
                            min = Math.min(c, b);
                        }
                        v.put(v2, new d(b4, this.S(), this, androidx.transition.y0.d((View)viewGroup), n10));
                        this.i0.add(v2);
                        n11 = i;
                    }
                    continue;
                }
            }
            min = b;
            n11 = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int k = 0; k < sparseIntArray.size(); ++k) {
                final Animator animator = this.i0.get(sparseIntArray.keyAt(k));
                animator.setStartDelay(sparseIntArray.valueAt(k) - b + animator.getStartDelay());
            }
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void w0() {
        this.G0();
        final a<Animator, d> v = V();
        for (final Animator animator : this.i0) {
            if (v.containsKey(animator)) {
                this.G0();
                this.v0(animator, v);
            }
        }
        this.i0.clear();
        this.x();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void x() {
        final int e0 = this.e0 - 1;
        this.e0 = e0;
        if (e0 == 0) {
            final ArrayList<h> h0 = this.h0;
            if (h0 != null && h0.size() > 0) {
                final ArrayList list = (ArrayList)this.h0.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    list.get(i).c(this);
                }
            }
            for (int j = 0; j < this.V.c.B(); ++j) {
                final View view = this.V.c.C(j);
                if (view != null) {
                    androidx.core.view.j0.O1(view, false);
                }
            }
            for (int k = 0; k < this.W.c.B(); ++k) {
                final View view2 = this.W.c.C(k);
                if (view2 != null) {
                    androidx.core.view.j0.O1(view2, false);
                }
            }
            this.g0 = true;
        }
    }
    
    void x0(final boolean c0) {
        this.c0 = c0;
    }
    
    @androidx.annotation.j0
    public g0 y(@y final int n, final boolean b) {
        this.S = this.B(this.S, n, b);
        return this;
    }
    
    @androidx.annotation.j0
    public g0 y0(final long i) {
        this.I = i;
        return this;
    }
    
    @androidx.annotation.j0
    public g0 z(@androidx.annotation.j0 final View view, final boolean b) {
        this.T = this.J(this.T, view, b);
        return this;
    }
    
    public void z0(@androidx.annotation.k0 final f k0) {
        this.k0 = k0;
    }
    
    private static class d
    {
        View a;
        String b;
        n0 c;
        j1 d;
        g0 e;
        
        d(final View a, final String b, final g0 e, final j1 d, final n0 c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    private static class e
    {
        static <T> ArrayList<T> a(final ArrayList<T> list, final T t) {
            ArrayList<T> list2 = list;
            if (list == null) {
                list2 = new ArrayList<T>();
            }
            if (!list2.contains(t)) {
                list2.add(t);
            }
            return list2;
        }
        
        static <T> ArrayList<T> b(final ArrayList<T> list, final T o) {
            ArrayList<T> list2 = list;
            if (list != null) {
                list.remove(o);
                list2 = list;
                if (list.isEmpty()) {
                    list2 = null;
                }
            }
            return list2;
        }
    }
    
    public abstract static class f
    {
        public abstract Rect a(@androidx.annotation.j0 final g0 p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface g {
    }
    
    public interface h
    {
        void a(@androidx.annotation.j0 final g0 p0);
        
        void b(@androidx.annotation.j0 final g0 p0);
        
        void c(@androidx.annotation.j0 final g0 p0);
        
        void d(@androidx.annotation.j0 final g0 p0);
        
        void e(@androidx.annotation.j0 final g0 p0);
    }
}
