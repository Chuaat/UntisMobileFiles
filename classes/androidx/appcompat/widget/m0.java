// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.View$MeasureSpec;
import android.widget.AdapterView;
import android.content.res.Configuration;
import android.view.View$OnClickListener;
import android.widget.AbsListView$LayoutParams;
import android.graphics.drawable.Drawable;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.widget.SpinnerAdapter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.a;
import androidx.annotation.j0;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.ViewPropertyAnimator;
import android.widget.Spinner;
import android.view.animation.Interpolator;
import androidx.annotation.t0;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.HorizontalScrollView;

@t0({ t0.a.I })
public class m0 extends HorizontalScrollView implements AdapterView$OnItemSelectedListener
{
    private static final String R = "ScrollingTabContainerView";
    private static final Interpolator S;
    private static final int T = 200;
    Runnable G;
    private c H;
    LinearLayoutCompat I;
    private Spinner J;
    private boolean K;
    int L;
    int M;
    private int N;
    private int O;
    protected ViewPropertyAnimator P;
    protected final e Q;
    
    static {
        S = (Interpolator)new DecelerateInterpolator();
    }
    
    public m0(@j0 final Context context) {
        super(context);
        this.Q = new e();
        this.setHorizontalScrollBarEnabled(false);
        final a b = a.b(context);
        this.setContentHeight(b.f());
        this.M = b.e();
        this.addView((View)(this.I = this.f()), new ViewGroup$LayoutParams(-2, -1));
    }
    
    private Spinner e() {
        final u u = new u(this.getContext(), null, c.a.c.m);
        u.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat.b(-2, -1));
        u.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        return u;
    }
    
    private LinearLayoutCompat f() {
        final LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(this.getContext(), null, c.a.c.g);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat.b(-2, -1));
        return linearLayoutCompat;
    }
    
    private boolean h() {
        final Spinner j = this.J;
        return j != null && j.getParent() == this;
    }
    
    private void i() {
        if (this.h()) {
            return;
        }
        if (this.J == null) {
            this.J = this.e();
        }
        this.removeView((View)this.I);
        this.addView((View)this.J, new ViewGroup$LayoutParams(-2, -1));
        if (this.J.getAdapter() == null) {
            this.J.setAdapter((SpinnerAdapter)new b());
        }
        final Runnable g = this.G;
        if (g != null) {
            this.removeCallbacks(g);
            this.G = null;
        }
        this.J.setSelection(this.O);
    }
    
    private boolean j() {
        if (!this.h()) {
            return false;
        }
        this.removeView((View)this.J);
        this.addView((View)this.I, new ViewGroup$LayoutParams(-2, -1));
        this.setTabSelected(this.J.getSelectedItemPosition());
        return false;
    }
    
    public void a(final androidx.appcompat.app.a.f f, final int n, final boolean b) {
        final d g = this.g(f, false);
        this.I.addView((View)g, n, (ViewGroup$LayoutParams)new LinearLayoutCompat.b(0, -1, 1.0f));
        final Spinner j = this.J;
        if (j != null) {
            ((b)j.getAdapter()).notifyDataSetChanged();
        }
        if (b) {
            g.setSelected(true);
        }
        if (this.K) {
            this.requestLayout();
        }
    }
    
    public void b(final androidx.appcompat.app.a.f f, final boolean b) {
        final d g = this.g(f, false);
        this.I.addView((View)g, (ViewGroup$LayoutParams)new LinearLayoutCompat.b(0, -1, 1.0f));
        final Spinner j = this.J;
        if (j != null) {
            ((b)j.getAdapter()).notifyDataSetChanged();
        }
        if (b) {
            g.setSelected(true);
        }
        if (this.K) {
            this.requestLayout();
        }
    }
    
    public void c(final int n) {
        final View child = this.I.getChildAt(n);
        final Runnable g = this.G;
        if (g != null) {
            this.removeCallbacks(g);
        }
        this.post(this.G = new Runnable() {
            @Override
            public void run() {
                m0.this.smoothScrollTo(child.getLeft() - (m0.this.getWidth() - child.getWidth()) / 2, 0);
                m0.this.G = null;
            }
        });
    }
    
    public void d(final int n) {
        final ViewPropertyAnimator p = this.P;
        if (p != null) {
            p.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator;
        if (n == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            viewPropertyAnimator = this.animate().alpha(1.0f);
        }
        else {
            viewPropertyAnimator = this.animate().alpha(0.0f);
        }
        viewPropertyAnimator.setDuration(200L);
        viewPropertyAnimator.setInterpolator((TimeInterpolator)m0.S);
        viewPropertyAnimator.setListener((Animator$AnimatorListener)this.Q.a(viewPropertyAnimator, n));
        viewPropertyAnimator.start();
    }
    
    d g(final androidx.appcompat.app.a.f f, final boolean b) {
        final d d = new d(this.getContext(), f, b);
        if (b) {
            d.setBackgroundDrawable((Drawable)null);
            d.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, this.N));
        }
        else {
            d.setFocusable(true);
            if (this.H == null) {
                this.H = new c();
            }
            d.setOnClickListener((View$OnClickListener)this.H);
        }
        return d;
    }
    
    public void k() {
        this.I.removeAllViews();
        final Spinner j = this.J;
        if (j != null) {
            ((b)j.getAdapter()).notifyDataSetChanged();
        }
        if (this.K) {
            this.requestLayout();
        }
    }
    
    public void l(final int n) {
        this.I.removeViewAt(n);
        final Spinner j = this.J;
        if (j != null) {
            ((b)j.getAdapter()).notifyDataSetChanged();
        }
        if (this.K) {
            this.requestLayout();
        }
    }
    
    public void m(final int n) {
        ((d)this.I.getChildAt(n)).c();
        final Spinner j = this.J;
        if (j != null) {
            ((b)j.getAdapter()).notifyDataSetChanged();
        }
        if (this.K) {
            this.requestLayout();
        }
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Runnable g = this.G;
        if (g != null) {
            this.post(g);
        }
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final a b = a.b(this.getContext());
        this.setContentHeight(b.f());
        this.M = b.e();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Runnable g = this.G;
        if (g != null) {
            this.removeCallbacks(g);
        }
    }
    
    public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        ((d)view).b().g();
    }
    
    public void onMeasure(int measuredWidth, int l) {
        l = View$MeasureSpec.getMode(measuredWidth);
        final int n = 1;
        final boolean fillViewport = l == 1073741824;
        this.setFillViewport(fillViewport);
        final int childCount = this.I.getChildCount();
        if (childCount > 1 && (l == 1073741824 || l == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.L = (int)(View$MeasureSpec.getSize(measuredWidth) * 0.4f);
            }
            else {
                this.L = View$MeasureSpec.getSize(measuredWidth) / 2;
            }
            l = Math.min(this.L, this.M);
        }
        else {
            l = -1;
        }
        this.L = l;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.N, 1073741824);
        if (!fillViewport && this.K) {
            l = n;
        }
        else {
            l = 0;
        }
        Label_0184: {
            if (l != 0) {
                this.I.measure(0, measureSpec);
                if (this.I.getMeasuredWidth() > View$MeasureSpec.getSize(measuredWidth)) {
                    this.i();
                    break Label_0184;
                }
            }
            this.j();
        }
        l = this.getMeasuredWidth();
        super.onMeasure(measuredWidth, measureSpec);
        measuredWidth = this.getMeasuredWidth();
        if (fillViewport && l != measuredWidth) {
            this.setTabSelected(this.O);
        }
    }
    
    public void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public void setAllowCollapse(final boolean k) {
        this.K = k;
    }
    
    public void setContentHeight(final int n) {
        this.N = n;
        this.requestLayout();
    }
    
    public void setTabSelected(final int n) {
        this.O = n;
        for (int childCount = this.I.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.I.getChildAt(i);
            final boolean selected = i == n;
            child.setSelected(selected);
            if (selected) {
                this.c(n);
            }
        }
        final Spinner j = this.J;
        if (j != null && n >= 0) {
            j.setSelection(n);
        }
    }
    
    private class b extends BaseAdapter
    {
        b() {
        }
        
        public int getCount() {
            return m0.this.I.getChildCount();
        }
        
        public Object getItem(final int n) {
            return ((d)m0.this.I.getChildAt(n)).b();
        }
        
        public long getItemId(final int n) {
            return n;
        }
        
        public View getView(final int n, View g, final ViewGroup viewGroup) {
            if (g == null) {
                g = (View)m0.this.g((androidx.appcompat.app.a.f)this.getItem(n), true);
            }
            else {
                ((d)g).a((androidx.appcompat.app.a.f)this.getItem(n));
            }
            return g;
        }
    }
    
    private class c implements View$OnClickListener
    {
        c() {
        }
        
        public void onClick(final View view) {
            ((d)view).b().g();
            for (int childCount = m0.this.I.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = m0.this.I.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
    
    private class d extends LinearLayout
    {
        private static final String M = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] G;
        private androidx.appcompat.app.a.f H;
        private TextView I;
        private ImageView J;
        private View K;
        
        public d(final Context context, final androidx.appcompat.app.a.f h, final boolean b) {
            final int h2 = c.a.c.h;
            super(context, (AttributeSet)null, h2);
            final int[] g = { 16842964 };
            this.G = g;
            this.H = h;
            final u0 g2 = u0.G(context, null, g, h2, 0);
            if (g2.C(0)) {
                this.setBackgroundDrawable(g2.h(0));
            }
            g2.I();
            if (b) {
                this.setGravity(8388627);
            }
            this.c();
        }
        
        public void a(final androidx.appcompat.app.a.f h) {
            this.H = h;
            this.c();
        }
        
        public androidx.appcompat.app.a.f b() {
            return this.H;
        }
        
        public void c() {
            final androidx.appcompat.app.a.f h = this.H;
            final View b = h.b();
            CharSequence a = null;
            if (b != null) {
                final ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup)parent).removeView(b);
                    }
                    this.addView(b);
                }
                this.K = b;
                final TextView i = this.I;
                if (i != null) {
                    i.setVisibility(8);
                }
                final ImageView j = this.J;
                if (j != null) {
                    j.setVisibility(8);
                    this.J.setImageDrawable((Drawable)null);
                }
            }
            else {
                final View k = this.K;
                if (k != null) {
                    this.removeView(k);
                    this.K = null;
                }
                final Drawable c = h.c();
                final CharSequence f = h.f();
                if (c != null) {
                    if (this.J == null) {
                        final AppCompatImageView l = new AppCompatImageView(this.getContext());
                        final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        l.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        this.addView((View)l, 0);
                        this.J = l;
                    }
                    this.J.setImageDrawable(c);
                    this.J.setVisibility(0);
                }
                else {
                    final ImageView m = this.J;
                    if (m != null) {
                        m.setVisibility(8);
                        this.J.setImageDrawable((Drawable)null);
                    }
                }
                final boolean b2 = TextUtils.isEmpty(f) ^ true;
                if (b2) {
                    if (this.I == null) {
                        final AppCompatTextView i2 = new AppCompatTextView(this.getContext(), null, c.a.c.i);
                        i2.setEllipsize(TextUtils$TruncateAt.END);
                        final LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(-2, -2);
                        layoutParams2.gravity = 16;
                        i2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        this.addView((View)i2);
                        this.I = i2;
                    }
                    this.I.setText(f);
                    this.I.setVisibility(0);
                }
                else {
                    final TextView i3 = this.I;
                    if (i3 != null) {
                        i3.setVisibility(8);
                        this.I.setText((CharSequence)null);
                    }
                }
                final ImageView j2 = this.J;
                if (j2 != null) {
                    j2.setContentDescription(h.a());
                }
                if (!b2) {
                    a = h.a();
                }
                w0.a((View)this, a);
            }
        }
        
        public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }
        
        public void onMeasure(int measuredWidth, final int n) {
            super.onMeasure(measuredWidth, n);
            if (m0.this.L > 0) {
                measuredWidth = this.getMeasuredWidth();
                final int l = m0.this.L;
                if (measuredWidth > l) {
                    super.onMeasure(View$MeasureSpec.makeMeasureSpec(l, 1073741824), n);
                }
            }
        }
        
        public void setSelected(final boolean selected) {
            final boolean b = this.isSelected() != selected;
            super.setSelected(selected);
            if (b && selected) {
                this.sendAccessibilityEvent(4);
            }
        }
    }
    
    protected class e extends AnimatorListenerAdapter
    {
        private boolean a;
        private int b;
        
        protected e() {
            this.a = false;
        }
        
        public e a(final ViewPropertyAnimator p2, final int b) {
            this.b = b;
            m0.this.P = p2;
            return this;
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.a = true;
        }
        
        public void onAnimationEnd(final Animator animator) {
            if (this.a) {
                return;
            }
            final m0 c = m0.this;
            c.P = null;
            c.setVisibility(this.b);
        }
        
        public void onAnimationStart(final Animator animator) {
            m0.this.setVisibility(0);
            this.a = false;
        }
    }
}
