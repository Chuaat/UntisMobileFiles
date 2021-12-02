// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00c6\u0003J=\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006$" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/Lesson;", "", "", "component1", "component2", "", "component3", "component4", "id", "subjectId", "klassenIds", "teacherIds", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getSubjectId", "()J", "setSubjectId", "(J)V", "getId", "setId", "Ljava/util/List;", "getKlassenIds", "()Ljava/util/List;", "setKlassenIds", "(Ljava/util/List;)V", "getTeacherIds", "setTeacherIds", "<init>", "(JJLjava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Lesson
{
    private long id;
    @e
    private List<Long> klassenIds;
    private long subjectId;
    @e
    private List<Long> teacherIds;
    
    public Lesson(final long id, final long subjectId, @e final List<Long> klassenIds, @e final List<Long> teacherIds) {
        k0.p(klassenIds, "klassenIds");
        k0.p(teacherIds, "teacherIds");
        this.id = id;
        this.subjectId = subjectId;
        this.klassenIds = klassenIds;
        this.teacherIds = teacherIds;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.subjectId;
    }
    
    @e
    public final List<Long> component3() {
        return this.klassenIds;
    }
    
    @e
    public final List<Long> component4() {
        return this.teacherIds;
    }
    
    @e
    public final Lesson copy(final long n, final long n2, @e final List<Long> list, @e final List<Long> list2) {
        k0.p(list, "klassenIds");
        k0.p(list2, "teacherIds");
        return new Lesson(n, n2, list, list2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Lesson)) {
            return false;
        }
        final Lesson lesson = (Lesson)o;
        return this.id == lesson.id && this.subjectId == lesson.subjectId && k0.g(this.klassenIds, lesson.klassenIds) && k0.g(this.teacherIds, lesson.teacherIds);
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final List<Long> getKlassenIds() {
        return this.klassenIds;
    }
    
    public final long getSubjectId() {
        return this.subjectId;
    }
    
    @e
    public final List<Long> getTeacherIds() {
        return this.teacherIds;
    }
    
    @Override
    public int hashCode() {
        return ((a.a(this.id) * 31 + a.a(this.subjectId)) * 31 + this.klassenIds.hashCode()) * 31 + this.teacherIds.hashCode();
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlassenIds(@e final List<Long> klassenIds) {
        k0.p(klassenIds, "<set-?>");
        this.klassenIds = klassenIds;
    }
    
    public final void setSubjectId(final long subjectId) {
        this.subjectId = subjectId;
    }
    
    public final void setTeacherIds(@e final List<Long> teacherIds) {
        k0.p(teacherIds, "<set-?>");
        this.teacherIds = teacherIds;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Lesson(id=");
        sb.append(this.id);
        sb.append(", subjectId=");
        sb.append(this.subjectId);
        sb.append(", klassenIds=");
        sb.append(this.klassenIds);
        sb.append(", teacherIds=");
        sb.append(this.teacherIds);
        sb.append(')');
        return sb.toString();
    }
}
