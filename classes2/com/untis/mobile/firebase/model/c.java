// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase.model;

import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/firebase/model/c;", "", "", "G", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "apiKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "H", "a", "b", "OpenAskTeacher", "OpenMessages", "ReloadTimetable", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum c
{
    @e
    public static final a H;
    
    I("OPEN_ASK_TEACHER"), 
    J("OPEN_MESSAGES"), 
    K("RELOAD_TIMETABLE");
    
    @e
    private final String G;
    
    static {
        L = b();
        H = new a(null);
    }
    
    private c(final String g) {
        this.G = g;
    }
    
    private static final /* synthetic */ c[] b() {
        return new c[] { c.I, c.J, c.K };
    }
    
    @e
    public final String d() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/firebase/model/c$a", "", "", "apiKey", "Lcom/untis/mobile/firebase/model/c;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @f
        public final c a(@f final String s) {
            for (final c c : c.values()) {
                if (k0.g(c.d(), s)) {
                    return c;
                }
            }
            return null;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r" }, d2 = { "com/untis/mobile/firebase/model/c$b", "Lcom/google/gson/TypeAdapter;", "Lcom/untis/mobile/firebase/model/c;", "Lcom/google/gson/stream/JsonWriter;", "writer", "value", "Lkotlin/j2;", "b", "Lcom/google/gson/stream/JsonReader;", "reader", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b extends TypeAdapter<c>
    {
        @f
        public c a(@f final JsonReader jsonReader) {
            if (jsonReader == null) {
                return null;
            }
            if (jsonReader.peek() == JsonToken.STRING) {
                return c.H.a(jsonReader.nextString());
            }
            jsonReader.skipValue();
            return null;
        }
        
        public void b(@f final JsonWriter jsonWriter, @f final c c) {
            if (jsonWriter == null) {
                return;
            }
            if (c == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.value(c.d());
        }
    }
}
