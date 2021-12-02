// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.EnumMap;

public final class w
{
    @e
    private final EnumMap<a, s> a;
    
    public w(@e final EnumMap<a, s> a) {
        k0.p((Object)a, "defaultQualifiers");
        this.a = a;
    }
    
    @f
    public final s a(@f final a key) {
        return this.a.get(key);
    }
    
    @e
    public final EnumMap<a, s> b() {
        return this.a;
    }
}
