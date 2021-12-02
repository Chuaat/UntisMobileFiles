// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.util.AndroidRuntimeException;
import androidx.annotation.t0;
import androidx.annotation.y;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.k0;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import androidx.annotation.j0;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.i;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;

public class l0 extends g0
{
    private static final int H0 = 1;
    private static final int I0 = 2;
    private static final int J0 = 4;
    private static final int K0 = 8;
    public static final int L0 = 0;
    public static final int M0 = 1;
    private ArrayList<g0> C0;
    private boolean D0;
    int E0;
    boolean F0;
    private int G0;
    
    public l0() {
        this.C0 = new ArrayList<g0>();
        this.D0 = true;
        this.F0 = false;
        this.G0 = 0;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public l0(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = new ArrayList<g0>();
        this.D0 = true;
        this.F0 = false;
        this.G0 = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.i);
        this.a1(i.k(obtainStyledAttributes, (XmlPullParser)set, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
    
    private void O0(@j0 final g0 e) {
        this.C0.add(e);
        e.X = this;
    }
    
    private void d1() {
        final b b = new b(this);
        final Iterator<g0> iterator = this.C0.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((h)b);
        }
        this.E0 = this.C0.size();
    }
    
    @Override
    public void C0(final w w) {
        super.C0(w);
        this.G0 |= 0x4;
        if (this.C0 != null) {
            for (int i = 0; i < this.C0.size(); ++i) {
                this.C0.get(i).C0(w);
            }
        }
    }
    
    @j0
    @Override
    public g0 D(final int n, final boolean b) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).D(n, b);
        }
        return super.D(n, b);
    }
    
    @Override
    public void D0(final androidx.transition.k0 k0) {
        super.D0(k0);
        this.G0 |= 0x2;
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).D0(k0);
        }
    }
    
    @j0
    @Override
    public g0 E(@j0 final View view, final boolean b) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).E(view, b);
        }
        return super.E(view, b);
    }
    
    @j0
    @Override
    public g0 F(@j0 final Class<?> clazz, final boolean b) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).F(clazz, b);
        }
        return super.F(clazz, b);
    }
    
    @j0
    @Override
    public g0 H(@j0 final String s, final boolean b) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).H(s, b);
        }
        return super.H(s, b);
    }
    
    @Override
    String H0(final String str) {
        String str2 = super.H0(str);
        for (int i = 0; i < this.C0.size(); ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("\n");
            final g0 g0 = this.C0.get(i);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(g0.H0(sb2.toString()));
            str2 = sb.toString();
        }
        return str2;
    }
    
    @j0
    public l0 I0(@j0 final h h) {
        return (l0)super.a(h);
    }
    
    @j0
    public l0 J0(@y final int n) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).b(n);
        }
        return (l0)super.b(n);
    }
    
    @j0
    public l0 K0(@j0 final View view) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).c(view);
        }
        return (l0)super.c(view);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    void L(final ViewGroup viewGroup) {
        super.L(viewGroup);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).L(viewGroup);
        }
    }
    
    @j0
    public l0 L0(@j0 final Class<?> clazz) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).d(clazz);
        }
        return (l0)super.d(clazz);
    }
    
    @j0
    public l0 M0(@j0 final String s) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).f(s);
        }
        return (l0)super.f(s);
    }
    
    @j0
    public l0 N0(@j0 final g0 g0) {
        this.O0(g0);
        final long i = super.I;
        if (i >= 0L) {
            g0.y0(i);
        }
        if ((this.G0 & 0x1) != 0x0) {
            g0.A0(this.Q());
        }
        if ((this.G0 & 0x2) != 0x0) {
            g0.D0(this.U());
        }
        if ((this.G0 & 0x4) != 0x0) {
            g0.C0(this.T());
        }
        if ((this.G0 & 0x8) != 0x0) {
            g0.z0(this.P());
        }
        return this;
    }
    
    public int P0() {
        return (this.D0 ^ true) ? 1 : 0;
    }
    
    @k0
    public g0 Q0(final int index) {
        if (index >= 0 && index < this.C0.size()) {
            return this.C0.get(index);
        }
        return null;
    }
    
    public int R0() {
        return this.C0.size();
    }
    
    @j0
    public l0 S0(@j0 final h h) {
        return (l0)super.p0(h);
    }
    
    @j0
    public l0 T0(@y final int n) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).q0(n);
        }
        return (l0)super.q0(n);
    }
    
    @j0
    public l0 U0(@j0 final View view) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).r0(view);
        }
        return (l0)super.r0(view);
    }
    
    @j0
    public l0 V0(@j0 final Class<?> clazz) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).s0(clazz);
        }
        return (l0)super.s0(clazz);
    }
    
    @j0
    public l0 W0(@j0 final String s) {
        for (int i = 0; i < this.C0.size(); ++i) {
            this.C0.get(i).t0(s);
        }
        return (l0)super.t0(s);
    }
    
    @j0
    public l0 X0(@j0 final g0 o) {
        this.C0.remove(o);
        o.X = null;
        return this;
    }
    
    @j0
    public l0 Y0(final long n) {
        super.y0(n);
        if (super.I >= 0L) {
            final ArrayList<g0> c0 = this.C0;
            if (c0 != null) {
                for (int size = c0.size(), i = 0; i < size; ++i) {
                    this.C0.get(i).y0(n);
                }
            }
        }
        return this;
    }
    
    @j0
    public l0 Z0(@k0 final TimeInterpolator timeInterpolator) {
        this.G0 |= 0x1;
        final ArrayList<g0> c0 = this.C0;
        if (c0 != null) {
            for (int size = c0.size(), i = 0; i < size; ++i) {
                this.C0.get(i).A0(timeInterpolator);
            }
        }
        return (l0)super.A0(timeInterpolator);
    }
    
    @j0
    public l0 a1(final int i) {
        if (i != 0) {
            if (i != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid parameter for TransitionSet ordering: ");
                sb.append(i);
                throw new AndroidRuntimeException(sb.toString());
            }
            this.D0 = false;
        }
        else {
            this.D0 = true;
        }
        return this;
    }
    
    l0 b1(final ViewGroup viewGroup) {
        super.E0(viewGroup);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).E0(viewGroup);
        }
        return this;
    }
    
    @j0
    public l0 c1(final long n) {
        return (l0)super.F0(n);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    protected void cancel() {
        super.cancel();
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).cancel();
        }
    }
    
    @Override
    public void m(@j0 final n0 n0) {
        if (this.f0(n0.b)) {
            for (final g0 e : this.C0) {
                if (e.f0(n0.b)) {
                    e.m(n0);
                    n0.c.add(e);
                }
            }
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    public void n0(final View view) {
        super.n0(view);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).n0(view);
        }
    }
    
    @Override
    void q(final n0 n0) {
        super.q(n0);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).q(n0);
        }
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        if (this.f0(n0.b)) {
            for (final g0 e : this.C0) {
                if (e.f0(n0.b)) {
                    e.r(n0);
                    n0.c.add(e);
                }
            }
        }
    }
    
    @Override
    public g0 u() {
        final l0 l0 = (l0)super.u();
        l0.C0 = new ArrayList<g0>();
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            l0.O0(this.C0.get(i).u());
        }
        return l0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    public void u0(final View view) {
        super.u0(view);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).u0(view);
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    protected void w(final ViewGroup viewGroup, final o0 o0, final o0 o2, final ArrayList<n0> list, final ArrayList<n0> list2) {
        final long w = this.W();
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            final g0 g0 = this.C0.get(i);
            if (w > 0L && (this.D0 || i == 0)) {
                final long w2 = g0.W();
                if (w2 > 0L) {
                    g0.F0(w2 + w);
                }
                else {
                    g0.F0(w);
                }
            }
            g0.w(viewGroup, o0, o2, list, list2);
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    @Override
    protected void w0() {
        if (this.C0.isEmpty()) {
            this.G0();
            this.x();
            return;
        }
        this.d1();
        if (!this.D0) {
            for (int i = 1; i < this.C0.size(); ++i) {
                this.C0.get(i - 1).a((h)new i0() {
                    final /* synthetic */ g0 a = l0.this.C0.get(i);
                    
                    @Override
                    public void c(@j0 final g0 g0) {
                        this.a.w0();
                        g0.p0((h)this);
                    }
                });
            }
            final g0 g0 = this.C0.get(0);
            if (g0 != null) {
                g0.w0();
            }
        }
        else {
            final Iterator<g0> iterator = this.C0.iterator();
            while (iterator.hasNext()) {
                iterator.next().w0();
            }
        }
    }
    
    @Override
    void x0(final boolean b) {
        super.x0(b);
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).x0(b);
        }
    }
    
    @Override
    public void z0(final f f) {
        super.z0(f);
        this.G0 |= 0x8;
        for (int size = this.C0.size(), i = 0; i < size; ++i) {
            this.C0.get(i).z0(f);
        }
    }
    
    static class b extends i0
    {
        l0 a;
        
        b(final l0 a) {
            this.a = a;
        }
        
        @Override
        public void a(@j0 final g0 g0) {
            final l0 a = this.a;
            if (!a.F0) {
                a.G0();
                this.a.F0 = true;
            }
        }
        
        @Override
        public void c(@j0 final g0 g0) {
            final l0 a = this.a;
            final int e0 = a.E0 - 1;
            a.E0 = e0;
            if (e0 == 0) {
                a.F0 = false;
                a.x();
            }
            g0.p0((h)this);
        }
    }
}
