// 
// Decompiled by Procyon v0.5.36
// 

package m7;

import k7.k;
import org.jetbrains.annotations.f;
import k7.i;
import kotlin.jvm.internal.w;
import org.koin.core.b;
import k7.j;
import org.koin.dsl.d;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import org.koin.core.scope.a;
import org.jetbrains.annotations.e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001cJ\"\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010 \u001a\u00060\u001cj\u0002`\u001f2\u0006\u0010\u001d\u001a\u00020!J\u0012\u0010#\u001a\u00020\u000e2\n\u0010 \u001a\u00060\u001cj\u0002`\u001fJ\u0014\u0010$\u001a\u0004\u0018\u00010\u000e2\n\u0010 \u001a\u00060\u001cj\u0002`\u001fJ\u0012\u0010%\u001a\u00020\u00042\n\u0010 \u001a\u00060\u001cj\u0002`\u001fJ\u0006\u0010&\u001a\u00020\u0004R(\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0'8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006." }, d2 = { "Lm7/c;", "", "Lorg/koin/core/module/a;", "module", "Lkotlin/j2;", "r", "d", "Lorg/koin/dsl/d;", "scopeSet", "p", "Lorg/koin/core/scope/c;", "originalSet", "b", "n", "Lorg/koin/core/scope/a;", "instance", "m", "o", "", "j", "", "modules", "l", "(Ljava/lang/Iterable;)V", "q", "Lorg/koin/core/a;", "koin", "k", "", "scopeName", "g", "Lorg/koin/core/scope/ScopeID;", "id", "Ll7/a;", "c", "h", "i", "e", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "definitions", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "()Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    @e
    private final ConcurrentHashMap<String, org.koin.core.scope.c> a;
    private final ConcurrentHashMap<String, a> b;
    
    public c() {
        this.a = new ConcurrentHashMap<String, org.koin.core.scope.c>();
        this.b = new ConcurrentHashMap<String, a>();
    }
    
    private final void b(final org.koin.core.scope.c c) {
        final Collection<a> values = this.b.values();
        k0.h((Object)values, "instances.values");
        for (final a a : values) {
            if (k0.g((Object)a.L(), (Object)c)) {
                a.e();
            }
        }
    }
    
    private final void d(final org.koin.core.module.a a) {
        final Iterator<d> iterator = a.g().iterator();
        while (iterator.hasNext()) {
            this.n(iterator.next());
        }
    }
    
    private final void m(final a a) {
        if (this.b.get(a.B()) == null) {
            this.o(a);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("A scope with id '");
        sb.append(a.B());
        sb.append("' already exists. Reuse or close it.");
        throw new j(sb.toString());
    }
    
    private final void n(final d d) {
        final org.koin.core.scope.c c = this.a.get(d.i().toString());
        if (c == null) {
            this.a.put(d.i().toString(), d.d());
        }
        else {
            c.d().addAll((Collection<?>)d.h());
        }
    }
    
    private final void o(final a a) {
        this.b.put(a.B(), a);
    }
    
    private final void p(final d d) {
        final org.koin.core.scope.c c = this.a.get(d.i().toString());
        if (c != null) {
            final b.a c2 = org.koin.core.b.c;
            if (c2.b().e(org.koin.core.logger.b.G)) {
                final org.koin.core.logger.c b = c2.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("unbind scoped definitions: ");
                sb.append(d.h());
                sb.append(" from '");
                sb.append(d.i());
                sb.append('\'');
                b.d(sb.toString());
            }
            k0.h((Object)c, "scopeDefinition");
            this.b(c);
            c.d().removeAll(d.h());
        }
    }
    
    private final void r(final org.koin.core.module.a a) {
        final Iterator<d> iterator = a.g().iterator();
        while (iterator.hasNext()) {
            this.p(iterator.next());
        }
    }
    
    public final void a() {
        final Collection<a> values = this.b.values();
        k0.h((Object)values, "instances.values");
        final Iterator<Object> iterator = values.iterator();
        while (iterator.hasNext()) {
            iterator.next().e();
        }
        this.a.clear();
        this.b.clear();
    }
    
    @e
    public final a c(@e final org.koin.core.a a, @e final String s, @e final l7.a obj) {
        k0.q((Object)a, "koin");
        k0.q((Object)s, "id");
        k0.q((Object)obj, "scopeName");
        final org.koin.core.scope.c c = this.a.get(obj.toString());
        if (c != null) {
            final a a2 = new a(s, false, a, 2, null);
            a2.Y(c);
            a2.n();
            this.m(a2);
            return a2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No scope definition found for scopeName '");
        sb.append(obj);
        sb.append('\'');
        throw new i(sb.toString());
    }
    
    public final void e(@e final String key) {
        k0.q((Object)key, "id");
        this.b.remove(key);
    }
    
    @e
    public final ConcurrentHashMap<String, org.koin.core.scope.c> f() {
        return this.a;
    }
    
    @f
    public final org.koin.core.scope.c g(@e final String key) {
        k0.q((Object)key, "scopeName");
        return this.a.get(key);
    }
    
    @e
    public final a h(@e final String str) {
        k0.q((Object)str, "id");
        final a a = this.b.get(str);
        if (a != null) {
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ScopeInstance with id '");
        sb.append(str);
        sb.append("' not found. Create a scope instance with id '");
        sb.append(str);
        sb.append('\'');
        throw new k(sb.toString());
    }
    
    @f
    public final a i(@e final String key) {
        k0.q((Object)key, "id");
        return this.b.get(key);
    }
    
    @e
    public final Collection<org.koin.core.scope.c> j() {
        final Collection<org.koin.core.scope.c> values = this.a.values();
        k0.h((Object)values, "definitions.values");
        return values;
    }
    
    public final void k(@e final org.koin.core.a a) {
        k0.q((Object)a, "koin");
        this.o(a.y());
    }
    
    public final void l(@e final Iterable<org.koin.core.module.a> iterable) {
        k0.q((Object)iterable, "modules");
        final Iterator<org.koin.core.module.a> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.d(iterator.next());
        }
    }
    
    public final void q(@e final Iterable<org.koin.core.module.a> iterable) {
        k0.q((Object)iterable, "modules");
        final Iterator<org.koin.core.module.a> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.r(iterator.next());
        }
    }
}
