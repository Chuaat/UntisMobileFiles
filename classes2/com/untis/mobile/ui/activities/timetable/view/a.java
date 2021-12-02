// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.view;

import android.app.Activity;
import org.joda.time.g;
import java.util.Iterator;
import kotlin.collections.t0;
import kotlin.ranges.k;
import android.graphics.Canvas;
import kotlin.jvm.internal.w;
import android.graphics.Rect;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.DefaultColors;
import android.graphics.Paint;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import java.util.ArrayList;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u0010*\u001a\u00020'\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J>\u0010\u0015\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010!R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010!R\u0016\u00107\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010!R\u0016\u00109\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/view/a;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/j2;", "b", "g", "c", "e", "d", "f", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "holiday", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "color", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "Lkotlin/collections/ArrayList;", "timeGridUnits", "", "isTimetableExpired", "h", "basicCanvas", "onDraw", "K", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "colorHoliday", "N", "Z", "Landroid/graphics/Paint;", "J", "Landroid/graphics/Paint;", "paint", "I", "Ljava/util/ArrayList;", "", "M", "F", "holidayTextOffset", "Lorg/joda/time/t;", "H", "Lorg/joda/time/t;", "date", "P", "timetableExpiredTextOffset", "", "R", "timetableExpiredTextColor", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "S", "colorTimegridUnitBackground", "Q", "timetableExpiredColor", "T", "colorTimegridUnitDivider", "L", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "", "O", "Ljava/lang/String;", "timetableExpiredText", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Lorg/joda/time/t;Ljava/util/ArrayList;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends View
{
    @e
    private final v G;
    @e
    private final t H;
    @f
    private ArrayList<TimeGridUnit> I;
    @e
    private final Paint J;
    @e
    private DefaultColors.DefaultColor K;
    @f
    private Holiday L;
    private float M;
    private boolean N;
    @e
    private String O;
    private float P;
    private int Q;
    private int R;
    private int S;
    private int T;
    
    public a(@e final v g, @e final t h, @f final ArrayList<TimeGridUnit> i) {
        k0.p(g, "timeTableActivityService");
        k0.p(h, "date");
        super((Context)g.W0());
        this.G = g;
        this.H = h;
        this.I = i;
        final Paint j = new Paint(1);
        this.J = j;
        final DefaultColors.DefaultColor holiday = new DefaultColors().getHoliday();
        k0.o(holiday, "DefaultColors().holiday");
        this.K = holiday;
        final String string = ((Activity)g.W0()).getString(2131886787);
        k0.o(string, "timeTableActivityService.activity.getString(R.string.shared_timetableExpired_text)");
        this.O = string;
        this.Q = d.f((Context)g.W0(), 2131099964);
        this.R = d.f((Context)g.W0(), 2131099965);
        this.S = d.f((Context)g.W0(), 2131100059);
        this.T = d.f((Context)g.W0(), 2131100044);
        j.setTextSize(g.W0().getResources().getDimension(2131165282));
        final Rect rect = new Rect();
        final String o = this.O;
        j.getTextBounds(o, 0, o.length(), rect);
        this.P = rect.height() * 0.5f;
    }
    
    private final void b(final Canvas canvas) {
        if (this.N) {
            this.g(canvas);
        }
        else if (this.L != null) {
            this.e(canvas);
        }
        else {
            this.d(canvas);
            this.f(canvas);
        }
        this.c(canvas);
    }
    
    private final void c(final Canvas canvas) {
        final float n = (float)canvas.getWidth();
        final float n2 = (float)canvas.getHeight();
        this.J.setColor(-3355444);
        canvas.drawLine(n, 0.0f, n, n2, this.J);
    }
    
    private final void d(final Canvas canvas) {
        this.J.setColor(this.T);
        final float n = (float)canvas.getWidth();
        final k k = new k(1, 23);
        final ArrayList list = new ArrayList<Object>(kotlin.collections.v.Y((Iterable<?>)k, 10));
        final Iterator<? extends T> iterator = ((Iterable<? extends T>)k).iterator();
        while (iterator.hasNext()) {
            list.add(Float.valueOf(this.G.m1(((t0)iterator).b() * 60)));
        }
        final Iterator<Number> iterator2 = (Iterator<Number>)list.iterator();
        while (iterator2.hasNext()) {
            final float floatValue = iterator2.next().floatValue();
            canvas.drawLine(0.0f, floatValue, n, floatValue, this.J);
        }
    }
    
    private final void e(final Canvas canvas) {
        final Holiday l = this.L;
        if (l == null) {
            return;
        }
        final float n = canvas.getWidth() * 0.5f;
        canvas.drawColor(this.K.backColor);
        this.J.setColor(this.K.foreColor);
        canvas.save();
        canvas.rotate(-90.0f);
        final String displayName = l.getDisplayName();
        canvas.drawText(displayName, -canvas.getHeight() * 0.2f, this.M + n, this.J);
        canvas.drawText(displayName, -canvas.getHeight() * 0.4f, this.M + n, this.J);
        canvas.drawText(displayName, -canvas.getHeight() * 0.6f, this.M + n, this.J);
        canvas.drawText(displayName, -canvas.getHeight() * 0.8f, n + this.M, this.J);
        canvas.restore();
    }
    
    private final void f(final Canvas canvas) {
        if (com.untis.mobile.utils.a.a(this.getContext()).J1()) {
            final float n = (float)canvas.getWidth();
            final ArrayList<TimeGridUnit> i = this.I;
            if (i != null) {
                for (final TimeGridUnit timeGridUnit : i) {
                    final float m1 = this.G.m1(timeGridUnit.getStart().j0(g.P()));
                    final float m2 = this.G.m1(timeGridUnit.getEnd().j0(g.P()));
                    this.J.setColor(this.S);
                    canvas.drawRect(0.0f, m1, n, m2, this.J);
                    this.J.setColor(this.T);
                    canvas.drawLine(0.0f, m1, n, m1, this.J);
                    canvas.drawLine(0.0f, m2, n, m2, this.J);
                }
            }
        }
    }
    
    private final void g(final Canvas canvas) {
        final float n = canvas.getWidth() * 0.5f;
        canvas.drawColor(this.Q);
        this.J.setColor(this.R);
        canvas.save();
        canvas.rotate(-90.0f);
        canvas.drawText(this.O, -canvas.getHeight() * 0.2f, this.P + n, this.J);
        canvas.drawText(this.O, -canvas.getHeight() * 0.4f, this.P + n, this.J);
        canvas.drawText(this.O, -canvas.getHeight() * 0.6f, this.P + n, this.J);
        canvas.drawText(this.O, -canvas.getHeight() * 0.8f, n + this.P, this.J);
        canvas.restore();
    }
    
    public void a() {
    }
    
    public final void h(@f final Holiday l, @e final DefaultColors.DefaultColor k, @f final ArrayList<TimeGridUnit> list, final boolean n) {
        k0.p(k, "color");
        this.L = l;
        this.K = k;
        ArrayList<TimeGridUnit> i;
        if (list == null) {
            i = new ArrayList<TimeGridUnit>();
        }
        else {
            i = list;
        }
        this.I = i;
        this.N = n;
        if (l != null) {
            final Rect rect = new Rect();
            final String displayName = l.getDisplayName();
            this.J.getTextBounds(displayName, 0, displayName.length(), rect);
            this.M = rect.height() * 0.5f;
        }
        final Iterator<Integer> iterator = new k(1, 23).iterator();
        while (iterator.hasNext()) {
            this.G.m1(((t0)iterator).b() * 60);
        }
        if (list != null) {
            for (final TimeGridUnit timeGridUnit : list) {
                this.G.m1(timeGridUnit.getStart().j0(g.P()));
                this.G.m1(timeGridUnit.getEnd().j0(g.P()));
            }
        }
        this.postInvalidate();
    }
    
    protected void onDraw(@f final Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.b(canvas);
    }
}
