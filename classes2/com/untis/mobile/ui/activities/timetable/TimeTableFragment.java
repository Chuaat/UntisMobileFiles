// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Set;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import android.content.Context;
import kotlin.j2;
import com.untis.mobile.utils.s;
import android.util.Log;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import rx.functions.b;
import java.util.concurrent.TimeUnit;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.utils.settings.g;
import kotlin.jvm.internal.w;
import rx.o;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import org.jetbrains.annotations.f;
import com.untis.mobile.ui.activities.timetable.view.c;
import org.joda.time.t;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001NB\u0007¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\u0012\u0010!\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00101\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00106R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010=\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00108\u001a\u0004\b3\u0010;\"\u0004\b$\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010BR\u001d\u0010G\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\b*\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010I¨\u0006O" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/TimeTableFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/ui/activities/timetable/a;", "Lcom/untis/mobile/ui/activities/timetable/view/a;", "backGroundView", "Lkotlin/j2;", "P", "M", "Lrx/o;", "G", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "Q", "L", "Lorg/joda/time/t;", "date", "", "N", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "j", "q", "o", "c", "Lcom/untis/mobile/services/masterdata/a;", "O", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "S", "Lrx/o;", "subscriber", "K", "Z", "dontLoad", "R", "added", "H", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "", "J", "timestamp", "Lcom/untis/mobile/ui/activities/timetable/view/c;", "Lcom/untis/mobile/ui/activities/timetable/view/c;", "periodView", "I", "Lorg/joda/time/t;", "", "()I", "(I)V", "position", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/utils/settings/g;", "Lkotlin/b0;", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "<init>", "()V", "T", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableFragment extends UmFragment implements com.untis.mobile.ui.activities.timetable.a
{
    @e
    public static final a T;
    @e
    private static final String U = "januar";
    @e
    private static final String V = "februar";
    @e
    private static final String W = "maerz";
    @e
    private static final String X = "april";
    @e
    private static final String Y = "mai";
    private static boolean Z;
    private Profile G;
    private TimeTableEntity H;
    private t I;
    private int J;
    private boolean K;
    @f
    private c L;
    private long M;
    private k N;
    private com.untis.mobile.services.masterdata.a O;
    private com.untis.mobile.services.classbook.a P;
    @e
    private final b0 Q;
    private boolean R;
    @f
    private o S;
    
    static {
        T = new a(null);
        TimeTableFragment.Z = true;
    }
    
    public TimeTableFragment() {
        this.K = true;
        this.Q = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final g invoke() {
                return (g)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(g.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ o A(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.S;
    }
    
    public static final /* synthetic */ TimeTableEntity B(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.H;
    }
    
    public static final /* synthetic */ k C(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.N;
    }
    
    public static final /* synthetic */ void E(final TimeTableFragment timeTableFragment, final boolean r) {
        timeTableFragment.R = r;
    }
    
    public static final /* synthetic */ void F(final TimeTableFragment timeTableFragment, final o s) {
        timeTableFragment.S = s;
    }
    
    private final o G() {
        final o c5 = rx.g.Q2(1L, TimeUnit.MINUTES).E5(rx.schedulers.c.f()).C5((b)new h0(this), (b)i0.G);
        k0.o(c5, "interval(1, TimeUnit.MINUTES)\n            .subscribeOn(Schedulers.newThread())\n            .subscribe({\n                if (DateTime(timestamp).plusSeconds(settings.remoteConfigTimetableRefreshSeconds().toInt()).isBefore(SystemTime.dateTime())) {\n                    timeTableService.removeOnTimeTableModelListener(this)\n                    timeTableService.addOnTimeTableModelListener(timeTableEntity, date, this)\n                }\n            }, { throwable ->\n                Log.e(Constant.LOG, \"error on regular subscriber\", throwable)\n            })");
        return c5;
    }
    
    private static final void H(final TimeTableFragment timeTableFragment, final Long n) {
        k0.p(timeTableFragment, "this$0");
        if (((org.joda.time.base.c)new org.joda.time.c(timeTableFragment.M).X0((int)com.untis.mobile.utils.settings.e.d(timeTableFragment.K()))).C((l0)com.untis.mobile.utils.time.a.a())) {
            final k n2 = timeTableFragment.N;
            if (n2 == null) {
                k0.S("timeTableService");
                throw null;
            }
            n2.m(timeTableFragment);
            final k n3 = timeTableFragment.N;
            if (n3 == null) {
                k0.S("timeTableService");
                throw null;
            }
            final TimeTableEntity h = timeTableFragment.H;
            if (h == null) {
                k0.S("timeTableEntity");
                throw null;
            }
            final t i = timeTableFragment.I;
            if (i == null) {
                k0.S("date");
                throw null;
            }
            n3.C(h, i, timeTableFragment);
        }
    }
    
    private static final void I(final Throwable t) {
        Log.e("untis_log", "error on regular subscriber", t);
    }
    
    private final g K() {
        return this.Q.getValue();
    }
    
    private final void L(final com.untis.mobile.ui.activities.timetable.view.a a) {
        s.a.x(new n6.a<j2>() {
            final /* synthetic */ TimeTableFragment G;
            
            public final void invoke() {
                Object o;
                if ((o = this.G.getContext()) == null && (o = this.G.getActivity()) == null) {
                    return;
                }
                final com.untis.mobile.ui.activities.timetable.view.a h = a;
                final com.untis.mobile.services.masterdata.a y = TimeTableFragment.y(this.G);
                if (y == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final org.joda.time.t w = TimeTableFragment.w(this.G);
                if (w == null) {
                    k0.S("date");
                    throw null;
                }
                final Holiday p = y.p(w);
                final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)o);
                final Profile z = TimeTableFragment.z(this.G);
                if (z == null) {
                    k0.S("profile");
                    throw null;
                }
                final DefaultColors.DefaultColor holiday = a.g(z.getUniqueId()).getHoliday();
                k0.o(holiday, "appSettings(context).getColors(profile.getUniqueId()).holiday");
                final v e = v.b0.e();
                ArrayList<TimeGridUnit> u2;
                if (e == null) {
                    u2 = null;
                }
                else {
                    u2 = e.u2();
                }
                final TimeTableFragment g = this.G;
                final org.joda.time.t w2 = TimeTableFragment.w(g);
                if (w2 != null) {
                    h.h(p, holiday, u2, g.N(w2));
                    return;
                }
                k0.S("date");
                throw null;
            }
        });
    }
    
    private final void M() {
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ TimeTableFragment G;
            
            public final void invoke() {
                TimeTableFragment.E(this.G, true);
                if (!TimeTableFragment.x(this.G)) {
                    final k c = TimeTableFragment.C(this.G);
                    if (c == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final TimeTableEntity b = TimeTableFragment.B(this.G);
                    if (b == null) {
                        k0.S("timeTableEntity");
                        throw null;
                    }
                    final org.joda.time.t w = TimeTableFragment.w(this.G);
                    if (w == null) {
                        k0.S("date");
                        throw null;
                    }
                    c.C(b, w, this.G);
                }
            }
        });
    }
    
    private final boolean N(final t t) {
        final TimeTableEntity h = this.H;
        if (h == null) {
            k0.S("timeTableEntity");
            throw null;
        }
        if (h.getEntityType() != EntityType.CLASS) {
            return false;
        }
        final com.untis.mobile.services.masterdata.a o = this.O;
        if (o == null) {
            k0.S("masterDataService");
            throw null;
        }
        final TimeTableEntity h2 = this.H;
        if (h2 != null) {
            final Klasse n = o.N(h2.getEntityId());
            return n == null || ((org.joda.time.base.e)n.getStart()).m((n0)t) || ((org.joda.time.base.e)n.getEnd()).o((n0)t);
        }
        k0.S("timeTableEntity");
        throw null;
    }
    
    private final void P(final com.untis.mobile.ui.activities.timetable.view.a a) {
        this.L(a);
        this.M();
    }
    
    private final void Q(final TimeTableModel timeTableModel) {
        final v e = v.b0.e();
        if (e == null) {
            return;
        }
        final int j = this.J;
        long timestamp;
        if (timeTableModel == null) {
            timestamp = -1L;
        }
        else {
            timestamp = timeTableModel.getTimestamp();
        }
        e.d2(j, timestamp);
    }
    
    public static final /* synthetic */ boolean u(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.R;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a v(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.P;
    }
    
    public static final /* synthetic */ t w(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.I;
    }
    
    public static final /* synthetic */ boolean x(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.K;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a y(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.O;
    }
    
    public static final /* synthetic */ Profile z(final TimeTableFragment timeTableFragment) {
        return timeTableFragment.G;
    }
    
    public final int J() {
        return this.J;
    }
    
    public final void O(final int j) {
        this.J = j;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    public void c(@e final TimeTableModel timeTableModel) {
        k0.p(timeTableModel, "timeTableModel");
        final c l = this.L;
        if (l != null) {
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            l.w(g, timeTableModel);
        }
        this.Q(timeTableModel);
        final t i = this.I;
        if (i != null) {
            if (((org.joda.time.base.e)i).p((n0)com.untis.mobile.utils.time.a.b())) {
                h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ TimeTableFragment H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ TimeTableFragment H = this.H;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                        return ((TimeTableFragment$d)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            final com.untis.mobile.services.classbook.a v = TimeTableFragment.v(this.H);
                            if (v == null) {
                                k0.S("classBookService");
                                throw null;
                            }
                            this.G = 1;
                            if (v.t(this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
            }
            return;
        }
        k0.S("date");
        throw null;
    }
    
    @e
    @Override
    public TimeTableEntity j() {
        final TimeTableEntity h = this.H;
        if (h != null) {
            return h;
        }
        k0.S("timeTableEntity");
        throw null;
    }
    
    @Override
    public void o(@f final TimeTableModel timeTableModel) {
        if (timeTableModel != null) {
            final c l = this.L;
            if (l != null) {
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                l.w(g, timeTableModel);
            }
            this.Q(timeTableModel);
            this.M = timeTableModel.getTimestamp();
        }
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
        final String string = bundle.getString("januar");
        final String s = "";
        String s2;
        if ((s2 = string) == null) {
            s2 = "";
        }
        final j0 g = j0.G;
        Profile g2;
        if ((g2 = g.l(s2)) == null && (g2 = g.n()) == null) {
            g2 = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.G = g2;
        this.N = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.O = g3.getMasterDataService();
        final Profile g4 = this.G;
        if (g4 != null) {
            this.P = g4.getClassBookService();
            TimeTableEntity h;
            if ((h = (TimeTableEntity)bundle.getParcelable("februar")) == null) {
                h = new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
            }
            this.H = h;
            String string2 = bundle.getString("maerz");
            if (string2 == null) {
                string2 = s;
            }
            final t c0 = t.c0(string2);
            k0.o(c0, "parse(arguments.getString(BUNDLE_DATE_ISO) ?: \"\")");
            this.I = c0;
            this.J = bundle.getInt("april");
            this.K = bundle.getBoolean("mai");
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493129, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final v e = v.b0.e();
        if (e == null) {
            return null;
        }
        final t i = this.I;
        if (i == null) {
            k0.S("date");
            throw null;
        }
        final com.untis.mobile.ui.activities.timetable.view.a a = new com.untis.mobile.ui.activities.timetable.view.a(e, i, null, 4, null);
        final int lt = com.untis.mobile.c.i.lt;
        ((FrameLayout)inflate.findViewById(lt)).addView((View)a, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final c l = new c(e, g.getUniqueId());
        ((FrameLayout)inflate.findViewById(lt)).addView((View)l, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final FrameLayout frameLayout = (FrameLayout)inflate.findViewById(lt);
        final t j = this.I;
        if (j != null) {
            frameLayout.addView((View)new com.untis.mobile.ui.activities.timetable.view.b(e, j), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            this.L = l;
            this.P(a);
            return inflate;
        }
        k0.S("date");
        throw null;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ TimeTableFragment G;
            
            public final void invoke() {
                final boolean u = TimeTableFragment.u(this.G);
                boolean b = false;
                if (u) {
                    if (!TimeTableFragment.x(this.G)) {
                        final k c = TimeTableFragment.C(this.G);
                        if (c == null) {
                            k0.S("timeTableService");
                            throw null;
                        }
                        c.m(this.G);
                    }
                    TimeTableFragment.E(this.G, false);
                }
                final o a = TimeTableFragment.A(this.G);
                if (a != null) {
                    if (a.g()) {
                        b = true;
                    }
                }
                if (b) {
                    final o a2 = TimeTableFragment.A(this.G);
                    if (a2 != null) {
                        a2.i();
                    }
                }
                TimeTableFragment.F(this.G, null);
            }
        });
    }
    
    @Override
    public void onResume() {
        super.onResume();
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ TimeTableFragment G;
            
            public final void invoke() {
                if (!TimeTableFragment.u(this.G)) {
                    TimeTableFragment.E(this.G, true);
                    if (!TimeTableFragment.x(this.G)) {
                        final k c = TimeTableFragment.C(this.G);
                        if (c == null) {
                            k0.S("timeTableService");
                            throw null;
                        }
                        final TimeTableEntity b = TimeTableFragment.B(this.G);
                        if (b == null) {
                            k0.S("timeTableEntity");
                            throw null;
                        }
                        final org.joda.time.t w = TimeTableFragment.w(this.G);
                        if (w == null) {
                            k0.S("date");
                            throw null;
                        }
                        c.C(b, w, this.G);
                    }
                }
                final TimeTableFragment g = this.G;
                TimeTableFragment.F(g, g.G());
            }
        });
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "save");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("januar", g.getUniqueId());
        final TimeTableEntity h = this.H;
        if (h == null) {
            k0.S("timeTableEntity");
            throw null;
        }
        bundle.putParcelable("februar", (Parcelable)h);
        final t i = this.I;
        if (i != null) {
            bundle.putString("maerz", i.toString());
            bundle.putInt("april", this.J);
            return;
        }
        k0.S("date");
        throw null;
    }
    
    @e
    @Override
    public t q() {
        final t i = this.I;
        if (i != null) {
            return i;
        }
        k0.S("date");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "com/untis/mobile/ui/activities/timetable/TimeTableFragment$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lorg/joda/time/t;", "date", "", "position", "", "dontLoad", "Lcom/untis/mobile/ui/activities/timetable/TimeTableFragment;", "a", "BUNDLE_DATE_ISO", "Ljava/lang/String;", "BUNDLE_DONT_LOAD", "BUNDLE_POSITION", "BUNDLE_PROFILE_ID", "BUNDLE_TIME_TABLE_ENTITY", "showTutorial", "Z", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final TimeTableFragment a(@e final String s, @e final TimeTableEntity timeTableEntity, @e final t t, final int n, final boolean b) {
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(t, "date");
            final TimeTableFragment timeTableFragment = new TimeTableFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("januar", s);
            arguments.putParcelable("februar", (Parcelable)timeTableEntity);
            arguments.putString("maerz", t.toString());
            arguments.putInt("april", n);
            arguments.putBoolean("mai", b);
            timeTableFragment.setArguments(arguments);
            return timeTableFragment;
        }
    }
}
