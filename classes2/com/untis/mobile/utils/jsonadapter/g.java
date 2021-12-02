// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.jsonadapter;

import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.f;
import com.google.gson.stream.JsonReader;
import kotlin.Metadata;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.google.gson.TypeAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/jsonadapter/g;", "Lcom/google/gson/TypeAdapter;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "Lcom/google/gson/stream/JsonWriter;", "writer", "type", "Lkotlin/j2;", "b", "Lcom/google/gson/stream/JsonReader;", "reader", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g extends TypeAdapter<CalendarPeriodType>
{
    @f
    public CalendarPeriodType a(@f final JsonReader jsonReader) {
        if (jsonReader == null) {
            return null;
        }
        if (jsonReader.peek() == JsonToken.STRING) {
            return CalendarPeriodType.Companion.findByKey(jsonReader.nextString());
        }
        jsonReader.skipValue();
        return null;
    }
    
    public void b(@f final JsonWriter jsonWriter, @f final CalendarPeriodType calendarPeriodType) {
        if (jsonWriter == null) {
            return;
        }
        if (calendarPeriodType == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(calendarPeriodType.getKey());
    }
}
