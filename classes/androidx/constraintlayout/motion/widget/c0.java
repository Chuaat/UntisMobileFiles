// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Collection;
import android.util.Log;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import java.util.HashSet;
import java.util.ArrayList;

public class c0
{
    private final s a;
    private ArrayList<b0> b;
    private HashSet<View> c;
    private String d;
    ArrayList<b0.b> e;
    ArrayList<b0.b> f;
    
    public c0(final s a) {
        this.b = new ArrayList<b0>();
        this.d = "ViewTransitionController";
        this.f = new ArrayList<b0.b>();
        this.a = a;
    }
    
    private void i(final b0 b0, final boolean b2) {
        ConstraintLayout.getSharedValues().a(b0.i(), (l.a)new l.a() {
            final /* synthetic */ int H = b0.i();
            final /* synthetic */ int J = b0.g();
            
            @Override
            public void a(int i, int n, int n2) {
                n2 = b0.h();
                b0.r(n);
                if (this.H == i && n2 != n) {
                    if (b2) {
                        if (this.J == n) {
                            View child;
                            e f0;
                            b0 g;
                            c0 k;
                            for (n = c0.this.a.getChildCount(), i = 0; i < n; ++i) {
                                child = c0.this.a.getChildAt(i);
                                if (b0.m(child)) {
                                    n2 = c0.this.a.getCurrentState();
                                    f0 = c0.this.a.F0(n2);
                                    g = b0;
                                    k = c0.this;
                                    g.c(k, k.a, n2, f0, child);
                                }
                            }
                        }
                    }
                    else if (this.J != n) {
                        View child2;
                        e f2;
                        b0 g2;
                        c0 j;
                        for (n = c0.this.a.getChildCount(), i = 0; i < n; ++i) {
                            child2 = c0.this.a.getChildAt(i);
                            if (b0.m(child2)) {
                                n2 = c0.this.a.getCurrentState();
                                f2 = c0.this.a.F0(n2);
                                g2 = b0;
                                j = c0.this;
                                g2.c(j, j.a, n2, f2, child2);
                            }
                        }
                    }
                }
            }
        });
    }
    
    private void n(final b0 b0, final View... array) {
        final int currentState = this.a.getCurrentState();
        if (b0.f != 2) {
            if (currentState == -1) {
                final String d = this.d;
                final StringBuilder sb = new StringBuilder();
                sb.append("No support for ViewTransition within transition yet. Currently: ");
                sb.append(this.a.toString());
                Log.w(d, sb.toString());
                return;
            }
            final e f0 = this.a.F0(currentState);
            if (f0 == null) {
                return;
            }
            b0.c(this, this.a, currentState, f0, array);
        }
        else {
            b0.c(this, this.a, currentState, null, array);
        }
    }
    
    public void b(final b0 e) {
        this.b.add(e);
        this.c = null;
        boolean b;
        if (e.j() == 4) {
            b = true;
        }
        else {
            if (e.j() != 5) {
                return;
            }
            b = false;
        }
        this.i(e, b);
    }
    
    void c(final b0.b e) {
        if (this.e == null) {
            this.e = new ArrayList<b0.b>();
        }
        this.e.add(e);
    }
    
    void d() {
        final ArrayList<b0.b> e = this.e;
        if (e == null) {
            return;
        }
        final Iterator<b0.b> iterator = e.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.e.removeAll(this.f);
        this.f.clear();
        if (this.e.isEmpty()) {
            this.e = null;
        }
    }
    
    boolean e(final int n, final o o) {
        for (final b0 b0 : this.b) {
            if (b0.e() == n) {
                b0.g.a(o);
                return true;
            }
        }
        return false;
    }
    
    void f(final int n, final boolean b) {
        for (final b0 b2 : this.b) {
            if (b2.e() == n) {
                b2.o(b);
                break;
            }
        }
    }
    
    void g() {
        this.a.invalidate();
    }
    
    boolean h(final int n) {
        for (final b0 b0 : this.b) {
            if (b0.e() == n) {
                return b0.k();
            }
        }
        return false;
    }
    
    void j(final int n) {
        while (true) {
            for (final b0 o : this.b) {
                if (o.e() == n) {
                    if (o != null) {
                        this.c = null;
                        this.b.remove(o);
                    }
                    return;
                }
            }
            b0 o = null;
            continue;
        }
    }
    
    void k(final b0.b e) {
        this.f.add(e);
    }
    
    void l(final MotionEvent motionEvent) {
        final int currentState = this.a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.c == null) {
            this.c = new HashSet<View>();
            for (final b0 b0 : this.b) {
                for (int childCount = this.a.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = this.a.getChildAt(i);
                    if (b0.m(child)) {
                        child.getId();
                        this.c.add(child);
                    }
                }
            }
        }
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final Rect rect = new Rect();
        final int action = motionEvent.getAction();
        final ArrayList<b0.b> e = this.e;
        if (e != null && !e.isEmpty()) {
            final Iterator<b0.b> iterator2 = this.e.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            final e f0 = this.a.F0(currentState);
            for (final b0 b2 : this.b) {
                if (b2.u(action)) {
                    for (final View view : this.c) {
                        if (!b2.m(view)) {
                            continue;
                        }
                        view.getHitRect(rect);
                        if (!rect.contains((int)x, (int)y)) {
                            continue;
                        }
                        b2.c(this, this.a, currentState, f0, view);
                    }
                }
            }
        }
    }
    
    void m(final int n, final View... array) {
        final ArrayList<View> list = new ArrayList<View>();
        final Iterator<b0> iterator = this.b.iterator();
        b0 b0 = null;
        while (iterator.hasNext()) {
            final b0 b2 = iterator.next();
            if (b2.e() == n) {
                for (final View e : array) {
                    if (b2.d(e)) {
                        list.add(e);
                    }
                }
                if (!list.isEmpty()) {
                    this.n(b2, (View[])list.toArray(new View[0]));
                    list.clear();
                }
                b0 = b2;
            }
        }
        if (b0 == null) {
            Log.e(this.d, " Could not find ViewTransition");
        }
    }
}
