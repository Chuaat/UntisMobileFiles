// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import org.joda.time.base.i;
import android.widget.FrameLayout;
import android.os.Parcelable;
import androidx.fragment.app.d;
import java.util.Iterator;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.ui.activities.common.b;
import java.util.Objects;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.parentday.ParentDayAppointment;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.w;
import org.joda.time.r;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/parentday/ParentDayAppointmentFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "r", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "outState", "onSaveInstanceState", "", "G", "Ljava/lang/String;", "profileId", "Lorg/joda/time/r;", "I", "Lorg/joda/time/r;", "day", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "H", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentDay", "<init>", "()V", "J", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ParentDayAppointmentFragment extends UmFragment
{
    @e
    public static final a J;
    @e
    private static final String K = "dod";
    @e
    private static final String L = "bob";
    @e
    private static final String M = "aoa";
    @e
    private static final String N = "coc";
    private String G;
    private ParentDay H;
    private r I;
    
    static {
        J = new a(null);
    }
    
    private final Profile r() {
        final j0 g = j0.G;
        final String g2 = this.G;
        if (g2 != null) {
            Profile l;
            if ((l = g.l(g2)) == null) {
                l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
            }
            return l;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        else {
            arguments = bundle;
        }
        final String s = "";
        String string;
        if (arguments == null) {
            string = s;
        }
        else {
            string = arguments.getString("dod");
            if (string == null) {
                string = s;
            }
        }
        this.G = string;
        Bundle arguments2;
        if (bundle == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = bundle;
        }
        ParentDay parentDay;
        if (arguments2 == null) {
            parentDay = null;
        }
        else {
            parentDay = (ParentDay)arguments2.getParcelable("bob");
        }
        ParentDay h = parentDay;
        if (parentDay == null) {
            h = new ParentDay(0L, null, null, null, null, 31, null);
        }
        this.H = h;
        Bundle arguments3;
        if (bundle == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = bundle;
        }
        long long1 = 0L;
        long long2;
        if (arguments3 == null) {
            long2 = 0L;
        }
        else {
            long2 = arguments3.getLong("aoa");
        }
        Bundle arguments4 = bundle;
        if (bundle == null) {
            arguments4 = this.getArguments();
        }
        if (arguments4 != null) {
            long1 = arguments4.getLong("coc");
        }
        this.I = new r(long2, long1);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492941, viewGroup, false);
        final int s8 = com.untis.mobile.c.i.s8;
        ((RecyclerView)inflate.findViewById(s8)).setHasFixedSize(true);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        ((RecyclerView)inflate.findViewById(s8)).setLayoutManager((RecyclerView$p)layoutManager);
        ((RecyclerView)inflate.findViewById(s8)).n((RecyclerView$o)new l(this.getContext(), layoutManager.M2()));
        final ParentDay h = this.H;
        if (h == null) {
            k0.S("parentDay");
            throw null;
        }
        final long id = h.getId();
        final ParentDay h2 = this.H;
        if (h2 == null) {
            k0.S("parentDay");
            throw null;
        }
        final String name = h2.getName();
        final ParentDay h3 = this.H;
        if (h3 == null) {
            k0.S("parentDay");
            throw null;
        }
        final c end = h3.getEnd();
        final ParentDay h4 = this.H;
        if (h4 == null) {
            k0.S("parentDay");
            throw null;
        }
        final c start = h4.getStart();
        final ParentDay h5 = this.H;
        if (h5 != null) {
            final List<ParentDayAppointment> appointments = h5.getAppointments();
            final ArrayList<ParentDayAppointment> list = new ArrayList<ParentDayAppointment>();
            for (final ParentDayAppointment next : appointments) {
                final t h6 = next.getStart().h1();
                final r i = this.I;
                if (i == null) {
                    k0.S("day");
                    throw null;
                }
                if (!((org.joda.time.base.e)h6).p((n0)((org.joda.time.base.d)i).b().h1())) {
                    continue;
                }
                list.add(next);
            }
            final ParentDay parentDay = new ParentDay(id, name, start, end, list);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.s8);
            final d activity = this.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.common.UmActivity");
            recyclerView.setAdapter((RecyclerView$h)new h((b)activity, this.r(), parentDay));
            if (parentDay.getAppointments().isEmpty()) {
                int n;
                if (this.r().hasAnyRole(EntityType.TEACHER)) {
                    n = com.untis.mobile.c.i.x8;
                }
                else {
                    n = com.untis.mobile.c.i.w8;
                }
                ((FrameLayout)inflate.findViewById(n)).setVisibility(0);
            }
            return inflate;
        }
        k0.S("parentDay");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final ParentDay h = this.H;
        if (h == null) {
            k0.S("parentDay");
            throw null;
        }
        bundle.putParcelable("bob", (Parcelable)h);
        final r i = this.I;
        if (i == null) {
            k0.S("day");
            throw null;
        }
        bundle.putLong("aoa", ((i)i).n());
        final r j = this.I;
        if (j == null) {
            k0.S("day");
            throw null;
        }
        bundle.putLong("coc", ((i)j).I());
        final String g = this.G;
        if (g != null) {
            bundle.putString("dod", g);
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011" }, d2 = { "com/untis/mobile/ui/activities/parentday/ParentDayAppointmentFragment$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "parentDay", "Lorg/joda/time/r;", "day", "Lcom/untis/mobile/ui/activities/parentday/ParentDayAppointmentFragment;", "a", "BUNDLE_END_MILLIS", "Ljava/lang/String;", "BUNDLE_PARENT_DAY", "BUNDLE_PROFILE_ID", "BUNDLE_START_MILLIS", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ParentDayAppointmentFragment a(@e final String s, @e final ParentDay parentDay, @e final r r) {
            k0.p(s, "profileId");
            k0.p(parentDay, "parentDay");
            k0.p(r, "day");
            final ParentDayAppointmentFragment parentDayAppointmentFragment = new ParentDayAppointmentFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("dod", s);
            arguments.putParcelable("bob", (Parcelable)parentDay);
            arguments.putLong("aoa", ((i)r).n());
            arguments.putLong("coc", ((i)r).I());
            parentDayAppointmentFragment.setArguments(arguments);
            return parentDayAppointmentFragment;
        }
    }
}
