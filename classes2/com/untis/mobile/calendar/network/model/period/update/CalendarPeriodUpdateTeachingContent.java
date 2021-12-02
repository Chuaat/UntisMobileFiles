// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.update;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdateTeachingContent;", "", "", "component1", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodUpdateTeachingContent
{
    @SerializedName("value")
    @e
    private String value;
    
    public CalendarPeriodUpdateTeachingContent(@e final String value) {
        k0.p(value, "value");
        this.value = value;
    }
    
    @e
    public final String component1() {
        return this.value;
    }
    
    @e
    public final CalendarPeriodUpdateTeachingContent copy(@e final String s) {
        k0.p(s, "value");
        return new CalendarPeriodUpdateTeachingContent(s);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof CalendarPeriodUpdateTeachingContent && k0.g(this.value, ((CalendarPeriodUpdateTeachingContent)o).value));
    }
    
    @e
    public final String getValue() {
        return this.value;
    }
    
    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
    
    public final void setValue(@e final String value) {
        k0.p(value, "<set-?>");
        this.value = value;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodUpdateTeachingContent(value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
