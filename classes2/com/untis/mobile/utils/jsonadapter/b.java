// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.jsonadapter;

import java.util.Iterator;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.f;
import com.google.gson.stream.JsonReader;
import kotlin.Metadata;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import java.util.List;
import com.google.gson.TypeAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/jsonadapter/b;", "Lcom/google/gson/TypeAdapter;", "", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "Lcom/google/gson/stream/JsonWriter;", "writer", "permissions", "Lkotlin/j2;", "b", "Lcom/google/gson/stream/JsonReader;", "reader", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends TypeAdapter<List<? extends CalendarPeriodPermission>>
{
    @f
    public List<CalendarPeriodPermission> a(@f final JsonReader jsonReader) {
        if (jsonReader == null) {
            return null;
        }
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            final ArrayList<CalendarPeriodPermission> list = new ArrayList<CalendarPeriodPermission>();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.STRING) {
                    final CalendarPeriodPermission byKey = CalendarPeriodPermission.Companion.findByKey(jsonReader.nextString());
                    if (byKey == null) {
                        continue;
                    }
                    list.add(byKey);
                }
                else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endArray();
            return list;
        }
        jsonReader.skipValue();
        return null;
    }
    
    public void b(@f final JsonWriter jsonWriter, @f final List<? extends CalendarPeriodPermission> list) {
        if (jsonWriter == null) {
            return;
        }
        if (list == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        final Iterator<CalendarPeriodPermission> iterator = list.iterator();
        while (iterator.hasNext()) {
            jsonWriter.value(iterator.next().getKey());
        }
        jsonWriter.endArray();
    }
}
