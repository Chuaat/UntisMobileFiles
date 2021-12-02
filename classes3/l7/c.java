// 
// Decompiled by Procyon v0.5.36
// 

package l7;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u00d6\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "Ll7/c;", "Ll7/a;", "", "toString", "a", "value", "b", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class c implements a
{
    @e
    private final String a;
    
    public c(@e final String a) {
        k0.q((Object)a, "value");
        this.a = a;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    @e
    public final c b(@e final String s) {
        k0.q((Object)s, "value");
        return new c(s);
    }
    
    @e
    public final String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof c && k0.g((Object)this.a, (Object)((c)o).a));
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        return this.a;
    }
}
