// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    private final h a;
    private final boolean b;
    
    public i(@e final h a, final boolean b) {
        k0.p((Object)a, "qualifier");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final i a(@e final h h, final boolean b) {
        k0.p((Object)h, "qualifier");
        return new i(h, b);
    }
    
    @e
    public final h c() {
        return this.a;
    }
    
    public final boolean d() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return this.a == i.a && this.b == i.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
