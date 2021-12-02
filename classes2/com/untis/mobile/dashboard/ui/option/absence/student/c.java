// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.absence.student;

import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import com.untis.mobile.persistence.models.profile.Right;
import x3.n;
import n6.l;
import java.util.Collection;
import x3.m;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import org.joda.time.l0;
import java.net.ConnectException;
import com.untis.mobile.services.profile.legacy.j0;
import kotlinx.coroutines.u0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.lifecycle.LiveData;
import org.joda.time.t;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.h;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsenceKt;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.dashboard.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.settings.g;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010R\u001a\u00020O¢\u0006\u0004\bk\u0010lJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0013\u0010\u0007\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00150\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0015J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\bJ\u0006\u0010\"\u001a\u00020\bJ\u001d\u0010%\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020#H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010\u0004J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020#J\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014J\u000e\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u001eJ\u000e\u00100\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.J\u000e\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020.J\u000e\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u000203J\u000e\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u0017J\u001c\u0010:\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000208J\u0019\u0010;\u001a\b\u0012\u0004\u0012\u0002030\u0015H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010\u0004J\u0006\u0010=\u001a\u00020<J\u0006\u0010>\u001a\u00020\bJ\u0006\u0010?\u001a\u00020\bJ\u0006\u0010@\u001a\u00020\bJ%\u0010C\u001a\u0004\u0018\u00010\f2\u0006\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020#H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010JR\u0016\u0010N\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010V\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00150S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "p", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "o", "q", "", "showOnlyUnexcused", "absence", "S", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "D", "F", "K", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "H", "Landroidx/lifecycle/LiveData;", "", "v", "", "B", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "N", "z", "E", "Lcom/untis/mobile/persistence/models/profile/Child;", "t", "show", "L", "x", "", "studentId", "y", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "u", "id", "I", "A", "child", "M", "Lorg/joda/time/c;", "start", "P", "end", "O", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "reason", "R", "note", "Q", "Lkotlin/Function0;", "onSuccess", "T", "r", "Lcom/untis/mobile/persistence/models/EntityType;", "C", "U", "a", "G", "absenceStudentId", "argsStudentId", "s", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "e", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroid/content/Context;", "Landroid/content/Context;", "context", "d", "Z", "init", "Lcom/untis/mobile/persistence/dao/classbook/c;", "c", "Lcom/untis/mobile/persistence/dao/classbook/c;", "classbookSettingDao", "Landroidx/lifecycle/k0;", "h", "Landroidx/lifecycle/k0;", "studentAbsencesLiveData", "i", "studentAbsenceDetailLiveData", "Lcom/untis/mobile/dashboard/service/a;", "f", "Lcom/untis/mobile/dashboard/service/a;", "dashboardService", "Lcom/untis/mobile/services/masterdata/a;", "g", "Lcom/untis/mobile/services/masterdata/a;", "w", "()Lcom/untis/mobile/services/masterdata/a;", "J", "(Lcom/untis/mobile/services/masterdata/a;)V", "masterDataService", "Lcom/untis/mobile/utils/settings/g;", "b", "Lcom/untis/mobile/utils/settings/g;", "settings", "j", "absenceId", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/utils/settings/g;Lcom/untis/mobile/persistence/dao/classbook/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends w0
{
    @e
    private final Context a;
    @e
    private final g b;
    @e
    private final com.untis.mobile.persistence.dao.classbook.c c;
    private boolean d;
    private Profile e;
    private a f;
    public com.untis.mobile.services.masterdata.a g;
    @e
    private final k0<List<DashboardStudentAbsence>> h;
    @e
    private final k0<DashboardStudentAbsence> i;
    private long j;
    
    public c(@e final Context a, @e final g b, @e final com.untis.mobile.persistence.dao.classbook.c c) {
        kotlin.jvm.internal.k0.p(a, "context");
        kotlin.jvm.internal.k0.p(b, "settings");
        kotlin.jvm.internal.k0.p(c, "classbookSettingDao");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = (k0<List<DashboardStudentAbsence>>)new k0((Object)null);
        this.i = (k0<DashboardStudentAbsence>)new k0((Object)null);
    }
    
    private final Student D() {
        final Profile e = this.e;
        if (e != null) {
            com.untis.mobile.services.masterdata.a a;
            long n;
            if (e.getEntityType().isStudentRole()) {
                a = this.w();
                final Profile e2 = this.e;
                if (e2 == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                n = e2.getEntityId();
            }
            else {
                final Profile e3 = this.e;
                if (e3 != null) {
                    if (e3.getEntityType().isParentRole()) {
                        final Profile e4 = this.e;
                        if (e4 == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        if (e4.getUserChildren().size() == 1) {
                            a = this.w();
                            final Profile e5 = this.e;
                            if (e5 != null) {
                                n = ((Child)v.m2((Iterable<?>)e5.getUserChildren())).getId();
                                return a.V(n);
                            }
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                    }
                    return null;
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            return a.V(n);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private final boolean S(final boolean b, final DashboardStudentAbsence dashboardStudentAbsence) {
        boolean b2 = true;
        if (b) {
            b2 = (!DashboardStudentAbsenceKt.isExcused(dashboardStudentAbsence, this.w()) && b2);
        }
        return b2;
    }
    
    public static final /* synthetic */ long e(final c c) {
        return c.j;
    }
    
    public static final /* synthetic */ com.untis.mobile.persistence.dao.classbook.c f(final c c) {
        return c.c;
    }
    
    public static final /* synthetic */ Context g(final c c) {
        return c.a;
    }
    
    public static final /* synthetic */ a h(final c c) {
        return c.f;
    }
    
    public static final /* synthetic */ Profile i(final c c) {
        return c.e;
    }
    
    public static final /* synthetic */ g j(final c c) {
        return c.b;
    }
    
    public static final /* synthetic */ k0 k(final c c) {
        return c.i;
    }
    
    public static final /* synthetic */ k0 l(final c c) {
        return c.h;
    }
    
    public static final /* synthetic */ void m(final c c, final long j) {
        c.j = j;
    }
    
    private final DashboardStudentAbsence o() {
        final Profile e = this.e;
        if (e != null) {
            long entityId;
            if (e.hasAnyRole(EntityType.STUDENT)) {
                final Profile e2 = this.e;
                if (e2 == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                entityId = e2.getEntityId();
            }
            else {
                entityId = -1L;
            }
            final com.untis.mobile.utils.v a = com.untis.mobile.utils.v.a;
            final org.joda.time.c z1 = a.a().Z1(new org.joda.time.v(8, 0));
            final org.joda.time.c z2 = a.a().Z1(new org.joda.time.v(18, 0));
            kotlin.jvm.internal.k0.o(z1, "withTime(LocalTime(8, 0))");
            kotlin.jvm.internal.k0.o(z2, "withTime(LocalTime(18, 0))");
            return new DashboardStudentAbsence(0L, entityId, -1L, z1, z2, true, false, null, -1L, null, "");
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private final Object p(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0049: {
            if (d instanceof c$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (c$a)d;
                final int k = d2.K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    d2.K = k + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0049;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                Object H;
                /* synthetic */ Object I;
                int K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object i) {
                    this.I = i;
                    this.K |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.absence.student.c.this.p(this);
                }
            };
        }
        Object o = d3.I;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.K;
        final DashboardStudentAbsence dashboardStudentAbsence = null;
        final DashboardStudentAbsence dashboardStudentAbsence2 = null;
        c c;
        k0 k3;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final k0 k2 = (k0)d3.H;
            c = (c)d3.G;
            c1.n(o);
            k3 = k2;
        }
        else {
            c1.n(o);
            final k0<List<DashboardStudentAbsence>> h2 = this.h;
            final m0 c2 = i1.c();
            final p<r0, d<? super List<? extends DashboardStudentAbsence>>, Object> p = new p<r0, d<? super List<? extends DashboardStudentAbsence>>, Object>() {
                int G;
                final /* synthetic */ c H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>() {
                        int G;
                        final /* synthetic */ c H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) {
                    return ((c$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object j) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(j);
                    }
                    else {
                        c1.n(j);
                        final com.untis.mobile.dashboard.service.a h2 = com.untis.mobile.dashboard.ui.option.absence.student.c.h(this.H);
                        if (h2 == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        this.G = 1;
                        if ((j = h2.j(this)) == h) {
                            return h;
                        }
                    }
                    final Iterable iterable = (Iterable)j;
                    final c h3 = this.H;
                    j = new ArrayList();
                    for (final DashboardStudentAbsence next : iterable) {
                        if (kotlin.coroutines.jvm.internal.b.a(h3.S(h3.x(), next))) {
                            ((Collection<DashboardStudentAbsence>)j).add(next);
                        }
                    }
                    return j;
                }
            };
            d3.G = this;
            d3.H = h2;
            d3.K = 1;
            o = kotlinx.coroutines.h.i((kotlin.coroutines.g)c2, (p)p, (d)d3);
            if (o == h) {
                return h;
            }
            k3 = h2;
            c = this;
        }
        k3.q(o);
        final k0<DashboardStudentAbsence> j = c.i;
        final List list = (List)((LiveData)c.h).f();
        DashboardStudentAbsence dashboardStudentAbsence3;
        if (list == null) {
            dashboardStudentAbsence3 = dashboardStudentAbsence;
        }
        else {
            final Iterator<DashboardStudentAbsence> iterator = list.iterator();
            DashboardStudentAbsence next;
            do {
                next = dashboardStudentAbsence2;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!kotlin.coroutines.jvm.internal.b.a(next.getId() == c.j));
            dashboardStudentAbsence3 = next;
        }
        DashboardStudentAbsence o2 = dashboardStudentAbsence3;
        if (dashboardStudentAbsence3 == null) {
            o2 = c.o();
        }
        j.q((Object)o2);
        return j2.a;
    }
    
    private final Object q(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0049: {
            if (d instanceof c$c) {
                final kotlin.coroutines.jvm.internal.d d2 = (c$c)d;
                final int k = d2.K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    d2.K = k + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0049;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                Object H;
                /* synthetic */ Object I;
                int K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object i) {
                    this.I = i;
                    this.K |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.absence.student.c.this.q(this);
                }
            };
        }
        Object o = d3.I;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.K;
        final DashboardStudentAbsence dashboardStudentAbsence = null;
        final DashboardStudentAbsence dashboardStudentAbsence2 = null;
        c c;
        k0 k3;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final k0 k2 = (k0)d3.H;
            c = (c)d3.G;
            c1.n(o);
            k3 = k2;
        }
        else {
            c1.n(o);
            final k0<List<DashboardStudentAbsence>> h2 = this.h;
            final m0 c2 = i1.c();
            final p<r0, d<? super List<? extends DashboardStudentAbsence>>, Object> p = new p<r0, d<? super List<? extends DashboardStudentAbsence>>, Object>() {
                boolean G;
                int H;
                final /* synthetic */ c I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>() {
                        boolean G;
                        int H;
                        final /* synthetic */ c I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) {
                    return ((c$d)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object g) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int h2 = this.H;
                    boolean g2;
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g2 = this.G;
                        c1.n(g);
                    }
                    else {
                        c1.n(g);
                        final g j = com.untis.mobile.dashboard.ui.option.absence.student.c.j(this.I);
                        final Profile i = com.untis.mobile.dashboard.ui.option.absence.student.c.i(this.I);
                        if (i == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        final org.joda.time.t l = com.untis.mobile.utils.settings.c.l(j, i.getId(), this.I.w());
                        final org.joda.time.t k = com.untis.mobile.utils.settings.c.j(com.untis.mobile.dashboard.ui.option.absence.student.c.j(this.I), this.I.w());
                        g2 = this.I.x();
                        final com.untis.mobile.dashboard.service.a h3 = com.untis.mobile.dashboard.ui.option.absence.student.c.h(this.I);
                        if (h3 == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        this.G = g2;
                        this.H = 1;
                        g = h3.g(l, k, this);
                        if (g == h) {
                            return h;
                        }
                    }
                    final Iterable iterable = (Iterable)g;
                    final c m = this.I;
                    final ArrayList<DashboardStudentAbsence> list = new ArrayList<DashboardStudentAbsence>();
                    for (final DashboardStudentAbsence next : iterable) {
                        if (kotlin.coroutines.jvm.internal.b.a(m.S(g2, next))) {
                            list.add(next);
                        }
                    }
                    return list;
                }
            };
            d3.G = this;
            d3.H = h2;
            d3.K = 1;
            o = kotlinx.coroutines.h.i((kotlin.coroutines.g)c2, (p)p, (d)d3);
            if (o == h) {
                return h;
            }
            k3 = h2;
            c = this;
        }
        k3.q(o);
        final k0<DashboardStudentAbsence> j = c.i;
        final List list = (List)((LiveData)c.h).f();
        DashboardStudentAbsence dashboardStudentAbsence3;
        if (list == null) {
            dashboardStudentAbsence3 = dashboardStudentAbsence;
        }
        else {
            final Iterator<DashboardStudentAbsence> iterator = list.iterator();
            DashboardStudentAbsence next;
            do {
                next = dashboardStudentAbsence2;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (!kotlin.coroutines.jvm.internal.b.a(next.getId() == c.j));
            dashboardStudentAbsence3 = next;
        }
        DashboardStudentAbsence o2 = dashboardStudentAbsence3;
        if (dashboardStudentAbsence3 == null) {
            o2 = c.o();
        }
        j.q((Object)o2);
        return j2.a;
    }
    
    @e
    public final LiveData<DashboardStudentAbsence> A() {
        return (LiveData<DashboardStudentAbsence>)this.i;
    }
    
    @e
    public final String B() {
        return this.z().j(this.a);
    }
    
    @e
    public final EntityType C() {
        final Profile e = this.e;
        if (e != null) {
            return e.getEntityType();
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final boolean E() {
        final com.untis.mobile.dashboard.ui.option.a l = com.untis.mobile.dashboard.ui.option.a.L;
        final Profile e = this.e;
        if (e != null) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(this.a);
            kotlin.jvm.internal.k0.o(a, "appSettings(context)");
            return com.untis.mobile.dashboard.ui.option.d.c(l, e, a);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final boolean F() {
        return this.d;
    }
    
    public final boolean G() {
        final Profile e = this.e;
        if (e != null) {
            final boolean parentRole = e.getEntityType().isParentRole();
            boolean b = true;
            if (!parentRole) {
                final Profile e2 = this.e;
                if (e2 == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                if (e2.getEntityType().isStudentRole()) {
                    final Profile e3 = this.e;
                    if (e3 == null) {
                        kotlin.jvm.internal.k0.S("profile");
                        throw null;
                    }
                    if (e3.getUserChildren().size() == 1) {
                        b = b;
                        return b;
                    }
                }
                b = false;
            }
            return b;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final k2 H(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
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
                return ((c$i)this.create(r0, d)).invokeSuspend(j2.a);
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
                    if (com.untis.mobile.utils.extension.h.g(com.untis.mobile.dashboard.ui.option.absence.student.c.g(this.H))) {
                        final c h2 = this.H;
                        this.G = 1;
                        if (h2.q(this) == h) {
                            return h;
                        }
                    }
                    else {
                        final c h3 = this.H;
                        this.G = 2;
                        if (h3.p(this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 I(final long n) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object next) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(next);
                    com.untis.mobile.dashboard.ui.option.absence.student.c.m(this.H, this.I);
                    final k0 k = com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H);
                    final List list = (List)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.l(this.H)).f();
                    DashboardStudentAbsence dashboardStudentAbsence = null;
                    final Object o = null;
                    if (list != null) {
                        final c h = this.H;
                        final Iterator<Object> iterator = list.iterator();
                        do {
                            next = o;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            next = iterator.next();
                        } while (!kotlin.coroutines.jvm.internal.b.a(((DashboardStudentAbsence)next).getId() == com.untis.mobile.dashboard.ui.option.absence.student.c.e(h)));
                        dashboardStudentAbsence = (DashboardStudentAbsence)next;
                    }
                    DashboardStudentAbsence b = dashboardStudentAbsence;
                    if (dashboardStudentAbsence == null) {
                        b = com.untis.mobile.dashboard.ui.option.absence.student.c.this.o();
                    }
                    k.q((Object)b);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    public final void J(@e final com.untis.mobile.services.masterdata.a g) {
        kotlin.jvm.internal.k0.p(g, "<set-?>");
        this.g = g;
    }
    
    public final void K() {
        final Profile n = j0.G.n();
        if (n == null) {
            throw new IllegalStateException("no profile");
        }
        this.e = n;
        final Context a = this.a;
        final Profile e = this.e;
        if (e == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.f = new com.untis.mobile.dashboard.service.b(a, e.getUniqueId());
        final com.untis.mobile.services.masterdata.b.a z = com.untis.mobile.services.masterdata.b.Z;
        final Profile e2 = this.e;
        if (e2 != null) {
            this.J(z.a(e2.getUniqueId()));
            this.d = true;
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void L(final boolean b) {
        final g b2 = this.b;
        final Profile e = this.e;
        if (e != null) {
            com.untis.mobile.utils.settings.c.r(b2, b, e.getId());
            kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
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
                    return ((c$k)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final c h2 = this.H;
                        this.G = 1;
                        if (h2.p(this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final k2 M(@e final Child child) {
        kotlin.jvm.internal.k0.p(child, "child");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ Child I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ Child I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                if (dashboardStudentAbsence == null) {
                    return j2.a;
                }
                dashboardStudentAbsence.setStudentId(this.I.getId());
                com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H).q((Object)dashboardStudentAbsence);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 N(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final com.untis.mobile.ui.adapters.infocenter.a a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "dateRange");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ com.untis.mobile.ui.adapters.infocenter.a I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ com.untis.mobile.ui.adapters.infocenter.a I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final g j = com.untis.mobile.dashboard.ui.option.absence.student.c.j(this.H);
                final com.untis.mobile.ui.adapters.infocenter.a i = this.I;
                final Profile k = com.untis.mobile.dashboard.ui.option.absence.student.c.i(this.H);
                if (k != null) {
                    com.untis.mobile.utils.settings.c.q(j, i, k.getId());
                    kotlinx.coroutines.h.f(x0.a((w0)this.H), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
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
                            return ((c$m$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                if (!com.untis.mobile.utils.extension.h.g(com.untis.mobile.dashboard.ui.option.absence.student.c.g(this.H))) {
                                    throw new ConnectException();
                                }
                                final c h2 = this.H;
                                this.G = 1;
                                if (h2.q(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 3, (Object)null);
                    return j2.a;
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 O(@e final org.joda.time.c c) {
        kotlin.jvm.internal.k0.p(c, "end");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ c I;
            final /* synthetic */ org.joda.time.c J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ c I = this.I;
                    final /* synthetic */ org.joda.time.c J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k0 k0;
                Object i;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0 = (k0)this.G;
                    c1.n(o);
                    i = o;
                }
                else {
                    c1.n(o);
                    final k0 j = com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.I);
                    final m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object> p = new p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>() {
                        int G;
                        final /* synthetic */ c H;
                        final /* synthetic */ org.joda.time.c I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>() {
                                int G;
                                final /* synthetic */ c H = this.H;
                                final /* synthetic */ org.joda.time.c I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardStudentAbsence> d) {
                            return ((c$n$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                            final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                            if (dashboardStudentAbsence == null) {
                                return null;
                            }
                            dashboardStudentAbsence.setEnd(this.I);
                            if (((org.joda.time.base.c)dashboardStudentAbsence.getStart()).R((l0)this.I)) {
                                final org.joda.time.c t0 = this.I.t0(1);
                                kotlin.jvm.internal.k0.o(t0, "end.minusHours(1)");
                                dashboardStudentAbsence.setStart(t0);
                            }
                            return dashboardStudentAbsence;
                        }
                    };
                    this.G = j;
                    this.H = 1;
                    i = kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (kotlin.coroutines.d)this);
                    if (i == h) {
                        return h;
                    }
                    k0 = j;
                }
                k0.q(i);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 P(@e final org.joda.time.c c) {
        kotlin.jvm.internal.k0.p(c, "start");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ c I;
            final /* synthetic */ org.joda.time.c J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ c I = this.I;
                    final /* synthetic */ org.joda.time.c J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k0 k0;
                Object i;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0 = (k0)this.G;
                    c1.n(o);
                    i = o;
                }
                else {
                    c1.n(o);
                    final k0 j = com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.I);
                    final m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object> p = new p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>() {
                        int G;
                        final /* synthetic */ c H;
                        final /* synthetic */ org.joda.time.c I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>() {
                                int G;
                                final /* synthetic */ c H = this.H;
                                final /* synthetic */ org.joda.time.c I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardStudentAbsence> d) {
                            return ((c$o$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                            final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                            if (dashboardStudentAbsence == null) {
                                return null;
                            }
                            dashboardStudentAbsence.setStart(this.I);
                            if (((org.joda.time.base.c)dashboardStudentAbsence.getEnd()).C((l0)this.I)) {
                                final org.joda.time.c t0 = this.I.T0(1);
                                kotlin.jvm.internal.k0.o(t0, "start.plusHours(1)");
                                dashboardStudentAbsence.setEnd(t0);
                            }
                            return dashboardStudentAbsence;
                        }
                    };
                    this.G = j;
                    this.H = 1;
                    i = kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (kotlin.coroutines.d)this);
                    if (i == h) {
                        return h;
                    }
                    k0 = j;
                }
                k0.q(i);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 Q(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "note");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ String I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ String I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                    if (dashboardStudentAbsence != null) {
                        dashboardStudentAbsence.setText(this.I);
                    }
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 R(@e final AbsenceReason absenceReason) {
        kotlin.jvm.internal.k0.p(absenceReason, "reason");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ AbsenceReason I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ AbsenceReason I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$q)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                if (dashboardStudentAbsence == null) {
                    return j2.a;
                }
                dashboardStudentAbsence.setReasonId(this.I.getId());
                dashboardStudentAbsence.setReasonTitle(this.I.getDisplayName());
                com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H).q((Object)dashboardStudentAbsence);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 T(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final n6.a<j2> a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "onSuccess");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ n6.a<j2> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ n6.a<j2> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$r)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object e) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                final int n = 1;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(e);
                }
                else {
                    c1.n(e);
                    final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H)).f();
                    if (dashboardStudentAbsence == null) {
                        return j2.a;
                    }
                    final com.untis.mobile.dashboard.service.a h2 = com.untis.mobile.dashboard.ui.option.absence.student.c.h(this.H);
                    if (h2 == null) {
                        kotlin.jvm.internal.k0.S("dashboardService");
                        throw null;
                    }
                    this.G = 1;
                    if ((e = h2.e(dashboardStudentAbsence, this)) == h) {
                        return h;
                    }
                }
                final m m = (m)e;
                final DashboardStudentAbsence a = m.a();
                final List<y3.a> b = m.b();
                if (b == null || b.isEmpty()) {
                    com.untis.mobile.dashboard.ui.option.absence.student.c.k(this.H).q((Object)m.a());
                    if (a != null) {
                        List<Object> e2;
                        if ((e2 = (List<Object>)((LiveData)com.untis.mobile.dashboard.ui.option.absence.student.c.l(this.H)).f()) == null) {
                            e2 = v.E();
                        }
                        final k0 l = com.untis.mobile.dashboard.ui.option.absence.student.c.l(this.H);
                        int n2 = 0;
                        Label_0288: {
                            if (!(e2 instanceof Collection) || !e2.isEmpty()) {
                                final Iterator<DashboardStudentAbsence> iterator = e2.iterator();
                                while (iterator.hasNext()) {
                                    if (kotlin.coroutines.jvm.internal.b.a(iterator.next().getId() == a.getId())) {
                                        n2 = n;
                                        break Label_0288;
                                    }
                                }
                            }
                            n2 = 0;
                        }
                        List<DashboardStudentAbsence> list;
                        if (n2 != 0) {
                            list = com.untis.mobile.utils.extension.c.c((List<? extends DashboardStudentAbsence>)e2, a, new l<DashboardStudentAbsence, Boolean>() {
                                public final boolean a(@org.jetbrains.annotations.e final DashboardStudentAbsence dashboardStudentAbsence) {
                                    kotlin.jvm.internal.k0.p(dashboardStudentAbsence, "a");
                                    return dashboardStudentAbsence.getId() == a.getId();
                                }
                            });
                        }
                        else {
                            list = v.r4((Collection<? extends DashboardStudentAbsence>)e2, a);
                        }
                        l.q((Object)list);
                    }
                    this.I.invoke();
                    return j2.a;
                }
                throw x3.n.a(m);
            }
        }, 2, (Object)null);
    }
    
    public final boolean U() {
        final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)this.i).f();
        long studentId;
        if (dashboardStudentAbsence == null) {
            studentId = 0L;
        }
        else {
            studentId = dashboardStudentAbsence.getStudentId();
        }
        return studentId > 0L;
    }
    
    public final boolean a() {
        final Profile e = this.e;
        if (e != null) {
            return e.hasAnyRight(Right.WRITE_OWN_ABSENCE_REASON);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object r(@e final d<? super List<AbsenceReason>> d) {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super List<? extends AbsenceReason>>, Object>() {
            int G;
            final /* synthetic */ c H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends AbsenceReason>>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<AbsenceReason>> d) {
                return ((c$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    return this.H.w().d(true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    public final Object s(long studentId, long h, @e final d<? super Student> d) {
        kotlin.coroutines.jvm.internal.d d2 = null;
        Label_0057: {
            if (d instanceof c$f) {
                d2 = (c$f)d;
                final int k = d2.K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    d2.K = k + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            d2 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                long H;
                /* synthetic */ Object I;
                final /* synthetic */ c J;
                int K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object i) {
                    this.I = i;
                    this.K |= Integer.MIN_VALUE;
                    return this.J.s(0L, 0L, this);
                }
            };
        }
        Object o = d2.I;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d2.K;
        c c = null;
        Student d3 = null;
        Label_0279: {
            c g = null;
            Label_0248: {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            g = (c)d2.G;
                            c1.n(o);
                            break Label_0248;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        h = d2.H;
                        g = (c)d2.G;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    d2.G = this;
                    d2.H = h;
                    d2.K = 1;
                    o = this.y(studentId, d2);
                    if (o == h2) {
                        return h2;
                    }
                    g = this;
                }
                final Student student = (Student)o;
                c = g;
                d3 = student;
                if (student != null) {
                    break Label_0279;
                }
                d2.G = g;
                d2.K = 2;
                if ((o = g.y(h, d2)) == h2) {
                    return h2;
                }
            }
            final Student student2 = (Student)o;
            c = g;
            if ((d3 = student2) == null) {
                d3 = g.D();
                c = g;
            }
        }
        final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)((LiveData)c.i).f();
        if (dashboardStudentAbsence != null) {
            Long g2;
            if (d3 == null) {
                g2 = null;
            }
            else {
                g2 = kotlin.coroutines.jvm.internal.b.g(d3.getId());
            }
            studentId = -1L;
            if (g2 == null) {
                final DashboardStudentAbsence dashboardStudentAbsence2 = (DashboardStudentAbsence)((LiveData)c.i).f();
                if (dashboardStudentAbsence2 != null) {
                    final Long g3 = kotlin.coroutines.jvm.internal.b.g(dashboardStudentAbsence2.getStudentId());
                    if (g3 != null) {
                        studentId = g3;
                    }
                }
            }
            else {
                studentId = g2;
            }
            dashboardStudentAbsence.setStudentId(studentId);
        }
        return d3;
    }
    
    @e
    public final List<Child> t() {
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<Child>();
        list.add(null);
        final Profile e = this.e;
        if (e != null) {
            list.addAll(e.getUserChildren());
            return (List<Child>)list;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object u(@e final d<? super ClassbookSettings> d) {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super ClassbookSettings>, Object>() {
            int G;
            final /* synthetic */ c H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super ClassbookSettings>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super ClassbookSettings> d) {
                return ((c$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final com.untis.mobile.persistence.dao.classbook.c f = com.untis.mobile.dashboard.ui.option.absence.student.c.f(this.H);
                final Profile i = com.untis.mobile.dashboard.ui.option.absence.student.c.i(this.H);
                if (i != null) {
                    return f.b(i.getUniqueId());
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
        }, (d)d);
    }
    
    @e
    public final LiveData<List<DashboardStudentAbsence>> v() {
        return (LiveData<List<DashboardStudentAbsence>>)this.h;
    }
    
    @e
    public final com.untis.mobile.services.masterdata.a w() {
        final com.untis.mobile.services.masterdata.a g = this.g;
        if (g != null) {
            return g;
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    public final boolean x() {
        final g b = this.b;
        final Profile e = this.e;
        if (e != null) {
            return com.untis.mobile.utils.settings.c.k(b, e.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object y(final long n, @e final d<? super Student> d) {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super Student>, Object>() {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Student>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Student> d) {
                return ((c$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    return this.H.w().V(this.I);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @e
    public final com.untis.mobile.ui.adapters.infocenter.a z() {
        final g b = this.b;
        final Profile e = this.e;
        if (e != null) {
            return com.untis.mobile.utils.settings.c.i(b, e.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
}
