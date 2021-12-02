// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import m6.o;
import kotlin.reflect.c;
import java.util.Collection;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R \u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "Lkotlin/jvm/internal/a1;", "Lkotlin/jvm/internal/t;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "G", "Ljava/lang/Class;", "m", "()Ljava/lang/Class;", "jClass", "H", "Ljava/lang/String;", "moduleName", "", "Lkotlin/reflect/c;", "x", "()Ljava/util/Collection;", "members", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public final class a1 implements t
{
    @e
    private final Class<?> G;
    private final String H;
    
    public a1(@e final Class<?> g, @e final String h) {
        k0.p(g, "jClass");
        k0.p(h, "moduleName");
        this.G = g;
        this.H = h;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof a1 && k0.g(this.m(), ((a1)o).m());
    }
    
    @Override
    public int hashCode() {
        return this.m().hashCode();
    }
    
    @e
    @Override
    public Class<?> m() {
        return this.G;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.m().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
    
    @e
    @Override
    public Collection<c<?>> x() {
        throw new o();
    }
}
