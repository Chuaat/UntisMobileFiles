// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room;

import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import org.apmem.tools.layouts.FlowLayout;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomAvailability;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup$LayoutParams;
import org.apmem.tools.layouts.FlowLayout$a;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Collection;
import kotlin.text.s;
import android.view.View;
import kotlin.jvm.internal.w;
import androidx.core.content.d;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomType;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDetail;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BL\u0012\u0006\u0010/\u001a\u00020,\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\t0?¢\u0006\u0004\bD\u0010EJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 J\u0014\u0010%\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"J\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u0007R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00104\u001a\n 1*\u0004\u0018\u000100008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010*R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010*R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107¨\u0006F" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "title", "", "isFilterActive", "Lkotlin/j2;", "j", "i", "", "viewType", "u", "getItemCount", "holder", "position", "s", "filter", "k", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "building", "l", "n", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "department", "m", "o", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "roomType", "v", "", "p", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "rooms", "w", "r", "q", "c", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "Ljava/util/List;", "roomTypes", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "e", "Landroid/view/LayoutInflater;", "inflater", "h", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "I", "entityTagMargin", "b", "f", "filtered", "g", "Ljava/lang/String;", "highlightColor", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "room", "onRoom", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private List<CalendarPeriodRoomDetail> b;
    @f
    private CalendarPeriodRoomDepartment c;
    @e
    private final l<CalendarPeriodRoomDetail, j2> d;
    private final LayoutInflater e;
    @e
    private List<CalendarPeriodRoomDetail> f;
    @e
    private String g;
    @f
    private CalendarPeriodRoomBuilding h;
    @e
    private List<CalendarPeriodRoomType> i;
    private final int j;
    private final int k;
    
    public b(@e final Context a, @e final List<CalendarPeriodRoomDetail> b, @f final CalendarPeriodRoomDepartment c, @e final l<? super CalendarPeriodRoomDetail, j2> d) {
        k0.p(a, "context");
        k0.p(b, "rooms");
        k0.p(d, "onRoom");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<CalendarPeriodRoomDetail, j2>)d;
        this.e = LayoutInflater.from(a);
        this.f = v.I5((Iterable<? extends CalendarPeriodRoomDetail>)this.b);
        this.g = "";
        this.i = new ArrayList<CalendarPeriodRoomType>();
        this.j = (int)a.getResources().getDimension(2131165280);
        this.k = androidx.core.content.d.f(a, 2131100003);
    }
    
    private final void i() {
        final List<CalendarPeriodRoomDetail> b = this.b;
        final ArrayList<CalendarPeriodRoomDetail> list = new ArrayList<CalendarPeriodRoomDetail>();
        for (final CalendarPeriodRoomDetail next : b) {
            final CalendarPeriodRoomDetail calendarPeriodRoomDetail = next;
            final boolean u1 = s.U1((CharSequence)this.g);
            final boolean b2 = true;
            int n = 0;
            Label_0356: {
                Label_0079: {
                    if (!(u1 ^ true) || s.S2((CharSequence)calendarPeriodRoomDetail.getDisplayName(), (CharSequence)this.g, true)) {
                        final CalendarPeriodRoomBuilding h = this.h;
                        final Object o = null;
                        if (h != null) {
                            final CalendarPeriodRoomBuilding building = calendarPeriodRoomDetail.getBuilding();
                            Object value;
                            if (building == null) {
                                value = null;
                            }
                            else {
                                value = building.getId();
                            }
                            final CalendarPeriodRoomBuilding h2 = this.h;
                            Object value2;
                            if (h2 == null) {
                                value2 = null;
                            }
                            else {
                                value2 = h2.getId();
                            }
                            if (!k0.g(value, value2)) {
                                break Label_0079;
                            }
                        }
                        if (this.c != null) {
                            final CalendarPeriodRoomDepartment department = calendarPeriodRoomDetail.getDepartment();
                            Object value3;
                            if (department == null) {
                                value3 = null;
                            }
                            else {
                                value3 = department.getId();
                            }
                            final CalendarPeriodRoomDepartment c = this.c;
                            Object value4;
                            if (c == null) {
                                value4 = o;
                            }
                            else {
                                value4 = c.getId();
                            }
                            if (!k0.g(value3, value4)) {
                                break Label_0079;
                            }
                        }
                        n = (b2 ? 1 : 0);
                        if (!(this.i.isEmpty() ^ true)) {
                            break Label_0356;
                        }
                        final List<CalendarPeriodRoomType> i = this.i;
                        boolean b3 = false;
                        Label_0344: {
                            if (!(i instanceof Collection) || !i.isEmpty()) {
                                final Iterator<Object> iterator2 = i.iterator();
                                while (iterator2.hasNext()) {
                                    final long id = iterator2.next().getId();
                                    final CalendarPeriodRoomType roomType = calendarPeriodRoomDetail.getRoomType();
                                    if (roomType != null && id == roomType.getId()) {
                                        b3 = false;
                                        break Label_0344;
                                    }
                                }
                            }
                            b3 = true;
                        }
                        n = (b2 ? 1 : 0);
                        if (!b3) {
                            break Label_0356;
                        }
                    }
                }
                n = 0;
            }
            if (n != 0) {
                list.add(next);
            }
        }
        this.f = (List<CalendarPeriodRoomDetail>)v.d5((Iterable<? extends Comparable>)list);
    }
    
    private final void j(final ViewGroup viewGroup, final String text, final boolean b) {
        int n;
        if (b) {
            n = 2131952230;
        }
        else {
            n = 2131952229;
        }
        final AppCompatTextView appCompatTextView = new AppCompatTextView((Context)new androidx.appcompat.view.d(this.a, n));
        ((TextView)appCompatTextView).setText((CharSequence)text);
        final FlowLayout$a flowLayout$a = new FlowLayout$a(-2, -2);
        ((ViewGroup$MarginLayoutParams)flowLayout$a).setMarginEnd(this.j);
        viewGroup.addView((View)appCompatTextView, (ViewGroup$LayoutParams)flowLayout$a);
    }
    
    private static final void t(final b b, final CalendarPeriodRoomDetail calendarPeriodRoomDetail, final View view) {
        k0.p(b, "this$0");
        k0.p(calendarPeriodRoomDetail, "$calendarPeriodRoomDetail");
        b.d.invoke(calendarPeriodRoomDetail);
    }
    
    public int getItemCount() {
        return this.f.size();
    }
    
    public final void k(@e final String g) {
        k0.p(g, "filter");
        this.g = g;
        this.i();
        this.notifyDataSetChanged();
    }
    
    public final void l(@f final CalendarPeriodRoomBuilding h) {
        this.h = h;
        this.i();
        this.notifyDataSetChanged();
    }
    
    public final void m(@f final CalendarPeriodRoomDepartment c) {
        this.c = c;
        this.i();
        this.notifyDataSetChanged();
    }
    
    @f
    public final CalendarPeriodRoomBuilding n() {
        return this.h;
    }
    
    @f
    public final CalendarPeriodRoomDepartment o() {
        return this.c;
    }
    
    @e
    public final List<CalendarPeriodRoomType> p() {
        return this.i;
    }
    
    public final boolean q() {
        return this.f.isEmpty();
    }
    
    public final boolean r() {
        return this.b.isEmpty();
    }
    
    public void s(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final CalendarPeriodRoomDetail calendarPeriodRoomDetail = this.f.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ii)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(calendarPeriodRoomDetail.getDisplayName(), this.k, this.g));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.Gi);
        final CalendarPeriodRoomAvailability availability = calendarPeriodRoomDetail.getAvailability();
        final CalendarPeriodRoomAvailability reservable = CalendarPeriodRoomAvailability.Reservable;
        final boolean b = true;
        ((TextView)appCompatTextView).setVisibility(com.untis.mobile.utils.extension.h.U(availability == reservable, 0, 1, null));
        final FlowLayout flowLayout = (FlowLayout)o0.itemView.findViewById(com.untis.mobile.c.i.Hi);
        ((ViewGroup)flowLayout).removeAllViews();
        final CalendarPeriodRoomBuilding building = calendarPeriodRoomDetail.getBuilding();
        if (building != null) {
            k0.o(flowLayout, "tagParent");
            final String displayName = building.getDisplayName();
            final CalendarPeriodRoomBuilding h = this.h;
            this.j((ViewGroup)flowLayout, displayName, h != null && h.getId() == building.getId());
        }
        final CalendarPeriodRoomDepartment department = calendarPeriodRoomDetail.getDepartment();
        if (department != null) {
            k0.o(flowLayout, "tagParent");
            final String displayName2 = department.getDisplayName();
            final CalendarPeriodRoomDepartment c = this.c;
            this.j((ViewGroup)flowLayout, displayName2, c != null && c.getId() == department.getId());
        }
        final CalendarPeriodRoomType roomType = calendarPeriodRoomDetail.getRoomType();
        if (roomType != null) {
            final List<CalendarPeriodRoomType> i = this.i;
            boolean b2 = false;
            Label_0370: {
                if (!(i instanceof Collection) || !i.isEmpty()) {
                    final Iterator<Object> iterator = i.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().getId() == roomType.getId()) {
                            b2 = b;
                            break Label_0370;
                        }
                    }
                }
                b2 = false;
            }
            k0.o(flowLayout, "tagParent");
            this.j((ViewGroup)flowLayout, roomType.getDisplayName(), b2);
        }
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.Bi)).setOnClickListener((View$OnClickListener)new a(this, calendarPeriodRoomDetail));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Fi)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 u(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.e.inflate(2131492997, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.calendar_item_period_room, parent, false)");
        return new o0(inflate);
    }
    
    public final boolean v(@e final CalendarPeriodRoomType calendarPeriodRoomType) {
        k0.p(calendarPeriodRoomType, "roomType");
        boolean b;
        if (this.i.contains(calendarPeriodRoomType)) {
            this.i.remove(calendarPeriodRoomType);
            b = false;
        }
        else {
            this.i.add(calendarPeriodRoomType);
            b = true;
        }
        this.i();
        this.notifyDataSetChanged();
        return b;
    }
    
    public final void w(@e final List<CalendarPeriodRoomDetail> b) {
        k0.p(b, "rooms");
        this.b = b;
        this.i();
        this.notifyDataSetChanged();
    }
}
