// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.dsl;

import java.util.Collection;
import org.koin.core.scope.c;
import kotlin.k;
import kotlin.i;
import org.koin.core.definition.f;
import kotlin.jvm.internal.k1;
import n6.p;
import kotlin.jvm.internal.k0;
import l7.a;
import org.jetbrains.annotations.e;
import org.koin.core.definition.b;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*JX\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\b\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0087\bJX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\b\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0086\bJX\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\b\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0086\bJ\u0018\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\"\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R1\u0010(\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0#j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r`$8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006+" }, d2 = { "Lorg/koin/dsl/d;", "", "T", "Ll7/a;", "qualifier", "", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Lorg/koin/core/definition/b;", "l", "j", "f", "Lorg/koin/core/definition/f;", "options", "Lkotlin/j2;", "n", "Lorg/koin/core/scope/c;", "d", "e", "", "toString", "a", "b", "", "hashCode", "other", "equals", "Ll7/a;", "i", "()Ll7/a;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "h", "()Ljava/util/HashSet;", "definitions", "<init>", "(Ll7/a;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    @e
    private final HashSet<b<?>> a;
    @e
    private final a b;
    
    public d(@e final a b) {
        k0.q((Object)b, "qualifier");
        this.b = b;
        this.a = new HashSet<b<?>>();
    }
    
    private final <T> b<T> f(final a a, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
        final a i = this.i();
        final org.koin.core.definition.e h = org.koin.core.definition.e.H;
        k0.y(4, "T");
        final b obj = new b<T>(a, i, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        obj.p(p3);
        obj.r(h);
        this.e((b<T>)obj, new f(false, b));
        if (!this.h().contains(obj)) {
            this.h().add(obj);
            return (b<T>)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't add definition ");
        sb.append(obj);
        sb.append(" for scope ");
        sb.append(this.i());
        sb.append(" as it already exists");
        throw new k7.b(sb.toString());
    }
    
    private final <T> b<T> j(final a a, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
        final a i = this.i();
        final org.koin.core.definition.e j = org.koin.core.definition.e.I;
        k0.y(4, "T");
        final b obj = new b<T>(a, i, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        obj.p(p3);
        obj.r(j);
        this.e((b<T>)obj, new f(false, b));
        if (!this.h().contains(obj)) {
            this.h().add(obj);
            return (b<T>)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't add definition ");
        sb.append(obj);
        sb.append(" for scope ");
        sb.append(this.i());
        sb.append(" as it already exists");
        throw new k7.b(sb.toString());
    }
    
    @i(level = k.H, message = "Can't use Single in a scope. Use Scoped instead")
    private final <T> b<T> l(final a a, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        throw new IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }
    
    private final void n(@e final b<?> b, final f f) {
        b.h().g(f.f());
        b.h().h(f.e());
    }
    
    @e
    public final a a() {
        return this.b;
    }
    
    @e
    public final d b(@e final a a) {
        k0.q((Object)a, "qualifier");
        return new d(a);
    }
    
    @e
    public final c d() {
        final c c = new c(this.b);
        c.d().addAll((Collection<?>)this.a);
        return c;
    }
    
    public final <T> void e(@e final b<T> b, @e final f f) {
        k0.q((Object)b, "definition");
        k0.q((Object)f, "options");
        this.n(b, f);
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return this == o || (o instanceof d && k0.g((Object)this.b, (Object)((d)o).b));
    }
    
    @e
    public final HashSet<b<?>> h() {
        return this.a;
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
    public final a i() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Scope['");
        sb.append(this.b);
        sb.append("']");
        return sb.toString();
    }
}
