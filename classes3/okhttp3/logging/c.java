// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.logging;

import java.io.EOFException;
import kotlin.ranges.o;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.m;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003" }, d2 = { "Lokio/m;", "", "a", "okhttp-logging-interceptor" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    public static final boolean a(@e final m m) {
        k0.p((Object)m, "$this$isProbablyUtf8");
        try {
            final m i = new m();
            m.s(i, 0L, o.v(m.h0(), 64L));
            for (int n = 0; n < 16 && !i.D1(); ++n) {
                final int q3 = i.q3();
                if (Character.isISOControl(q3) && !Character.isWhitespace(q3)) {
                    return false;
                }
            }
            return true;
        }
        catch (EOFException ex) {
            return false;
        }
    }
}
