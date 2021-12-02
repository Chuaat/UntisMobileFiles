// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room.filter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.a;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.text.s;
import java.util.ArrayList;
import android.view.View;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001d¨\u0006-" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/filter/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lkotlin/j2;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "n", "getItemCount", "holder", "position", "l", "", "filter", "j", "", "k", "d", "Ljava/lang/String;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "e", "Ljava/util/List;", "filtered", "f", "I", "highlightColor", "a", "departments", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "department", "onDepartment", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$h<o0>
{
    @e
    private final List<CalendarPeriodRoomDepartment> a;
    @e
    private final l<CalendarPeriodRoomDepartment, j2> b;
    private final LayoutInflater c;
    @e
    private String d;
    @e
    private List<CalendarPeriodRoomDepartment> e;
    private final int f;
    
    public d(@e final Context context, @e final List<CalendarPeriodRoomDepartment> a, @e final l<? super CalendarPeriodRoomDepartment, j2> b) {
        k0.p(context, "context");
        k0.p(a, "departments");
        k0.p(b, "onDepartment");
        this.a = a;
        this.b = (l<CalendarPeriodRoomDepartment, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
        this.d = "";
        this.e = v.I5((Iterable<? extends CalendarPeriodRoomDepartment>)a);
        this.f = androidx.core.content.d.f(context, 2131100003);
    }
    
    private final void i() {
        final List<CalendarPeriodRoomDepartment> a = this.a;
        final ArrayList<CalendarPeriodRoomDepartment> e = new ArrayList<CalendarPeriodRoomDepartment>();
        for (final CalendarPeriodRoomDepartment next : a) {
            final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment = next;
            final boolean u1 = s.U1((CharSequence)this.d);
            int n = 1;
            if (u1 ^ true) {
                n = n;
                if (!s.S2((CharSequence)calendarPeriodRoomDepartment.getDisplayName(), (CharSequence)this.d, true)) {
                    n = 0;
                }
            }
            if (n != 0) {
                e.add(next);
            }
        }
        this.e = e;
    }
    
    private static final void m(final d d, final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment, final View view) {
        k0.p(d, "this$0");
        k0.p(calendarPeriodRoomDepartment, "$department");
        d.b.invoke(calendarPeriodRoomDepartment);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public final void j(@e final String d) {
        k0.p(d, "filter");
        this.d = d;
        this.i();
        this.notifyDataSetChanged();
    }
    
    public final boolean k() {
        return this.e.isEmpty();
    }
    
    public void l(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment = this.e.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ai)).setText((CharSequence)h.P(calendarPeriodRoomDepartment.getDisplayName(), this.f, this.d));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.yi)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.room.filter.c(this, calendarPeriodRoomDepartment));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.zi)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 n(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.c.inflate(2131492998, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.calendar_item_period_room_building, parent, false)");
        return new o0(inflate);
    }
}
