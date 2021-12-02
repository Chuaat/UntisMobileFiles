// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import android.annotation.SuppressLint;
import org.joda.time.c;
import com.untis.mobile.api.common.UMMasterData;
import java.util.Comparator;
import org.joda.time.l0;
import java.util.HashSet;
import com.untis.mobile.utils.mapper.realmToModel.x;
import java.util.HashMap;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import java.util.Map;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import java.util.Collection;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.Displayable;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.timetable.period.ui.HolidayModel;
import org.joda.time.n0;
import com.untis.mobile.api.common.timetable.UMPeriodText;
import com.untis.mobile.utils.mapper.realmToModel.w;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import java.util.Iterator;
import com.untis.mobile.api.common.UMTimetable;
import com.untis.mobile.utils.mapper.realmToModel.p;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.api.common.timetable.UMPeriod;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import android.util.LongSparseArray;
import com.untis.mobile.api.dto.GetTimetableResponse;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.k0;
import android.content.Context;
import com.untis.mobile.persistence.models.DefaultColors;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.f;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u00104\u001a\u00020\u001f\u0012\b\u00102\u001a\u0004\u0018\u00010\n\u0012\b\u00101\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bE\u0010FJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002J>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J0\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u001eH\u0007J\u001a\u0010'\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$J\u001a\u0010(\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$J\u001a\u0010*\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$J\u001a\u0010+\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00100R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010A¨\u0006G" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/j;", "", "Lcom/untis/mobile/api/dto/GetTimetableResponse;", "response", "Landroid/util/LongSparseArray;", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "b", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "c", "Lorg/joda/time/t;", "date", "", "o", "Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;", "f", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "periods", "periodHomework", "periodInfos", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "g", "", "profileId", "l", "homeWork", "p", "period", "n", "m", "", "", "Lcom/untis/mobile/api/common/timetable/UMPeriod;", "blockedPeriods", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "d", "Lcom/untis/mobile/persistence/models/Displayable;", "current", "original", "i", "j", "", "k", "h", "Lcom/untis/mobile/persistence/models/DefaultColors;", "Lcom/untis/mobile/persistence/models/DefaultColors;", "colors", "e", "Lorg/joda/time/t;", "end", "start", "J", "entityId", "a", "Ljava/lang/String;", "Lcom/untis/mobile/services/timetable/placeholder/h;", "Lcom/untis/mobile/services/timetable/placeholder/h;", "colorHelper", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/t;Lorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j
{
    @e
    private final String a;
    @e
    private final EntityType b;
    private final long c;
    @f
    private final t d;
    @f
    private final t e;
    @e
    private final com.untis.mobile.services.masterdata.a f;
    @e
    private final com.untis.mobile.services.classbook.a g;
    @e
    private final h h;
    @e
    private final DefaultColors i;
    
    public j(@e final Context context, @e final String a, @e final EntityType b, final long c, @f final t d, @f final t e) {
        k0.p(context, "context");
        k0.p(a, "profileId");
        k0.p(b, "entityType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = com.untis.mobile.services.masterdata.b.Z.a(a);
        this.g = com.untis.mobile.services.classbook.k0.a0.a(a);
        this.h = new h(context, a);
        final DefaultColors g = com.untis.mobile.utils.a.a(context).g(a);
        k0.o(g, "appSettings(context).getColors(profileId)");
        this.i = g;
    }
    
    private final LongSparseArray<List<HomeWork>> b(final GetTimetableResponse getTimetableResponse) {
        final LongSparseArray longSparseArray = new LongSparseArray();
        final UMTimetable timetable = getTimetableResponse.timetable;
        if (timetable != null) {
            final List<UMPeriod> periods = timetable.periods;
            if (periods != null) {
                for (final UMPeriod umPeriod : periods) {
                    final List<UMHomeWork> homeWorks = umPeriod.homeWorks;
                    boolean b = false;
                    if (homeWorks != null) {
                        if (homeWorks.isEmpty() ^ true) {
                            b = true;
                        }
                    }
                    if (b) {
                        final long id = umPeriod.id;
                        final List<UMHomeWork> homeWorks2 = umPeriod.homeWorks;
                        k0.o(homeWorks2, "period.homeWorks");
                        final ArrayList list = new ArrayList<HomeWork>(v.Y((Iterable<?>)homeWorks2, 10));
                        for (final UMHomeWork umHomeWork : homeWorks2) {
                            final p a = p.a;
                            final long id2 = umPeriod.id;
                            k0.o(umHomeWork, "it");
                            list.add(a.a(id2, umHomeWork, this.b, this.c));
                        }
                        longSparseArray.put(id, (Object)list);
                    }
                }
            }
        }
        return (LongSparseArray<List<HomeWork>>)longSparseArray;
    }
    
    private final LongSparseArray<PeriodInfo> c(final GetTimetableResponse getTimetableResponse) {
        final LongSparseArray longSparseArray = new LongSparseArray();
        final UMTimetable timetable = getTimetableResponse.timetable;
        if (timetable != null) {
            final List<UMPeriod> periods = timetable.periods;
            if (periods != null) {
                for (final UMPeriod umPeriod : periods) {
                    final UMPeriodText text = umPeriod.text;
                    if (text != null) {
                        final long id = umPeriod.id;
                        final w a = w.a;
                        k0.o(text, "period.text");
                        longSparseArray.put(id, (Object)a.a(id, text));
                    }
                }
            }
        }
        return (LongSparseArray<PeriodInfo>)longSparseArray;
    }
    
    private static final int e(final t t, final t t2) {
        return t.b((n0)t2);
    }
    
    private final HolidayModel f(final t t) {
        final Holiday p = this.f.p(t);
        if (p == null) {
            return null;
        }
        return new HolidayModel(p.getId());
    }
    
    private final List<PeriodModel> g(final List<Period> list, final LongSparseArray<List<HomeWork>> longSparseArray, final LongSparseArray<PeriodInfo> longSparseArray2) {
        final ArrayList<PeriodModel> list2 = new ArrayList<PeriodModel>();
        if (list.isEmpty() ^ true) {
            final Iterator<Period> iterator = (Iterator<Period>)list.iterator();
            d d = null;
            while (iterator.hasNext()) {
                final Period period = iterator.next();
                if (d == null) {
                    d = new d(period);
                }
                else {
                    d.c(period);
                }
            }
            if (d == null) {
                return list2;
            }
            Object iterator2 = d.e().iterator();
            while (((Iterator)iterator2).hasNext()) {
                final com.untis.mobile.services.timetable.placeholder.e e = ((Iterator<com.untis.mobile.services.timetable.placeholder.e>)iterator2).next();
                final int c = e.c();
                final Iterator<Object> iterator3 = e.f().iterator();
                int n = 0;
                Iterator<com.untis.mobile.services.timetable.placeholder.e> iterator4 = (Iterator<com.untis.mobile.services.timetable.placeholder.e>)iterator2;
                while (true) {
                    iterator2 = iterator4;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final com.untis.mobile.services.timetable.placeholder.a next = iterator3.next();
                    if (n < 0) {
                        v.W();
                    }
                    final Iterator<Object> iterator5 = next.b().iterator();
                    while (iterator5.hasNext()) {
                        final Iterator<Object> iterator6 = iterator5.next().d().iterator();
                        final Iterator<com.untis.mobile.services.timetable.placeholder.e> iterator7 = iterator4;
                        while (iterator6.hasNext()) {
                            final Period period2 = iterator6.next();
                            final boolean n2 = this.n(period2);
                            final boolean m = this.m(period2);
                            final int b = com.untis.mobile.services.timetable.placeholder.h.b(this.h, period2, false, n2, m, 2, null);
                            final int d2 = com.untis.mobile.services.timetable.placeholder.h.d(this.h, period2, false, n2, m, 2, null);
                            final h h = this.h;
                            final PeriodElement subject = period2.getSubject();
                            long currentId;
                            if (subject == null) {
                                currentId = 0L;
                            }
                            else {
                                currentId = subject.getCurrentId();
                            }
                            final int g = h.g(currentId);
                            final h h2 = this.h;
                            final PeriodElement subject2 = period2.getSubject();
                            long currentId2;
                            if (subject2 == null) {
                                currentId2 = 0L;
                            }
                            else {
                                currentId2 = subject2.getCurrentId();
                            }
                            final int j = h2.j(currentId2);
                            final h h3 = this.h;
                            final PeriodElement subject3 = period2.getSubject();
                            long currentId3;
                            if (subject3 == null) {
                                currentId3 = 0L;
                            }
                            else {
                                currentId3 = subject3.getCurrentId();
                            }
                            final int f = h3.f(currentId3);
                            final h h4 = this.h;
                            final PeriodElement subject4 = period2.getSubject();
                            long currentId4;
                            if (subject4 == null) {
                                currentId4 = 0L;
                            }
                            else {
                                currentId4 = subject4.getCurrentId();
                            }
                            final int i = h4.i(currentId4);
                            final ArrayList<PeriodElementModel> list3 = new ArrayList<PeriodElementModel>();
                            if (period2.getSubject() != null) {
                                final com.untis.mobile.services.masterdata.a f2 = this.f;
                                final PeriodElement subject5 = period2.getSubject();
                                k0.m(subject5);
                                final Subject u = f2.U(subject5.getCurrentId());
                                final com.untis.mobile.services.masterdata.a f3 = this.f;
                                final PeriodElement subject6 = period2.getSubject();
                                k0.m(subject6);
                                final Subject u2 = f3.U(subject6.getOriginalId());
                                final EntityType subject7 = EntityType.SUBJECT;
                                long id;
                                if (u == null) {
                                    id = 0L;
                                }
                                else {
                                    id = u.getId();
                                }
                                long id2;
                                if (u2 == null) {
                                    id2 = 0L;
                                }
                                else {
                                    id2 = u2.getId();
                                }
                                list3.add(new PeriodElementModel(subject7, id, id2, this.i(u, u2), this.j(u, u2), this.k(u, u2), this.h(u, u2)));
                            }
                            for (final PeriodElement periodElement : period2.getTeachers()) {
                                final Teacher k = this.f.k(periodElement.getCurrentId());
                                final Teacher l = this.f.k(periodElement.getOriginalId());
                                list3.add(new PeriodElementModel(EntityType.TEACHER, periodElement.getCurrentId(), periodElement.getOriginalId(), this.i(k, l), this.j(k, l), this.k(k, l), this.h(k, l)));
                            }
                            for (final PeriodElement periodElement2 : period2.getKlassen()) {
                                final Klasse n3 = this.f.N(periodElement2.getCurrentId());
                                final Klasse n4 = this.f.N(periodElement2.getOriginalId());
                                list3.add(new PeriodElementModel(EntityType.CLASS, periodElement2.getCurrentId(), periodElement2.getOriginalId(), this.i(n3, n4), this.j(n3, n4), this.k(n3, n4), this.h(n3, n4)));
                            }
                            for (final PeriodElement periodElement3 : period2.getRooms()) {
                                final Room p3 = this.f.P(periodElement3.getCurrentId());
                                final Room p4 = this.f.P(periodElement3.getOriginalId());
                                final EntityType room = EntityType.ROOM;
                                long id3;
                                if (p3 == null) {
                                    id3 = 0L;
                                }
                                else {
                                    id3 = p3.getId();
                                }
                                long id4;
                                if (p4 == null) {
                                    id4 = 0L;
                                }
                                else {
                                    id4 = p4.getId();
                                }
                                list3.add(new PeriodElementModel(room, id3, id4, this.i(p3, p4), this.j(p3, p4), this.k(p3, p4), this.h(p3, p4)));
                            }
                            final Classbook s = this.g.S(period2.getId());
                            Collection<? extends HomeWork> collection = null;
                            Label_1115: {
                                if (s != null) {
                                    final Set<HomeWork> homeWorks = s.getHomeWorks();
                                    if (homeWorks != null) {
                                        final ArrayList<HomeWork> list4 = new ArrayList<HomeWork>();
                                        final Iterator<Object> iterator11 = homeWorks.iterator();
                                        while (true) {
                                            collection = list4;
                                            if (!iterator11.hasNext()) {
                                                break Label_1115;
                                            }
                                            final HomeWork next2 = iterator11.next();
                                            if (!next2.getLocal()) {
                                                continue;
                                            }
                                            list4.add(next2);
                                        }
                                    }
                                }
                                collection = null;
                            }
                            Object e2;
                            if ((e2 = collection) == null) {
                                e2 = v.E();
                            }
                            List<Object> e3;
                            if ((e3 = (List<Object>)longSparseArray.get(period2.getId())) == null) {
                                e3 = v.E();
                            }
                            final List<Object> q4 = v.q4((Collection<?>)e2, (Iterable<?>)e3);
                            PeriodInfo periodInfo;
                            if ((periodInfo = (PeriodInfo)longSparseArray2.get(period2.getId())) == null) {
                                periodInfo = new PeriodInfo(0L, null, null, null, null, false, null, 127, null);
                            }
                            final PeriodInfo d3 = this.g.d(period2.getId());
                            final String s2 = "";
                            String local;
                            if (d3 == null || (local = d3.getLocal()) == null) {
                                local = "";
                            }
                            periodInfo.setLocal(local);
                            final float b2 = e.b(period2);
                            final float d4 = e.d(b2, c, period2);
                            final boolean b3 = c > 2 && b2 > 2.0f;
                            final t h5 = period2.getEnd().h1();
                            String info = null;
                            Label_1351: {
                                if (!period2.getRights().contains(PeriodRight.READ_PERIODINFO)) {
                                    info = s2;
                                    if (!this.l(this.a)) {
                                        break Label_1351;
                                    }
                                }
                                info = periodInfo.getInfo();
                            }
                            final long id5 = period2.getId();
                            final long lessonId = period2.getLessonId();
                            final String a = this.a;
                            final PeriodElement subject8 = period2.getSubject();
                            long currentId5;
                            if (subject8 == null) {
                                currentId5 = 0L;
                            }
                            else {
                                currentId5 = subject8.getCurrentId();
                            }
                            final int j2 = ((org.joda.time.base.a)period2.getStart()).j0(org.joda.time.g.P());
                            final int j3 = ((org.joda.time.base.a)period2.getEnd()).j0(org.joda.time.g.P());
                            final ArrayList<HomeWork> list5 = new ArrayList<HomeWork>();
                            for (final HomeWork next3 : q4) {
                                final HomeWork homeWork = next3;
                                if (!homeWork.getLocal() && ((org.joda.time.base.e)homeWork.getEnd().h1()).p((n0)h5)) {
                                    list5.add(next3);
                                }
                            }
                            final ArrayList list6 = new ArrayList<String>(v.Y((Iterable<?>)list5, 10));
                            final Iterator<Object> iterator13 = list5.iterator();
                            while (iterator13.hasNext()) {
                                list6.add(this.p(iterator13.next()));
                            }
                            final ArrayList<HomeWork> list7 = new ArrayList<HomeWork>();
                            for (final HomeWork next4 : q4) {
                                final HomeWork homeWork2 = next4;
                                if (homeWork2.getLocal() && ((org.joda.time.base.e)homeWork2.getEnd().h1()).p((n0)h5)) {
                                    list7.add(next4);
                                }
                            }
                            final ArrayList list8 = new ArrayList<String>(v.Y((Iterable<?>)list7, 10));
                            final Iterator<Object> iterator15 = list7.iterator();
                            while (iterator15.hasNext()) {
                                list8.add(this.p(iterator15.next()));
                            }
                            list2.add(new PeriodModel(id5, lessonId, a, currentId5, j2, j3, b2, d4, c, d2, b, j, g, i, f, list3, (List<String>)list6, (List<String>)list8, info, periodInfo.getLocal(), periodInfo.getSubstitution(), periodInfo.getLesson(), period2.getStates().contains(PeriodState.OFFICE_HOUR_REGISTRATION), period2.getStates().contains(PeriodState.CANCELLED), period2.getStates().contains(PeriodState.EXAM), period2.getStates().contains(PeriodState.IRREGULAR), b3, b2, d4, period2.isOnlinePeriod()));
                        }
                        iterator4 = iterator7;
                    }
                    ++n;
                }
            }
        }
        return list2;
    }
    
    private final boolean l(final String s) {
        final Profile l = j0.G.l(s);
        return l == null || l.isAnonymousUser();
    }
    
    private final boolean m(final Period period) {
        final int n = j.a.a[this.b.ordinal()];
        final PeriodElement periodElement = null;
        final PeriodElement periodElement2 = null;
        final PeriodElement periodElement3 = null;
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        if (n == 1) {
            final Iterator<Object> iterator = period.getTeachers().iterator();
            PeriodElement periodElement4;
            PeriodElement next;
            do {
                next = periodElement2;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
                periodElement4 = next;
            } while (periodElement4.getCurrentId() != 0L || periodElement4.getOriginalId() != this.c);
            return next != null && b3;
        }
        if (n != 2) {
            if (n == 3) {
                final Iterator<Object> iterator2 = period.getKlassen().iterator();
                PeriodElement periodElement5;
                PeriodElement next2;
                do {
                    next2 = periodElement;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    next2 = iterator2.next();
                    periodElement5 = next2;
                } while (periodElement5.getCurrentId() != 0L || periodElement5.getOriginalId() != this.c);
                return next2 != null && b;
            }
            if (n != 4) {
                return false;
            }
            final Iterator<Object> iterator3 = period.getRooms().iterator();
            PeriodElement periodElement6;
            PeriodElement next3;
            do {
                next3 = periodElement3;
                if (!iterator3.hasNext()) {
                    break;
                }
                next3 = iterator3.next();
                periodElement6 = next3;
            } while (periodElement6.getCurrentId() != 0L || periodElement6.getOriginalId() != this.c);
            if (next3 == null) {
                b4 = false;
            }
            return b4;
        }
        else {
            if (period.getSubject() == null) {
                return false;
            }
            final PeriodElement subject = period.getSubject();
            k0.m(subject);
            if (subject.getCurrentId() == 0L) {
                final PeriodElement subject2 = period.getSubject();
                if (subject2 != null && subject2.getOriginalId() == this.c) {
                    return b2;
                }
            }
            return false;
        }
    }
    
    private final boolean n(final Period period) {
        final EntityType b = this.b;
        final EntityType teacher = EntityType.TEACHER;
        boolean b2 = false;
        if (b != teacher) {
            return false;
        }
        while (true) {
            for (final PeriodElement next : period.getTeachers()) {
                final PeriodElement periodElement = next;
                if (periodElement.getOriginalId() == this.c && periodElement.getCurrentId() != periodElement.getOriginalId()) {
                    if (next != null) {
                        b2 = true;
                    }
                    return b2;
                }
            }
            PeriodElement next = null;
            continue;
        }
    }
    
    private final boolean o(final t t) {
        final t d = this.d;
        if (d != null) {
            if (this.e != null) {
                if (((org.joda.time.base.e)t).o((n0)d)) {
                    return false;
                }
                if (((org.joda.time.base.e)t).m((n0)this.e)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private final String p(final HomeWork homeWork) {
        final boolean completedStatus = homeWork.getCompletedStatus();
        String s = homeWork.getText();
        if (completedStatus) {
            s = k0.C("@completed@", s);
        }
        return s;
    }
    
    @SuppressLint({ "UseSparseArrays" })
    @e
    public final List<TimeTableModel> d(@e final GetTimetableResponse getTimetableResponse, @e final Map<Long, ? extends List<? extends UMPeriod>> map) {
        k0.p(getTimetableResponse, "response");
        k0.p(map, "blockedPeriods");
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        final UMTimetable timetable = getTimetableResponse.timetable;
        if (timetable == null) {
            return list;
        }
        final Profile l = j0.G.l(this.a);
        Long value;
        if (l == null) {
            value = null;
        }
        else {
            value = l.getSchoolServerDelta();
        }
        if (value == null) {
            return v.E();
        }
        final long longValue = value;
        final UMMasterData masterData = getTimetableResponse.masterData;
        long d;
        if (masterData == null) {
            d = com.untis.mobile.utils.time.a.d();
        }
        else {
            d = longValue + masterData.timeStamp;
        }
        final t d2 = com.untis.mobile.utils.mapper.common.b.d(getTimetableResponse.timetable.displayableStartDate);
        k0.o(d2, "isoStringToLocalDate(response.timetable.displayableStartDate)");
        final t d3 = com.untis.mobile.utils.mapper.common.b.d(getTimetableResponse.timetable.displayableEndDate);
        k0.o(d3, "isoStringToLocalDate(response.timetable.displayableEndDate)");
        final HashMap<Long, Period> hashMap = new HashMap<Long, Period>();
        final List<UMPeriod> periods = timetable.periods;
        k0.o(periods, "timetable.periods");
        final ArrayList<Period> list2 = new ArrayList<Period>();
        for (final UMPeriod umPeriod : periods) {
            final x a = x.a;
            k0.o(umPeriod, "it");
            final Period e = a.e(umPeriod);
            if (e != null) {
                list2.add(e);
            }
        }
        for (final Period period : list2) {
            hashMap.put(period.getId(), period);
        }
        final LongSparseArray<PeriodInfo> c = this.c(getTimetableResponse);
        final LongSparseArray<List<HomeWork>> b = this.b(getTimetableResponse);
        final HashMap<t, List<Object>> hashMap2 = new HashMap<t, List<Object>>();
        Object iterator3 = map.entrySet().iterator();
        while (((Iterator)iterator3).hasNext()) {
            final Map.Entry<Object, V> entry = ((Iterator<Map.Entry<Object, V>>)iterator3).next();
            final Period period2 = hashMap.get(entry.getKey());
            if (period2 == null) {
                continue;
            }
            final HashSet<Long> blockIds = new HashSet<Long>();
            for (final UMPeriod umPeriod2 : (Iterable)entry.getValue()) {
                blockIds.add(umPeriod2.id);
                final c c2 = com.untis.mobile.utils.mapper.common.b.c(umPeriod2.startDateTime);
                k0.o(c2, "isoStringToDateTime(blockedUmPeriod.startDateTime)");
                final c c3 = com.untis.mobile.utils.mapper.common.b.c(umPeriod2.endDateTime);
                k0.o(c3, "isoStringToDateTime(blockedUmPeriod.endDateTime)");
                if (((org.joda.time.base.c)c2).C((l0)period2.getStart())) {
                    period2.setStart(c2);
                }
                if (((org.joda.time.base.c)c3).R((l0)period2.getEnd())) {
                    period2.setEnd(c3);
                }
            }
            period2.setBlockIds(blockIds);
            t key = period2.getStart().h1();
            final t l2 = period2.getEnd().h1().l0(1);
            final Iterator<Map.Entry<Object, V>> iterator5 = (Iterator<Map.Entry<Object, V>>)iterator3;
            while (true) {
                iterator3 = iterator5;
                if (!((org.joda.time.base.e)key).o((n0)l2)) {
                    break;
                }
                List<Object> list3;
                if ((list3 = hashMap2.get(key)) == null) {
                    list3 = new ArrayList<Object>();
                    k0.o(key, "indexDate");
                    hashMap2.put((org.joda.time.base.e)key, (List<Period>)list3);
                }
                final x a2 = x.a;
                k0.o(key, "indexDate");
                list3.add(a2.a(key, period2));
                key = key.l0(1);
            }
        }
        final Set<t> keySet = hashMap2.keySet();
        k0.o(keySet, "groupedPeriods.keys");
        final ArrayList<t> list4 = new ArrayList<t>();
        for (final t next : keySet) {
            final t t = next;
            if (((org.joda.time.base.e)t).p((n0)d2) || ((org.joda.time.base.e)t).p((n0)d3) || (((org.joda.time.base.e)t).m((n0)d2) && ((org.joda.time.base.e)t).o((n0)d3))) {
                list4.add(next);
            }
        }
        final Iterator<Object> iterator7 = v.h5((Iterable<?>)list4, (Comparator<? super Object>)com.untis.mobile.services.timetable.placeholder.i.G).iterator();
        final HashMap<t, List<Object>> hashMap3 = hashMap2;
        while (iterator7.hasNext()) {
            final t key2 = iterator7.next();
            final List<Object> list5 = hashMap3.get(key2);
            if (list5 == null) {
                continue;
            }
            k0.o(key2, "date");
            long n;
            if (this.o(key2)) {
                n = d;
            }
            else {
                n = 0L;
            }
            final l k = com.untis.mobile.services.timetable.placeholder.l.K;
            final EntityType b2 = this.b;
            final long c4 = this.c;
            final List<PeriodModel> g = this.g((List<Period>)list5, b, c);
            final ArrayList<Period> list6 = new ArrayList<Period>();
            for (final Period next2 : list5) {
                if (next2.getStates().contains(PeriodState.CANCELLED) ^ true) {
                    list6.add(next2);
                }
            }
            list.add(new TimeTableModel(k, b2, c4, key2, n, g, this.g(list6, b, c), this.f(key2), false, 0L, null, 1792, null));
        }
        if (((org.joda.time.base.e)d2).m((n0)new t(0L)) && (((org.joda.time.base.e)d2).o((n0)d3) || ((org.joda.time.base.e)d2).p((n0)d3))) {
            t l3 = new t((Object)d2);
            final ArrayList list7 = new ArrayList<t>(v.Y((Iterable<?>)list, 10));
            final Iterator<Object> iterator9 = list.iterator();
            while (iterator9.hasNext()) {
                list7.add(iterator9.next().getDate());
            }
            final Set<Object> n2 = v.N5((Iterable<?>)list7);
            while (((org.joda.time.base.e)l3).o((n0)d3) || ((org.joda.time.base.e)l3).p((n0)d3)) {
                if (!n2.contains(l3)) {
                    long n3;
                    if (this.o(l3)) {
                        n3 = d;
                    }
                    else {
                        n3 = 0L;
                    }
                    list.add(new TimeTableModel(com.untis.mobile.services.timetable.placeholder.l.K, this.b, this.c, l3, n3, null, null, null, false, 0L, null, 2016, null));
                }
                l3 = l3.l0(1);
                k0.o(l3, "date.plusDays(1)");
            }
        }
        return list;
    }
    
    public final int h(@f final Displayable displayable, @f final Displayable displayable2) {
        int n;
        if (displayable != null && displayable2 != null && k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            n = displayable.getDisplayableBackColor();
        }
        else {
            DefaultColors.DefaultColor defaultColor = null;
            Label_0081: {
                if (displayable == null || displayable2 == null || k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                    if (displayable == null || displayable2 != null) {
                        if (displayable == null && displayable2 != null) {
                            defaultColor = this.i.getCancelled();
                            break Label_0081;
                        }
                        n = 0;
                        return n;
                    }
                }
                defaultColor = this.i.getSubstitution();
            }
            n = defaultColor.backColor;
        }
        return n;
    }
    
    @e
    public final String i(@f final Displayable displayable, @f final Displayable displayable2) {
        if (displayable == null || displayable2 == null || !k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            if (displayable != null && displayable2 != null && !k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                final StringBuilder sb = new StringBuilder();
                sb.append(displayable.getDisplayableTitle());
                sb.append('(');
                sb.append(displayable2.getDisplayableTitle());
                sb.append(')');
                return sb.toString();
            }
            if (displayable == null || displayable2 != null) {
                if (displayable == null && displayable2 != null) {
                    return displayable2.getDisplayableTitle();
                }
                return "?";
            }
        }
        return displayable.getDisplayableTitle();
    }
    
    @e
    public final String j(@f final Displayable displayable, @f final Displayable displayable2) {
        if (displayable == null || displayable2 == null || !k0.g(displayable.getDisplayableDescription(), displayable2.getDisplayableDescription())) {
            if (displayable != null && displayable2 != null && !k0.g(displayable.getDisplayableDescription(), displayable2.getDisplayableDescription())) {
                final StringBuilder sb = new StringBuilder();
                sb.append(displayable.getDisplayableDescription());
                sb.append('(');
                sb.append(displayable2.getDisplayableDescription());
                sb.append(')');
                return sb.toString();
            }
            if (displayable == null || displayable2 != null) {
                if (displayable == null && displayable2 != null) {
                    return displayable2.getDisplayableDescription();
                }
                return "?";
            }
        }
        return displayable.getDisplayableDescription();
    }
    
    public final int k(@f final Displayable displayable, @f final Displayable displayable2) {
        int n;
        if (displayable != null && displayable2 != null && k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            n = displayable.getDisplayableTextColor();
        }
        else {
            DefaultColors.DefaultColor defaultColor = null;
            Label_0081: {
                if (displayable == null || displayable2 == null || k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                    if (displayable == null || displayable2 != null) {
                        if (displayable == null && displayable2 != null) {
                            defaultColor = this.i.getCancelled();
                            break Label_0081;
                        }
                        n = 0;
                        return n;
                    }
                }
                defaultColor = this.i.getSubstitution();
            }
            n = defaultColor.foreColor;
        }
        return n;
    }
}
