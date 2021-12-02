// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ViewParent;
import android.os.SystemClock;
import androidx.appcompat.view.menu.q;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.View;
import androidx.annotation.t0;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

@t0({ t0.a.I })
public abstract class e0 implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    private final float G;
    private final int H;
    private final int I;
    final View J;
    private Runnable K;
    private Runnable L;
    private boolean M;
    private int N;
    private final int[] O;
    
    public e0(final View j) {
        this.O = new int[2];
        (this.J = j).setLongClickable(true);
        j.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.G = (float)ViewConfiguration.get(j.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.H = tapTimeout;
        this.I = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    private void a() {
        final Runnable l = this.L;
        if (l != null) {
            this.J.removeCallbacks(l);
        }
        final Runnable k = this.K;
        if (k != null) {
            this.J.removeCallbacks(k);
        }
    }
    
    private boolean f(final MotionEvent motionEvent) {
        final View j = this.J;
        final q b = this.b();
        boolean b3;
        final boolean b2 = b3 = false;
        if (b != null) {
            if (!b.c()) {
                b3 = b2;
            }
            else {
                final c0 c0 = (c0)b.l();
                b3 = b2;
                if (c0 != null) {
                    if (!c0.isShown()) {
                        b3 = b2;
                    }
                    else {
                        final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                        this.i(j, obtainNoHistory);
                        this.j((View)c0, obtainNoHistory);
                        final boolean f = c0.f(obtainNoHistory, this.N);
                        obtainNoHistory.recycle();
                        final int actionMasked = motionEvent.getActionMasked();
                        final boolean b4 = actionMasked != 1 && actionMasked != 3;
                        b3 = b2;
                        if (f) {
                            b3 = b2;
                            if (b4) {
                                b3 = true;
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    private boolean g(final MotionEvent motionEvent) {
        final View j = this.J;
        if (!j.isEnabled()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.N);
                    if (pointerIndex >= 0 && !h(j, motionEvent.getX(pointerIndex), motionEvent.getY(pointerIndex), this.G)) {
                        this.a();
                        j.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    return false;
                }
            }
            this.a();
        }
        else {
            this.N = motionEvent.getPointerId(0);
            if (this.K == null) {
                this.K = new a();
            }
            j.postDelayed(this.K, (long)this.H);
            if (this.L == null) {
                this.L = new b();
            }
            j.postDelayed(this.L, (long)this.I);
        }
        return false;
    }
    
    private static boolean h(final View view, final float n, final float n2, final float n3) {
        final float n4 = -n3;
        return n >= n4 && n2 >= n4 && n < view.getRight() - view.getLeft() + n3 && n2 < view.getBottom() - view.getTop() + n3;
    }
    
    private boolean i(final View view, final MotionEvent motionEvent) {
        final int[] o = this.O;
        view.getLocationOnScreen(o);
        motionEvent.offsetLocation((float)o[0], (float)o[1]);
        return true;
    }
    
    private boolean j(final View view, final MotionEvent motionEvent) {
        final int[] o = this.O;
        view.getLocationOnScreen(o);
        motionEvent.offsetLocation((float)(-o[0]), (float)(-o[1]));
        return true;
    }
    
    public abstract q b();
    
    protected boolean c() {
        final q b = this.b();
        if (b != null && !b.c()) {
            b.a();
        }
        return true;
    }
    
    protected boolean d() {
        final q b = this.b();
        if (b != null && b.c()) {
            b.dismiss();
        }
        return true;
    }
    
    void e() {
        this.a();
        final View j = this.J;
        if (j.isEnabled()) {
            if (!j.isLongClickable()) {
                if (!this.c()) {
                    return;
                }
                j.getParent().requestDisallowInterceptTouchEvent(true);
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                j.onTouchEvent(obtain);
                obtain.recycle();
                this.M = true;
            }
        }
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean m = this.M;
        final boolean b = true;
        boolean i;
        if (m) {
            i = (this.f(motionEvent) || !this.d());
        }
        else {
            final boolean b2 = i = (this.g(motionEvent) && this.c());
            if (b2) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.J.onTouchEvent(obtain);
                obtain.recycle();
                i = b2;
            }
        }
        this.M = i;
        boolean b3 = b;
        if (!i) {
            b3 = (m && b);
        }
        return b3;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.M = false;
        this.N = -1;
        final Runnable k = this.K;
        if (k != null) {
            this.J.removeCallbacks(k);
        }
    }
    
    private class a implements Runnable
    {
        a() {
        }
        
        @Override
        public void run() {
            final ViewParent parent = e0.this.J.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    private class b implements Runnable
    {
        b() {
        }
        
        @Override
        public void run() {
            e0.this.e();
        }
    }
}
