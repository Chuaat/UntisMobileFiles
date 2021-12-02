// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.constraintlayout.core.widgets.e;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class i extends View
{
    private int G;
    private View H;
    private int I;
    
    public i(final Context context) {
        super(context);
        this.G = -1;
        this.H = null;
        this.I = 4;
        this.a(null);
    }
    
    public i(final Context context, final AttributeSet set) {
        super(context, set);
        this.G = -1;
        this.H = null;
        this.I = 4;
        this.a(set);
    }
    
    public i(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = -1;
        this.H = null;
        this.I = 4;
        this.a(set);
    }
    
    public i(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n);
        this.G = -1;
        this.H = null;
        this.I = 4;
        this.a(set);
    }
    
    private void a(final AttributeSet set) {
        super.setVisibility(this.I);
        this.G = -1;
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.J8);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.K8) {
                    this.G = obtainStyledAttributes.getResourceId(index, this.G);
                }
                else if (index == j.m.L8) {
                    this.I = obtainStyledAttributes.getInt(index, this.I);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public void b(final ConstraintLayout constraintLayout) {
        if (this.H == null) {
            return;
        }
        final ConstraintLayout.b b = (ConstraintLayout.b)this.getLayoutParams();
        final ConstraintLayout.b b2 = (ConstraintLayout.b)this.H.getLayoutParams();
        b2.u0.V1(0);
        final e.b h = b.u0.H();
        final e.b g = e.b.G;
        if (h != g) {
            b.u0.W1(b2.u0.j0());
        }
        if (b.u0.g0() != g) {
            b.u0.s1(b2.u0.D());
        }
        b2.u0.V1(8);
    }
    
    public void c(final ConstraintLayout constraintLayout) {
        if (this.G == -1 && !this.isInEditMode()) {
            this.setVisibility(this.I);
        }
        final View viewById = constraintLayout.findViewById(this.G);
        if ((this.H = viewById) != null) {
            ((ConstraintLayout.b)viewById.getLayoutParams()).i0 = true;
            this.H.setVisibility(0);
            this.setVisibility(0);
        }
    }
    
    public View getContent() {
        return this.H;
    }
    
    public int getEmptyVisibility() {
        return this.I;
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            final Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint$Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            final Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float)rect.height());
            final int height = rect.height();
            final int width = rect.width();
            paint.setTextAlign(Paint$Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", width / 2.0f - rect.width() / 2.0f - rect.left, height / 2.0f + rect.height() / 2.0f - rect.bottom, paint);
        }
    }
    
    public void setContentId(final int g) {
        if (this.G == g) {
            return;
        }
        final View h = this.H;
        if (h != null) {
            h.setVisibility(0);
            ((ConstraintLayout.b)this.H.getLayoutParams()).i0 = false;
            this.H = null;
        }
        if ((this.G = g) != -1) {
            final View viewById = ((View)this.getParent()).findViewById(g);
            if (viewById != null) {
                viewById.setVisibility(8);
            }
        }
    }
    
    public void setEmptyVisibility(final int i) {
        this.I = i;
    }
}
