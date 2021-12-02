// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.content.res.Configuration;
import androidx.core.view.q0;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import androidx.core.view.p0;
import android.content.Context;
import android.view.ViewGroup;

abstract class a extends ViewGroup
{
    private static final int O = 200;
    protected final b G;
    protected final Context H;
    protected ActionMenuView I;
    protected c J;
    protected int K;
    protected p0 L;
    private boolean M;
    private boolean N;
    
    a(@j0 final Context context) {
        this(context, null);
    }
    
    a(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    a(@j0 final Context h, @k0 final AttributeSet set, final int n) {
        super(h, set, n);
        this.G = new b();
        final TypedValue typedValue = new TypedValue();
        if (h.getTheme().resolveAttribute(c.a.c.c, typedValue, true) && typedValue.resourceId != 0) {
            this.H = (Context)new ContextThemeWrapper(h, typedValue.resourceId);
        }
        else {
            this.H = h;
        }
    }
    
    static /* synthetic */ void a(final a a, final int visibility) {
        a.setVisibility(visibility);
    }
    
    static /* synthetic */ void b(final a a, final int visibility) {
        a.setVisibility(visibility);
    }
    
    protected static int k(int n, final int n2, final boolean b) {
        if (b) {
            n -= n2;
        }
        else {
            n += n2;
        }
        return n;
    }
    
    public void c(final int n) {
        this.n(n, 200L).w();
    }
    
    public boolean d() {
        return this.i() && this.getVisibility() == 0;
    }
    
    public void e() {
        final c j = this.J;
        if (j != null) {
            j.C();
        }
    }
    
    public boolean f() {
        final c j = this.J;
        return j != null && j.F();
    }
    
    public boolean g() {
        final c j = this.J;
        return j != null && j.H();
    }
    
    public int getAnimatedVisibility() {
        if (this.L != null) {
            return this.G.b;
        }
        return this.getVisibility();
    }
    
    public int getContentHeight() {
        return this.K;
    }
    
    public boolean h() {
        final c j = this.J;
        return j != null && j.I();
    }
    
    public boolean i() {
        final c j = this.J;
        return j != null && j.J();
    }
    
    protected int j(final View view, final int n, final int n2, final int n3) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth() - n3);
    }
    
    protected int l(final View view, int n, int n2, final int n3, final boolean b) {
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        n2 += (n3 - measuredHeight) / 2;
        if (b) {
            view.layout(n - measuredWidth, n2, n, measuredHeight + n2);
        }
        else {
            view.layout(n, n2, n + measuredWidth, measuredHeight + n2);
        }
        n = measuredWidth;
        if (b) {
            n = -measuredWidth;
        }
        return n;
    }
    
    public void m() {
        this.post((Runnable)new Runnable() {
            @Override
            public void run() {
                a.this.o();
            }
        });
    }
    
    public p0 n(final int n, final long n2) {
        final p0 l = this.L;
        if (l != null) {
            l.c();
        }
        p0 p2;
        if (n == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            p2 = androidx.core.view.j0.f((View)this).a(1.0f);
        }
        else {
            p2 = androidx.core.view.j0.f((View)this).a(0.0f);
        }
        p2.q(n2);
        p2.s(this.G.d(p2, n));
        return p2;
    }
    
    public boolean o() {
        final c j = this.J;
        return j != null && j.R();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, c.a.n.a, c.a.c.f, 0);
        this.setContentHeight(obtainStyledAttributes.getLayoutDimension(c.a.n.o, 0));
        obtainStyledAttributes.recycle();
        final c j = this.J;
        if (j != null) {
            j.K(configuration);
        }
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.N = false;
        }
        if (!this.N) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.N = false;
        }
        return true;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = false;
        }
        if (!this.M) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
        }
        return true;
    }
    
    public void setContentHeight(final int k) {
        this.K = k;
        this.requestLayout();
    }
    
    public void setVisibility(final int visibility) {
        if (visibility != this.getVisibility()) {
            final p0 l = this.L;
            if (l != null) {
                l.c();
            }
            super.setVisibility(visibility);
        }
    }
    
    protected class b implements q0
    {
        private boolean a;
        int b;
        
        protected b() {
            this.a = false;
        }
        
        @Override
        public void a(final View view) {
            this.a = true;
        }
        
        @Override
        public void b(final View view) {
            if (this.a) {
                return;
            }
            final a c = androidx.appcompat.widget.a.this;
            c.L = null;
            androidx.appcompat.widget.a.b(c, this.b);
        }
        
        @Override
        public void c(final View view) {
            androidx.appcompat.widget.a.a(androidx.appcompat.widget.a.this, 0);
            this.a = false;
        }
        
        public b d(final p0 l, final int b) {
            androidx.appcompat.widget.a.this.L = l;
            this.b = b;
            return this;
        }
    }
}
