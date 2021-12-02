// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentRelatedEntryDto;", "", "", "startDateTime", "Ljava/lang/String;", "getStartDateTime", "()Ljava/lang/String;", "setStartDateTime", "(Ljava/lang/String;)V", "endDateTime", "getEndDateTime", "setEndDateTime", "", "id", "J", "getId", "()J", "setId", "(J)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarTeachingContentRelatedEntryDto
{
    @e
    private String endDateTime;
    private long id;
    @e
    private String startDateTime;
    
    public CalendarTeachingContentRelatedEntryDto(final long id, @e final String startDateTime, @e final String endDateTime) {
        k0.p(startDateTime, "startDateTime");
        k0.p(endDateTime, "endDateTime");
        this.id = id;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
    
    @e
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    public final void setEndDateTime(@e final String endDateTime) {
        k0.p(endDateTime, "<set-?>");
        this.endDateTime = endDateTime;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setStartDateTime(@e final String startDateTime) {
        k0.p(startDateTime, "<set-?>");
        this.startDateTime = startDateTime;
    }
}
