// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import android.os.Parcelable;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import android.content.Context;
import com.untis.mobile.utils.s;
import android.util.Log;
import org.joda.time.l0;
import java.util.concurrent.TimeUnit;
import com.untis.mobile.services.timetable.placeholder.l;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import android.widget.LinearLayout$LayoutParams;
import com.untis.mobile.ui.activities.timetable.view.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.Set;
import org.joda.time.n0;
import java.util.Map;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.utils.settings.g;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import java.util.List;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import rx.o;
import android.annotation.SuppressLint;
import com.untis.mobile.ui.activities.timetable.view.c;
import java.util.HashMap;
import org.joda.time.t;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b[\u0010\\J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R2\u0010-\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0012`*8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00103\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR2\u0010K\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0010`*8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010,R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010&R\u0016\u0010L\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00101R\"\u0010Q\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010D\u001a\u0004\bA\u0010N\"\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00101R>\u0010U\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0(j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S`*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010WR2\u0010Z\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020Y0(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020Y`*8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u0006^" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lorg/joda/time/t;", "start", "R", "Landroid/view/LayoutInflater;", "inflater", "Landroid/widget/LinearLayout;", "linearLayout", "date", "Lkotlin/j2;", "M", "Lcom/untis/mobile/ui/activities/timetable/view/a;", "backGroundView", "a0", "W", "Lrx/o;", "O", "Lcom/untis/mobile/ui/activities/timetable/a;", "N", "L", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "b0", "V", "", "X", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "onSaveInstanceState", "J", "Lorg/joda/time/t;", "end", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "P", "Ljava/util/HashMap;", "listeners", "", "U", "()J", "Z", "(J)V", "timestamp", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/utils/settings/g;", "Lkotlin/b0;", "T", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/services/classbook/a;", "S", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "I", "dateCount", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "H", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Q", "subscribers", "added", "K", "()I", "Y", "(I)V", "position", "dontLoad", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "periodsPerDate", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/ui/activities/timetable/view/c;", "periodViews", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WeeklyTimeTableFragment extends UmFragment
{
    @e
    public static final a X;
    @e
    private static final String Y = "januar";
    @e
    private static final String Z = "februar";
    @e
    private static final String a0 = "maerz";
    @e
    private static final String b0 = "april";
    @e
    private static final String c0 = "mai";
    private static boolean d0;
    private Profile G;
    private TimeTableEntity H;
    private t I;
    private t J;
    private int K;
    private boolean L;
    private boolean M;
    private long N;
    @SuppressLint({ "UseSparseArrays" })
    @e
    private final HashMap<Integer, c> O;
    @SuppressLint({ "UseSparseArrays" })
    @e
    private final HashMap<Integer, com.untis.mobile.ui.activities.timetable.a> P;
    @SuppressLint({ "UseSparseArrays" })
    @e
    private final HashMap<Integer, o> Q;
    private k R;
    private com.untis.mobile.services.classbook.a S;
    private com.untis.mobile.services.masterdata.a T;
    @e
    private final b0 U;
    private int V;
    @e
    private final HashMap<t, List<PeriodModel>> W;
    
    static {
        X = new a(null);
        WeeklyTimeTableFragment.d0 = true;
    }
    
    public WeeklyTimeTableFragment() {
        this.K = 250;
        this.L = true;
        this.O = new HashMap<Integer, c>();
        this.P = new HashMap<Integer, com.untis.mobile.ui.activities.timetable.a>();
        this.Q = new HashMap<Integer, o>();
        this.U = kotlin.d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final g invoke() {
                return (g)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(g.class), null, null);
            }
        });
        this.W = new HashMap<t, List<PeriodModel>>();
    }
    
    public static final /* synthetic */ HashMap A(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.O;
    }
    
    public static final /* synthetic */ HashMap B(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.W;
    }
    
    public static final /* synthetic */ Profile C(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.G;
    }
    
    public static final /* synthetic */ t E(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.I;
    }
    
    public static final /* synthetic */ HashMap F(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.Q;
    }
    
    public static final /* synthetic */ TimeTableEntity G(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.H;
    }
    
    public static final /* synthetic */ k H(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.R;
    }
    
    public static final /* synthetic */ void J(final WeeklyTimeTableFragment weeklyTimeTableFragment, final boolean m) {
        weeklyTimeTableFragment.M = m;
    }
    
    private final void L() {
        final t b = com.untis.mobile.utils.time.a.b();
        if (this.W.keySet().size() >= this.V && this.W.keySet().contains(b)) {
            final Set<Map.Entry<t, List<PeriodModel>>> entrySet = this.W.entrySet();
            k0.o(entrySet, "periodsPerDate.entries");
            final boolean b2 = entrySet instanceof Collection;
            final int n = 1;
            int n2 = 0;
            Label_0317: {
                if (!b2 || !entrySet.isEmpty()) {
                    for (final Map.Entry<t, V> entry : entrySet) {
                        boolean b3 = false;
                        Label_0308: {
                            if (!((org.joda.time.base.e)entry.getKey()).o((n0)b)) {
                                if (((org.joda.time.base.e)entry.getKey()).p((n0)b)) {
                                    final int p1 = ((org.joda.time.base.a)com.untis.mobile.utils.time.a.a()).p1();
                                    final V value = entry.getValue();
                                    k0.o(value, "entry.value");
                                    final Iterable<Object> iterable = (Iterable<Object>)value;
                                    if (!(iterable instanceof Collection) || !((Collection<PeriodModel>)iterable).isEmpty()) {
                                        final Iterator<PeriodModel> iterator2 = iterable.iterator();
                                        while (iterator2.hasNext()) {
                                            if (iterator2.next().getEndMinute() >= p1) {
                                                b3 = true;
                                                break Label_0308;
                                            }
                                        }
                                    }
                                }
                                else if (((org.joda.time.base.e)entry.getKey()).m((n0)b)) {
                                    final V value2 = entry.getValue();
                                    k0.o(value2, "entry.value");
                                    b3 = (((Collection)value2).isEmpty() ^ true);
                                    break Label_0308;
                                }
                            }
                            b3 = false;
                        }
                        if (b3) {
                            n2 = n;
                            break Label_0317;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 == 0) {
                final v e = v.b0.e();
                if (e != null) {
                    e.t2();
                }
            }
        }
    }
    
    private final void M(final LayoutInflater layoutInflater, final LinearLayout linearLayout, final t t) {
        final View inflate = layoutInflater.inflate(2131493129, (ViewGroup)linearLayout, false);
        final v e = v.b0.e();
        if (e == null) {
            return;
        }
        final com.untis.mobile.ui.activities.timetable.view.a a = new com.untis.mobile.ui.activities.timetable.view.a(e, t, null, 4, null);
        final int lt = com.untis.mobile.c.i.lt;
        ((FrameLayout)inflate.findViewById(lt)).addView((View)a, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final Profile g = this.G;
        if (g != null) {
            final c c = new c(e, g.getUniqueId());
            ((FrameLayout)inflate.findViewById(lt)).addView((View)c, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            ((FrameLayout)inflate.findViewById(lt)).addView((View)new b(e, t), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            this.O.put(t.p2(), c);
            this.a0(a, t);
            linearLayout.addView(inflate, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -2, 1.0f));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final com.untis.mobile.ui.activities.timetable.a N(final t t) {
        return new com.untis.mobile.ui.activities.timetable.a() {
            final /* synthetic */ WeeklyTimeTableFragment G;
            
            @Override
            public void c(@e final TimeTableModel timeTableModel) {
                k0.p(timeTableModel, "timeTableModel");
                final c c = WeeklyTimeTableFragment.A(this.G).get(t.p2());
                if (c != null) {
                    final Profile c2 = WeeklyTimeTableFragment.C(this.G);
                    if (c2 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    c.w(c2, timeTableModel);
                }
                WeeklyTimeTableFragment.this.b0(timeTableModel);
                final t h = t;
                final com.untis.mobile.utils.v a = com.untis.mobile.utils.v.a;
                if (((org.joda.time.base.e)h).p((n0)a.h()) || ((org.joda.time.base.e)t).p((n0)a.g())) {
                    kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ WeeklyTimeTableFragment H;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ WeeklyTimeTableFragment H = this.H;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((WeeklyTimeTableFragment$b$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
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
                                final com.untis.mobile.services.classbook.a x = WeeklyTimeTableFragment.x(this.H);
                                if (x == null) {
                                    k0.S("classBookService");
                                    throw null;
                                }
                                this.G = 1;
                                if (x.t(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 1, (Object)null);
                }
                WeeklyTimeTableFragment.B(this.G).put(t, kotlin.collections.v.L5((Collection<?>)timeTableModel.getPeriods()));
                WeeklyTimeTableFragment.this.L();
            }
            
            @e
            @Override
            public TimeTableEntity j() {
                final TimeTableEntity g = WeeklyTimeTableFragment.G(this.G);
                if (g != null) {
                    return g;
                }
                k0.S("timeTableEntity");
                throw null;
            }
            
            @Override
            public void o(@org.jetbrains.annotations.f final TimeTableModel timeTableModel) {
                if (timeTableModel != null) {
                    final c c = WeeklyTimeTableFragment.A(this.G).get(t.p2());
                    if (c != null) {
                        final Profile c2 = WeeklyTimeTableFragment.C(this.G);
                        if (c2 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        c.w(c2, timeTableModel);
                    }
                    WeeklyTimeTableFragment.this.b0(timeTableModel);
                    final long d = com.untis.mobile.utils.settings.e.d(WeeklyTimeTableFragment.this.T());
                    final Profile c3 = WeeklyTimeTableFragment.C(this.G);
                    if (c3 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    if (timeTableModel.getState(d, c3.getServerDownTimestamp()) == l.K) {
                        WeeklyTimeTableFragment.B(this.G).put(t, kotlin.collections.v.L5((Collection<?>)timeTableModel.getPeriods()));
                        WeeklyTimeTableFragment.this.L();
                    }
                    this.G.Z(timeTableModel.getTimestamp());
                }
            }
            
            @e
            @Override
            public t q() {
                return t;
            }
        };
    }
    
    private final o O(final t t) {
        final o c5 = rx.g.Q2(1L, TimeUnit.MINUTES).E5(rx.schedulers.c.f()).C5((rx.functions.b)new com.untis.mobile.ui.activities.timetable.m0(this, t), (rx.functions.b)com.untis.mobile.ui.activities.timetable.n0.G);
        k0.o(c5, "interval(1, TimeUnit.MINUTES)\n            .subscribeOn(Schedulers.newThread())\n            .subscribe({\n                val timetableRefreshSeconds = settings.remoteConfigTimetableRefreshSeconds()\n                if (DateTime(timestamp).plusSeconds(timetableRefreshSeconds.toInt()).isBefore(SystemTime.dateTime())) {\n                    var onTimeTableModelListener = listeners[date.dayOfWeek]\n                    if (onTimeTableModelListener != null) {\n                        timeTableService.removeOnTimeTableModelListener(onTimeTableModelListener)\n                    }\n                    onTimeTableModelListener = createOnTimeTableModelListener(date)\n                    listeners[date.dayOfWeek] = onTimeTableModelListener\n                    timeTableService.addOnTimeTableModelListener(timeTableEntity, date, onTimeTableModelListener)\n                }\n            }, { throwable ->\n                Log.e(Constant.LOG, \"error on regular subscriber\", throwable)\n            })");
        return c5;
    }
    
    private static final void P(final WeeklyTimeTableFragment weeklyTimeTableFragment, final t t, final Long n) {
        k0.p(weeklyTimeTableFragment, "this$0");
        k0.p(t, "$date");
        if (((org.joda.time.base.c)new org.joda.time.c(weeklyTimeTableFragment.U()).X0((int)com.untis.mobile.utils.settings.e.d(weeklyTimeTableFragment.T()))).C((l0)com.untis.mobile.utils.time.a.a())) {
            final com.untis.mobile.ui.activities.timetable.a a = weeklyTimeTableFragment.P.get(t.p2());
            if (a != null) {
                final k r = weeklyTimeTableFragment.R;
                if (r == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                r.m(a);
            }
            final com.untis.mobile.ui.activities.timetable.a n2 = weeklyTimeTableFragment.N(t);
            weeklyTimeTableFragment.P.put(t.p2(), n2);
            final k r2 = weeklyTimeTableFragment.R;
            if (r2 == null) {
                k0.S("timeTableService");
                throw null;
            }
            final TimeTableEntity h = weeklyTimeTableFragment.H;
            if (h == null) {
                k0.S("timeTableEntity");
                throw null;
            }
            r2.C(h, t, n2);
        }
    }
    
    private static final void Q(final Throwable t) {
        Log.e("untis_log", "error on regular subscriber", t);
    }
    
    private final t R(t l0) {
        final v e = v.b0.e();
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
    
    private final g T() {
        return this.U.getValue();
    }
    
    private final void V(final com.untis.mobile.ui.activities.timetable.view.a a, final t t) {
        s.a.x(new n6.a<j2>() {
            final /* synthetic */ WeeklyTimeTableFragment G;
            
            public final void invoke() {
                Object o;
                if ((o = this.G.getContext()) == null && (o = this.G.getActivity()) == null) {
                    return;
                }
                final Profile c = WeeklyTimeTableFragment.C(this.G);
                final ArrayList<TimeGridUnit> list = null;
                if (c == null) {
                    k0.S("profile");
                    throw null;
                }
                final com.untis.mobile.services.masterdata.a masterDataService = c.getMasterDataService();
                final com.untis.mobile.ui.activities.timetable.view.a h = a;
                final Holiday p = masterDataService.p(t);
                final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)o);
                final Profile c2 = WeeklyTimeTableFragment.C(this.G);
                if (c2 != null) {
                    final DefaultColors.DefaultColor holiday = a.g(c2.getUniqueId()).getHoliday();
                    k0.o(holiday, "appSettings(context).getColors(profile.getUniqueId()).holiday");
                    final v e = v.b0.e();
                    ArrayList<TimeGridUnit> u2;
                    if (e == null) {
                        u2 = list;
                    }
                    else {
                        u2 = e.u2();
                    }
                    h.h(p, holiday, u2, WeeklyTimeTableFragment.this.X(t));
                    return;
                }
                k0.S("profile");
                throw null;
            }
        });
    }
    
    private final void W(final t t) {
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ WeeklyTimeTableFragment G;
            
            public final void invoke() {
                WeeklyTimeTableFragment.J(this.G, true);
                if (!WeeklyTimeTableFragment.y(this.G)) {
                    final a u = WeeklyTimeTableFragment.this.N(t);
                    WeeklyTimeTableFragment.z(this.G).put(t.p2(), u);
                    final k h = WeeklyTimeTableFragment.H(this.G);
                    if (h == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final TimeTableEntity g = WeeklyTimeTableFragment.G(this.G);
                    if (g == null) {
                        k0.S("timeTableEntity");
                        throw null;
                    }
                    h.C(g, t, u);
                }
            }
        });
    }
    
    private final boolean X(final t t) {
        final TimeTableEntity h = this.H;
        if (h == null) {
            k0.S("timeTableEntity");
            throw null;
        }
        if (h.getEntityType() != EntityType.CLASS) {
            return false;
        }
        final com.untis.mobile.services.masterdata.a t2 = this.T;
        if (t2 == null) {
            k0.S("masterDataService");
            throw null;
        }
        final TimeTableEntity h2 = this.H;
        if (h2 != null) {
            final Klasse n = t2.N(h2.getEntityId());
            return n == null || ((org.joda.time.base.e)n.getStart()).m((n0)t) || ((org.joda.time.base.e)n.getEnd()).o((n0)t);
        }
        k0.S("timeTableEntity");
        throw null;
    }
    
    private final void a0(final com.untis.mobile.ui.activities.timetable.view.a a, final t t) {
        this.V(a, t);
        this.W(t);
    }
    
    private final void b0(final TimeTableModel timeTableModel) {
        final v e = v.b0.e();
        if (e == null) {
            return;
        }
        final int k = this.K;
        long timestamp;
        if (timeTableModel == null) {
            timestamp = -1L;
        }
        else {
            timestamp = timeTableModel.getTimestamp();
        }
        e.d2(k, timestamp);
    }
    
    public static final /* synthetic */ boolean w(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.M;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a x(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.S;
    }
    
    public static final /* synthetic */ boolean y(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.L;
    }
    
    public static final /* synthetic */ HashMap z(final WeeklyTimeTableFragment weeklyTimeTableFragment) {
        return weeklyTimeTableFragment.P;
    }
    
    public final int S() {
        return this.K;
    }
    
    public final long U() {
        return this.N;
    }
    
    public final void Y(final int k) {
        this.K = k;
    }
    
    public final void Z(final long n) {
        this.N = n;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f Bundle arguments) {
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
        this.R = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.S = g3.getClassBookService();
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        this.T = g4.getMasterDataService();
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
        k0.o(c0, "parse(arguments.getString(BUNDLE_MONDAY_ISO) ?: \"\")");
        if ((this.I = c0) != null) {
            this.J = this.R(c0);
            this.K = bundle.getInt("april");
            this.L = bundle.getBoolean("mai");
            return;
        }
        k0.S("start");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493131, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        t t = this.I;
        if (t == null) {
            k0.S("start");
            throw null;
        }
        final t j = this.J;
        if (j != null) {
            while (((org.joda.time.base.e)t).o((n0)j.l0(1))) {
                final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(com.untis.mobile.c.i.nt);
                k0.o(linearLayout, "view.fragment_weekly_time_table_root");
                this.M(layoutInflater, linearLayout, t);
                ++this.V;
                t = t.l0(1);
                k0.o(t, "date.plusDays(1)");
            }
            return inflate;
        }
        k0.S("end");
        throw null;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ WeeklyTimeTableFragment G;
            
            public final void invoke() {
                if (WeeklyTimeTableFragment.w(this.G)) {
                    if (!WeeklyTimeTableFragment.y(this.G)) {
                        final Collection values = WeeklyTimeTableFragment.z(this.G).values();
                        k0.o(values, "listeners.values");
                        final WeeklyTimeTableFragment g = this.G;
                        for (final a a : values) {
                            final k h = WeeklyTimeTableFragment.H(g);
                            if (h == null) {
                                k0.S("timeTableService");
                                throw null;
                            }
                            k0.o(a, "listener");
                            h.m(a);
                        }
                        WeeklyTimeTableFragment.z(this.G).clear();
                    }
                    WeeklyTimeTableFragment.J(this.G, false);
                }
                final Collection values2 = WeeklyTimeTableFragment.F(this.G).values();
                k0.o(values2, "subscribers.values");
                final Iterator<o> iterator2 = values2.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().i();
                }
                WeeklyTimeTableFragment.F(this.G).clear();
            }
        });
    }
    
    @Override
    public void onResume() {
        super.onResume();
        s.a.u(new n6.a<j2>() {
            final /* synthetic */ WeeklyTimeTableFragment G;
            
            public final void invoke() {
                if (!WeeklyTimeTableFragment.w(this.G)) {
                    WeeklyTimeTableFragment.J(this.G, true);
                    if (!WeeklyTimeTableFragment.y(this.G)) {
                        final Set<Integer> keySet = (Set<Integer>)WeeklyTimeTableFragment.A(this.G).keySet();
                        k0.o(keySet, "periodViews.keys");
                        final WeeklyTimeTableFragment g = this.G;
                        for (final Integer n : keySet) {
                            final org.joda.time.t e = WeeklyTimeTableFragment.E(g);
                            if (e == null) {
                                k0.S("start");
                                throw null;
                            }
                            k0.o(n, "dayOfWeek");
                            final org.joda.time.t s0 = e.S0((int)n);
                            k0.o(s0, "date");
                            final a u = g.N(s0);
                            WeeklyTimeTableFragment.z(g).put(s0.p2(), u);
                            final k h = WeeklyTimeTableFragment.H(g);
                            if (h == null) {
                                k0.S("timeTableService");
                                throw null;
                            }
                            final TimeTableEntity g2 = WeeklyTimeTableFragment.G(g);
                            if (g2 == null) {
                                k0.S("timeTableEntity");
                                throw null;
                            }
                            h.C(g2, s0, u);
                        }
                    }
                }
                final Set<Integer> keySet2 = (Set<Integer>)WeeklyTimeTableFragment.A(this.G).keySet();
                k0.o(keySet2, "periodViews.keys");
                final WeeklyTimeTableFragment g3 = this.G;
                for (final Integer n2 : keySet2) {
                    final HashMap f = WeeklyTimeTableFragment.F(g3);
                    k0.o(n2, "dayOfWeek");
                    final org.joda.time.t e2 = WeeklyTimeTableFragment.E(g3);
                    if (e2 == null) {
                        k0.S("start");
                        throw null;
                    }
                    final org.joda.time.t s2 = e2.S0((int)n2);
                    k0.o(s2, "start.withDayOfWeek(dayOfWeek)");
                    f.put(n2, g3.O(s2));
                }
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
            bundle.putInt("april", this.K);
            return;
        }
        k0.S("start");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "com/untis/mobile/ui/activities/timetable/WeeklyTimeTableFragment$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lorg/joda/time/t;", "monday", "", "position", "", "dontLoad", "Lcom/untis/mobile/ui/activities/timetable/WeeklyTimeTableFragment;", "a", "BUNDLE_DONT_LOAD", "Ljava/lang/String;", "BUNDLE_MONDAY_ISO", "BUNDLE_POSITION", "BUNDLE_PROFILE_ID", "BUNDLE_TIME_TABLE_ENTITY", "showTutorial", "Z", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final WeeklyTimeTableFragment a(@e final String s, @e final TimeTableEntity timeTableEntity, @e final t t, final int n, final boolean b) {
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(t, "monday");
            final WeeklyTimeTableFragment weeklyTimeTableFragment = new WeeklyTimeTableFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("januar", s);
            arguments.putParcelable("februar", (Parcelable)timeTableEntity);
            arguments.putString("maerz", t.toString());
            arguments.putInt("april", n);
            arguments.putBoolean("mai", b);
            weeklyTimeTableFragment.setArguments(arguments);
            return weeklyTimeTableFragment;
        }
    }
}
