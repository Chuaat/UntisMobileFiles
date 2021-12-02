// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.reflect.jvm.internal.impl.utils.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.z;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import org.jetbrains.annotations.e;

public final class h implements k
{
    @e
    private final g a;
    @e
    private final m b;
    private final int c;
    @e
    private final Map<y, Integer> d;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.h<y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m> e;
    
    public h(@e final g a, @e final m b, @e final z z, final int c) {
        k0.p((Object)a, "c");
        k0.p((Object)b, "containingDeclaration");
        k0.p((Object)z, "typeParameterOwner");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.reflect.jvm.internal.impl.utils.a.d((Iterable<? extends y>)z.getTypeParameters());
        this.e = a.e().i((n6.l<? super y, ? extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m>)new l<y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m>() {
            final /* synthetic */ h G;
            
            @f
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m a(@e final y y) {
                k0.p((Object)y, "typeParameter");
                final Integer n = h.d(this.G).get(y);
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m m;
                if (n == null) {
                    m = null;
                }
                else {
                    final h g = this.G;
                    m = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.h(kotlin.reflect.jvm.internal.impl.load.java.lazy.a.b(h.b(g), g), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)h.c(g)).getAnnotations()), y, h.e(g) + n.intValue(), h.c(g));
                }
                return m;
            }
        });
    }
    
    public static final /* synthetic */ g b(final h h) {
        return h.a;
    }
    
    public static final /* synthetic */ m c(final h h) {
        return h.b;
    }
    
    public static final /* synthetic */ Map d(final h h) {
        return h.d;
    }
    
    public static final /* synthetic */ int e(final h h) {
        return h.c;
    }
    
    @f
    @Override
    public b1 a(@e final y y) {
        k0.p((Object)y, "javaTypeParameter");
        Object a;
        if ((a = ((l)this.e).invoke((Object)y)) == null) {
            a = this.a.f().a(y);
        }
        return (b1)a;
    }
}
