// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;

public final class e
{
    @f
    public static final Class<?> a(@org.jetbrains.annotations.e final ClassLoader loader, @org.jetbrains.annotations.e final String name) {
        k0.p((Object)loader, "<this>");
        k0.p((Object)name, "fqName");
        Class<?> forName;
        try {
            forName = Class.forName(name, false, loader);
        }
        catch (ClassNotFoundException ex) {
            forName = null;
        }
        return forName;
    }
}
