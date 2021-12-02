// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i;

public final class s
{
    @e
    private final i a;
    @e
    private final Collection<a> b;
    private final boolean c;
    
    public s(@e final i a, @e final Collection<? extends a> b, final boolean c) {
        k0.p((Object)a, "nullabilityQualifier");
        k0.p((Object)b, "qualifierApplicabilityTypes");
        this.a = a;
        this.b = (Collection<a>)b;
        this.c = c;
    }
    
    @e
    public final s a(@e final i i, @e final Collection<? extends a> collection, final boolean b) {
        k0.p((Object)i, "nullabilityQualifier");
        k0.p((Object)collection, "qualifierApplicabilityTypes");
        return new s(i, collection, b);
    }
    
    public final boolean c() {
        return this.c;
    }
    
    public final boolean d() {
        return this.a.c() == h.H && this.c;
    }
    
    @e
    public final i e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final s s = (s)o;
        return k0.g((Object)this.a, (Object)s.a) && k0.g((Object)this.b, (Object)s.b) && this.c == s.c;
    }
    
    @e
    public final Collection<a> f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", affectsTypeParameterBasedTypes=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
