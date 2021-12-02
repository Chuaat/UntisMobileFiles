// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import org.joda.time.base.a;
import android.view.View$MeasureSpec;
import android.graphics.PorterDuff$Mode;
import org.joda.time.c;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import org.jetbrains.annotations.e;
import android.graphics.Paint;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0016\u0010#\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0013¨\u00064" }, d2 = { "Lcom/untis/mobile/ui/activities/views/f;", "Landroid/view/View;", "", "width", "height", "Lkotlin/j2;", "c", "Landroid/graphics/Canvas;", "canvas", "b", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "Landroid/graphics/Path;", "M", "Landroid/graphics/Path;", "pointerPath", "O", "I", "hourMarkerColor", "", "H", "F", "centerX", "N", "clockColor", "J", "border", "R", "secondPointerColor", "K", "pointerWidth", "Q", "minutePointerColor", "centerY", "Landroid/graphics/Paint;", "G", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/RectF;", "L", "Landroid/graphics/RectF;", "hourMarkRect", "P", "hourPointerColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends View
{
    @e
    private Paint G;
    private float H;
    private float I;
    private float J;
    private float K;
    @e
    private final RectF L;
    @e
    private final Path M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    
    public f(@e final Context context, @e final AttributeSet set) {
        k0.p(context, "context");
        k0.p(set, "attributeSet");
        super(context, set);
        this.G = new Paint(1);
        this.L = new RectF();
        this.M = new Path();
        this.setLayerType(1, (Paint)null);
        this.setBackgroundColor(0);
        this.N = d.f(context, 2131099854);
        this.O = d.f(context, 2131099856);
        this.P = d.f(context, 2131099846);
        this.Q = d.f(context, 2131099860);
        this.R = d.f(context, 2131099862);
        this.G.setStyle(Paint$Style.FILL_AND_STROKE);
    }
    
    private final void b(final Canvas canvas) {
        final c g0 = c.G0();
        canvas.drawColor(0, PorterDuff$Mode.CLEAR);
        this.G.setColor(this.N);
        final float h = this.H;
        canvas.drawCircle(h, this.I, h - this.J, this.G);
        this.G.setColor(this.O);
        canvas.save();
        int n = 1;
        int n2;
        do {
            n2 = n + 1;
            canvas.rotate(45.0f, this.H, this.I);
            canvas.drawRect(this.L, this.G);
        } while ((n = n2) <= 8);
        canvas.restore();
        this.G.setColor(this.P);
        canvas.save();
        canvas.rotate(((a)g0).p1() % 720 * 360.0f / 720.0f, this.H, this.I);
        canvas.drawPath(this.M, this.G);
        canvas.restore();
        this.G.setColor(this.Q);
        canvas.save();
        canvas.rotate(((a)g0).k5() * 360.0f / 60.0f, this.H, this.I);
        canvas.drawPath(this.M, this.G);
        canvas.restore();
        this.G.setColor(this.R);
        canvas.save();
        canvas.rotate(((a)g0).l5() * 360.0f / 60.0f, this.H, this.I);
        canvas.drawPath(this.M, this.G);
        canvas.restore();
        canvas.drawCircle(this.H, this.I, this.K, this.G);
    }
    
    private final void c(final int n, final int n2) {
        final float n3 = (float)n;
        final float h = n3 * 0.5f;
        this.H = h;
        this.I = n2 * 0.5f;
        final float j = n3 * 0.05f;
        this.J = j;
        this.K = j * 0.5f;
        this.L.set(h - j * 0.2f, j + j, h + 0.2f * j, j + 2.0f * j);
        this.M.reset();
        this.M.moveTo(this.H - this.K, this.I);
        final Path m = this.M;
        final float h2 = this.H;
        final float k = this.K;
        final float i = this.J;
        m.lineTo(h2 - k, i + i * 1.5f);
        final Path l = this.M;
        final float h3 = this.H;
        final float j2 = this.J;
        l.lineTo(h3, j2 + 0.5f * j2);
        final Path m2 = this.M;
        final float h4 = this.H;
        final float k2 = this.K;
        final float j3 = this.J;
        m2.lineTo(h4 + k2, j3 + 1.5f * j3);
        this.M.lineTo(this.H + this.K, this.I);
        this.M.lineTo(this.H - this.K, this.I);
        this.M.close();
    }
    
    public void a() {
    }
    
    protected void onDraw(@org.jetbrains.annotations.f final Canvas canvas) {
        super.onDraw(canvas);
        k0.m(canvas);
        this.b(canvas);
        this.invalidate();
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.c(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n));
    }
}
