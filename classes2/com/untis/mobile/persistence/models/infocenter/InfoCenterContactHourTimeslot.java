// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.joda.time.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006 " }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslot;", "", "Lorg/joda/time/c;", "component1", "component2", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "component3", "start", "end", "state", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "getState", "()Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;", "setState", "(Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;)V", "getStart", "setStart", "<init>", "(Lorg/joda/time/c;Lorg/joda/time/c;Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHourTimeslotState;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterContactHourTimeslot
{
    @e
    private c end;
    @e
    private c start;
    @e
    private InfoCenterContactHourTimeslotState state;
    
    public InfoCenterContactHourTimeslot(@e final c start, @e final c end, @e final InfoCenterContactHourTimeslotState state) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(state, "state");
        this.start = start;
        this.end = end;
        this.state = state;
    }
    
    @e
    public final c component1() {
        return this.start;
    }
    
    @e
    public final c component2() {
        return this.end;
    }
    
    @e
    public final InfoCenterContactHourTimeslotState component3() {
        return this.state;
    }
    
    @e
    public final InfoCenterContactHourTimeslot copy(@e final c c, @e final c c2, @e final InfoCenterContactHourTimeslotState infoCenterContactHourTimeslotState) {
        k0.p(c, "start");
        k0.p(c2, "end");
        k0.p(infoCenterContactHourTimeslotState, "state");
        return new InfoCenterContactHourTimeslot(c, c2, infoCenterContactHourTimeslotState);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterContactHourTimeslot)) {
            return false;
        }
        final InfoCenterContactHourTimeslot infoCenterContactHourTimeslot = (InfoCenterContactHourTimeslot)o;
        return k0.g(this.start, infoCenterContactHourTimeslot.start) && k0.g(this.end, infoCenterContactHourTimeslot.end) && this.state == infoCenterContactHourTimeslot.state;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final InfoCenterContactHourTimeslotState getState() {
        return this.state;
    }
    
    @Override
    public int hashCode() {
        return (((org.joda.time.base.c)this.start).hashCode() * 31 + ((org.joda.time.base.c)this.end).hashCode()) * 31 + this.state.hashCode();
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setState(@e final InfoCenterContactHourTimeslotState state) {
        k0.p(state, "<set-?>");
        this.state = state;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterContactHourTimeslot(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(')');
        return sb.toString();
    }
}
