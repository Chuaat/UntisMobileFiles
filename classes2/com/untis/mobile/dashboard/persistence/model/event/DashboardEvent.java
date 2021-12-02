// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.event;

import org.joda.time.base.d;
import org.joda.time.t;
import a4.a;
import org.jetbrains.annotations.f;
import org.joda.time.l0;
import kotlin.h0;
import org.joda.time.c;
import kotlin.jvm.internal.k0;
import org.joda.time.r;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b.\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011\u0012\u0006\u0010&\u001a\u00020\u0019\u0012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0019H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u008d\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\tH\u00c6\u0001J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010,\u001a\u00020\u00192\b\u0010\u0006\u001a\u0004\u0018\u00010+H\u00d6\u0003R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\"\u0010'\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\bG\u00104\"\u0004\bH\u00106R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010&\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00102\u001a\u0004\bS\u00104\"\u0004\bT\u00106R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010;\u001a\u0004\bU\u0010=\"\u0004\bV\u0010?¨\u0006Y" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "", "Lorg/joda/time/c;", "getCompareDateTime", "Lorg/joda/time/t;", "sectionLocalDate", "other", "", "compareTo", "", "component1", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "component2", "", "component3", "component4", "component5", "", "component6", "Lorg/joda/time/r;", "component7", "component8", "component9", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "component10", "", "component11", "component12", "profileId", "eventType", "eventId", "title", "entityTitle", "entityIds", "interval", "subject", "text", "attachments", "done", "classesTitle", "copy", "toString", "hashCode", "", "equals", "J", "getEventId", "()J", "setEventId", "(J)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getSubject", "setSubject", "getProfileId", "setProfileId", "Ljava/util/List;", "getEntityIds", "()Ljava/util/List;", "setEntityIds", "(Ljava/util/List;)V", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "getEventType", "()Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "setEventType", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;)V", "getTitle", "setTitle", "getClassesTitle", "setClassesTitle", "Lorg/joda/time/r;", "getInterval", "()Lorg/joda/time/r;", "setInterval", "(Lorg/joda/time/r;)V", "Z", "getDone", "()Z", "setDone", "(Z)V", "getEntityTitle", "setEntityTitle", "getAttachments", "setAttachments", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/joda/time/r;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardEvent implements Comparable<DashboardEvent>
{
    @e
    private List<Attachment> attachments;
    @e
    private String classesTitle;
    private boolean done;
    @e
    private List<Long> entityIds;
    @e
    private String entityTitle;
    private long eventId;
    @e
    private ReminderType eventType;
    @e
    private r interval;
    @e
    private String profileId;
    @e
    private String subject;
    @e
    private String text;
    @e
    private String title;
    
    public DashboardEvent(@e final String profileId, @e final ReminderType eventType, final long eventId, @e final String title, @e final String entityTitle, @e final List<Long> entityIds, @e final r interval, @e final String subject, @e final String text, @e final List<Attachment> attachments, final boolean done, @e final String classesTitle) {
        k0.p(profileId, "profileId");
        k0.p(eventType, "eventType");
        k0.p(title, "title");
        k0.p(entityTitle, "entityTitle");
        k0.p(entityIds, "entityIds");
        k0.p(interval, "interval");
        k0.p(subject, "subject");
        k0.p(text, "text");
        k0.p(attachments, "attachments");
        k0.p(classesTitle, "classesTitle");
        this.profileId = profileId;
        this.eventType = eventType;
        this.eventId = eventId;
        this.title = title;
        this.entityTitle = entityTitle;
        this.entityIds = entityIds;
        this.interval = interval;
        this.subject = subject;
        this.text = text;
        this.attachments = attachments;
        this.done = done;
        this.classesTitle = classesTitle;
    }
    
    private final c getCompareDateTime() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.eventType.ordinal()];
        String s = "interval.end";
        c c;
        if (n != 1 && n != 2) {
            s = "interval.start";
            if (n != 3 && n != 4 && n != 5) {
                throw new h0();
            }
            c = ((d)this.interval).b();
        }
        else {
            c = ((d)this.interval).s();
        }
        k0.o(c, s);
        return c;
    }
    
    @Override
    public int compareTo(@e final DashboardEvent dashboardEvent) {
        k0.p(dashboardEvent, "other");
        int u;
        if ((u = -((org.joda.time.base.c)this.getCompareDateTime()).b((l0)dashboardEvent.getCompareDateTime())) == 0) {
            u = k0.u(this.eventId, dashboardEvent.eventId);
        }
        return u;
    }
    
    @e
    public final String component1() {
        return this.profileId;
    }
    
    @e
    public final List<Attachment> component10() {
        return this.attachments;
    }
    
    public final boolean component11() {
        return this.done;
    }
    
    @e
    public final String component12() {
        return this.classesTitle;
    }
    
    @e
    public final ReminderType component2() {
        return this.eventType;
    }
    
    public final long component3() {
        return this.eventId;
    }
    
    @e
    public final String component4() {
        return this.title;
    }
    
    @e
    public final String component5() {
        return this.entityTitle;
    }
    
    @e
    public final List<Long> component6() {
        return this.entityIds;
    }
    
    @e
    public final r component7() {
        return this.interval;
    }
    
    @e
    public final String component8() {
        return this.subject;
    }
    
    @e
    public final String component9() {
        return this.text;
    }
    
    @e
    public final DashboardEvent copy(@e final String s, @e final ReminderType reminderType, final long n, @e final String s2, @e final String s3, @e final List<Long> list, @e final r r, @e final String s4, @e final String s5, @e final List<Attachment> list2, final boolean b, @e final String s6) {
        k0.p(s, "profileId");
        k0.p(reminderType, "eventType");
        k0.p(s2, "title");
        k0.p(s3, "entityTitle");
        k0.p(list, "entityIds");
        k0.p(r, "interval");
        k0.p(s4, "subject");
        k0.p(s5, "text");
        k0.p(list2, "attachments");
        k0.p(s6, "classesTitle");
        return new DashboardEvent(s, reminderType, n, s2, s3, list, r, s4, s5, list2, b, s6);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardEvent)) {
            return false;
        }
        final DashboardEvent dashboardEvent = (DashboardEvent)o;
        return k0.g(this.profileId, dashboardEvent.profileId) && this.eventType == dashboardEvent.eventType && this.eventId == dashboardEvent.eventId && k0.g(this.title, dashboardEvent.title) && k0.g(this.entityTitle, dashboardEvent.entityTitle) && k0.g(this.entityIds, dashboardEvent.entityIds) && k0.g(this.interval, dashboardEvent.interval) && k0.g(this.subject, dashboardEvent.subject) && k0.g(this.text, dashboardEvent.text) && k0.g(this.attachments, dashboardEvent.attachments) && this.done == dashboardEvent.done && k0.g(this.classesTitle, dashboardEvent.classesTitle);
    }
    
    @e
    public final List<Attachment> getAttachments() {
        return this.attachments;
    }
    
    @e
    public final String getClassesTitle() {
        return this.classesTitle;
    }
    
    public final boolean getDone() {
        return this.done;
    }
    
    @e
    public final List<Long> getEntityIds() {
        return this.entityIds;
    }
    
    @e
    public final String getEntityTitle() {
        return this.entityTitle;
    }
    
    public final long getEventId() {
        return this.eventId;
    }
    
    @e
    public final ReminderType getEventType() {
        return this.eventType;
    }
    
    @e
    public final r getInterval() {
        return this.interval;
    }
    
    @e
    public final String getProfileId() {
        return this.profileId;
    }
    
    @e
    public final String getSubject() {
        return this.subject;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @e
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.profileId.hashCode();
        final int hashCode2 = this.eventType.hashCode();
        final int a = a4.a.a(this.eventId);
        final int hashCode3 = this.title.hashCode();
        final int hashCode4 = this.entityTitle.hashCode();
        final int hashCode5 = this.entityIds.hashCode();
        final int hashCode6 = ((d)this.interval).hashCode();
        final int hashCode7 = this.subject.hashCode();
        final int hashCode8 = this.text.hashCode();
        final int hashCode9 = this.attachments.hashCode();
        int done;
        if ((done = (this.done ? 1 : 0)) != 0) {
            done = 1;
        }
        return ((((((((((hashCode * 31 + hashCode2) * 31 + a) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + done) * 31 + this.classesTitle.hashCode();
    }
    
    @e
    public final t sectionLocalDate() {
        final int n = WhenMappings.$EnumSwitchMapping$0[this.eventType.ordinal()];
        String s = "interval.end.toLocalDate()";
        c c;
        if (n != 1 && n != 2) {
            s = "interval.start.toLocalDate()";
            if (n != 3 && n != 4 && n != 5) {
                throw new h0();
            }
            c = ((d)this.interval).b();
        }
        else {
            c = ((d)this.interval).s();
        }
        final t h1 = c.h1();
        k0.o(h1, s);
        return h1;
    }
    
    public final void setAttachments(@e final List<Attachment> attachments) {
        k0.p(attachments, "<set-?>");
        this.attachments = attachments;
    }
    
    public final void setClassesTitle(@e final String classesTitle) {
        k0.p(classesTitle, "<set-?>");
        this.classesTitle = classesTitle;
    }
    
    public final void setDone(final boolean done) {
        this.done = done;
    }
    
    public final void setEntityIds(@e final List<Long> entityIds) {
        k0.p(entityIds, "<set-?>");
        this.entityIds = entityIds;
    }
    
    public final void setEntityTitle(@e final String entityTitle) {
        k0.p(entityTitle, "<set-?>");
        this.entityTitle = entityTitle;
    }
    
    public final void setEventId(final long eventId) {
        this.eventId = eventId;
    }
    
    public final void setEventType(@e final ReminderType eventType) {
        k0.p(eventType, "<set-?>");
        this.eventType = eventType;
    }
    
    public final void setInterval(@e final r interval) {
        k0.p(interval, "<set-?>");
        this.interval = interval;
    }
    
    public final void setProfileId(@e final String profileId) {
        k0.p(profileId, "<set-?>");
        this.profileId = profileId;
    }
    
    public final void setSubject(@e final String subject) {
        k0.p(subject, "<set-?>");
        this.subject = subject;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public final void setTitle(@e final String title) {
        k0.p(title, "<set-?>");
        this.title = title;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardEvent(profileId=");
        sb.append(this.profileId);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", entityTitle=");
        sb.append(this.entityTitle);
        sb.append(", entityIds=");
        sb.append(this.entityIds);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", done=");
        sb.append(this.done);
        sb.append(", classesTitle=");
        sb.append(this.classesTitle);
        sb.append(')');
        return sb.toString();
    }
}
