// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room.filter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
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
import androidx.core.content.d;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B@\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011R\u001e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006-" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/filter/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lkotlin/j2;", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "n", "getItemCount", "holder", "position", "l", "", "filter", "j", "", "k", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "c", "Landroid/view/LayoutInflater;", "inflater", "f", "I", "highlightColor", "d", "Ljava/lang/String;", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "a", "Ljava/util/List;", "buildings", "e", "filtered", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "building", "onBuilding", "<init>", "(Landroid/content/Context;Ljava/util/List;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends RecyclerView$h<o0>
{
    @e
    private final List<CalendarPeriodRoomBuilding> a;
    @e
    private final l<CalendarPeriodRoomBuilding, j2> b;
    private final LayoutInflater c;
    @e
    private String d;
    @e
    private List<CalendarPeriodRoomBuilding> e;
    private final int f;
    
    public b(@e final Context context, @e final List<CalendarPeriodRoomBuilding> a, @e final l<? super CalendarPeriodRoomBuilding, j2> b) {
        k0.p(context, "context");
        k0.p(a, "buildings");
        k0.p(b, "onBuilding");
        this.a = a;
        this.b = (l<CalendarPeriodRoomBuilding, j2>)b;
        this.c = LayoutInflater.from(context.getApplicationContext());
        this.d = "";
        this.e = v.I5((Iterable<? extends CalendarPeriodRoomBuilding>)a);
        this.f = androidx.core.content.d.f(context, 2131100003);
    }
    
    private final void i() {
        final List<CalendarPeriodRoomBuilding> a = this.a;
        final ArrayList<CalendarPeriodRoomBuilding> e = new ArrayList<CalendarPeriodRoomBuilding>();
        for (final CalendarPeriodRoomBuilding next : a) {
            final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding = next;
            final boolean u1 = s.U1((CharSequence)this.d);
            int n = 1;
            if (u1 ^ true) {
                n = n;
                if (!s.S2((CharSequence)calendarPeriodRoomBuilding.getDisplayName(), (CharSequence)this.d, true)) {
                    n = 0;
                }
            }
            if (n != 0) {
                e.add(next);
            }
        }
        this.e = e;
    }
    
    private static final void m(final b b, final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding, final View view) {
        k0.p(b, "this$0");
        k0.p(calendarPeriodRoomBuilding, "$building");
        b.b.invoke(calendarPeriodRoomBuilding);
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
        final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding = this.e.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ai)).setText((CharSequence)h.P(calendarPeriodRoomBuilding.getDisplayName(), this.f, this.d));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.yi)).setOnClickListener((View$OnClickListener)new a(this, calendarPeriodRoomBuilding));
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
