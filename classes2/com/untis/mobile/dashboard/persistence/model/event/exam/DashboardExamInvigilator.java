// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.event.exam;

import kotlin.jvm.internal.k0;
import com.google.gson.annotations.SerializedName;
import t5.e;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.v;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExamInvigilator;", "", "Lorg/joda/time/v;", "end", "Lorg/joda/time/v;", "getEnd", "()Lorg/joda/time/v;", "setEnd", "(Lorg/joda/time/v;)V", "start", "getStart", "setStart", "", "teacherId", "J", "getTeacherId", "()J", "setTeacherId", "(J)V", "<init>", "(JLorg/joda/time/v;Lorg/joda/time/v;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardExamInvigilator
{
    @JsonAdapter(e.class)
    @SerializedName("endTime")
    @org.jetbrains.annotations.e
    private v end;
    @JsonAdapter(e.class)
    @SerializedName("startTime")
    @org.jetbrains.annotations.e
    private v start;
    @SerializedName("id")
    private long teacherId;
    
    public DashboardExamInvigilator(final long teacherId, @org.jetbrains.annotations.e final v start, @org.jetbrains.annotations.e final v end) {
        k0.p(start, "start");
        k0.p(end, "end");
        this.teacherId = teacherId;
        this.start = start;
        this.end = end;
    }
    
    @org.jetbrains.annotations.e
    public final v getEnd() {
        return this.end;
    }
    
    @org.jetbrains.annotations.e
    public final v getStart() {
        return this.start;
    }
    
    public final long getTeacherId() {
        return this.teacherId;
    }
    
    public final void setEnd(@org.jetbrains.annotations.e final v end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@org.jetbrains.annotations.e final v start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTeacherId(final long teacherId) {
        this.teacherId = teacherId;
    }
}
