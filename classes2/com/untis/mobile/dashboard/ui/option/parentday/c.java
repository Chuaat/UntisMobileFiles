// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday;

import com.untis.mobile.services.profile.legacy.j0;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import com.untis.mobile.utils.extension.h;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.NoSuchElementException;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayStudentSubject;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.Entity;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import java.util.ArrayList;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.dashboard.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b,\u0010-J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0013\u0010\t\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u000fJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR$\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006." }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/c;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "data", "l", "d", "k", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "j", "Landroidx/lifecycle/LiveData;", "g", "", "parentDayId", "h", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "f", "", "i", "Lcom/untis/mobile/dashboard/service/a;", "c", "Lcom/untis/mobile/dashboard/service/a;", "dashboardService", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/c;", "dashboardParentDayContext", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/k0;", "parentDayLiveData", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends w0
{
    @e
    private final Context a;
    private Profile b;
    private a c;
    private com.untis.mobile.services.masterdata.a d;
    @e
    private final k0<List<DashboardParentDay>> e;
    private com.untis.mobile.dashboard.ui.option.parentday.detail.c f;
    
    public c(@e final Context a) {
        kotlin.jvm.internal.k0.p(a, "context");
        this.a = a;
        this.e = (k0<List<DashboardParentDay>>)new k0((Object)null);
    }
    
    public static final /* synthetic */ Context c(final c c) {
        return c.a;
    }
    
    private final Object d(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof c$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (c$a)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.parentday.c.this.d(this);
                }
            };
        }
        Object o = d3.H;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        c c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c = (c)d3.G;
            c1.n(o);
        }
        else {
            c1.n(o);
            final a c2 = this.c;
            if (c2 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            d3.G = this;
            d3.J = 1;
            o = c2.p(d3);
            if (o == h) {
                return h;
            }
            c = this;
        }
        final List<DashboardParentDay> list = (List<DashboardParentDay>)o;
        c.l(list);
        c.e.q((Object)list);
        return j2.a;
    }
    
    private final Object e(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof c$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (c$b)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.parentday.c.this.e(this);
                }
            };
        }
        Object o = d3.H;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        c c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c = (c)d3.G;
            c1.n(o);
        }
        else {
            c1.n(o);
            final a c2 = this.c;
            if (c2 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            d3.G = this;
            d3.J = 1;
            o = c2.a(d3);
            if (o == h) {
                return h;
            }
            c = this;
        }
        final List<DashboardParentDay> list = (List<DashboardParentDay>)o;
        c.l(list);
        c.e.q((Object)list);
        return j2.a;
    }
    
    private final void l(final List<DashboardParentDay> list) {
        final ArrayList<List<DashboardParentDayAppointment>> list2 = new ArrayList<List<DashboardParentDayAppointment>>();
        final Iterator<DashboardParentDay> iterator = list.iterator();
        while (iterator.hasNext()) {
            final List<DashboardParentDayAppointment> appointments = iterator.next().getAppointments();
            if (appointments != null) {
                list2.add(appointments);
            }
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list2);
        final Profile b = this.b;
        if (b != null) {
            final boolean hasAnyRole = b.hasAnyRole(EntityType.TEACHER);
            final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)c0, 10));
            final Iterator<DashboardParentDayAppointment> iterator2 = c0.iterator();
            while (iterator2.hasNext()) {
                list3.add(Long.valueOf(iterator2.next().getRoomId()));
            }
            final List<Object> n1 = v.N1((Iterable<?>)list3);
            final ArrayList<Room> list4 = new ArrayList<Room>();
            final Iterator<Number> iterator3 = n1.iterator();
            while (iterator3.hasNext()) {
                final long longValue = iterator3.next().longValue();
                final com.untis.mobile.services.masterdata.a d = this.d;
                if (d == null) {
                    kotlin.jvm.internal.k0.S("masterDataService");
                    throw null;
                }
                final Room p = d.P(longValue);
                if (p == null) {
                    continue;
                }
                list4.add(p);
            }
            final android.util.LongSparseArray<Entity> e = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list4);
            final ArrayList list5 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)c0, 10));
            final Iterator<DashboardParentDayAppointment> iterator4 = c0.iterator();
            while (iterator4.hasNext()) {
                list5.add(iterator4.next().getStudentSubjects());
            }
            final List<Object> n2 = v.N1((Iterable<?>)v.c0((Iterable<? extends Iterable<?>>)list5));
            final ArrayList<Student> list6 = new ArrayList<Student>();
            for (final DashboardParentDayStudentSubject dashboardParentDayStudentSubject : n2) {
                final com.untis.mobile.services.masterdata.a d2 = this.d;
                if (d2 == null) {
                    kotlin.jvm.internal.k0.S("masterDataService");
                    throw null;
                }
                final Student v = d2.V(dashboardParentDayStudentSubject.getStudentId());
                if (v == null) {
                    continue;
                }
                list6.add(v);
            }
            final android.util.LongSparseArray<Entity> e2 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list6);
            final ArrayList list7 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)c0, 10));
            final Iterator<DashboardParentDayAppointment> iterator6 = c0.iterator();
            while (iterator6.hasNext()) {
                list7.add(iterator6.next().getStudentSubjects());
            }
            final List<Object> c2 = v.c0((Iterable<? extends Iterable<?>>)list7);
            final ArrayList list8 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)c2, 10));
            final Iterator<DashboardParentDayStudentSubject> iterator7 = c2.iterator();
            while (iterator7.hasNext()) {
                list8.add(iterator7.next().getSubjectIds());
            }
            final List<Object> n3 = v.N1((Iterable<?>)v.c0((Iterable<? extends Iterable<?>>)list8));
            final ArrayList<Subject> list9 = new ArrayList<Subject>();
            final Iterator<Number> iterator8 = n3.iterator();
            while (iterator8.hasNext()) {
                final long longValue2 = iterator8.next().longValue();
                final com.untis.mobile.services.masterdata.a d3 = this.d;
                if (d3 == null) {
                    kotlin.jvm.internal.k0.S("masterDataService");
                    throw null;
                }
                final Subject u = d3.U(longValue2);
                if (u == null) {
                    continue;
                }
                list9.add(u);
            }
            final android.util.LongSparseArray<Entity> e3 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list9);
            final ArrayList list10 = new ArrayList<Number>(v.Y((Iterable<?>)c0, 10));
            final Iterator<DashboardParentDayAppointment> iterator9 = c0.iterator();
            while (iterator9.hasNext()) {
                list10.add(Long.valueOf(iterator9.next().getTeacherId()));
            }
            final ArrayList<Teacher> list11 = new ArrayList<Teacher>();
            final Iterator<Number> iterator10 = list10.iterator();
            while (iterator10.hasNext()) {
                final long longValue3 = iterator10.next().longValue();
                final com.untis.mobile.services.masterdata.a d4 = this.d;
                if (d4 == null) {
                    kotlin.jvm.internal.k0.S("masterDataService");
                    throw null;
                }
                final Teacher k = d4.k(longValue3);
                if (k == null) {
                    continue;
                }
                list11.add(k);
            }
            this.f = new com.untis.mobile.dashboard.ui.option.parentday.detail.c(hasAnyRole, (LongSparseArray<Teacher>)com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list11), (LongSparseArray<Student>)e2, (LongSparseArray<Subject>)e3, (LongSparseArray<Room>)e);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final com.untis.mobile.dashboard.ui.option.parentday.detail.c f() {
        final com.untis.mobile.dashboard.ui.option.parentday.detail.c f = this.f;
        if (f != null) {
            return f;
        }
        kotlin.jvm.internal.k0.S("dashboardParentDayContext");
        throw null;
    }
    
    @e
    public final LiveData<List<DashboardParentDay>> g() {
        return (LiveData<List<DashboardParentDay>>)this.e;
    }
    
    @e
    public final DashboardParentDay h(final long n) {
        final Object f = ((LiveData)this.e).f();
        if (f != null) {
            for (final DashboardParentDay dashboardParentDay : (Iterable<DashboardParentDay>)f) {
                if (dashboardParentDay.getId() == n) {
                    return dashboardParentDay;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final boolean i() {
        final Profile b = this.b;
        if (b != null) {
            return b.hasAnyRole(EntityType.TEACHER);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final k2 j(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1 && g != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    if (com.untis.mobile.utils.extension.h.g(com.untis.mobile.dashboard.ui.option.parentday.c.c(this.H))) {
                        final c h2 = this.H;
                        this.G = 1;
                        if (h2.e(this) == h) {
                            return h;
                        }
                    }
                    else {
                        final c h3 = this.H;
                        this.G = 2;
                        if (h3.d(this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final void k() {
        final Profile n = j0.G.n();
        if (n == null) {
            throw new IllegalStateException("no profile");
        }
        this.b = n;
        final Context a = this.a;
        final Profile b = this.b;
        if (b == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.c = new com.untis.mobile.dashboard.service.b(a, b.getUniqueId());
        final com.untis.mobile.services.masterdata.b.a z = com.untis.mobile.services.masterdata.b.Z;
        final Profile b2 = this.b;
        if (b2 != null) {
            this.d = z.a(b2.getUniqueId());
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
}
