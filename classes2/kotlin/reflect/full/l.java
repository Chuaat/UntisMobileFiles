// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "Lkotlin/reflect/full/l;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
@e1(version = "1.1")
public final class l extends Exception
{
    public l() {
        this(null, 1, null);
    }
    
    public l(@f final Exception cause) {
        super(cause);
    }
}
