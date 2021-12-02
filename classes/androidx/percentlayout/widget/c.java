// 
// Decompiled by Procyon v0.5.36
// 

package androidx.percentlayout.widget;

import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.RelativeLayout;

@Deprecated
public class c extends RelativeLayout
{
    private final b G;
    
    public c(final Context context) {
        super(context);
        this.G = new b((ViewGroup)this);
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, set);
        this.G = new b((ViewGroup)this);
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new b((ViewGroup)this);
    }
    
    protected a a() {
        return new a(-1, -1);
    }
    
    public a b(final AttributeSet set) {
        return new a(this.getContext(), set);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.G.e();
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.G.a(n, n2);
        super.onMeasure(n, n2);
        if (this.G.d()) {
            super.onMeasure(n, n2);
        }
    }
    
    @Deprecated
    public static class a extends RelativeLayout$LayoutParams implements b
    {
        private androidx.percentlayout.widget.b.a G;
        
        public a(final int n, final int n2) {
            super(n, n2);
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.G = androidx.percentlayout.widget.b.c(context, set);
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
        
        public androidx.percentlayout.widget.b.a a() {
            if (this.G == null) {
                this.G = new androidx.percentlayout.widget.b.a();
            }
            return this.G;
        }
        
        protected void setBaseAttributes(final TypedArray typedArray, final int n, final int n2) {
            androidx.percentlayout.widget.b.b((ViewGroup$LayoutParams)this, typedArray, n, n2);
        }
    }
}
