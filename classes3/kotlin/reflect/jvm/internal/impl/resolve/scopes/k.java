// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.e;

public interface k
{
    @org.jetbrains.annotations.e
    Collection<? extends y> a(@org.jetbrains.annotations.e final e p0, @org.jetbrains.annotations.e final b p1);
    
    @org.jetbrains.annotations.e
    Collection<m> e(@org.jetbrains.annotations.e final d p0, @org.jetbrains.annotations.e final l<? super e, Boolean> p1);
    
    @f
    h g(@org.jetbrains.annotations.e final e p0, @org.jetbrains.annotations.e final b p1);
    
    void h(@org.jetbrains.annotations.e final e p0, @org.jetbrains.annotations.e final b p1);
    
    public static final class a
    {
        public static void b(@org.jetbrains.annotations.e final k k, @org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final b b) {
            k0.p((Object)k, "this");
            k0.p((Object)e, "name");
            k0.p((Object)b, "location");
            k.a(e, b);
        }
    }
}
