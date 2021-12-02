// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.scope;

import java.util.Iterator;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import l7.a;
import org.jetbrains.annotations.e;
import org.koin.core.definition.b;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R1\u0010\u001b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016`\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "Lorg/koin/core/scope/c;", "", "Lorg/koin/core/scope/a;", "instance", "Lkotlin/j2;", "f", "(Lorg/koin/core/scope/a;)V", "Ll7/a;", "a", "qualifier", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ll7/a;", "e", "()Ll7/a;", "Ljava/util/HashSet;", "Lorg/koin/core/definition/b;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "d", "()Ljava/util/HashSet;", "definitions", "<init>", "(Ll7/a;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    @e
    private final HashSet<b<?>> a;
    @e
    private final a b;
    
    public c(@e final a b) {
        k0.q((Object)b, "qualifier");
        this.b = b;
        this.a = new HashSet<b<?>>();
    }
    
    @e
    public final a a() {
        return this.b;
    }
    
    @e
    public final c b(@e final a a) {
        k0.q((Object)a, "qualifier");
        return new c(a);
    }
    
    @e
    public final HashSet<b<?>> d() {
        return this.a;
    }
    
    @e
    public final a e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof c && k0.g((Object)this.b, (Object)((c)o).b));
    }
    
    public final void f(@e final org.koin.core.scope.a a) {
        k0.q((Object)a, "instance");
        final Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final org.koin.core.instance.a d = iterator.next().d();
            if (d != null) {
                d.f(new org.koin.core.instance.c(null, a, null, 5, null));
            }
        }
    }
    
    @Override
    public int hashCode() {
        final a b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ScopeDefinition(qualifier=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
