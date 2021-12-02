// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import org.jetbrains.annotations.f;
import kotlin.j2;
import java.text.ParsePosition;
import kotlin.jvm.internal.k0;
import java.util.Date;
import org.jetbrains.annotations.e;
import okhttp3.internal.d;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000+\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0007\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0016\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "", "Ljava/util/Date;", "a", "b", "", "J", "MAX_DATE", "okhttp3/internal/http/c$a", "Lokhttp3/internal/http/c$a;", "STANDARD_DATE_FORMAT", "", "c", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "d", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    public static final long a = 253402300799999L;
    private static final c$a b;
    private static final String[] c;
    private static final DateFormat[] d;
    
    static {
        b = new ThreadLocal<DateFormat>() {
            @e
            protected DateFormat a() {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(okhttp3.internal.d.f);
                return simpleDateFormat;
            }
        };
        d = new DateFormat[(c = new String[] { "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" }).length];
    }
    
    @f
    public static final Date a(@e final String s) {
        k0.p((Object)s, "$this$toHttpDateOrNull");
        if (s.length() == 0) {
            return null;
        }
        final ParsePosition parsePosition = new ParsePosition(0);
        final Date parse = okhttp3.internal.http.c.b.get().parse(s, parsePosition);
        if (parsePosition.getIndex() == s.length()) {
            return parse;
        }
        final String[] c = okhttp3.internal.http.c.c;
        synchronized (c) {
            for (int length = c.length, i = 0; i < length; ++i) {
                final DateFormat[] d = okhttp3.internal.http.c.d;
                DateFormat dateFormat;
                if ((dateFormat = d[i]) == null) {
                    dateFormat = new SimpleDateFormat(okhttp3.internal.http.c.c[i], Locale.US);
                    dateFormat.setTimeZone(okhttp3.internal.d.f);
                    d[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                final Date parse2 = dateFormat.parse(s, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            final j2 a = j2.a;
            return null;
        }
    }
    
    @e
    public static final String b(@e final Date date) {
        k0.p((Object)date, "$this$toHttpDateString");
        final String format = okhttp3.internal.http.c.b.get().format(date);
        k0.o((Object)format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
