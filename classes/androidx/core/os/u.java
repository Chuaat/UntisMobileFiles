// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import kotlin.z0;
import kotlin.i;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007" }, d2 = { "T", "", "sectionName", "Lkotlin/Function0;", "block", "a", "(Ljava/lang/String;Ln6/a;)Ljava/lang/Object;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class u
{
    @i(message = "Use androidx.tracing.Trace instead", replaceWith = @z0(expression = "trace(sectionName)", imports = { "androidx.tracing.trace" }))
    public static final <T> T a(@e final String s, @e final a<? extends T> a) {
        k0.p((Object)s, "sectionName");
        k0.p((Object)a, "block");
        t.b(s);
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            t.d();
            h0.c(1);
        }
    }
}
