// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.io.InputStream;
import org.jetbrains.annotations.e;

public final class c
{
    @f
    public final InputStream a(@e final String s) {
        k0.p((Object)s, "path");
        final ClassLoader classLoader = c.class.getClassLoader();
        InputStream resourceAsStream;
        if (classLoader == null) {
            resourceAsStream = null;
        }
        else {
            resourceAsStream = classLoader.getResourceAsStream(s);
        }
        InputStream systemResourceAsStream = resourceAsStream;
        if (resourceAsStream == null) {
            systemResourceAsStream = ClassLoader.getSystemResourceAsStream(s);
        }
        return systemResourceAsStream;
    }
}
