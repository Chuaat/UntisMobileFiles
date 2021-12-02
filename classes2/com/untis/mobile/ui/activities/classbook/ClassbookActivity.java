// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.widget.ImageButton;
import com.untis.mobile.ui.activities.classbook.events.EventsActivity;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.ui.activities.classbook.events.EventDetailActivity;
import com.untis.mobile.ui.activities.classbook.duty.DutiesActivity;
import android.view.Menu;
import com.untis.mobile.persistence.models.profile.ProfileState;
import android.os.Bundle;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import kotlinx.coroutines.w2;
import com.google.android.material.tabs.TabLayout$i;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import androidx.appcompat.view.b$a;
import kotlinx.coroutines.k2;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.collections.v;
import com.untis.mobile.utils.u0;
import android.widget.RelativeLayout;
import android.util.Log;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.google.android.material.appbar.AppBarLayout;
import android.os.Build$VERSION;
import androidx.appcompat.widget.Toolbar;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import kotlin.n1;
import kotlin.s0;
import android.content.Context;
import com.untis.mobile.utils.g0;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import org.joda.time.l0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.ArrayList;
import java.util.Collection;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.untis.mobile.ui.activities.views.NonSwipeableViewPager;
import com.untis.mobile.c;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.settings.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import android.view.MenuItem;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ^2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\"\u0010\"\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010H\u0014J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0002R\u0016\u0010+\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R$\u00105\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010HR\u001d\u0010M\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010OR\u001d\u0010T\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010VR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010YR\u0016\u0010[\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u0006`" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "O", "B", "", "Q", "", "D", "H", "finish", "M", "W", "T", "c0", "b0", "Landroid/os/Bundle;", "save", "onCreate", "reloadClassbook", "Lkotlinx/coroutines/k2;", "d0", "R", "K", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "outState", "onSaveInstanceState", "", "studentId", "longClick", "Z", "S", "Landroid/view/MenuItem;", "classRoleItem", "Landroidx/appcompat/view/b;", "Landroidx/appcompat/view/b;", "actionMode", "Lcom/untis/mobile/ui/activities/classbook/a;", "Lcom/untis/mobile/ui/activities/classbook/a;", "E", "()Lcom/untis/mobile/ui/activities/classbook/a;", "P", "(Lcom/untis/mobile/ui/activities/classbook/a;)V", "actionModeCallbacks", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/services/timetable/placeholder/k;", "L", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/profile/legacy/a;", "Lkotlin/b0;", "I", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/utils/settings/g;", "N", "J", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/utils/a;", "G", "()Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/analytics/base/b;", "F", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "eventMenuItem", "<init>", "()V", "U", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassbookActivity extends b
{
    @e
    public static final a U;
    @e
    private static final String V = "oderAuchSo";
    @e
    private static final String W = "aberSowieso";
    private Profile G;
    private Period H;
    private Classbook I;
    private com.untis.mobile.services.classbook.a J;
    private com.untis.mobile.services.masterdata.a K;
    private k L;
    @e
    private final b0 M;
    @e
    private final b0 N;
    @e
    private final b0 O;
    @e
    private final b0 P;
    private MenuItem Q;
    private MenuItem R;
    @f
    private com.untis.mobile.ui.activities.classbook.a S;
    @f
    private androidx.appcompat.view.b T;
    
    static {
        U = new a(null);
    }
    
    public ClassbookActivity() {
        this.M = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.profile.legacy.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.services.profile.legacy.a invoke() {
                return (com.untis.mobile.services.profile.legacy.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.services.profile.legacy.a.class), null, null);
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final g invoke() {
                return (g)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(g.class), null, null);
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ void A(final ClassbookActivity classbookActivity, final Classbook i) {
        classbookActivity.I = i;
    }
    
    private final void B() {
        final FragmentManager supportFragmentManager = ((androidx.fragment.app.d)this).getSupportFragmentManager();
        k0.o(supportFragmentManager, "supportFragmentManager");
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Period h = this.H;
        if (h != null) {
            final h adapter = new h(supportFragmentManager, uniqueId, h);
            final int x3 = c.i.X3;
            ((NonSwipeableViewPager)this.findViewById(x3)).setAdapter((androidx.viewpager.widget.a)adapter);
            ((NonSwipeableViewPager)this.findViewById(x3)).setOffscreenPageLimit(i.values().length);
            ((TabLayout)this.findViewById(c.i.V3)).setupWithViewPager((ViewPager)this.findViewById(x3));
            e0(this, false, 1, null);
            ((ImageButton)this.findViewById(c.i.S3)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.b(this));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void C(final ClassbookActivity classbookActivity, final View view) {
        k0.p(classbookActivity, "this$0");
        classbookActivity.M(true);
    }
    
    private final int D() {
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j == null) {
            k0.S("classbookService");
            throw null;
        }
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        final List<StudentAbsence> u = j.u(i.getAbsences());
        final Classbook k = this.I;
        if (k != null) {
            final Set<Long> students = k.getStudents();
            final ArrayList<Number> list = new ArrayList<Number>();
        Label_0321_Outer:
            for (final Number next : students) {
                final long longValue = next.longValue();
                final Iterator<Object> iterator2 = u.iterator();
                while (true) {
                    boolean b;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final int n = 1;
                        if (hasNext) {
                            final StudentAbsence next2 = iterator2.next();
                            final StudentAbsence studentAbsence = next2;
                            if (studentAbsence.getStudent().getId() == longValue) {
                                final org.joda.time.c end = studentAbsence.getEnd();
                                final Period h = this.H;
                                if (h == null) {
                                    k0.S("period");
                                    throw null;
                                }
                                if (!((org.joda.time.base.c)end).C((l0)h.getStart())) {
                                    final org.joda.time.c end2 = studentAbsence.getEnd();
                                    final Period h2 = this.H;
                                    if (h2 == null) {
                                        k0.S("period");
                                        throw null;
                                    }
                                    if (!((org.joda.time.base.c)end2).X4((l0)h2.getStart())) {
                                        final org.joda.time.c start = studentAbsence.getStart();
                                        final Period h3 = this.H;
                                        if (h3 == null) {
                                            k0.S("period");
                                            throw null;
                                        }
                                        if (!((org.joda.time.base.c)start).R((l0)h3.getEnd())) {
                                            final org.joda.time.c start2 = studentAbsence.getStart();
                                            final Period h4 = this.H;
                                            if (h4 == null) {
                                                k0.S("period");
                                                throw null;
                                            }
                                            if (!((org.joda.time.base.c)start2).X4((l0)h4.getEnd())) {
                                                b = true;
                                                continue Label_0321_Outer;
                                            }
                                        }
                                    }
                                }
                            }
                            b = false;
                        }
                        else {
                            final StudentAbsence next2 = null;
                            int n2;
                            if (next2 != null) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                list.add(next);
                                continue Label_0321_Outer;
                            }
                            continue Label_0321_Outer;
                        }
                    } while (!b);
                    continue;
                }
            }
            return list.size();
        }
        k0.S("classbook");
        throw null;
    }
    
    private final com.untis.mobile.analytics.base.b F() {
        return this.P.getValue();
    }
    
    private final com.untis.mobile.utils.a G() {
        return this.O.getValue();
    }
    
    private final int H() {
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j == null) {
            k0.S("classbookService");
            throw null;
        }
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        final List<StudentAbsence> u = j.u(i.getAbsences());
        final Classbook k = this.I;
        if (k != null) {
            final Set<Long> students = k.getStudents();
            final ArrayList<Number> list = new ArrayList<Number>();
        Label_0321_Outer:
            for (final Number next : students) {
                final long longValue = next.longValue();
                final Iterator<Object> iterator2 = u.iterator();
                while (true) {
                    boolean b;
                    do {
                        final boolean hasNext = iterator2.hasNext();
                        final int n = 1;
                        if (hasNext) {
                            final StudentAbsence next2 = iterator2.next();
                            final StudentAbsence studentAbsence = next2;
                            if (studentAbsence.getStudent().getId() == longValue) {
                                final org.joda.time.c end = studentAbsence.getEnd();
                                final Period h = this.H;
                                if (h == null) {
                                    k0.S("period");
                                    throw null;
                                }
                                if (!((org.joda.time.base.c)end).C((l0)h.getStart())) {
                                    final org.joda.time.c end2 = studentAbsence.getEnd();
                                    final Period h2 = this.H;
                                    if (h2 == null) {
                                        k0.S("period");
                                        throw null;
                                    }
                                    if (!((org.joda.time.base.c)end2).X4((l0)h2.getStart())) {
                                        final org.joda.time.c start = studentAbsence.getStart();
                                        final Period h3 = this.H;
                                        if (h3 == null) {
                                            k0.S("period");
                                            throw null;
                                        }
                                        if (!((org.joda.time.base.c)start).R((l0)h3.getEnd())) {
                                            final org.joda.time.c start2 = studentAbsence.getStart();
                                            final Period h4 = this.H;
                                            if (h4 == null) {
                                                k0.S("period");
                                                throw null;
                                            }
                                            if (!((org.joda.time.base.c)start2).X4((l0)h4.getEnd())) {
                                                b = true;
                                                continue Label_0321_Outer;
                                            }
                                        }
                                    }
                                }
                            }
                            b = false;
                        }
                        else {
                            final StudentAbsence next2 = null;
                            int n2;
                            if (next2 == null) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                list.add(next);
                                continue Label_0321_Outer;
                            }
                            continue Label_0321_Outer;
                        }
                    } while (!b);
                    continue;
                }
            }
            return list.size();
        }
        k0.S("classbook");
        throw null;
    }
    
    private final com.untis.mobile.services.profile.legacy.a I() {
        return this.M.getValue();
    }
    
    private final g J() {
        return this.N.getValue();
    }
    
    private static final void L(final ClassbookActivity classbookActivity, final View view) {
        k0.p(classbookActivity, "this$0");
        final Profile g = classbookActivity.G;
        if (g != null) {
            classbookActivity.onOfflineMessageClick(g);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void M(boolean b) {
        final boolean a = g0.a((Context)this);
        final boolean b2 = false;
        if (!a) {
            this.F().d(com.untis.mobile.analytics.base.c.e.O, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        }
        final k l = this.L;
        if (l == null) {
            k0.S("timeTableService");
            throw null;
        }
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        Period i;
        if ((i = l.l(h.getId())) == null) {
            final Period h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
            i = new Period(h2.getId(), 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = i;
        final Classbook j = this.I;
        if (j == null) {
            k0.S("classbook");
            throw null;
        }
        if (j.getSynced()) {
            final Classbook k = this.I;
            if (k == null) {
                k0.S("classbook");
                throw null;
            }
            if (k.getAbsencesChecked()) {
                if (b) {
                    ((Activity)this).setResult(-1);
                    ((Activity)this).finish();
                }
                return;
            }
        }
        final Profile g = this.G;
        if (g != null) {
            if (g.getSchoolApiVersion() >= 102) {
                final Period h3 = this.H;
                if (h3 == null) {
                    k0.S("period");
                    throw null;
                }
                if (((org.joda.time.base.c)h3.getStart().v0(15)).C((l0)com.untis.mobile.utils.time.a.a())) {
                    this.R();
                    this.W();
                    b = b2;
                }
            }
            else {
                this.T();
            }
            if (b) {
                ((Activity)this).setResult(-1);
                ((Activity)this).finish();
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void O() {
        this.setSupportActionBar((Toolbar)this.findViewById(c.i.W3));
        if (Build$VERSION.SDK_INT >= 21) {
            ((AppBarLayout)this.findViewById(c.i.T3)).setElevation(0.0f);
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.f0(0.0f);
            }
        }
        final com.untis.mobile.services.masterdata.a k = this.K;
        if (k == null) {
            k0.S("masterDataService");
            throw null;
        }
        final Period h = this.H;
        if (h != null) {
            final PeriodElement subject = h.getSubject();
            long currentId;
            if (subject == null) {
                currentId = 0L;
            }
            else {
                currentId = subject.getCurrentId();
            }
            final Subject u = k.U(currentId);
            String displayableTitle;
            if (u == null) {
                displayableTitle = null;
            }
            else {
                displayableTitle = u.getDisplayableTitle();
            }
            final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
            if (supportActionBar2 != null) {
                String string;
                if ((string = displayableTitle) == null) {
                    string = ((Activity)this).getString(2131886128);
                }
                supportActionBar2.A0((CharSequence)string);
            }
            final androidx.appcompat.app.a supportActionBar3 = this.getSupportActionBar();
            if (supportActionBar3 != null) {
                final StringBuilder sb = new StringBuilder();
                final Period h2 = this.H;
                if (h2 == null) {
                    k0.S("period");
                    throw null;
                }
                sb.append((Object)((org.joda.time.base.a)h2.getStart()).g4("E dd.MM."));
                sb.append(' ');
                final Period h3 = this.H;
                if (h3 == null) {
                    k0.S("period");
                    throw null;
                }
                sb.append((Object)((org.joda.time.base.a)h3.getStart()).g4("H:mm"));
                sb.append(" - ");
                final Period h4 = this.H;
                if (h4 == null) {
                    k0.S("period");
                    throw null;
                }
                sb.append((Object)((org.joda.time.base.a)h4.getEnd()).g4("H:mm"));
                supportActionBar3.y0((CharSequence)sb.toString());
            }
            final androidx.appcompat.app.a supportActionBar4 = this.getSupportActionBar();
            if (supportActionBar4 != null) {
                supportActionBar4.Y(true);
            }
            final androidx.appcompat.app.a supportActionBar5 = this.getSupportActionBar();
            if (supportActionBar5 != null) {
                supportActionBar5.k0(2131231071);
            }
            b.setUpTopActionBar$default(this, null, null, 3, null);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private final boolean Q() {
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        if (i.getAbsencesChecked()) {
            return false;
        }
        final Period h = this.H;
        if (h != null) {
            return ((org.joda.time.base.c)h.getStart().v0(15)).C((l0)com.untis.mobile.utils.time.a.a());
        }
        k0.S("period");
        throw null;
    }
    
    private final void T() {
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j == null) {
            k0.S("classbookService");
            throw null;
        }
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        final List<StudentAbsence> u = j.u(i.getAbsences());
        final com.untis.mobile.services.classbook.a k = this.J;
        if (k == null) {
            k0.S("classbookService");
            throw null;
        }
        final Period h = this.H;
        if (h != null) {
            k.C(h.getId(), u).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.g(this), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.f(this));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void U(final ClassbookActivity classbookActivity, final Throwable t) {
        k0.p(classbookActivity, "this$0");
        Log.e("untis_log", "error on submit absences", t);
        u0.d(classbookActivity.findViewById(c.i.U3), t);
        classbookActivity.K();
    }
    
    private static final void V(final ClassbookActivity classbookActivity, final List list) {
        k0.p(classbookActivity, "this$0");
        final Classbook i = classbookActivity.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        i.setAbsencesChecked(true);
        final Classbook j = classbookActivity.I;
        if (j == null) {
            k0.S("classbook");
            throw null;
        }
        j.getAbsences().clear();
        final Classbook k = classbookActivity.I;
        if (k != null) {
            final Set<Long> absences = k.getAbsences();
            k0.o(list, "absences");
            final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
            final Iterator<StudentAbsence> iterator = (Iterator<StudentAbsence>)list.iterator();
            while (iterator.hasNext()) {
                list2.add(Long.valueOf(iterator.next().getId()));
            }
            absences.addAll((Collection<? extends Long>)list2);
            kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ ClassbookActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ ClassbookActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((ClassbookActivity$f)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final a y = ClassbookActivity.y(this.H);
                        if (y == null) {
                            k0.S("classbookService");
                            throw null;
                        }
                        final Classbook x = ClassbookActivity.x(this.H);
                        if (x == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (y.a0(x, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            classbookActivity.K();
            ((Activity)classbookActivity).setResult(-1);
            ((Activity)classbookActivity).finish();
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    private final void W() {
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j == null) {
            k0.S("classbookService");
            throw null;
        }
        final Period h = this.H;
        if (h != null) {
            j.n(h).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.d(this), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.e(this));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private static final void X(final ClassbookActivity classbookActivity, final Boolean b) {
        k0.p(classbookActivity, "this$0");
        final Classbook i = classbookActivity.I;
        if (i != null) {
            k0.o(b, "success");
            i.setAbsencesChecked(b);
            kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ ClassbookActivity H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ ClassbookActivity H = this.H;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((ClassbookActivity$g)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final a y = ClassbookActivity.y(this.H);
                        if (y == null) {
                            k0.S("classbookService");
                            throw null;
                        }
                        final Classbook x = ClassbookActivity.x(this.H);
                        if (x == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        this.G = 1;
                        if (y.a0(x, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            classbookActivity.K();
            ((Activity)classbookActivity).setResult(-1);
            ((Activity)classbookActivity).finish();
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    private static final void Y(final ClassbookActivity classbookActivity, final Throwable t) {
        k0.p(classbookActivity, "this$0");
        Log.e("untis_log", "error on checking absences", t);
        classbookActivity.K();
        ((Activity)classbookActivity).setResult(-1);
        ((Activity)classbookActivity).finish();
    }
    
    private final void b0() {
        final MenuItem r = this.R;
        if (r == null) {
            k0.S("classRoleItem");
            throw null;
        }
        final Classbook i = this.I;
        if (i != null) {
            r.setVisible(i.getClassRoles().isEmpty() ^ true);
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    private final void c0() {
        final MenuItem q = this.Q;
        if (q == null) {
            k0.S("eventMenuItem");
            throw null;
        }
        final com.untis.mobile.b g = com.untis.mobile.b.G;
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        final boolean b = g.b(g2);
        final boolean b2 = true;
        boolean visible = false;
        Label_0130: {
            if (!b) {
                final com.untis.mobile.services.a a = com.untis.mobile.services.a.a;
                final Period h = this.H;
                if (h == null) {
                    k0.S("period");
                    throw null;
                }
                visible = b2;
                if (a.p(h)) {
                    break Label_0130;
                }
                final Period h2 = this.H;
                if (h2 == null) {
                    k0.S("period");
                    throw null;
                }
                if (a.k(h2)) {
                    final Classbook i = this.I;
                    if (i == null) {
                        k0.S("classbook");
                        throw null;
                    }
                    if (i.getEvents().isEmpty() ^ true) {
                        visible = b2;
                        break Label_0130;
                    }
                }
            }
            visible = false;
        }
        q.setVisible(visible);
        final MenuItem q2 = this.Q;
        if (q2 == null) {
            k0.S("eventMenuItem");
            throw null;
        }
        final Classbook j = this.I;
        if (j != null) {
            int n;
            if (j.getEvents().isEmpty()) {
                n = 2131231105;
            }
            else {
                n = 2131231104;
            }
            q2.setIcon(androidx.core.content.d.i((Context)this, n));
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    public static /* synthetic */ k2 e0(final ClassbookActivity classbookActivity, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        return classbookActivity.d0(b);
    }
    
    public static final /* synthetic */ Classbook x(final ClassbookActivity classbookActivity) {
        return classbookActivity.I;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a y(final ClassbookActivity classbookActivity) {
        return classbookActivity.J;
    }
    
    @f
    public final com.untis.mobile.ui.activities.classbook.a E() {
        return this.S;
    }
    
    public final void K() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(8);
    }
    
    public final void P(@f final com.untis.mobile.ui.activities.classbook.a s) {
        this.S = s;
    }
    
    public final void R() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(0);
    }
    
    public final void S() {
        final androidx.appcompat.view.b t = this.T;
        if (t != null) {
            t.c();
        }
        this.S = null;
        this.T = null;
    }
    
    public final void Z(final long n, final boolean b) {
        if (this.T == null && b) {
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            final Period h = this.H;
            if (h == null) {
                k0.S("period");
                throw null;
            }
            final com.untis.mobile.ui.activities.classbook.a s = new com.untis.mobile.ui.activities.classbook.a(this, g, h);
            k0.m(this.S = s);
            this.T = this.startSupportActionMode((b$a)s);
        }
        final com.untis.mobile.ui.activities.classbook.a s2 = this.S;
        if (s2 != null) {
            s2.f(n);
        }
        final androidx.appcompat.view.b t = this.T;
        if (t != null) {
            final com.untis.mobile.ui.activities.classbook.a s3 = this.S;
            String s4 = "";
            if (s3 != null) {
                final String e = s3.e();
                if (e != null) {
                    s4 = e;
                }
            }
            t.s((CharSequence)s4);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @e
    public final k2 d0(final boolean b) {
        return kotlinx.coroutines.h.f((r0)b2.G, (kotlin.coroutines.g)null, (kotlinx.coroutines.u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ boolean H;
            final /* synthetic */ ClassbookActivity I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ boolean H = this.H;
                    final /* synthetic */ ClassbookActivity I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((ClassbookActivity$h)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final kotlinx.coroutines.m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ boolean H;
                        final /* synthetic */ ClassbookActivity I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ boolean H = this.H;
                                final /* synthetic */ ClassbookActivity I = this.I;
                            };
                        }
                        
                        @f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                            return ((ClassbookActivity$h$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                if (this.H) {
                                    final ClassbookActivity i = this.I;
                                    final a y = ClassbookActivity.y(i);
                                    if (y == null) {
                                        k0.S("classbookService");
                                        throw null;
                                    }
                                    final Classbook x = ClassbookActivity.x(this.I);
                                    if (x == null) {
                                        k0.S("classbook");
                                        throw null;
                                    }
                                    Classbook classbook;
                                    if ((classbook = y.S(x.getId())) == null) {
                                        classbook = ClassbookActivity.x(this.I);
                                        if (classbook == null) {
                                            k0.S("classbook");
                                            throw null;
                                        }
                                    }
                                    ClassbookActivity.A(i, classbook);
                                }
                                final int w = this.I.D();
                                final int z = this.I.H();
                                final Classbook x2 = ClassbookActivity.x(this.I);
                                if (x2 == null) {
                                    k0.S("classbook");
                                    throw null;
                                }
                                final int size = x2.getStudents().size();
                                final w2 e = i1.e();
                                final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>(z) {
                                    int G;
                                    final /* synthetic */ ClassbookActivity H;
                                    final /* synthetic */ int I;
                                    final /* synthetic */ int J;
                                    final /* synthetic */ int K;
                                    
                                    @org.jetbrains.annotations.e
                                    @Override
                                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                            int G;
                                            final /* synthetic */ ClassbookActivity H = this.H;
                                            final /* synthetic */ int I = this.I;
                                            final /* synthetic */ int J = this.J;
                                            final /* synthetic */ int K = this.K;
                                        };
                                    }
                                    
                                    @f
                                    @Override
                                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                                        return ((ClassbookActivity$h$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                                    }
                                    
                                    @f
                                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                                        kotlin.coroutines.intrinsics.b.h();
                                        if (this.G == 0) {
                                            c1.n(o);
                                            final ClassbookActivity h = this.H;
                                            final int v3 = com.untis.mobile.c.i.V3;
                                            final TabLayout$i z = ((TabLayout)h.findViewById(v3)).z(0);
                                            if (z != null) {
                                                z.D((CharSequence)((Activity)this.H).getString(2131886670));
                                            }
                                            final TabLayout$i z2 = ((TabLayout)this.H.findViewById(v3)).z(1);
                                            if (z2 != null) {
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append(((Activity)this.H).getString(2131886802));
                                                sb.append(" (");
                                                sb.append(this.I);
                                                sb.append('/');
                                                sb.append(this.J);
                                                sb.append(')');
                                                z2.D((CharSequence)sb.toString());
                                            }
                                            final TabLayout$i z3 = ((TabLayout)this.H.findViewById(v3)).z(2);
                                            if (z3 != null) {
                                                final StringBuilder sb2 = new StringBuilder();
                                                sb2.append(((Activity)this.H).getString(2131886806));
                                                sb2.append(" (");
                                                sb2.append(this.K);
                                                sb2.append('/');
                                                sb2.append(this.J);
                                                sb2.append(')');
                                                z3.D((CharSequence)sb2.toString());
                                            }
                                            return j2.a;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                };
                                this.G = 1;
                                if (kotlinx.coroutines.h.i((kotlin.coroutines.g)e, (p)p, (kotlin.coroutines.d)this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final k l = this.L;
        if (l == null) {
            k0.S("timeTableService");
            throw null;
        }
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        Period i;
        if ((i = l.l(h.getId())) == null) {
            final Period h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
            i = new Period(h2.getId(), 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = i;
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j != null) {
            Classbook s;
            if ((s = j.S(i.getId())) == null) {
                final Period h3 = this.H;
                if (h3 == null) {
                    k0.S("period");
                    throw null;
                }
                s = new Classbook(h3.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
            }
            this.I = s;
            final boolean b = n2 == -1;
            if (n != 1300) {
                if (n != 1400) {
                    super.onActivityResult(n, n2, intent);
                    return;
                }
                if (!b) {
                    return;
                }
                this.c0();
                final List g0 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                k0.o(g0, "supportFragmentManager.fragments");
                final ArrayList<Fragment> list = new ArrayList<Fragment>();
                for (final Fragment next : g0) {
                    if (next instanceof ClassbookPageFragment) {
                        list.add(next);
                    }
                }
                final ArrayList list2 = new ArrayList<ClassbookPageFragment>(v.Y((Iterable<?>)list, 10));
                for (final Fragment obj : list) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.ClassbookPageFragment");
                    list2.add((ClassbookPageFragment)obj);
                }
                for (final ClassbookPageFragment classbookPageFragment : list2) {
                    final Period h4 = this.H;
                    if (h4 == null) {
                        k0.S("period");
                        throw null;
                    }
                    final Classbook k = this.I;
                    if (k == null) {
                        k0.S("classbook");
                        throw null;
                    }
                    classbookPageFragment.u(h4, k);
                }
            }
            else {
                if (!b) {
                    return;
                }
                final List g2 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                k0.o(g2, "supportFragmentManager.fragments");
                final ArrayList<Fragment> list3 = new ArrayList<Fragment>();
                for (final Fragment next2 : g2) {
                    if (next2 instanceof ClassbookPageFragment) {
                        list3.add(next2);
                    }
                }
                final ArrayList list4 = new ArrayList<ClassbookPageFragment>(v.Y((Iterable<?>)list3, 10));
                for (final Fragment obj2 : list3) {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.ClassbookPageFragment");
                    list4.add((ClassbookPageFragment)obj2);
                }
                for (final ClassbookPageFragment classbookPageFragment2 : list4) {
                    final Period h5 = this.H;
                    if (h5 == null) {
                        k0.S("period");
                        throw null;
                    }
                    final Classbook m = this.I;
                    if (m == null) {
                        k0.S("classbook");
                        throw null;
                    }
                    classbookPageFragment2.u(h5, m);
                }
            }
            e0(this, false, 1, null);
            return;
        }
        k0.S("classbookService");
        throw null;
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("oderAuchSo", "");
            if (string == null) {
                string = s;
            }
        }
        Profile g;
        if ((g = this.I().l(string)) == null) {
            g = this.I().n();
            if (g == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g;
        this.J = g.getClassBookService();
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        this.K = g2.getMasterDataService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.L = g3.getTimeTableService();
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras == null) {
            long1 = 0L;
        }
        else {
            long1 = extras.getLong("aberSowieso");
        }
        Period l;
        if ((l = com.untis.mobile.services.timetable.placeholder.p.Y.a(string).l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        final com.untis.mobile.services.classbook.a j = this.J;
        if (j != null) {
            Classbook s2;
            if ((s2 = j.S(long1)) == null) {
                s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
            }
            this.I = s2;
            this.setContentView(2131492904);
            this.O();
            Label_0406: {
                if (g0.a((Context)this)) {
                    final Profile g4 = this.G;
                    if (g4 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    if (!g4.hasAnyState(ProfileState.InvalidApiSharedSecret, ProfileState.ServerDownForMaintenance)) {
                        ((RelativeLayout)this.findViewById(c.i.V8)).setVisibility(8);
                        break Label_0406;
                    }
                }
                final int v8 = c.i.V8;
                ((RelativeLayout)this.findViewById(v8)).setVisibility(0);
                ((RelativeLayout)this.findViewById(v8)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.c(this));
            }
            this.B();
            return;
        }
        k0.S("classbookService");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@f final Menu menu) {
        this.getMenuInflater().inflate(2131558402, menu);
        if (menu == null) {
            return false;
        }
        final MenuItem item = menu.findItem(2131298431);
        k0.o(item, "safeMenu.findItem(R.id.menu_activity_classbook_classregevents)");
        this.Q = item;
        final MenuItem item2 = menu.findItem(2131298432);
        k0.o(item2, "safeMenu.findItem(R.id.menu_activity_classbook_duty)");
        this.R = item2;
        this.c0();
        this.b0();
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        switch (menuItem.getItemId()) {
            case 2131298432: {
                final DutiesActivity.a k = DutiesActivity.K;
                final Context applicationContext = ((Activity)this).getApplicationContext();
                k0.o(applicationContext, "applicationContext");
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                final String uniqueId = g.getUniqueId();
                final Period h = this.H;
                if (h != null) {
                    final long id = h.getId();
                    final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
                    String string = null;
                    Label_0152: {
                        if (supportActionBar != null) {
                            final CharSequence x = supportActionBar.x();
                            if (x != null) {
                                string = x.toString();
                                if (string != null) {
                                    break Label_0152;
                                }
                            }
                        }
                        string = "";
                    }
                    ((Activity)this).startActivity(k.a(applicationContext, uniqueId, id, string));
                    break;
                }
                k0.S("period");
                throw null;
            }
            case 2131298431: {
                final Classbook i = this.I;
                if (i != null) {
                    Intent intent;
                    if (i.getEvents().isEmpty()) {
                        final EventDetailActivity.a q = EventDetailActivity.Q;
                        final Profile g2 = this.G;
                        if (g2 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final String uniqueId2 = g2.getUniqueId();
                        final Period h2 = this.H;
                        if (h2 == null) {
                            k0.S("period");
                            throw null;
                        }
                        intent = EventDetailActivity.a.d(q, (Context)this, uniqueId2, h2, null, 8, null);
                    }
                    else {
                        final EventsActivity.a r = EventsActivity.R;
                        final Profile g3 = this.G;
                        if (g3 == null) {
                            k0.S("profile");
                            throw null;
                        }
                        final String uniqueId3 = g3.getUniqueId();
                        final Period h3 = this.H;
                        if (h3 == null) {
                            k0.S("period");
                            throw null;
                        }
                        intent = r.a((Context)this, uniqueId3, h3.getId());
                    }
                    ((ComponentActivity)this).startActivityForResult(intent, 1400);
                    break;
                }
                k0.S("classbook");
                throw null;
            }
            case 16908332: {
                ((ComponentActivity)this).onBackPressed();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("oderAuchSo", g.getUniqueId());
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("aberSowieso", h.getId());
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/activities/classbook/ClassbookActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "Landroid/content/Intent;", "a", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)ClassbookActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("oderAuchSo", s);
            bundle.putLong("aberSowieso", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
