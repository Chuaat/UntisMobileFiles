// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.jsonadapter;

import com.google.gson.stream.JsonWriter;
import com.untis.mobile.utils.extension.d;
import kotlin.jvm.internal.k0;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.f;
import com.google.gson.stream.JsonReader;
import kotlin.Metadata;
import com.google.gson.TypeAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/utils/jsonadapter/i;", "Lcom/google/gson/TypeAdapter;", "", "Lcom/google/gson/stream/JsonWriter;", "writer", "color", "Lkotlin/j2;", "b", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Integer;)V", "Lcom/google/gson/stream/JsonReader;", "reader", "a", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Integer;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends TypeAdapter<Integer>
{
    @f
    public Integer a(@f final JsonReader jsonReader) {
        if (jsonReader == null) {
            return null;
        }
        if (jsonReader.peek() == JsonToken.STRING) {
            final String nextString = jsonReader.nextString();
            k0.o(nextString, "reader.nextString()");
            return d.a(nextString);
        }
        jsonReader.skipValue();
        return null;
    }
    
    public void b(@f final JsonWriter jsonWriter, @f final Integer n) {
        if (jsonWriter == null) {
            return;
        }
        if (n == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(d.b(n));
    }
}
