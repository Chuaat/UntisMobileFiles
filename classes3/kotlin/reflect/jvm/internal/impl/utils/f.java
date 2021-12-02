// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class f
{
    @e
    private final String a;
    private final int b;
    
    public f(@e final String a, final int b) {
        k0.p((Object)a, "number");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    public final int b() {
        return this.b;
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
        return k0.g((Object)this.a, (Object)f.a) && this.b == f.b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NumberWithRadix(number=");
        sb.append(this.a);
        sb.append(", radix=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
