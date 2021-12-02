// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.types.w0;

public final class p implements w0
{
    private final long a;
    @e
    private final e0 b;
    @e
    private final ArrayList<c0> c;
    
    @e
    @Override
    public w0 b(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @f
    public Void e() {
        return null;
    }
    
    @e
    @Override
    public List<b1> getParameters() {
        return (List<b1>)v.E();
    }
    
    @e
    @Override
    public Collection<c0> k() {
        return this.c;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IntegerValueType(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        return this.b.w();
    }
}
