// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public class c implements d, g
{
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.e a;
    @org.jetbrains.annotations.e
    private final c b;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.descriptors.e c;
    
    public c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @f final c c) {
        k0.p((Object)e, "classDescriptor");
        this.a = e;
        c b = c;
        if (c == null) {
            b = this;
        }
        this.b = b;
        this.c = e;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.types.k0 c() {
        final kotlin.reflect.jvm.internal.impl.types.k0 a = this.a.A();
        k0.o((Object)a, "classDescriptor.defaultType");
        return a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        final kotlin.reflect.jvm.internal.impl.descriptors.e a = this.a;
        final boolean b = o instanceof c;
        final Object o2 = null;
        c c;
        if (b) {
            c = (c)o;
        }
        else {
            c = null;
        }
        Object a2;
        if (c == null) {
            a2 = o2;
        }
        else {
            a2 = c.a;
        }
        return k0.g((Object)a, a2);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Class{");
        sb.append(this.c());
        sb.append('}');
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final kotlin.reflect.jvm.internal.impl.descriptors.e y() {
        return this.a;
    }
}
