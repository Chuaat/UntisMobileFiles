// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.View;
import androidx.core.widget.p;
import c.a;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import android.widget.PopupWindow;

class n extends PopupWindow
{
    private static final boolean b;
    private boolean a;
    
    static {
        b = (Build$VERSION.SDK_INT < 21);
    }
    
    public n(@j0 final Context context, @k0 final AttributeSet set, @f final int n) {
        super(context, set, n);
        this.a(context, set, n, 0);
    }
    
    public n(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        super(context, set, n, n2);
        this.a(context, set, n, n2);
    }
    
    private void a(final Context context, final AttributeSet set, int x5, final int n) {
        final u0 g = u0.G(context, set, c.a.n.U5, x5, n);
        x5 = c.a.n.X5;
        if (g.C(x5)) {
            this.b(g.a(x5, false));
        }
        this.setBackgroundDrawable(g.h(c.a.n.V5));
        g.I();
    }
    
    private void b(final boolean a) {
        if (n.b) {
            this.a = a;
        }
        else {
            p.c(this, a);
        }
    }
    
    public void showAsDropDown(final View view, final int n, final int n2) {
        int n3 = n2;
        if (n.b) {
            n3 = n2;
            if (this.a) {
                n3 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n3);
    }
    
    public void showAsDropDown(final View view, final int n, final int n2, final int n3) {
        int n4 = n2;
        if (n.b) {
            n4 = n2;
            if (this.a) {
                n4 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n4, n3);
    }
    
    public void update(final View view, final int n, final int n2, final int n3, final int n4) {
        int n5 = n2;
        if (n.b) {
            n5 = n2;
            if (this.a) {
                n5 = n2 - view.getHeight();
            }
        }
        super.update(view, n, n5, n3, n4);
    }
}
