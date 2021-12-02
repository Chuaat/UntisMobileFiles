// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.event.homework;

import com.untis.mobile.persistence.models.masterdata.Subject;
import java.util.Iterator;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.utils.extension.h;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import com.untis.mobile.services.timetable.placeholder.k;
import android.content.Context;
import a4.a;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import androidx.room.l1;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import java.util.List;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\bZ\u0010[J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0010H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0015H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003Jk\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020\u00152\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0001J\t\u0010$\u001a\u00020\u0002H\u00d6\u0001J\t\u0010&\u001a\u00020%H\u00d6\u0001J\u0013\u0010(\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R\"\u0010!\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00103\u001a\u0004\bF\u00105\"\u0004\bG\u00107R$\u0010H\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00103\u001a\u0004\bN\u00105\"\u0004\bO\u00107R$\u0010P\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010K\"\u0004\bR\u0010MR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010.\u001a\u0004\bX\u00100\"\u0004\bY\u00102¨\u0006\\" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "", "", "profileId", "Landroid/content/Context;", "context", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "toDashboardEvent", "", "component1", "component2", "component3", "Lorg/joda/time/t;", "component4", "component5", "component6", "component7", "", "component8", "", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "component9", "id", "wuId", "lessonId", "start", "end", "text", "remark", "completed", "attachments", "copy", "toString", "", "hashCode", "other", "equals", "Lorg/joda/time/t;", "getStart", "()Lorg/joda/time/t;", "setStart", "(Lorg/joda/time/t;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getEnd", "setEnd", "Z", "getCompleted", "()Z", "setCompleted", "(Z)V", "getLessonId", "setLessonId", "subjectId", "Ljava/lang/Long;", "getSubjectId", "()Ljava/lang/Long;", "setSubjectId", "(Ljava/lang/Long;)V", "getWuId", "setWuId", "entityId", "getEntityId", "setEntityId", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "getRemark", "setRemark", "<init>", "(JJJLorg/joda/time/t;Lorg/joda/time/t;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_homework")
public final class DashboardHomework
{
    @SerializedName("attachments")
    @i0(name = "attachments")
    @e
    private List<Attachment> attachments;
    @SerializedName("completed")
    @i0(name = "completed")
    private boolean completed;
    @JsonAdapter(d.class)
    @SerializedName("endDate")
    @i0(name = "end")
    @e
    private t end;
    @i0(name = "entity_id")
    @f
    private Long entityId;
    @i0(name = "entity_type")
    @f
    private EntityType entityType;
    @SerializedName("_ignore_id")
    @i0(name = "homework_id")
    @l1(autoGenerate = true)
    private long id;
    @SerializedName("lessonId")
    @i0(name = "lesson_id")
    private long lessonId;
    @SerializedName("remark")
    @i0(name = "remark")
    @f
    private String remark;
    @JsonAdapter(d.class)
    @SerializedName("startDate")
    @i0(name = "start")
    @e
    private t start;
    @i0(name = "subject_id")
    @f
    private Long subjectId;
    @SerializedName("text")
    @i0(name = "text")
    @e
    private String text;
    @SerializedName("id")
    @i0(name = "homework_wu_id")
    private long wuId;
    
    public DashboardHomework(final long id, final long wuId, final long lessonId, @e final t start, @e final t end, @e final String text, @f final String remark, final boolean completed, @e final List<Attachment> attachments) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        k0.p(attachments, "attachments");
        this.id = id;
        this.wuId = wuId;
        this.lessonId = lessonId;
        this.start = start;
        this.end = end;
        this.text = text;
        this.remark = remark;
        this.completed = completed;
        this.attachments = attachments;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.wuId;
    }
    
    public final long component3() {
        return this.lessonId;
    }
    
    @e
    public final t component4() {
        return this.start;
    }
    
    @e
    public final t component5() {
        return this.end;
    }
    
    @e
    public final String component6() {
        return this.text;
    }
    
    @f
    public final String component7() {
        return this.remark;
    }
    
    public final boolean component8() {
        return this.completed;
    }
    
    @e
    public final List<Attachment> component9() {
        return this.attachments;
    }
    
    @e
    public final DashboardHomework copy(final long n, final long n2, final long n3, @e final t t, @e final t t2, @e final String s, @f final String s2, final boolean b, @e final List<Attachment> list) {
        k0.p(t, "start");
        k0.p(t2, "end");
        k0.p(s, "text");
        k0.p(list, "attachments");
        return new DashboardHomework(n, n2, n3, t, t2, s, s2, b, list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardHomework)) {
            return false;
        }
        final DashboardHomework dashboardHomework = (DashboardHomework)o;
        return this.id == dashboardHomework.id && this.wuId == dashboardHomework.wuId && this.lessonId == dashboardHomework.lessonId && k0.g(this.start, dashboardHomework.start) && k0.g(this.end, dashboardHomework.end) && k0.g(this.text, dashboardHomework.text) && k0.g(this.remark, dashboardHomework.remark) && this.completed == dashboardHomework.completed && k0.g(this.attachments, dashboardHomework.attachments);
    }
    
    @e
    public final List<Attachment> getAttachments() {
        return this.attachments;
    }
    
    public final boolean getCompleted() {
        return this.completed;
    }
    
    @e
    public final t getEnd() {
        return this.end;
    }
    
    @f
    public final Long getEntityId() {
        return this.entityId;
    }
    
    @f
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    @f
    public final String getRemark() {
        return this.remark;
    }
    
    @e
    public final t getStart() {
        return this.start;
    }
    
    @f
    public final Long getSubjectId() {
        return this.subjectId;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    public final long getWuId() {
        return this.wuId;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.wuId);
        final int a3 = a4.a.a(this.lessonId);
        final int hashCode = this.start.hashCode();
        final int hashCode2 = this.end.hashCode();
        final int hashCode3 = this.text.hashCode();
        final String remark = this.remark;
        int hashCode4;
        if (remark == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = remark.hashCode();
        }
        int completed;
        if ((completed = (this.completed ? 1 : 0)) != 0) {
            completed = 1;
        }
        return (((((((a * 31 + a2) * 31 + a3) * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + completed) * 31 + this.attachments.hashCode();
    }
    
    public final void setAttachments(@e final List<Attachment> attachments) {
        k0.p(attachments, "<set-?>");
        this.attachments = attachments;
    }
    
    public final void setCompleted(final boolean completed) {
        this.completed = completed;
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setEntityId(@f final Long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@f final EntityType entityType) {
        this.entityType = entityType;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setRemark(@f final String remark) {
        this.remark = remark;
    }
    
    public final void setStart(@e final t start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setSubjectId(@f final Long subjectId) {
        this.subjectId = subjectId;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public final void setWuId(final long wuId) {
        this.wuId = wuId;
    }
    
    @e
    public final DashboardEvent toDashboardEvent(@e final String s, @e final Context context, @e final com.untis.mobile.services.masterdata.a a, @e final k k) {
        k0.p(s, "profileId");
        k0.p(context, "context");
        k0.p(a, "masterDataService");
        k0.p(k, "timetableService");
        final EntityType entityType = this.entityType;
        k0.m(entityType);
        String displayableTitle = null;
        Label_0139: {
            if (entityType != EntityType.STUDENT) {
                final EntityType entityType2 = this.entityType;
                k0.m(entityType2);
                if (entityType2 != EntityType.CLASS) {
                    displayableTitle = "";
                    break Label_0139;
                }
            }
            final EntityType entityType3 = this.entityType;
            k0.m(entityType3);
            final Long entityId = this.entityId;
            k0.m(entityId);
            final DisplayableEntity v = a.v(entityType3, entityId);
            if (v != null) {
                displayableTitle = v.getDisplayableTitle();
                if (displayableTitle != null) {
                    break Label_0139;
                }
            }
            displayableTitle = "?";
        }
        while (true) {
            for (final Period next : k.v(this.lessonId)) {
                if (next.getStates().contains(PeriodState.REGULAR)) {
                    final Period period = next;
                    final Long subjectId = this.subjectId;
                    long longValue;
                    if (subjectId == null) {
                        longValue = 0L;
                    }
                    else {
                        longValue = subjectId;
                    }
                    final Subject u = a.U(longValue);
                    String displayableDescription = null;
                    Label_0269: {
                        if (u != null) {
                            displayableDescription = u.getDisplayableDescription();
                            if (displayableDescription != null) {
                                break Label_0269;
                            }
                        }
                        displayableDescription = "";
                    }
                    List<Klasse> list3 = null;
                    Label_0462: {
                        if (period != null) {
                            final List<PeriodElement> klassen = period.getKlassen();
                            if (klassen != null) {
                                final ArrayList<PeriodElement> list = new ArrayList<PeriodElement>();
                                for (final PeriodElement next2 : klassen) {
                                    final PeriodElement periodElement = next2;
                                    if (periodElement.getCurrentId() == periodElement.getOriginalId() && periodElement.getEntityType() == EntityType.CLASS) {
                                        list.add(next2);
                                    }
                                }
                                final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
                                final Iterator<Object> iterator3 = list.iterator();
                                while (true) {
                                    list3 = list2;
                                    if (!iterator3.hasNext()) {
                                        break Label_0462;
                                    }
                                    final Klasse n = a.N(iterator3.next().getCurrentId());
                                    if (n == null) {
                                        continue;
                                    }
                                    list2.add(n);
                                }
                            }
                        }
                        list3 = null;
                    }
                    Object e;
                    if ((e = list3) == null) {
                        e = v.E();
                    }
                    final ReminderType dashboardUpcomingHomework = ReminderType.DashboardUpcomingHomework;
                    final long wuId = this.wuId;
                    final String string = context.getString(2131886306);
                    final r r = new r((l0)this.start.F0(), (l0)this.end.F0());
                    final String text = this.text;
                    final Long entityId2 = this.entityId;
                    k0.m(entityId2);
                    final List<Long> i = v.k(entityId2);
                    final List<Attachment> attachments = this.attachments;
                    final boolean completed = this.completed;
                    final String h = com.untis.mobile.utils.extension.h.H((List)e, null, false, 3, null);
                    k0.o(string, "getString(R.string.homework_title)");
                    return new DashboardEvent(s, dashboardUpcomingHomework, wuId, string, displayableTitle, i, r, displayableDescription, text, attachments, completed, h);
                }
            }
            Period next = null;
            continue;
        }
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardHomework(id=");
        sb.append(this.id);
        sb.append(", wuId=");
        sb.append(this.wuId);
        sb.append(", lessonId=");
        sb.append(this.lessonId);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", remark=");
        sb.append((Object)this.remark);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(')');
        return sb.toString();
    }
}
