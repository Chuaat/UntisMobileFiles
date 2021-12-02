// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.roomadapter;

import org.joda.time.base.g;
import kotlin.collections.v;
import org.koin.core.c$a;
import com.untis.mobile.calendar.persistence.model.common.CalendarBooking;
import com.untis.mobile.calendar.persistence.model.common.CalendarOriginalPeriod;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodSubject;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodSubType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodStudentGroup;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import androidx.room.f3;
import timber.log.b;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.squareup.moshi.x;
import com.untis.mobile.calendar.persistence.model.CalendarBlockPeriod;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodTeacher;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodStudent;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodResource;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodKlasse;
import java.util.List;
import com.squareup.moshi.h;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0007J\u001a\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\u0014\u0010 \u001a\u0004\u0018\u00010\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010\"\u001a\u0004\u0018\u00010\f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0007J\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007J\u0014\u0010'\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010*\u001a\u0004\u0018\u00010\f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0014H\u0007J\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010\f2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u0014H\u0007J\u001a\u0010/\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u00102\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u000100H\u0007J\u0014\u00104\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u00107\u001a\u0004\u0018\u00010\f2\u000e\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0014H\u0007J\u001a\u00108\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010;\u001a\u0004\u0018\u00010\f2\b\u0010:\u001a\u0004\u0018\u000109H\u0007J\u0014\u0010<\u001a\u0004\u0018\u0001092\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010?\u001a\u0004\u0018\u00010\f2\b\u0010>\u001a\u0004\u0018\u00010=H\u0007J\u0014\u0010@\u001a\u0004\u0018\u00010=2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010C\u001a\u0004\u0018\u00010\f2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u0014H\u0007J\u001a\u0010D\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010G\u001a\u0004\u0018\u00010\f2\b\u0010F\u001a\u0004\u0018\u00010EH\u0007J\u0014\u0010H\u001a\u0004\u0018\u00010E2\b\u00103\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010K\u001a\u0004\u0018\u00010\f2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u0014H\u0007J\u001a\u0010L\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010P\u001a\u0004\u0018\u00010\f2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u0014H\u0007J\u001a\u0010S\u001a\u0004\u0018\u00010\f2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u0014H\u0007J\u001a\u0010T\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010W\u001a\u0004\u0018\u00010\f2\b\u0010V\u001a\u0004\u0018\u00010UH\u0007J\u0014\u0010X\u001a\u0004\u0018\u00010U2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010[\u001a\u0004\u0018\u00010\f2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0007J\u0014\u0010\\\u001a\u0004\u0018\u00010Y2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007R\"\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010^R\u001d\u0010d\u001a\u00020`8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010a\u001a\u0004\bb\u0010cR\"\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010^R\"\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010^R\"\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010^R\"\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010^R\"\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010^R\"\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010^R\"\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010^¨\u0006n" }, d2 = { "Lcom/untis/mobile/utils/roomadapter/a;", "Lorg/koin/core/c;", "Lorg/joda/time/c;", "dateTime", "", "t", "(Lorg/joda/time/c;)Ljava/lang/Long;", "millis", "P", "(Ljava/lang/Long;)Lorg/joda/time/c;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "calendarPeriodExam", "", "f", "json", "A", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;", "z", "booking", "e", "", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodKlasse;", "klassen", "s", "B", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "lesson", "g", "C", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodStudentGroup;", "studentGroup", "l", "G", "strings", "Q", "M", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "period", "c", "x", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodResource;", "resources", "i", "E", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "rooms", "j", "F", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "status", "k", "key", "N", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodStudent;", "students", "m", "H", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;", "subType", "n", "I", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;", "subject", "o", "J", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodTeacher;", "teachers", "p", "K", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "type", "q", "O", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "permissions", "h", "D", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "y", "attachments", "d", "Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod;", "blocks", "a", "v", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;", "channel", "b", "w", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "videoCall", "r", "L", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/h;", "blockPeriodsAdapter", "Lcom/squareup/moshi/x;", "Lkotlin/b0;", "u", "()Lcom/squareup/moshi/x;", "moshi", "resourcesAdapter", "attachmentsAdapter", "roomsAdapter", "klassenAdapter", "teachersAdapter", "studentsAdapter", "stringListAdapter", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements c
{
    @e
    private final b0 G;
    @e
    private final h<List<String>> H;
    @e
    private final h<List<CalendarPeriodKlasse>> I;
    @e
    private final h<List<CalendarPeriodResource>> J;
    @e
    private final h<List<CalendarPeriodRoom>> K;
    @e
    private final h<List<CalendarPeriodStudent>> L;
    @e
    private final h<List<CalendarPeriodTeacher>> M;
    @e
    private final h<List<CalendarPeriodAttachment>> N;
    @e
    private final h<List<CalendarBlockPeriod>> O;
    
    public a() {
        this.G = d0.c((n6.a<?>)new n6.a<x>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final x invoke() {
                return (x)this.G.t(k1.d(x.class), null, null);
            }
        });
        final h<List<String>> d = this.u().d(a0.m(List.class, String.class));
        k0.o(d, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            String::class.java\n        )\n    )");
        this.H = d;
        final h<List<CalendarPeriodKlasse>> d2 = this.u().d(a0.m(List.class, CalendarPeriodKlasse.class));
        k0.o(d2, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodKlasse::class.java\n        )\n    )");
        this.I = d2;
        final h<List<CalendarPeriodResource>> d3 = this.u().d(a0.m(List.class, CalendarPeriodResource.class));
        k0.o(d3, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodResource::class.java\n        )\n    )");
        this.J = d3;
        final h<List<CalendarPeriodRoom>> d4 = this.u().d(a0.m(List.class, CalendarPeriodRoom.class));
        k0.o(d4, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodRoom::class.java\n        )\n    )");
        this.K = d4;
        final h<List<CalendarPeriodStudent>> d5 = this.u().d(a0.m(List.class, CalendarPeriodStudent.class));
        k0.o(d5, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodStudent::class.java\n        )\n    )");
        this.L = d5;
        final h<List<CalendarPeriodTeacher>> d6 = this.u().d(a0.m(List.class, CalendarPeriodTeacher.class));
        k0.o(d6, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodTeacher::class.java\n        )\n    )");
        this.M = d6;
        final h<List<CalendarPeriodAttachment>> d7 = this.u().d(a0.m(List.class, CalendarPeriodAttachment.class));
        k0.o(d7, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarPeriodAttachment::class.java\n        )\n    )");
        this.N = d7;
        final h<List<CalendarBlockPeriod>> d8 = this.u().d(a0.m(List.class, CalendarBlockPeriod.class));
        k0.o(d8, "moshi.adapter(\n        Types.newParameterizedType(\n            List::class.java,\n            CalendarBlockPeriod::class.java\n        )\n    )");
        this.O = d8;
    }
    
    private final x u() {
        return this.G.getValue();
    }
    
    @f3
    @f
    public final CalendarPeriodExam A(@f final String s) {
        final CalendarPeriodExam calendarPeriodExam = null;
        if (s == null) {
            return null;
        }
        CalendarPeriodExam calendarPeriodExam2;
        try {
            calendarPeriodExam2 = this.u().c(CalendarPeriodExam.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period exam", new Object[0]);
            calendarPeriodExam2 = calendarPeriodExam;
        }
        return calendarPeriodExam2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodKlasse> B(@f final String s) {
        final List<CalendarPeriodKlasse> list = null;
        if (s == null) {
            return null;
        }
        List<CalendarPeriodKlasse> list2;
        try {
            list2 = this.I.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period klassen", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final CalendarPeriodLesson C(@f final String s) {
        final CalendarPeriodLesson calendarPeriodLesson = null;
        if (s == null) {
            return null;
        }
        CalendarPeriodLesson calendarPeriodLesson2;
        try {
            calendarPeriodLesson2 = this.u().c(CalendarPeriodLesson.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period lesson", new Object[0]);
            calendarPeriodLesson2 = calendarPeriodLesson;
        }
        return calendarPeriodLesson2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodPermission> D(@f final String s) {
        final Collection<CalendarPeriodPermission> collection = null;
        if (s == null) {
            return null;
        }
        Collection<CalendarPeriodPermission> collection2;
        try {
            final List<String> list = this.H.c(s);
            if (list == null) {
                collection2 = collection;
            }
            else {
                collection2 = new ArrayList<CalendarPeriodPermission>();
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    final CalendarPeriodPermission byKey = CalendarPeriodPermission.Companion.findByKey(iterator.next());
                    if (byKey != null) {
                        collection2.add(byKey);
                    }
                }
            }
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period permissions", new Object[0]);
            collection2 = collection;
        }
        return (List<CalendarPeriodPermission>)collection2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodResource> E(@f final String s) {
        final List<CalendarPeriodResource> list = null;
        if (s == null) {
            return null;
        }
        List<CalendarPeriodResource> list2;
        try {
            list2 = this.J.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period resources", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodRoom> F(@f final String s) {
        final List<CalendarPeriodRoom> list = null;
        if (s == null) {
            return null;
        }
        List<CalendarPeriodRoom> list2;
        try {
            list2 = this.K.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period rooms", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final CalendarPeriodStudentGroup G(@f final String s) {
        final CalendarPeriodStudentGroup calendarPeriodStudentGroup = null;
        if (s == null) {
            return null;
        }
        CalendarPeriodStudentGroup calendarPeriodStudentGroup2;
        try {
            calendarPeriodStudentGroup2 = this.u().c(CalendarPeriodStudentGroup.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period student group", new Object[0]);
            calendarPeriodStudentGroup2 = calendarPeriodStudentGroup;
        }
        return calendarPeriodStudentGroup2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodStudent> H(@f final String s) {
        final List<CalendarPeriodStudent> list = null;
        if (s == null) {
            return null;
        }
        List<CalendarPeriodStudent> list2;
        try {
            list2 = this.L.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period students", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final CalendarPeriodSubType I(@f final String s) {
        final CalendarPeriodSubType calendarPeriodSubType = null;
        if (s == null) {
            return null;
        }
        CalendarPeriodSubType calendarPeriodSubType2;
        try {
            calendarPeriodSubType2 = this.u().c(CalendarPeriodSubType.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period subtype", new Object[0]);
            calendarPeriodSubType2 = calendarPeriodSubType;
        }
        return calendarPeriodSubType2;
    }
    
    @f3
    @f
    public final CalendarPeriodSubject J(@f final String s) {
        final CalendarPeriodSubject calendarPeriodSubject = null;
        if (s == null) {
            return null;
        }
        CalendarPeriodSubject calendarPeriodSubject2;
        try {
            calendarPeriodSubject2 = this.u().c(CalendarPeriodSubject.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period subject", new Object[0]);
            calendarPeriodSubject2 = calendarPeriodSubject;
        }
        return calendarPeriodSubject2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodTeacher> K(@f final String s) {
        final List<CalendarPeriodTeacher> list = null;
        if (s == null) {
            return null;
        }
        List<CalendarPeriodTeacher> list2;
        try {
            list2 = this.M.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period teachers", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final CalendarPeriodVideoCall L(@f final String s) {
        final CalendarPeriodVideoCall calendarPeriodVideoCall = null;
        if (s == null) {
            return null;
        }
        try {
            return this.u().c(CalendarPeriodVideoCall.class).c(s);
        }
        catch (Exception ex) {
            return calendarPeriodVideoCall;
        }
    }
    
    @f3
    @f
    public final List<String> M(@f final String s) {
        final List<String> list = null;
        if (s == null) {
            return null;
        }
        List<String> list2;
        try {
            list2 = this.H.c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize string list", new Object[0]);
            list2 = list;
        }
        return list2;
    }
    
    @f3
    @f
    public final CalendarPeriodStatus N(@f final String s) {
        return CalendarPeriodStatus.Companion.findByKey(s);
    }
    
    @f3
    @f
    public final CalendarPeriodType O(@f final String s) {
        return CalendarPeriodType.Companion.findByKey(s);
    }
    
    @f3
    @f
    public final org.joda.time.c P(@f final Long n) {
        final org.joda.time.c c = null;
        if (n == null) {
            return null;
        }
        org.joda.time.c c2;
        try {
            c2 = new org.joda.time.c((long)n);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize date time", new Object[0]);
            c2 = c;
        }
        return c2;
    }
    
    @f3
    @f
    public final String Q(@f final List<String> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.H.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize string list", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String a(@f final List<CalendarBlockPeriod> list) {
        final boolean b = list == null || list.isEmpty();
        final String s = "[]";
        if (b) {
            return "[]";
        }
        try {
            return this.O.l(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String b(@f final CalendarMessengerChannel calendarMessengerChannel) {
        final String s = null;
        if (calendarMessengerChannel == null) {
            return null;
        }
        try {
            return this.u().c(CalendarMessengerChannel.class).l(calendarMessengerChannel);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String c(@f final CalendarOriginalPeriod calendarOriginalPeriod) {
        final String s = null;
        if (calendarOriginalPeriod == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarOriginalPeriod.class).l(calendarOriginalPeriod);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar original period", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String d(@f final List<CalendarPeriodAttachment> list) {
        final boolean b = list == null || list.isEmpty();
        final String s = "[]";
        if (b) {
            return "[]";
        }
        try {
            return this.N.l(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String e(@f final CalendarBooking calendarBooking) {
        final String s = null;
        if (calendarBooking == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarBooking.class).l(calendarBooking);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period booking", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String f(@f final CalendarPeriodExam calendarPeriodExam) {
        final String s = null;
        if (calendarPeriodExam == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarPeriodExam.class).l(calendarPeriodExam);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period exam", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String g(@f final CalendarPeriodLesson calendarPeriodLesson) {
        final String s = null;
        if (calendarPeriodLesson == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarPeriodLesson.class).l(calendarPeriodLesson);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period lesson", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @f3
    @f
    public final String h(@f final List<? extends CalendarPeriodPermission> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            final h<List<String>> h = this.H;
            final ArrayList<String> list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
            final Iterator<? extends T> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((CalendarPeriodPermission)iterator.next()).getKey());
            }
            l = h.l(list2);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period permissions", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String i(@f final List<CalendarPeriodResource> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.J.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period resources", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String j(@f final List<CalendarPeriodRoom> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.K.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period rooms", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String k(@f final CalendarPeriodStatus calendarPeriodStatus) {
        String key;
        if (calendarPeriodStatus == null) {
            key = null;
        }
        else {
            key = calendarPeriodStatus.getKey();
        }
        return key;
    }
    
    @f3
    @f
    public final String l(@f final CalendarPeriodStudentGroup calendarPeriodStudentGroup) {
        final String s = null;
        if (calendarPeriodStudentGroup == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarPeriodStudentGroup.class).l(calendarPeriodStudentGroup);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period student group", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String m(@f final List<CalendarPeriodStudent> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.L.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period students", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String n(@f final CalendarPeriodSubType calendarPeriodSubType) {
        final String s = null;
        if (calendarPeriodSubType == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarPeriodSubType.class).l(calendarPeriodSubType);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period subtype", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String o(@f final CalendarPeriodSubject calendarPeriodSubject) {
        final String s = null;
        if (calendarPeriodSubject == null) {
            return null;
        }
        String l;
        try {
            l = this.u().c(CalendarPeriodSubject.class).l(calendarPeriodSubject);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period subject", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String p(@f final List<CalendarPeriodTeacher> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.M.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period teachers", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final String q(@f final CalendarPeriodType calendarPeriodType) {
        String key;
        if (calendarPeriodType == null) {
            key = null;
        }
        else {
            key = calendarPeriodType.getKey();
        }
        return key;
    }
    
    @f3
    @f
    public final String r(@f final CalendarPeriodVideoCall calendarPeriodVideoCall) {
        final String s = null;
        if (calendarPeriodVideoCall == null) {
            return null;
        }
        try {
            return this.u().c(CalendarPeriodVideoCall.class).l(calendarPeriodVideoCall);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String s(@f final List<CalendarPeriodKlasse> list) {
        final String s = null;
        if (list == null) {
            return null;
        }
        String l;
        try {
            l = this.I.l(list);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not serialize calendar period klassen", new Object[0]);
            l = s;
        }
        return l;
    }
    
    @f3
    @f
    public final Long t(@f final org.joda.time.c c) {
        Long value;
        if (c == null) {
            value = null;
        }
        else {
            value = ((g)c).n();
        }
        return value;
    }
    
    @f3
    @f
    public final List<CalendarBlockPeriod> v(@f final String s) {
        if (s == null) {
            return v.E();
        }
        try {
            return this.O.c(s);
        }
        catch (Exception ex) {
            return v.E();
        }
    }
    
    @f3
    @f
    public final CalendarMessengerChannel w(@f final String s) {
        final CalendarMessengerChannel calendarMessengerChannel = null;
        if (s == null) {
            return null;
        }
        try {
            return this.u().c(CalendarMessengerChannel.class).c(s);
        }
        catch (Exception ex) {
            return calendarMessengerChannel;
        }
    }
    
    @f3
    @f
    public final CalendarOriginalPeriod x(@f final String s) {
        final CalendarOriginalPeriod calendarOriginalPeriod = null;
        if (s == null) {
            return null;
        }
        CalendarOriginalPeriod calendarOriginalPeriod2;
        try {
            calendarOriginalPeriod2 = this.u().c(CalendarOriginalPeriod.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar original peropd", new Object[0]);
            calendarOriginalPeriod2 = calendarOriginalPeriod;
        }
        return calendarOriginalPeriod2;
    }
    
    @f3
    @f
    public final List<CalendarPeriodAttachment> y(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<CalendarPeriodAttachment> e;
        try {
            e = this.N.c(s);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @f3
    @f
    public final CalendarBooking z(@f final String s) {
        final CalendarBooking calendarBooking = null;
        if (s == null) {
            return null;
        }
        CalendarBooking calendarBooking2;
        try {
            calendarBooking2 = this.u().c(CalendarBooking.class).c(s);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not deserialize calendar period booking", new Object[0]);
            calendarBooking2 = calendarBooking;
        }
        return calendarBooking2;
    }
}
