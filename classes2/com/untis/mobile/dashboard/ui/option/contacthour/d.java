// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import org.joda.time.t;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.joda.time.l0;
import org.joda.time.r;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.text.s;
import android.view.View;
import kotlin.jvm.internal.w;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.f;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import kotlin.j2;
import n6.l;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import java.util.List;
import kotlin.Metadata;
import com.untis.mobile.utils.o0;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0098\u0001\u0012\u0006\u00102\u001a\u000201\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010)\u001a\u00020&\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000703\u0012!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u000703\u0012!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u000703¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0014R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u001e\u00100\u001a\n -*\u0004\u0018\u00010,0,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u0006=" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/utils/o0;", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "Landroid/graphics/drawable/Drawable;", "m", "Lkotlin/j2;", "k", "Landroid/view/ViewGroup;", "parent", "", "viewType", "s", "getItemCount", "holder", "position", "o", "", "newContactHours", "", "t", "", "filter", "l", "n", "a", "Ljava/util/List;", "contactHours", "c", "Ljava/lang/String;", "h", "Landroid/graphics/drawable/Drawable;", "iconBackgroundColor", "j", "I", "colorHighlight", "filteredContactHours", "Lcom/untis/mobile/persistence/models/EntityType;", "b", "Lcom/untis/mobile/persistence/models/EntityType;", "role", "i", "iconSelectedBackgroundColor", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "mail", "onMail", "phone", "onPhone", "onRegistration", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/String;Ln6/l;Ln6/l;Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends RecyclerView$h<o0>
{
    @e
    private List<DashboardContactHour> a;
    @e
    private final EntityType b;
    @e
    private String c;
    @e
    private final l<String, j2> d;
    @e
    private final l<String, j2> e;
    @e
    private final l<DashboardContactHour, j2> f;
    private final LayoutInflater g;
    @f
    private final Drawable h;
    @f
    private final Drawable i;
    private final int j;
    @e
    private List<DashboardContactHour> k;
    
    public d(@e final Context context, @e final List<DashboardContactHour> a, @e final EntityType b, @e final String c, @e final l<? super String, j2> d, @e final l<? super String, j2> e, @e final l<? super DashboardContactHour, j2> f) {
        k0.p(context, "context");
        k0.p(a, "contactHours");
        k0.p(b, "role");
        k0.p(c, "filter");
        k0.p(d, "onMail");
        k0.p(e, "onPhone");
        k0.p(f, "onRegistration");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (l<String, j2>)d;
        this.e = (l<String, j2>)e;
        this.f = (l<DashboardContactHour, j2>)f;
        this.g = LayoutInflater.from(context.getApplicationContext());
        this.h = androidx.core.content.d.i(context, 2131231077);
        this.i = androidx.core.content.d.i(context, 2131231075);
        this.j = androidx.core.content.d.f(context, 2131100003);
        this.k = v.E();
        this.k();
    }
    
    private final void k() {
        if (s.U1((CharSequence)this.c)) {
            this.k = this.a;
            return;
        }
        final List<DashboardContactHour> a = this.a;
        final ArrayList<DashboardContactHour> k = new ArrayList<DashboardContactHour>();
        for (final DashboardContactHour next : a) {
            final DashboardContactHour dashboardContactHour = next;
            final String displayRooms = dashboardContactHour.getDisplayRooms();
            final String c = this.c;
            boolean b = true;
            if (!s.S2((CharSequence)displayRooms, (CharSequence)c, true)) {
                if (!s.S2((CharSequence)dashboardContactHour.getDisplayTeacher(), (CharSequence)this.c, true)) {
                    b = false;
                }
            }
            if (b) {
                k.add(next);
            }
        }
        this.k = k;
    }
    
    private final Drawable m(final DashboardContactHour dashboardContactHour) {
        if (dashboardContactHour.getRegistered()) {
            return this.i;
        }
        return this.h;
    }
    
    private static final void p(final d d, final DashboardContactHour dashboardContactHour, final View view) {
        k0.p(d, "this$0");
        k0.p(dashboardContactHour, "$contactHour");
        final l<String, j2> d2 = d.d;
        final String email = dashboardContactHour.getEmail();
        if (email == null) {
            return;
        }
        d2.invoke(email);
    }
    
    private static final void q(final d d, final DashboardContactHour dashboardContactHour, final View view) {
        k0.p(d, "this$0");
        k0.p(dashboardContactHour, "$contactHour");
        final l<String, j2> e = d.e;
        final String phone = dashboardContactHour.getPhone();
        if (phone == null) {
            return;
        }
        e.invoke(phone);
    }
    
    private static final void r(final d d, final DashboardContactHour dashboardContactHour, final View view) {
        k0.p(d, "this$0");
        k0.p(dashboardContactHour, "$contactHour");
        d.f.invoke(dashboardContactHour);
    }
    
    public int getItemCount() {
        return this.k.size();
    }
    
    public final boolean l(@e final String c) {
        k0.p(c, "filter");
        final boolean g = k0.g(this.c, c);
        final boolean b = true;
        boolean b2 = true;
        if (g) {
            if (this.getItemCount() <= 0) {
                b2 = false;
            }
            return b2;
        }
        this.c = c;
        this.k();
        this.notifyDataSetChanged();
        return this.getItemCount() > 0 && b;
    }
    
    public final boolean n() {
        return this.a.isEmpty() ^ true;
    }
    
    public void o(@e final o0 o0, final int n) {
        k0.p(o0, "holder");
        final DashboardContactHour dashboardContactHour = this.k.get(n);
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.kw)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(dashboardContactHour.getDisplayTeacher(), this.j, this.c));
        final org.joda.time.c start = dashboardContactHour.getStart();
        final org.joda.time.c end = dashboardContactHour.getEnd();
        if (start != null && end != null && dashboardContactHour.getWuId() > 0L) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)o0.itemView.findViewById(com.untis.mobile.c.i.ew);
            final t h1 = start.h1();
            CharSequence m;
            if (h1 == null) {
                m = null;
            }
            else {
                m = d0.m(h1);
            }
            ((TextView)appCompatTextView).setText(m);
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.dw)).setVisibility(0);
            ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.mw)).setText((CharSequence)d0.s(new r((l0)start, (l0)end)));
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.lw)).setVisibility(0);
        }
        else {
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.dw)).setVisibility(0);
            ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.ew)).setText(2131886247);
            ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.lw)).setVisibility(8);
        }
        ((TextView)o0.itemView.findViewById(com.untis.mobile.c.i.hw)).setText((CharSequence)com.untis.mobile.utils.extension.h.P(dashboardContactHour.getDisplayRooms(), this.j, this.c));
        ((ViewGroup)o0.itemView.findViewById(com.untis.mobile.c.i.gw)).setVisibility(com.untis.mobile.utils.extension.h.U(s.U1((CharSequence)dashboardContactHour.getDisplayRooms()) ^ true, 0, 1, null));
        final View itemView = o0.itemView;
        final int zv = com.untis.mobile.c.i.Zv;
        final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(zv);
        final String email = dashboardContactHour.getEmail();
        ((ImageView)appCompatImageView).setVisibility(com.untis.mobile.utils.extension.h.U((email == null || s.U1((CharSequence)email)) ^ true, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(zv)).setOnClickListener((View$OnClickListener)new a(this, dashboardContactHour));
        final View itemView2 = o0.itemView;
        final int aw = com.untis.mobile.c.i.aw;
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)itemView2.findViewById(aw);
        final String phone = dashboardContactHour.getPhone();
        ((ImageView)appCompatImageView2).setVisibility(com.untis.mobile.utils.extension.h.U((phone == null || s.U1((CharSequence)phone)) ^ true, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(aw)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.c(this, dashboardContactHour));
        final boolean b = this.b.isStudentRole() || this.b.isParentRole();
        final View itemView3 = o0.itemView;
        final int bw = com.untis.mobile.c.i.bw;
        ((ImageView)itemView3.findViewById(bw)).setVisibility(com.untis.mobile.utils.extension.h.U(dashboardContactHour.getRegistrationPossible() && b, 0, 1, null));
        ((ImageView)o0.itemView.findViewById(bw)).setBackground(this.m(dashboardContactHour));
        ((ImageView)o0.itemView.findViewById(bw)).setOnClickListener((View$OnClickListener)new b(this, dashboardContactHour));
        ((ImageView)o0.itemView.findViewById(com.untis.mobile.c.i.fw)).setVisibility(com.untis.mobile.utils.extension.a.a(this, n));
    }
    
    @e
    public o0 s(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.g.inflate(2131493180, viewGroup, false);
        k0.o(inflate, "inflater.inflate(R.layout.item_dashboard_contacthour, parent, false)");
        return new o0(inflate);
    }
    
    public final boolean t(@e final List<DashboardContactHour> list) {
        k0.p(list, "newContactHours");
        this.a = v.I5((Iterable<? extends DashboardContactHour>)list);
        this.k();
        this.notifyDataSetChanged();
        return this.a.isEmpty() ^ true;
    }
}
