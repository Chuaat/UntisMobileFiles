// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.fragment.app.a0;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.widget.SpinnerAdapter;
import androidx.annotation.s;
import androidx.annotation.w0;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.content.res.Configuration;
import androidx.appcompat.view.b;
import androidx.annotation.t0;
import androidx.annotation.k0;
import android.content.Context;

public abstract class a
{
    @Deprecated
    public static final int a = 0;
    @Deprecated
    public static final int b = 1;
    @Deprecated
    public static final int c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 16;
    
    public Context A() {
        return null;
    }
    
    public abstract void A0(final CharSequence p0);
    
    @k0
    public abstract CharSequence B();
    
    @t0({ t0.a.I })
    public void B0(final CharSequence charSequence) {
    }
    
    public abstract void C();
    
    public abstract void C0();
    
    @t0({ t0.a.I })
    public boolean D() {
        return false;
    }
    
    @t0({ t0.a.I })
    public androidx.appcompat.view.b D0(final androidx.appcompat.view.b.a a) {
        return null;
    }
    
    public boolean E() {
        return false;
    }
    
    public abstract boolean F();
    
    @t0({ t0.a.I })
    public boolean G() {
        return false;
    }
    
    @Deprecated
    public abstract f H();
    
    @t0({ t0.a.I })
    public void I(final Configuration configuration) {
    }
    
    void J() {
    }
    
    @t0({ t0.a.I })
    public boolean K(final int n, final KeyEvent keyEvent) {
        return false;
    }
    
    @t0({ t0.a.I })
    public boolean L(final KeyEvent keyEvent) {
        return false;
    }
    
    @t0({ t0.a.I })
    public boolean M() {
        return false;
    }
    
    @Deprecated
    public abstract void N();
    
    public abstract void O(final d p0);
    
    @Deprecated
    public abstract void P(final f p0);
    
    @Deprecated
    public abstract void Q(final int p0);
    
    @t0({ t0.a.I })
    boolean R() {
        return false;
    }
    
    @Deprecated
    public abstract void S(final f p0);
    
    public abstract void T(@k0 final Drawable p0);
    
    public abstract void U(final int p0);
    
    public abstract void V(final View p0);
    
    public abstract void W(final View p0, final b p1);
    
    @t0({ t0.a.I })
    public void X(final boolean b) {
    }
    
    public abstract void Y(final boolean p0);
    
    public abstract void Z(final int p0);
    
    public abstract void a0(final int p0, final int p1);
    
    public abstract void b0(final boolean p0);
    
    public abstract void c0(final boolean p0);
    
    public abstract void d0(final boolean p0);
    
    public abstract void e0(final boolean p0);
    
    public void f0(final float n) {
        if (n == 0.0f) {
            return;
        }
        throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
    }
    
    public abstract void g(final d p0);
    
    public void g0(final int n) {
        if (n == 0) {
            return;
        }
        throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
    }
    
    @Deprecated
    public abstract void h(final f p0);
    
    public void h0(final boolean b) {
        if (!b) {
            return;
        }
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }
    
    @Deprecated
    public abstract void i(final f p0, final int p1);
    
    public void i0(@w0 final int n) {
    }
    
    @Deprecated
    public abstract void j(final f p0, final int p1, final boolean p2);
    
    public void j0(@k0 final CharSequence charSequence) {
    }
    
    @Deprecated
    public abstract void k(final f p0, final boolean p1);
    
    public void k0(@s final int n) {
    }
    
    @t0({ t0.a.I })
    public boolean l() {
        return false;
    }
    
    public void l0(@k0 final Drawable drawable) {
    }
    
    @t0({ t0.a.I })
    public boolean m() {
        return false;
    }
    
    public void m0(final boolean b) {
    }
    
    @t0({ t0.a.I })
    public void n(final boolean b) {
    }
    
    public abstract void n0(@s final int p0);
    
    public abstract View o();
    
    public abstract void o0(final Drawable p0);
    
    public abstract int p();
    
    @Deprecated
    public abstract void p0(final SpinnerAdapter p0, final e p1);
    
    public float q() {
        return 0.0f;
    }
    
    public abstract void q0(@s final int p0);
    
    public abstract int r();
    
    public abstract void r0(final Drawable p0);
    
    public int s() {
        return 0;
    }
    
    @Deprecated
    public abstract void s0(final int p0);
    
    @Deprecated
    public abstract int t();
    
    @Deprecated
    public abstract void t0(final int p0);
    
    @Deprecated
    public abstract int u();
    
    @t0({ t0.a.I })
    public void u0(final boolean b) {
    }
    
    @Deprecated
    public abstract int v();
    
    public void v0(final Drawable drawable) {
    }
    
    @Deprecated
    @k0
    public abstract f w();
    
    public void w0(final Drawable drawable) {
    }
    
    @k0
    public abstract CharSequence x();
    
    public abstract void x0(final int p0);
    
    @Deprecated
    public abstract f y(final int p0);
    
    public abstract void y0(final CharSequence p0);
    
    @Deprecated
    public abstract int z();
    
    public abstract void z0(@w0 final int p0);
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
    
    public static class b extends ViewGroup$MarginLayoutParams
    {
        public int a;
        
        public b(final int n) {
            this(-2, -1, n);
        }
        
        public b(final int n, final int n2) {
            super(n, n2);
            this.a = 0;
            this.a = 8388627;
        }
        
        public b(final int n, final int n2, final int a) {
            super(n, n2);
            this.a = 0;
            this.a = a;
        }
        
        public b(@j0 final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.a.n.E);
            this.a = obtainStyledAttributes.getInt(c.a.n.F, 0);
            obtainStyledAttributes.recycle();
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
        
        public b(final b b) {
            super((ViewGroup$MarginLayoutParams)b);
            this.a = 0;
            this.a = b.a;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
    
    public interface d
    {
        void a(final boolean p0);
    }
    
    @Deprecated
    public interface e
    {
        boolean a(final int p0, final long p1);
    }
    
    @Deprecated
    public abstract static class f
    {
        public static final int a = -1;
        
        public abstract CharSequence a();
        
        public abstract View b();
        
        public abstract Drawable c();
        
        public abstract int d();
        
        public abstract Object e();
        
        public abstract CharSequence f();
        
        public abstract void g();
        
        public abstract f h(@w0 final int p0);
        
        public abstract f i(final CharSequence p0);
        
        public abstract f j(final int p0);
        
        public abstract f k(final View p0);
        
        public abstract f l(@s final int p0);
        
        public abstract f m(final Drawable p0);
        
        public abstract f n(final g p0);
        
        public abstract f o(final Object p0);
        
        public abstract f p(final int p0);
        
        public abstract f q(final CharSequence p0);
    }
    
    @Deprecated
    public interface g
    {
        void a(final f p0, final a0 p1);
        
        void b(final f p0, final a0 p1);
        
        void c(final f p0, final a0 p1);
    }
}
