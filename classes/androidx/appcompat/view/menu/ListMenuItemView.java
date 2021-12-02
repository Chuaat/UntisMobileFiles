// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import androidx.core.view.j0;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import androidx.appcompat.widget.u0;
import c.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import androidx.annotation.t0;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

@t0({ t0.a.I })
public class ListMenuItemView extends LinearLayout implements a, AbsListView$SelectionBoundsAdjuster
{
    private static final String a0 = "ListMenuItemView";
    private j G;
    private ImageView H;
    private RadioButton I;
    private TextView J;
    private CheckBox K;
    private TextView L;
    private ImageView M;
    private ImageView N;
    private LinearLayout O;
    private Drawable P;
    private int Q;
    private Context R;
    private boolean S;
    private Drawable T;
    private boolean U;
    private LayoutInflater V;
    private boolean W;
    
    public ListMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, c.a.c.f2);
    }
    
    public ListMenuItemView(final Context r, final AttributeSet set, int n1) {
        super(r, set);
        final u0 g = u0.G(this.getContext(), set, c.a.n.K5, n1, 0);
        this.P = g.h(c.a.n.Q5);
        this.Q = g.u(c.a.n.M5, -1);
        this.S = g.a(c.a.n.S5, false);
        this.R = r;
        this.T = g.h(c.a.n.T5);
        final Resources$Theme theme = r.getTheme();
        n1 = c.a.c.n1;
        final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, n1, 0);
        this.U = obtainStyledAttributes.hasValue(0);
        g.I();
        obtainStyledAttributes.recycle();
    }
    
    private void a(final View view) {
        this.c(view, -1);
    }
    
    private void c(final View view, final int n) {
        final LinearLayout o = this.O;
        if (o != null) {
            o.addView(view, n);
        }
        else {
            this.addView(view, n);
        }
    }
    
    private void e() {
        this.a((View)(this.K = (CheckBox)this.getInflater().inflate(c.a.k.o, (ViewGroup)this, false)));
    }
    
    private LayoutInflater getInflater() {
        if (this.V == null) {
            this.V = LayoutInflater.from(this.getContext());
        }
        return this.V;
    }
    
    private void h() {
        this.c((View)(this.H = (ImageView)this.getInflater().inflate(c.a.k.p, (ViewGroup)this, false)), 0);
    }
    
    private void i() {
        this.a((View)(this.I = (RadioButton)this.getInflater().inflate(c.a.k.r, (ViewGroup)this, false)));
    }
    
    private void setSubMenuArrowVisible(final boolean b) {
        final ImageView m = this.M;
        if (m != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            m.setVisibility(visibility);
        }
    }
    
    public void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView n = this.N;
        if (n != null && n.getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.N.getLayoutParams();
            rect.top += this.N.getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public void b(final boolean b, final char c) {
        int visibility;
        if (b && this.G.D()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        if (visibility == 0) {
            this.L.setText((CharSequence)this.G.k());
        }
        if (this.L.getVisibility() != visibility) {
            this.L.setVisibility(visibility);
        }
    }
    
    public boolean d() {
        return false;
    }
    
    public boolean f() {
        return this.W;
    }
    
    public void g(final j g, int visibility) {
        this.G = g;
        if (g.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setTitle(g.l(this));
        this.setCheckable(g.isCheckable());
        this.b(g.D(), g.j());
        this.setIcon(g.getIcon());
        this.setEnabled(g.isEnabled());
        this.setSubMenuArrowVisible(g.hasSubMenu());
        this.setContentDescription(g.getContentDescription());
    }
    
    public j getItemData() {
        return this.G;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        j0.G1((View)this, this.P);
        final TextView j = (TextView)this.findViewById(c.a.h.L1);
        this.J = j;
        final int q = this.Q;
        if (q != -1) {
            j.setTextAppearance(this.R, q);
        }
        this.L = (TextView)this.findViewById(c.a.h.j1);
        final ImageView m = (ImageView)this.findViewById(c.a.h.q1);
        if ((this.M = m) != null) {
            m.setImageDrawable(this.T);
        }
        this.N = (ImageView)this.findViewById(c.a.h.u0);
        this.O = (LinearLayout)this.findViewById(c.a.h.i0);
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.H != null && this.S) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.H.getLayoutParams();
            final int height = layoutParams.height;
            if (height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (!b && this.I == null && this.K == null) {
            return;
        }
        Object o;
        Object o2;
        if (this.G.p()) {
            if (this.I == null) {
                this.i();
            }
            o = this.I;
            o2 = this.K;
        }
        else {
            if (this.K == null) {
                this.e();
            }
            o = this.K;
            o2 = this.I;
        }
        if (b) {
            ((CompoundButton)o).setChecked(this.G.isChecked());
            if (((CompoundButton)o).getVisibility() != 0) {
                ((CompoundButton)o).setVisibility(0);
            }
            if (o2 != null && ((CompoundButton)o2).getVisibility() != 8) {
                ((CompoundButton)o2).setVisibility(8);
            }
        }
        else {
            final CheckBox k = this.K;
            if (k != null) {
                k.setVisibility(8);
            }
            final RadioButton i = this.I;
            if (i != null) {
                i.setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if (this.G.p()) {
            if (this.I == null) {
                this.i();
            }
            o = this.I;
        }
        else {
            if (this.K == null) {
                this.e();
            }
            o = this.K;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.W = b;
        this.S = b;
    }
    
    public void setGroupDividerEnabled(final boolean b) {
        final ImageView n = this.N;
        if (n != null) {
            int visibility;
            if (!this.U && b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            n.setVisibility(visibility);
        }
    }
    
    public void setIcon(Drawable imageDrawable) {
        final boolean b = this.G.C() || this.W;
        if (!b && !this.S) {
            return;
        }
        final ImageView h = this.H;
        if (h == null && imageDrawable == null && !this.S) {
            return;
        }
        if (h == null) {
            this.h();
        }
        if (imageDrawable == null && !this.S) {
            this.H.setVisibility(8);
        }
        else {
            final ImageView h2 = this.H;
            if (!b) {
                imageDrawable = null;
            }
            h2.setImageDrawable(imageDrawable);
            if (this.H.getVisibility() != 0) {
                this.H.setVisibility(0);
            }
        }
    }
    
    public void setTitle(final CharSequence text) {
        TextView textView;
        int visibility;
        if (text != null) {
            this.J.setText(text);
            if (this.J.getVisibility() == 0) {
                return;
            }
            textView = this.J;
            visibility = 0;
        }
        else {
            final int visibility2 = this.J.getVisibility();
            visibility = 8;
            if (visibility2 == 8) {
                return;
            }
            textView = this.J;
        }
        textView.setVisibility(visibility);
    }
}
