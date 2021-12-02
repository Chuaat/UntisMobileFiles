// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;

public final class a<T>
{
    private final T a;
    private final T b;
    
    public a(final T a, final T b) {
        this.a = a;
        this.b = b;
    }
    
    public final T a() {
        return this.a;
    }
    
    public final T b() {
        return this.b;
    }
    
    public final T c() {
        return this.a;
    }
    
    public final T d() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return k0.g((Object)this.a, (Object)a.a) && k0.g((Object)this.b, (Object)a.b);
    }
    
    @Override
    public int hashCode() {
        final T a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final T b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ApproximationBounds(lower=");
        sb.append(this.a);
        sb.append(", upper=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
