// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.k0;
import android.graphics.Rect;
import android.view.Display;
import android.os.Build$VERSION;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.x0;
import androidx.annotation.f;
import c.a;
import androidx.annotation.j0;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class m implements i
{
    private static final int m = 48;
    private final Context a;
    private final g b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private n.a i;
    private l j;
    private PopupWindow$OnDismissListener k;
    private final PopupWindow$OnDismissListener l;
    
    public m(@j0 final Context context, @j0 final g g) {
        this(context, g, null, false, c.a.c.G2, 0);
    }
    
    public m(@j0 final Context context, @j0 final g g, @j0 final View view) {
        this(context, g, view, false, c.a.c.G2, 0);
    }
    
    public m(@j0 final Context context, @j0 final g g, @j0 final View view, final boolean b, @f final int n) {
        this(context, g, view, b, n, 0);
    }
    
    public m(@j0 final Context a, @j0 final g b, @j0 final View f, final boolean c, @f final int d, @x0 final int e) {
        this.g = 8388611;
        this.l = (PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener() {
            public void onDismiss() {
                androidx.appcompat.view.menu.m.this.g();
            }
        };
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @j0
    private l b() {
        final Display defaultDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        final Point point = new Point();
        if (Build$VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        }
        else {
            defaultDisplay.getSize(point);
        }
        n n;
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(c.a.f.w)) {
            n = new d(this.a, this.f, this.d, this.e, this.c);
        }
        else {
            n = new r(this.a, this.b, this.f, this.d, this.e, this.c);
        }
        ((l)n).p(this.b);
        ((l)n).y(this.l);
        ((l)n).t(this.f);
        n.i(this.i);
        ((l)n).v(this.h);
        ((l)n).w(this.g);
        return (l)n;
    }
    
    private void n(int n, final int n2, final boolean b, final boolean b2) {
        final l e = this.e();
        e.z(b2);
        if (b) {
            int n3 = n;
            if ((androidx.core.view.i.d(this.g, androidx.core.view.j0.X(this.f)) & 0x7) == 0x5) {
                n3 = n - this.f.getWidth();
            }
            e.x(n3);
            e.A(n2);
            n = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            e.u(new Rect(n3 - n, n2 - n, n3 + n, n2 + n));
        }
        e.a();
    }
    
    @Override
    public void a(@k0 final n.a i) {
        this.i = i;
        final l j = this.j;
        if (j != null) {
            j.i(i);
        }
    }
    
    public int c() {
        return this.g;
    }
    
    public ListView d() {
        return this.e().l();
    }
    
    @Override
    public void dismiss() {
        if (this.f()) {
            this.j.dismiss();
        }
    }
    
    @j0
    @t0({ t0.a.G })
    public l e() {
        if (this.j == null) {
            this.j = this.b();
        }
        return this.j;
    }
    
    public boolean f() {
        final l j = this.j;
        return j != null && j.c();
    }
    
    protected void g() {
        this.j = null;
        final PopupWindow$OnDismissListener k = this.k;
        if (k != null) {
            k.onDismiss();
        }
    }
    
    public void h(@j0 final View f) {
        this.f = f;
    }
    
    public void i(final boolean h) {
        this.h = h;
        final l j = this.j;
        if (j != null) {
            j.v(h);
        }
    }
    
    public void j(final int g) {
        this.g = g;
    }
    
    public void k(@k0 final PopupWindow$OnDismissListener k) {
        this.k = k;
    }
    
    public void l() {
        if (this.o()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public void m(final int n, final int n2) {
        if (this.p(n, n2)) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public boolean o() {
        if (this.f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.n(0, 0, false, false);
        return true;
    }
    
    public boolean p(final int n, final int n2) {
        if (this.f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.n(n, n2, true, true);
        return true;
    }
}
