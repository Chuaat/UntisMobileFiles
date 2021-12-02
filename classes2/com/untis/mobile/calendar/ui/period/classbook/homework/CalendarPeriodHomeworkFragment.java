// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework;

import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.TabLayout$i;
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import org.joda.time.l0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import com.untis.mobile.persistence.models.EntityType;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import java.util.Iterator;
import androidx.navigation.NavController;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.calendar.ui.period.x;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import android.view.View;
import android.os.Bundle;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import com.untis.mobile.calendar.ui.period.k0;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import androidx.navigation.m;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/CalendarPeriodHomeworkFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lkotlinx/coroutines/k2;", "z", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "D", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/q;", "H", "Landroidx/navigation/m;", "x", "()Lcom/untis/mobile/calendar/ui/period/classbook/homework/q;", "args", "Lcom/untis/mobile/calendar/ui/period/k0;", "G", "Lkotlin/b0;", "y", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodHomeworkFragment extends UmFragment
{
    @e
    private final b0 G;
    @e
    private final m H;
    
    public CalendarPeriodHomeworkFragment() {
        this.G = d0.c((a<?>)new a<k0>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final k0 invoke() {
                return (k0)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(k0.class), null, this.I, null);
            }
        });
        this.H = new m(k1.d(q.class), (a)new a<Bundle>() {
            final /* synthetic */ Fragment G;
            
            @e
            @Override
            public final Bundle invoke() {
                final Bundle arguments = this.G.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this.G);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
    }
    
    private static final void A(final CalendarPeriodHomeworkFragment calendarPeriodHomeworkFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkFragment, "this$0");
        calendarPeriodHomeworkFragment.onBackPressed();
    }
    
    private static final void B(final CalendarPeriodHomeworkFragment calendarPeriodHomeworkFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkFragment, "this$0");
        calendarPeriodHomeworkFragment.z();
    }
    
    private static final void C(final b b, final View view, final List list) {
        kotlin.jvm.internal.k0.p(b, "$adapter");
        kotlin.jvm.internal.k0.p(view, "$view");
        if (list == null) {
            return;
        }
        b.n(list);
        ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(b.getItemCount() == 0, 0, 1, null));
    }
    
    private final k2 D(final HomeWork homeWork) {
        return kotlinx.coroutines.h.f(x0.a((w0)this.y()), (g)this.getErrorHandler(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ CalendarPeriodHomeworkFragment H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ CalendarPeriodHomeworkFragment H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((CalendarPeriodHomeworkFragment$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object x) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                boolean b = true;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(x);
                }
                else {
                    c1.n(x);
                    final k0 v = CalendarPeriodHomeworkFragment.this.y();
                    final HomeWork i = this.I;
                    this.G = 1;
                    if ((x = v.X(i, this)) == h) {
                        return h;
                    }
                }
                final List list = (List)x;
                final NavController a = androidx.navigation.fragment.c.a((Fragment)this.H);
                final r.b a2 = r.a;
                final HomeWork j = this.I;
                if (x.c(CalendarPeriodHomeworkFragment.this.x().f()) || this.I.getLocal()) {
                    b = false;
                }
                x = new ArrayList(v.Y((Iterable<?>)list, 10));
                final Iterator<org.joda.time.c> iterator = (Iterator<org.joda.time.c>)list.iterator();
                while (iterator.hasNext()) {
                    ((Collection<Long>)x).add(kotlin.coroutines.jvm.internal.b.g(((org.joda.time.base.g)iterator.next()).n()));
                }
                a.D(a2.a(j, b, v.J5((Collection<Long>)x)));
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    private final q x() {
        return ((b0<q>)this.H).getValue();
    }
    
    private final k0 y() {
        return this.G.getValue();
    }
    
    private final k2 z() {
        return kotlinx.coroutines.h.f(x0.a((w0)this.y()), (g)this.getErrorHandler(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ CalendarPeriodHomeworkFragment I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ CalendarPeriodHomeworkFragment I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((CalendarPeriodHomeworkFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                Object x;
                HomeWork g;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final HomeWork homeWork = (HomeWork)this.G;
                    c1.n(o);
                    x = o;
                    g = homeWork;
                }
                else {
                    c1.n(o);
                    long longValue = 0L;
                    g = new HomeWork(0L, 0L, null, null, null, null, false, null, 0L, 0L, false, null, false, null, 16383, null);
                    final CalendarPeriodLesson lesson = CalendarPeriodHomeworkFragment.this.x().f().getLesson();
                    if (lesson != null) {
                        final Long g2 = kotlin.coroutines.jvm.internal.b.g(lesson.getLessonId());
                        if (g2 != null) {
                            longValue = g2;
                        }
                    }
                    g.setLessonId(longValue);
                    g.setStart(CalendarPeriodHomeworkFragment.this.x().f().getStart());
                    g.setPeriodId(CalendarPeriodHomeworkFragment.this.x().f().getId());
                    g.setLocal(com.untis.mobile.calendar.ui.period.x.c(CalendarPeriodHomeworkFragment.this.x().f()) ^ true);
                    final k0 v = CalendarPeriodHomeworkFragment.this.y();
                    this.G = g;
                    this.H = 1;
                    x = v.X(g, this);
                    if (x == h) {
                        return h;
                    }
                }
                final List<? extends T> list = (List<? extends T>)x;
                org.joda.time.c y0;
                if (list.isEmpty() ^ true) {
                    y0 = v.o2((List<? extends org.joda.time.c>)list);
                }
                else {
                    y0 = g.getStart().Y0(1);
                    kotlin.jvm.internal.k0.o(y0, "{\n            homework.start.plusWeeks(1)\n        }");
                }
                g.setEnd(y0);
                final NavController a = androidx.navigation.fragment.c.a((Fragment)this.I);
                final r.b a2 = r.a;
                final CalendarPeriodHomeworkFragment i = this.I;
                final ArrayList<org.joda.time.c> list2 = new ArrayList<org.joda.time.c>();
                for (final org.joda.time.c next : list) {
                    if (kotlin.coroutines.jvm.internal.b.a(((org.joda.time.base.c)next).C((l0)i.x().f().getStart()) ^ true)) {
                        list2.add(next);
                    }
                }
                final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
                final Iterator<Object> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    list3.add(kotlin.coroutines.jvm.internal.b.g(((org.joda.time.base.g)iterator2.next()).n()));
                }
                a.D(a2.a(g, false, v.J5((Collection<Long>)list3)));
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492981, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Pf)).setOnClickListener((View$OnClickListener)new n(this));
        if (this.y().d0().isEndOfPremium()) {
            ((ImageView)inflate.findViewById(c.i.Of)).setVisibility(h.U(this.y().d0().hasAnyRole(EntityType.TEACHER), 0, 1, null));
        }
        ((ImageView)inflate.findViewById(c.i.Of)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.o(this));
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        final b adapter = new b(requireContext, false, kotlin.collections.m.ey(this.x().e()), new l<HomeWork, j2>() {
            public final void a(@e final HomeWork homeWork) {
                kotlin.jvm.internal.k0.p(homeWork, "it");
                CalendarPeriodHomeworkFragment.this.D(homeWork);
            }
        }, 2, null);
        ((RecyclerView)inflate.findViewById(c.i.Rf)).setAdapter((RecyclerView$h)adapter);
        ((TabLayout)inflate.findViewById(c.i.Tf)).d((TabLayout$f)new com.untis.mobile.utils.m0(new l<TabLayout$i, j2>() {
            public final void a(@e final TabLayout$i tabLayout$i) {
                kotlin.jvm.internal.k0.p(tabLayout$i, "it");
                adapter.o(tabLayout$i.k() == 0);
                ((ViewGroup)inflate.findViewById(c.i.TD)).setVisibility(h.U(adapter.getItemCount() == 0, 0, 1, null));
            }
        }));
        this.y().Y().j(this.getViewLifecycleOwner(), (androidx.lifecycle.l0)new com.untis.mobile.calendar.ui.period.classbook.homework.p(adapter, inflate));
        ((FloatingActionButton)inflate.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231109));
        ((TextView)inflate.findViewById(c.i.VD)).setText((CharSequence)this.getString(2131886298));
        ((TextView)inflate.findViewById(c.i.UD)).setText((CharSequence)this.getString(2131886297));
        ((ViewGroup)inflate.findViewById(c.i.TD)).setVisibility(h.U(adapter.getItemCount() == 0, 0, 1, null));
        return inflate;
    }
}
