// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import kotlin.collections.y0;
import android.view.View;
import android.view.ViewGroup;
import com.untis.mobile.utils.extension.h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.d0;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Child;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import java.util.List;
import org.joda.time.t;
import java.util.Map;
import org.jetbrains.annotations.e;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\u0012\u0006\u0010,\u001a\u00020)\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010(\u001a\u00020%\u0012!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000b0-\u0012!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u000b0-¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\"\u0010\u0015\u001a\u00020\u000b2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0010R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001e\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00065" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "j", "getItemCount", "holder", "position", "Lkotlin/j2;", "i", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "h", "", "Lorg/joda/time/t;", "", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "events", "k", "Lcom/untis/mobile/persistence/models/EntityType;", "c", "Lcom/untis/mobile/persistence/models/EntityType;", "role", "b", "Ljava/util/Map;", "Ljava/util/List;", "sortedDates", "Lcom/untis/mobile/persistence/models/profile/Child;", "filterChild", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "g", "Landroid/view/LayoutInflater;", "inflater", "", "d", "Z", "isEndOfPremium", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "event", "onEventNotification", "onEventAttachment", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/Map;Lcom/untis/mobile/persistence/models/EntityType;ZLn6/l;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends RecyclerView$h<o0>
{
    @e
    private final Fragment a;
    @e
    private Map<t, ? extends List<DashboardEvent>> b;
    @e
    private final EntityType c;
    private final boolean d;
    @e
    private final l<DashboardEvent, j2> e;
    @e
    private final l<DashboardEvent, j2> f;
    private final LayoutInflater g;
    @e
    private List<t> h;
    @f
    private Child i;
    
    public i(@e final Fragment a, @e final Map<t, ? extends List<DashboardEvent>> b, @e final EntityType c, final boolean d, @e final l<? super DashboardEvent, j2> e, @e final l<? super DashboardEvent, j2> f) {
        k0.p(a, "fragment");
        k0.p(b, "events");
        k0.p(c, "role");
        k0.p(e, "onEventNotification");
        k0.p(f, "onEventAttachment");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (l<DashboardEvent, j2>)e;
        this.f = (l<DashboardEvent, j2>)f;
        this.g = LayoutInflater.from(a.requireContext().getApplicationContext());
        this.h = v.d5((Iterable<? extends t>)this.b.keySet());
    }
    
    public int getItemCount() {
        return this.h.size();
    }
    
    public final void h(@f final Child i) {
        this.i = i;
        this.notifyDataSetChanged();
    }
    
    public void i(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final t t = this.h.get(n);
        List<DashboardEvent> e;
        if ((e = (List<DashboardEvent>)this.b.get(t)) == null) {
            e = v.E();
        }
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.Ix)).setText((CharSequence)d0.m(new t((Object)t)));
        final d adapter = new d(this.a, e, this.i, this.c, this.d, this.e, this.f);
        ((RecyclerView)o0.itemView.findViewById(com.untis.mobile.c.i.Jx)).setAdapter((RecyclerView$h)adapter);
        o0.itemView.setVisibility(com.untis.mobile.utils.extension.h.U(adapter.getItemCount() > 0, 0, 1, null));
    }
    
    @e
    public o0 j(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.g.inflate(2131493193, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_upcoming_section, parent, false)");
        return new o0(inflate);
    }
    
    public final void k(@f final Map<t, ? extends List<DashboardEvent>> map) {
        Map<t, ? extends List<DashboardEvent>> z = map;
        if (map == null) {
            z = y0.z();
        }
        this.b = z;
        this.h = (List<t>)v.d5((Iterable<? extends Comparable>)z.keySet());
        this.notifyDataSetChanged();
    }
}
