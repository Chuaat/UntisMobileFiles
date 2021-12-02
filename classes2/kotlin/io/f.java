// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.k0;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0006" }, d2 = { "Ljava/io/File;", "file", "other", "", "reason", "b", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class f
{
    private static final String b(final File file, final File obj, final String str) {
        final StringBuilder sb = new StringBuilder(file.toString());
        if (obj != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" -> ");
            sb2.append(obj);
            sb.append(sb2.toString());
        }
        if (str != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        final String string = sb.toString();
        k0.o(string, "sb.toString()");
        return string;
    }
}
