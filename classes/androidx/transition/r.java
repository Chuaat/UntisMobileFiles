// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.j0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.annotation.k0;
import android.graphics.Matrix;
import android.view.View;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

@SuppressLint({ "ViewConstructor" })
class r extends ViewGroup implements o
{
    ViewGroup G;
    View H;
    final View I;
    int J;
    @k0
    private Matrix K;
    private final ViewTreeObserver$OnPreDrawListener L;
    
    r(final View i) {
        super(i.getContext());
        this.L = (ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
            public boolean onPreDraw() {
                j0.l1((View)r.this);
                final r g = r.this;
                final ViewGroup g2 = g.G;
                if (g2 != null) {
                    final View h = g.H;
                    if (h != null) {
                        g2.endViewTransition(h);
                        j0.l1((View)r.this.G);
                        final r g3 = r.this;
                        g3.G = null;
                        g3.H = null;
                    }
                }
                return true;
            }
        };
        this.I = i;
        this.setWillNotDraw(false);
        this.setLayerType(2, (Paint)null);
    }
    
    static r b(final View view, final ViewGroup viewGroup, final Matrix matrix) {
        if (view.getParent() instanceof ViewGroup) {
            final p b = p.b(viewGroup);
            final r e = e(view);
            final boolean b2 = false;
            r r = e;
            int j = b2 ? 1 : 0;
            if (e != null) {
                final p p3 = (p)e.getParent();
                r = e;
                j = (b2 ? 1 : 0);
                if (p3 != b) {
                    j = e.J;
                    p3.removeView((View)e);
                    r = null;
                }
            }
            r r3;
            if (r == null) {
                Matrix matrix2;
                if ((matrix2 = matrix) == null) {
                    matrix2 = new Matrix();
                    c(view, viewGroup, matrix2);
                }
                final r r2 = new r(view);
                r2.h(matrix2);
                p p4;
                if (b == null) {
                    p4 = new p(viewGroup);
                }
                else {
                    b.g();
                    p4 = b;
                }
                d((View)viewGroup, (View)p4);
                d((View)viewGroup, (View)r2);
                p4.a(r2);
                r2.J = j;
                r3 = r2;
            }
            else {
                r3 = r;
                if (matrix != null) {
                    r.h(matrix);
                    r3 = r;
                }
            }
            ++r3.J;
            return r3;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }
    
    static void c(final View view, final ViewGroup viewGroup, final Matrix matrix) {
        final ViewGroup viewGroup2 = (ViewGroup)view.getParent();
        matrix.reset();
        y0.j((View)viewGroup2, matrix);
        matrix.preTranslate((float)(-viewGroup2.getScrollX()), (float)(-viewGroup2.getScrollY()));
        y0.k((View)viewGroup, matrix);
    }
    
    static void d(final View view, final View view2) {
        y0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }
    
    static r e(final View view) {
        return (r)view.getTag(a0.g.v0);
    }
    
    static void f(final View view) {
        final r e = e(view);
        if (e != null && --e.J <= 0) {
            ((p)e.getParent()).removeView((View)e);
        }
    }
    
    static void g(@androidx.annotation.j0 final View view, @k0 final r r) {
        view.setTag(a0.g.v0, (Object)r);
    }
    
    public void a(final ViewGroup g, final View h) {
        this.G = g;
        this.H = h;
    }
    
    void h(@androidx.annotation.j0 final Matrix k) {
        this.K = k;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.I, this);
        this.I.getViewTreeObserver().addOnPreDrawListener(this.L);
        y0.i(this.I, 4);
        if (this.I.getParent() != null) {
            ((View)this.I.getParent()).invalidate();
        }
    }
    
    protected void onDetachedFromWindow() {
        this.I.getViewTreeObserver().removeOnPreDrawListener(this.L);
        y0.i(this.I, 0);
        g(this.I, null);
        if (this.I.getParent() != null) {
            ((View)this.I.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        d.a(canvas, true);
        canvas.setMatrix(this.K);
        y0.i(this.I, 0);
        this.I.invalidate();
        y0.i(this.I, 4);
        this.drawChild(canvas, this.I, this.getDrawingTime());
        d.a(canvas, false);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (e(this.I) == this) {
            if (visibility == 0) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            y0.i(this.I, visibility);
        }
    }
}
