// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import rx.functions.p;
import rx.g;
import org.joda.time.l0;
import com.untis.mobile.utils.d0;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import org.joda.time.n0;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import com.untis.mobile.utils.v;
import kotlin.jvm.internal.w;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import org.joda.time.c;
import com.untis.wu.rest.model.TeacherRefDto;
import androidx.lifecycle.k0;
import org.joda.time.t;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.api.k;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010C\u001a\u00020A¢\u0006\u0004\bL\u0010MJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u0010=\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00109\u001a\u0004\b6\u0010:\"\u0004\b;\u0010<R(\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010BR*\u0010F\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010%\u001a\u0004\b1\u0010'\"\u0004\bE\u0010)R(\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\"\u0004\bH\u0010 R*\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b/\u0010\u001e\"\u0004\bJ\u0010 ¨\u0006N" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/b;", "Landroidx/lifecycle/w0;", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "viewDto", "m", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "w", "Lrx/g;", "k", "Lkotlin/j2;", "x", "", "j", "Lorg/joda/time/t;", "date", "A", "Lorg/joda/time/v;", "time", "B", "y", "z", "v", "", "d", "J", "teacherId", "Landroidx/lifecycle/k0;", "Lorg/joda/time/c;", "g", "Landroidx/lifecycle/k0;", "()Landroidx/lifecycle/k0;", "s", "(Landroidx/lifecycle/k0;)V", "startDateTime", "", "Lcom/untis/wu/rest/model/TeacherRefDto;", "l", "Ljava/util/List;", "i", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "teachers", "Lcom/untis/mobile/substitutionplanning/api/k;", "a", "Lcom/untis/mobile/substitutionplanning/api/k;", "substitutionPlanningApiService", "e", "Lorg/joda/time/t;", "f", "h", "t", "teacher", "Lcom/untis/mobile/persistence/models/profile/Profile;", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Ljava/lang/Long;", "()Ljava/lang/Long;", "o", "(Ljava/lang/Long;)V", "id", "b", "n", "endDateTime", "Lcom/untis/mobile/services/profile/legacy/a;", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/wu/rest/model/TeacherAbsenceReasonRefDto;", "r", "reasons", "", "p", "note", "q", "reason", "<init>", "(Lcom/untis/mobile/substitutionplanning/api/k;Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends w0
{
    @e
    private final k a;
    @e
    private final a b;
    @e
    private final Profile c;
    private final long d;
    @e
    private t e;
    @e
    private k0<TeacherRefDto> f;
    @e
    private k0<c> g;
    @e
    private k0<c> h;
    @e
    private k0<TeacherAbsenceReasonRefDto> i;
    @e
    private k0<String> j;
    @f
    private Long k;
    @f
    private List<? extends TeacherRefDto> l;
    @f
    private List<? extends TeacherAbsenceReasonRefDto> m;
    
    public b(@e final k a, @e final a b) {
        kotlin.jvm.internal.k0.p(a, "substitutionPlanningApiService");
        kotlin.jvm.internal.k0.p(b, "profileService");
        this.a = a;
        this.b = b;
        Profile n;
        if ((n = b.n()) == null) {
            n = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.c = n;
        this.d = n.getEntityId();
        this.e = v.a.g();
        this.f = (k0<TeacherRefDto>)new k0();
        this.g = (k0<c>)new k0();
        this.h = (k0<c>)new k0();
        this.i = (k0<TeacherAbsenceReasonRefDto>)new k0();
        this.j = (k0<String>)new k0();
    }
    
    private static final TeacherAbsenceViewDto l(final b b, final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        kotlin.jvm.internal.k0.p(b, "this$0");
        return b.m(teacherAbsenceViewDto);
    }
    
    private final TeacherAbsenceViewDto m(final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        final c c = null;
        c f;
        if (teacherAbsenceViewDto == null) {
            f = null;
        }
        else {
            f = com.untis.mobile.substitutionplanning.common.a.f(teacherAbsenceViewDto);
        }
        c e;
        if (teacherAbsenceViewDto == null) {
            e = null;
        }
        else {
            e = com.untis.mobile.substitutionplanning.common.a.e(teacherAbsenceViewDto);
        }
        c c2 = f;
        c c3 = e;
        if (((org.joda.time.base.e)this.e).m((n0)v.a.g())) {
            c w1;
            if (f == null) {
                w1 = null;
            }
            else {
                w1 = f.w1(this.e);
            }
            c w2;
            if (e == null) {
                w2 = c;
            }
            else {
                w2 = e.w1(this.e);
            }
            c3 = w2;
            c2 = w1;
        }
        this.g.q((Object)c2);
        this.h.q((Object)c3);
        return teacherAbsenceViewDto;
    }
    
    private final TeacherAbsenceDto w() {
        final boolean j = this.j();
        Long id = null;
        long l;
        if (j) {
            l = this.d;
        }
        else {
            final TeacherRefDto teacherRefDto = (TeacherRefDto)((LiveData)this.f).f();
            Long id2;
            if (teacherRefDto == null) {
                id2 = null;
            }
            else {
                id2 = teacherRefDto.getId();
            }
            if (id2 == null) {
                return null;
            }
            l = id2;
        }
        final c c = (c)((LiveData)this.g).f();
        if (c == null) {
            return null;
        }
        final c c2 = (c)((LiveData)this.h).f();
        if (c2 == null) {
            return null;
        }
        final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto = (TeacherAbsenceReasonRefDto)((LiveData)this.i).f();
        String note;
        if ((note = (String)((LiveData)this.j).f()) == null) {
            note = "";
        }
        final TeacherAbsenceDto teacherAbsenceDto = new TeacherAbsenceDto();
        teacherAbsenceDto.setId(this.k);
        teacherAbsenceDto.setStartDateTime(d0.t(c));
        teacherAbsenceDto.setEndDateTime(d0.t(c2));
        teacherAbsenceDto.setTeacherId(l);
        if (teacherAbsenceReasonRefDto != null) {
            id = teacherAbsenceReasonRefDto.getId();
        }
        teacherAbsenceDto.setReasonId(id);
        teacherAbsenceDto.setNote(note);
        return teacherAbsenceDto;
    }
    
    public final void A(@e final t t) {
        kotlin.jvm.internal.k0.p(t, "date");
        final c c = (c)((LiveData)this.g).f();
        if (c == null) {
            return;
        }
        t t2;
        if ((t2 = c.h1()) == null) {
            t2 = v.a.g();
        }
        if (((org.joda.time.base.e)t).p((n0)t2)) {
            return;
        }
        final c w1 = c.w1(t);
        this.g.q((Object)w1);
        final c c2 = (c)((LiveData)this.h).f();
        if (c2 == null) {
            return;
        }
        if (((org.joda.time.base.c)w1).R((l0)c2) || ((org.joda.time.base.c)w1).X4((l0)c2)) {
            this.h.q((Object)w1.Z1(c2.j1()));
        }
    }
    
    public final void B(@e final org.joda.time.v v) {
        kotlin.jvm.internal.k0.p(v, "time");
        final c c = (c)((LiveData)this.g).f();
        if (c == null) {
            return;
        }
        if (((org.joda.time.base.e)v).p((n0)c.j1())) {
            return;
        }
        final c z1 = c.Z1(v);
        this.g.q((Object)z1);
        final c c2 = (c)((LiveData)this.h).f();
        if (c2 == null) {
            return;
        }
        if (((org.joda.time.base.c)z1).R((l0)c2) || ((org.joda.time.base.c)z1).X4((l0)c2)) {
            this.h.q((Object)z1.T0(1));
        }
    }
    
    @e
    public final k0<c> b() {
        return this.h;
    }
    
    @f
    public final Long c() {
        return this.k;
    }
    
    @e
    public final k0<String> d() {
        return this.j;
    }
    
    @e
    public final k0<TeacherAbsenceReasonRefDto> e() {
        return this.i;
    }
    
    @f
    public final List<TeacherAbsenceReasonRefDto> f() {
        return (List<TeacherAbsenceReasonRefDto>)this.m;
    }
    
    @e
    public final k0<c> g() {
        return this.g;
    }
    
    @e
    public final k0<TeacherRefDto> h() {
        return this.f;
    }
    
    @f
    public final List<TeacherRefDto> i() {
        return (List<TeacherRefDto>)this.l;
    }
    
    public final boolean j() {
        return this.d > 0L;
    }
    
    @f
    public final g<TeacherAbsenceViewDto> k() {
        return (g<TeacherAbsenceViewDto>)com.untis.mobile.substitutionplanning.api.k.C(this.a, this.c, false, 2, null).Q3(rx.android.schedulers.a.c()).k3((p)new com.untis.mobile.substitutionplanning.add.a(this));
    }
    
    public final void n(@e final k0<c> h) {
        kotlin.jvm.internal.k0.p(h, "<set-?>");
        this.h = h;
    }
    
    public final void o(@f final Long k) {
        this.k = k;
    }
    
    public final void p(@e final k0<String> j) {
        kotlin.jvm.internal.k0.p(j, "<set-?>");
        this.j = j;
    }
    
    public final void q(@e final k0<TeacherAbsenceReasonRefDto> i) {
        kotlin.jvm.internal.k0.p(i, "<set-?>");
        this.i = i;
    }
    
    public final void r(@f final List<? extends TeacherAbsenceReasonRefDto> m) {
        this.m = m;
    }
    
    public final void s(@e final k0<c> g) {
        kotlin.jvm.internal.k0.p(g, "<set-?>");
        this.g = g;
    }
    
    public final void t(@e final k0<TeacherRefDto> f) {
        kotlin.jvm.internal.k0.p(f, "<set-?>");
        this.f = f;
    }
    
    public final void u(@f final List<? extends TeacherRefDto> l) {
        this.l = l;
    }
    
    @f
    public final g<TeacherAbsenceDto> v() {
        final TeacherAbsenceDto w = this.w();
        if (w == null) {
            return null;
        }
        return (g<TeacherAbsenceDto>)com.untis.mobile.substitutionplanning.api.k.F(this.a, this.c, w, false, 4, null).Q3(rx.android.schedulers.a.c());
    }
    
    public final void x(@e final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        kotlin.jvm.internal.k0.p(teacherAbsenceViewDto, "viewDto");
        this.l = teacherAbsenceViewDto.getTeachers();
        this.m = teacherAbsenceViewDto.getReasons();
        final long d = this.d;
        final k0<TeacherRefDto> f = this.f;
        final List<TeacherRefDto> teachers = teacherAbsenceViewDto.getTeachers();
        Object o = null;
        final TeacherRefDto teacherRefDto = null;
        if (teachers != null) {
            final Iterator<Object> iterator = teachers.iterator();
            boolean b;
            TeacherRefDto next;
            do {
                next = teacherRefDto;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
                final Long id = next.getId();
                if (id != null) {
                    if (id == d) {
                        b = true;
                        continue;
                    }
                }
                b = false;
            } while (!b);
            o = next;
        }
        f.q(o);
    }
    
    public final void y(@e final t t) {
        kotlin.jvm.internal.k0.p(t, "date");
        final c c = (c)((LiveData)this.h).f();
        if (c == null) {
            return;
        }
        if (((org.joda.time.base.e)t).p((n0)c.h1())) {
            return;
        }
        final c w1 = c.w1(t);
        this.h.q((Object)w1);
        final c c2 = (c)((LiveData)this.g).f();
        if (c2 == null) {
            return;
        }
        if (((org.joda.time.base.c)w1).C((l0)c2) || ((org.joda.time.base.c)w1).X4((l0)c2)) {
            this.g.q((Object)w1.Z1(c2.j1()));
        }
    }
    
    public final void z(@e final org.joda.time.v v) {
        kotlin.jvm.internal.k0.p(v, "time");
        final c c = (c)((LiveData)this.h).f();
        if (c == null) {
            return;
        }
        if (((org.joda.time.base.e)v).p((n0)c.j1())) {
            return;
        }
        final c z1 = c.Z1(v);
        this.h.q((Object)z1);
        final c c2 = (c)((LiveData)this.g).f();
        if (c2 == null) {
            return;
        }
        if (((org.joda.time.base.c)z1).C((l0)c2) || ((org.joda.time.base.c)z1).X4((l0)c2)) {
            this.g.q((Object)z1.t0(1));
        }
    }
}
