// 
// Decompiled by Procyon v0.5.36
// 

package k7;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lk7/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "msg", "parent", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class c extends Exception
{
    public c(@e final String message, @e final Exception cause) {
        k0.q((Object)message, "msg");
        k0.q((Object)cause, "parent");
        super(message, cause);
    }
}
