// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.e;

public final class a extends e
{
    @org.jetbrains.annotations.e
    public static final a e;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.name.e f;
    
    static {
        e = new a(null);
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i("clone");
        k0.o(i, "identifier(\"clone\")");
        f = i;
    }
    
    public a(@org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(n, "storageManager");
        k0.p(e, "containingClass");
        super(n, e);
    }
    
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.e n() {
        return a.f;
    }
    
    @org.jetbrains.annotations.e
    protected List<y> j() {
        final f0 m1 = f0.m1(this.m(), g.r.b(), a.e.a(), b.a.G, w0.a);
        m1.o1(null, this.m().K0(), v.E(), v.E(), (c0)a.g((m)this.m()).getAnyType(), b0.J, t.c);
        return (List<y>)v.k(m1);
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.reflect.jvm.internal.impl.name.e a() {
            return kotlin.reflect.jvm.internal.impl.builtins.jvm.a.n();
        }
    }
}
