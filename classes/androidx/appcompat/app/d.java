// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.widget.AdapterView$OnItemSelectedListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import androidx.annotation.f;
import androidx.annotation.s;
import android.widget.ListAdapter;
import android.database.Cursor;
import androidx.annotation.e;
import androidx.annotation.w0;
import android.content.DialogInterface$OnKeyListener;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.t0;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListView;
import android.widget.Button;
import c.a;
import android.util.TypedValue;
import androidx.annotation.k0;
import android.content.DialogInterface$OnCancelListener;
import androidx.annotation.x0;
import androidx.annotation.j0;
import android.content.Context;
import android.content.DialogInterface;

public class d extends i implements DialogInterface
{
    static final int J = 0;
    static final int K = 1;
    final AlertController I;
    
    protected d(@j0 final Context context) {
        this(context, 0);
    }
    
    protected d(@j0 final Context context, @x0 final int n) {
        super(context, h(context, n));
        this.I = new AlertController(this.getContext(), this, this.getWindow());
    }
    
    protected d(@j0 final Context context, final boolean cancelable, @k0 final DialogInterface$OnCancelListener onCancelListener) {
        this(context, 0);
        this.setCancelable(cancelable);
        this.setOnCancelListener(onCancelListener);
    }
    
    static int h(@j0 final Context context, @x0 final int n) {
        if ((n >>> 24 & 0xFF) >= 1) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.c.N, typedValue, true);
        return typedValue.resourceId;
    }
    
    public Button f(final int n) {
        return this.I.c(n);
    }
    
    public ListView g() {
        return this.I.e();
    }
    
    public void i(final int n, final CharSequence charSequence, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.I.l(n, charSequence, dialogInterface$OnClickListener, null, null);
    }
    
    public void j(final int n, final CharSequence charSequence, final Drawable drawable, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.I.l(n, charSequence, dialogInterface$OnClickListener, null, drawable);
    }
    
    public void k(final int n, final CharSequence charSequence, final Message message) {
        this.I.l(n, charSequence, null, message, null);
    }
    
    @t0({ t0.a.I })
    void l(final int n) {
        this.I.m(n);
    }
    
    public void m(final View view) {
        this.I.n(view);
    }
    
    public void n(final int n) {
        this.I.o(n);
    }
    
    public void o(final Drawable drawable) {
        this.I.p(drawable);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.I.f();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.I.h(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return this.I.i(n, keyEvent) || super.onKeyUp(n, keyEvent);
    }
    
    public void p(final int n) {
        final TypedValue typedValue = new TypedValue();
        this.getContext().getTheme().resolveAttribute(n, typedValue, true);
        this.I.o(typedValue.resourceId);
    }
    
    public void q(final CharSequence charSequence) {
        this.I.q(charSequence);
    }
    
    public void r(final View view) {
        this.I.u(view);
    }
    
    public void s(final View view, final int n, final int n2, final int n3, final int n4) {
        this.I.v(view, n, n2, n3, n4);
    }
    
    @Override
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.I.s(title);
    }
    
    public static class a
    {
        private final AlertController.f a;
        private final int b;
        
        public a(@j0 final Context context) {
            this(context, d.h(context, 0));
        }
        
        public a(@j0 final Context context, @x0 final int b) {
            this.a = new AlertController.f((Context)new ContextThemeWrapper(context, d.h(context, b)));
            this.b = b;
        }
        
        public a A(final DialogInterface$OnKeyListener u) {
            this.a.u = u;
            return this;
        }
        
        public a B(@w0 final int n, final DialogInterface$OnClickListener k) {
            final AlertController.f a = this.a;
            a.i = a.a.getText(n);
            this.a.k = k;
            return this;
        }
        
        public a C(final CharSequence i, final DialogInterface$OnClickListener k) {
            final AlertController.f a = this.a;
            a.i = i;
            a.k = k;
            return this;
        }
        
        public a D(final Drawable j) {
            this.a.j = j;
            return this;
        }
        
        @t0({ t0.a.I })
        public a E(final boolean q) {
            this.a.Q = q;
            return this;
        }
        
        public a F(@e final int n, final int i, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.v = a.a.getResources().getTextArray(n);
            final AlertController.f a2 = this.a;
            a2.x = x;
            a2.I = i;
            a2.H = true;
            return this;
        }
        
        public a G(final Cursor k, final int i, final String l, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.K = k;
            a.x = x;
            a.I = i;
            a.L = l;
            a.H = true;
            return this;
        }
        
        public a H(final ListAdapter w, final int i, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.w = w;
            a.x = x;
            a.I = i;
            a.H = true;
            return this;
        }
        
        public a I(final CharSequence[] v, final int i, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.v = v;
            a.x = x;
            a.I = i;
            a.H = true;
            return this;
        }
        
        public a J(@w0 final int n) {
            final AlertController.f a = this.a;
            a.f = a.a.getText(n);
            return this;
        }
        
        public a K(@k0 final CharSequence f) {
            this.a.f = f;
            return this;
        }
        
        public a L(final int y) {
            final AlertController.f a = this.a;
            a.z = null;
            a.y = y;
            a.E = false;
            return this;
        }
        
        public a M(final View z) {
            final AlertController.f a = this.a;
            a.z = z;
            a.y = 0;
            a.E = false;
            return this;
        }
        
        @Deprecated
        @t0({ t0.a.I })
        public a N(final View z, final int a, final int b, final int c, final int d) {
            final AlertController.f a2 = this.a;
            a2.z = z;
            a2.y = 0;
            a2.E = true;
            a2.A = a;
            a2.B = b;
            a2.C = c;
            a2.D = d;
            return this;
        }
        
        public d O() {
            final d a = this.a();
            a.show();
            return a;
        }
        
        @j0
        public d a() {
            final d d = new d(this.a.a, this.b);
            this.a.a(d.I);
            d.setCancelable(this.a.r);
            if (this.a.r) {
                d.setCanceledOnTouchOutside(true);
            }
            d.setOnCancelListener(this.a.s);
            d.setOnDismissListener(this.a.t);
            final DialogInterface$OnKeyListener u = this.a.u;
            if (u != null) {
                d.setOnKeyListener(u);
            }
            return d;
        }
        
        @j0
        public Context b() {
            return this.a.a;
        }
        
        public a c(final ListAdapter w, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.w = w;
            a.x = x;
            return this;
        }
        
        public a d(final boolean r) {
            this.a.r = r;
            return this;
        }
        
        public a e(final Cursor k, final DialogInterface$OnClickListener x, final String l) {
            final AlertController.f a = this.a;
            a.K = k;
            a.L = l;
            a.x = x;
            return this;
        }
        
        public a f(@k0 final View g) {
            this.a.g = g;
            return this;
        }
        
        public a g(@s final int c) {
            this.a.c = c;
            return this;
        }
        
        public a h(@k0 final Drawable d) {
            this.a.d = d;
            return this;
        }
        
        public a i(@androidx.annotation.f final int n) {
            final TypedValue typedValue = new TypedValue();
            this.a.a.getTheme().resolveAttribute(n, typedValue, true);
            this.a.c = typedValue.resourceId;
            return this;
        }
        
        @Deprecated
        public a j(final boolean n) {
            this.a.N = n;
            return this;
        }
        
        public a k(@e final int n, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.v = a.a.getResources().getTextArray(n);
            this.a.x = x;
            return this;
        }
        
        public a l(final CharSequence[] v, final DialogInterface$OnClickListener x) {
            final AlertController.f a = this.a;
            a.v = v;
            a.x = x;
            return this;
        }
        
        public a m(@w0 final int n) {
            final AlertController.f a = this.a;
            a.h = a.a.getText(n);
            return this;
        }
        
        public a n(@k0 final CharSequence h) {
            this.a.h = h;
            return this;
        }
        
        public a o(@e final int n, final boolean[] f, final DialogInterface$OnMultiChoiceClickListener j) {
            final AlertController.f a = this.a;
            a.v = a.a.getResources().getTextArray(n);
            final AlertController.f a2 = this.a;
            a2.J = j;
            a2.F = f;
            a2.G = true;
            return this;
        }
        
        public a p(final Cursor k, final String m, final String l, final DialogInterface$OnMultiChoiceClickListener j) {
            final AlertController.f a = this.a;
            a.K = k;
            a.J = j;
            a.M = m;
            a.L = l;
            a.G = true;
            return this;
        }
        
        public a q(final CharSequence[] v, final boolean[] f, final DialogInterface$OnMultiChoiceClickListener j) {
            final AlertController.f a = this.a;
            a.v = v;
            a.J = j;
            a.F = f;
            a.G = true;
            return this;
        }
        
        public a r(@w0 final int n, final DialogInterface$OnClickListener n2) {
            final AlertController.f a = this.a;
            a.l = a.a.getText(n);
            this.a.n = n2;
            return this;
        }
        
        public a s(final CharSequence l, final DialogInterface$OnClickListener n) {
            final AlertController.f a = this.a;
            a.l = l;
            a.n = n;
            return this;
        }
        
        public a t(final Drawable m) {
            this.a.m = m;
            return this;
        }
        
        public a u(@w0 final int n, final DialogInterface$OnClickListener q) {
            final AlertController.f a = this.a;
            a.o = a.a.getText(n);
            this.a.q = q;
            return this;
        }
        
        public a v(final CharSequence o, final DialogInterface$OnClickListener q) {
            final AlertController.f a = this.a;
            a.o = o;
            a.q = q;
            return this;
        }
        
        public a w(final Drawable p) {
            this.a.p = p;
            return this;
        }
        
        public a x(final DialogInterface$OnCancelListener s) {
            this.a.s = s;
            return this;
        }
        
        public a y(final DialogInterface$OnDismissListener t) {
            this.a.t = t;
            return this;
        }
        
        public a z(final AdapterView$OnItemSelectedListener o) {
            this.a.O = o;
            return this;
        }
    }
}
