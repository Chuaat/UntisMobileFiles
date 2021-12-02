// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;

public final class a
{
    @e
    private final k a;
    @e
    private final b b;
    private final boolean c;
    @f
    private final b1 d;
    
    public a(@e final k a, @e final b b, final boolean c, @f final b1 d) {
        k0.p((Object)a, "howThisTypeIsUsed");
        k0.p((Object)b, "flexibility");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static /* synthetic */ a b(final a a, k a2, b b, boolean c, b1 d, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = a.a;
        }
        if ((n & 0x2) != 0x0) {
            b = a.b;
        }
        if ((n & 0x4) != 0x0) {
            c = a.c;
        }
        if ((n & 0x8) != 0x0) {
            d = a.d;
        }
        return a.a(a2, b, c, d);
    }
    
    @e
    public final a a(@e final k k, @e final b b, final boolean b2, @f final b1 b3) {
        k0.p((Object)k, "howThisTypeIsUsed");
        k0.p((Object)b, "flexibility");
        return new a(k, b, b2, b3);
    }
    
    @e
    public final b c() {
        return this.b;
    }
    
    @e
    public final k d() {
        return this.a;
    }
    
    @f
    public final b1 e() {
        return this.d;
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
        return this.a == a.a && this.b == a.b && this.c == a.c && k0.g((Object)this.d, (Object)a.d);
    }
    
    public final boolean f() {
        return this.c;
    }
    
    @e
    public final a g(@e final b b) {
        k0.p((Object)b, "flexibility");
        return b(this, null, b, false, null, 13, null);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final b1 d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode2) * 31 + c) * 31 + hashCode3;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.a);
        sb.append(", flexibility=");
        sb.append(this.b);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.c);
        sb.append(", upperBoundOfTypeParameter=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
