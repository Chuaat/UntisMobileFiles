// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.studentabsence;

import a4.a;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import androidx.room.l1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Be\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bJ\u0010KJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J}\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\t\u0010!\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010#H\u00d6\u0003R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b/\u0010'\"\u0004\b0\u0010)R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00103\u001a\u0004\b8\u00105\"\u0004\b9\u00107R$\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\bD\u0010'\"\u0004\bE\u0010)R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010%\u001a\u0004\bH\u0010'\"\u0004\bI\u0010)¨\u0006L" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "", "other", "", "compareTo", "", "component1", "component2", "component3", "Lorg/joda/time/c;", "component4", "component5", "", "component6", "component7", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;", "component8", "component9", "", "component10", "component11", "id", "studentId", "klassenId", "start", "end", "owner", "excused", "excuse", "reasonId", "reasonTitle", "text", "copy", "toString", "hashCode", "", "equals", "J", "getStudentId", "()J", "setStudentId", "(J)V", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "getId", "setId", "getStart", "setStart", "Ljava/lang/String;", "getReasonTitle", "()Ljava/lang/String;", "setReasonTitle", "(Ljava/lang/String;)V", "getText", "setText", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;", "getExcuse", "()Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;", "setExcuse", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;)V", "Z", "getOwner", "()Z", "setOwner", "(Z)V", "getKlassenId", "setKlassenId", "getExcused", "setExcused", "getReasonId", "setReasonId", "<init>", "(JJJLorg/joda/time/c;Lorg/joda/time/c;ZZLcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;JLjava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_student_absence")
public final class DashboardStudentAbsence implements Comparable<DashboardStudentAbsence>
{
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @i0(name = "end")
    @e
    private c end;
    @SerializedName("excuse")
    @i0(name = "excuse")
    @f
    private DashboardExcuse excuse;
    @SerializedName("excused")
    @i0(name = "excused")
    private boolean excused;
    @SerializedName("id")
    @i0(name = "absence_id")
    @l1
    private long id;
    @SerializedName("klasseId")
    @i0(name = "klassen_id")
    private long klassenId;
    @SerializedName("owner")
    @i0(name = "owner")
    private boolean owner;
    @SerializedName("absenceReasonId")
    @i0(name = "reason_id")
    private long reasonId;
    @SerializedName("absenceReason")
    @i0(name = "reason_title")
    @f
    private String reasonTitle;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @i0(name = "start")
    @e
    private c start;
    @SerializedName("studentId")
    @i0(name = "student_id")
    private long studentId;
    @SerializedName("text")
    @i0(name = "text")
    @f
    private String text;
    
    public DashboardStudentAbsence(final long id, final long studentId, final long klassenId, @e final c start, @e final c end, final boolean owner, final boolean excused, @f final DashboardExcuse excuse, final long reasonId, @f final String reasonTitle, @f final String text) {
        k0.p(start, "start");
        k0.p(end, "end");
        this.id = id;
        this.studentId = studentId;
        this.klassenId = klassenId;
        this.start = start;
        this.end = end;
        this.owner = owner;
        this.excused = excused;
        this.excuse = excuse;
        this.reasonId = reasonId;
        this.reasonTitle = reasonTitle;
        this.text = text;
    }
    
    @Override
    public int compareTo(@e final DashboardStudentAbsence dashboardStudentAbsence) {
        k0.p(dashboardStudentAbsence, "other");
        return -((org.joda.time.base.c)this.start).b((l0)dashboardStudentAbsence.start);
    }
    
    public final long component1() {
        return this.id;
    }
    
    @f
    public final String component10() {
        return this.reasonTitle;
    }
    
    @f
    public final String component11() {
        return this.text;
    }
    
    public final long component2() {
        return this.studentId;
    }
    
    public final long component3() {
        return this.klassenId;
    }
    
    @e
    public final c component4() {
        return this.start;
    }
    
    @e
    public final c component5() {
        return this.end;
    }
    
    public final boolean component6() {
        return this.owner;
    }
    
    public final boolean component7() {
        return this.excused;
    }
    
    @f
    public final DashboardExcuse component8() {
        return this.excuse;
    }
    
    public final long component9() {
        return this.reasonId;
    }
    
    @e
    public final DashboardStudentAbsence copy(final long n, final long n2, final long n3, @e final c c, @e final c c2, final boolean b, final boolean b2, @f final DashboardExcuse dashboardExcuse, final long n4, @f final String s, @f final String s2) {
        k0.p(c, "start");
        k0.p(c2, "end");
        return new DashboardStudentAbsence(n, n2, n3, c, c2, b, b2, dashboardExcuse, n4, s, s2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardStudentAbsence)) {
            return false;
        }
        final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)o;
        return this.id == dashboardStudentAbsence.id && this.studentId == dashboardStudentAbsence.studentId && this.klassenId == dashboardStudentAbsence.klassenId && k0.g(this.start, dashboardStudentAbsence.start) && k0.g(this.end, dashboardStudentAbsence.end) && this.owner == dashboardStudentAbsence.owner && this.excused == dashboardStudentAbsence.excused && k0.g(this.excuse, dashboardStudentAbsence.excuse) && this.reasonId == dashboardStudentAbsence.reasonId && k0.g(this.reasonTitle, dashboardStudentAbsence.reasonTitle) && k0.g(this.text, dashboardStudentAbsence.text);
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @f
    public final DashboardExcuse getExcuse() {
        return this.excuse;
    }
    
    public final boolean getExcused() {
        return this.excused;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getKlassenId() {
        return this.klassenId;
    }
    
    public final boolean getOwner() {
        return this.owner;
    }
    
    public final long getReasonId() {
        return this.reasonId;
    }
    
    @f
    public final String getReasonTitle() {
        return this.reasonTitle;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    public final long getStudentId() {
        return this.studentId;
    }
    
    @f
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.studentId);
        final int a3 = a4.a.a(this.klassenId);
        final int hashCode = ((org.joda.time.base.c)this.start).hashCode();
        final int hashCode2 = ((org.joda.time.base.c)this.end).hashCode();
        final int owner = this.owner ? 1 : 0;
        int n = 1;
        int n2 = owner;
        if (owner != 0) {
            n2 = 1;
        }
        final int excused = this.excused ? 1 : 0;
        if (excused == 0) {
            n = excused;
        }
        final DashboardExcuse excuse = this.excuse;
        int hashCode3 = 0;
        int hashCode4;
        if (excuse == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = excuse.hashCode();
        }
        final int a4 = a4.a.a(this.reasonId);
        final String reasonTitle = this.reasonTitle;
        int hashCode5;
        if (reasonTitle == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = reasonTitle.hashCode();
        }
        final String text = this.text;
        if (text != null) {
            hashCode3 = text.hashCode();
        }
        return (((((((((a * 31 + a2) * 31 + a3) * 31 + hashCode) * 31 + hashCode2) * 31 + n2) * 31 + n) * 31 + hashCode4) * 31 + a4) * 31 + hashCode5) * 31 + hashCode3;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setExcuse(@f final DashboardExcuse excuse) {
        this.excuse = excuse;
    }
    
    public final void setExcused(final boolean excused) {
        this.excused = excused;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlassenId(final long klassenId) {
        this.klassenId = klassenId;
    }
    
    public final void setOwner(final boolean owner) {
        this.owner = owner;
    }
    
    public final void setReasonId(final long reasonId) {
        this.reasonId = reasonId;
    }
    
    public final void setReasonTitle(@f final String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudentId(final long studentId) {
        this.studentId = studentId;
    }
    
    public final void setText(@f final String text) {
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardStudentAbsence(id=");
        sb.append(this.id);
        sb.append(", studentId=");
        sb.append(this.studentId);
        sb.append(", klassenId=");
        sb.append(this.klassenId);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", excused=");
        sb.append(this.excused);
        sb.append(", excuse=");
        sb.append(this.excuse);
        sb.append(", reasonId=");
        sb.append(this.reasonId);
        sb.append(", reasonTitle=");
        sb.append((Object)this.reasonTitle);
        sb.append(", text=");
        sb.append((Object)this.text);
        sb.append(')');
        return sb.toString();
    }
}
