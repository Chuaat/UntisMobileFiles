// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.view;

import org.jetbrains.annotations.f;
import org.joda.time.n0;
import com.untis.mobile.utils.time.a;
import android.graphics.Canvas;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.graphics.Paint;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/view/b;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/j2;", "b", "c", "d", "basicCanvas", "onDraw", "", "L", "F", "radius", "Lorg/joda/time/t;", "H", "Lorg/joda/time/t;", "date", "", "K", "I", "colorDivider", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "J", "colorPastOverlay", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Lorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends View
{
    @e
    private final v G;
    @e
    private final t H;
    @e
    private final Paint I;
    private final int J;
    private final int K;
    private final float L;
    
    public b(@e final v g, @e final t h) {
        k0.p(g, "timeTableActivityService");
        k0.p(h, "date");
        super((Context)g.W0());
        this.G = g;
        this.H = h;
        final Paint i = new Paint(1);
        this.I = i;
        this.J = d.f((Context)g.W0(), 2131099690);
        this.K = d.f((Context)g.W0(), 2131099677);
        this.L = g.W0().getResources().getDimension(2131165280);
        this.setBackgroundColor(0);
        i.setStrokeWidth(g.W0().getResources().getDimension(2131165366));
    }
    
    private final void b(final Canvas canvas) {
        if (((org.joda.time.base.e)this.H).o((n0)a.b())) {
            this.c(canvas);
        }
        if (((org.joda.time.base.e)this.H).p((n0)a.b())) {
            this.d(canvas);
        }
    }
    
    private final void c(final Canvas canvas) {
        canvas.drawColor(this.J);
    }
    
    private final void d(final Canvas canvas) {
        final float m1 = this.G.m1(((org.joda.time.base.a)a.a()).p1());
        final float n = (float)canvas.getWidth();
        this.I.setColor(this.J);
        canvas.drawRect(0.0f, 0.0f, n, m1, this.I);
        this.I.setColor(this.K);
        canvas.drawLine(0.0f, m1, n, m1, this.I);
        canvas.drawCircle(n, m1, this.L, this.I);
    }
    
    public void a() {
    }
    
    protected void onDraw(@f final Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.b(canvas);
    }
}
