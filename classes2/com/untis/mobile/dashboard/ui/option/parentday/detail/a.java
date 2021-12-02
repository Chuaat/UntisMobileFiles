// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday.detail;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.text.s;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.utils.d0;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointmentKt;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "i", "getItemCount", "holder", "position", "Lkotlin/j2;", "h", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "b", "Ljava/util/List;", "appointments", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "d", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "c", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "dashboardParentDayContext", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private final List<DashboardParentDayAppointment> b;
    @e
    private final c c;
    private final LayoutInflater d;
    
    public a(@e final Context a, @e final List<DashboardParentDayAppointment> b, @e final c c) {
        k0.p(a, "context");
        k0.p(b, "appointments");
        k0.p(c, "dashboardParentDayContext");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = LayoutInflater.from(a.getApplicationContext());
    }
    
    public int getItemCount() {
        return this.b.size();
    }
    
    public void h(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardParentDayAppointment dashboardParentDayAppointment = this.b.get(n);
        final View itemView = o0.itemView;
        final int sw = com.untis.mobile.c.i.Sw;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)itemView.findViewById(sw);
        final Teacher teacher = (Teacher)this.c.d().get(dashboardParentDayAppointment.getTeacherId());
        CharSequence displayableDescription;
        if (teacher == null) {
            displayableDescription = null;
        }
        else {
            displayableDescription = teacher.getDisplayableDescription();
        }
        ((TextView)appCompatTextView).setText(displayableDescription);
        ((TextView)o0.itemView.findViewById(sw)).setVisibility(h.U(this.c.e() ^ true, 0, 1, null));
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Rw)).setText((CharSequence)d0.s(DashboardParentDayAppointmentKt.interval(dashboardParentDayAppointment)));
        final View itemView2 = o0.itemView;
        final int ow = com.untis.mobile.c.i.Ow;
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)itemView2.findViewById(ow);
        final Room room = (Room)this.c.a().get(dashboardParentDayAppointment.getRoomId());
        CharSequence displayableDescription2;
        if (room == null) {
            displayableDescription2 = null;
        }
        else {
            displayableDescription2 = room.getDisplayableDescription();
        }
        ((TextView)appCompatTextView2).setText(displayableDescription2);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)o0.itemView.findViewById(com.untis.mobile.c.i.Pw);
        final CharSequence text = ((AppCompatTextView)o0.itemView.findViewById(ow)).getText();
        k0.o(text, "holder.itemView.item_dashboard_parentday_appointment_room.text");
        ((ViewGroup)linearLayoutCompat).setVisibility(h.U(s.U1(text) ^ true, 0, 1, null));
        ((RecyclerView)o0.itemView.findViewById(com.untis.mobile.c.i.Qw)).setAdapter((RecyclerView$h)new f(this.a, dashboardParentDayAppointment.getStudentSubjects(), this.c));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.Nw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 i(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.d.inflate(2131493188, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_parentday_appointment, parent, false)");
        return new o0(inflate);
    }
}
