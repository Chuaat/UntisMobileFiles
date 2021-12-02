// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter.classlead;

import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.infocenter.InfoCenterExcuse;
import org.jetbrains.annotations.e;
import org.joda.time.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\bH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J[\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/classlead/ClassLeadStudentAbsence;", "", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "", "isExcused", "", "component1", "Lorg/joda/time/c;", "component2", "component3", "", "component4", "component5", "component6", "component7", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "component8", "id", "start", "end", "text", "studentId", "absenceReasonId", "excused", "excuse", "copy", "toString", "", "hashCode", "other", "equals", "J", "getId", "()J", "setId", "(J)V", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getExcused", "()Z", "setExcused", "(Z)V", "getAbsenceReasonId", "setAbsenceReasonId", "getStart", "setStart", "getStudentId", "setStudentId", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "getExcuse", "()Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "setExcuse", "(Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;)V", "<init>", "(JLorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;JJZLcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassLeadStudentAbsence
{
    private long absenceReasonId;
    @e
    private c end;
    @f
    private InfoCenterExcuse excuse;
    private boolean excused;
    private long id;
    @e
    private c start;
    private long studentId;
    @e
    private String text;
    
    public ClassLeadStudentAbsence(final long id, @e final c start, @e final c end, @e final String text, final long studentId, final long absenceReasonId, final boolean excused, @f final InfoCenterExcuse excuse) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        this.id = id;
        this.start = start;
        this.end = end;
        this.text = text;
        this.studentId = studentId;
        this.absenceReasonId = absenceReasonId;
        this.excused = excused;
        this.excuse = excuse;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final c component2() {
        return this.start;
    }
    
    @e
    public final c component3() {
        return this.end;
    }
    
    @e
    public final String component4() {
        return this.text;
    }
    
    public final long component5() {
        return this.studentId;
    }
    
    public final long component6() {
        return this.absenceReasonId;
    }
    
    public final boolean component7() {
        return this.excused;
    }
    
    @f
    public final InfoCenterExcuse component8() {
        return this.excuse;
    }
    
    @e
    public final ClassLeadStudentAbsence copy(final long n, @e final c c, @e final c c2, @e final String s, final long n2, final long n3, final boolean b, @f final InfoCenterExcuse infoCenterExcuse) {
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(s, "text");
        return new ClassLeadStudentAbsence(n, c, c2, s, n2, n3, b, infoCenterExcuse);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClassLeadStudentAbsence)) {
            return false;
        }
        final ClassLeadStudentAbsence classLeadStudentAbsence = (ClassLeadStudentAbsence)o;
        return this.id == classLeadStudentAbsence.id && k0.g(this.start, classLeadStudentAbsence.start) && k0.g(this.end, classLeadStudentAbsence.end) && k0.g(this.text, classLeadStudentAbsence.text) && this.studentId == classLeadStudentAbsence.studentId && this.absenceReasonId == classLeadStudentAbsence.absenceReasonId && this.excused == classLeadStudentAbsence.excused && k0.g(this.excuse, classLeadStudentAbsence.excuse);
    }
    
    public final long getAbsenceReasonId() {
        return this.absenceReasonId;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @f
    public final InfoCenterExcuse getExcuse() {
        return this.excuse;
    }
    
    public final boolean getExcused() {
        return this.excused;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    public final long getStudentId() {
        return this.studentId;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int hashCode = ((org.joda.time.base.c)this.start).hashCode();
        final int hashCode2 = ((org.joda.time.base.c)this.end).hashCode();
        final int hashCode3 = this.text.hashCode();
        final int a2 = a4.a.a(this.studentId);
        final int a3 = a4.a.a(this.absenceReasonId);
        int excused;
        if ((excused = (this.excused ? 1 : 0)) != 0) {
            excused = 1;
        }
        final InfoCenterExcuse excuse = this.excuse;
        int hashCode4;
        if (excuse == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = excuse.hashCode();
        }
        return ((((((a * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + a2) * 31 + a3) * 31 + excused) * 31 + hashCode4;
    }
    
    public final boolean isExcused(@e final com.untis.mobile.services.masterdata.a a) {
        k0.p(a, "masterDataService");
        final InfoCenterExcuse excuse = this.excuse;
        if (excuse == null) {
            return this.excused;
        }
        final ExcuseStatus c = a.c(excuse.getExcuseStatusId());
        return c != null && c.getExcused();
    }
    
    public final void setAbsenceReasonId(final long absenceReasonId) {
        this.absenceReasonId = absenceReasonId;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setExcuse(@f final InfoCenterExcuse excuse) {
        this.excuse = excuse;
    }
    
    public final void setExcused(final boolean excused) {
        this.excused = excused;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudentId(final long studentId) {
        this.studentId = studentId;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassLeadStudentAbsence(id=");
        sb.append(this.id);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", studentId=");
        sb.append(this.studentId);
        sb.append(", absenceReasonId=");
        sb.append(this.absenceReasonId);
        sb.append(", excused=");
        sb.append(this.excused);
        sb.append(", excuse=");
        sb.append(this.excuse);
        sb.append(')');
        return sb.toString();
    }
}
