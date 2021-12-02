// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata.cache;

import org.joda.time.base.g;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import android.content.Context;
import com.untis.mobile.services.timetable.placeholder.j;
import com.untis.mobile.UntisMobileApplication;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import kotlin.collections.y0;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import java.util.Collection;
import org.jetbrains.annotations.f;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.utils.j0;
import java.util.Iterator;
import io.realm.q;
import io.realm.n0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import io.realm.f0;
import n6.l;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import java.util.Map;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import java.util.Set;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.realm.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u00108\u001a\u00020.\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010J\u0014\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0019\u001a\u00020\u0005J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cJ \u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0005J\u001e\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u0005R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00030-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00102R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0016\u00108\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107¨\u0006;" }, d2 = { "Lcom/untis/mobile/services/masterdata/cache/t;", "", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timetableModels", "Lkotlin/j2;", "j", "c", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "l", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "", "delete", "k", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "subjectCustomColor", "m", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "periods", "o", "timetableModel", "h", "i", "g", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "e", "Lorg/joda/time/t;", "date", "d", "f", "a", "b", "Z", "allLoaded", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/dao/classbook/a;", "Lcom/untis/mobile/persistence/dao/classbook/a;", "classbookDao", "", "", "Ljava/util/Map;", "cachePerKey", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/util/Set;", "cache", "Ljava/lang/String;", "profileId", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/persistence/realm/d;Lcom/untis/mobile/services/masterdata/a;Lcom/untis/mobile/persistence/dao/classbook/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class t
{
    @e
    private final String a;
    @e
    private final d b;
    @e
    private final a c;
    @e
    private final com.untis.mobile.persistence.dao.classbook.a d;
    @e
    private Set<TimeTableModel> e;
    @e
    private Map<String, TimeTableModel> f;
    private boolean g;
    
    public t(@e final String a, @e final d b, @e final a c, @e final com.untis.mobile.persistence.dao.classbook.a d) {
        k0.p(a, "profileId");
        k0.p(b, "realmService");
        k0.p(c, "masterDataService");
        k0.p(d, "classbookDao");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new HashSet<TimeTableModel>();
        this.f = new HashMap<String, TimeTableModel>();
    }
    
    private final void j(final List<TimeTableModel> list) {
        j0.b(this.b.c(this.a), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final List<TimeTableModel> g = list;
                final ArrayList list = new ArrayList<n0>(v.Y((Iterable<?>)g, 10));
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    list.add(com.untis.mobile.utils.mapper.realmToModel.k0.a.a(iterator.next()));
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
    }
    
    public final void a(@e final EntityType entityType, final long n, @e final org.joda.time.t t) {
        k0.p(entityType, "entityType");
        k0.p(t, "date");
        this.f();
        j0.b(this.b.c(this.a), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(c5.e.class).H("entityType", entityType.getWebuntisId()).I("entityId", n).I("date", ((g)t.F0()).n()).b0().T3();
            }
        });
    }
    
    public final void b() {
        this.f();
        j0.b(this.b.c(this.a), t$b.G);
    }
    
    @e
    public final List<TimeTableModel> c() {
        if (this.g) {
            return v.I5((Iterable<? extends TimeTableModel>)this.e);
        }
        final f0 c = this.b.c(this.a);
        try {
            final HashSet<TimeTableModel> e = new HashSet<TimeTableModel>();
            final HashMap<String, TimeTableModel> f = new HashMap<String, TimeTableModel>();
            final s0<c5.e> b0 = c.f3(c5.e.class).b0();
            k0.o(b0, "realm.where(RealmTimeTableModel::class.java)\n                            .findAll()");
            for (final c5.e e2 : b0) {
                final com.untis.mobile.utils.mapper.realmToModel.k0 a = com.untis.mobile.utils.mapper.realmToModel.k0.a;
                final String a2 = this.a;
                k0.o(e2, "it");
                final TimeTableModel b2 = a.b(a2, e2);
                e.add(b2);
                f.put(b2.getId(), b2);
            }
            this.g = true;
            this.e = e;
            this.f = f;
            final List<Object> i5 = v.I5((Iterable<?>)e);
            kotlin.io.c.a(c, null);
            return (List<TimeTableModel>)i5;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a(c, t);
            }
        }
    }
    
    @f
    public final TimeTableModel d(@e final EntityType entityType, final long n, @e final org.joda.time.t t) {
        k0.p(entityType, "entityType");
        k0.p(t, "date");
        for (final TimeTableModel next : this.c()) {
            final TimeTableModel timeTableModel = next;
            if (timeTableModel.getEntityId() == n && timeTableModel.getEntityType() == entityType && ((org.joda.time.base.e)t).p((org.joda.time.n0)timeTableModel.getDate())) {
                return next;
            }
        }
        return null;
    }
    
    @e
    public final List<TimeTableModel> e(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        final List<TimeTableModel> c = this.c();
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        for (final TimeTableModel next : c) {
            final TimeTableModel timeTableModel = next;
            if (timeTableModel.getEntityId() == n && timeTableModel.getEntityType() == entityType) {
                list.add(next);
            }
        }
        return list;
    }
    
    public final void f() {
        this.f.clear();
        this.e.clear();
        this.g = false;
    }
    
    public final void g() {
        final List<TimeTableModel> c = this.c();
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        for (final TimeTableModel timeTableModel : c) {
            final List<PeriodModel> periods = timeTableModel.getPeriods();
            final boolean b = periods instanceof Collection;
            final int n = 1;
            int n2 = 0;
            Label_0139: {
                if (!b || !periods.isEmpty()) {
                    for (final PeriodModel periodModel : periods) {
                        if (periodModel.getBackColorCustom() != 0 || periodModel.getTextColorCustom() != 0) {
                            n2 = n;
                            break Label_0139;
                        }
                    }
                }
                n2 = 0;
            }
            TimeTableModel timeTableModel2;
            if (n2 == 0) {
                timeTableModel2 = null;
            }
            else {
                for (final PeriodModel periodModel2 : timeTableModel.getPeriods()) {
                    periodModel2.setTextColorCustom(0);
                    periodModel2.setBackColorCustom(0);
                }
                final Iterator<Object> iterator4 = timeTableModel.getPeriodsWithOutCancelled().iterator();
                while (true) {
                    timeTableModel2 = timeTableModel;
                    if (!iterator4.hasNext()) {
                        break;
                    }
                    final PeriodModel periodModel3 = iterator4.next();
                    periodModel3.setTextColorCustom(0);
                    periodModel3.setBackColorCustom(0);
                }
            }
            if (timeTableModel2 != null) {
                list.add(timeTableModel2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.i(list);
    }
    
    public final void h(@e final TimeTableModel timeTableModel) {
        k0.p(timeTableModel, "timetableModel");
        this.i(v.k(timeTableModel));
    }
    
    public final void i(@e final List<TimeTableModel> list) {
        k0.p(list, "timetableModels");
        final Set<TimeTableModel> m5 = (Set<TimeTableModel>)v.M5((Iterable<?>)this.e);
        m5.removeAll(list);
        m5.addAll(list);
        this.e = m5;
        final Map<String, TimeTableModel> j0 = y0.J0((Map<? extends String, ? extends TimeTableModel>)this.f);
        for (final TimeTableModel timeTableModel : list) {
            j0.put(timeTableModel.getId(), timeTableModel);
        }
        this.f = j0;
        this.j(list);
    }
    
    public final void k(@e final HomeWork homeWork, final boolean b) {
        k0.p(homeWork, "homework");
        final List<TimeTableModel> c = this.c();
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        for (final TimeTableModel timeTableModel : c) {
            TimeTableModel timeTableModel2 = null;
            Label_0549: {
                if (!((org.joda.time.base.e)timeTableModel.getDate()).o((org.joda.time.n0)homeWork.getStart().h1())) {
                    if (!((org.joda.time.base.e)timeTableModel.getDate()).m((org.joda.time.n0)homeWork.getEnd().h1())) {
                        final List<PeriodModel> periods = timeTableModel.getPeriods();
                        final ArrayList<PeriodModel> list2 = new ArrayList<PeriodModel>();
                        for (final PeriodModel next : periods) {
                            if (next.getLessonId() == homeWork.getLessonId()) {
                                list2.add(next);
                            }
                        }
                        if (!list2.isEmpty()) {
                            for (final PeriodModel periodModel : list2) {
                                final ArrayList<String> homeworks = new ArrayList<String>();
                                final ArrayList<String> localhomeWorks = new ArrayList<String>();
                                final Classbook a = this.d.a(this.a, periodModel.getId());
                                if (a != null) {
                                    final Set<HomeWork> homeWorks = a.getHomeWorks();
                                    if (homeWorks != null) {
                                        for (final HomeWork homeWork2 : homeWorks) {
                                            final boolean local = homeWork2.getLocal();
                                            final String homeworkString = homeWork2.getHomeworkString();
                                            if (local) {
                                                localhomeWorks.add(homeworkString);
                                            }
                                            else {
                                                homeworks.add(homeworkString);
                                            }
                                        }
                                    }
                                }
                                periodModel.setHomeworks(homeworks);
                                periodModel.setLocalhomeWorks(localhomeWorks);
                            }
                            final Iterator<Object> iterator5 = timeTableModel.getPeriodsWithOutCancelled().iterator();
                            while (true) {
                                timeTableModel2 = timeTableModel;
                                if (!iterator5.hasNext()) {
                                    break Label_0549;
                                }
                                final PeriodModel periodModel2 = iterator5.next();
                                final ArrayList<String> homeworks2 = new ArrayList<String>();
                                final ArrayList<String> localhomeWorks2 = new ArrayList<String>();
                                final Classbook a2 = this.d.a(this.a, periodModel2.getId());
                                if (a2 != null) {
                                    final Set<HomeWork> homeWorks2 = a2.getHomeWorks();
                                    if (homeWorks2 != null) {
                                        for (final HomeWork homeWork3 : homeWorks2) {
                                            final boolean local2 = homeWork3.getLocal();
                                            final String homeworkString2 = homeWork3.getHomeworkString();
                                            if (local2) {
                                                localhomeWorks2.add(homeworkString2);
                                            }
                                            else {
                                                homeworks2.add(homeworkString2);
                                            }
                                        }
                                    }
                                }
                                periodModel2.setHomeworks(homeworks2);
                                periodModel2.setLocalhomeWorks(localhomeWorks2);
                            }
                        }
                    }
                }
                timeTableModel2 = null;
            }
            if (timeTableModel2 != null) {
                list.add(timeTableModel2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.i(list);
    }
    
    public final void l(@e final PeriodInfo periodInfo) {
        k0.p(periodInfo, "periodInfo");
        final List<TimeTableModel> c = this.c();
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        for (final TimeTableModel timeTableModel : c) {
            final List<PeriodModel> periods = timeTableModel.getPeriods();
            final ArrayList<PeriodModel> list2 = new ArrayList<PeriodModel>();
            for (final PeriodModel next : periods) {
                if (next.getId() == periodInfo.getId()) {
                    list2.add(next);
                }
            }
            TimeTableModel timeTableModel2;
            if (list2.isEmpty()) {
                timeTableModel2 = null;
            }
            else {
                for (final PeriodModel periodModel : list2) {
                    periodModel.setInfo(periodInfo.getInfo());
                    periodModel.setLocal(periodInfo.getLocal());
                }
                final Iterator<Object> iterator4 = timeTableModel.getPeriodsWithOutCancelled().iterator();
                while (true) {
                    timeTableModel2 = timeTableModel;
                    if (!iterator4.hasNext()) {
                        break;
                    }
                    final PeriodModel periodModel2 = iterator4.next();
                    if (periodModel2.getId() != periodInfo.getId()) {
                        continue;
                    }
                    periodModel2.setInfo(periodInfo.getInfo());
                    periodModel2.setLocal(periodInfo.getLocal());
                }
            }
            if (timeTableModel2 != null) {
                list.add(timeTableModel2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.i(list);
    }
    
    public final void m(@e final CustomEntityColor customEntityColor) {
        k0.p(customEntityColor, "subjectCustomColor");
        if (customEntityColor.getEntityType() != EntityType.SUBJECT) {
            return;
        }
        final List<TimeTableModel> c = this.c();
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        for (final TimeTableModel timeTableModel : c) {
            final List<PeriodModel> periods = timeTableModel.getPeriods();
            final ArrayList<PeriodModel> list2 = new ArrayList<PeriodModel>();
            for (final PeriodModel next : periods) {
                if (next.getSubjectId() == customEntityColor.getEntityId()) {
                    list2.add(next);
                }
            }
            TimeTableModel timeTableModel2;
            if (list2.isEmpty()) {
                timeTableModel2 = null;
            }
            else {
                for (final PeriodModel periodModel : list2) {
                    periodModel.setBackColorCustom(customEntityColor.getBackColor());
                    periodModel.setTextColorCustom(customEntityColor.getTextColor());
                }
                final Iterator<Object> iterator4 = timeTableModel.getPeriodsWithOutCancelled().iterator();
                while (true) {
                    timeTableModel2 = timeTableModel;
                    if (!iterator4.hasNext()) {
                        break;
                    }
                    final PeriodModel periodModel2 = iterator4.next();
                    if (periodModel2.getSubjectId() != customEntityColor.getEntityId()) {
                        continue;
                    }
                    periodModel2.setBackColorCustom(customEntityColor.getBackColor());
                    periodModel2.setTextColorCustom(customEntityColor.getTextColor());
                }
            }
            if (timeTableModel2 != null) {
                list.add(timeTableModel2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.i(list);
    }
    
    public final void o(@e final List<Period> list) {
        k0.p(list, "periods");
        final ArrayList<Long> list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((Period)iterator.next()).getId());
        }
        Set<Object> n5 = v.N5((Iterable<?>)list2);
        final List<TimeTableModel> c = this.c();
        ArrayList<TimeTableModel> list3 = new ArrayList<TimeTableModel>();
        Iterator<TimeTableModel> iterator5;
        ArrayList<TimeTableModel> list10;
        for (Object iterator2 = c.iterator(); ((Iterator)iterator2).hasNext(); iterator2 = iterator5, list3 = list10) {
            final TimeTableModel timeTableModel = ((Iterator<TimeTableModel>)iterator2).next();
            final List<PeriodModel> periods = timeTableModel.getPeriods();
            final ArrayList<PeriodModel> list4 = new ArrayList<PeriodModel>();
            for (final PeriodModel next : periods) {
                if (n5.contains(next.getId())) {
                    list4.add(next);
                }
            }
            TimeTableModel timeTableModel2;
            Set<Object> set;
            ArrayList<TimeTableModel> list5;
            if (list4.isEmpty()) {
                final Iterator<TimeTableModel> iterator4 = (Iterator<TimeTableModel>)iterator2;
                timeTableModel2 = null;
                set = n5;
                list5 = list3;
                iterator5 = iterator4;
            }
            else {
                final UntisMobileApplication b = UntisMobileApplication.I.b();
                if (b == null) {
                    return;
                }
                final j j = new j((Context)b, this.a, timeTableModel.getEntityType(), timeTableModel.getEntityId(), timeTableModel.getDate(), timeTableModel.getDate());
            Label_0288:
                for (final PeriodModel periodModel : list4) {
                    final List<PeriodElementModel> elements = periodModel.getElements();
                    final ArrayList<PeriodElementModel> list6 = new ArrayList<PeriodElementModel>();
                    for (final PeriodElementModel next2 : elements) {
                        if (next2.getEntityType() != EntityType.ROOM) {
                            list6.add(next2);
                        }
                    }
                    final List<Object> l5 = v.L5((Collection<?>)list6);
                    while (true) {
                        for (final Object next3 : list) {
                            if (((Period)next3).getId() == periodModel.getId()) {
                                final Period period = (Period)next3;
                                ArrayList<TimeTableModel> list7;
                                Iterator<TimeTableModel> iterator9;
                                if (period == null) {
                                    list7 = list3;
                                    iterator9 = (Iterator<TimeTableModel>)iterator2;
                                }
                                else {
                                    final List<PeriodElement> rooms = period.getRooms();
                                    if (rooms == null) {
                                        iterator9 = (Iterator<TimeTableModel>)iterator2;
                                        list7 = list3;
                                    }
                                    else {
                                        final Iterator<Object> iterator10 = rooms.iterator();
                                        while (true) {
                                            iterator9 = (Iterator<TimeTableModel>)iterator2;
                                            list7 = list3;
                                            if (!iterator10.hasNext()) {
                                                break;
                                            }
                                            final PeriodElement periodElement = iterator10.next();
                                            final com.untis.mobile.utils.mapper.realmToModel.v a = com.untis.mobile.utils.mapper.realmToModel.v.a;
                                            final EntityType room = EntityType.ROOM;
                                            l5.add(a.b(j, room, this.c.v(room, periodElement.getCurrentId()), this.c.v(room, periodElement.getOriginalId())));
                                        }
                                    }
                                }
                                periodModel.setElements((List<PeriodElementModel>)l5);
                                list3 = list7;
                                iterator2 = iterator9;
                                continue Label_0288;
                            }
                        }
                        Object next3 = null;
                        continue;
                    }
                }
                final Iterator<TimeTableModel> iterator11 = (Iterator<TimeTableModel>)iterator2;
                final ArrayList<TimeTableModel> list8 = list3;
                final Iterator<Object> iterator12 = timeTableModel.getPeriodsWithOutCancelled().iterator();
                Set<Object> set2 = n5;
                Label_0644:
            Label_0836_Outer:
                while (iterator12.hasNext()) {
                    final PeriodModel periodModel2 = iterator12.next();
                    if (!set2.contains(periodModel2.getId())) {
                        continue Label_0836_Outer;
                    }
                    final List<PeriodElementModel> elements2 = periodModel2.getElements();
                    final ArrayList<PeriodElementModel> list9 = new ArrayList<PeriodElementModel>();
                    for (final PeriodElementModel next4 : elements2) {
                        if (next4.getEntityType() != EntityType.ROOM) {
                            list9.add(next4);
                        }
                    }
                    final List<Object> l6 = v.L5((Collection<?>)list9);
                    while (true) {
                        for (final Object next5 : list) {
                            if (((Period)next5).getId() == periodModel2.getId()) {
                                final Period period2 = (Period)next5;
                                Set<Object> set3;
                                if (period2 == null) {
                                    set3 = set2;
                                }
                                else {
                                    final List<PeriodElement> rooms2 = period2.getRooms();
                                    if (rooms2 == null) {
                                        set3 = set2;
                                    }
                                    else {
                                        final Iterator<Object> iterator15 = rooms2.iterator();
                                        while (true) {
                                            set3 = set2;
                                            if (!iterator15.hasNext()) {
                                                break;
                                            }
                                            final PeriodElement periodElement2 = iterator15.next();
                                            final com.untis.mobile.utils.mapper.realmToModel.v a2 = com.untis.mobile.utils.mapper.realmToModel.v.a;
                                            final EntityType room2 = EntityType.ROOM;
                                            l6.add(a2.b(j, room2, this.c.v(room2, periodElement2.getCurrentId()), this.c.v(room2, periodElement2.getOriginalId())));
                                        }
                                    }
                                }
                                periodModel2.setElements((List<PeriodElementModel>)l6);
                                set2 = set3;
                                continue Label_0644;
                            }
                        }
                        Object next5 = null;
                        continue;
                    }
                }
                set = set2;
                iterator5 = iterator11;
                list5 = list8;
                timeTableModel2 = timeTableModel;
            }
            if (timeTableModel2 != null) {
                list5.add(timeTableModel2);
            }
            list10 = list5;
            n5 = set;
        }
        if (list3.isEmpty()) {
            return;
        }
        this.i(list3);
    }
}
