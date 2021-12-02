// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.jsonadapter;

import org.joda.time.base.a;
import com.google.gson.stream.JsonWriter;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.f;
import com.google.gson.stream.JsonReader;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.joda.time.c;
import com.google.gson.TypeAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r" }, d2 = { "Lcom/untis/mobile/utils/jsonadapter/h;", "Lcom/google/gson/TypeAdapter;", "Lorg/joda/time/c;", "Lcom/google/gson/stream/JsonWriter;", "writer", "dateTime", "Lkotlin/j2;", "b", "Lcom/google/gson/stream/JsonReader;", "reader", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends TypeAdapter<c>
{
    @e
    public static final a a;
    @e
    private static final String b = "yyyy-MM-dd'T'HH:mm:00'Z'";
    
    static {
        a = new a(null);
    }
    
    @f
    public c a(@f final JsonReader jsonReader) {
        final c c = null;
        if (jsonReader == null) {
            return null;
        }
        Label_0046: {
            if (jsonReader.peek() != JsonToken.STRING) {
                break Label_0046;
            }
            try {
                final String nextString = jsonReader.nextString();
                k0.o(nextString, "reader.nextString()");
                return org.joda.time.c.K0(s.k2(nextString, "Z", "", false, 4, (Object)null));
                jsonReader.skipValue();
                return null;
            }
            catch (Exception ex) {
                return c;
            }
        }
    }
    
    public void b(@f final JsonWriter jsonWriter, @f final c c) {
        if (jsonWriter == null) {
            return;
        }
        if (c == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.value(((org.joda.time.base.a)c).g4("yyyy-MM-dd'T'HH:mm:00'Z'"));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/utils/jsonadapter/h$a", "", "", "ISO_DATE_TIME_PATTERN", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
