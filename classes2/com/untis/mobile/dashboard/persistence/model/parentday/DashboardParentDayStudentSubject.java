// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayStudentSubject;", "", "", "component1", "", "component2", "studentId", "subjectIds", "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getStudentId", "()J", "setStudentId", "(J)V", "Ljava/util/List;", "getSubjectIds", "()Ljava/util/List;", "setSubjectIds", "(Ljava/util/List;)V", "<init>", "(JLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardParentDayStudentSubject
{
    @SerializedName("studentId")
    private long studentId;
    @SerializedName("subjectIds")
    @e
    private List<Long> subjectIds;
    
    public DashboardParentDayStudentSubject(final long studentId, @e final List<Long> subjectIds) {
        k0.p(subjectIds, "subjectIds");
        this.studentId = studentId;
        this.subjectIds = subjectIds;
    }
    
    public final long component1() {
        return this.studentId;
    }
    
    @e
    public final List<Long> component2() {
        return this.subjectIds;
    }
    
    @e
    public final DashboardParentDayStudentSubject copy(final long n, @e final List<Long> list) {
        k0.p(list, "subjectIds");
        return new DashboardParentDayStudentSubject(n, list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardParentDayStudentSubject)) {
            return false;
        }
        final DashboardParentDayStudentSubject dashboardParentDayStudentSubject = (DashboardParentDayStudentSubject)o;
        return this.studentId == dashboardParentDayStudentSubject.studentId && k0.g(this.subjectIds, dashboardParentDayStudentSubject.subjectIds);
    }
    
    public final long getStudentId() {
        return this.studentId;
    }
    
    @e
    public final List<Long> getSubjectIds() {
        return this.subjectIds;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.studentId) * 31 + this.subjectIds.hashCode();
    }
    
    public final void setStudentId(final long studentId) {
        this.studentId = studentId;
    }
    
    public final void setSubjectIds(@e final List<Long> subjectIds) {
        k0.p(subjectIds, "<set-?>");
        this.subjectIds = subjectIds;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardParentDayStudentSubject(studentId=");
        sb.append(this.studentId);
        sb.append(", subjectIds=");
        sb.append(this.subjectIds);
        sb.append(')');
        return sb.toString();
    }
}
