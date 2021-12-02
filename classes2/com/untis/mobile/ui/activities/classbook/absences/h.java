// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.absences;

import android.widget.ImageView;
import android.widget.TextView;
import android.app.Dialog;
import android.app.Activity;
import java.util.Collection;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.text.s;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.utils.d0;
import androidx.appcompat.widget.AppCompatTextView;
import org.joda.time.l0;
import java.util.Comparator;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import android.annotation.SuppressLint;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.d$a;
import com.untis.mobile.utils.u0;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.Log;
import java.util.Iterator;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import rx.functions.b;
import android.view.View;
import android.content.DialogInterface;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020*¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J$\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0014\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/absences/h;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "studentAbsence", "Lkotlin/j2;", "u", "r", "l", "Lcom/untis/mobile/persistence/models/profile/Profile;", "v", "x", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "o", "", "getItemId", "getCount", "", "studentAbsences", "w", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "J", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "", "H", "Ljava/lang/String;", "profileId", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "M", "Landroid/view/LayoutInflater;", "inflater", "", "K", "Ljava/util/List;", "Lcom/untis/mobile/ui/activities/classbook/absences/AbsencesActivity;", "G", "Lcom/untis/mobile/ui/activities/classbook/absences/AbsencesActivity;", "activity", "Lcom/untis/mobile/services/classbook/a;", "L", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/absences/AbsencesActivity;Ljava/lang/String;Lcom/untis/mobile/persistence/models/timetable/period/Period;Lcom/untis/mobile/persistence/models/timetable/period/Classbook;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends BaseAdapter
{
    @e
    private final AbsencesActivity G;
    @e
    private final String H;
    @e
    private final Period I;
    @e
    private final Classbook J;
    @e
    private final List<StudentAbsence> K;
    @e
    private final a L;
    private final LayoutInflater M;
    
    public h(@e final AbsencesActivity g, @e final String h, @e final Period i, @e final Classbook j, @e final List<StudentAbsence> k) {
        k0.p(g, "activity");
        k0.p(h, "profileId");
        k0.p(i, "period");
        k0.p(j, "classbook");
        k0.p(k, "studentAbsences");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = com.untis.mobile.services.classbook.k0.a0.a(h);
        this.M = LayoutInflater.from((Context)g);
        this.x();
    }
    
    public static final /* synthetic */ AbsencesActivity h(final h h) {
        return h.G;
    }
    
    public static final /* synthetic */ a i(final h h) {
        return h.L;
    }
    
    public static final /* synthetic */ Classbook j(final h h) {
        return h.J;
    }
    
    public static final /* synthetic */ List k(final h h) {
        return h.K;
    }
    
    private final void l(final StudentAbsence studentAbsence) {
        if (this.v().getSchoolApiVersion() >= 102) {
            this.L.x(this.I, studentAbsence).C5((b)new g(this, studentAbsence), (b)new f(this));
        }
        else {
            kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ h H;
                final /* synthetic */ StudentAbsence I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ h H = this.H;
                        final /* synthetic */ StudentAbsence I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((h$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    Label_0276: {
                        Label_0202: {
                            if (g != 0) {
                                if (g != 1) {
                                    if (g == 2) {
                                        c1.n(o);
                                        break Label_0202;
                                    }
                                    if (g == 3) {
                                        c1.n(o);
                                        break Label_0276;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    c1.n(o);
                                }
                            }
                            else {
                                c1.n(o);
                                final com.untis.mobile.services.classbook.a i = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                                final StudentAbsence j = this.I;
                                this.G = 1;
                                if (i.f(j, this) == h) {
                                    return h;
                                }
                            }
                            final Iterator<Long> iterator = com.untis.mobile.ui.activities.classbook.absences.h.j(this.H).getAbsences().iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().longValue() == this.I.getId()) {
                                    iterator.remove();
                                    break;
                                }
                            }
                            com.untis.mobile.ui.activities.classbook.absences.h.k(this.H).remove(this.I);
                            final com.untis.mobile.services.classbook.a k = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                            final StudentAbsence l = this.I;
                            this.G = 2;
                            if (k.a(l, this) == h) {
                                return h;
                            }
                        }
                        com.untis.mobile.ui.activities.classbook.absences.h.j(this.H).setSynced(false);
                        com.untis.mobile.ui.activities.classbook.absences.h.j(this.H).getAbsences().remove(kotlin.coroutines.jvm.internal.b.g(this.I.getId()));
                        final com.untis.mobile.services.classbook.a m = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                        final Classbook j2 = com.untis.mobile.ui.activities.classbook.absences.h.j(this.H);
                        this.G = 3;
                        if (m.a0(j2, this) == h) {
                            return h;
                        }
                    }
                    this.H.notifyDataSetInvalidated();
                    ((Activity)com.untis.mobile.ui.activities.classbook.absences.h.h(this.H)).setResult(-1);
                    return j2.a;
                }
            }, 1, (Object)null);
        }
    }
    
    private static final void m(final h h, final StudentAbsence studentAbsence, final Boolean b) {
        k0.p(h, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ h H;
            final /* synthetic */ StudentAbsence I;
            final /* synthetic */ Boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ h H = this.H;
                    final /* synthetic */ StudentAbsence I = this.I;
                    final /* synthetic */ Boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((h$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0294: {
                    Label_0202: {
                        if (g != 0) {
                            if (g != 1) {
                                if (g == 2) {
                                    c1.n(o);
                                    break Label_0202;
                                }
                                if (g == 3) {
                                    c1.n(o);
                                    break Label_0294;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                            }
                        }
                        else {
                            c1.n(o);
                            final com.untis.mobile.services.classbook.a i = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                            final StudentAbsence j = this.I;
                            this.G = 1;
                            if (i.f(j, this) == h) {
                                return h;
                            }
                        }
                        final Iterator<Long> iterator = com.untis.mobile.ui.activities.classbook.absences.h.j(this.H).getAbsences().iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().longValue() == this.I.getId()) {
                                iterator.remove();
                                break;
                            }
                        }
                        com.untis.mobile.ui.activities.classbook.absences.h.k(this.H).remove(this.I);
                        final com.untis.mobile.services.classbook.a k = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                        final StudentAbsence l = this.I;
                        this.G = 2;
                        if (k.a(l, this) == h) {
                            return h;
                        }
                    }
                    final Classbook m = com.untis.mobile.ui.activities.classbook.absences.h.j(this.H);
                    final Boolean j2 = this.J;
                    k0.o(j2, "success");
                    m.setSynced(j2);
                    com.untis.mobile.ui.activities.classbook.absences.h.j(this.H).getAbsences().remove(kotlin.coroutines.jvm.internal.b.g(this.I.getId()));
                    final com.untis.mobile.services.classbook.a i2 = com.untis.mobile.ui.activities.classbook.absences.h.i(this.H);
                    final Classbook j3 = com.untis.mobile.ui.activities.classbook.absences.h.j(this.H);
                    this.G = 3;
                    if (i2.a0(j3, this) == h) {
                        return h;
                    }
                }
                this.H.notifyDataSetInvalidated();
                ((Activity)com.untis.mobile.ui.activities.classbook.absences.h.h(this.H)).setResult(-1);
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    private static final void n(final h h, final Throwable t) {
        k0.p(h, "this$0");
        Log.e("untis_log", "could not delete in absence details", t);
        u0.d(h.G.findViewById(c.i.u2), t);
    }
    
    private static final void p(final h h, final StudentAbsence studentAbsence, final View view) {
        k0.p(h, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        h.u(studentAbsence);
    }
    
    private static final void q(final h h, final StudentAbsence studentAbsence, final View view) {
        k0.p(h, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        h.r(studentAbsence);
    }
    
    @SuppressLint({ "InflateParams" })
    private final void r(final StudentAbsence studentAbsence) {
        ((Dialog)new d$a((Context)this.G, 2131951624).M(this.M.inflate(2131493034, (ViewGroup)null, false)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.classbook.absences.b.G).B(2131886653, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.a(this, studentAbsence)).a()).show();
    }
    
    private static final void s(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void t(final h h, final StudentAbsence studentAbsence, final DialogInterface dialogInterface, final int n) {
        k0.p(h, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        h.l(studentAbsence);
        h.notifyDataSetChanged();
        dialogInterface.dismiss();
    }
    
    private final void u(final StudentAbsence studentAbsence) {
        this.G.t(studentAbsence);
    }
    
    private final Profile v() {
        Profile l;
        if ((l = j0.G.l(this.H)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return l;
    }
    
    private final void x() {
        v.p0(this.K, com.untis.mobile.ui.activities.classbook.absences.e.G);
    }
    
    private static final int y(final StudentAbsence studentAbsence, final StudentAbsence studentAbsence2) {
        final int b = ((org.joda.time.base.c)studentAbsence.getStart()).b((l0)studentAbsence2.getStart());
        if (b == 0) {
            return ((org.joda.time.base.c)studentAbsence.getEnd()).b((l0)studentAbsence2.getEnd());
        }
        return b;
    }
    
    public int getCount() {
        return this.K.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @e
    public View getView(int n, @org.jetbrains.annotations.f final View view, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        final StudentAbsence o = this.o(n);
        View inflate = view;
        if (view == null) {
            inflate = this.M.inflate(2131493161, viewGroup, false);
        }
        ((TextView)inflate.findViewById(c.i.ou)).setText((CharSequence)d0.o(o.getStart()));
        ((TextView)inflate.findViewById(c.i.lu)).setText((CharSequence)d0.o(o.getEnd()));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(c.i.hu);
        final AbsenceReason absenceReason = o.getAbsenceReason();
        CharSequence displayName;
        if (absenceReason == null) {
            displayName = null;
        }
        else {
            displayName = absenceReason.getDisplayName();
        }
        ((TextView)appCompatTextView).setText(displayName);
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)inflate.findViewById(c.i.gu);
        final AbsenceReason absenceReason2 = o.getAbsenceReason();
        CharSequence displayName2;
        if (absenceReason2 == null) {
            displayName2 = null;
        }
        else {
            displayName2 = absenceReason2.getDisplayName();
        }
        if (displayName2 != null && !s.U1(displayName2)) {
            n = 0;
        }
        else {
            n = 1;
        }
        ((ViewGroup)linearLayoutCompat).setVisibility(com.untis.mobile.utils.extension.h.U((boolean)((n ^ 0x1) != 0x0), 0, 1, null));
        ((TextView)inflate.findViewById(c.i.qu)).setText((CharSequence)o.getText());
        ((ViewGroup)inflate.findViewById(c.i.pu)).setVisibility(com.untis.mobile.utils.extension.h.U(s.U1((CharSequence)o.getText()) ^ true, 0, 1, null));
        ((ImageView)inflate.findViewById(c.i.ju)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.d(this, o));
        ((ImageView)inflate.findViewById(c.i.iu)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.absences.c(this, o));
        k0.o(inflate, "view");
        return inflate;
    }
    
    @e
    public StudentAbsence o(final int n) {
        return this.K.get(n);
    }
    
    public final void w(@e final List<StudentAbsence> list) {
        k0.p(list, "studentAbsences");
        this.K.removeAll(list);
        this.K.addAll(list);
        this.x();
        this.notifyDataSetChanged();
    }
}
