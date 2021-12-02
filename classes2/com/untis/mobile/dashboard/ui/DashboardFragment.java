// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui;

import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.jvm.internal.m0;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import com.untis.mobile.substitutionplanning.absences.TeacherOwnAbsencesActivity;
import com.untis.mobile.substitutionplanning.add.AddTeacherOwnAbsenceActivity;
import kotlin.h0;
import kotlin.coroutines.g;
import java.util.Iterator;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.dashboard.ui.option.d;
import java.util.ArrayList;
import kotlin.jvm.internal.j1;
import java.util.List;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.c;
import com.untis.mobile.substitutionplanning.askteacher.list.SubstitutionRequestsActivity;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/dashboard/ui/DashboardFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/ui/option/a;", "dashboardOption", "Lkotlin/j2;", "u", "A", "B", "z", "v", "x", "C", "w", "y", "", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardFragment extends UmFragment
{
    private Profile G;
    
    private final void A() {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        h.r(requireContext, "Disabled since SP 2.0");
    }
    
    private final void B() {
        final SubstitutionRequestsActivity.a h = SubstitutionRequestsActivity.H;
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        final Profile g = this.G;
        if (g != null) {
            this.startActivity(h.a(requireContext, g.getUniqueId()));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void C() {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.a.i());
    }
    
    public static final /* synthetic */ Profile r(final DashboardFragment dashboardFragment) {
        return dashboardFragment.G;
    }
    
    private final List<com.untis.mobile.dashboard.ui.option.a> t() {
        final j1.h h = new j1.h();
        final com.untis.mobile.dashboard.ui.option.a[] values = com.untis.mobile.dashboard.ui.option.a.values();
        final ArrayList<com.untis.mobile.dashboard.ui.option.a> g = new ArrayList<com.untis.mobile.dashboard.ui.option.a>();
        for (final com.untis.mobile.dashboard.ui.option.a a : values) {
            final Profile g2 = this.G;
            if (g2 == null) {
                k0.S("profile");
                throw null;
            }
            final com.untis.mobile.utils.a a2 = com.untis.mobile.utils.a.a(this.requireContext());
            k0.o(a2, "appSettings(requireContext())");
            if (d.c(a, g2, a2)) {
                g.add(a);
            }
        }
        h.G = (T)g;
        final Profile g3 = this.G;
        if (g3 != null) {
            Label_0322: {
                ArrayList<com.untis.mobile.dashboard.ui.option.a> g4;
                if (g3.hasAnyRole(EntityType.TEACHER)) {
                    final List<com.untis.mobile.dashboard.ui.option.a> list = (List<com.untis.mobile.dashboard.ui.option.a>)h.G;
                    final ArrayList<com.untis.mobile.dashboard.ui.option.a> list2 = new ArrayList<com.untis.mobile.dashboard.ui.option.a>();
                    final Iterator<Object> iterator = list.iterator();
                    while (true) {
                        g4 = list2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.dashboard.ui.option.a next = iterator.next();
                        if (next == com.untis.mobile.dashboard.ui.option.a.L) {
                            continue;
                        }
                        list2.add(next);
                    }
                }
                else {
                    if (!((List<com.untis.mobile.dashboard.ui.option.a>)h.G).contains(com.untis.mobile.dashboard.ui.option.a.K)) {
                        break Label_0322;
                    }
                    final List<com.untis.mobile.dashboard.ui.option.a> list3 = (List<com.untis.mobile.dashboard.ui.option.a>)h.G;
                    final ArrayList<com.untis.mobile.dashboard.ui.option.a> list4 = new ArrayList<com.untis.mobile.dashboard.ui.option.a>();
                    final Iterator<Object> iterator2 = list3.iterator();
                    while (true) {
                        g4 = list4;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.dashboard.ui.option.a next2 = iterator2.next();
                        if (next2 == com.untis.mobile.dashboard.ui.option.a.L) {
                            continue;
                        }
                        list4.add(next2);
                    }
                }
                h.G = (T)g4;
            }
            kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ DashboardFragment H;
                final /* synthetic */ j1.h<List<com.untis.mobile.dashboard.ui.option.a>> I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ DashboardFragment H = this.H;
                        final /* synthetic */ j1.h<List<com.untis.mobile.dashboard.ui.option.a>> I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((DashboardFragment$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(p);
                    }
                    else {
                        c1.n(p);
                        final Context requireContext = this.H.requireContext();
                        k0.o(requireContext, "requireContext()");
                        final Profile r = DashboardFragment.r(this.H);
                        if (r == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final com.untis.mobile.dashboard.service.b b = new com.untis.mobile.dashboard.service.b(requireContext, r.getUniqueId());
                        this.G = 1;
                        if ((p = b.p(this)) == h) {
                            return h;
                        }
                    }
                    if (((List)p).isEmpty()) {
                        final j1.h<List<com.untis.mobile.dashboard.ui.option.a>> i = this.I;
                        final List<com.untis.mobile.dashboard.ui.option.a> list = i.G;
                        p = new ArrayList();
                        for (final com.untis.mobile.dashboard.ui.option.a next : list) {
                            if (kotlin.coroutines.jvm.internal.b.a(next != com.untis.mobile.dashboard.ui.option.a.P)) {
                                ((Collection<com.untis.mobile.dashboard.ui.option.a>)p).add(next);
                            }
                        }
                        i.G = (List<com.untis.mobile.dashboard.ui.option.a>)p;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            return (List<com.untis.mobile.dashboard.ui.option.a>)h.G;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void u(final com.untis.mobile.dashboard.ui.option.a a) {
        switch (DashboardFragment.a.a[a.ordinal()]) {
            default: {
                throw new h0();
            }
            case 8: {
                this.y();
                break;
            }
            case 7: {
                this.w();
                break;
            }
            case 6: {
                this.C();
                break;
            }
            case 5: {
                this.x();
                break;
            }
            case 4: {
                this.v();
                break;
            }
            case 3: {
                this.z();
                break;
            }
            case 2: {
                this.B();
                break;
            }
            case 1: {
                this.A();
                break;
            }
        }
        h.x(j2.a);
    }
    
    private final void v() {
        final Profile g = this.G;
        if (g != null) {
            if (g.hasAnyRole(EntityType.TEACHER)) {
                final AddTeacherOwnAbsenceActivity.a h = AddTeacherOwnAbsenceActivity.H;
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "requireContext()");
                this.startActivity(h.a(requireContext));
            }
            else {
                c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.b.b(com.untis.mobile.dashboard.ui.a.a, 0L, 0L, 3, null));
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void w() {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.a.e());
    }
    
    private final void x() {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.a.d());
    }
    
    private final void y() {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.a.f());
    }
    
    private final void z() {
        final Profile g = this.G;
        if (g != null) {
            if (g.hasAnyRole(EntityType.TEACHER)) {
                final TeacherOwnAbsencesActivity.a i = TeacherOwnAbsencesActivity.I;
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "requireContext()");
                this.startActivity(i.a(requireContext));
            }
            else {
                c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.a.a.g());
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        final Profile n = j0.G.n();
        if (n != null) {
            this.G = n;
            return;
        }
        throw new IllegalStateException("no profile");
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493100, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.kq);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.dashboard.ui.option.c(requireContext, this.t(), new l<com.untis.mobile.dashboard.ui.option.a, j2>() {
            public final void a(@e final com.untis.mobile.dashboard.ui.option.a a) {
                k0.p(a, "it");
                DashboardFragment.this.u(a);
            }
        }));
        return inflate;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        final androidx.fragment.app.d activity = this.getActivity();
        com.untis.mobile.ui.activities.common.b b;
        if (activity instanceof com.untis.mobile.ui.activities.common.b) {
            b = (com.untis.mobile.ui.activities.common.b)activity;
        }
        else {
            b = null;
        }
        if (b != null) {
            com.untis.mobile.ui.activities.common.b.setUpTopActionBar$default(b, null, null, 3, null);
        }
    }
}
