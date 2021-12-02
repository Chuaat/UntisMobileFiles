// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class f extends ViewGroup
{
    public static final String H = "Constraints";
    e G;
    
    public f(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
        this.c(set);
        super.setVisibility(8);
    }
    
    public f(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c(set);
        super.setVisibility(8);
    }
    
    private void c(final AttributeSet set) {
        Log.v("Constraints", " ################# init");
    }
    
    protected a a() {
        return new a(-2, -2);
    }
    
    public a b(final AttributeSet set) {
        return new a(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ConstraintLayout.b(viewGroup$LayoutParams);
    }
    
    public e getConstraintSet() {
        if (this.G == null) {
            this.G = new e();
        }
        this.G.J(this);
        return this.G;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public static class a extends b
    {
        public float U0;
        public boolean V0;
        public float W0;
        public float X0;
        public float Y0;
        public float Z0;
        public float a1;
        public float b1;
        public float c1;
        public float d1;
        public float e1;
        public float f1;
        public float g1;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.U0 = 1.0f;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 1.0f;
            this.b1 = 1.0f;
            this.c1 = 0.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.U0 = 1.0f;
            int i = 0;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 1.0f;
            this.b1 = 1.0f;
            this.c1 = 0.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
            TypedArray obtainStyledAttributes;
            for (obtainStyledAttributes = context.obtainStyledAttributes(set, j.m.Qa); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.gb) {
                    this.U0 = obtainStyledAttributes.getFloat(index, this.U0);
                }
                else if (index == j.m.tb) {
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.W0 = obtainStyledAttributes.getFloat(index, this.W0);
                        this.V0 = true;
                    }
                }
                else if (index == j.m.ob) {
                    this.Y0 = obtainStyledAttributes.getFloat(index, this.Y0);
                }
                else if (index == j.m.pb) {
                    this.Z0 = obtainStyledAttributes.getFloat(index, this.Z0);
                }
                else if (index == j.m.nb) {
                    this.X0 = obtainStyledAttributes.getFloat(index, this.X0);
                }
                else if (index == j.m.lb) {
                    this.a1 = obtainStyledAttributes.getFloat(index, this.a1);
                }
                else if (index == j.m.mb) {
                    this.b1 = obtainStyledAttributes.getFloat(index, this.b1);
                }
                else if (index == j.m.hb) {
                    this.c1 = obtainStyledAttributes.getFloat(index, this.c1);
                }
                else if (index == j.m.ib) {
                    this.d1 = obtainStyledAttributes.getFloat(index, this.d1);
                }
                else if (index == j.m.jb) {
                    this.e1 = obtainStyledAttributes.getFloat(index, this.e1);
                }
                else if (index == j.m.kb) {
                    this.f1 = obtainStyledAttributes.getFloat(index, this.f1);
                }
                else if (index == j.m.sb && Build$VERSION.SDK_INT >= 21) {
                    this.g1 = obtainStyledAttributes.getFloat(index, this.g1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        
        public a(final a a) {
            super((ConstraintLayout.b)a);
            this.U0 = 1.0f;
            this.V0 = false;
            this.W0 = 0.0f;
            this.X0 = 0.0f;
            this.Y0 = 0.0f;
            this.Z0 = 0.0f;
            this.a1 = 1.0f;
            this.b1 = 1.0f;
            this.c1 = 0.0f;
            this.d1 = 0.0f;
            this.e1 = 0.0f;
            this.f1 = 0.0f;
            this.g1 = 0.0f;
        }
    }
}
