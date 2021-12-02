// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import android.view.ViewParent;
import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Matrix;
import androidx.constraintlayout.motion.widget.s;
import android.graphics.Paint;

public class f extends c
{
    private static final String b0 = "MotionTelltales";
    private Paint R;
    s S;
    float[] T;
    Matrix U;
    int V;
    int W;
    float a0;
    
    public f(final Context context) {
        super(context);
        this.R = new Paint();
        this.T = new float[2];
        this.U = new Matrix();
        this.V = 0;
        this.W = -65281;
        this.a0 = 0.25f;
        this.a(context, null);
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
        this.R = new Paint();
        this.T = new float[2];
        this.U = new Matrix();
        this.V = 0;
        this.W = -65281;
        this.a0 = 0.25f;
        this.a(context, set);
    }
    
    public f(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.R = new Paint();
        this.T = new float[2];
        this.U = new Matrix();
        this.V = 0;
        this.W = -65281;
        this.a0 = 0.25f;
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, j.m.kk);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.lk) {
                    this.W = obtainStyledAttributes.getColor(index, this.W);
                }
                else if (index == j.m.nk) {
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                }
                else if (index == j.m.mk) {
                    this.a0 = obtainStyledAttributes.getFloat(index, this.a0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R.setColor(this.W);
        this.R.setStrokeWidth(5.0f);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    @Override
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.getMatrix().invert(this.U);
        if (this.S == null) {
            final ViewParent parent = this.getParent();
            if (parent instanceof s) {
                this.S = (s)parent;
            }
            return;
        }
        final int width = this.getWidth();
        final int height = this.getHeight();
        final float[] array2;
        final float[] array = array2 = new float[5];
        array2[0] = 0.1f;
        array2[1] = 0.25f;
        array2[2] = 0.5f;
        array2[3] = 0.75f;
        array2[4] = 0.9f;
        for (int i = 0; i < 5; ++i) {
            final float n = array[i];
            for (int j = 0; j < 5; ++j) {
                final float n2 = array[j];
                this.S.K0(this, n2, n, this.T, this.V);
                this.U.mapVectors(this.T);
                final float n3 = width * n2;
                final float n4 = height * n;
                final float[] t = this.T;
                final float n5 = t[0];
                final float a0 = this.a0;
                final float n6 = t[1];
                this.U.mapVectors(t);
                canvas.drawLine(n3, n4, n3 - n5 * a0, n4 - n6 * a0, this.R);
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.postInvalidate();
    }
    
    public void setText(final CharSequence charSequence) {
        super.L = charSequence.toString();
        this.requestLayout();
    }
}
