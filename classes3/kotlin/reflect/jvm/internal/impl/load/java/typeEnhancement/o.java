// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

final class o
{
    @e
    private final c0 a;
    @f
    private final s b;
    @f
    private final b1 c;
    private final boolean d;
    
    public o(@e final c0 a, @f final s b, @f final b1 c, final boolean d) {
        k0.p((Object)a, "type");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @e
    public final c0 a() {
        return this.a;
    }
    
    @f
    public final s b() {
        return this.b;
    }
    
    @f
    public final b1 c() {
        return this.c;
    }
    
    public final boolean d() {
        return this.d;
    }
    
    @e
    public final c0 e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o)) {
            return false;
        }
        final o o2 = (o)o;
        return k0.g((Object)this.a, (Object)o2.a) && k0.g((Object)this.b, (Object)o2.b) && k0.g((Object)this.c, (Object)o2.c) && this.d == o2.d;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final s b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final b1 c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31 + d;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TypeAndDefaultQualifiers(type=");
        sb.append(this.a);
        sb.append(", defaultQualifiers=");
        sb.append(this.b);
        sb.append(", typeParameterForArgument=");
        sb.append(this.c);
        sb.append(", isFromStarProjection=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
