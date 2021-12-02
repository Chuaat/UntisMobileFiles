// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import java.util.logging.Handler;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n" }, d2 = { "Lokhttp3/internal/platform/android/d;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lkotlin/j2;", "publish", "flush", "close", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d extends Handler
{
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void publish(@e final LogRecord logRecord) {
        k0.p((Object)logRecord, "record");
        final c d = c.d;
        final String loggerName = logRecord.getLoggerName();
        k0.o((Object)loggerName, "record.loggerName");
        final int a = okhttp3.internal.platform.android.e.a(logRecord);
        final String message = logRecord.getMessage();
        k0.o((Object)message, "record.message");
        d.a(loggerName, a, message, logRecord.getThrown());
    }
}
