// 
// Decompiled by Procyon v0.5.36
// 

package y6;

import kotlin.internal.f;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¨\u0006\u0004" }, d2 = { "", "status", "", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "ProcessKt")
public final class a
{
    @f
    private static final Void a(final int status) {
        System.exit(status);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
