// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import java.io.Serializable;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class c
{
    public static final boolean a(@e final Throwable t) {
        k0.p((Object)t, "<this>");
        Serializable s = t.getClass();
        while (!k0.g((Object)((Class)s).getCanonicalName(), (Object)"com.intellij.openapi.progress.ProcessCanceledException")) {
            if ((s = ((Class<? extends Throwable>)s).getSuperclass()) == null) {
                return false;
            }
        }
        return true;
    }
    
    @e
    public static final RuntimeException b(@e final Throwable t) {
        k0.p((Object)t, "e");
        throw t;
    }
}
