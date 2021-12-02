// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ViewDebug$ExportedProperty;
import android.view.ContextThemeWrapper;
import androidx.annotation.x0;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import androidx.annotation.t0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.n;
import android.content.Context;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.g;

public class ActionMenuView extends LinearLayoutCompat implements g.b, o
{
    private static final String w0 = "ActionMenuView";
    static final int x0 = 56;
    static final int y0 = 4;
    private g k0;
    private Context l0;
    private int m0;
    private boolean n0;
    private androidx.appcompat.widget.c o0;
    private n.a p0;
    g.a q0;
    private boolean r0;
    private int s0;
    private int t0;
    private int u0;
    e v0;
    
    public ActionMenuView(@j0 final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(@j0 final Context l0, @k0 final AttributeSet set) {
        super(l0, set);
        this.setBaselineAligned(false);
        final float density = l0.getResources().getDisplayMetrics().density;
        this.t0 = (int)(56.0f * density);
        this.u0 = (int)(density * 4.0f);
        this.l0 = l0;
        this.m0 = 0;
    }
    
    static int P(final View view, final int n, int b, int n2, int n3) {
        final c c = (c)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2) - n3, View$MeasureSpec.getMode(n2));
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView)view;
        }
        else {
            actionMenuItemView = null;
        }
        boolean d = true;
        if (actionMenuItemView != null && actionMenuItemView.h()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        n3 = 2;
        if (b > 0 && (n2 == 0 || b >= 2)) {
            view.measure(View$MeasureSpec.makeMeasureSpec(b * n, Integer.MIN_VALUE), measureSpec);
            final int measuredWidth = view.getMeasuredWidth();
            final int n4 = b = measuredWidth / n;
            if (measuredWidth % n != 0) {
                b = n4 + 1;
            }
            if (n2 != 0 && b < 2) {
                b = n3;
            }
        }
        else {
            b = 0;
        }
        if (c.a || n2 == 0) {
            d = false;
        }
        c.d = d;
        c.b = b;
        view.measure(View$MeasureSpec.makeMeasureSpec(n * b, 1073741824), measureSpec);
        return b;
    }
    
    private void Q(int i, int n) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(i);
        final int size2 = View$MeasureSpec.getSize(n);
        final int paddingLeft = this.getPaddingLeft();
        i = this.getPaddingRight();
        final int n2 = this.getPaddingTop() + this.getPaddingBottom();
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, n2, -2);
        final int n3 = size - (paddingLeft + i);
        n = this.t0;
        i = n3 / n;
        if (i == 0) {
            this.setMeasuredDimension(n3, 0);
            return;
        }
        final int n4 = n + n3 % n / i;
        final int childCount = this.getChildCount();
        int max = 0;
        int j = 0;
        boolean b = false;
        int n5 = 0;
        int max2 = 0;
        int n6 = 0;
        long k = 0L;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() == 8) {
                n = n6;
            }
            else {
                final boolean b2 = child instanceof ActionMenuItemView;
                ++n5;
                if (b2) {
                    n = this.u0;
                    child.setPadding(n, 0, n, 0);
                }
                final c c = (c)child.getLayoutParams();
                c.f = false;
                c.c = 0;
                c.b = 0;
                c.d = false;
                c.leftMargin = 0;
                c.rightMargin = 0;
                c.e = (b2 && ((ActionMenuItemView)child).h());
                if (c.a) {
                    n = 1;
                }
                else {
                    n = i;
                }
                final int p2 = P(child, n4, n, childMeasureSpec, n2);
                max2 = Math.max(max2, p2);
                n = n6;
                if (c.d) {
                    n = n6 + 1;
                }
                if (c.a) {
                    b = true;
                }
                i -= p2;
                max = Math.max(max, child.getMeasuredHeight());
                if (p2 == 1) {
                    k |= 1 << j;
                }
            }
            ++j;
            n6 = n;
        }
        final boolean b3 = b && n5 == 2;
        n = 0;
        int n7 = i;
        final boolean b4 = b3;
        final int n8 = n3;
        while (true) {
            while (n6 > 0 && n7 > 0) {
                int n9 = 0;
                int l = 0;
                int n10 = Integer.MAX_VALUE;
                long n11 = 0L;
                while (l < childCount) {
                    final c c2 = (c)this.getChildAt(l).getLayoutParams();
                    int n12;
                    long n13;
                    if (!c2.d) {
                        i = n9;
                        n12 = n10;
                        n13 = n11;
                    }
                    else {
                        final int b5 = c2.b;
                        if (b5 < n10) {
                            n13 = 1L << l;
                            n12 = b5;
                            i = 1;
                        }
                        else {
                            i = n9;
                            n12 = n10;
                            n13 = n11;
                            if (b5 == n10) {
                                i = n9 + 1;
                                n13 = (n11 | 1L << l);
                                n12 = n10;
                            }
                        }
                    }
                    ++l;
                    n9 = i;
                    n10 = n12;
                    n11 = n13;
                }
                i = n;
                n = max;
                k |= n11;
                if (n9 > n7) {
                    final boolean b6 = !b && n5 == 1;
                    int n19;
                    if (n7 > 0 && k != 0L && (n7 < n5 - 1 || b6 || max2 > 1)) {
                        float n14 = (float)Long.bitCount(k);
                        if (!b6) {
                            float n15 = n14;
                            if ((k & 0x1L) != 0x0L) {
                                n15 = n14;
                                if (!((c)this.getChildAt(0).getLayoutParams()).e) {
                                    n15 = n14 - 0.5f;
                                }
                            }
                            final int n16 = childCount - 1;
                            n14 = n15;
                            if ((k & (long)(1 << n16)) != 0x0L) {
                                n14 = n15;
                                if (!((c)this.getChildAt(n16).getLayoutParams()).e) {
                                    n14 = n15 - 0.5f;
                                }
                            }
                        }
                        int n17;
                        if (n14 > 0.0f) {
                            n17 = (int)(n7 * n4 / n14);
                        }
                        else {
                            n17 = 0;
                        }
                        int n18 = 0;
                        while (true) {
                            n19 = i;
                            if (n18 >= childCount) {
                                break;
                            }
                            int n20 = 0;
                            Label_1085: {
                                if ((k & (long)(1 << n18)) == 0x0L) {
                                    n20 = i;
                                }
                                else {
                                    final View child2 = this.getChildAt(n18);
                                    final c c3 = (c)child2.getLayoutParams();
                                    if (child2 instanceof ActionMenuItemView) {
                                        c3.c = n17;
                                        c3.f = true;
                                        if (n18 == 0 && !c3.e) {
                                            c3.leftMargin = -n17 / 2;
                                        }
                                    }
                                    else if (c3.a) {
                                        c3.c = n17;
                                        c3.f = true;
                                        c3.rightMargin = -n17 / 2;
                                    }
                                    else {
                                        if (n18 != 0) {
                                            c3.leftMargin = n17 / 2;
                                        }
                                        n20 = i;
                                        if (n18 != childCount - 1) {
                                            c3.rightMargin = n17 / 2;
                                            n20 = i;
                                        }
                                        break Label_1085;
                                    }
                                    n20 = 1;
                                }
                            }
                            ++n18;
                            i = n20;
                        }
                    }
                    else {
                        n19 = i;
                    }
                    if (n19 != 0) {
                        View child3;
                        c c4;
                        for (i = 0; i < childCount; ++i) {
                            child3 = this.getChildAt(i);
                            c4 = (c)child3.getLayoutParams();
                            if (c4.f) {
                                child3.measure(View$MeasureSpec.makeMeasureSpec(c4.b * n4 + c4.c, 1073741824), childMeasureSpec);
                            }
                        }
                    }
                    if (mode == 1073741824) {
                        n = size2;
                    }
                    this.setMeasuredDimension(n8, n);
                    return;
                }
                View child4;
                c c5;
                long n21;
                long n22;
                int u0;
                for (i = 0; i < childCount; ++i) {
                    child4 = this.getChildAt(i);
                    c5 = (c)child4.getLayoutParams();
                    n21 = 1 << i;
                    if ((n11 & n21) == 0x0L) {
                        n22 = k;
                        if (c5.b == n10 + 1) {
                            n22 = (k | n21);
                        }
                        k = n22;
                    }
                    else {
                        if (b4 && c5.e && n7 == 1) {
                            u0 = this.u0;
                            child4.setPadding(u0 + n4, 0, u0, 0);
                        }
                        ++c5.b;
                        c5.f = true;
                        --n7;
                    }
                }
                max = n;
                n = 1;
            }
            i = n;
            n = max;
            continue;
        }
    }
    
    public void F() {
        final androidx.appcompat.widget.c o0 = this.o0;
        if (o0 != null) {
            o0.C();
        }
    }
    
    protected c G() {
        final c c = new c(-2, -2);
        c.gravity = 16;
        return c;
    }
    
    public c H(final AttributeSet set) {
        return new c(this.getContext(), set);
    }
    
    protected c I(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            if (c.gravity <= 0) {
                c.gravity = 16;
            }
            return c;
        }
        return this.G();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public c J() {
        final c g = this.G();
        g.a = true;
        return g;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected boolean K(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        boolean b2 = b;
        if (n < this.getChildCount()) {
            b2 = b;
            if (child instanceof a) {
                b2 = (false | ((a)child).a());
            }
        }
        boolean b3 = b2;
        if (n > 0) {
            b3 = b2;
            if (child2 instanceof a) {
                b3 = (b2 | ((a)child2).c());
            }
        }
        return b3;
    }
    
    public boolean L() {
        final androidx.appcompat.widget.c o0 = this.o0;
        return o0 != null && o0.F();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean M() {
        final androidx.appcompat.widget.c o0 = this.o0;
        return o0 != null && o0.H();
    }
    
    public boolean N() {
        final androidx.appcompat.widget.c o0 = this.o0;
        return o0 != null && o0.I();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean O() {
        return this.n0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public g R() {
        return this.k0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void S(final n.a p2, final g.a q0) {
        this.p0 = p2;
        this.q0 = q0;
    }
    
    public boolean T() {
        final androidx.appcompat.widget.c o0 = this.o0;
        return o0 != null && o0.R();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    public boolean a(final j j) {
        return this.k0.O((MenuItem)j, 0);
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    public void e(final g k0) {
        this.k0 = k0;
    }
    
    public Menu getMenu() {
        if (this.k0 == null) {
            final Context context = this.getContext();
            (this.k0 = new g(context)).X((g.a)new d());
            (this.o0 = new androidx.appcompat.widget.c(context)).P(true);
            final androidx.appcompat.widget.c o0 = this.o0;
            n.a p0 = this.p0;
            if (p0 == null) {
                p0 = new b();
            }
            o0.i(p0);
            this.k0.c(this.o0, this.l0);
            this.o0.N(this);
        }
        return (Menu)this.k0;
    }
    
    @k0
    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.o0.E();
    }
    
    public int getPopupTheme() {
        return this.m0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    public int getWindowAnimations() {
        return 0;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final androidx.appcompat.widget.c o0 = this.o0;
        if (o0 != null) {
            o0.e(false);
            if (this.o0.I()) {
                this.o0.F();
                this.o0.R();
            }
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F();
    }
    
    @Override
    protected void onLayout(final boolean b, int i, int j, int n, int n2) {
        if (!this.r0) {
            super.onLayout(b, i, j, n, n2);
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = (n2 - j) / 2;
        final int dividerWidth = this.getDividerWidth();
        final int n4 = n - i;
        i = n4 - this.getPaddingRight() - this.getPaddingLeft();
        final boolean b2 = a1.b((View)this);
        j = 0;
        n2 = 0;
        n = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                if (c.a) {
                    final int n5 = n2 = child.getMeasuredWidth();
                    if (this.K(j)) {
                        n2 = n5 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n6;
                    int n7;
                    if (b2) {
                        n6 = this.getPaddingLeft() + c.leftMargin;
                        n7 = n6 + n2;
                    }
                    else {
                        n7 = this.getWidth() - this.getPaddingRight() - c.rightMargin;
                        n6 = n7 - n2;
                    }
                    final int n8 = n3 - measuredHeight / 2;
                    child.layout(n6, n8, n7, measuredHeight + n8);
                    i -= n2;
                    n2 = 1;
                }
                else {
                    i -= child.getMeasuredWidth() + c.leftMargin + c.rightMargin;
                    this.K(j);
                    ++n;
                }
            }
            ++j;
        }
        if (childCount == 1 && n2 == 0) {
            final View child2 = this.getChildAt(0);
            i = child2.getMeasuredWidth();
            j = child2.getMeasuredHeight();
            n = n4 / 2 - i / 2;
            n2 = n3 - j / 2;
            child2.layout(n, n2, i + n, j + n2);
            return;
        }
        j = n - (n2 ^ 0x1);
        if (j > 0) {
            i /= j;
        }
        else {
            i = 0;
        }
        n2 = Math.max(0, i);
        if (b2) {
            j = this.getWidth() - this.getPaddingRight();
            View child3;
            c c2;
            int n9;
            int measuredHeight2;
            for (i = 0; i < childCount; ++i, j = n) {
                child3 = this.getChildAt(i);
                c2 = (c)child3.getLayoutParams();
                n = j;
                if (child3.getVisibility() != 8) {
                    if (c2.a) {
                        n = j;
                    }
                    else {
                        n9 = j - c2.rightMargin;
                        n = child3.getMeasuredWidth();
                        measuredHeight2 = child3.getMeasuredHeight();
                        j = n3 - measuredHeight2 / 2;
                        child3.layout(n9 - n, j, n9, measuredHeight2 + j);
                        n = n9 - (n + c2.leftMargin + n2);
                    }
                }
            }
        }
        else {
            n = this.getPaddingLeft();
            View child4;
            c c3;
            int measuredWidth;
            int n10;
            for (i = 0; i < childCount; ++i, n = j) {
                child4 = this.getChildAt(i);
                c3 = (c)child4.getLayoutParams();
                j = n;
                if (child4.getVisibility() != 8) {
                    if (c3.a) {
                        j = n;
                    }
                    else {
                        j = n + c3.leftMargin;
                        measuredWidth = child4.getMeasuredWidth();
                        n = child4.getMeasuredHeight();
                        n10 = n3 - n / 2;
                        child4.layout(j, n10, j + measuredWidth, n + n10);
                        j += measuredWidth + c3.rightMargin + n2;
                    }
                }
            }
        }
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final boolean r0 = this.r0;
        int r2;
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            r2 = 1;
        }
        else {
            r2 = 0;
        }
        this.r0 = (r2 != 0);
        if ((r0 ? 1 : 0) != r2) {
            this.s0 = 0;
        }
        final int size = View$MeasureSpec.getSize(n);
        if (this.r0) {
            final g k0 = this.k0;
            if (k0 != null && size != this.s0) {
                this.s0 = size;
                k0.N(true);
            }
        }
        final int childCount = this.getChildCount();
        if (this.r0 && childCount > 0) {
            this.Q(n, n2);
        }
        else {
            for (int i = 0; i < childCount; ++i) {
                final c c = (c)this.getChildAt(i).getLayoutParams();
                c.rightMargin = 0;
                c.leftMargin = 0;
            }
            super.onMeasure(n, n2);
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void setExpandedActionViewsExclusive(final boolean b) {
        this.o0.L(b);
    }
    
    public void setOnMenuItemClickListener(final e v0) {
        this.v0 = v0;
    }
    
    public void setOverflowIcon(@k0 final Drawable drawable) {
        this.getMenu();
        this.o0.O(drawable);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void setOverflowReserved(final boolean n0) {
        this.n0 = n0;
    }
    
    public void setPopupTheme(@x0 final int m0) {
        if (this.m0 != m0) {
            if ((this.m0 = m0) == 0) {
                this.l0 = this.getContext();
            }
            else {
                this.l0 = (Context)new ContextThemeWrapper(this.getContext(), m0);
            }
        }
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public void setPresenter(final androidx.appcompat.widget.c o0) {
        (this.o0 = o0).N(this);
    }
    
    @t0({ t0.a.I })
    public interface a
    {
        boolean a();
        
        boolean c();
    }
    
    private static class b implements n.a
    {
        b() {
        }
        
        @Override
        public void d(@j0 final g g, final boolean b) {
        }
        
        @Override
        public boolean e(@j0 final g g) {
            return false;
        }
    }
    
    public static class c extends LinearLayoutCompat.b
    {
        @ViewDebug$ExportedProperty
        public boolean a;
        @ViewDebug$ExportedProperty
        public int b;
        @ViewDebug$ExportedProperty
        public int c;
        @ViewDebug$ExportedProperty
        public boolean d;
        @ViewDebug$ExportedProperty
        public boolean e;
        boolean f;
        
        public c(final int n, final int n2) {
            super(n, n2);
            this.a = false;
        }
        
        c(final int n, final int n2, final boolean a) {
            super(n, n2);
            this.a = a;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.a = c.a;
        }
    }
    
    private class d implements g.a
    {
        d() {
        }
        
        @Override
        public boolean a(@j0 final g g, @j0 final MenuItem menuItem) {
            final e v0 = ActionMenuView.this.v0;
            return v0 != null && v0.onMenuItemClick(menuItem);
        }
        
        @Override
        public void b(@j0 final g g) {
            final g.a q0 = ActionMenuView.this.q0;
            if (q0 != null) {
                q0.b(g);
            }
        }
    }
    
    public interface e
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
