// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Canvas;
import java.util.HashMap;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.b;

public class p extends b implements q
{
    private boolean P;
    private boolean Q;
    private float R;
    protected View[] S;
    
    public p(final Context context) {
        super(context);
        this.P = false;
        this.Q = false;
    }
    
    public p(final Context context, final AttributeSet set) {
        super(context, set);
        this.P = false;
        this.Q = false;
        this.y(set);
    }
    
    public p(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.P = false;
        this.Q = false;
        this.y(set);
    }
    
    public void J(final View view, final float n) {
    }
    
    public void a(final s s, final int n, final int n2, final float n3) {
    }
    
    @Override
    public void b(final s s) {
    }
    
    public void c(final s s, final int n, final int n2) {
    }
    
    public void d(final s s, final int n, final boolean b, final float n2) {
    }
    
    @Override
    public boolean e() {
        return this.P;
    }
    
    @Override
    public boolean f() {
        return this.Q;
    }
    
    @Override
    public void g(final s s, final HashMap<View, o> hashMap) {
    }
    
    public float getProgress() {
        return this.R;
    }
    
    @Override
    public void h(final Canvas canvas) {
    }
    
    @Override
    public void i(final Canvas canvas) {
    }
    
    @Override
    public boolean j() {
        return false;
    }
    
    public void k(final s s, final int n) {
    }
    
    public void setProgress(final float r) {
        this.R = r;
        final int h = super.H;
        int i = 0;
        final int n = 0;
        if (h > 0) {
            this.S = this.w((ConstraintLayout)this.getParent());
            for (int j = n; j < super.H; ++j) {
                this.J(this.S[j], r);
            }
        }
        else {
            for (ViewGroup viewGroup = (ViewGroup)this.getParent(); i < viewGroup.getChildCount(); ++i) {
                final View child = viewGroup.getChildAt(i);
                if (!(child instanceof p)) {
                    this.J(child, r);
                }
            }
        }
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.xj);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.j.m.zj) {
                    this.P = obtainStyledAttributes.getBoolean(index, this.P);
                }
                else if (index == androidx.constraintlayout.widget.j.m.yj) {
                    this.Q = obtainStyledAttributes.getBoolean(index, this.Q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
