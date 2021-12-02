// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;

public abstract class d implements b
{
    @e
    public static final a b;
    @f
    private final kotlin.reflect.jvm.internal.impl.name.e a;
    
    static {
        b = new a(null);
    }
    
    public d(@f final kotlin.reflect.jvm.internal.impl.name.e a) {
        this.a = a;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        return this.a;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final d a(@e final Object o, @f final kotlin.reflect.jvm.internal.impl.name.e e) {
            k0.p(o, "value");
            d d;
            if (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.i(o.getClass())) {
                d = new o(e, (Enum<?>)o);
            }
            else if (o instanceof Annotation) {
                d = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e(e, (Annotation)o);
            }
            else if (o instanceof Object[]) {
                d = new h(e, (Object[])o);
            }
            else if (o instanceof Class) {
                d = new k(e, (Class<?>)o);
            }
            else {
                d = new q(e, o);
            }
            return d;
        }
    }
}
