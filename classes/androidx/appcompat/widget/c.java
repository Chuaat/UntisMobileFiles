// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.view.View$OnTouchListener;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.os.Parcelable;
import android.content.res.Resources;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.s;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.view.View;
import android.view.MenuItem;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.g;
import c.a;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.b;

class c extends androidx.appcompat.view.menu.b implements androidx.core.view.b.a
{
    private static final String k0 = "ActionMenuPresenter";
    d Q;
    private Drawable R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private boolean b0;
    private int c0;
    private final SparseBooleanArray d0;
    e e0;
    a f0;
    c g0;
    private b h0;
    final f i0;
    int j0;
    
    public c(final Context context) {
        super(context, c.a.k.d, c.a.k.c);
        this.d0 = new SparseBooleanArray();
        this.i0 = new f();
    }
    
    private View D(final MenuItem menuItem) {
        final ViewGroup viewGroup = (ViewGroup)super.O;
        if (viewGroup == null) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof o.a && ((o.a)child).getItemData() == menuItem) {
                return child;
            }
        }
        return null;
    }
    
    public boolean C() {
        return this.F() | this.G();
    }
    
    public Drawable E() {
        final d q = this.Q;
        if (q != null) {
            return q.getDrawable();
        }
        if (this.S) {
            return this.R;
        }
        return null;
    }
    
    public boolean F() {
        final c g0 = this.g0;
        if (g0 != null) {
            final o o = super.O;
            if (o != null) {
                ((View)o).removeCallbacks((Runnable)g0);
                this.g0 = null;
                return true;
            }
        }
        final e e0 = this.e0;
        if (e0 != null) {
            e0.dismiss();
            return true;
        }
        return false;
    }
    
    public boolean G() {
        final a f0 = this.f0;
        if (f0 != null) {
            f0.dismiss();
            return true;
        }
        return false;
    }
    
    public boolean H() {
        return this.g0 != null || this.I();
    }
    
    public boolean I() {
        final e e0 = this.e0;
        return e0 != null && e0.f();
    }
    
    public boolean J() {
        return this.T;
    }
    
    public void K(final Configuration configuration) {
        if (!this.Y) {
            this.X = androidx.appcompat.view.a.b(super.H).d();
        }
        final androidx.appcompat.view.menu.g i = super.I;
        if (i != null) {
            i.N(true);
        }
    }
    
    public void L(final boolean b0) {
        this.b0 = b0;
    }
    
    public void M(final int x) {
        this.X = x;
        this.Y = true;
    }
    
    public void N(final ActionMenuView o) {
        ((ActionMenuView)(super.O = o)).e(super.I);
    }
    
    public void O(final Drawable drawable) {
        final d q = this.Q;
        if (q != null) {
            q.setImageDrawable(drawable);
        }
        else {
            this.S = true;
            this.R = drawable;
        }
    }
    
    public void P(final boolean t) {
        this.T = t;
        this.U = true;
    }
    
    public void Q(final int v, final boolean z) {
        this.V = v;
        this.Z = z;
        this.a0 = true;
    }
    
    public boolean R() {
        if (this.T && !this.I()) {
            final androidx.appcompat.view.menu.g i = super.I;
            if (i != null && super.O != null && this.g0 == null && !i.C().isEmpty()) {
                final c g0 = new c(new e(super.H, super.I, (View)this.Q, true));
                this.g0 = g0;
                ((View)super.O).post((Runnable)g0);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void a(final boolean b) {
        if (b) {
            super.m(null);
        }
        else {
            final androidx.appcompat.view.menu.g i = super.I;
            if (i != null) {
                i.f(false);
            }
        }
    }
    
    @Override
    public void d(final androidx.appcompat.view.menu.g g, final boolean b) {
        this.C();
        super.d(g, b);
    }
    
    @Override
    public void e(final boolean b) {
        super.e(b);
        ((View)super.O).requestLayout();
        final androidx.appcompat.view.menu.g i = super.I;
        final boolean b2 = false;
        if (i != null) {
            final ArrayList<j> v = i.v();
            for (int size = v.size(), j = 0; j < size; ++j) {
                final androidx.core.view.b b3 = v.get(j).b();
                if (b3 != null) {
                    b3.k((androidx.core.view.b.a)this);
                }
            }
        }
        final androidx.appcompat.view.menu.g k = super.I;
        ArrayList<j> c;
        if (k != null) {
            c = k.C();
        }
        else {
            c = null;
        }
        int n = b2 ? 1 : 0;
        if (this.T) {
            n = (b2 ? 1 : 0);
            if (c != null) {
                final int size2 = c.size();
                if (size2 == 1) {
                    n = ((c.get(0).isActionViewExpanded() ^ true) ? 1 : 0);
                }
                else {
                    n = (b2 ? 1 : 0);
                    if (size2 > 0) {
                        n = 1;
                    }
                }
            }
        }
        final d q = this.Q;
        if (n != 0) {
            if (q == null) {
                this.Q = new d(super.G);
            }
            final ViewGroup viewGroup = (ViewGroup)this.Q.getParent();
            if (viewGroup != super.O) {
                if (viewGroup != null) {
                    viewGroup.removeView((View)this.Q);
                }
                final ActionMenuView actionMenuView = (ActionMenuView)super.O;
                actionMenuView.addView((View)this.Q, (ViewGroup$LayoutParams)actionMenuView.J());
            }
        }
        else if (q != null) {
            final ViewParent parent = q.getParent();
            final o o = super.O;
            if (parent == o) {
                ((ViewGroup)o).removeView((View)this.Q);
            }
        }
        ((ActionMenuView)super.O).setOverflowReserved(this.T);
    }
    
    @Override
    public boolean f() {
        final androidx.appcompat.view.menu.g i = super.I;
        ArrayList<j> h;
        int size;
        if (i != null) {
            h = i.H();
            size = h.size();
        }
        else {
            h = null;
            size = 0;
        }
        int x = this.X;
        final int w = this.W;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)super.O;
        int j = 0;
        boolean b = false;
        int n = 0;
        int n2 = 0;
        while (j < size) {
            final j k = h.get(j);
            if (k.d()) {
                ++n;
            }
            else if (k.q()) {
                ++n2;
            }
            else {
                b = true;
            }
            int n3 = x;
            if (this.b0) {
                n3 = x;
                if (k.isActionViewExpanded()) {
                    n3 = 0;
                }
            }
            ++j;
            x = n3;
        }
        int n4 = x;
        if (this.T && (b || n2 + n > (n4 = x))) {
            n4 = x - 1;
        }
        int n5 = n4 - n;
        final SparseBooleanArray d0 = this.d0;
        d0.clear();
        int n6;
        int n7;
        if (this.Z) {
            final int c0 = this.c0;
            n6 = w / c0;
            n7 = c0 + w % c0 / n6;
        }
        else {
            n7 = 0;
            n6 = 0;
        }
        int l = 0;
        int n8 = 0;
        int n9 = w;
        while (l < size) {
            final j m = h.get(l);
            Label_0758: {
                int n10;
                int n11;
                if (m.d()) {
                    final View s = this.s(m, null, viewGroup);
                    if (this.Z) {
                        n6 -= ActionMenuView.P(s, n7, n6, measureSpec, 0);
                    }
                    else {
                        s.measure(measureSpec, measureSpec);
                    }
                    final int measuredWidth = s.getMeasuredWidth();
                    n10 = n9 - measuredWidth;
                    n11 = n8;
                    if (n8 == 0) {
                        n11 = measuredWidth;
                    }
                    final int groupId = m.getGroupId();
                    if (groupId != 0) {
                        d0.put(groupId, true);
                    }
                    m.x(true);
                }
                else {
                    if (!m.q()) {
                        m.x(false);
                        break Label_0758;
                    }
                    final int groupId2 = m.getGroupId();
                    final boolean value = d0.get(groupId2);
                    boolean b4;
                    boolean b3;
                    final boolean b2 = b3 = (b4 = ((n5 > 0 || value) && n9 > 0 && (!this.Z || n6 > 0)));
                    n10 = n9;
                    int n12 = n6;
                    n11 = n8;
                    if (b2) {
                        final View s2 = this.s(m, null, viewGroup);
                        if (this.Z) {
                            final int p = ActionMenuView.P(s2, n7, n6, measureSpec, 0);
                            final int n13 = n6 -= p;
                            if (p == 0) {
                                b4 = false;
                                n6 = n13;
                            }
                        }
                        else {
                            s2.measure(measureSpec, measureSpec);
                        }
                        final int measuredWidth2 = s2.getMeasuredWidth();
                        n10 = n9 - measuredWidth2;
                        if ((n11 = n8) == 0) {
                            n11 = measuredWidth2;
                        }
                        b3 = (b4 & (this.Z ? (n10 >= 0) : (n10 + n11 > 0)));
                        n12 = n6;
                    }
                    int n14;
                    if (b3 && groupId2 != 0) {
                        d0.put(groupId2, true);
                        n14 = n5;
                    }
                    else {
                        n14 = n5;
                        if (value) {
                            d0.put(groupId2, false);
                            int index = 0;
                            while (true) {
                                n14 = n5;
                                if (index >= l) {
                                    break;
                                }
                                final j j2 = h.get(index);
                                int n15 = n5;
                                if (j2.getGroupId() == groupId2) {
                                    n15 = n5;
                                    if (j2.o()) {
                                        n15 = n5 + 1;
                                    }
                                    j2.x(false);
                                }
                                ++index;
                                n5 = n15;
                            }
                        }
                    }
                    n5 = n14;
                    if (b3) {
                        n5 = n14 - 1;
                    }
                    m.x(b3);
                    n6 = n12;
                }
                n9 = n10;
                n8 = n11;
            }
            ++l;
        }
        return true;
    }
    
    @Override
    public void j(@j0 final Context context, @k0 final androidx.appcompat.view.menu.g g) {
        super.j(context, g);
        final Resources resources = context.getResources();
        final androidx.appcompat.view.a b = androidx.appcompat.view.a.b(context);
        if (!this.U) {
            this.T = b.h();
        }
        if (!this.a0) {
            this.V = b.c();
        }
        if (!this.Y) {
            this.X = b.d();
        }
        int v = this.V;
        if (this.T) {
            if (this.Q == null) {
                final d q = new d(super.G);
                this.Q = q;
                if (this.S) {
                    q.setImageDrawable(this.R);
                    this.R = null;
                    this.S = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                this.Q.measure(measureSpec, measureSpec);
            }
            v -= this.Q.getMeasuredWidth();
        }
        else {
            this.Q = null;
        }
        this.W = v;
        this.c0 = (int)(resources.getDisplayMetrics().density * 56.0f);
    }
    
    @Override
    public void k(final Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            return;
        }
        final int g = ((g)parcelable).G;
        if (g > 0) {
            final MenuItem item = super.I.findItem(g);
            if (item != null) {
                this.m((s)item.getSubMenu());
            }
        }
    }
    
    @Override
    public void l(final j j, final o.a a) {
        a.g(j, 0);
        final ActionMenuView itemInvoker = (ActionMenuView)super.O;
        final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)a;
        actionMenuItemView.setItemInvoker(itemInvoker);
        if (this.h0 == null) {
            this.h0 = new b();
        }
        actionMenuItemView.setPopupCallback((ActionMenuItemView.b)this.h0);
    }
    
    @Override
    public boolean m(final s s) {
        final boolean hasVisibleItems = s.hasVisibleItems();
        final boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        s s2;
        for (s2 = s; s2.n0() != super.I; s2 = (s)s2.n0()) {}
        final View d = this.D(s2.getItem());
        if (d == null) {
            return false;
        }
        this.j0 = s.getItem().getItemId();
        final int size = s.size();
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = s.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        (this.f0 = new a(super.H, s, d)).i(b2);
        this.f0.l();
        super.m(s);
        return true;
    }
    
    @Override
    public o n(final ViewGroup viewGroup) {
        final o o = super.O;
        final o n = super.n(viewGroup);
        if (o != n) {
            ((ActionMenuView)n).setPresenter(this);
        }
        return n;
    }
    
    @Override
    public Parcelable o() {
        final g g = new g();
        g.G = this.j0;
        return (Parcelable)g;
    }
    
    public boolean q(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildAt(n) != this.Q && super.q(viewGroup, n);
    }
    
    @Override
    public View s(final j j, final View view, final ViewGroup viewGroup) {
        View view2 = j.getActionView();
        if (view2 == null || j.m()) {
            view2 = super.s(j, view, viewGroup);
        }
        int visibility;
        if (j.isActionViewExpanded()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view2.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup$LayoutParams)actionMenuView.I(layoutParams));
        }
        return view2;
    }
    
    @Override
    public boolean u(final int n, final j j) {
        return j.o();
    }
    
    private class a extends m
    {
        public a(final Context context, final s s, final View view) {
            super(context, s, view, false, c.a.c.G);
            if (!((j)s.getItem()).o()) {
                Object q;
                if ((q = c.this.Q) == null) {
                    q = c.this.O;
                }
                this.h((View)q);
            }
            this.a(c.this.i0);
        }
        
        @Override
        protected void g() {
            final c n = c.this;
            n.f0 = null;
            n.j0 = 0;
            super.g();
        }
    }
    
    private class b extends ActionMenuItemView.b
    {
        b() {
        }
        
        @Override
        public q a() {
            final a f0 = c.this.f0;
            l e;
            if (f0 != null) {
                e = f0.e();
            }
            else {
                e = null;
            }
            return e;
        }
    }
    
    private class c implements Runnable
    {
        private e G;
        
        public c(final e g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            if (androidx.appcompat.widget.c.this.I != null) {
                androidx.appcompat.widget.c.this.I.d();
            }
            final View view = (View)androidx.appcompat.widget.c.this.O;
            if (view != null && view.getWindowToken() != null && this.G.o()) {
                androidx.appcompat.widget.c.this.e0 = this.G;
            }
            androidx.appcompat.widget.c.this.g0 = null;
        }
    }
    
    private class d extends AppCompatImageView implements ActionMenuView.a
    {
        public d(final Context context) {
            super(context, null, a.c.F);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            androidx.appcompat.widget.w0.a((View)this, this.getContentDescription());
            this.setOnTouchListener((View$OnTouchListener)new e0(this) {
                @Override
                public q b() {
                    final e e0 = c.this.e0;
                    if (e0 == null) {
                        return null;
                    }
                    return e0.e();
                }
                
                public boolean c() {
                    c.this.R();
                    return true;
                }
                
                public boolean d() {
                    final c i = c.this;
                    if (i.g0 != null) {
                        return false;
                    }
                    i.F();
                    return true;
                }
            });
        }
        
        @Override
        public boolean a() {
            return false;
        }
        
        @Override
        public boolean c() {
            return false;
        }
        
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            c.this.R();
            return true;
        }
        
        protected boolean setFrame(int n, int paddingBottom, int paddingTop, int height) {
            final boolean setFrame = super.setFrame(n, paddingBottom, paddingTop, height);
            final Drawable drawable = this.getDrawable();
            final Drawable background = this.getBackground();
            if (drawable != null && background != null) {
                final int width = this.getWidth();
                height = this.getHeight();
                n = Math.max(width, height) / 2;
                final int paddingLeft = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                paddingTop = this.getPaddingTop();
                paddingBottom = this.getPaddingBottom();
                final int n2 = (width + (paddingLeft - paddingRight)) / 2;
                paddingBottom = (height + (paddingTop - paddingBottom)) / 2;
                c.l(background, n2 - n, paddingBottom - n, n2 + n, paddingBottom + n);
            }
            return setFrame;
        }
    }
    
    private class e extends m
    {
        public e(final Context context, final androidx.appcompat.view.menu.g g, final View view, final boolean b) {
            super(context, g, view, b, a.c.G);
            this.j(8388613);
            this.a(c.this.i0);
        }
        
        @Override
        protected void g() {
            if (c.this.I != null) {
                c.this.I.close();
            }
            c.this.e0 = null;
            super.g();
        }
    }
    
    private class f implements n.a
    {
        f() {
        }
        
        @Override
        public void d(@j0 final androidx.appcompat.view.menu.g g, final boolean b) {
            if (g instanceof s) {
                g.G().f(false);
            }
            final n.a r = c.this.r();
            if (r != null) {
                r.d(g, b);
            }
        }
        
        @Override
        public boolean e(@j0 final androidx.appcompat.view.menu.g g) {
            final androidx.appcompat.view.menu.g y = c.this.I;
            boolean e = false;
            if (g == y) {
                return false;
            }
            c.this.j0 = ((s)g).getItem().getItemId();
            final n.a r = c.this.r();
            if (r != null) {
                e = r.e(g);
            }
            return e;
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    private static class g implements Parcelable
    {
        public static final Parcelable$Creator<g> CREATOR;
        public int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<g>() {
                public g a(final Parcel parcel) {
                    return new g(parcel);
                }
                
                public g[] b(final int n) {
                    return new g[n];
                }
            };
        }
        
        g() {
        }
        
        g(final Parcel parcel) {
            this.G = parcel.readInt();
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
        }
    }
}
