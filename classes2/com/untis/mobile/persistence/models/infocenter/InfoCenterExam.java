// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import a4.a;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.mapper.realmToModel.infocenter.f;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import org.joda.time.c;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\nH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J·\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\t\u0010,\u001a\u00020\u0002H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003R\"\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00107\u001a\u0004\b<\u00109\"\u0004\b=\u0010;R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010#\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00102\u001a\u0004\bC\u00104\"\u0004\bD\u00106R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\"\u0010!\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00107\u001a\u0004\bS\u00109\"\u0004\bT\u0010;R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00107\u001a\u0004\bU\u00109\"\u0004\bV\u0010;R\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00102\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010L\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010>\u001a\u0004\b[\u0010@\"\u0004\b\\\u0010BR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\b]\u00104\"\u0004\b^\u00106¨\u0006a" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExam;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "getDisplayableTitle", "getDisplayableDescription", "", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "component1", "component2", "component3", "Lorg/joda/time/c;", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/f;", "component11", "component12", "component13", "component14", "component15", "key", "id", "examType", "start", "end", "departmentId", "subjectId", "klassenIds", "roomIds", "teacherIds", "invigilators", "name", "text", "copy", "toString", "hashCode", "", "other", "", "equals", "J", "getKey", "()J", "setKey", "(J)V", "Ljava/util/List;", "getTeacherIds", "()Ljava/util/List;", "setTeacherIds", "(Ljava/util/List;)V", "getInvigilators", "setInvigilators", "Ljava/lang/String;", "getExamType", "()Ljava/lang/String;", "setExamType", "(Ljava/lang/String;)V", "getDepartmentId", "setDepartmentId", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "getId", "setId", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "getName", "setName", "getRoomIds", "setRoomIds", "getKlassenIds", "setKlassenIds", "getSubjectId", "setSubjectId", "getEnd", "setEnd", "getText", "setText", "getEntityId", "setEntityId", "<init>", "(JJLjava/lang/String;Lorg/joda/time/c;Lorg/joda/time/c;JJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterExam implements DisplayableEntity
{
    private long departmentId;
    @e
    private c end;
    private long entityId;
    @e
    private EntityType entityType;
    @e
    private String examType;
    private long id;
    @e
    private List<f> invigilators;
    private long key;
    @e
    private List<Long> klassenIds;
    @e
    private String name;
    @e
    private List<Long> roomIds;
    @e
    private c start;
    private long subjectId;
    @e
    private List<Long> teacherIds;
    @e
    private String text;
    
    public InfoCenterExam(final long key, final long id, @e final String examType, @e final c start, @e final c end, final long departmentId, final long subjectId, @e final List<Long> klassenIds, @e final List<Long> roomIds, @e final List<Long> teacherIds, @e final List<f> invigilators, @e final String name, @e final String text, @e final EntityType entityType, final long entityId) {
        k0.p(examType, "examType");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(klassenIds, "klassenIds");
        k0.p(roomIds, "roomIds");
        k0.p(teacherIds, "teacherIds");
        k0.p(invigilators, "invigilators");
        k0.p(name, "name");
        k0.p(text, "text");
        k0.p(entityType, "entityType");
        this.key = key;
        this.id = id;
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
        this.entityType = entityType;
        this.entityId = entityId;
    }
    
    public final long component1() {
        return this.key;
    }
    
    @e
    public final List<Long> component10() {
        return this.teacherIds;
    }
    
    @e
    public final List<f> component11() {
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
    
    @e
    public final EntityType component14() {
        return this.entityType;
    }
    
    public final long component15() {
        return this.entityId;
    }
    
    public final long component2() {
        return this.id;
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
    public final InfoCenterExam copy(final long n, final long n2, @e final String s, @e final c c, @e final c c2, final long n3, final long n4, @e final List<Long> list, @e final List<Long> list2, @e final List<Long> list3, @e final List<f> list4, @e final String s2, @e final String s3, @e final EntityType entityType, final long n5) {
        k0.p(s, "examType");
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(list, "klassenIds");
        k0.p(list2, "roomIds");
        k0.p(list3, "teacherIds");
        k0.p(list4, "invigilators");
        k0.p(s2, "name");
        k0.p(s3, "text");
        k0.p(entityType, "entityType");
        return new InfoCenterExam(n, n2, s, c, c2, n3, n4, list, list2, list3, list4, s2, s3, entityType, n5);
    }
    
    @Override
    public long entityId() {
        return this.id;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return EntityType.EXAM;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterExam)) {
            return false;
        }
        final InfoCenterExam infoCenterExam = (InfoCenterExam)o;
        return this.key == infoCenterExam.key && this.id == infoCenterExam.id && k0.g(this.examType, infoCenterExam.examType) && k0.g(this.start, infoCenterExam.start) && k0.g(this.end, infoCenterExam.end) && this.departmentId == infoCenterExam.departmentId && this.subjectId == infoCenterExam.subjectId && k0.g(this.klassenIds, infoCenterExam.klassenIds) && k0.g(this.roomIds, infoCenterExam.roomIds) && k0.g(this.teacherIds, infoCenterExam.teacherIds) && k0.g(this.invigilators, infoCenterExam.invigilators) && k0.g(this.name, infoCenterExam.name) && k0.g(this.text, infoCenterExam.text) && this.entityType == infoCenterExam.entityType && this.entityId == infoCenterExam.entityId;
    }
    
    public final long getDepartmentId() {
        return this.departmentId;
    }
    
    @Override
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableDescription() {
        return "displayable description";
    }
    
    @Override
    public int getDisplayableTextColor() {
        return -12303292;
    }
    
    @e
    @Override
    public String getDisplayableTitle() {
        return "displayable title";
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
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
    public final List<f> getInvigilators() {
        return this.invigilators;
    }
    
    public final long getKey() {
        return this.key;
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
    
    @Override
    public int hashCode() {
        return (((((((((((((a.a(this.key) * 31 + a.a(this.id)) * 31 + this.examType.hashCode()) * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode()) * 31 + a.a(this.departmentId)) * 31 + a.a(this.subjectId)) * 31 + this.klassenIds.hashCode()) * 31 + this.roomIds.hashCode()) * 31 + this.teacherIds.hashCode()) * 31 + this.invigilators.hashCode()) * 31 + this.name.hashCode()) * 31 + this.text.hashCode()) * 31 + this.entityType.hashCode()) * 31 + a.a(this.entityId);
    }
    
    public final void setDepartmentId(final long departmentId) {
        this.departmentId = departmentId;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setExamType(@e final String examType) {
        k0.p(examType, "<set-?>");
        this.examType = examType;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInvigilators(@e final List<f> invigilators) {
        k0.p(invigilators, "<set-?>");
        this.invigilators = invigilators;
    }
    
    public final void setKey(final long key) {
        this.key = key;
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
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterExam(key=");
        sb.append(this.key);
        sb.append(", id=");
        sb.append(this.id);
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
        sb.append(", entityType=");
        sb.append(this.entityType);
        sb.append(", entityId=");
        sb.append(this.entityId);
        sb.append(')');
        return sb.toString();
    }
}
