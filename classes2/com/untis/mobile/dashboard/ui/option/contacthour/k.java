// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.ViewGroup;
import android.view.View;
import com.untis.mobile.utils.extension.h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.c;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import java.util.Objects;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import java.util.Map;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import java.util.List;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0096\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010,\u001a\u00020)\u0012!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00140/\u0012!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00140/\u0012!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00140/¢\u0006\u0004\b8\u00109J(\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0007R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\n &*\u0004\u0018\u00010%0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-¨\u0006:" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/k;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHours", "", "", "", "h", "hour", "i", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "getItemCount", "holder", "position", "Lkotlin/j2;", "k", "m", "filter", "", "j", "Ljava/lang/String;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lcom/untis/mobile/services/masterdata/a;", "b", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "c", "Ljava/util/List;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "Lcom/untis/mobile/persistence/models/EntityType;", "d", "Lcom/untis/mobile/persistence/models/EntityType;", "role", "Ljava/util/Map;", "sections", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "mail", "onMail", "phone", "onPhone", "contactHour", "onRegistration", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/services/masterdata/a;Ljava/util/List;Lcom/untis/mobile/persistence/models/EntityType;Ln6/l;Ln6/l;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k extends RecyclerView$h<o0>
{
    @e
    private final Context a;
    @e
    private final a b;
    @e
    private List<DashboardContactHour> c;
    @e
    private final EntityType d;
    @e
    private final l<String, j2> e;
    @e
    private final l<String, j2> f;
    @e
    private final l<DashboardContactHour, j2> g;
    private final LayoutInflater h;
    @e
    private Map<String, List<DashboardContactHour>> i;
    @e
    private String j;
    
    public k(@e final Context a, @e final a b, @e final List<DashboardContactHour> c, @e final EntityType d, @e final l<? super String, j2> e, @e final l<? super String, j2> f, @e final l<? super DashboardContactHour, j2> g) {
        k0.p(a, "context");
        k0.p(b, "masterDataService");
        k0.p(c, "contactHours");
        k0.p(d, "role");
        k0.p(e, "onMail");
        k0.p(f, "onPhone");
        k0.p(g, "onRegistration");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (l<String, j2>)e;
        this.f = (l<String, j2>)f;
        this.g = (l<DashboardContactHour, j2>)g;
        this.h = LayoutInflater.from(a.getApplicationContext());
        this.j = "";
        this.i = this.h(this.c);
    }
    
    private final Map<String, List<DashboardContactHour>> h(final List<DashboardContactHour> list) {
        final HashMap<String, List<DashboardContactHour>> hashMap = (HashMap<String, List<DashboardContactHour>>)new HashMap<Object, List<DashboardContactHour>>();
        for (final DashboardContactHour dashboardContactHour : list) {
            final String i = this.i(dashboardContactHour);
            final List<DashboardContactHour> list2 = hashMap.get(i);
            if (list2 == null) {
                hashMap.put(i, v.P(dashboardContactHour));
            }
            else {
                list2.add(dashboardContactHour);
            }
        }
        return hashMap;
    }
    
    private final String i(final DashboardContactHour dashboardContactHour) {
        final Teacher k = this.b.k(dashboardContactHour.getTeacherId());
        String substring = null;
        if (k != null) {
            final String lastName = k.getLastName();
            if (lastName != null) {
                substring = lastName.substring(0, 1);
                k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            }
        }
        String substring2 = substring;
        if (substring == null) {
            final String displayTeacher = dashboardContactHour.getDisplayTeacher();
            Objects.requireNonNull(displayTeacher, "null cannot be cast to non-null type java.lang.String");
            substring2 = displayTeacher.substring(0, 1);
            k0.o(substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        }
        return substring2;
    }
    
    public int getItemCount() {
        return this.i.size();
    }
    
    public final boolean j(@e final String j) {
        k0.p(j, "filter");
        this.j = j;
        this.notifyDataSetChanged();
        return true;
    }
    
    public void k(@e final o0 o0, int jw) {
        k0.p(o0, "holder");
        final String text = v.I5((Iterable<? extends String>)this.i.keySet()).get(jw);
        List<DashboardContactHour> list;
        if ((list = this.i.get(text)) == null) {
            list = new ArrayList<DashboardContactHour>();
        }
        final View itemView = o0.itemView;
        jw = com.untis.mobile.c.i.jw;
        ((TextView)itemView.findViewById(jw)).setText((CharSequence)text);
        final d adapter = new d(this.a, list, this.d, this.j, this.e, this.f, this.g);
        ((RecyclerView)o0.itemView.findViewById(com.untis.mobile.c.i.iw)).setAdapter((RecyclerView$h)adapter);
        ((TextView)o0.itemView.findViewById(jw)).setVisibility(com.untis.mobile.utils.extension.h.U(adapter.getItemCount() > 0, 0, 1, null));
    }
    
    @e
    public o0 l(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.h.inflate(2131493181, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_contacthour_section, parent, false)");
        return new o0(inflate);
    }
    
    public final void m(@e final List<DashboardContactHour> c) {
        k0.p(c, "contactHours");
        this.c = c;
        this.i = this.h(c);
        this.notifyDataSetChanged();
    }
}
