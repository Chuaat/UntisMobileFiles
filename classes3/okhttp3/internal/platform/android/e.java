// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Ljava/util/logging/LogRecord;", "", "b", "(Ljava/util/logging/LogRecord;)I", "androidLevel", "okhttp" }, k = 2, mv = { 1, 4, 0 })
public final class e
{
    private static final int b(final LogRecord logRecord) {
        int n;
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            n = 5;
        }
        else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            n = 4;
        }
        else {
            n = 3;
        }
        return n;
    }
}
