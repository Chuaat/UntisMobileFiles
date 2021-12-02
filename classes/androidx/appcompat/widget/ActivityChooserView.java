// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.widget.AdapterView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.view.View$MeasureSpec;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewTreeObserver;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View$OnTouchListener;
import androidx.appcompat.view.menu.q;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$AccessibilityDelegate;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.database.DataSetObserver;
import androidx.core.view.b;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.t0;
import android.view.ViewGroup;

@t0({ t0.a.I })
public class ActivityChooserView extends ViewGroup implements a
{
    final f G;
    private final g H;
    private final View I;
    private final Drawable J;
    final FrameLayout K;
    private final ImageView L;
    final FrameLayout M;
    private final ImageView N;
    private final int O;
    androidx.core.view.b P;
    final DataSetObserver Q;
    private final ViewTreeObserver$OnGlobalLayoutListener R;
    private f0 S;
    PopupWindow$OnDismissListener T;
    boolean U;
    int V;
    private boolean W;
    private int a0;
    
    public ActivityChooserView(@j0 final Context context) {
        this(context, null);
    }
    
    public ActivityChooserView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActivityChooserView(@j0 final Context context, @k0 final AttributeSet set, int y0) {
        super(context, set, y0);
        this.Q = new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.G.notifyDataSetChanged();
            }
            
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.G.notifyDataSetInvalidated();
            }
        };
        this.R = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (ActivityChooserView.this.b()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                    }
                    else {
                        ActivityChooserView.this.getListPopupWindow().a();
                        final androidx.core.view.b p = ActivityChooserView.this.P;
                        if (p != null) {
                            p.m(true);
                        }
                    }
                }
            }
        };
        this.V = 4;
        final int[] q = c.a.n.Q;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, q, y0, 0);
        androidx.core.view.j0.x1((View)this, context, q, set, obtainStyledAttributes, y0, 0);
        this.V = obtainStyledAttributes.getInt(c.a.n.S, 4);
        final Drawable drawable = obtainStyledAttributes.getDrawable(c.a.n.R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(this.getContext()).inflate(c.a.k.g, (ViewGroup)this, true);
        final g g = new g();
        this.H = g;
        final View viewById = this.findViewById(c.a.h.Z);
        this.I = viewById;
        this.J = viewById.getBackground();
        final FrameLayout m = (FrameLayout)this.findViewById(c.a.h.n0);
        (this.M = m).setOnClickListener((View$OnClickListener)g);
        m.setOnLongClickListener((View$OnLongClickListener)g);
        y0 = c.a.h.y0;
        this.N = (ImageView)m.findViewById(y0);
        final FrameLayout k = (FrameLayout)this.findViewById(c.a.h.q0);
        k.setOnClickListener((View$OnClickListener)g);
        k.setAccessibilityDelegate((View$AccessibilityDelegate)new View$AccessibilityDelegate() {
            public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                androidx.core.view.accessibility.d.V1(accessibilityNodeInfo).R0(true);
            }
        });
        k.setOnTouchListener((View$OnTouchListener)new e0(k) {
            @Override
            public q b() {
                return ActivityChooserView.this.getListPopupWindow();
            }
            
            @Override
            protected boolean c() {
                ActivityChooserView.this.c();
                return true;
            }
            
            @Override
            protected boolean d() {
                ActivityChooserView.this.a();
                return true;
            }
        });
        this.K = k;
        (this.L = (ImageView)k.findViewById(y0)).setImageDrawable(drawable);
        (this.G = new f()).registerDataSetObserver((DataSetObserver)new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.e();
            }
        });
        final Resources resources = context.getResources();
        this.O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.f.x));
    }
    
    public boolean a() {
        if (this.b()) {
            this.getListPopupWindow().dismiss();
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.R);
            }
        }
        return true;
    }
    
    public boolean b() {
        return this.getListPopupWindow().c();
    }
    
    public boolean c() {
        if (!this.b() && this.W) {
            this.U = false;
            this.d(this.V);
            return true;
        }
        return false;
    }
    
    void d(int n) {
        if (this.G.b() != null) {
            this.getViewTreeObserver().addOnGlobalLayoutListener(this.R);
            int n2;
            if (this.M.getVisibility() == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            final int a = this.G.a();
            f f;
            if (n != Integer.MAX_VALUE && a > n + n2) {
                this.G.j(true);
                f = this.G;
                --n;
            }
            else {
                this.G.j(false);
                f = this.G;
            }
            f.h(n);
            final f0 listPopupWindow = this.getListPopupWindow();
            if (!listPopupWindow.c()) {
                if (!this.U && n2 != 0) {
                    this.G.i(false, false);
                }
                else {
                    this.G.i(true, (boolean)(n2 != 0));
                }
                listPopupWindow.U(Math.min(this.G.f(), this.O));
                listPopupWindow.a();
                final androidx.core.view.b p = this.P;
                if (p != null) {
                    p.m(true);
                }
                listPopupWindow.l().setContentDescription((CharSequence)this.getContext().getString(c.a.l.f));
                listPopupWindow.l().setSelector((Drawable)new ColorDrawable(0));
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    
    void e() {
        if (this.G.getCount() > 0) {
            this.K.setEnabled(true);
        }
        else {
            this.K.setEnabled(false);
        }
        final int a = this.G.a();
        final int d = this.G.d();
        if (a != 1 && (a <= 1 || d <= 0)) {
            this.M.setVisibility(8);
        }
        else {
            this.M.setVisibility(0);
            final ResolveInfo c = this.G.c();
            final PackageManager packageManager = this.getContext().getPackageManager();
            this.N.setImageDrawable(c.loadIcon(packageManager));
            if (this.a0 != 0) {
                this.M.setContentDescription((CharSequence)this.getContext().getString(this.a0, new Object[] { c.loadLabel(packageManager) }));
            }
        }
        View view;
        Drawable j;
        if (this.M.getVisibility() == 0) {
            view = this.I;
            j = this.J;
        }
        else {
            view = this.I;
            j = null;
        }
        view.setBackgroundDrawable(j);
    }
    
    @t0({ t0.a.G })
    public d getDataModel() {
        return this.G.b();
    }
    
    f0 getListPopupWindow() {
        if (this.S == null) {
            (this.S = new f0(this.getContext())).q((ListAdapter)this.G);
            this.S.S((View)this);
            this.S.d0(true);
            this.S.f0((AdapterView$OnItemClickListener)this.H);
            this.S.e0((PopupWindow$OnDismissListener)this.H);
        }
        return this.S;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final d b = this.G.b();
        if (b != null) {
            b.registerObserver((Object)this.Q);
        }
        this.W = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final d b = this.G.b();
        if (b != null) {
            b.unregisterObserver((Object)this.Q);
        }
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.R);
        }
        if (this.b()) {
            this.a();
        }
        this.W = false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.I.layout(0, 0, n3 - n, n4 - n2);
        if (!this.b()) {
            this.a();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final View i = this.I;
        int measureSpec = n2;
        if (this.M.getVisibility() != 0) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 1073741824);
        }
        this.measureChild(i, n, measureSpec);
        this.setMeasuredDimension(i.getMeasuredWidth(), i.getMeasuredHeight());
    }
    
    @t0({ t0.a.G })
    public void setActivityChooserModel(final d d) {
        this.G.g(d);
        if (this.b()) {
            this.a();
            this.c();
        }
    }
    
    public void setDefaultActionButtonContentDescription(final int a0) {
        this.a0 = a0;
    }
    
    public void setExpandActivityOverflowButtonContentDescription(final int n) {
        this.L.setContentDescription((CharSequence)this.getContext().getString(n));
    }
    
    public void setExpandActivityOverflowButtonDrawable(final Drawable imageDrawable) {
        this.L.setImageDrawable(imageDrawable);
    }
    
    public void setInitialActivityCount(final int v) {
        this.V = v;
    }
    
    public void setOnDismissListener(final PopupWindow$OnDismissListener t) {
        this.T = t;
    }
    
    @t0({ t0.a.I })
    public void setProvider(final androidx.core.view.b p) {
        this.P = p;
    }
    
    @t0({ t0.a.I })
    public static class InnerLayout extends LinearLayout
    {
        private static final int[] G;
        
        static {
            G = new int[] { 16842964 };
        }
        
        public InnerLayout(final Context context, final AttributeSet set) {
            super(context, set);
            final u0 f = u0.F(context, set, InnerLayout.G);
            this.setBackgroundDrawable(f.h(0));
            f.I();
        }
    }
    
    private class f extends BaseAdapter
    {
        public static final int M = Integer.MAX_VALUE;
        public static final int N = 4;
        private static final int O = 0;
        private static final int P = 1;
        private static final int Q = 3;
        private d G;
        private int H;
        private boolean I;
        private boolean J;
        private boolean K;
        
        f() {
            this.H = 4;
        }
        
        public int a() {
            return this.G.f();
        }
        
        public d b() {
            return this.G;
        }
        
        public ResolveInfo c() {
            return this.G.h();
        }
        
        public int d() {
            return this.G.j();
        }
        
        public boolean e() {
            return this.I;
        }
        
        public int f() {
            final int h = this.H;
            this.H = Integer.MAX_VALUE;
            int i = 0;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int count = this.getCount();
            View view = null;
            int max = 0;
            while (i < count) {
                view = this.getView(i, view, null);
                view.measure(measureSpec, measureSpec2);
                max = Math.max(max, view.getMeasuredWidth());
                ++i;
            }
            this.H = h;
            return max;
        }
        
        public void g(final d g) {
            final d b = ActivityChooserView.this.G.b();
            if (b != null && ActivityChooserView.this.isShown()) {
                b.unregisterObserver((Object)ActivityChooserView.this.Q);
            }
            if ((this.G = g) != null && ActivityChooserView.this.isShown()) {
                g.registerObserver((Object)ActivityChooserView.this.Q);
            }
            this.notifyDataSetChanged();
        }
        
        public int getCount() {
            int f;
            final int n = f = this.G.f();
            if (!this.I) {
                f = n;
                if (this.G.h() != null) {
                    f = n - 1;
                }
            }
            int min = Math.min(f, this.H);
            if (this.K) {
                ++min;
            }
            return min;
        }
        
        public Object getItem(final int n) {
            final int itemViewType = this.getItemViewType(n);
            if (itemViewType == 0) {
                int n2 = n;
                if (!this.I) {
                    n2 = n;
                    if (this.G.h() != null) {
                        n2 = n + 1;
                    }
                }
                return this.G.e(n2);
            }
            if (itemViewType == 1) {
                return null;
            }
            throw new IllegalArgumentException();
        }
        
        public long getItemId(final int n) {
            return n;
        }
        
        public int getItemViewType(final int n) {
            if (this.K && n == this.getCount() - 1) {
                return 1;
            }
            return 0;
        }
        
        public View getView(final int n, final View view, final ViewGroup viewGroup) {
            final int itemViewType = this.getItemViewType(n);
            if (itemViewType == 0) {
                View inflate = null;
                Label_0134: {
                    if (view != null) {
                        inflate = view;
                        if (view.getId() == c.a.h.E0) {
                            break Label_0134;
                        }
                    }
                    inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(c.a.k.h, viewGroup, false);
                }
                final PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                final ImageView imageView = (ImageView)inflate.findViewById(c.a.h.w0);
                final ResolveInfo resolveInfo = (ResolveInfo)this.getItem(n);
                imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView)inflate.findViewById(c.a.h.L1)).setText(resolveInfo.loadLabel(packageManager));
                if (this.I && n == 0 && this.J) {
                    inflate.setActivated(true);
                }
                else {
                    inflate.setActivated(false);
                }
                return inflate;
            }
            if (itemViewType == 1) {
                if (view != null) {
                    final View inflate2 = view;
                    if (view.getId() == 1) {
                        return inflate2;
                    }
                }
                final View inflate2 = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(c.a.k.h, viewGroup, false);
                inflate2.setId(1);
                ((TextView)inflate2.findViewById(c.a.h.L1)).setText((CharSequence)ActivityChooserView.this.getContext().getString(c.a.l.e));
                return inflate2;
            }
            throw new IllegalArgumentException();
        }
        
        public int getViewTypeCount() {
            return 3;
        }
        
        public void h(final int h) {
            if (this.H != h) {
                this.H = h;
                this.notifyDataSetChanged();
            }
        }
        
        public void i(final boolean i, final boolean j) {
            if (this.I != i || this.J != j) {
                this.I = i;
                this.J = j;
                this.notifyDataSetChanged();
            }
        }
        
        public void j(final boolean k) {
            if (this.K != k) {
                this.K = k;
                this.notifyDataSetChanged();
            }
        }
    }
    
    private class g implements AdapterView$OnItemClickListener, View$OnClickListener, View$OnLongClickListener, PopupWindow$OnDismissListener
    {
        g() {
        }
        
        private void a() {
            final PopupWindow$OnDismissListener t = ActivityChooserView.this.T;
            if (t != null) {
                t.onDismiss();
            }
        }
        
        public void onClick(final View view) {
            final ActivityChooserView g = ActivityChooserView.this;
            if (view == g.M) {
                g.a();
                final Intent b = ActivityChooserView.this.G.b().b(ActivityChooserView.this.G.b().g(ActivityChooserView.this.G.c()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            }
            else {
                if (view != g.K) {
                    throw new IllegalArgumentException();
                }
                g.U = false;
                g.d(g.V);
            }
        }
        
        public void onDismiss() {
            this.a();
            final androidx.core.view.b p = ActivityChooserView.this.P;
            if (p != null) {
                p.m(false);
            }
        }
        
        public void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
            final int itemViewType = ((f)adapterView.getAdapter()).getItemViewType(n);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
            }
            else {
                ActivityChooserView.this.a();
                final ActivityChooserView g = ActivityChooserView.this;
                if (g.U) {
                    if (n > 0) {
                        g.G.b().r(n);
                    }
                }
                else {
                    if (!g.G.e()) {
                        ++n;
                    }
                    final Intent b = ActivityChooserView.this.G.b().b(n);
                    if (b != null) {
                        b.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b);
                    }
                }
            }
        }
        
        public boolean onLongClick(final View view) {
            final ActivityChooserView g = ActivityChooserView.this;
            if (view == g.M) {
                if (g.G.getCount() > 0) {
                    final ActivityChooserView g2 = ActivityChooserView.this;
                    g2.U = true;
                    g2.d(g2.V);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }
}
