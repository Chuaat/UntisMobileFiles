// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.contacthour;

import kotlin.jvm.internal.k0;
import t5.a;
import com.google.gson.annotations.SerializedName;
import t5.e;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.v;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "", "Lorg/joda/time/v;", "end", "Lorg/joda/time/v;", "getEnd", "()Lorg/joda/time/v;", "setEnd", "(Lorg/joda/time/v;)V", "start", "getStart", "setStart", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;", "state", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;", "getState", "()Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;", "setState", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;)V", "<init>", "(Lorg/joda/time/v;Lorg/joda/time/v;Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlotState;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardContactHourSlot
{
    @JsonAdapter(e.class)
    @SerializedName("endTime")
    @org.jetbrains.annotations.e
    private v end;
    @JsonAdapter(e.class)
    @SerializedName("startTime")
    @org.jetbrains.annotations.e
    private v start;
    @JsonAdapter(a.class)
    @SerializedName("state")
    @org.jetbrains.annotations.e
    private DashboardContactHourSlotState state;
    
    public DashboardContactHourSlot(@org.jetbrains.annotations.e final v start, @org.jetbrains.annotations.e final v end, @org.jetbrains.annotations.e final DashboardContactHourSlotState state) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(state, "state");
        this.start = start;
        this.end = end;
        this.state = state;
    }
    
    @org.jetbrains.annotations.e
    public final v getEnd() {
        return this.end;
    }
    
    @org.jetbrains.annotations.e
    public final v getStart() {
        return this.start;
    }
    
    @org.jetbrains.annotations.e
    public final DashboardContactHourSlotState getState() {
        return this.state;
    }
    
    public final void setEnd(@org.jetbrains.annotations.e final v end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@org.jetbrains.annotations.e final v start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setState(@org.jetbrains.annotations.e final DashboardContactHourSlotState state) {
        k0.p(state, "<set-?>");
        this.state = state;
    }
}
