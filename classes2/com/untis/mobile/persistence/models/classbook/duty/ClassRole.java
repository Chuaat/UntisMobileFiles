// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.duty;

import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\r¨\u0006'" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "", "other", "", "equals", "", "hashCode", "", "klasseId", "J", "getKlasseId", "()J", "setKlasseId", "(J)V", "studentId", "getStudentId", "setStudentId", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "end", "Lorg/joda/time/t;", "getEnd", "()Lorg/joda/time/t;", "setEnd", "(Lorg/joda/time/t;)V", "start", "getStart", "setStart", "dutyId", "getDutyId", "setDutyId", "<init>", "(JJJLorg/joda/time/t;Lorg/joda/time/t;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassRole
{
    private long dutyId;
    @e
    private t end;
    private long klasseId;
    @e
    private t start;
    private long studentId;
    @e
    private String text;
    
    public ClassRole() {
        this(0L, 0L, 0L, null, null, null, 63, null);
    }
    
    public ClassRole(final long studentId, final long klasseId, final long dutyId, @e final t start, @e final t end, @e final String text) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        this.studentId = studentId;
        this.klasseId = klasseId;
        this.dutyId = dutyId;
        this.start = start;
        this.end = end;
        this.text = text;
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(ClassRole.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.duty.ClassRole");
        final ClassRole classRole = (ClassRole)obj;
        return this.studentId == classRole.studentId && this.dutyId == classRole.dutyId && k0.g(this.start, classRole.start) && k0.g(this.end, classRole.end);
    }
    
    public final long getDutyId() {
        return this.dutyId;
    }
    
    @e
    public final t getEnd() {
        return this.end;
    }
    
    public final long getKlasseId() {
        return this.klasseId;
    }
    
    @e
    public final t getStart() {
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
        return ((a.a(this.studentId) * 31 + a.a(this.dutyId)) * 31 + this.start.hashCode()) * 31 + this.end.hashCode();
    }
    
    public final void setDutyId(final long dutyId) {
        this.dutyId = dutyId;
    }
    
    public final void setEnd(@e final t end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setKlasseId(final long klasseId) {
        this.klasseId = klasseId;
    }
    
    public final void setStart(@e final t start) {
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
}
