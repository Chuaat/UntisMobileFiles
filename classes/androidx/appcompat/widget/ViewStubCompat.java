// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import androidx.annotation.t0;
import android.view.View;

@t0({ t0.a.I })
public final class ViewStubCompat extends View
{
    private int G;
    private int H;
    private WeakReference<View> I;
    private LayoutInflater J;
    private a K;
    
    public ViewStubCompat(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewStubCompat(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.a.n.f8, n, 0);
        this.H = obtainStyledAttributes.getResourceId(c.a.n.i8, -1);
        this.G = obtainStyledAttributes.getResourceId(c.a.n.h8, 0);
        this.setId(obtainStyledAttributes.getResourceId(c.a.n.g8, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public View a() {
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.G != 0) {
            final ViewGroup viewGroup = (ViewGroup)parent;
            LayoutInflater layoutInflater = this.J;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.getContext());
            }
            final View inflate = layoutInflater.inflate(this.G, viewGroup, false);
            final int h = this.H;
            if (h != -1) {
                inflate.setId(h);
            }
            final int indexOfChild = viewGroup.indexOfChild((View)this);
            viewGroup.removeViewInLayout((View)this);
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            }
            else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.I = new WeakReference<View>(inflate);
            final a k = this.K;
            if (k != null) {
                k.a(this, inflate);
            }
            return inflate;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    protected void dispatchDraw(final Canvas canvas) {
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public void draw(final Canvas canvas) {
    }
    
    public int getInflatedId() {
        return this.H;
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.J;
    }
    
    public int getLayoutResource() {
        return this.G;
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setInflatedId(final int h) {
        this.H = h;
    }
    
    public void setLayoutInflater(final LayoutInflater j) {
        this.J = j;
    }
    
    public void setLayoutResource(final int g) {
        this.G = g;
    }
    
    public void setOnInflateListener(final a k) {
        this.K = k;
    }
    
    public void setVisibility(final int n) {
        final WeakReference<View> i = this.I;
        if (i != null) {
            final View view = i.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(n);
        }
        else {
            super.setVisibility(n);
            if (n == 0 || n == 4) {
                this.a();
            }
        }
    }
    
    public interface a
    {
        void a(final ViewStubCompat p0, final View p1);
    }
}
