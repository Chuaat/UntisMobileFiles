// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c$a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

final class a implements c
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    private final Void c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }
    
    @e
    public c0 a() {
        this.c();
        throw null;
    }
    
    @e
    public Map<kotlin.reflect.jvm.internal.impl.name.e, g<?>> b() {
        this.c();
        throw null;
    }
    
    @f
    public b f() {
        return c$a.a((c)this);
    }
    
    @e
    public w0 k() {
        this.c();
        throw null;
    }
    
    @e
    @Override
    public String toString() {
        return "[EnhancedType]";
    }
}
