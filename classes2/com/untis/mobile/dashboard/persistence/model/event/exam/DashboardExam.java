// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.event.exam;

import java.util.Iterator;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.utils.extension.h;
import kotlin.collections.v;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.ArrayList;
import kotlin.text.s;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import a4.a;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.List;
import androidx.room.l1;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b`\u0010aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003J£\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u0002H\u00c6\u0001J\t\u0010'\u001a\u00020\u0002H\u00d6\u0001J\t\u0010)\u001a\u00020(H\u00d6\u0001J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R(\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010;\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00102\u001a\u0004\bF\u00104\"\u0004\bG\u00106R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\bM\u0010/\"\u0004\bN\u00101R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bO\u0010C\"\u0004\bP\u0010ER$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010-\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010-\u001a\u0004\bZ\u0010/\"\u0004\b[\u00101R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010A\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010ER\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010H\u001a\u0004\b^\u0010J\"\u0004\b_\u0010L¨\u0006b" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExam;", "", "", "profileId", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "toDashboardEvent", "", "component1", "component2", "component3", "Lorg/joda/time/c;", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExamInvigilator;", "component11", "component12", "component13", "id", "wuId", "examType", "start", "end", "departmentId", "subjectId", "klassenIds", "roomIds", "teacherIds", "invigilators", "name", "text", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getDepartmentId", "()J", "setDepartmentId", "(J)V", "Ljava/util/List;", "getKlassenIds", "()Ljava/util/List;", "setKlassenIds", "(Ljava/util/List;)V", "getTeacherIds", "setTeacherIds", "getRoomIds", "setRoomIds", "entityId", "Ljava/lang/Long;", "getEntityId", "()Ljava/lang/Long;", "setEntityId", "(Ljava/lang/Long;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getInvigilators", "setInvigilators", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "getId", "setId", "getName", "setName", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getSubjectId", "setSubjectId", "getWuId", "setWuId", "getExamType", "setExamType", "getStart", "setStart", "<init>", "(JJLjava/lang/String;Lorg/joda/time/c;Lorg/joda/time/c;JJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_exam")
public final class DashboardExam
{
    @SerializedName("departmentId")
    @i0(name = "department_id")
    private long departmentId;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @i0(name = "end")
    @e
    private c end;
    @i0(name = "entity_id")
    @f
    private Long entityId;
    @i0(name = "entity_type")
    @f
    private EntityType entityType;
    @SerializedName("examType")
    @i0(name = "exam_type")
    @e
    private String examType;
    @SerializedName("_ignore_id")
    @i0(name = "exam_id")
    @l1(autoGenerate = true)
    private long id;
    @SerializedName("invigilators")
    @i0(name = "invigilators")
    @e
    private List<DashboardExamInvigilator> invigilators;
    @SerializedName("klasseIds")
    @i0(name = "klassen_ids")
    @e
    private List<Long> klassenIds;
    @SerializedName("name")
    @i0(name = "name")
    @e
    private String name;
    @SerializedName("roomIds")
    @i0(name = "room_ids")
    @e
    private List<Long> roomIds;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @i0(name = "start")
    @e
    private c start;
    @SerializedName("subjectId")
    @i0(name = "subject_id")
    private long subjectId;
    @SerializedName("teacherIds")
    @i0(name = "teacher_ids")
    @e
    private List<Long> teacherIds;
    @SerializedName("text")
    @i0(name = "text")
    @e
    private String text;
    @SerializedName("id")
    @i0(name = "exam_wu_id")
    private long wuId;
    
    public DashboardExam(final long id, final long wuId, @e final String examType, @e final c start, @e final c end, final long departmentId, final long subjectId, @e final List<Long> klassenIds, @e final List<Long> roomIds, @e final List<Long> teacherIds, @e final List<DashboardExamInvigilator> invigilators, @e final String name, @e final String text) {
        k0.p(examType, "examType");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(klassenIds, "klassenIds");
        k0.p(roomIds, "roomIds");
        k0.p(teacherIds, "teacherIds");
        k0.p(invigilators, "invigilators");
        k0.p(name, "name");
        k0.p(text, "text");
        this.id = id;
        this.wuId = wuId;
        this.examType = examType;
        this.start = start;
        this.end = end;
        this.departmentId = departmentId;
        this.subjectId = subjectId;
        this.klassenIds = klassenIds;
        this.roomIds = roomIds;
        this.teacherIds = teacherIds;
        this.invigilators = invigilators;
        this.name = name;
        this.text = text;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final List<Long> component10() {
        return this.teacherIds;
    }
    
    @e
    public final List<DashboardExamInvigilator> component11() {
        return this.invigilators;
    }
    
    @e
    public final String component12() {
        return this.name;
    }
    
    @e
    public final String component13() {
        return this.text;
    }
    
    public final long component2() {
        return this.wuId;
    }
    
    @e
    public final String component3() {
        return this.examType;
    }
    
    @e
    public final c component4() {
        return this.start;
    }
    
    @e
    public final c component5() {
        return this.end;
    }
    
    public final long component6() {
        return this.departmentId;
    }
    
    public final long component7() {
        return this.subjectId;
    }
    
    @e
    public final List<Long> component8() {
        return this.klassenIds;
    }
    
    @e
    public final List<Long> component9() {
        return this.roomIds;
    }
    
    @e
    public final DashboardExam copy(final long n, final long n2, @e final String s, @e final c c, @e final c c2, final long n3, final long n4, @e final List<Long> list, @e final List<Long> list2, @e final List<Long> list3, @e final List<DashboardExamInvigilator> list4, @e final String s2, @e final String s3) {
        k0.p(s, "examType");
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(list, "klassenIds");
        k0.p(list2, "roomIds");
        k0.p(list3, "teacherIds");
        k0.p(list4, "invigilators");
        k0.p(s2, "name");
        k0.p(s3, "text");
        return new DashboardExam(n, n2, s, c, c2, n3, n4, list, list2, list3, list4, s2, s3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardExam)) {
            return false;
        }
        final DashboardExam dashboardExam = (DashboardExam)o;
        return this.id == dashboardExam.id && this.wuId == dashboardExam.wuId && k0.g(this.examType, dashboardExam.examType) && k0.g(this.start, dashboardExam.start) && k0.g(this.end, dashboardExam.end) && this.departmentId == dashboardExam.departmentId && this.subjectId == dashboardExam.subjectId && k0.g(this.klassenIds, dashboardExam.klassenIds) && k0.g(this.roomIds, dashboardExam.roomIds) && k0.g(this.teacherIds, dashboardExam.teacherIds) && k0.g(this.invigilators, dashboardExam.invigilators) && k0.g(this.name, dashboardExam.name) && k0.g(this.text, dashboardExam.text);
    }
    
    public final long getDepartmentId() {
        return this.departmentId;
    }
    
    @e
    public final c getEnd() {
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
    
    @e
    public final String getExamType() {
        return this.examType;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final List<DashboardExamInvigilator> getInvigilators() {
        return this.invigilators;
    }
    
    @e
    public final List<Long> getKlassenIds() {
        return this.klassenIds;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final List<Long> getRoomIds() {
        return this.roomIds;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    public final long getSubjectId() {
        return this.subjectId;
    }
    
    @e
    public final List<Long> getTeacherIds() {
        return this.teacherIds;
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
        return (((((((((((a.a(this.id) * 31 + a.a(this.wuId)) * 31 + this.examType.hashCode()) * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode()) * 31 + a.a(this.departmentId)) * 31 + a.a(this.subjectId)) * 31 + this.klassenIds.hashCode()) * 31 + this.roomIds.hashCode()) * 31 + this.teacherIds.hashCode()) * 31 + this.invigilators.hashCode()) * 31 + this.name.hashCode()) * 31 + this.text.hashCode();
    }
    
    public final void setDepartmentId(final long departmentId) {
        this.departmentId = departmentId;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setEntityId(@f final Long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@f final EntityType entityType) {
        this.entityType = entityType;
    }
    
    public final void setExamType(@e final String examType) {
        k0.p(examType, "<set-?>");
        this.examType = examType;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInvigilators(@e final List<DashboardExamInvigilator> invigilators) {
        k0.p(invigilators, "<set-?>");
        this.invigilators = invigilators;
    }
    
    public final void setKlassenIds(@e final List<Long> klassenIds) {
        k0.p(klassenIds, "<set-?>");
        this.klassenIds = klassenIds;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setRoomIds(@e final List<Long> roomIds) {
        k0.p(roomIds, "<set-?>");
        this.roomIds = roomIds;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setSubjectId(final long subjectId) {
        this.subjectId = subjectId;
    }
    
    public final void setTeacherIds(@e final List<Long> teacherIds) {
        k0.p(teacherIds, "<set-?>");
        this.teacherIds = teacherIds;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public final void setWuId(final long wuId) {
        this.wuId = wuId;
    }
    
    @e
    public final DashboardEvent toDashboardEvent(@e final String s, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(s, "profileId");
        k0.p(a, "masterDataService");
        final EntityType entityType = this.entityType;
        k0.m(entityType);
        String displayableTitle = null;
        Label_0104: {
            Label_0081: {
                if (entityType != EntityType.STUDENT) {
                    final EntityType entityType2 = this.entityType;
                    k0.m(entityType2);
                    if (entityType2 != EntityType.CLASS) {
                        break Label_0081;
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
                        break Label_0104;
                    }
                }
            }
            displayableTitle = "";
        }
        final Subject u = a.U(this.subjectId);
        final String name = this.name;
        String displayableDescription;
        if (u == null) {
            displayableDescription = null;
        }
        else {
            displayableDescription = u.getDisplayableDescription();
        }
        String s2 = null;
        Label_0248: {
            if (!s.K1(name, displayableDescription, true)) {
                final String name2 = this.name;
                String displayableTitle2;
                if (u == null) {
                    displayableTitle2 = null;
                }
                else {
                    displayableTitle2 = u.getDisplayableTitle();
                }
                if (!s.K1(name2, displayableTitle2, true)) {
                    if (s.U1((CharSequence)this.text)) {
                        s2 = this.name;
                        break Label_0248;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.name);
                    sb.append(" - ");
                    sb.append(this.text);
                    s2 = sb.toString();
                    break Label_0248;
                }
            }
            s2 = this.text;
        }
        final List<Long> klassenIds = this.klassenIds;
        final ArrayList<Klasse> list = new ArrayList<Klasse>();
        final Iterator<Number> iterator = klassenIds.iterator();
        while (iterator.hasNext()) {
            final Klasse n = a.N(iterator.next().longValue());
            if (n != null) {
                list.add(n);
            }
        }
        final ReminderType dashboardUpcomingExam = ReminderType.DashboardUpcomingExam;
        final long wuId = this.wuId;
        final String examType = this.examType;
        String displayableDescription2;
        if (u == null || (displayableDescription2 = u.getDisplayableDescription()) == null) {
            displayableDescription2 = "";
        }
        final r r = new r((l0)this.start, (l0)this.end);
        final Long entityId2 = this.entityId;
        k0.m(entityId2);
        return new DashboardEvent(s, dashboardUpcomingExam, wuId, examType, displayableTitle, v.k(entityId2), r, displayableDescription2, s2, v.E(), false, h.H(list, null, false, 1, null));
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardExam(id=");
        sb.append(this.id);
        sb.append(", wuId=");
        sb.append(this.wuId);
        sb.append(", examType=");
        sb.append(this.examType);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", departmentId=");
        sb.append(this.departmentId);
        sb.append(", subjectId=");
        sb.append(this.subjectId);
        sb.append(", klassenIds=");
        sb.append(this.klassenIds);
        sb.append(", roomIds=");
        sb.append(this.roomIds);
        sb.append(", teacherIds=");
        sb.append(this.teacherIds);
        sb.append(", invigilators=");
        sb.append(this.invigilators);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(')');
        return sb.toString();
    }
}
