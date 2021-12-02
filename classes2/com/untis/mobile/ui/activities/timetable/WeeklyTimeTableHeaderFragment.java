// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import android.content.Context;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$OnClickListener;
import org.joda.time.n0;
import com.untis.mobile.utils.v;
import androidx.core.content.d;
import kotlin.jvm.internal.k0;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.DefaultColors;
import org.joda.time.t;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableHeaderFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/widget/LinearLayout;", "layout", "Lorg/joda/time/t;", "date", "Lkotlin/j2;", "s", "w", "start", "u", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onSaveInstanceState", "I", "Lorg/joda/time/t;", "end", "H", "", "K", "v", "()I", "x", "(I)V", "position", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "J", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "color", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/masterdata/a;", "L", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WeeklyTimeTableHeaderFragment extends UmFragment
{
    @e
    public static final a M;
    @e
    private static final String N = "summer";
    @e
    private static final String O = "winter";
    @e
    private static final String P = "spring";
    private Profile G;
    private t H;
    private t I;
    private DefaultColors.DefaultColor J;
    private int K;
    private com.untis.mobile.services.masterdata.a L;
    
    static {
        M = new a(null);
    }
    
    public WeeklyTimeTableHeaderFragment() {
        this.K = 250;
    }
    
    private final void s(final LayoutInflater layoutInflater, final LinearLayout linearLayout, final t t) {
        final View inflate = layoutInflater.inflate(2131493130, (ViewGroup)linearLayout, false);
        final int x3 = t.X3();
        int n = 1;
        if (x3 != 1) {
            if (t.p2() == 1) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        final int ht = c.i.ht;
        ((TextView)inflate.findViewById(ht)).setText((CharSequence)t.g4("d"));
        final int kt = c.i.kt;
        ((TextView)inflate.findViewById(kt)).setText((CharSequence)t.g4("E"));
        if (n != 0) {
            final int it = c.i.it;
            ((TextView)inflate.findViewById(it)).setVisibility(0);
            ((TextView)inflate.findViewById(it)).setText((CharSequence)t.g4("MMM"));
        }
        else {
            ((TextView)inflate.findViewById(c.i.it)).setVisibility(4);
        }
        final com.untis.mobile.services.masterdata.a l = this.L;
        if (l != null) {
            if (l.p(t) != null) {
                final ConstraintLayout constraintLayout = (ConstraintLayout)inflate.findViewById(c.i.jt);
                final DefaultColors.DefaultColor j = this.J;
                if (j == null) {
                    k0.S("color");
                    throw null;
                }
                ((ViewGroup)constraintLayout).setBackgroundColor(j.backColor);
                final TextView textView = (TextView)inflate.findViewById(kt);
                final DefaultColors.DefaultColor i = this.J;
                if (i == null) {
                    k0.S("color");
                    throw null;
                }
                textView.setTextColor(i.foreColor);
                final TextView textView2 = (TextView)inflate.findViewById(c.i.it);
                final DefaultColors.DefaultColor k = this.J;
                if (k == null) {
                    k0.S("color");
                    throw null;
                }
                textView2.setTextColor(k.foreColor);
            }
            else {
                ((ViewGroup)inflate.findViewById(c.i.jt)).setBackgroundColor(d.f(this.requireContext(), 2131100059));
            }
            if (((org.joda.time.base.e)t).p((n0)v.a.g())) {
                ((TextView)inflate.findViewById(ht)).setTextColor(d.f(this.requireContext(), 2131100038));
            }
            inflate.setOnClickListener((View$OnClickListener)new o0(this, t));
            linearLayout.addView(inflate, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -1, 1.0f));
            return;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private static final void t(final WeeklyTimeTableHeaderFragment weeklyTimeTableHeaderFragment, final t t, final View view) {
        k0.p(weeklyTimeTableHeaderFragment, "this$0");
        k0.p(t, "$date");
        weeklyTimeTableHeaderFragment.w(t);
    }
    
    private final t u(t l0) {
        final com.untis.mobile.ui.activities.timetable.v e = com.untis.mobile.ui.activities.timetable.v.b0.e();
        Integer value;
        if (e == null) {
            value = null;
        }
        else {
            value = e.f1(this.K);
        }
        if (value == null) {
            return l0;
        }
        l0 = l0.l0(value - 1);
        k0.o(l0, "start.plusDays(days - 1)");
        return l0;
    }
    
    private final void w(final t t) {
        final com.untis.mobile.ui.activities.timetable.v e = com.untis.mobile.ui.activities.timetable.v.b0.e();
        if (e != null) {
            e.w2(t);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f Bundle arguments) {
        super.onCreate(arguments);
        Bundle bundle;
        if (arguments == null) {
            arguments = this.getArguments();
            if ((bundle = arguments) == null) {
                return;
            }
        }
        else {
            bundle = arguments;
        }
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final String string = bundle.getString("summer", "");
        final j0 g = j0.G;
        k0.o(string, "profileId");
        Profile g2;
        if ((g2 = g.l(string)) == null && (g2 = g.n()) == null) {
            g2 = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.G = g2;
        this.L = g2.getMasterDataService();
        this.K = bundle.getInt("winter");
        final t c0 = t.c0(bundle.getString("spring"));
        k0.o(c0, "parse(arguments.getString(BUNDLE_MONDAY_ISO))");
        if ((this.H = c0) != null) {
            this.I = this.u(c0);
            final DefaultColors.DefaultColor holiday = com.untis.mobile.utils.a.a((Context)o).g(string).getHoliday();
            k0.o(holiday, "appSettings(context).getColors(profileId).holiday");
            this.J = holiday;
            return;
        }
        k0.S("start");
        throw null;
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493132, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        t t = this.H;
        if (t == null) {
            k0.S("start");
            throw null;
        }
        final t i = this.I;
        if (i != null) {
            while (((org.joda.time.base.e)t).o((n0)i.l0(1))) {
                final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(c.i.mt);
                k0.o(linearLayout, "view.fragment_weekly_time_table_header_root");
                this.s(layoutInflater, linearLayout, t);
                t = t.l0(1);
                k0.o(t, "date.plusDays(1)");
            }
            return inflate;
        }
        k0.S("end");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "save");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("summer", g.getUniqueId());
        final t h = this.H;
        if (h != null) {
            bundle.putString("spring", h.toString());
            bundle.putInt("winter", this.K);
            return;
        }
        k0.S("start");
        throw null;
    }
    
    public final int v() {
        return this.K;
    }
    
    public final void x(final int k) {
        this.K = k;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/activities/timetable/WeeklyTimeTableHeaderFragment$a", "", "", "profileId", "Lorg/joda/time/t;", "monday", "", "position", "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableHeaderFragment;", "a", "BUNDLE_MONDAY_ISO", "Ljava/lang/String;", "BUNDLE_POSITION", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final WeeklyTimeTableHeaderFragment a(@e final String s, @e final t t, final int n) {
            k0.p(s, "profileId");
            k0.p(t, "monday");
            final WeeklyTimeTableHeaderFragment weeklyTimeTableHeaderFragment = new WeeklyTimeTableHeaderFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("spring", t.toString());
            arguments.putString("summer", s);
            arguments.putInt("winter", n);
            weeklyTimeTableHeaderFragment.setArguments(arguments);
            return weeklyTimeTableHeaderFragment;
        }
    }
}
