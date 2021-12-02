// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.storage;

import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.o;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public final class m
{
    @e
    public static final <T> T a(@e final i<? extends T> i, @f final Object o, @e final o<?> o2) {
        k0.p((Object)i, "<this>");
        k0.p((Object)o2, "p");
        return (T)((a)i).invoke();
    }
    
    @f
    public static final <T> T b(@e final j<? extends T> j, @f final Object o, @e final o<?> o2) {
        k0.p((Object)j, "<this>");
        k0.p((Object)o2, "p");
        return (T)((a)j).invoke();
    }
}
