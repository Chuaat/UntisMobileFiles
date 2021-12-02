// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

final class c<T>
{
    private final T a;
    @f
    private final g b;
    
    public c(final T a, @f final g b) {
        this.a = a;
        this.b = b;
    }
    
    public final T a() {
        return this.a;
    }
    
    @f
    public final g b() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return k0.g((Object)this.a, (Object)c.a) && k0.g((Object)this.b, (Object)c.b);
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
        final g b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EnhancementResult(result=");
        sb.append(this.a);
        sb.append(", enhancementAnnotations=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
