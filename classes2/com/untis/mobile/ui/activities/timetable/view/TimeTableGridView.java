// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.view;

import com.untis.mobile.utils.a;
import android.graphics.Canvas;
import java.util.Iterator;
import org.joda.time.g;
import androidx.core.content.d;
import android.util.AttributeSet;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import java.util.ArrayList;
import android.graphics.Rect;
import android.graphics.Paint;
import org.jetbrains.annotations.f;
import com.untis.mobile.ui.activities.timetable.v;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u0011\b\u0016\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=B\u001b\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b<\u0010@B#\b\u0016\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010A\u001a\u00020\t¢\u0006\u0004\b<\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001eR&\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000b0+j\b\u0012\u0004\u0012\u00020\u000b`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u001e¨\u0006E" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/view/TimeTableGridView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/j2;", "c", "", "useTimeGrid", "e", "", "index", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "unit", "f", "", "y", "offset", "b", "d", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "setUpWith", "basicCanvas", "onDraw", "L", "F", "textHeight", "M", "textSize", "O", "I", "colorDivider", "N", "padding", "J", "smallTextHeight", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "textBounds", "P", "colorUnitBackground", "R", "colorTime", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "S", "Ljava/util/ArrayList;", "units", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "Landroid/graphics/Paint;", "H", "Landroid/graphics/Paint;", "paint", "K", "smallTextSize", "Q", "colorLabel", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "T", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableGridView extends View
{
    @e
    public static final a T;
    @e
    private static final String U = "MWqp";
    @f
    private v G;
    @e
    private final Paint H;
    @e
    private final Rect I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    @e
    private ArrayList<TimeGridUnit> S;
    
    static {
        T = new a(null);
    }
    
    public TimeTableGridView(@e final Context context) {
        k0.p(context, "context");
        this(context, null);
    }
    
    public TimeTableGridView(@e final Context context, @f final AttributeSet set) {
        k0.p(context, "context");
        this(context, set, 0);
    }
    
    public TimeTableGridView(@e final Context context, @f final AttributeSet set, final int n) {
        k0.p(context, "context");
        super(context, set, n);
        this.setBackgroundColor(0);
        this.H = new Paint(1);
        this.I = new Rect();
        this.O = d.f(this.getContext(), 2131100044);
        this.P = d.f(this.getContext(), 2131100059);
        this.Q = d.f(this.getContext(), 2131100063);
        this.R = d.f(this.getContext(), 2131100049);
        this.S = new ArrayList<TimeGridUnit>();
    }
    
    private final boolean b(final float n, final float n2) {
        final v g = this.G;
        if (g == null) {
            return false;
        }
        for (final TimeGridUnit timeGridUnit : this.S) {
            final float m1 = g.m1(timeGridUnit.getStart().j0(org.joda.time.g.P()));
            final float m2 = g.m1(timeGridUnit.getEnd().j0(org.joda.time.g.P()));
            if (Math.abs(m1 - n) <= n2) {
                return true;
            }
            if (Math.abs(m2 - n) <= n2) {
                return true;
            }
        }
        return false;
    }
    
    private final void c(final Canvas canvas) {
        final boolean j1 = com.untis.mobile.utils.a.a(this.getContext()).J1();
        this.d(canvas, j1);
        this.e(canvas, j1);
    }
    
    private final void d(final Canvas canvas, final boolean b) {
        final v g = this.G;
        if (g == null) {
            return;
        }
        final float n = (float)this.getWidth();
        int n2 = 1;
        while (true) {
            final int n3 = n2 + 1;
            final float m1 = g.m1(n2 * 60);
            if (!b || !this.b(m1, this.J)) {
                this.H.setColor(this.R);
                this.H.setTextSize(this.K);
                final String g2 = new org.joda.time.v(n2, 0).g4("H:mm");
                this.H.getTextBounds(g2, 0, g2.length(), this.I);
                canvas.drawText(g2, n * 0.5f - this.I.centerX(), m1 - this.I.centerY(), this.H);
            }
            if (n3 > 23) {
                break;
            }
            n2 = n3;
        }
    }
    
    private final void e(final Canvas canvas, final boolean b) {
        if ((this.S.isEmpty() ^ true) && b) {
            final ArrayList<TimeGridUnit> s = this.S;
            int n = 0;
            for (final TimeGridUnit next : s) {
                if (n < 0) {
                    kotlin.collections.v.W();
                }
                this.f(canvas, n, next);
                ++n;
            }
        }
    }
    
    private final void f(final Canvas canvas, int n, final TimeGridUnit timeGridUnit) {
        final v g = this.G;
        if (g == null) {
            return;
        }
        final float m1 = g.m1(timeGridUnit.getStart().j0(org.joda.time.g.P()));
        final float m2 = g.m1(timeGridUnit.getEnd().j0(org.joda.time.g.P()));
        final float n2 = (float)canvas.getWidth();
        this.H.setColor(this.P);
        canvas.drawRect(0.0f, m1, n2, m2, this.H);
        this.H.setColor(this.O);
        canvas.drawLine(0.0f, m1, n2, m1, this.H);
        this.H.setColor(this.Q);
        this.H.setTextSize(this.M);
        final int length = timeGridUnit.getLabel().length();
        final int n3 = 1;
        String s;
        if (length > 0) {
            s = timeGridUnit.getLabel();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(n + 1);
            sb.append('.');
            s = sb.toString();
        }
        this.H.getTextBounds(s, 0, s.length(), this.I);
        final float n4 = (float)this.I.centerX();
        final float n5 = m2 - m1;
        canvas.drawText(s, n2 * 0.5f - n4, 0.5f * n5 + m1 - this.I.centerY(), this.H);
        this.H.setColor(this.R);
        this.H.setTextSize(this.K);
        if (n5 >= this.I.height() * 2) {
            n = n3;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            final String g2 = timeGridUnit.getStart().g4("H:mm");
            k0.o(g2, "unit.start.toString(\"H:mm\")");
            this.H.getTextBounds(g2, 0, g2.length(), this.I);
            final float n6 = this.N;
            canvas.drawText(g2, n6, m1 + n6 + this.I.height(), this.H);
            final String g3 = timeGridUnit.getEnd().g4("H:mm");
            k0.o(g3, "unit.end.toString(\"H:mm\")");
            this.H.getTextBounds(g3, 0, g3.length(), this.I);
            canvas.drawText(g3, n2 - this.N - this.I.width(), m2 - this.N, this.H);
        }
        this.H.setColor(this.O);
        canvas.drawLine(0.0f, m2, n2, m2, this.H);
    }
    
    public void a() {
    }
    
    protected void onDraw(@f final Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.c(canvas);
    }
    
    public final void setUpWith(@e final v g) {
        k0.p(g, "timeTableActivityService");
        this.G = g;
        final float dimension = this.getResources().getDimension(2131165284);
        this.K = dimension;
        this.H.setTextSize(dimension);
        this.H.getTextBounds("MWqp", 0, 4, this.I);
        this.J = (float)this.I.height();
        final float dimension2 = this.getResources().getDimension(2131165282);
        this.M = dimension2;
        this.H.setTextSize(dimension2);
        this.H.getTextBounds("MWqp", 0, 4, this.I);
        this.L = (float)this.I.height();
        this.N = this.getResources().getDimension(2131165280);
        this.S = g.u2();
        this.postInvalidate();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/ui/activities/timetable/view/TimeTableGridView$a", "", "", "EXAMPLE_TEXT", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
