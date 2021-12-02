// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.graphics.Color;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.View;

public class c extends View
{
    private Paint G;
    private Paint H;
    private Paint I;
    private boolean J;
    private boolean K;
    protected String L;
    private Rect M;
    private int N;
    private int O;
    private int P;
    private int Q;
    
    public c(final Context context) {
        super(context);
        this.G = new Paint();
        this.H = new Paint();
        this.I = new Paint();
        this.J = true;
        this.K = true;
        this.L = null;
        this.M = new Rect();
        this.N = Color.argb(255, 0, 0, 0);
        this.O = Color.argb(255, 200, 200, 200);
        this.P = Color.argb(255, 50, 50, 50);
        this.Q = 4;
        this.a(context, null);
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, set);
        this.G = new Paint();
        this.H = new Paint();
        this.I = new Paint();
        this.J = true;
        this.K = true;
        this.L = null;
        this.M = new Rect();
        this.N = Color.argb(255, 0, 0, 0);
        this.O = Color.argb(255, 200, 200, 200);
        this.P = Color.argb(255, 50, 50, 50);
        this.Q = 4;
        this.a(context, set);
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new Paint();
        this.H = new Paint();
        this.I = new Paint();
        this.J = true;
        this.K = true;
        this.L = null;
        this.M = new Rect();
        this.N = Color.argb(255, 0, 0, 0);
        this.O = Color.argb(255, 200, 200, 200);
        this.P = Color.argb(255, 50, 50, 50);
        this.Q = 4;
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, j.m.Wi);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.Yi) {
                    this.L = obtainStyledAttributes.getString(index);
                }
                else if (index == j.m.bj) {
                    this.J = obtainStyledAttributes.getBoolean(index, this.J);
                }
                else if (index == j.m.Xi) {
                    this.N = obtainStyledAttributes.getColor(index, this.N);
                }
                else if (index == j.m.Zi) {
                    this.P = obtainStyledAttributes.getColor(index, this.P);
                }
                else if (index == j.m.aj) {
                    this.O = obtainStyledAttributes.getColor(index, this.O);
                }
                else if (index == j.m.cj) {
                    this.K = obtainStyledAttributes.getBoolean(index, this.K);
                }
            }
            obtainStyledAttributes.recycle();
        }
        while (true) {
            if (this.L != null) {
                break Label_0210;
            }
            try {
                this.L = context.getResources().getResourceEntryName(this.getId());
                this.G.setColor(this.N);
                this.G.setAntiAlias(true);
                this.H.setColor(this.O);
                this.H.setAntiAlias(true);
                this.I.setColor(this.P);
                this.Q = Math.round(this.Q * (this.getResources().getDisplayMetrics().xdpi / 160.0f));
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int width = this.getWidth();
        final int height = this.getHeight();
        int n = width;
        int n2 = height;
        if (this.J) {
            n = width - 1;
            n2 = height - 1;
            final float n3 = (float)n;
            final float n4 = (float)n2;
            canvas.drawLine(0.0f, 0.0f, n3, n4, this.G);
            canvas.drawLine(0.0f, n4, n3, 0.0f, this.G);
            canvas.drawLine(0.0f, 0.0f, n3, 0.0f, this.G);
            canvas.drawLine(n3, 0.0f, n3, n4, this.G);
            canvas.drawLine(n3, n4, 0.0f, n4, this.G);
            canvas.drawLine(0.0f, n4, 0.0f, 0.0f, this.G);
        }
        final String l = this.L;
        if (l != null && this.K) {
            this.H.getTextBounds(l, 0, l.length(), this.M);
            final float n5 = (n - this.M.width()) / 2.0f;
            final float n6 = (n2 - this.M.height()) / 2.0f + this.M.height();
            this.M.offset((int)n5, (int)n6);
            final Rect m = this.M;
            final int left = m.left;
            final int q = this.Q;
            m.set(left - q, m.top - q, m.right + q, m.bottom + q);
            canvas.drawRect(this.M, this.I);
            canvas.drawText(this.L, n5, n6, this.H);
        }
    }
}
