// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.text.s;
import java.util.logging.Handler;
import java.util.logging.Level;
import android.util.Log;
import kotlin.collections.y0;
import okhttp3.internal.concurrent.d;
import okhttp3.internal.http2.e;
import kotlin.jvm.internal.k0;
import okhttp3.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001c" }, d2 = { "Lokhttp3/internal/platform/android/c;", "", "", "loggerName", "d", "logger", "tag", "Lkotlin/j2;", "c", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "I", "MAX_LOG_LENGTH", "", "Ljava/util/Map;", "knownLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
@okhttp3.internal.c
public final class c
{
    private static final int a = 4000;
    private static final CopyOnWriteArraySet<Logger> b;
    private static final Map<String, String> c;
    public static final c d;
    
    static {
        d = new c();
        b = new CopyOnWriteArraySet<Logger>();
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        final Package package1 = c0.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        final String name2 = c0.class.getName();
        k0.o((Object)name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        final String name3 = e.class.getName();
        k0.o((Object)name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        final String name4 = d.class.getName();
        k0.o((Object)name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = y0.D0((Map)linkedHashMap);
    }
    
    private c() {
    }
    
    private final void c(final String name, final String s) {
        final Logger logger = Logger.getLogger(name);
        if (okhttp3.internal.platform.android.c.b.add(logger)) {
            k0.o((Object)logger, "logger");
            logger.setUseParentHandlers(false);
            Level level;
            if (Log.isLoggable(s, 3)) {
                level = Level.FINE;
            }
            else if (Log.isLoggable(s, 4)) {
                level = Level.INFO;
            }
            else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(okhttp3.internal.platform.android.d.a);
        }
    }
    
    private final String d(String o8) {
        final String s = okhttp3.internal.platform.android.c.c.get(o8);
        if (s != null) {
            o8 = s;
        }
        else {
            o8 = kotlin.text.s.O8(o8, 23);
        }
        return o8;
    }
    
    public final void a(@org.jetbrains.annotations.e String string, final int n, @org.jetbrains.annotations.e String substring, @f final Throwable t) {
        k0.p((Object)string, "loggerName");
        k0.p((Object)substring, "message");
        final String d = this.d(string);
        if (Log.isLoggable(d, n)) {
            string = substring;
            if (t != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append("\n");
                sb.append(Log.getStackTraceString(t));
                string = sb.toString();
            }
            int min;
            for (int i = 0, length = string.length(); i < length; i = min + 1) {
                int q3 = s.q3(string, '\n', i, false, 4, null);
                if (q3 == -1) {
                    q3 = length;
                }
                while (true) {
                    min = Math.min(q3, i + 4000);
                    substring = string.substring(i, min);
                    k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    Log.println(n, d, substring);
                    if (min >= q3) {
                        break;
                    }
                    i = min;
                }
            }
        }
    }
    
    public final void b() {
        for (final Map.Entry<String, String> entry : okhttp3.internal.platform.android.c.c.entrySet()) {
            this.c(entry.getKey(), entry.getValue());
        }
    }
}
