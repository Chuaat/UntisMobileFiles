// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.e;

public final class r<T>
{
    private final T a;
    private final T b;
    @e
    private final String c;
    @e
    private final a d;
    
    public r(final T a, final T b, @e final String c, @e final a d) {
        k0.p((Object)c, "filePath");
        k0.p((Object)d, "classId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        return k0.g((Object)this.a, (Object)r.a) && k0.g((Object)this.b, (Object)r.b) && k0.g((Object)this.c, (Object)r.c) && k0.g((Object)this.d, (Object)r.d);
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
        return ((hashCode2 * 31 + hashCode) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", expectedVersion=");
        sb.append(this.b);
        sb.append(", filePath=");
        sb.append(this.c);
        sb.append(", classId=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
