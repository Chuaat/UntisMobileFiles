// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.definition;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017" }, d2 = { "Lorg/koin/core/definition/f;", "", "", "a", "b", "isCreatedAtStart", "override", "c", "", "toString", "", "hashCode", "other", "equals", "Z", "f", "()Z", "g", "(Z)V", "e", "h", "<init>", "(ZZ)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class f
{
    private boolean a;
    private boolean b;
    
    public f() {
        this(false, false, 3, null);
    }
    
    public f(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    @e
    public final f c(final boolean b, final boolean b2) {
        return new f(b, b2);
    }
    
    public final boolean e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this != o) {
            if (o instanceof f) {
                final f f = (f)o;
                if (this.a == f.a && this.b == f.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean f() {
        return this.a;
    }
    
    public final void g(final boolean a) {
        this.a = a;
    }
    
    public final void h(final boolean b) {
        this.b = b;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int b = this.b ? 1 : 0;
        if (b == 0) {
            n = b;
        }
        return n2 * 31 + n;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Options(isCreatedAtStart=");
        sb.append(this.a);
        sb.append(", override=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
