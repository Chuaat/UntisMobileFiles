// 
// Decompiled by Procyon v0.5.36
// 

package androidx.percentlayout.widget;

import androidx.core.view.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import a1.a;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.j0;
import android.view.ViewGroup;

@Deprecated
public class b
{
    private static final String b = "PercentLayout";
    private static final boolean c = false;
    private static final boolean d = false;
    private final ViewGroup a;
    
    public b(@j0 final ViewGroup a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }
    
    public static void b(final ViewGroup$LayoutParams viewGroup$LayoutParams, final TypedArray typedArray, final int n, final int n2) {
        viewGroup$LayoutParams.width = typedArray.getLayoutDimension(n, 0);
        viewGroup$LayoutParams.height = typedArray.getLayoutDimension(n2, 0);
    }
    
    public static a c(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a1.a.j.N);
        final float fraction = obtainStyledAttributes.getFraction(a1.a.j.X, 1, 1, -1.0f);
        a a;
        if (fraction != -1.0f) {
            a = new a();
            a.a = fraction;
        }
        else {
            a = null;
        }
        final float fraction2 = obtainStyledAttributes.getFraction(a1.a.j.P, 1, 1, -1.0f);
        a a2 = a;
        if (fraction2 != -1.0f) {
            if (a != null) {
                a2 = a;
            }
            else {
                a2 = new a();
            }
            a2.b = fraction2;
        }
        final float fraction3 = obtainStyledAttributes.getFraction(a1.a.j.T, 1, 1, -1.0f);
        a a3 = a2;
        if (fraction3 != -1.0f) {
            if (a2 == null) {
                a2 = new a();
            }
            a2.c = fraction3;
            a2.d = fraction3;
            a2.e = fraction3;
            a2.f = fraction3;
            a3 = a2;
        }
        final float fraction4 = obtainStyledAttributes.getFraction(a1.a.j.S, 1, 1, -1.0f);
        a a4 = a3;
        if (fraction4 != -1.0f) {
            if (a3 != null) {
                a4 = a3;
            }
            else {
                a4 = new a();
            }
            a4.c = fraction4;
        }
        final float fraction5 = obtainStyledAttributes.getFraction(a1.a.j.W, 1, 1, -1.0f);
        a a5 = a4;
        if (fraction5 != -1.0f) {
            if (a4 == null) {
                a4 = new a();
            }
            a4.d = fraction5;
            a5 = a4;
        }
        final float fraction6 = obtainStyledAttributes.getFraction(a1.a.j.U, 1, 1, -1.0f);
        a a6 = a5;
        if (fraction6 != -1.0f) {
            if (a5 != null) {
                a6 = a5;
            }
            else {
                a6 = new a();
            }
            a6.e = fraction6;
        }
        final float fraction7 = obtainStyledAttributes.getFraction(a1.a.j.Q, 1, 1, -1.0f);
        a a7 = a6;
        if (fraction7 != -1.0f) {
            if (a6 == null) {
                a6 = new a();
            }
            a6.f = fraction7;
            a7 = a6;
        }
        final float fraction8 = obtainStyledAttributes.getFraction(a1.a.j.V, 1, 1, -1.0f);
        a a8 = a7;
        if (fraction8 != -1.0f) {
            if (a7 != null) {
                a8 = a7;
            }
            else {
                a8 = new a();
            }
            a8.g = fraction8;
        }
        final float fraction9 = obtainStyledAttributes.getFraction(a1.a.j.R, 1, 1, -1.0f);
        a a9 = a8;
        if (fraction9 != -1.0f) {
            if (a8 == null) {
                a8 = new a();
            }
            a8.h = fraction9;
            a9 = a8;
        }
        final float fraction10 = obtainStyledAttributes.getFraction(a1.a.j.O, 1, 1, -1.0f);
        a a10 = a9;
        if (fraction10 != -1.0f) {
            if (a9 == null) {
                a9 = new a();
            }
            a9.i = fraction10;
            a10 = a9;
        }
        obtainStyledAttributes.recycle();
        return a10;
    }
    
    private static boolean f(final View view, final a a) {
        return (view.getMeasuredHeightAndState() & 0xFF000000) == 0x1000000 && a.b >= 0.0f && a.j.height == -2;
    }
    
    private static boolean g(final View view, final a a) {
        return (view.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000 && a.a >= 0.0f && a.j.width == -2;
    }
    
    public void a(int i, int n) {
        final int n2 = View$MeasureSpec.getSize(i) - this.a.getPaddingLeft() - this.a.getPaddingRight();
        n = View$MeasureSpec.getSize(n) - this.a.getPaddingTop() - this.a.getPaddingBottom();
        int childCount;
        View child;
        ViewGroup$LayoutParams layoutParams;
        a a;
        for (childCount = this.a.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.a.getChildAt(i);
            layoutParams = child.getLayoutParams();
            if (layoutParams instanceof b) {
                a = ((b)layoutParams).a();
                if (a != null) {
                    if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                        a.b(child, (ViewGroup$MarginLayoutParams)layoutParams, n2, n);
                    }
                    else {
                        a.a(layoutParams, n2, n);
                    }
                }
            }
        }
    }
    
    public boolean d() {
        final int childCount = this.a.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.a.getChildAt(i);
            final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
            boolean b2 = b;
            if (layoutParams instanceof b) {
                final a a = ((b)layoutParams).a();
                b2 = b;
                if (a != null) {
                    b2 = b;
                    if (g(child, a)) {
                        layoutParams.width = -2;
                        b2 = true;
                    }
                    if (f(child, a)) {
                        layoutParams.height = -2;
                        b2 = true;
                    }
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
    
    public void e() {
        for (int childCount = this.a.getChildCount(), i = 0; i < childCount; ++i) {
            final ViewGroup$LayoutParams layoutParams = this.a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof b) {
                final a a = ((b)layoutParams).a();
                if (a != null) {
                    if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                        a.e((ViewGroup$MarginLayoutParams)layoutParams);
                    }
                    else {
                        a.d(layoutParams);
                    }
                }
            }
        }
    }
    
    @Deprecated
    public static class a
    {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        final c j;
        
        public a() {
            this.a = -1.0f;
            this.b = -1.0f;
            this.c = -1.0f;
            this.d = -1.0f;
            this.e = -1.0f;
            this.f = -1.0f;
            this.g = -1.0f;
            this.h = -1.0f;
            this.j = new c(0, 0);
        }
        
        public void a(final ViewGroup$LayoutParams viewGroup$LayoutParams, final int n, final int n2) {
            final c j = this.j;
            final int width = viewGroup$LayoutParams.width;
            j.width = width;
            final int height = viewGroup$LayoutParams.height;
            j.height = height;
            final boolean b = j.b;
            final boolean b2 = false;
            final boolean b3 = (b || width == 0) && this.a < 0.0f;
            int n3 = 0;
            Label_0103: {
                if (!j.a) {
                    n3 = (b2 ? 1 : 0);
                    if (height != 0) {
                        break Label_0103;
                    }
                }
                n3 = (b2 ? 1 : 0);
                if (this.b < 0.0f) {
                    n3 = 1;
                }
            }
            final float a = this.a;
            if (a >= 0.0f) {
                viewGroup$LayoutParams.width = Math.round(n * a);
            }
            final float b4 = this.b;
            if (b4 >= 0.0f) {
                viewGroup$LayoutParams.height = Math.round(n2 * b4);
            }
            final float i = this.i;
            if (i >= 0.0f) {
                if (b3) {
                    viewGroup$LayoutParams.width = Math.round(viewGroup$LayoutParams.height * i);
                    this.j.b = true;
                }
                if (n3 != 0) {
                    viewGroup$LayoutParams.height = Math.round(viewGroup$LayoutParams.width / this.i);
                    this.j.a = true;
                }
            }
        }
        
        public void b(final View view, final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n, int n2) {
            this.a((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams, n, n2);
            final c j = this.j;
            j.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            j.topMargin = viewGroup$MarginLayoutParams.topMargin;
            j.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            j.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
            n.h(j, n.c(viewGroup$MarginLayoutParams));
            n.g(this.j, n.b(viewGroup$MarginLayoutParams));
            final float c = this.c;
            if (c >= 0.0f) {
                viewGroup$MarginLayoutParams.leftMargin = Math.round(n * c);
            }
            final float d = this.d;
            if (d >= 0.0f) {
                viewGroup$MarginLayoutParams.topMargin = Math.round(n2 * d);
            }
            final float e = this.e;
            if (e >= 0.0f) {
                viewGroup$MarginLayoutParams.rightMargin = Math.round(n * e);
            }
            final float f = this.f;
            if (f >= 0.0f) {
                viewGroup$MarginLayoutParams.bottomMargin = Math.round(n2 * f);
            }
            n2 = 0;
            final float g = this.g;
            final int n3 = 1;
            if (g >= 0.0f) {
                n.h(viewGroup$MarginLayoutParams, Math.round(n * g));
                n2 = 1;
            }
            final float h = this.h;
            if (h >= 0.0f) {
                n.g(viewGroup$MarginLayoutParams, Math.round(n * h));
                n2 = n3;
            }
            if (n2 != 0 && view != null) {
                n.e(viewGroup$MarginLayoutParams, androidx.core.view.j0.X(view));
            }
        }
        
        @Deprecated
        public void c(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n, final int n2) {
            this.b(null, viewGroup$MarginLayoutParams, n, n2);
        }
        
        public void d(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            final c j = this.j;
            if (!j.b) {
                viewGroup$LayoutParams.width = j.width;
            }
            if (!j.a) {
                viewGroup$LayoutParams.height = j.height;
            }
            j.b = false;
            j.a = false;
        }
        
        public void e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            this.d((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            final c j = this.j;
            viewGroup$MarginLayoutParams.leftMargin = j.leftMargin;
            viewGroup$MarginLayoutParams.topMargin = j.topMargin;
            viewGroup$MarginLayoutParams.rightMargin = j.rightMargin;
            viewGroup$MarginLayoutParams.bottomMargin = j.bottomMargin;
            n.h(viewGroup$MarginLayoutParams, n.c(j));
            n.g(viewGroup$MarginLayoutParams, n.b(this.j));
        }
        
        @Override
        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }
    
    @Deprecated
    public interface b
    {
        a a();
    }
    
    static class c extends ViewGroup$MarginLayoutParams
    {
        boolean a;
        boolean b;
        
        public c(final int n, final int n2) {
            super(n, n2);
        }
    }
}
