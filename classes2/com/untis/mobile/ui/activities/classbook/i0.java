// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import android.view.ViewGroup;
import android.graphics.Canvas;
import android.view.View$OnTouchListener;
import java.util.Iterator;
import kotlin.collections.t0;
import java.util.ArrayList;
import kotlin.ranges.k;
import com.untis.mobile.persistence.models.masterdata.Student;
import androidx.appcompat.widget.LinearLayoutCompat;
import org.joda.time.l0;
import com.untis.mobile.utils.time.a;
import com.untis.mobile.c;
import android.widget.LinearLayout;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.o$f;
import androidx.recyclerview.widget.o;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import androidx.recyclerview.widget.RecyclerView$g0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.o$i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001?B'\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\b=\u0010>J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J$\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J@\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u000eR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/i0;", "Landroidx/recyclerview/widget/o$i;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "viewHolder", "", "dX", "Lkotlin/j2;", "R", "O", "P", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "X", "V", "Z", "", "clickable", "U", "Q", "viewHolderStart", "viewHolderEnd", "A", "", "actionState", "D", "Landroid/graphics/Canvas;", "canvas", "dY", "isCurrentlyActive", "w", "flags", "layoutDirection", "d", "q", "Landroidx/recyclerview/widget/RecyclerView$g0;", "currentItemViewHolder", "Lcom/untis/mobile/ui/activities/classbook/b0;", "m", "Lcom/untis/mobile/ui/activities/classbook/b0;", "adapter", "o", "swipeBack", "s", "F", "_buttonWidthRight", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "k", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "activity", "r", "_buttonWidthLeft", "l", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "n", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/ui/activities/classbook/i0$a;", "p", "Lcom/untis/mobile/ui/activities/classbook/i0$a;", "buttonState", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;Landroidx/recyclerview/widget/RecyclerView;Lcom/untis/mobile/ui/activities/classbook/b0;Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i0 extends o$i
{
    @e
    private final ClassbookActivity k;
    @e
    private final RecyclerView l;
    @e
    private final b0 m;
    @e
    private final Period n;
    private boolean o;
    @e
    private a p;
    @f
    private RecyclerView$g0 q;
    private float r;
    private float s;
    
    public i0(@e final ClassbookActivity k, @e final RecyclerView l, @e final b0 m, @e final Period n) {
        k0.p(k, "activity");
        k0.p(l, "recyclerView");
        k0.p(m, "adapter");
        k0.p(n, "period");
        super(0, 60);
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.p = a.G;
        new o((o$f)this).m(l);
    }
    
    private final float O(final RecyclerView$g0 recyclerView$g0) {
        if (this.r == 0.0f && recyclerView$g0 != null) {
            this.r = (float)((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.fv)).getWidth();
        }
        return this.r;
    }
    
    private final float P(final RecyclerView$g0 recyclerView$g0) {
        if (this.s == 0.0f && recyclerView$g0 != null) {
            this.s = -(float)((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.av)).getWidth();
            if (this.Q()) {
                this.s -= ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.cv)).getWidth();
            }
        }
        return this.s;
    }
    
    private final boolean Q() {
        final org.joda.time.c a = com.untis.mobile.utils.time.a.a();
        return ((org.joda.time.base.c)this.n.getStart()).C((l0)a) && ((org.joda.time.base.c)this.n.getEnd()).R((l0)a);
    }
    
    private final void R(final RecyclerView$g0 recyclerView$g0, final float translationX) {
        if (recyclerView$g0 == null) {
            return;
        }
        final int adapterPosition = recyclerView$g0.getAdapterPosition();
        if (adapterPosition < 0) {
            return;
        }
        final Student w = this.m.W(adapterPosition);
        int visibility = 8;
        Label_0284: {
            LinearLayout linearLayout = null;
            Label_0204: {
                if (translationX >= 0.0f) {
                    if (translationX > 0.0f) {
                        if (this.m.d0(w)) {
                            ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.ev)).setVisibility(4);
                            ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.dv)).setVisibility(0);
                            ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.gv)).setVisibility(4);
                            linearLayout = (LinearLayout)recyclerView$g0.itemView.findViewById(c.i.cv);
                            break Label_0204;
                        }
                        ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.ev)).setVisibility(0);
                    }
                    else {
                        ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.ev)).setVisibility(4);
                    }
                    ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.dv)).setVisibility(4);
                    ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.gv)).setVisibility(4);
                    break Label_0284;
                }
                ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.ev)).setVisibility(4);
                ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.dv)).setVisibility(4);
                ((LinearLayout)recyclerView$g0.itemView.findViewById(c.i.gv)).setVisibility(0);
                linearLayout = (LinearLayout)recyclerView$g0.itemView.findViewById(c.i.cv);
                if (this.Q()) {
                    visibility = 0;
                    linearLayout = linearLayout;
                }
            }
            linearLayout.setVisibility(visibility);
        }
        ((ViewGroup)recyclerView$g0.itemView.findViewById(c.i.Vu)).setTranslationX(translationX);
    }
    
    private static final boolean S(final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    private static final boolean T(final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    private final void U(final RecyclerView recyclerView, final boolean clickable) {
        final k k = new k(0, ((ViewGroup)recyclerView).getChildCount() - 1);
        final ArrayList<View> list = new ArrayList<View>();
        final Iterator<Integer> iterator = k.iterator();
        while (iterator.hasNext()) {
            final View child = ((ViewGroup)recyclerView).getChildAt(((t0)iterator).b());
            if (child != null) {
                list.add(child);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().setClickable(clickable);
        }
    }
    
    private final void V(final RecyclerView recyclerView, final RecyclerView$g0 recyclerView$g0) {
        ((ViewGroup)recyclerView).setOnTouchListener((View$OnTouchListener)new e0(this, recyclerView, recyclerView$g0));
    }
    
    private static final boolean W(final i0 i0, final RecyclerView recyclerView, final RecyclerView$g0 recyclerView$g0, final View view, final MotionEvent motionEvent) {
        k0.p(i0, "this$0");
        k0.p(recyclerView, "$recyclerView");
        if (motionEvent.getAction() == 0) {
            i0.Z(recyclerView, recyclerView$g0);
        }
        return false;
    }
    
    private final void X(final RecyclerView recyclerView, final RecyclerView$g0 recyclerView$g0, final float n) {
        if (recyclerView != null) {
            ((ViewGroup)recyclerView).setOnTouchListener((View$OnTouchListener)new c0(this, n, recyclerView$g0, recyclerView));
        }
    }
    
    private static final boolean Y(final i0 i0, final float n, final RecyclerView$g0 recyclerView$g0, final RecyclerView recyclerView, final View view, final MotionEvent motionEvent) {
        k0.p(i0, "this$0");
        final int action = motionEvent.getAction();
        boolean o;
        final boolean b = o = true;
        if (action != 3) {
            o = b;
            if (motionEvent.getAction() != 1) {
                o = (motionEvent.getAction() == 6 && b);
            }
        }
        if (i0.o = o) {
            a p6;
            if (n < i0.P(recyclerView$g0)) {
                p6 = a.I;
            }
            else if (n > i0.O(recyclerView$g0)) {
                p6 = a.H;
            }
            else {
                p6 = i0.p;
            }
            i0.p = p6;
            if (p6 != a.G) {
                i0.V(recyclerView, recyclerView$g0);
                i0.U(recyclerView, false);
            }
        }
        return false;
    }
    
    private final void Z(final RecyclerView recyclerView, final RecyclerView$g0 recyclerView$g0) {
        ((ViewGroup)recyclerView).setOnTouchListener((View$OnTouchListener)new d0(this, recyclerView$g0, recyclerView));
    }
    
    private static final boolean a0(final i0 i0, final RecyclerView$g0 recyclerView$g0, final RecyclerView recyclerView, final View view, final MotionEvent motionEvent) {
        k0.p(i0, "this$0");
        k0.p(recyclerView, "$recyclerView");
        if (motionEvent.getAction() == 1) {
            i0.R(recyclerView$g0, 0.0f);
            ((ViewGroup)recyclerView).setOnTouchListener((View$OnTouchListener)h0.G);
            i0.U(recyclerView, true);
            i0.o = false;
            i0.p = a.G;
            i0.q = null;
        }
        return false;
    }
    
    private static final boolean b0(final View view, final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean A(@e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0, @e final RecyclerView$g0 recyclerView$g2) {
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolderStart");
        k0.p(recyclerView$g2, "viewHolderEnd");
        return false;
    }
    
    public void D(@e final RecyclerView$g0 recyclerView$g0, int adapterPosition) {
        k0.p(recyclerView$g0, "viewHolder");
        adapterPosition = recyclerView$g0.getAdapterPosition();
        if (adapterPosition < 0) {
            return;
        }
        final Student w = this.m.W(adapterPosition);
        if (this.p == a.H) {
            ((ViewGroup)this.l).setOnTouchListener((View$OnTouchListener)f0.G);
            this.U(this.l, true);
            this.o = false;
            this.p = a.G;
            this.q = null;
            if (this.m.d0(w)) {
                this.m.B0(w);
            }
            else {
                this.m.z0(w);
            }
        }
        if (this.p == a.I) {
            ((ViewGroup)this.l).setOnTouchListener((View$OnTouchListener)g0.G);
            this.U(this.l, true);
            this.o = false;
            this.p = a.G;
            this.q = null;
            this.m.z0(w);
        }
        this.R(recyclerView$g0, 0.0f);
    }
    
    public int d(final int n, final int n2) {
        if (this.o && this.Q()) {
            final a p2 = this.p;
            if (p2 == a.I) {
                this.o = (p2 != a.G);
                return 0;
            }
        }
        return super.d(n, n2);
    }
    
    public void w(@e final Canvas canvas, @e final RecyclerView recyclerView, @e final RecyclerView$g0 q, final float a, float max, final int n, final boolean b) {
        k0.p(canvas, "canvas");
        k0.p(recyclerView, "recyclerView");
        k0.p(q, "viewHolder");
        if (n == 1) {
            final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)q.itemView.findViewById(c.i.Vu);
            Float value;
            if (linearLayoutCompat == null) {
                value = null;
            }
            else {
                value = ((ViewGroup)linearLayoutCompat).getTranslationX();
            }
            if (k0.e(value, 0.0f)) {
                this.o = false;
                this.p = i0.a.G;
                this.q = null;
            }
            final a p7 = this.p;
            if (p7 != i0.a.G) {
                if (p7 == i0.a.H) {
                    max = Math.max(a, this.O(q));
                }
                else {
                    max = a;
                }
                float min = max;
                if (this.p == i0.a.I) {
                    min = Math.min(max, this.P(q));
                }
                this.R(q, min);
            }
            else {
                this.X(recyclerView, q, a);
            }
        }
        if (this.p == i0.a.G) {
            this.R(q, a);
        }
        this.q = q;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/classbook/i0$a", "", "Lcom/untis/mobile/ui/activities/classbook/i0$a;", "<init>", "(Ljava/lang/String;I)V", "GONE", "LEFT", "RIGHT", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private enum a
    {
        G, 
        H, 
        I;
        
        static {
            J = b();
        }
        
        private static final /* synthetic */ a[] b() {
            return new a[] { a.G, a.H, a.I };
        }
    }
}
