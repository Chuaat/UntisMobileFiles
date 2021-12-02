// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentDto;", "", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentRelatedEntryDto;", "relatedEntries", "Ljava/util/List;", "getRelatedEntries", "()Ljava/util/List;", "setRelatedEntries", "(Ljava/util/List;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarTeachingContentDto
{
    @e
    private List<CalendarTeachingContentRelatedEntryDto> relatedEntries;
    @e
    private String text;
    
    public CalendarTeachingContentDto(@e final List<CalendarTeachingContentRelatedEntryDto> relatedEntries, @e final String text) {
        k0.p(relatedEntries, "relatedEntries");
        k0.p(text, "text");
        this.relatedEntries = relatedEntries;
        this.text = text;
    }
    
    @e
    public final List<CalendarTeachingContentRelatedEntryDto> getRelatedEntries() {
        return this.relatedEntries;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    public final void setRelatedEntries(@e final List<CalendarTeachingContentRelatedEntryDto> relatedEntries) {
        k0.p(relatedEntries, "<set-?>");
        this.relatedEntries = relatedEntries;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
}
