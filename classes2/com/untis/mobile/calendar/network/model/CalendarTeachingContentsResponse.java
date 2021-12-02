// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\tR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "", "", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentDto;", "teachingContents", "Ljava/util/List;", "getTeachingContents", "()Ljava/util/List;", "setTeachingContents", "(Ljava/util/List;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarTeachingContentsResponse
{
    @e
    private List<CalendarTeachingContentDto> teachingContents;
    
    public CalendarTeachingContentsResponse(@e final List<CalendarTeachingContentDto> teachingContents) {
        k0.p(teachingContents, "teachingContents");
        this.teachingContents = teachingContents;
    }
    
    @e
    public final List<CalendarTeachingContentDto> getTeachingContents() {
        return this.teachingContents;
    }
    
    public final void setTeachingContents(@e final List<CalendarTeachingContentDto> teachingContents) {
        k0.p(teachingContents, "<set-?>");
        this.teachingContents = teachingContents;
    }
}
