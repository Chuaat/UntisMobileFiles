// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.add;

import org.joda.time.l0;
import rx.functions.p;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import com.untis.mobile.utils.extension.h;
import android.content.Context;
import org.joda.time.c;
import org.joda.time.n0;
import com.untis.mobile.utils.d0;
import rx.g;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import kotlin.jvm.internal.k0;
import com.untis.wu.rest.model.TeacherAbsenceReasonRefDto;
import java.util.List;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import org.joda.time.t;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.api.k;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u00105\u001a\u000203¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fJ\u000e\u0010$\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%J\u000e\u0010(\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0003\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010:¨\u0006=" }, d2 = { "Lcom/untis/mobile/substitutionplanning/add/u0;", "Landroidx/lifecycle/w0;", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "dto", "q", "", "profileId", "Lorg/joda/time/t;", "date", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "Lkotlin/j2;", "m", "Lrx/g;", "o", "Lretrofit2/t;", "Ljava/lang/Void;", "b", "Lorg/joda/time/c;", "j", "f", "i", "k", "e", "g", "Landroid/content/Context;", "context", "d", "h", "", "id", "displayName", "r", "", "Lcom/untis/wu/rest/model/TeacherAbsenceReasonRefDto;", "l", "s", "v", "Lorg/joda/time/v;", "time", "w", "t", "u", "", "c", "n", "Lorg/joda/time/t;", "Ljava/util/List;", "reasons", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/profile/legacy/a;", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/substitutionplanning/api/k;", "a", "Lcom/untis/mobile/substitutionplanning/api/k;", "api", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "<init>", "(Lcom/untis/mobile/substitutionplanning/api/k;Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class u0 extends w0
{
    @e
    private final k a;
    @e
    private final a b;
    private Profile c;
    private t d;
    private TeacherAbsenceDto e;
    private List<? extends TeacherAbsenceReasonRefDto> f;
    
    public u0(@e final k a, @e final a b) {
        k0.p(a, "api");
        k0.p(b, "profileService");
        this.a = a;
        this.b = b;
    }
    
    private static final TeacherAbsenceViewDto p(final u0 u0, final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        k0.p(u0, "this$0");
        k0.o(teacherAbsenceViewDto, "it");
        return u0.q(teacherAbsenceViewDto);
    }
    
    private final TeacherAbsenceViewDto q(final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        final List<TeacherAbsenceReasonRefDto> reasons = teacherAbsenceViewDto.getReasons();
        Object l5;
        if (reasons == null) {
            l5 = null;
        }
        else {
            l5 = v.L5((Collection<?>)reasons);
        }
        List<? extends TeacherAbsenceReasonRefDto> f = (List<? extends TeacherAbsenceReasonRefDto>)l5;
        if (l5 == null) {
            f = new ArrayList<TeacherAbsenceReasonRefDto>();
        }
        this.f = f;
        return teacherAbsenceViewDto;
    }
    
    @e
    public final g<retrofit2.t<Void>> b() {
        final k a = this.a;
        final Profile c = this.c;
        if (c == null) {
            k0.S("profile");
            throw null;
        }
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final g q3 = k.r(a, c, e, false, 4, null).Q3(rx.android.schedulers.a.c());
            k0.o(q3, "api\n                .deleteTeacherAbsence(\n                        profile = profile,\n                        teacherAbsenceDto = dto)\n                .observeOn(AndroidSchedulers.mainThread())");
            return (g<retrofit2.t<Void>>)q3;
        }
        k0.S("dto");
        throw null;
    }
    
    public final boolean c() {
        final TeacherAbsenceDto e = this.e;
        Object h1 = null;
        if (e != null) {
            final String startDateTime = e.getStartDateTime();
            if (startDateTime != null) {
                final c j = d0.j(startDateTime);
                if (j != null) {
                    h1 = j.h1();
                }
            }
            final t g = com.untis.mobile.utils.v.a.g();
            return h1 == null || !((org.joda.time.base.e)h1).o((n0)g);
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String d(@e final Context context) {
        k0.p(context, "context");
        final List<? extends TeacherAbsenceReasonRefDto> f = this.f;
        final String s = null;
        if (f != null) {
            while (true) {
                for (final TeacherAbsenceReasonRefDto next : f) {
                    final Long id = next.getId();
                    final TeacherAbsenceDto e = this.e;
                    if (e == null) {
                        k0.S("dto");
                        throw null;
                    }
                    if (k0.g(id, e.getReasonId())) {
                        final TeacherAbsenceReasonRefDto teacherAbsenceReasonRefDto = next;
                        String displayName;
                        if (teacherAbsenceReasonRefDto == null) {
                            displayName = s;
                        }
                        else {
                            displayName = teacherAbsenceReasonRefDto.getDisplayName();
                        }
                        String v = displayName;
                        if (displayName == null) {
                            v = h.V(2131886842, context);
                        }
                        return v;
                    }
                }
                TeacherAbsenceReasonRefDto next = null;
                continue;
            }
        }
        k0.S("reasons");
        throw null;
    }
    
    @e
    public final String e() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String endDateTime = e.getEndDateTime();
            k0.o(endDateTime, "dto.endDateTime");
            final c j = d0.j(endDateTime);
            String s = "n/a";
            if (j != null) {
                final String l = d0.l(j);
                if (l != null) {
                    s = l;
                }
            }
            return s;
        }
        k0.S("dto");
        throw null;
    }
    
    @f
    public final c f() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String endDateTime = e.getEndDateTime();
            k0.o(endDateTime, "dto.endDateTime");
            return d0.j(endDateTime);
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String g() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String endDateTime = e.getEndDateTime();
            k0.o(endDateTime, "dto.endDateTime");
            final c j = d0.j(endDateTime);
            String s = "n/a";
            if (j != null) {
                final String q = d0.q(j);
                if (q != null) {
                    s = q;
                }
            }
            return s;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String h(@e final Context context) {
        k0.p(context, "context");
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            String s;
            if ((s = e.getNote()) == null) {
                s = h.V(2131886749, context);
            }
            return s;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String i() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String startDateTime = e.getStartDateTime();
            k0.o(startDateTime, "dto.startDateTime");
            final c j = d0.j(startDateTime);
            String s = "n/a";
            if (j != null) {
                final String l = d0.l(j);
                if (l != null) {
                    s = l;
                }
            }
            return s;
        }
        k0.S("dto");
        throw null;
    }
    
    @f
    public final c j() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String startDateTime = e.getStartDateTime();
            k0.o(startDateTime, "dto.startDateTime");
            return d0.j(startDateTime);
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final String k() {
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final String startDateTime = e.getStartDateTime();
            k0.o(startDateTime, "dto.startDateTime");
            final c j = d0.j(startDateTime);
            String s = "n/a";
            if (j != null) {
                final String q = d0.q(j);
                if (q != null) {
                    s = q;
                }
            }
            return s;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final List<TeacherAbsenceReasonRefDto> l() {
        final List<? extends TeacherAbsenceReasonRefDto> f = this.f;
        if (f != null) {
            return (List<TeacherAbsenceReasonRefDto>)f;
        }
        k0.S("reasons");
        throw null;
    }
    
    public final void m(@e final String s, @e final t d, @e final TeacherAbsenceDto e) {
        k0.p(s, "profileId");
        k0.p(d, "date");
        k0.p(e, "dto");
        Profile c;
        if ((c = this.b.l(s)) == null) {
            c = this.b.n();
            if (c == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean n() {
        final Profile c = this.c;
        if (c != null) {
            if (c.getUserOriginalEntityType() == EntityType.TEACHER) {
                final Profile c2 = this.c;
                if (c2 == null) {
                    k0.S("profile");
                    throw null;
                }
                if (c2.getUserOriginalEntityId() > 0L) {
                    return true;
                }
            }
            return false;
        }
        k0.S("profile");
        throw null;
    }
    
    @e
    public final g<TeacherAbsenceViewDto> o() {
        final k a = this.a;
        final Profile c = this.c;
        if (c != null) {
            final g q3 = k.C(a, c, false, 2, null).k3((p)new t0(this)).Q3(rx.android.schedulers.a.c());
            k0.o(q3, "api\n                .requestTeacherAbsenceForm(profile = profile)\n                .map { saveFormDto(it) }\n                .observeOn(AndroidSchedulers.mainThread())");
            return (g<TeacherAbsenceViewDto>)q3;
        }
        k0.S("profile");
        throw null;
    }
    
    public final void r(final long l, @e final String reasonText) {
        k0.p(reasonText, "displayName");
        final TeacherAbsenceDto e = this.e;
        if (e == null) {
            k0.S("dto");
            throw null;
        }
        e.setReasonId(l);
        final TeacherAbsenceDto e2 = this.e;
        if (e2 != null) {
            e2.setReasonText(reasonText);
            return;
        }
        k0.S("dto");
        throw null;
    }
    
    @e
    public final g<retrofit2.t<Void>> s() {
        final k a = this.a;
        final Profile c = this.c;
        if (c == null) {
            k0.S("profile");
            throw null;
        }
        final TeacherAbsenceDto e = this.e;
        if (e != null) {
            final g q3 = k.J(a, c, e, false, 4, null).Q3(rx.android.schedulers.a.c());
            k0.o(q3, "api\n                .updateTeacherAbsence(profile, dto)\n                .observeOn(AndroidSchedulers.mainThread())");
            return (g<retrofit2.t<Void>>)q3;
        }
        k0.S("dto");
        throw null;
    }
    
    public final void t(@e final t t) {
        k0.p(t, "date");
        final TeacherAbsenceDto e = this.e;
        if (e == null) {
            k0.S("dto");
            throw null;
        }
        final String endDateTime = e.getEndDateTime();
        k0.o(endDateTime, "dto.endDateTime");
        final c j = d0.j(endDateTime);
        if (j == null) {
            return;
        }
        if (((org.joda.time.base.e)t).p((n0)j.h1())) {
            return;
        }
        final c w1 = j.w1(t);
        final TeacherAbsenceDto e2 = this.e;
        if (e2 == null) {
            k0.S("dto");
            throw null;
        }
        k0.o(w1, "newEndDateTime");
        e2.setEndDateTime(d0.t(w1));
        final TeacherAbsenceDto e3 = this.e;
        if (e3 == null) {
            k0.S("dto");
            throw null;
        }
        final String startDateTime = e3.getStartDateTime();
        k0.o(startDateTime, "dto.startDateTime");
        final c i = d0.j(startDateTime);
        if (i == null) {
            return;
        }
        if (((org.joda.time.base.c)w1).C((l0)i) || ((org.joda.time.base.c)w1).X4((l0)i)) {
            final TeacherAbsenceDto e4 = this.e;
            if (e4 == null) {
                k0.S("dto");
                throw null;
            }
            final c z1 = w1.Z1(i.j1());
            k0.o(z1, "newEndDateTime.withTime(startDateTime.toLocalTime())");
            e4.setStartDateTime(d0.t(z1));
        }
    }
    
    public final void u(@e final org.joda.time.v v) {
        k0.p(v, "time");
        final TeacherAbsenceDto e = this.e;
        if (e == null) {
            k0.S("dto");
            throw null;
        }
        final String endDateTime = e.getEndDateTime();
        k0.o(endDateTime, "dto.endDateTime");
        final c j = d0.j(endDateTime);
        if (j == null) {
            return;
        }
        if (((org.joda.time.base.e)v).p((n0)j.j1())) {
            return;
        }
        final c z1 = j.Z1(v);
        final TeacherAbsenceDto e2 = this.e;
        if (e2 == null) {
            k0.S("dto");
            throw null;
        }
        k0.o(z1, "newEndDateTime");
        e2.setEndDateTime(d0.t(z1));
        final TeacherAbsenceDto e3 = this.e;
        if (e3 == null) {
            k0.S("dto");
            throw null;
        }
        final String startDateTime = e3.getStartDateTime();
        k0.o(startDateTime, "dto.startDateTime");
        final c i = d0.j(startDateTime);
        if (i == null) {
            return;
        }
        if (((org.joda.time.base.c)z1).C((l0)i) || ((org.joda.time.base.c)z1).X4((l0)i)) {
            final TeacherAbsenceDto e4 = this.e;
            if (e4 == null) {
                k0.S("dto");
                throw null;
            }
            final c t0 = z1.t0(1);
            k0.o(t0, "newEndDateTime.minusHours(1)");
            e4.setStartDateTime(d0.t(t0));
        }
    }
    
    public final void v(@e final t t) {
        k0.p(t, "date");
        final TeacherAbsenceDto e = this.e;
        if (e == null) {
            k0.S("dto");
            throw null;
        }
        final String startDateTime = e.getStartDateTime();
        k0.o(startDateTime, "dto.startDateTime");
        final c j = d0.j(startDateTime);
        if (j == null) {
            return;
        }
        t t2;
        if ((t2 = j.h1()) == null) {
            t2 = com.untis.mobile.utils.v.a.g();
        }
        if (((org.joda.time.base.e)t).p((n0)t2)) {
            return;
        }
        final c w1 = j.w1(t);
        final TeacherAbsenceDto e2 = this.e;
        if (e2 == null) {
            k0.S("dto");
            throw null;
        }
        k0.o(w1, "newStartDateTime");
        e2.setStartDateTime(d0.t(w1));
        final TeacherAbsenceDto e3 = this.e;
        if (e3 == null) {
            k0.S("dto");
            throw null;
        }
        final String endDateTime = e3.getEndDateTime();
        k0.o(endDateTime, "dto.endDateTime");
        final c i = d0.j(endDateTime);
        if (i == null) {
            return;
        }
        if (((org.joda.time.base.c)w1).R((l0)i) || ((org.joda.time.base.c)w1).X4((l0)i)) {
            final TeacherAbsenceDto e4 = this.e;
            if (e4 == null) {
                k0.S("dto");
                throw null;
            }
            final c z1 = w1.Z1(i.j1());
            k0.o(z1, "newStartDateTime.withTime(endDateTime.toLocalTime())");
            e4.setEndDateTime(d0.t(z1));
        }
    }
    
    public final void w(@e final org.joda.time.v v) {
        k0.p(v, "time");
        final TeacherAbsenceDto e = this.e;
        if (e == null) {
            k0.S("dto");
            throw null;
        }
        final String startDateTime = e.getStartDateTime();
        k0.o(startDateTime, "dto.startDateTime");
        final c j = d0.j(startDateTime);
        if (j == null) {
            return;
        }
        if (((org.joda.time.base.e)v).p((n0)j.j1())) {
            return;
        }
        final c z1 = j.Z1(v);
        final TeacherAbsenceDto e2 = this.e;
        if (e2 == null) {
            k0.S("dto");
            throw null;
        }
        k0.o(z1, "newStartDateTime");
        e2.setStartDateTime(d0.t(z1));
        final TeacherAbsenceDto e3 = this.e;
        if (e3 == null) {
            k0.S("dto");
            throw null;
        }
        final String endDateTime = e3.getEndDateTime();
        k0.o(endDateTime, "dto.endDateTime");
        final c i = d0.j(endDateTime);
        if (i == null) {
            return;
        }
        if (((org.joda.time.base.c)z1).R((l0)i) || ((org.joda.time.base.c)z1).X4((l0)i)) {
            final TeacherAbsenceDto e4 = this.e;
            if (e4 == null) {
                k0.S("dto");
                throw null;
            }
            final c t0 = z1.T0(1);
            k0.o(t0, "newStartDateTime.plusHours(1)");
            e4.setEndDateTime(d0.t(t0));
        }
    }
}
