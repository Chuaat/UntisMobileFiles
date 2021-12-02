// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.view.animation.Interpolator;
import android.content.Context;
import android.widget.OverScroller;

@Deprecated
public final class q
{
    OverScroller a;
    
    q(final Context context, final Interpolator interpolator) {
        OverScroller a;
        if (interpolator != null) {
            a = new OverScroller(context, interpolator);
        }
        else {
            a = new OverScroller(context);
        }
        this.a = a;
    }
    
    @Deprecated
    public static q c(final Context context) {
        return d(context, null);
    }
    
    @Deprecated
    public static q d(final Context context, final Interpolator interpolator) {
        return new q(context, interpolator);
    }
    
    @Deprecated
    public void a() {
        this.a.abortAnimation();
    }
    
    @Deprecated
    public boolean b() {
        return this.a.computeScrollOffset();
    }
    
    @Deprecated
    public void e(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a.fling(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    @Deprecated
    public void f(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        this.a.fling(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    @Deprecated
    public float g() {
        return this.a.getCurrVelocity();
    }
    
    @Deprecated
    public int h() {
        return this.a.getCurrX();
    }
    
    @Deprecated
    public int i() {
        return this.a.getCurrY();
    }
    
    @Deprecated
    public int j() {
        return this.a.getFinalX();
    }
    
    @Deprecated
    public int k() {
        return this.a.getFinalY();
    }
    
    @Deprecated
    public boolean l() {
        return this.a.isFinished();
    }
    
    @Deprecated
    public boolean m() {
        return this.a.isOverScrolled();
    }
    
    @Deprecated
    public void n(final int n, final int n2, final int n3) {
        this.a.notifyHorizontalEdgeReached(n, n2, n3);
    }
    
    @Deprecated
    public void o(final int n, final int n2, final int n3) {
        this.a.notifyVerticalEdgeReached(n, n2, n3);
    }
    
    @Deprecated
    public boolean p(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return this.a.springBack(n, n2, n3, n4, n5, n6);
    }
    
    @Deprecated
    public void q(final int n, final int n2, final int n3, final int n4) {
        this.a.startScroll(n, n2, n3, n4);
    }
    
    @Deprecated
    public void r(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.a.startScroll(n, n2, n3, n4, n5);
    }
}
