// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import androidx.annotation.a1;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;

final class d
{
    private final ViewPager2 a;
    private final g b;
    private final RecyclerView c;
    private VelocityTracker d;
    private int e;
    private float f;
    private int g;
    private long h;
    
    d(final ViewPager2 a, final g b, final RecyclerView c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void a(final long n, final int n2, final float n3, final float n4) {
        final MotionEvent obtain = MotionEvent.obtain(this.h, n, n2, n3, n4, 0);
        this.d.addMovement(obtain);
        obtain.recycle();
    }
    
    private void c() {
        final VelocityTracker d = this.d;
        if (d == null) {
            this.d = VelocityTracker.obtain();
            this.e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
        }
        else {
            d.clear();
        }
    }
    
    @a1
    boolean b() {
        if (this.b.i()) {
            return false;
        }
        this.g = 0;
        this.f = 0;
        this.h = SystemClock.uptimeMillis();
        this.c();
        this.b.m();
        if (!this.b.k()) {
            this.c.R1();
        }
        this.a(this.h, 0, 0.0f, 0.0f);
        return true;
    }
    
    @a1
    boolean d() {
        if (!this.b.j()) {
            return false;
        }
        this.b.o();
        final VelocityTracker d = this.d;
        d.computeCurrentVelocity(1000, (float)this.e);
        if (!this.c.m0((int)d.getXVelocity(), (int)d.getYVelocity())) {
            this.a.v();
        }
        return true;
    }
    
    @a1
    boolean e(float f) {
        final boolean j = this.b.j();
        final int n = 0;
        if (!j) {
            return false;
        }
        f = this.f - f;
        this.f = f;
        int round = Math.round(f - this.g);
        this.g += round;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final boolean b = this.a.getOrientation() == 0;
        int n2;
        if (b) {
            n2 = round;
        }
        else {
            n2 = 0;
        }
        if (b) {
            round = n;
        }
        if (b) {
            f = this.f;
        }
        else {
            f = 0.0f;
        }
        float f2;
        if (b) {
            f2 = 0.0f;
        }
        else {
            f2 = this.f;
        }
        this.c.scrollBy(n2, round);
        this.a(uptimeMillis, 2, f, f2);
        return true;
    }
    
    boolean f() {
        return this.b.j();
    }
}
