// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import a4.a;
import org.joda.time.l0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import org.joda.time.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b'\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BY\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bF\u0010GJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003Jo\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\"\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010!H\u00d6\u0003R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\u001b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010#\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?¨\u0006H" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterStudentAbsence;", "", "other", "", "compareTo", "", "component1", "Lorg/joda/time/c;", "component2", "component3", "", "component4", "component5", "component6", "component7", "", "component8", "component9", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "component10", "id", "start", "end", "text", "studentId", "klassenId", "absenceReasonId", "excused", "owner", "excuse", "copy", "toString", "hashCode", "", "equals", "J", "getStudentId", "()J", "setStudentId", "(J)V", "getId", "setId", "Z", "getExcused", "()Z", "setExcused", "(Z)V", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "getExcuse", "()Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "setExcuse", "(Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getKlassenId", "setKlassenId", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "getOwner", "setOwner", "getAbsenceReasonId", "setAbsenceReasonId", "getEnd", "setEnd", "<init>", "(JLorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;JJJZZLcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterStudentAbsence implements Comparable<InfoCenterStudentAbsence>
{
    private long absenceReasonId;
    @e
    private c end;
    @f
    private InfoCenterExcuse excuse;
    private boolean excused;
    private long id;
    private long klassenId;
    private boolean owner;
    @e
    private c start;
    private long studentId;
    @e
    private String text;
    
    public InfoCenterStudentAbsence(final long id, @e final c start, @e final c end, @e final String text, final long studentId, final long klassenId, final long absenceReasonId, final boolean excused, final boolean owner, @f final InfoCenterExcuse excuse) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        this.id = id;
        this.start = start;
        this.end = end;
        this.text = text;
        this.studentId = studentId;
        this.klassenId = klassenId;
        this.absenceReasonId = absenceReasonId;
        this.excused = excused;
        this.owner = owner;
        this.excuse = excuse;
    }
    
    @Override
    public int compareTo(@e final InfoCenterStudentAbsence infoCenterStudentAbsence) {
        k0.p(infoCenterStudentAbsence, "other");
        if (((org.joda.time.base.c)this.start).C((l0)infoCenterStudentAbsence.start)) {
            return 1;
        }
        if (((org.joda.time.base.c)this.start).R((l0)infoCenterStudentAbsence.start)) {
            return -1;
        }
        return 0;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @f
    public final InfoCenterExcuse component10() {
        return this.excuse;
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
        return this.klassenId;
    }
    
    public final long component7() {
        return this.absenceReasonId;
    }
    
    public final boolean component8() {
        return this.excused;
    }
    
    public final boolean component9() {
        return this.owner;
    }
    
    @e
    public final InfoCenterStudentAbsence copy(final long n, @e final c c, @e final c c2, @e final String s, final long n2, final long n3, final long n4, final boolean b, final boolean b2, @f final InfoCenterExcuse infoCenterExcuse) {
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(s, "text");
        return new InfoCenterStudentAbsence(n, c, c2, s, n2, n3, n4, b, b2, infoCenterExcuse);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterStudentAbsence)) {
            return false;
        }
        final InfoCenterStudentAbsence infoCenterStudentAbsence = (InfoCenterStudentAbsence)o;
        return this.id == infoCenterStudentAbsence.id && k0.g(this.start, infoCenterStudentAbsence.start) && k0.g(this.end, infoCenterStudentAbsence.end) && k0.g(this.text, infoCenterStudentAbsence.text) && this.studentId == infoCenterStudentAbsence.studentId && this.klassenId == infoCenterStudentAbsence.klassenId && this.absenceReasonId == infoCenterStudentAbsence.absenceReasonId && this.excused == infoCenterStudentAbsence.excused && this.owner == infoCenterStudentAbsence.owner && k0.g(this.excuse, infoCenterStudentAbsence.excuse);
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
    
    public final long getKlassenId() {
        return this.klassenId;
    }
    
    public final boolean getOwner() {
        return this.owner;
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
        final int a3 = a4.a.a(this.klassenId);
        final int a4 = a4.a.a(this.absenceReasonId);
        final int excused = this.excused ? 1 : 0;
        int n = 1;
        int n2 = excused;
        if (excused != 0) {
            n2 = 1;
        }
        final int owner = this.owner ? 1 : 0;
        if (owner == 0) {
            n = owner;
        }
        final InfoCenterExcuse excuse = this.excuse;
        int hashCode4;
        if (excuse == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = excuse.hashCode();
        }
        return ((((((((a * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + a2) * 31 + a3) * 31 + a4) * 31 + n2) * 31 + n) * 31 + hashCode4;
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
    
    public final void setKlassenId(final long klassenId) {
        this.klassenId = klassenId;
    }
    
    public final void setOwner(final boolean owner) {
        this.owner = owner;
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
        sb.append("InfoCenterStudentAbsence(id=");
        sb.append(this.id);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", studentId=");
        sb.append(this.studentId);
        sb.append(", klassenId=");
        sb.append(this.klassenId);
        sb.append(", absenceReasonId=");
        sb.append(this.absenceReasonId);
        sb.append(", excused=");
        sb.append(this.excused);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", excuse=");
        sb.append(this.excuse);
        sb.append(')');
        return sb.toString();
    }
}
