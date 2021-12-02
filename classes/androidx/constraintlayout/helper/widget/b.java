// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.helper.widget;

import androidx.annotation.p0;
import androidx.constraintlayout.widget.e;
import android.util.Log;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import java.util.Iterator;
import androidx.constraintlayout.motion.widget.u;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.motion.widget.s;
import android.view.View;
import java.util.ArrayList;
import androidx.constraintlayout.motion.widget.p;

public class b extends p
{
    private static final boolean q0 = false;
    private static final String r0 = "Carousel";
    public static final int s0 = 1;
    public static final int t0 = 2;
    private b T;
    private final ArrayList<View> U;
    private int V;
    private int W;
    private s a0;
    private int b0;
    private boolean c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private float h0;
    private int i0;
    private int j0;
    private int k0;
    private float l0;
    private int m0;
    private int n0;
    int o0;
    Runnable p0;
    
    public b(final Context context) {
        super(context);
        this.T = null;
        this.U = new ArrayList<View>();
        this.V = 0;
        this.W = 0;
        this.b0 = -1;
        this.c0 = false;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = 0.9f;
        this.i0 = 0;
        this.j0 = 4;
        this.k0 = 1;
        this.l0 = 2.0f;
        this.m0 = -1;
        this.n0 = 200;
        this.o0 = -1;
        this.p0 = new Runnable() {
            @Override
            public void run() {
                b.this.a0.setProgress(0.0f);
                b.this.a0();
                b.this.T.a(b.this.W);
                final float velocity = b.this.a0.getVelocity();
                if (b.this.k0 == 2 && velocity > b.this.l0 && b.this.W < b.this.T.c() - 1) {
                    final float r = b.this.h0;
                    if (b.this.W == 0 && b.this.V > b.this.W) {
                        return;
                    }
                    if (b.this.W == b.this.T.c() - 1 && b.this.V < b.this.W) {
                        return;
                    }
                    b.this.a0.post((Runnable)new Runnable() {
                        final /* synthetic */ float G;
                        
                        @Override
                        public void run() {
                            b.this.a0.f1(5, 1.0f, this.G);
                        }
                    });
                }
            }
        };
    }
    
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.T = null;
        this.U = new ArrayList<View>();
        this.V = 0;
        this.W = 0;
        this.b0 = -1;
        this.c0 = false;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = 0.9f;
        this.i0 = 0;
        this.j0 = 4;
        this.k0 = 1;
        this.l0 = 2.0f;
        this.m0 = -1;
        this.n0 = 200;
        this.o0 = -1;
        this.p0 = new Runnable() {
            @Override
            public void run() {
                b.this.a0.setProgress(0.0f);
                b.this.a0();
                b.this.T.a(b.this.W);
                final float velocity = b.this.a0.getVelocity();
                if (b.this.k0 == 2 && velocity > b.this.l0 && b.this.W < b.this.T.c() - 1) {
                    final float r = b.this.h0;
                    if (b.this.W == 0 && b.this.V > b.this.W) {
                        return;
                    }
                    if (b.this.W == b.this.T.c() - 1 && b.this.V < b.this.W) {
                        return;
                    }
                    b.this.a0.post((Runnable)new Runnable() {
                        final /* synthetic */ float G;
                        
                        @Override
                        public void run() {
                            b.this.a0.f1(5, 1.0f, this.G);
                        }
                    });
                }
            }
        };
        this.V(context, set);
    }
    
    public b(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.T = null;
        this.U = new ArrayList<View>();
        this.V = 0;
        this.W = 0;
        this.b0 = -1;
        this.c0 = false;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = 0.9f;
        this.i0 = 0;
        this.j0 = 4;
        this.k0 = 1;
        this.l0 = 2.0f;
        this.m0 = -1;
        this.n0 = 200;
        this.o0 = -1;
        this.p0 = new Runnable() {
            @Override
            public void run() {
                b.this.a0.setProgress(0.0f);
                b.this.a0();
                b.this.T.a(b.this.W);
                final float velocity = b.this.a0.getVelocity();
                if (b.this.k0 == 2 && velocity > b.this.l0 && b.this.W < b.this.T.c() - 1) {
                    final float r = b.this.h0;
                    if (b.this.W == 0 && b.this.V > b.this.W) {
                        return;
                    }
                    if (b.this.W == b.this.T.c() - 1 && b.this.V < b.this.W) {
                        return;
                    }
                    b.this.a0.post((Runnable)new Runnable() {
                        final /* synthetic */ float G = velocity * r;
                        
                        @Override
                        public void run() {
                            b.this.a0.f1(5, 1.0f, this.G);
                        }
                    });
                }
            }
        };
        this.V(context, set);
    }
    
    private void T(final boolean b) {
        final Iterator<u.b> iterator = this.a0.getDefinedTransitions().iterator();
        while (iterator.hasNext()) {
            iterator.next().Q(b);
        }
    }
    
    private boolean U(final int n, final boolean b) {
        if (n == -1) {
            return false;
        }
        final s a0 = this.a0;
        if (a0 == null) {
            return false;
        }
        final u.b j0 = a0.J0(n);
        if (j0 == null) {
            return false;
        }
        if (b == j0.K()) {
            return false;
        }
        j0.Q(b);
        return true;
    }
    
    private void V(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.F3);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.j.m.I3) {
                    this.b0 = obtainStyledAttributes.getResourceId(index, this.b0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.G3) {
                    this.d0 = obtainStyledAttributes.getResourceId(index, this.d0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.J3) {
                    this.e0 = obtainStyledAttributes.getResourceId(index, this.e0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.H3) {
                    this.j0 = obtainStyledAttributes.getInt(index, this.j0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.M3) {
                    this.f0 = obtainStyledAttributes.getResourceId(index, this.f0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.L3) {
                    this.g0 = obtainStyledAttributes.getResourceId(index, this.g0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.O3) {
                    this.h0 = obtainStyledAttributes.getFloat(index, this.h0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.N3) {
                    this.k0 = obtainStyledAttributes.getInt(index, this.k0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.P3) {
                    this.l0 = obtainStyledAttributes.getFloat(index, this.l0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.K3) {
                    this.c0 = obtainStyledAttributes.getBoolean(index, this.c0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    private void a0() {
        final b t = this.T;
        if (t == null) {
            return;
        }
        if (this.a0 == null) {
            return;
        }
        if (t.c() == 0) {
            return;
        }
        for (int size = this.U.size(), i = 0; i < size; ++i) {
            final View view = this.U.get(i);
            final int n = this.W + i - this.i0;
            int n3 = 0;
            Label_0323: {
                int n2;
                if (this.c0) {
                    if (n < 0) {
                        final int j0 = this.j0;
                        if (j0 != 4) {
                            this.c0(view, j0);
                        }
                        else {
                            this.c0(view, 0);
                        }
                        if (n % this.T.c() == 0) {
                            this.T.b(view, 0);
                            continue;
                        }
                        final b t2 = this.T;
                        t2.b(view, t2.c() + n % this.T.c());
                        continue;
                    }
                    else if ((n2 = n) >= this.T.c()) {
                        if (n == this.T.c()) {
                            n3 = 0;
                        }
                        else if ((n3 = n) > this.T.c()) {
                            n3 = n % this.T.c();
                        }
                        final int j2 = this.j0;
                        n2 = n3;
                        if (j2 != 4) {
                            this.c0(view, j2);
                            break Label_0323;
                        }
                    }
                }
                else if (n < 0 || (n2 = n) >= this.T.c()) {
                    this.c0(view, this.j0);
                    continue;
                }
                this.c0(view, 0);
                n3 = n2;
            }
            this.T.b(view, n3);
        }
        final int m0 = this.m0;
        if (m0 != -1 && m0 != this.W) {
            this.a0.post((Runnable)new a(this));
        }
        else if (m0 == this.W) {
            this.m0 = -1;
        }
        if (this.d0 == -1 || this.e0 == -1) {
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.c0) {
            return;
        }
        final int c = this.T.c();
        if (this.W == 0) {
            this.U(this.d0, false);
        }
        else {
            this.U(this.d0, true);
            this.a0.setTransition(this.d0);
        }
        if (this.W == c - 1) {
            this.U(this.e0, false);
        }
        else {
            this.U(this.e0, true);
            this.a0.setTransition(this.e0);
        }
    }
    
    private boolean b0(final int n, final View view, final int visibility) {
        final e f0 = this.a0.F0(n);
        if (f0 == null) {
            return false;
        }
        final e.a k0 = f0.k0(view.getId());
        if (k0 == null) {
            return false;
        }
        k0.c.c = 1;
        view.setVisibility(visibility);
        return true;
    }
    
    private boolean c0(final View view, final int n) {
        final s a0 = this.a0;
        int i = 0;
        if (a0 == null) {
            return false;
        }
        final int[] constraintSetIds = a0.getConstraintSetIds();
        boolean b = false;
        while (i < constraintSetIds.length) {
            b |= this.b0(constraintSetIds[i], view, n);
            ++i;
        }
        return b;
    }
    
    public void W(final int b) {
        this.W = Math.max(0, Math.min(this.getCount() - 1, b));
        this.Y();
    }
    
    public void Y() {
        for (int size = this.U.size(), i = 0; i < size; ++i) {
            final View view = this.U.get(i);
            if (this.T.c() == 0) {
                this.c0(view, this.j0);
            }
            else {
                this.c0(view, 0);
            }
        }
        this.a0.X0();
        this.a0();
    }
    
    public void Z(int b, int max) {
        this.m0 = Math.max(0, Math.min(this.getCount() - 1, b));
        max = Math.max(0, max);
        this.n0 = max;
        this.a0.setTransitionDuration(max);
        s s;
        if (b < this.W) {
            s = this.a0;
            b = this.f0;
        }
        else {
            s = this.a0;
            b = this.g0;
        }
        s.l1(b, this.n0);
    }
    
    @Override
    public void a(final s s, final int o0, final int n, final float n2) {
        this.o0 = o0;
    }
    
    public int getCount() {
        final b t = this.T;
        if (t != null) {
            return t.c();
        }
        return 0;
    }
    
    public int getCurrentIndex() {
        return this.W;
    }
    
    @Override
    public void k(final s s, int w) {
        final int w2 = this.W;
        this.V = w2;
        Label_0045: {
            if (w == this.g0) {
                w = w2 + 1;
            }
            else {
                if (w != this.f0) {
                    break Label_0045;
                }
                w = w2 - 1;
            }
            this.W = w;
        }
        if (this.c0) {
            if (this.W >= this.T.c()) {
                this.W = 0;
            }
            if (this.W < 0) {
                this.W = this.T.c() - 1;
            }
        }
        else {
            if (this.W >= this.T.c()) {
                this.W = this.T.c() - 1;
            }
            if (this.W < 0) {
                this.W = 0;
            }
        }
        if (this.V != this.W) {
            this.a0.post(this.p0);
        }
    }
    
    @p0(api = 17)
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.getParent() instanceof s) {
            final s a0 = (s)this.getParent();
            for (int i = 0; i < super.H; ++i) {
                final int n = super.G[i];
                final View n2 = a0.n(n);
                if (this.b0 == n) {
                    this.i0 = i;
                }
                this.U.add(n2);
            }
            this.a0 = a0;
            if (this.k0 == 2) {
                final u.b j0 = a0.J0(this.e0);
                if (j0 != null) {
                    j0.U(5);
                }
                final u.b j2 = this.a0.J0(this.d0);
                if (j2 != null) {
                    j2.U(5);
                }
            }
            this.a0();
        }
    }
    
    public void setAdapter(final b t) {
        this.T = t;
    }
    
    public interface b
    {
        void a(final int p0);
        
        void b(final View p0, final int p1);
        
        int c();
    }
}
