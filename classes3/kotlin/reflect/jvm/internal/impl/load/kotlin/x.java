// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import n6.l;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public final class x implements w<j>
{
    @e
    public static final x a;
    
    static {
        a = new x();
    }
    
    private x() {
    }
    
    @f
    @Override
    public String b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        return w.a.a((w<?>)this, e);
    }
    
    @e
    @Override
    public c0 c(@e final Collection<? extends c0> collection) {
        k0.p((Object)collection, "types");
        throw new AssertionError((Object)k0.C("There should be no intersection type in existing descriptors, but found: ", (Object)v.Z2((Iterable)collection, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 63, (Object)null)));
    }
    
    @f
    @Override
    public String d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "classDescriptor");
        return null;
    }
    
    @f
    @Override
    public c0 e(@e final c0 c0) {
        return w.a.b((w<?>)this, c0);
    }
    
    @Override
    public boolean f() {
        return w.a.c((w<?>)this);
    }
    
    @Override
    public void g(@e final c0 c0, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)c0, "kotlinType");
        k0.p((Object)e, "descriptor");
    }
    
    @f
    public j h(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "classDescriptor");
        return null;
    }
}
