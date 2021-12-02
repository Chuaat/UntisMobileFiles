// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.ViewParent;
import android.graphics.Canvas;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Arrays;
import android.util.Log;
import android.util.AttributeSet;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.i;
import android.content.Context;
import android.view.View;

public abstract class b extends View
{
    protected int[] G;
    protected int H;
    protected Context I;
    protected i J;
    protected boolean K;
    protected String L;
    protected String M;
    private View[] N;
    protected HashMap<Integer, String> O;
    
    public b(final Context i) {
        super(i);
        this.G = new int[32];
        this.K = false;
        this.N = null;
        this.O = new HashMap<Integer, String>();
        this.I = i;
        this.y(null);
    }
    
    public b(final Context i, final AttributeSet set) {
        super(i, set);
        this.G = new int[32];
        this.K = false;
        this.N = null;
        this.O = new HashMap<Integer, String>();
        this.I = i;
        this.y(set);
    }
    
    public b(final Context i, final AttributeSet set, final int n) {
        super(i, set, n);
        this.G = new int[32];
        this.K = false;
        this.N = null;
        this.O = new HashMap<Integer, String>();
        this.I = i;
        this.y(set);
    }
    
    private void l(String trim) {
        if (trim != null) {
            if (trim.length() != 0) {
                if (this.I == null) {
                    return;
                }
                trim = trim.trim();
                if (this.getParent() instanceof ConstraintLayout) {
                    final ConstraintLayout constraintLayout = (ConstraintLayout)this.getParent();
                }
                final int v = this.v(trim);
                if (v != 0) {
                    this.O.put(v, trim);
                    this.m(v);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not find id of \"");
                    sb.append(trim);
                    sb.append("\"");
                    Log.w("ConstraintHelper", sb.toString());
                }
            }
        }
    }
    
    private void m(final int n) {
        if (n == this.getId()) {
            return;
        }
        final int h = this.H;
        final int[] g = this.G;
        if (h + 1 > g.length) {
            this.G = Arrays.copyOf(g, g.length * 2);
        }
        final int[] g2 = this.G;
        final int h2 = this.H;
        g2[h2] = n;
        this.H = h2 + 1;
    }
    
    private void n(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (this.I == null) {
                    return;
                }
                final String trim = s.trim();
                ViewGroup viewGroup = null;
                if (this.getParent() instanceof ConstraintLayout) {
                    viewGroup = (ConstraintLayout)this.getParent();
                }
                if (viewGroup == null) {
                    Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                    return;
                }
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = viewGroup.getChildAt(i);
                    final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                    if (layoutParams instanceof ConstraintLayout.b && trim.equals(((ConstraintLayout.b)layoutParams).b0)) {
                        if (child.getId() == -1) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("to use ConstraintTag view ");
                            sb.append(child.getClass().getSimpleName());
                            sb.append(" must have an ID");
                            Log.w("ConstraintHelper", sb.toString());
                        }
                        else {
                            this.m(child.getId());
                        }
                    }
                }
            }
        }
    }
    
    private int[] t(final View view, final String s) {
        final String[] split = s.split(",");
        view.getContext();
        final int[] original = new int[split.length];
        int i = 0;
        int newLength = 0;
        while (i < split.length) {
            final int v = this.v(split[i].trim());
            int n = newLength;
            if (v != 0) {
                original[newLength] = v;
                n = newLength + 1;
            }
            ++i;
            newLength = n;
        }
        int[] copy = original;
        if (newLength != split.length) {
            copy = Arrays.copyOf(original, newLength);
        }
        return copy;
    }
    
    private int u(final ConstraintLayout constraintLayout, final String s) {
        if (s != null) {
            if (constraintLayout != null) {
                final Resources resources = this.I.getResources();
                if (resources == null) {
                    return 0;
                }
                for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = constraintLayout.getChildAt(i);
                    if (child.getId() != -1) {
                        Object resourceEntryName = null;
                        try {
                            resourceEntryName = resources.getResourceEntryName(child.getId());
                        }
                        catch (Resources$NotFoundException ex) {}
                        if (s.equals(resourceEntryName)) {
                            return child.getId();
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    private int v(final String name) {
        ConstraintLayout constraintLayout;
        if (this.getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout)this.getParent();
        }
        else {
            constraintLayout = null;
        }
        final boolean inEditMode = this.isInEditMode();
        int intValue;
        final int n = intValue = 0;
        if (inEditMode) {
            intValue = n;
            if (constraintLayout != null) {
                final Object l = constraintLayout.l(0, name);
                intValue = n;
                if (l instanceof Integer) {
                    intValue = (int)l;
                }
            }
        }
        int u;
        if ((u = intValue) == 0) {
            u = intValue;
            if (constraintLayout != null) {
                u = this.u(constraintLayout, name);
            }
        }
        int int1;
        if ((int1 = u) == 0) {
            try {
                int1 = j.g.class.getField(name).getInt(null);
            }
            catch (Exception ex) {
                int1 = u;
            }
        }
        int identifier;
        if ((identifier = int1) == 0) {
            identifier = this.I.getResources().getIdentifier(name, "id", this.I.getPackageName());
        }
        return identifier;
    }
    
    public int A(final View view) {
        final int id = view.getId();
        final int n = -1;
        if (id == -1) {
            return -1;
        }
        this.L = null;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= this.H) {
                break;
            }
            if (this.G[n2] == id) {
                int n4 = n2;
                int h;
                while (true) {
                    h = this.H;
                    if (n4 >= h - 1) {
                        break;
                    }
                    final int[] g = this.G;
                    final int n5 = n4 + 1;
                    g[n4] = g[n5];
                    n4 = n5;
                }
                this.G[h - 1] = 0;
                this.H = h - 1;
                n3 = n2;
                break;
            }
            ++n2;
        }
        this.requestLayout();
        return n3;
    }
    
    public void B(final e e, final boolean b) {
    }
    
    public void C(final ConstraintLayout constraintLayout) {
    }
    
    public void D(final ConstraintLayout constraintLayout) {
    }
    
    public void E(final ConstraintLayout constraintLayout) {
    }
    
    public void F(final ConstraintLayout constraintLayout) {
    }
    
    public void G(final f f, final i i, final SparseArray<e> sparseArray) {
        i.a();
        for (int j = 0; j < this.H; ++j) {
            i.b((e)sparseArray.get(this.G[j]));
        }
    }
    
    public void H(final ConstraintLayout constraintLayout) {
        if (this.isInEditMode()) {
            this.setIds(this.L);
        }
        final i j = this.J;
        if (j == null) {
            return;
        }
        j.a();
        for (int i = 0; i < this.H; ++i) {
            final int k = this.G[i];
            final View n = constraintLayout.n(k);
            View n2;
            if ((n2 = n) == null) {
                final String value = this.O.get(k);
                final int u = this.u(constraintLayout, value);
                n2 = n;
                if (u != 0) {
                    this.G[i] = u;
                    this.O.put(u, value);
                    n2 = constraintLayout.n(u);
                }
            }
            if (n2 != null) {
                this.J.b(constraintLayout.o(n2));
            }
        }
        this.J.c(constraintLayout.I);
    }
    
    public void I() {
        if (this.J == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b)layoutParams).u0 = (e)this.J;
        }
    }
    
    public int[] getReferencedIds() {
        return Arrays.copyOf(this.G, this.H);
    }
    
    public void o(final View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
            return;
        }
        if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            return;
        }
        this.L = null;
        this.m(view.getId());
        this.requestLayout();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String l = this.L;
        if (l != null) {
            this.setIds(l);
        }
        final String m = this.M;
        if (m != null) {
            this.setReferenceTags(m);
        }
    }
    
    public void onDraw(final Canvas canvas) {
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.K) {
            super.onMeasure(n, n2);
        }
        else {
            this.setMeasuredDimension(0, 0);
        }
    }
    
    protected void p() {
        final ViewParent parent = this.getParent();
        if (parent != null && parent instanceof ConstraintLayout) {
            this.q((ConstraintLayout)parent);
        }
    }
    
    protected void q(final ConstraintLayout constraintLayout) {
        final int visibility = this.getVisibility();
        float elevation;
        if (Build$VERSION.SDK_INT >= 21) {
            elevation = this.getElevation();
        }
        else {
            elevation = 0.0f;
        }
        for (int i = 0; i < this.H; ++i) {
            final View n = constraintLayout.n(this.G[i]);
            if (n != null) {
                n.setVisibility(visibility);
                if (elevation > 0.0f && Build$VERSION.SDK_INT >= 21) {
                    n.setTranslationZ(n.getTranslationZ() + elevation);
                }
            }
        }
    }
    
    protected void r(final ConstraintLayout constraintLayout) {
    }
    
    public boolean s(final int n) {
        final int[] g = this.G;
        final int length = g.length;
        final boolean b = false;
        int n2 = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n2 >= length) {
                break;
            }
            if (g[n2] == n) {
                b2 = true;
                break;
            }
            ++n2;
        }
        return b2;
    }
    
    protected void setIds(final String l) {
        this.L = l;
        if (l == null) {
            return;
        }
        int beginIndex = 0;
        this.H = 0;
        while (true) {
            final int index = l.indexOf(44, beginIndex);
            if (index == -1) {
                break;
            }
            this.l(l.substring(beginIndex, index));
            beginIndex = index + 1;
        }
        this.l(l.substring(beginIndex));
    }
    
    protected void setReferenceTags(final String m) {
        this.M = m;
        if (m == null) {
            return;
        }
        int beginIndex = 0;
        this.H = 0;
        while (true) {
            final int index = m.indexOf(44, beginIndex);
            if (index == -1) {
                break;
            }
            this.n(m.substring(beginIndex, index));
            beginIndex = index + 1;
        }
        this.n(m.substring(beginIndex));
    }
    
    public void setReferencedIds(final int[] array) {
        this.L = null;
        int i = 0;
        this.H = 0;
        while (i < array.length) {
            this.m(array[i]);
            ++i;
        }
    }
    
    public void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (o == null && this.L == null) {
            this.m(n);
        }
    }
    
    protected View[] w(final ConstraintLayout constraintLayout) {
        final View[] n = this.N;
        if (n == null || n.length != this.H) {
            this.N = new View[this.H];
        }
        for (int i = 0; i < this.H; ++i) {
            this.N[i] = constraintLayout.n(this.G[i]);
        }
        return this.N;
    }
    
    public int x(final int n) {
        final int[] g = this.G;
        final int length = g.length;
        int n2 = -1;
        for (final int n3 : g) {
            ++n2;
            if (n3 == n) {
                return n2;
            }
        }
        return n2;
    }
    
    protected void y(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.d7) {
                    this.setIds(this.L = obtainStyledAttributes.getString(index));
                }
                else if (index == j.m.e7) {
                    this.setReferenceTags(this.M = obtainStyledAttributes.getString(index));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public void z(final androidx.constraintlayout.widget.e.a a, final androidx.constraintlayout.core.widgets.j j, final ConstraintLayout.b b, final SparseArray<e> sparseArray) {
        final androidx.constraintlayout.widget.e.b e = a.e;
        final int[] j2 = e.j0;
        if (j2 != null) {
            this.setReferencedIds(j2);
        }
        else {
            final String k0 = e.k0;
            if (k0 != null && k0.length() > 0) {
                final androidx.constraintlayout.widget.e.b e2 = a.e;
                e2.j0 = this.t(this, e2.k0);
            }
        }
        j.a();
        if (a.e.j0 != null) {
            int n = 0;
            while (true) {
                final int[] j3 = a.e.j0;
                if (n >= j3.length) {
                    break;
                }
                final e e3 = (e)sparseArray.get(j3[n]);
                if (e3 != null) {
                    j.b(e3);
                }
                ++n;
            }
        }
    }
}
