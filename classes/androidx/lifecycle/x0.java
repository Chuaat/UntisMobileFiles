// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.coroutines.g;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p3;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b" }, d2 = { "", "a", "Ljava/lang/String;", "JOB_KEY", "Landroidx/lifecycle/w0;", "Lkotlinx/coroutines/r0;", "(Landroidx/lifecycle/w0;)Lkotlinx/coroutines/r0;", "viewModelScope", "lifecycle-viewmodel-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class x0
{
    private static final String a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";
    
    @e
    public static final r0 a(@e final w0 w0) {
        k0.q((Object)w0, "$this$viewModelScope");
        final r0 r0 = w0.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (r0 != null) {
            return r0;
        }
        final androidx.lifecycle.e setTagIfAbsent = w0.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new androidx.lifecycle.e(((g)p3.c((k2)null, 1, (Object)null)).plus((g)i1.e().M())));
        k0.h((Object)setTagIfAbsent, "setTagIfAbsent(JOB_KEY,\n\u2026patchers.Main.immediate))");
        return (r0)setTagIfAbsent;
    }
}
