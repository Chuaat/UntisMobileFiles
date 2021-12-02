// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.error;

import android.util.Log;
import org.jetbrains.annotations.f;
import com.google.gson.Gson;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.network.model.CalendarApiError;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.IOException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f" }, d2 = { "Lcom/untis/mobile/calendar/network/error/b;", "Ljava/io/IOException;", "Lokio/IOException;", "Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "G", "Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "a", "()Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "calendarApiError", "<init>", "(Lcom/untis/mobile/calendar/network/model/CalendarApiError;)V", "H", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends IOException
{
    @e
    public static final a H;
    @e
    private final CalendarApiError G;
    
    static {
        H = new a(null);
    }
    
    public b(@e final CalendarApiError g) {
        k0.p(g, "calendarApiError");
        this.G = g;
    }
    
    @e
    public final CalendarApiError a() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/calendar/network/error/b$a", "", "Lcom/google/gson/Gson;", "gson", "", "json", "Lcom/untis/mobile/calendar/network/error/b;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final b a(@e final Gson gson, @f final String obj) {
            k0.p(gson, "gson");
            b b;
            try {
                final CalendarApiError fromJson = gson.fromJson(obj, CalendarApiError.class);
                k0.o(fromJson, "gson.fromJson(json, CalendarApiError::class.java)");
                b = new b(fromJson);
            }
            catch (Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("error on calendar api error exception mapping with json: '");
                sb.append((Object)obj);
                sb.append('\'');
                Log.e("untis_log_cal_net", sb.toString(), (Throwable)ex);
                b = new b(new CalendarApiError("0", "could not fetch error message", "", ""));
            }
            return b;
        }
    }
}
