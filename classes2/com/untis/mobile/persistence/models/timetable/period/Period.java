// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import a4.a;
import org.joda.time.r;
import java.util.Collection;
import kotlin.collections.v;
import java.util.Objects;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.l0;
import java.util.HashSet;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.util.Set;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Entity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u00d9\u0001\u0012\b\b\u0002\u0010^\u001a\u00020\u000b\u0012\b\b\u0002\u0010X\u001a\u00020\u000b\u0012\b\b\u0002\u0010B\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020&0-\u0012\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020&0-\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020&0-\u0012\b\b\u0002\u0010U\u001a\u00020\u0004\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010K\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017\u0012\b\b\u0002\u00104\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\be\u0010fJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010.\u001a\b\u0012\u0004\u0012\u00020&0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\b\u0012\u0004\u0012\u00020&0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\"\u0010B\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010!\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R(\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001a\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010\u001eR\"\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010:\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\"\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R(\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001a\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u0010\u001eR(\u0010R\u001a\b\u0012\u0004\u0012\u00020&0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010/\u001a\u0004\bS\u00101\"\u0004\bT\u00103R\"\u0010U\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<\"\u0004\bW\u0010>R\"\u0010X\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R\u0013\u0010d\u001a\u00020a8F@\u0006¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "", "Lcom/untis/mobile/persistence/models/Entity;", "other", "", "compareTo", "", "", "equals", "hashCode", "", "", "getAllPeriodIds", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "channelId", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodState;", "states", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "setStates", "(Ljava/util/Set;)V", "Lorg/joda/time/c;", "end", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "subject", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "getSubject", "()Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;", "setSubject", "(Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;)V", "", "klassen", "Ljava/util/List;", "getKlassen", "()Ljava/util/List;", "setKlassen", "(Ljava/util/List;)V", "isOnlinePeriod", "Z", "()Z", "setOnlinePeriod", "(Z)V", "originalBackColor", "I", "getOriginalBackColor", "()I", "setOriginalBackColor", "(I)V", "rooms", "getRooms", "setRooms", "start", "getStart", "setStart", "blockIds", "getBlockIds", "setBlockIds", "originalInnerBackColor", "getOriginalInnerBackColor", "setOriginalInnerBackColor", "originalInnerTextColor", "getOriginalInnerTextColor", "setOriginalInnerTextColor", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodRight;", "rights", "getRights", "setRights", "teachers", "getTeachers", "setTeachers", "originalTextColor", "getOriginalTextColor", "setOriginalTextColor", "lessonId", "J", "getLessonId", "()J", "setLessonId", "(J)V", "id", "getId", "setId", "Lorg/joda/time/r;", "getInterval", "()Lorg/joda/time/r;", "interval", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;Lcom/untis/mobile/persistence/models/timetable/period/PeriodElement;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIILjava/util/Set;Ljava/util/Set;Ljava/util/Set;ZLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Period implements Comparable<Period>, Entity
{
    @e
    private Set<Long> blockIds;
    @f
    private String channelId;
    @e
    private c end;
    private long id;
    private boolean isOnlinePeriod;
    @e
    private List<PeriodElement> klassen;
    private long lessonId;
    private int originalBackColor;
    private int originalInnerBackColor;
    private int originalInnerTextColor;
    private int originalTextColor;
    @e
    private Set<? extends PeriodRight> rights;
    @e
    private List<PeriodElement> rooms;
    @e
    private c start;
    @e
    private Set<? extends PeriodState> states;
    @f
    private PeriodElement subject;
    @e
    private List<PeriodElement> teachers;
    
    public Period() {
        this(0L, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131071, null);
    }
    
    public Period(final long id, final long lessonId, @e final c start, @e final c end, @f final PeriodElement subject, @e final List<PeriodElement> klassen, @e final List<PeriodElement> teachers, @e final List<PeriodElement> rooms, final int originalTextColor, final int originalBackColor, final int originalInnerTextColor, final int originalInnerBackColor, @e final Set<? extends PeriodRight> rights, @e final Set<? extends PeriodState> states, @e final Set<Long> blockIds, final boolean isOnlinePeriod, @f final String channelId) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(klassen, "klassen");
        k0.p(teachers, "teachers");
        k0.p(rooms, "rooms");
        k0.p(rights, "rights");
        k0.p(states, "states");
        k0.p(blockIds, "blockIds");
        this.id = id;
        this.lessonId = lessonId;
        this.start = start;
        this.end = end;
        this.subject = subject;
        this.klassen = klassen;
        this.teachers = teachers;
        this.rooms = rooms;
        this.originalTextColor = originalTextColor;
        this.originalBackColor = originalBackColor;
        this.originalInnerTextColor = originalInnerTextColor;
        this.originalInnerBackColor = originalInnerBackColor;
        this.rights = rights;
        this.states = states;
        this.blockIds = blockIds;
        this.isOnlinePeriod = isOnlinePeriod;
        this.channelId = channelId;
    }
    
    @Override
    public int compareTo(@e final Period period) {
        k0.p(period, "other");
        if (((org.joda.time.base.c)this.start).C((l0)period.start)) {
            return -1;
        }
        if (((org.joda.time.base.c)this.start).R((l0)period.start)) {
            return 1;
        }
        if (((org.joda.time.base.c)this.end).C((l0)period.end)) {
            return 1;
        }
        if (((org.joda.time.base.c)this.end).R((l0)period.end)) {
            return -1;
        }
        final Set<? extends PeriodState> states = this.states;
        final PeriodState exam = PeriodState.EXAM;
        if (states.contains(exam) && !period.states.contains(exam)) {
            return -1;
        }
        if (!this.states.contains(exam) && period.states.contains(exam)) {
            return 1;
        }
        final Set<? extends PeriodState> states2 = this.states;
        final PeriodState cancelled = PeriodState.CANCELLED;
        if (states2.contains(cancelled) && !period.states.contains(cancelled)) {
            return 1;
        }
        if (!this.states.contains(cancelled) && period.states.contains(cancelled)) {
            return -1;
        }
        return 0;
    }
    
    @Override
    public long entityId() {
        return this.id;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return EntityType.PERIOD;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(Period.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timetable.period.Period");
        return this.id == ((Period)obj).id;
    }
    
    @e
    public final List<Long> getAllPeriodIds() {
        final Set<Object> m5 = v.M5((Iterable<?>)this.blockIds);
        m5.add(this.id);
        return v.L5((Collection<? extends Long>)m5);
    }
    
    @e
    public final Set<Long> getBlockIds() {
        return this.blockIds;
    }
    
    @f
    public final String getChannelId() {
        return this.channelId;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final r getInterval() {
        return new r((l0)this.start, (l0)this.end);
    }
    
    @e
    public final List<PeriodElement> getKlassen() {
        return this.klassen;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    public final int getOriginalBackColor() {
        return this.originalBackColor;
    }
    
    public final int getOriginalInnerBackColor() {
        return this.originalInnerBackColor;
    }
    
    public final int getOriginalInnerTextColor() {
        return this.originalInnerTextColor;
    }
    
    public final int getOriginalTextColor() {
        return this.originalTextColor;
    }
    
    @e
    public final Set<PeriodRight> getRights() {
        return (Set<PeriodRight>)this.rights;
    }
    
    @e
    public final List<PeriodElement> getRooms() {
        return this.rooms;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final Set<PeriodState> getStates() {
        return (Set<PeriodState>)this.states;
    }
    
    @f
    public final PeriodElement getSubject() {
        return this.subject;
    }
    
    @e
    public final List<PeriodElement> getTeachers() {
        return this.teachers;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final boolean isOnlinePeriod() {
        return this.isOnlinePeriod;
    }
    
    public final void setBlockIds(@e final Set<Long> blockIds) {
        k0.p(blockIds, "<set-?>");
        this.blockIds = blockIds;
    }
    
    public final void setChannelId(@f final String channelId) {
        this.channelId = channelId;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlassen(@e final List<PeriodElement> klassen) {
        k0.p(klassen, "<set-?>");
        this.klassen = klassen;
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setOnlinePeriod(final boolean isOnlinePeriod) {
        this.isOnlinePeriod = isOnlinePeriod;
    }
    
    public final void setOriginalBackColor(final int originalBackColor) {
        this.originalBackColor = originalBackColor;
    }
    
    public final void setOriginalInnerBackColor(final int originalInnerBackColor) {
        this.originalInnerBackColor = originalInnerBackColor;
    }
    
    public final void setOriginalInnerTextColor(final int originalInnerTextColor) {
        this.originalInnerTextColor = originalInnerTextColor;
    }
    
    public final void setOriginalTextColor(final int originalTextColor) {
        this.originalTextColor = originalTextColor;
    }
    
    public final void setRights(@e final Set<? extends PeriodRight> rights) {
        k0.p(rights, "<set-?>");
        this.rights = rights;
    }
    
    public final void setRooms(@e final List<PeriodElement> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStates(@e final Set<? extends PeriodState> states) {
        k0.p(states, "<set-?>");
        this.states = states;
    }
    
    public final void setSubject(@f final PeriodElement subject) {
        this.subject = subject;
    }
    
    public final void setTeachers(@e final List<PeriodElement> teachers) {
        k0.p(teachers, "<set-?>");
        this.teachers = teachers;
    }
}
