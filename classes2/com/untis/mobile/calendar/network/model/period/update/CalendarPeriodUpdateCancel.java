// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.update;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancel;", "", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancelType;", "component1", "value", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancelType;", "getValue", "()Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancelType;", "setValue", "(Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateCancelType;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodUpdateCancel
{
    @SerializedName("value")
    @e
    private CalendarPeriodUpdateCancelType value;
    
    public CalendarPeriodUpdateCancel(@e final CalendarPeriodUpdateCancelType value) {
        k0.p(value, "value");
        this.value = value;
    }
    
    @e
    public final CalendarPeriodUpdateCancelType component1() {
        return this.value;
    }
    
    @e
    public final CalendarPeriodUpdateCancel copy(@e final CalendarPeriodUpdateCancelType calendarPeriodUpdateCancelType) {
        k0.p(calendarPeriodUpdateCancelType, "value");
        return new CalendarPeriodUpdateCancel(calendarPeriodUpdateCancelType);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof CalendarPeriodUpdateCancel && this.value == ((CalendarPeriodUpdateCancel)o).value);
    }
    
    @e
    public final CalendarPeriodUpdateCancelType getValue() {
        return this.value;
    }
    
    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
    
    public final void setValue(@e final CalendarPeriodUpdateCancelType value) {
        k0.p(value, "<set-?>");
        this.value = value;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodUpdateCancel(value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
