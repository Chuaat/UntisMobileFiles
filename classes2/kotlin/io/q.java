// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0007" }, d2 = { "Ljava/io/File;", "Lkotlin/io/m;", "direction", "Lkotlin/io/k;", "J", "M", "L", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/FilesKt")
class q extends p
{
    public q() {
    }
    
    @e
    public static final k J(@e final File file, @e final m m) {
        k0.p(file, "$this$walk");
        k0.p(m, "direction");
        return new k(file, m);
    }
    
    @e
    public static final k L(@e final File file) {
        k0.p(file, "$this$walkBottomUp");
        return J(file, m.H);
    }
    
    @e
    public static final k M(@e final File file) {
        k0.p(file, "$this$walkTopDown");
        return J(file, m.G);
    }
}
