// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import android.view.View$OnClickListener;
import org.joda.time.n0;
import androidx.core.content.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.j2;
import n6.l;
import android.content.Context;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.DefaultColors;
import kotlin.jvm.internal.m0;
import com.untis.mobile.utils.s;
import android.widget.TextView;
import com.untis.mobile.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.masterdata.b;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/TimeTableHeaderFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lorg/joda/time/t;", "date", "Lkotlin/j2;", "y", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onSaveInstanceState", "", "G", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/services/masterdata/a;", "K", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "J", "I", "w", "()I", "z", "(I)V", "position", "", "holidayId", "H", "Lorg/joda/time/t;", "<init>", "()V", "L", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableHeaderFragment extends UmFragment
{
    @e
    public static final a L;
    @e
    private static final String M = "spring";
    @e
    private static final String N = "summer";
    @e
    private static final String O = "fall";
    @e
    private static final String P = "winter";
    private static final long Q = -2L;
    private String G;
    private t H;
    private long I;
    private int J;
    private com.untis.mobile.services.masterdata.a K;
    
    static {
        L = new a(null);
    }
    
    public static final /* synthetic */ t s(final TimeTableHeaderFragment timeTableHeaderFragment) {
        return timeTableHeaderFragment.H;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a t(final TimeTableHeaderFragment timeTableHeaderFragment) {
        return timeTableHeaderFragment.K;
    }
    
    public static final /* synthetic */ String u(final TimeTableHeaderFragment timeTableHeaderFragment) {
        return timeTableHeaderFragment.G;
    }
    
    public static final /* synthetic */ void v(final TimeTableHeaderFragment timeTableHeaderFragment, final long i) {
        timeTableHeaderFragment.I = i;
    }
    
    private static final void x(final TimeTableHeaderFragment timeTableHeaderFragment, final View view) {
        k0.p(timeTableHeaderFragment, "this$0");
        final t h = timeTableHeaderFragment.H;
        if (h != null) {
            timeTableHeaderFragment.y(h);
            return;
        }
        k0.S("date");
        throw null;
    }
    
    private final void y(final t t) {
        final v e = v.b0.e();
        if (e != null) {
            e.w2(t);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f Bundle arguments) {
        super.onCreate(arguments);
        Bundle bundle = arguments;
        if (arguments == null) {
            arguments = this.getArguments();
            if ((bundle = arguments) == null) {
                return;
            }
        }
        final String string = bundle.getString("summer");
        final String s = "";
        String g;
        if ((g = string) == null) {
            g = "";
        }
        this.G = g;
        this.K = com.untis.mobile.services.masterdata.b.Z.a(g);
        String string2 = bundle.getString("spring");
        if (string2 == null) {
            string2 = s;
        }
        final t c0 = t.c0(string2);
        k0.o(c0, "parse(arguments.getString(BUNDLE_DATE_ISO) ?: \"\")");
        this.H = c0;
        this.I = bundle.getLong("fall");
        this.J = bundle.getInt("winter");
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493130, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final t h = this.H;
        if (h == null) {
            k0.S("date");
            throw null;
        }
        final int x3 = h.X3();
        boolean b = true;
        if (x3 != 1) {
            b = false;
        }
        final int ht = c.i.ht;
        final TextView textView = (TextView)inflate.findViewById(ht);
        final t h2 = this.H;
        if (h2 == null) {
            k0.S("date");
            throw null;
        }
        textView.setText((CharSequence)h2.g4("d"));
        final TextView textView2 = (TextView)inflate.findViewById(c.i.kt);
        final t h3 = this.H;
        if (h3 == null) {
            k0.S("date");
            throw null;
        }
        textView2.setText((CharSequence)h3.g4("E"));
        if (b) {
            final int it = c.i.it;
            ((TextView)inflate.findViewById(it)).setVisibility(0);
            final TextView textView3 = (TextView)inflate.findViewById(it);
            final t h4 = this.H;
            if (h4 == null) {
                k0.S("date");
                throw null;
            }
            textView3.setText((CharSequence)h4.g4("MMM"));
        }
        else {
            ((TextView)inflate.findViewById(c.i.it)).setVisibility(4);
        }
        if (this.I != -2L) {
            s.a.J((n6.a<?>)new n6.a<b>() {
                final /* synthetic */ TimeTableHeaderFragment G;
                
                @e
                public final b a() {
                    Object o;
                    if ((o = this.G.getContext()) == null && (o = this.G.getActivity()) == null) {
                        final DefaultColors.DefaultColor holiday = new DefaultColors().getHoliday();
                        k0.o(holiday, "DefaultColors().holiday");
                        return new b(null, holiday);
                    }
                    final a t = TimeTableHeaderFragment.t(this.G);
                    if (t == null) {
                        k0.S("masterDataService");
                        throw null;
                    }
                    final org.joda.time.t s = TimeTableHeaderFragment.s(this.G);
                    if (s == null) {
                        k0.S("date");
                        throw null;
                    }
                    final Holiday p = t.p(s);
                    final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)o);
                    final String u = TimeTableHeaderFragment.u(this.G);
                    if (u != null) {
                        final DefaultColors.DefaultColor holiday2 = a.g(u).getHoliday();
                        k0.o(holiday2, "appSettings(context).getColors(profileId).holiday");
                        return new b(p, holiday2);
                    }
                    k0.S("profileId");
                    throw null;
                }
            }, (l<? super Object, j2>)new l<b, j2>() {
                final /* synthetic */ TimeTableHeaderFragment G;
                
                public final void a(@e final b b) {
                    k0.p(b, "data");
                    final TimeTableHeaderFragment g = this.G;
                    final Holiday b2 = b.b();
                    long id;
                    if (b2 == null) {
                        id = -2L;
                    }
                    else {
                        id = b2.getId();
                    }
                    TimeTableHeaderFragment.v(g, id);
                    if (b.b() != null) {
                        ((ViewGroup)inflate.findViewById(c.i.jt)).setBackgroundColor(b.a().backColor);
                        ((TextView)inflate.findViewById(c.i.kt)).setTextColor(b.a().foreColor);
                        ((TextView)inflate.findViewById(c.i.it)).setTextColor(b.a().foreColor);
                    }
                }
            });
        }
        else {
            ((ViewGroup)inflate.findViewById(c.i.jt)).setBackgroundColor(d.f(this.requireContext(), 2131100059));
        }
        final t h5 = this.H;
        if (h5 != null) {
            if (((org.joda.time.base.e)h5).p((n0)com.untis.mobile.utils.v.a.g())) {
                ((TextView)inflate.findViewById(ht)).setTextColor(d.f(this.requireContext(), 2131100038));
            }
            inflate.setOnClickListener((View$OnClickListener)new j0(this));
            return inflate;
        }
        k0.S("date");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "save");
        super.onSaveInstanceState(bundle);
        final t h = this.H;
        if (h == null) {
            k0.S("date");
            throw null;
        }
        bundle.putString("spring", h.toString());
        final String g = this.G;
        if (g != null) {
            bundle.putString("summer", g);
            bundle.putLong("fall", this.I);
            bundle.putInt("winter", this.J);
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    public final int w() {
        return this.J;
    }
    
    public final void z(final int j) {
        this.J = j;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014" }, d2 = { "com/untis/mobile/ui/activities/timetable/TimeTableHeaderFragment$a", "", "", "profileId", "Lorg/joda/time/t;", "date", "", "position", "Lcom/untis/mobile/ui/activities/timetable/TimeTableHeaderFragment;", "a", "BUNDLE_DATE_ISO", "Ljava/lang/String;", "BUNDLE_HOLIDAY_ID", "BUNDLE_POSITION", "BUNDLE_PROFILE_ID", "", "NO_HOLIDAY_ID", "J", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final TimeTableHeaderFragment a(@e final String s, @e final t t, final int n) {
            k0.p(s, "profileId");
            k0.p(t, "date");
            final TimeTableHeaderFragment timeTableHeaderFragment = new TimeTableHeaderFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("spring", t.toString());
            arguments.putString("summer", s);
            arguments.putInt("winter", n);
            timeTableHeaderFragment.setArguments(arguments);
            return timeTableHeaderFragment;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e" }, d2 = { "com/untis/mobile/ui/activities/timetable/TimeTableHeaderFragment$b", "", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "b", "Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "a", "()Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;", "color", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "()Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "holiday", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Holiday;Lcom/untis/mobile/persistence/models/DefaultColors$DefaultColor;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b
    {
        @f
        private final Holiday a;
        @e
        private final DefaultColors.DefaultColor b;
        
        public b(@f final Holiday a, @e final DefaultColors.DefaultColor b) {
            k0.p(b, "color");
            this.a = a;
            this.b = b;
        }
        
        @e
        public final DefaultColors.DefaultColor a() {
            return this.b;
        }
        
        @f
        public final Holiday b() {
            return this.a;
        }
    }
}
