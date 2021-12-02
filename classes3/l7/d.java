// 
// Decompiled by Procyon v0.5.36
// 

package l7;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\r\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u00c6\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003R\u001d\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Ll7/d;", "Ll7/a;", "", "toString", "Lkotlin/reflect/d;", "a", "type", "b", "", "hashCode", "", "other", "", "equals", "Lkotlin/reflect/d;", "d", "()Lkotlin/reflect/d;", "<init>", "(Lkotlin/reflect/d;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class d implements a
{
    @e
    private final kotlin.reflect.d<?> a;
    
    public d(@e final kotlin.reflect.d<?> a) {
        k0.q((Object)a, "type");
        this.a = a;
    }
    
    @e
    public final kotlin.reflect.d<?> a() {
        return this.a;
    }
    
    @e
    public final d b(@e final kotlin.reflect.d<?> d) {
        k0.q((Object)d, "type");
        return new d(d);
    }
    
    @e
    public final kotlin.reflect.d<?> d() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof d && k0.g((Object)this.a, (Object)((d)o).a));
    }
    
    @Override
    public int hashCode() {
        final kotlin.reflect.d<?> a = this.a;
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
        return org.koin.ext.a.a(this.a);
    }
}
