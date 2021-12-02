// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import a4.a;
import org.jetbrains.annotations.f;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b8\u00109J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003JU\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "", "other", "", "compareTo", "", "component1", "component2", "component3", "", "component4", "Lorg/joda/time/c;", "component5", "component6", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayStudentSubject;", "component7", "id", "teacherId", "roomId", "cancelled", "start", "end", "studentSubjects", "copy", "", "toString", "hashCode", "", "equals", "Ljava/util/List;", "getStudentSubjects", "()Ljava/util/List;", "setStudentSubjects", "(Ljava/util/List;)V", "J", "getId", "()J", "setId", "(J)V", "getRoomId", "setRoomId", "getTeacherId", "setTeacherId", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "getEnd", "setEnd", "Z", "getCancelled", "()Z", "setCancelled", "(Z)V", "<init>", "(JJJZLorg/joda/time/c;Lorg/joda/time/c;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardParentDayAppointment implements Comparable<DashboardParentDayAppointment>
{
    @SerializedName("cancelled")
    private boolean cancelled;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @e
    private c end;
    @SerializedName("id")
    private long id;
    @SerializedName("roomId")
    private long roomId;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @e
    private c start;
    @SerializedName("studentSubjects")
    @e
    private List<DashboardParentDayStudentSubject> studentSubjects;
    @SerializedName("teacherId")
    private long teacherId;
    
    public DashboardParentDayAppointment(final long id, final long teacherId, final long roomId, final boolean cancelled, @e final c start, @e final c end, @e final List<DashboardParentDayStudentSubject> studentSubjects) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(studentSubjects, "studentSubjects");
        this.id = id;
        this.teacherId = teacherId;
        this.roomId = roomId;
        this.cancelled = cancelled;
        this.start = start;
        this.end = end;
        this.studentSubjects = studentSubjects;
    }
    
    @Override
    public int compareTo(@e final DashboardParentDayAppointment dashboardParentDayAppointment) {
        k0.p(dashboardParentDayAppointment, "other");
        return ((org.joda.time.base.c)this.start).b((l0)dashboardParentDayAppointment.start);
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.teacherId;
    }
    
    public final long component3() {
        return this.roomId;
    }
    
    public final boolean component4() {
        return this.cancelled;
    }
    
    @e
    public final c component5() {
        return this.start;
    }
    
    @e
    public final c component6() {
        return this.end;
    }
    
    @e
    public final List<DashboardParentDayStudentSubject> component7() {
        return this.studentSubjects;
    }
    
    @e
    public final DashboardParentDayAppointment copy(final long n, final long n2, final long n3, final boolean b, @e final c c, @e final c c2, @e final List<DashboardParentDayStudentSubject> list) {
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(list, "studentSubjects");
        return new DashboardParentDayAppointment(n, n2, n3, b, c, c2, list);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardParentDayAppointment)) {
            return false;
        }
        final DashboardParentDayAppointment dashboardParentDayAppointment = (DashboardParentDayAppointment)o;
        return this.id == dashboardParentDayAppointment.id && this.teacherId == dashboardParentDayAppointment.teacherId && this.roomId == dashboardParentDayAppointment.roomId && this.cancelled == dashboardParentDayAppointment.cancelled && k0.g(this.start, dashboardParentDayAppointment.start) && k0.g(this.end, dashboardParentDayAppointment.end) && k0.g(this.studentSubjects, dashboardParentDayAppointment.studentSubjects);
    }
    
    public final boolean getCancelled() {
        return this.cancelled;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getRoomId() {
        return this.roomId;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final List<DashboardParentDayStudentSubject> getStudentSubjects() {
        return this.studentSubjects;
    }
    
    public final long getTeacherId() {
        return this.teacherId;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.teacherId);
        final int a3 = a4.a.a(this.roomId);
        int cancelled;
        if ((cancelled = (this.cancelled ? 1 : 0)) != 0) {
            cancelled = 1;
        }
        return (((((a * 31 + a2) * 31 + a3) * 31 + cancelled) * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode()) * 31 + this.studentSubjects.hashCode();
    }
    
    public final void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setRoomId(final long roomId) {
        this.roomId = roomId;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudentSubjects(@e final List<DashboardParentDayStudentSubject> studentSubjects) {
        k0.p(studentSubjects, "<set-?>");
        this.studentSubjects = studentSubjects;
    }
    
    public final void setTeacherId(final long teacherId) {
        this.teacherId = teacherId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardParentDayAppointment(id=");
        sb.append(this.id);
        sb.append(", teacherId=");
        sb.append(this.teacherId);
        sb.append(", roomId=");
        sb.append(this.roomId);
        sb.append(", cancelled=");
        sb.append(this.cancelled);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", studentSubjects=");
        sb.append(this.studentSubjects);
        sb.append(')');
        return sb.toString();
    }
}
