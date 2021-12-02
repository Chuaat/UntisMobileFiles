// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;

public final class f
{
    @e
    private final c a;
    @e
    private final a.c b;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c;
    @e
    private final w0 d;
    
    public f(@e final c a, @e final a.c b, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c, @e final w0 d) {
        k0.p((Object)a, "nameResolver");
        k0.p((Object)b, "classProto");
        k0.p((Object)c, "metadataVersion");
        k0.p((Object)d, "sourceElement");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @e
    public final c a() {
        return this.a;
    }
    
    @e
    public final a.c b() {
        return this.b;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a c() {
        return this.c;
    }
    
    @e
    public final w0 d() {
        return this.d;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return k0.g((Object)this.a, (Object)f.a) && k0.g((Object)this.b, (Object)f.b) && k0.g((Object)this.c, (Object)f.c) && k0.g((Object)this.d, (Object)f.d);
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassData(nameResolver=");
        sb.append(this.a);
        sb.append(", classProto=");
        sb.append(this.b);
        sb.append(", metadataVersion=");
        sb.append(this.c);
        sb.append(", sourceElement=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
