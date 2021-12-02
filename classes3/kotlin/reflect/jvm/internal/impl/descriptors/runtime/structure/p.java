// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import java.lang.reflect.Type;
import java.lang.reflect.Member;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;

public final class p extends r implements n
{
    @e
    private final Field a;
    
    public p(@e final Field a) {
        k0.p((Object)a, "member");
        this.a = a;
    }
    
    @Override
    public boolean F() {
        return this.V().isEnumConstant();
    }
    
    @Override
    public boolean N() {
        return false;
    }
    
    @e
    public Field V() {
        return this.a;
    }
    
    @e
    public w W() {
        final w.a a = w.a;
        final Type genericType = this.V().getGenericType();
        k0.o((Object)genericType, "member.genericType");
        return a.a(genericType);
    }
}
