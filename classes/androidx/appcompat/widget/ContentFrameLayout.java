// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.t0;
import android.widget.FrameLayout;

@t0({ t0.a.G })
public class ContentFrameLayout extends FrameLayout
{
    private TypedValue G;
    private TypedValue H;
    private TypedValue I;
    private TypedValue J;
    private TypedValue K;
    private TypedValue L;
    private final Rect M;
    private a N;
    
    public ContentFrameLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public ContentFrameLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ContentFrameLayout(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.M = new Rect();
    }
    
    @t0({ t0.a.G })
    public void a(final Rect rect) {
        this.fitSystemWindows(rect);
    }
    
    @t0({ t0.a.G })
    public void b(final int n, final int n2, final int n3, final int n4) {
        this.M.set(n, n2, n3, n4);
        if (androidx.core.view.j0.T0((View)this)) {
            this.requestLayout();
        }
    }
    
    public TypedValue getFixedHeightMajor() {
        if (this.K == null) {
            this.K = new TypedValue();
        }
        return this.K;
    }
    
    public TypedValue getFixedHeightMinor() {
        if (this.L == null) {
            this.L = new TypedValue();
        }
        return this.L;
    }
    
    public TypedValue getFixedWidthMajor() {
        if (this.I == null) {
            this.I = new TypedValue();
        }
        return this.I;
    }
    
    public TypedValue getFixedWidthMinor() {
        if (this.J == null) {
            this.J = new TypedValue();
        }
        return this.J;
    }
    
    public TypedValue getMinWidthMajor() {
        if (this.G == null) {
            this.G = new TypedValue();
        }
        return this.G;
    }
    
    public TypedValue getMinWidthMinor() {
        if (this.H == null) {
            this.H = new TypedValue();
        }
        return this.H;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final a n = this.N;
        if (n != null) {
            n.a();
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final a n = this.N;
        if (n != null) {
            n.onDetachedFromWindow();
        }
    }
    
    protected void onMeasure(int n, int measureSpec) {
        final DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int n2 = 1;
        final boolean b = widthPixels < heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(measureSpec);
        int measureSpec2 = 0;
        Label_0205: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (b) {
                    typedValue = this.J;
                }
                else {
                    typedValue = this.I;
                }
                if (typedValue != null) {
                    final int type = typedValue.type;
                    if (type != 0) {
                        int n4 = 0;
                        Label_0152: {
                            float n3;
                            if (type == 5) {
                                n3 = typedValue.getDimension(displayMetrics);
                            }
                            else {
                                if (type != 6) {
                                    n4 = 0;
                                    break Label_0152;
                                }
                                final int widthPixels2 = displayMetrics.widthPixels;
                                n3 = typedValue.getFraction((float)widthPixels2, (float)widthPixels2);
                            }
                            n4 = (int)n3;
                        }
                        if (n4 > 0) {
                            final Rect m = this.M;
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n4 - (m.left + m.right), View$MeasureSpec.getSize(n)), 1073741824);
                            n = 1;
                            break Label_0205;
                        }
                    }
                }
            }
            final int n5 = 0;
            measureSpec2 = n;
            n = n5;
        }
        int measureSpec3 = measureSpec;
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (b) {
                typedValue2 = this.K;
            }
            else {
                typedValue2 = this.L;
            }
            measureSpec3 = measureSpec;
            if (typedValue2 != null) {
                final int type2 = typedValue2.type;
                measureSpec3 = measureSpec;
                if (type2 != 0) {
                    int n7 = 0;
                    Label_0312: {
                        float n6;
                        if (type2 == 5) {
                            n6 = typedValue2.getDimension(displayMetrics);
                        }
                        else {
                            if (type2 != 6) {
                                n7 = 0;
                                break Label_0312;
                            }
                            final int heightPixels2 = displayMetrics.heightPixels;
                            n6 = typedValue2.getFraction((float)heightPixels2, (float)heightPixels2);
                        }
                        n7 = (int)n6;
                    }
                    measureSpec3 = measureSpec;
                    if (n7 > 0) {
                        final Rect i = this.M;
                        measureSpec3 = View$MeasureSpec.makeMeasureSpec(Math.min(n7 - (i.top + i.bottom), View$MeasureSpec.getSize(measureSpec)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(measureSpec2, measureSpec3);
        final int measuredWidth = this.getMeasuredWidth();
        final int measureSpec4 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        Label_0520: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (b) {
                    typedValue3 = this.H;
                }
                else {
                    typedValue3 = this.G;
                }
                if (typedValue3 != null) {
                    n = typedValue3.type;
                    if (n != 0) {
                        Label_0470: {
                            float n8;
                            if (n == 5) {
                                n8 = typedValue3.getDimension(displayMetrics);
                            }
                            else {
                                if (n != 6) {
                                    n = 0;
                                    break Label_0470;
                                }
                                n = displayMetrics.widthPixels;
                                n8 = typedValue3.getFraction((float)n, (float)n);
                            }
                            n = (int)n8;
                        }
                        measureSpec = n;
                        if (n > 0) {
                            final Rect j = this.M;
                            measureSpec = n - (j.left + j.right);
                        }
                        if (measuredWidth < measureSpec) {
                            measureSpec = View$MeasureSpec.makeMeasureSpec(measureSpec, 1073741824);
                            n = n2;
                            break Label_0520;
                        }
                    }
                }
            }
            n = 0;
            measureSpec = measureSpec4;
        }
        if (n != 0) {
            super.onMeasure(measureSpec, measureSpec3);
        }
    }
    
    public void setAttachListener(final a n) {
        this.N = n;
    }
    
    public interface a
    {
        void a();
        
        void onDetachedFromWindow();
    }
}
