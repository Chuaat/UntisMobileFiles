// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.appcompat.widget.w0;
import android.text.TextUtils;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.Resources;
import c.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.e0;
import android.graphics.drawable.Drawable;
import androidx.annotation.t0;
import androidx.appcompat.widget.ActionMenuView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;

@t0({ androidx.annotation.t0.a.I })
public class ActionMenuItemView extends AppCompatTextView implements o.a, View$OnClickListener, ActionMenuView.a
{
    private static final String W = "ActionMenuItemView";
    private static final int a0 = 32;
    j L;
    private CharSequence M;
    private Drawable N;
    g.b O;
    private e0 P;
    b Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private int V;
    
    public ActionMenuItemView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.R = this.i();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.a.n.G, n, 0);
        this.T = obtainStyledAttributes.getDimensionPixelSize(c.a.n.H, 0);
        obtainStyledAttributes.recycle();
        this.V = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener((View$OnClickListener)this);
        this.U = -1;
        this.setSaveEnabled(false);
    }
    
    private boolean i() {
        final Configuration configuration = this.getContext().getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        return screenWidthDp >= 480 || (screenWidthDp >= 640 && screenHeightDp >= 480) || configuration.orientation == 2;
    }
    
    private void j() {
        final boolean empty = TextUtils.isEmpty(this.M);
        boolean b2;
        final boolean b = b2 = true;
        Label_0052: {
            if (this.N != null) {
                if (this.L.E()) {
                    b2 = b;
                    if (this.R) {
                        break Label_0052;
                    }
                    if (this.S) {
                        b2 = b;
                        break Label_0052;
                    }
                }
                b2 = false;
            }
        }
        final boolean b3 = (empty ^ true) & b2;
        final CharSequence charSequence = null;
        CharSequence m;
        if (b3) {
            m = this.M;
        }
        else {
            m = null;
        }
        this.setText(m);
        CharSequence contentDescription;
        if (TextUtils.isEmpty(contentDescription = this.L.getContentDescription())) {
            if (b3) {
                contentDescription = null;
            }
            else {
                contentDescription = this.L.getTitle();
            }
        }
        this.setContentDescription(contentDescription);
        final CharSequence tooltipText = this.L.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            CharSequence title;
            if (b3) {
                title = charSequence;
            }
            else {
                title = this.L.getTitle();
            }
            androidx.appcompat.widget.w0.a((View)this, title);
        }
        else {
            androidx.appcompat.widget.w0.a((View)this, tooltipText);
        }
    }
    
    public boolean a() {
        return this.h();
    }
    
    @Override
    public void b(final boolean b, final char c) {
    }
    
    public boolean c() {
        return this.h() && this.L.getIcon() == null;
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public boolean f() {
        return true;
    }
    
    @Override
    public void g(final j l, int visibility) {
        this.L = l;
        this.setIcon(l.getIcon());
        this.setTitle(l.l(this));
        this.setId(l.getItemId());
        if (l.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setEnabled(l.isEnabled());
        if (l.hasSubMenu() && this.P == null) {
            this.P = new a();
        }
    }
    
    @Override
    public j getItemData() {
        return this.L;
    }
    
    public boolean h() {
        return TextUtils.isEmpty(this.getText()) ^ true;
    }
    
    public void onClick(final View view) {
        final g.b o = this.O;
        if (o != null) {
            o.a(this.L);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.R = this.i();
        this.j();
    }
    
    @Override
    protected void onMeasure(int a, final int n) {
        final boolean h = this.h();
        if (h) {
            final int u = this.U;
            if (u >= 0) {
                super.setPadding(u, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        super.onMeasure(a, n);
        final int mode = View$MeasureSpec.getMode(a);
        a = View$MeasureSpec.getSize(a);
        final int measuredWidth = this.getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            a = Math.min(a, this.T);
        }
        else {
            a = this.T;
        }
        if (mode != 1073741824 && this.T > 0 && measuredWidth < a) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(a, 1073741824), n);
        }
        if (!h && this.N != null) {
            super.setPadding((this.getMeasuredWidth() - this.N.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.L.hasSubMenu()) {
            final e0 p = this.P;
            if (p != null && p.onTouch((View)this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    @Override
    public void setCheckable(final boolean b) {
    }
    
    @Override
    public void setChecked(final boolean b) {
    }
    
    public void setExpandedFormat(final boolean s) {
        if (this.S != s) {
            this.S = s;
            final j l = this.L;
            if (l != null) {
                l.e();
            }
        }
    }
    
    @Override
    public void setIcon(final Drawable n) {
        this.N = n;
        if (n != null) {
            final int intrinsicWidth = n.getIntrinsicWidth();
            final int intrinsicHeight = n.getIntrinsicHeight();
            int v = this.V;
            int n2 = intrinsicWidth;
            int n3 = intrinsicHeight;
            if (intrinsicWidth > v) {
                n3 = (int)(intrinsicHeight * (v / (float)intrinsicWidth));
                n2 = v;
            }
            if (n3 > v) {
                n2 *= (int)(v / (float)n3);
            }
            else {
                v = n3;
            }
            n.setBounds(0, 0, n2, v);
        }
        this.setCompoundDrawables(n, null, null, null);
        this.j();
    }
    
    public void setItemInvoker(final g.b o) {
        this.O = o;
    }
    
    public void setPadding(final int u, final int n, final int n2, final int n3) {
        super.setPadding(this.U = u, n, n2, n3);
    }
    
    public void setPopupCallback(final b q) {
        this.Q = q;
    }
    
    @Override
    public void setTitle(final CharSequence m) {
        this.M = m;
        this.j();
    }
    
    private class a extends e0
    {
        public a() {
            super((View)ActionMenuItemView.this);
        }
        
        @Override
        public q b() {
            final ActionMenuItemView.b q = ActionMenuItemView.this.Q;
            if (q != null) {
                return q.a();
            }
            return null;
        }
        
        @Override
        protected boolean c() {
            final ActionMenuItemView p = ActionMenuItemView.this;
            final g.b o = p.O;
            boolean b2;
            final boolean b = b2 = false;
            if (o != null) {
                b2 = b;
                if (o.a(p.L)) {
                    final q b3 = this.b();
                    b2 = b;
                    if (b3 != null) {
                        b2 = b;
                        if (b3.c()) {
                            b2 = true;
                        }
                    }
                }
            }
            return b2;
        }
    }
    
    public abstract static class b
    {
        public abstract q a();
    }
}
