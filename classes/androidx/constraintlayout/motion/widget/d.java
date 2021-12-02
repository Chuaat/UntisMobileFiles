// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import java.io.PrintStream;
import android.view.ViewGroup;
import android.view.View;
import androidx.constraintlayout.widget.e;
import android.util.Pair;
import java.util.HashMap;

public class d implements w
{
    private static final boolean g = false;
    private static final String h = "DesignTool";
    static final HashMap<Pair<Integer, Integer>, String> i;
    static final HashMap<String, String> j;
    private final s a;
    private u b;
    private String c;
    private String d;
    private int e;
    private int f;
    
    static {
        final HashMap<Pair<Integer, Integer>, String> hashMap = (HashMap<Pair<Integer, Integer>, String>)(i = new HashMap<Pair<Integer, Integer>, String>());
        final HashMap<String, String> hashMap2 = (HashMap<String, String>)(j = new HashMap<String, String>());
        final Integer value = 4;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value, (Object)value), "layout_constraintBottom_toBottomOf");
        final Integer value2 = 3;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value, (Object)value2), "layout_constraintBottom_toTopOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value2, (Object)value), "layout_constraintTop_toBottomOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value2, (Object)value2), "layout_constraintTop_toTopOf");
        final Integer value3 = 6;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value3, (Object)value3), "layout_constraintStart_toStartOf");
        final Integer value4 = 7;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value3, (Object)value4), "layout_constraintStart_toEndOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value4, (Object)value3), "layout_constraintEnd_toStartOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value4, (Object)value4), "layout_constraintEnd_toEndOf");
        final Integer value5 = 1;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value5, (Object)value5), "layout_constraintLeft_toLeftOf");
        final Integer value6 = 2;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value5, (Object)value6), "layout_constraintLeft_toRightOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value6, (Object)value6), "layout_constraintRight_toRightOf");
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value6, (Object)value5), "layout_constraintRight_toLeftOf");
        final Integer value7 = 5;
        hashMap.put((Pair<Integer, Integer>)Pair.create((Object)value7, (Object)value7), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }
    
    public d(final s a) {
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.a = a;
    }
    
    private static void j(int k, final e e, final View view, final HashMap<String, String> hashMap, final int i, final int j) {
        final String s = d.i.get(Pair.create((Object)i, (Object)j));
        final String s2 = hashMap.get(s);
        if (s2 != null) {
            final String key = d.j.get(s);
            if (key != null) {
                k = k(k, hashMap.get(key));
            }
            else {
                k = 0;
            }
            e.L(view.getId(), i, Integer.parseInt(s2), j, k);
        }
    }
    
    private static int k(final int n, final String s) {
        if (s == null) {
            return 0;
        }
        final int index = s.indexOf(100);
        if (index == -1) {
            return 0;
        }
        return (int)(Integer.valueOf(s.substring(0, index)) * n / 160.0f);
    }
    
    private static void l(final int n, final e e, final View view, final HashMap<String, String> hashMap) {
        final String s = hashMap.get("layout_editor_absoluteX");
        if (s != null) {
            e.W0(view.getId(), k(n, s));
        }
        final String s2 = hashMap.get("layout_editor_absoluteY");
        if (s2 != null) {
            e.X0(view.getId(), k(n, s2));
        }
    }
    
    private static void m(final e e, final View view, final HashMap<String, String> hashMap, final int n) {
        String key;
        if (n == 1) {
            key = "layout_constraintVertical_bias";
        }
        else {
            key = "layout_constraintHorizontal_bias";
        }
        final String s = hashMap.get(key);
        if (s != null) {
            if (n == 0) {
                e.f1(view.getId(), Float.parseFloat(s));
            }
            else if (n == 1) {
                e.A1(view.getId(), Float.parseFloat(s));
            }
        }
    }
    
    private static void n(int id, final e e, final View view, final HashMap<String, String> hashMap, final int n) {
        String key;
        if (n == 1) {
            key = "layout_height";
        }
        else {
            key = "layout_width";
        }
        final String s = hashMap.get(key);
        if (s != null) {
            int k = -2;
            if (!s.equalsIgnoreCase("wrap_content")) {
                k = k(id, s);
            }
            id = view.getId();
            if (n == 0) {
                e.W(id, k);
            }
            else {
                e.P(id, k);
            }
        }
    }
    
    public String A() {
        if (this.c != null && this.d != null) {
            final float y = this.y();
            if (y <= 0.01f) {
                return this.c;
            }
            if (y >= 0.99f) {
                return this.d;
            }
        }
        return this.c;
    }
    
    public boolean B() {
        return this.c != null && this.d != null;
    }
    
    public void C(final Object o, final String s, final Object o2) {
        if (o instanceof f) {
            ((f)o).j(s, o2);
            this.a.X0();
            this.a.J0 = true;
        }
    }
    
    public void D(final String s) {
        String c = s;
        if (s == null) {
            c = "motion_base";
        }
        if (this.c == c) {
            return;
        }
        this.c = c;
        this.d = null;
        final s a = this.a;
        if (a.r0 == null) {
            a.r0 = this.b;
        }
        final int s2 = a.S0(c);
        if ((this.e = s2) != 0) {
            if (s2 == this.a.getStartState()) {
                this.a.setProgress(0.0f);
            }
            else {
                if (s2 != this.a.getEndState()) {
                    this.a.k1(s2);
                }
                this.a.setProgress(1.0f);
            }
        }
        this.a.requestLayout();
    }
    
    public void E(final String c, final String d) {
        final s a = this.a;
        if (a.r0 == null) {
            a.r0 = this.b;
        }
        final int s0 = a.S0(c);
        final int s2 = this.a.S0(d);
        this.a.c1(s0, s2);
        this.e = s0;
        this.f = s2;
        this.c = c;
        this.d = d;
    }
    
    public void F(final Object key, final int n) {
        if (!(key instanceof View)) {
            return;
        }
        final o o = this.a.B0.get(key);
        if (o != null) {
            o.R(n);
            this.a.invalidate();
        }
    }
    
    @Override
    public long a() {
        return this.a.getTransitionTimeMs();
    }
    
    @Override
    public int b(int n, final String s, final Object o, final float[] array, final int n2, final float[] array2, final int n3) {
        final View key = (View)o;
        o o2;
        if (n != 0) {
            final s a = this.a;
            if (a.r0 == null) {
                return -1;
            }
            if (key == null || (o2 = a.B0.get(key)) == null) {
                return -1;
            }
        }
        else {
            o2 = null;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            n = this.a.r0.t() / 16;
            o2.f(array2, n);
            return n;
        }
        if (n == 2) {
            n = this.a.r0.t() / 16;
            o2.e(array2, null);
            return n;
        }
        if (n != 3) {
            return -1;
        }
        n = this.a.r0.t() / 16;
        return o2.l(s, array2, n3);
    }
    
    @Override
    public boolean c(final Object key, int n, final int n2, float y, final float n3) {
        if (!(key instanceof View)) {
            return false;
        }
        final s a = this.a;
        if (a.r0 != null) {
            final o o = a.B0.get(key);
            final s a2 = this.a;
            n = (int)(a2.E0 * 100.0f);
            if (o != null) {
                final u r0 = a2.r0;
                final View view = (View)key;
                if (r0.S(view, n)) {
                    final float y2 = o.y(2, y, n3);
                    y = o.y(5, y, n3);
                    this.a.r0.l0(view, n, "motion:percentX", y2);
                    this.a.r0.l0(view, n, "motion:percentY", y);
                    this.a.X0();
                    this.a.y0(true);
                    this.a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void d(final float progress) {
        final s a = this.a;
        if (a.r0 == null) {
            a.r0 = this.b;
        }
        a.setProgress(progress);
        this.a.y0(true);
        this.a.requestLayout();
        this.a.invalidate();
    }
    
    @Override
    public Boolean e(final Object o, final Object o2, final float n, final float n2, final String[] array, final float[] array2) {
        if (o instanceof k) {
            final k k = (k)o;
            final HashMap<View, o> b0 = this.a.B0;
            final View key = (View)o2;
            b0.get(key).N(key, k, n, n2, array, array2);
            this.a.X0();
            this.a.J0 = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    
    @Override
    public void f(final Object o, final int n, final String s, final Object o2) {
        final u r0 = this.a.r0;
        if (r0 != null) {
            r0.l0((View)o, n, s, o2);
            final s a = this.a;
            a.H0 = n / 100.0f;
            a.F0 = 0.0f;
            a.X0();
            this.a.y0(true);
        }
    }
    
    @Override
    public void g(final int n, final String s, final Object o, final Object o2) {
        final View view = (View)o;
        final HashMap hashMap = (HashMap)o2;
        final int s2 = this.a.S0(s);
        final e o3 = this.a.r0.o(s2);
        if (o3 == null) {
            return;
        }
        o3.E(view.getId());
        n(n, o3, view, hashMap, 0);
        n(n, o3, view, hashMap, 1);
        j(n, o3, view, hashMap, 6, 6);
        j(n, o3, view, hashMap, 6, 7);
        j(n, o3, view, hashMap, 7, 7);
        j(n, o3, view, hashMap, 7, 6);
        j(n, o3, view, hashMap, 1, 1);
        j(n, o3, view, hashMap, 1, 2);
        j(n, o3, view, hashMap, 2, 2);
        j(n, o3, view, hashMap, 2, 1);
        j(n, o3, view, hashMap, 3, 3);
        j(n, o3, view, hashMap, 3, 4);
        j(n, o3, view, hashMap, 4, 3);
        j(n, o3, view, hashMap, 4, 4);
        j(n, o3, view, hashMap, 5, 5);
        m(o3, view, hashMap, 0);
        m(o3, view, hashMap, 1);
        l(n, o3, view, hashMap);
        this.a.p1(s2, o3);
        this.a.requestLayout();
    }
    
    @Override
    public float h(final Object o, final int n, final float n2, final float n3) {
        if (!(o instanceof View)) {
            return 0.0f;
        }
        final o o2 = this.a.B0.get(o);
        if (o2 == null) {
            return 0.0f;
        }
        return o2.y(n, n2, n3);
    }
    
    @Override
    public Object i(final Object o, final float n, final float n2) {
        final View key = (View)o;
        final s a = this.a;
        if (a.r0 == null) {
            return -1;
        }
        if (key == null) {
            return null;
        }
        final o o2 = a.B0.get(key);
        if (o2 == null) {
            return null;
        }
        final ViewGroup viewGroup = (ViewGroup)key.getParent();
        return o2.B(viewGroup.getWidth(), viewGroup.getHeight(), n, n2);
    }
    
    public void o(final boolean b) {
        this.a.u0(b);
    }
    
    public void p(final String str) {
        final s a = this.a;
        if (a.r0 == null) {
            a.r0 = this.b;
        }
        final int s0 = a.S0(str);
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(" dumping  ");
        sb.append(str);
        sb.append(" (");
        sb.append(s0);
        sb.append(")");
        out.println(sb.toString());
        try {
            this.a.r0.o(s0).g0(this.a.r0, new int[0]);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int q(final Object key, final float[] array) {
        final u r0 = this.a.r0;
        if (r0 == null) {
            return -1;
        }
        final int n = r0.t() / 16;
        final o o = this.a.B0.get(key);
        if (o == null) {
            return 0;
        }
        o.e(array, null);
        return n;
    }
    
    public int r(final Object key, final float[] array, final int n) {
        final s a = this.a;
        if (a.r0 == null) {
            return -1;
        }
        final o o = a.B0.get(key);
        if (o == null) {
            return 0;
        }
        o.f(array, n);
        return n;
    }
    
    public void s(final Object key, final float[] array) {
        final u r0 = this.a.r0;
        if (r0 == null) {
            return;
        }
        final int n = r0.t() / 16;
        final o o = this.a.B0.get(key);
        if (o == null) {
            return;
        }
        o.h(array, n);
    }
    
    public String t() {
        final int endState = this.a.getEndState();
        if (this.f == endState) {
            return this.d;
        }
        final String g0 = this.a.G0(endState);
        if (g0 != null) {
            this.d = g0;
            this.f = endState;
        }
        return g0;
    }
    
    public int u(final Object o, final int n, final int[] array) {
        final o o2 = this.a.B0.get(o);
        if (o2 == null) {
            return 0;
        }
        return o2.x(n, array);
    }
    
    public int v(final Object o, final int[] array, final float[] array2) {
        final o o2 = this.a.B0.get(o);
        if (o2 == null) {
            return 0;
        }
        return o2.z(array, array2);
    }
    
    public Object w(final int n, final int n2, final int n3) {
        final s a = this.a;
        final u r0 = a.r0;
        if (r0 == null) {
            return null;
        }
        return r0.y(a.getContext(), n, n2, n3);
    }
    
    public Object x(final Object o, final int n, final int n2) {
        if (this.a.r0 == null) {
            return null;
        }
        final int id = ((View)o).getId();
        final s a = this.a;
        return a.r0.y(a.getContext(), n, id, n2);
    }
    
    public float y() {
        return this.a.getProgress();
    }
    
    public String z() {
        final int startState = this.a.getStartState();
        if (this.e == startState) {
            return this.c;
        }
        final String g0 = this.a.G0(startState);
        if (g0 != null) {
            this.c = g0;
            this.e = startState;
        }
        return this.a.G0(startState);
    }
}
