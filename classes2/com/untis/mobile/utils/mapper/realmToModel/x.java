// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.joda.time.base.g;
import io.realm.l0;
import com.untis.mobile.persistence.realm.period.a;
import java.util.Collection;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;
import com.untis.mobile.api.enumeration.UMPeriodState;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.api.enumeration.UMPeriodRight;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import kotlin.jvm.internal.w;
import java.util.Set;
import org.joda.time.n0;
import org.joda.time.c;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.joda.time.t;
import com.untis.mobile.api.enumeration.ElementType;
import com.untis.mobile.api.common.timetable.UMPeriodElement;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.EntityType;
import java.util.Iterator;
import com.untis.mobile.utils.mapper.common.b;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.api.common.timetable.UMPeriod;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010J\u001c\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0010¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/x;", "", "Lcom/untis/mobile/api/common/timetable/UMPeriod;", "umPeriod", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "d", "j", "periods", "", "c", "b", "Lcom/untis/mobile/persistence/realm/period/c;", "realmPeriod", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "g", "blockedUmPeriods", "f", "period", "i", "h", "e", "Lorg/joda/time/t;", "date", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class x
{
    @e
    public static final x a;
    
    static {
        a = new x();
    }
    
    private x() {
    }
    
    private final long b(final List<? extends UMPeriod> list) {
        final ArrayList<Long> list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((g)b.c(((UMPeriod)iterator.next()).endDateTime)).n());
        }
        final Iterator<Number> iterator2 = list2.iterator();
        long n = 0L;
        while (iterator2.hasNext()) {
            final long longValue = iterator2.next().longValue();
            if (n != 0L) {
                if (longValue <= n) {
                    continue;
                }
            }
            n = longValue;
        }
        return n;
    }
    
    private final long c(final List<? extends UMPeriod> list) {
        final ArrayList<Long> list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((g)b.c(((UMPeriod)iterator.next()).startDateTime)).n());
        }
        final Iterator<Number> iterator2 = list2.iterator();
        long n = 0L;
        while (iterator2.hasNext()) {
            final long longValue = iterator2.next().longValue();
            if (n != 0L) {
                if (longValue >= n) {
                    continue;
                }
            }
            n = longValue;
        }
        return n;
    }
    
    private final List<PeriodElement> d(final UMPeriod umPeriod, final EntityType entityType) {
        final List<UMPeriodElement> elements = umPeriod.elements;
        k0.o(elements, "umPeriod.elements");
        final ArrayList<PeriodElement> list = new ArrayList<PeriodElement>();
        for (final UMPeriodElement umPeriodElement : elements) {
            PeriodElement periodElement;
            if (umPeriodElement.type.getWuType() != entityType.getWebuntisId()) {
                periodElement = null;
            }
            else {
                periodElement = new PeriodElement(entityType, umPeriodElement.orgId, umPeriodElement.id);
            }
            if (periodElement != null) {
                list.add(periodElement);
            }
        }
        return list;
    }
    
    private final PeriodElement j(final UMPeriod umPeriod) {
        final List<UMPeriodElement> elements = umPeriod.elements;
        k0.o(elements, "umPeriod.elements");
        while (true) {
            for (final UMPeriodElement next : elements) {
                if (next.type == ElementType.SUBJECT) {
                    final UMPeriodElement umPeriodElement = next;
                    if (umPeriodElement == null) {
                        return null;
                    }
                    return new PeriodElement(EntityType.SUBJECT, umPeriodElement.orgId, umPeriodElement.id);
                }
            }
            UMPeriodElement next = null;
            continue;
        }
    }
    
    @e
    public final Period a(@e final t t, @e final Period period) {
        k0.p(t, "date");
        k0.p(period, "period");
        c f0 = new c((Object)period.getStart());
        c v0 = new c((Object)period.getEnd());
        if (!((org.joda.time.base.e)t).p((n0)period.getStart().h1())) {
            f0 = t.F0();
            k0.o(f0, "date.toDateTimeAtStartOfDay()");
        }
        if (!((org.joda.time.base.e)t).p((n0)period.getEnd().h1())) {
            v0 = t.F0().S0(1).v0(1);
            k0.o(v0, "date.toDateTimeAtStartOfDay().plusDays(1).minusMinutes(1)");
        }
        return new Period(period.getId(), period.getLessonId(), f0, v0, period.getSubject(), v.I5((Iterable<?>)period.getKlassen()), v.I5((Iterable<?>)period.getTeachers()), v.I5((Iterable<?>)period.getRooms()), period.getOriginalTextColor(), period.getOriginalBackColor(), period.getOriginalInnerTextColor(), period.getOriginalInnerBackColor(), v.N5((Iterable<?>)period.getRights()), v.N5((Iterable<?>)period.getStates()), v.N5((Iterable<?>)period.getBlockIds()), period.isOnlinePeriod(), null, 65536, null);
    }
    
    @e
    public final Period e(@e final UMPeriod umPeriod) {
        k0.p(umPeriod, "umPeriod");
        final List<UMPeriodElement> elements = umPeriod.elements;
        final String s = "umPeriod.elements";
        k0.o(elements, "umPeriod.elements");
        while (true) {
            for (final UMPeriodElement next : elements) {
                if (next.type == ElementType.SUBJECT) {
                    final UMPeriodElement umPeriodElement = next;
                    final long id = umPeriod.id;
                    final long lessonId = umPeriod.lessonId;
                    final c c = b.c(umPeriod.startDateTime);
                    final c c2 = b.c(umPeriod.endDateTime);
                    PeriodElement periodElement;
                    if (umPeriodElement != null) {
                        periodElement = new PeriodElement(EntityType.SUBJECT, umPeriodElement.orgId, umPeriodElement.id);
                    }
                    else {
                        periodElement = null;
                    }
                    final List<UMPeriodElement> elements2 = umPeriod.elements;
                    k0.o(elements2, "umPeriod.elements");
                    final ArrayList<UMPeriodElement> list = new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next2 : elements2) {
                        if (next2.type == ElementType.CLASS) {
                            list.add(next2);
                        }
                    }
                    final ArrayList list2 = new ArrayList<PeriodElement>(v.Y((Iterable<?>)list, 10));
                    for (final UMPeriodElement umPeriodElement2 : list) {
                        list2.add(new PeriodElement(EntityType.CLASS, umPeriodElement2.orgId, umPeriodElement2.id));
                    }
                    final List<UMPeriodElement> elements3 = umPeriod.elements;
                    k0.o(elements3, s);
                    final ArrayList<Object> list3 = (ArrayList<Object>)new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next3 : elements3) {
                        if (next3.type == ElementType.TEACHER) {
                            list3.add(next3);
                        }
                    }
                    final ArrayList list4 = new ArrayList<PeriodElement>(v.Y((Iterable<?>)list3, 10));
                    for (final UMPeriodElement umPeriodElement3 : list3) {
                        list4.add(new PeriodElement(EntityType.TEACHER, umPeriodElement3.orgId, umPeriodElement3.id));
                    }
                    final List<UMPeriodElement> elements4 = umPeriod.elements;
                    k0.o(elements4, s);
                    final ArrayList<Object> list5 = (ArrayList<Object>)new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next4 : elements4) {
                        if (next4.type == ElementType.ROOM) {
                            list5.add(next4);
                        }
                    }
                    final ArrayList list6 = new ArrayList<PeriodElement>(v.Y((Iterable<?>)list5, 10));
                    final Iterator<UMPeriodElement> iterator7 = list5.iterator();
                    final ArrayList<PeriodElement> list7 = (ArrayList<PeriodElement>)list4;
                    while (iterator7.hasNext()) {
                        final UMPeriodElement umPeriodElement4 = iterator7.next();
                        list6.add(new PeriodElement(EntityType.ROOM, umPeriodElement4.orgId, umPeriodElement4.id));
                    }
                    final int a = b.a(umPeriod.foreColor);
                    final int a2 = b.a(umPeriod.backColor);
                    final int a3 = b.a(umPeriod.innerForeColor);
                    final int a4 = b.a(umPeriod.innerBackColor);
                    final List<UMPeriodRight> can = umPeriod.can;
                    k0.o(can, "umPeriod.can");
                    final ArrayList list8 = new ArrayList<PeriodRight>(v.Y((Iterable<?>)can, 10));
                    final Iterator<Object> iterator8 = can.iterator();
                    while (iterator8.hasNext()) {
                        list8.add(PeriodRight.Companion.fromUmPeriodRight(iterator8.next()));
                    }
                    final Set<Object> n5 = v.N5((Iterable<?>)list8);
                    final List<UMPeriodState> is = umPeriod.is;
                    k0.o(is, "umPeriod.`is`");
                    final ArrayList list9 = new ArrayList<PeriodState>(v.Y((Iterable<?>)is, 10));
                    final Iterator<Object> iterator9 = is.iterator();
                    while (iterator9.hasNext()) {
                        list9.add(PeriodState.Companion.fromUmPeriodState(iterator9.next()));
                    }
                    final Set<Object> n6 = v.N5((Iterable<?>)list9);
                    final UMMessengerChannel messengerChannel = umPeriod.messengerChannel;
                    String id2;
                    if (messengerChannel == null) {
                        id2 = null;
                    }
                    else {
                        id2 = messengerChannel.id;
                    }
                    final boolean isOnlinePeriod = umPeriod.isOnlinePeriod;
                    k0.o(c, "isoStringToDateTime(umPeriod.startDateTime)");
                    k0.o(c2, "isoStringToDateTime(umPeriod.endDateTime)");
                    return new Period(id, lessonId, c, c2, periodElement, list2, list7, list6, a, a2, a3, a4, n5, n6, null, isOnlinePeriod, id2, 16384, null);
                }
            }
            UMPeriodElement next = null;
            continue;
        }
    }
    
    @e
    public final Period f(@e final UMPeriod umPeriod, @e final List<? extends UMPeriod> list) {
        k0.p(umPeriod, "umPeriod");
        k0.p(list, "blockedUmPeriods");
        final List<UMPeriod> r4 = v.r4(list, umPeriod);
        final long id = umPeriod.id;
        final long lessonId = umPeriod.lessonId;
        final c c = new c(this.c(r4));
        final c c2 = new c(this.b(r4));
        final PeriodElement j = this.j(umPeriod);
        final List<PeriodElement> d = this.d(umPeriod, EntityType.CLASS);
        final List<PeriodElement> d2 = this.d(umPeriod, EntityType.TEACHER);
        final List<PeriodElement> d3 = this.d(umPeriod, EntityType.ROOM);
        final int a = b.a(umPeriod.foreColor);
        final int a2 = b.a(umPeriod.backColor);
        final int a3 = b.a(umPeriod.innerForeColor);
        final int a4 = b.a(umPeriod.innerBackColor);
        final List<UMPeriodRight> can = umPeriod.can;
        k0.o(can, "umPeriod.can");
        final ArrayList list2 = new ArrayList<PeriodRight>(v.Y((Iterable<?>)can, 10));
        final Iterator<Object> iterator = can.iterator();
        while (iterator.hasNext()) {
            list2.add(PeriodRight.Companion.fromUmPeriodRight(iterator.next()));
        }
        final Set<? extends PeriodRight> n5 = v.N5((Iterable<? extends PeriodRight>)list2);
        final List<UMPeriodState> is = umPeriod.is;
        k0.o(is, "umPeriod.`is`");
        final ArrayList list3 = new ArrayList<PeriodState>(v.Y((Iterable<?>)is, 10));
        final Iterator<Object> iterator2 = is.iterator();
        while (iterator2.hasNext()) {
            list3.add(PeriodState.Companion.fromUmPeriodState(iterator2.next()));
        }
        final Set<? extends PeriodState> n6 = v.N5((Iterable<? extends PeriodState>)list3);
        final ArrayList<Long> list4 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<UMPeriod> iterator3 = list.iterator();
        final List<PeriodElement> list5 = d3;
        while (iterator3.hasNext()) {
            list4.add(iterator3.next().id);
        }
        final Set<Object> n7 = v.N5((Iterable<?>)list4);
        final UMMessengerChannel messengerChannel = umPeriod.messengerChannel;
        String id2;
        if (messengerChannel == null) {
            id2 = null;
        }
        else {
            id2 = messengerChannel.id;
        }
        return new Period(id, lessonId, c, c2, j, d, d2, list5, a, a2, a3, a4, n5, n6, (Set<Long>)n7, umPeriod.isOnlinePeriod, id2);
    }
    
    @e
    public final Period g(@e final com.untis.mobile.persistence.realm.period.c c) {
        k0.p(c, "realmPeriod");
        final long x8 = c.x8();
        final long b8 = c.B8();
        final c c2 = new c(c.E8());
        final c c3 = new c(c.w8());
        PeriodElement periodElement;
        if (c.G8() != null) {
            final EntityType subject = EntityType.SUBJECT;
            final a g8 = c.G8();
            k0.m(g8);
            final long u8 = g8.u8();
            final a g9 = c.G8();
            k0.m(g9);
            periodElement = new PeriodElement(subject, u8, g9.s8());
        }
        else {
            periodElement = null;
        }
        final l0<a> a8 = c.A8();
        final ArrayList list = new ArrayList<PeriodElement>(v.Y((Iterable<?>)a8, 10));
        for (final a a9 : a8) {
            list.add(new PeriodElement(EntityType.CLASS, a9.u8(), a9.s8()));
        }
        final l0<a> h8 = c.H8();
        final ArrayList list2 = new ArrayList<PeriodElement>(v.Y((Iterable<?>)h8, 10));
        for (final a a10 : h8) {
            list2.add(new PeriodElement(EntityType.TEACHER, a10.u8(), a10.s8()));
        }
        final l0<a> d8 = c.D8();
        final ArrayList list3 = new ArrayList<PeriodElement>(v.Y((Iterable<?>)d8, 10));
        for (final a a11 : d8) {
            list3.add(new PeriodElement(EntityType.ROOM, a11.u8(), a11.s8()));
        }
        final int i8 = c.I8();
        final int s8 = c.s8();
        final int z8 = c.z8();
        final int y8 = c.y8();
        final l0<com.untis.mobile.persistence.realm.a> c4 = c.C8();
        final ArrayList list4 = new ArrayList<PeriodRight>(v.Y((Iterable<?>)c4, 10));
        final Iterator<Object> iterator4 = c4.iterator();
        while (iterator4.hasNext()) {
            list4.add(PeriodRight.Companion.fromValue(iterator4.next().s8()));
        }
        final Set<? extends PeriodRight> n5 = v.N5((Iterable<? extends PeriodRight>)list4);
        final l0<com.untis.mobile.persistence.realm.a> f8 = c.F8();
        final ArrayList list5 = new ArrayList<PeriodState>(v.Y((Iterable<?>)f8, 10));
        final Iterator<Object> iterator5 = f8.iterator();
        while (iterator5.hasNext()) {
            list5.add(PeriodState.Companion.fromValue(iterator5.next().s8()));
        }
        final Set<? extends PeriodState> n6 = v.N5((Iterable<? extends PeriodState>)list5);
        final l0<com.untis.mobile.persistence.realm.b> t8 = c.t8();
        final ArrayList list6 = new ArrayList<Long>(v.Y((Iterable<?>)t8, 10));
        final Iterator<Object> iterator6 = t8.iterator();
        while (iterator6.hasNext()) {
            list6.add(Long.valueOf(iterator6.next().s8()));
        }
        return new Period(x8, b8, c2, c3, periodElement, (List<PeriodElement>)list, (List<PeriodElement>)list2, (List<PeriodElement>)list3, i8, s8, z8, y8, n5, n6, v.N5((Iterable<? extends Long>)list6), c.J8(), c.v8());
    }
    
    @e
    public final com.untis.mobile.persistence.realm.period.c h(@e final UMPeriod umPeriod, @e final List<? extends UMPeriod> list) {
        k0.p(umPeriod, "umPeriod");
        k0.p(list, "blockedUmPeriods");
        final List<UMPeriodElement> elements = umPeriod.elements;
        k0.o(elements, "umPeriod.elements");
        while (true) {
            for (final UMPeriodElement next : elements) {
                if (next.type.getWuType() == EntityType.SUBJECT.getWebuntisId()) {
                    final UMPeriodElement umPeriodElement = next;
                    final List<UMPeriod> r4 = v.r4(list, umPeriod);
                    final long id = umPeriod.id;
                    final long lessonId = umPeriod.lessonId;
                    final long c = this.c(r4);
                    final long b = this.b(r4);
                    final int a = com.untis.mobile.utils.mapper.common.b.a(umPeriod.backColor);
                    final int a2 = com.untis.mobile.utils.mapper.common.b.a(umPeriod.foreColor);
                    final int a3 = com.untis.mobile.utils.mapper.common.b.a(umPeriod.innerBackColor);
                    final int a4 = com.untis.mobile.utils.mapper.common.b.a(umPeriod.innerForeColor);
                    final List<UMPeriodRight> can = umPeriod.can;
                    k0.o(can, "umPeriod.can");
                    final ArrayList<com.untis.mobile.persistence.realm.a> list2 = new ArrayList<com.untis.mobile.persistence.realm.a>();
                    final Iterator<Object> iterator2 = can.iterator();
                    while (iterator2.hasNext()) {
                        list2.add(new com.untis.mobile.persistence.realm.a(PeriodRight.Companion.fromUmPeriodRight(iterator2.next()).getValue()));
                    }
                    final l0<com.untis.mobile.persistence.realm.a> h = com.untis.mobile.utils.mapper.common.b.h(list2);
                    k0.o(h, "toRealmList(umPeriod.can.mapNotNull { right -> RealmInteger(PeriodRight.fromUmPeriodRight(right).value) })");
                    final List<UMPeriodState> is = umPeriod.is;
                    k0.o(is, "umPeriod.`is`");
                    final ArrayList<com.untis.mobile.persistence.realm.a> list3 = new ArrayList<com.untis.mobile.persistence.realm.a>();
                    final Iterator<Object> iterator3 = is.iterator();
                    while (iterator3.hasNext()) {
                        list3.add(new com.untis.mobile.persistence.realm.a(PeriodState.Companion.fromUmPeriodState(iterator3.next()).getValue()));
                    }
                    final l0<com.untis.mobile.persistence.realm.a> h2 = com.untis.mobile.utils.mapper.common.b.h(list3);
                    k0.o(h2, "toRealmList(umPeriod.`is`.mapNotNull { state -> RealmInteger(PeriodState.fromUmPeriodState(state).value) })");
                    a a5;
                    if (umPeriodElement != null) {
                        a5 = new a(EntityType.SUBJECT.getWebuntisId(), umPeriodElement.orgId, umPeriodElement.id);
                    }
                    else {
                        a5 = null;
                    }
                    final List<UMPeriodElement> elements2 = umPeriod.elements;
                    k0.o(elements2, "umPeriod.elements");
                    final ArrayList<UMPeriodElement> list4 = new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next2 : elements2) {
                        if (next2.type == ElementType.CLASS) {
                            list4.add(next2);
                        }
                    }
                    final ArrayList list5 = new ArrayList<a>(v.Y((Iterable<?>)list4, 10));
                    for (final UMPeriodElement umPeriodElement2 : list4) {
                        list5.add(new a(EntityType.CLASS.getWebuntisId(), umPeriodElement2.orgId, umPeriodElement2.id));
                    }
                    final l0<a> h3 = com.untis.mobile.utils.mapper.common.b.h((List<a>)list5);
                    k0.o(h3, "toRealmList(umPeriod.elements.filter { pair -> pair.type == ElementType.CLASS }.map { pair -> RealmElementPair(entityType = EntityType.CLASS.webuntisId, originalId = pair.orgId, currentId = pair.id) })");
                    final List<UMPeriodElement> elements3 = umPeriod.elements;
                    k0.o(elements3, "umPeriod.elements");
                    final ArrayList<UMPeriodElement> list6 = new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next3 : elements3) {
                        if (next3.type == ElementType.ROOM) {
                            list6.add(next3);
                        }
                    }
                    final ArrayList list7 = new ArrayList<a>(v.Y((Iterable<?>)list6, 10));
                    for (final UMPeriodElement umPeriodElement3 : list6) {
                        list7.add(new a(EntityType.ROOM.getWebuntisId(), umPeriodElement3.orgId, umPeriodElement3.id));
                    }
                    final l0<a> h4 = com.untis.mobile.utils.mapper.common.b.h((List<a>)list7);
                    k0.o(h4, "toRealmList(umPeriod.elements.filter { pair -> pair.type == ElementType.ROOM }.map { RealmElementPair(entityType = EntityType.ROOM.webuntisId, originalId = it.orgId, currentId = it.id) })");
                    final List<UMPeriodElement> elements4 = umPeriod.elements;
                    k0.o(elements4, "umPeriod.elements");
                    final ArrayList<UMPeriodElement> list8 = new ArrayList<UMPeriodElement>();
                    for (final UMPeriodElement next4 : elements4) {
                        if (next4.type == ElementType.TEACHER) {
                            list8.add(next4);
                        }
                    }
                    final ArrayList list9 = new ArrayList<a>(v.Y((Iterable<?>)list8, 10));
                    final Iterator<Object> iterator9 = list8.iterator();
                    final l0<a> l0 = h3;
                    final Iterator<Object> iterator10 = iterator9;
                    while (iterator10.hasNext()) {
                        final UMPeriodElement umPeriodElement4 = iterator10.next();
                        list9.add(new a(EntityType.TEACHER.getWebuntisId(), umPeriodElement4.orgId, umPeriodElement4.id));
                    }
                    final l0<a> h5 = com.untis.mobile.utils.mapper.common.b.h((List<a>)list9);
                    k0.o(h5, "toRealmList(umPeriod.elements.filter { pair -> pair.type == ElementType.TEACHER }.map { pair -> RealmElementPair(entityType = EntityType.TEACHER.webuntisId, originalId = pair.orgId, currentId = pair.id) })");
                    final ArrayList<com.untis.mobile.persistence.realm.b> list10 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)list, 10));
                    final Iterator<UMPeriod> iterator11 = list.iterator();
                    while (iterator11.hasNext()) {
                        list10.add(new com.untis.mobile.persistence.realm.b(iterator11.next().id));
                    }
                    final l0<com.untis.mobile.persistence.realm.b> h6 = com.untis.mobile.utils.mapper.common.b.h(list10);
                    k0.o(h6, "toRealmList(blockedUmPeriods.map { RealmLong(it.id) })");
                    final boolean contains = umPeriod.is.contains(UMPeriodState.BREAK_SUPERVISION);
                    final UMMessengerChannel messengerChannel = umPeriod.messengerChannel;
                    String id2;
                    if (messengerChannel == null) {
                        id2 = null;
                    }
                    else {
                        id2 = messengerChannel.id;
                    }
                    return new com.untis.mobile.persistence.realm.period.c(id, lessonId, c, b, a, a2, a3, a4, h, h2, a5, l0, h4, h5, h6, contains, id2, umPeriod.isOnlinePeriod);
                }
            }
            UMPeriodElement next = null;
            continue;
        }
    }
    
    @e
    public final com.untis.mobile.persistence.realm.period.c i(@e final Period period) {
        k0.p(period, "period");
        final long id = period.getId();
        final long lessonId = period.getLessonId();
        final long n = ((g)period.getStart()).n();
        final long n2 = ((g)period.getEnd()).n();
        final int originalBackColor = period.getOriginalBackColor();
        final int originalTextColor = period.getOriginalTextColor();
        final int originalInnerBackColor = period.getOriginalInnerBackColor();
        final int originalInnerTextColor = period.getOriginalInnerTextColor();
        final Set<PeriodRight> rights = period.getRights();
        final ArrayList list = new ArrayList<com.untis.mobile.persistence.realm.a>(v.Y((Iterable<?>)rights, 10));
        final Iterator<Object> iterator = rights.iterator();
        while (iterator.hasNext()) {
            list.add(new com.untis.mobile.persistence.realm.a(iterator.next().getValue()));
        }
        final l0<com.untis.mobile.persistence.realm.a> h = b.h((List<com.untis.mobile.persistence.realm.a>)list);
        k0.o(h, "toRealmList(period.rights.map { right -> RealmInteger(right.value) })");
        final Set<PeriodState> states = period.getStates();
        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.a>(v.Y((Iterable<?>)states, 10));
        final Iterator<Object> iterator2 = states.iterator();
        while (iterator2.hasNext()) {
            list2.add(new com.untis.mobile.persistence.realm.a(iterator2.next().getValue()));
        }
        final l0<com.untis.mobile.persistence.realm.a> h2 = b.h((List<com.untis.mobile.persistence.realm.a>)list2);
        k0.o(h2, "toRealmList(period.states.map { state -> RealmInteger(state.value) })");
        a a;
        if (period.getSubject() != null) {
            final int webuntisId = EntityType.SUBJECT.getWebuntisId();
            final PeriodElement subject = period.getSubject();
            k0.m(subject);
            final long originalId = subject.getOriginalId();
            final PeriodElement subject2 = period.getSubject();
            k0.m(subject2);
            a = new a(webuntisId, originalId, subject2.getCurrentId());
        }
        else {
            a = null;
        }
        final List<PeriodElement> klassen = period.getKlassen();
        final ArrayList list3 = new ArrayList<a>(v.Y((Iterable<?>)klassen, 10));
        for (final PeriodElement periodElement : klassen) {
            list3.add(new a(EntityType.CLASS.getWebuntisId(), periodElement.getOriginalId(), periodElement.getCurrentId()));
        }
        final l0<a> h3 = b.h((List<a>)list3);
        k0.o(h3, "toRealmList(period.klassen.map { RealmElementPair(EntityType.CLASS.webuntisId, it.originalId, it.currentId) })");
        final List<PeriodElement> rooms = period.getRooms();
        final ArrayList list4 = new ArrayList<a>(v.Y((Iterable<?>)rooms, 10));
        for (final PeriodElement periodElement2 : rooms) {
            list4.add(new a(EntityType.ROOM.getWebuntisId(), periodElement2.getOriginalId(), periodElement2.getCurrentId()));
        }
        final l0<a> h4 = b.h((List<a>)list4);
        k0.o(h4, "toRealmList(period.rooms.map { RealmElementPair(EntityType.ROOM.webuntisId, it.originalId, it.currentId) })");
        final List<PeriodElement> teachers = period.getTeachers();
        final ArrayList list5 = new ArrayList<a>(v.Y((Iterable<?>)teachers, 10));
        for (final PeriodElement periodElement3 : teachers) {
            list5.add(new a(EntityType.TEACHER.getWebuntisId(), periodElement3.getOriginalId(), periodElement3.getCurrentId()));
        }
        final l0<a> h5 = b.h((List<a>)list5);
        k0.o(h5, "toRealmList(period.teachers.map { RealmElementPair(EntityType.TEACHER.webuntisId, it.originalId, it.currentId) })");
        final Set<Long> blockIds = period.getBlockIds();
        final ArrayList list6 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)blockIds, 10));
        final Iterator<Number> iterator6 = blockIds.iterator();
        while (iterator6.hasNext()) {
            list6.add(new com.untis.mobile.persistence.realm.b(iterator6.next().longValue()));
        }
        final l0<com.untis.mobile.persistence.realm.b> h6 = b.h((List<com.untis.mobile.persistence.realm.b>)list6);
        k0.o(h6, "toRealmList(period.blockIds.map { RealmLong(it) })");
        return new com.untis.mobile.persistence.realm.period.c(id, lessonId, n, n2, originalBackColor, originalTextColor, originalInnerBackColor, originalInnerTextColor, h, h2, a, h3, h4, h5, h6, period.getStates().contains(PeriodState.BREAK_SUPERVISION), period.getChannelId(), period.isOnlinePeriod());
    }
}
