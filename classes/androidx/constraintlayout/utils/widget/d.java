// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import androidx.annotation.p0;
import android.graphics.Path$Direction;
import android.graphics.Outline;
import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.view.ViewOutlineProvider;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatButton;

public class d extends AppCompatButton
{
    private float I;
    private float J;
    private Path K;
    ViewOutlineProvider L;
    RectF M;
    
    public d(final Context context) {
        super(context);
        this.I = 0.0f;
        this.J = Float.NaN;
        this.c(context, null);
    }
    
    public d(final Context context, final AttributeSet set) {
        super(context, set);
        this.I = 0.0f;
        this.J = Float.NaN;
        this.c(context, set);
    }
    
    public d(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = 0.0f;
        this.J = Float.NaN;
        this.c(context, set);
    }
    
    private void c(final Context context, final AttributeSet set) {
        int i = 0;
        this.setPadding(0, 0, 0, 0);
        if (set != null) {
            TypedArray obtainStyledAttributes;
            for (obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.me); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.xe) {
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                }
                else if (index == j.m.ye && Build$VERSION.SDK_INT >= 21) {
                    this.setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public void draw(final Canvas canvas) {
        boolean b;
        if (Build$VERSION.SDK_INT < 21 && this.J != 0.0f && this.K != null) {
            b = true;
            canvas.save();
            canvas.clipPath(this.K);
        }
        else {
            b = false;
        }
        super.draw(canvas);
        if (b) {
            canvas.restore();
        }
    }
    
    public float getRound() {
        return this.J;
    }
    
    public float getRoundPercent() {
        return this.I;
    }
    
    @p0(21)
    public void setRound(float n) {
        if (Float.isNaN(n)) {
            this.J = n;
            n = this.I;
            this.I = -1.0f;
            this.setRoundPercent(n);
            return;
        }
        final boolean b = this.J != n;
        this.J = n;
        if (n != 0.0f) {
            if (this.K == null) {
                this.K = new Path();
            }
            if (this.M == null) {
                this.M = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.L == null) {
                    this.setOutlineProvider(this.L = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), d.this.J);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            this.M.set(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
            this.K.reset();
            final Path k = this.K;
            final RectF m = this.M;
            n = this.J;
            k.addRoundRect(m, n, n, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    @p0(21)
    public void setRoundPercent(float i) {
        final boolean b = this.I != i;
        this.I = i;
        if (i != 0.0f) {
            if (this.K == null) {
                this.K = new Path();
            }
            if (this.M == null) {
                this.M = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.L == null) {
                    this.setOutlineProvider(this.L = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            final int width = d.this.getWidth();
                            final int height = d.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, Math.min(width, height) * d.this.I / 2.0f);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            final int width = this.getWidth();
            final int height = this.getHeight();
            i = Math.min(width, height) * this.I / 2.0f;
            this.M.set(0.0f, 0.0f, (float)width, (float)height);
            this.K.reset();
            this.K.addRoundRect(this.M, i, i, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
}
