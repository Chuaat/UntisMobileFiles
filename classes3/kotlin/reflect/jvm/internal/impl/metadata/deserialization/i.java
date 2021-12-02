// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import java.util.List;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    public static final a b;
    @e
    private static final i c;
    @e
    private final List<kotlin.reflect.jvm.internal.impl.metadata.a.v> a;
    
    static {
        b = new a(null);
        c = new i(v.E());
    }
    
    private i(final List<kotlin.reflect.jvm.internal.impl.metadata.a.v> a) {
        this.a = a;
    }
    
    public static final /* synthetic */ i a() {
        return i.c;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.metadata.a.v b(final int n) {
        return (kotlin.reflect.jvm.internal.impl.metadata.a.v)v.J2((List)this.a, n);
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final i a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.w w) {
            k0.p((Object)w, "table");
            i b;
            if (w.x() == 0) {
                b = this.b();
            }
            else {
                final List<kotlin.reflect.jvm.internal.impl.metadata.a.v> y = w.y();
                k0.o((Object)y, "table.requirementList");
                b = new i(y, null);
            }
            return b;
        }
        
        @e
        public final i b() {
            return i.a();
        }
    }
}
