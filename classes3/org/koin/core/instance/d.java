// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.instance;

import k7.k;
import n6.l;
import kotlin.j2;
import org.koin.core.scope.c;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.koin.core.definition.b;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001d\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0016R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019" }, d2 = { "Lorg/koin/core/instance/d;", "T", "Lorg/koin/core/instance/a;", "Lorg/koin/core/definition/b;", "definition", "Lorg/koin/core/scope/a;", "scope", "Lkotlin/j2;", "g", "Lorg/koin/core/instance/c;", "context", "", "e", "f", "c", "(Lorg/koin/core/instance/c;)Ljava/lang/Object;", "a", "", "", "d", "Ljava/util/Map;", "values", "beanDefinition", "<init>", "(Lorg/koin/core/definition/b;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class d<T> extends a<T>
{
    private final Map<String, T> d;
    
    public d(@e final b<T> b) {
        k0.q((Object)b, "beanDefinition");
        super(b);
        this.d = new ConcurrentHashMap<String, T>();
    }
    
    private final void g(final b<?> b, final org.koin.core.scope.a a) {
        final c l = a.L();
        l7.a e;
        if (l != null) {
            e = l.e();
        }
        else {
            e = null;
        }
        final l7.a i = b.l();
        if (k0.g((Object)i, (Object)e) ^ true) {
            if (e == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't use definition ");
                sb.append(b);
                sb.append(" defined for scope '");
                sb.append(i);
                sb.append("', with an open scope instance ");
                sb.append(a);
                sb.append(". Use a scope instance with scope '");
                sb.append(i);
                sb.append('\'');
                throw new k7.a(sb.toString());
            }
            if (i != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't use definition ");
                sb2.append(b);
                sb2.append(" defined for scope '");
                sb2.append(i);
                sb2.append("' with scope instance ");
                sb2.append(a);
                sb2.append(". Use a scope instance with scope '");
                sb2.append(i);
                sb2.append("'.");
                throw new k7.a(sb2.toString());
            }
        }
    }
    
    @Override
    public void a() {
        final n6.l<T, j2> f = this.d().f();
        if (f != null) {
            final j2 j2 = (j2)f.invoke((Object)null);
        }
        this.d.clear();
    }
    
    @Override
    public <T> T c(@e final org.koin.core.instance.c c) {
        k0.q((Object)c, "context");
        if (c.a() == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        }
        if (k0.g((Object)c.c(), (Object)c.a().y())) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No scope instance created to resolve ");
            sb.append(this.d());
            throw new k(sb.toString());
        }
        final org.koin.core.scope.a c2 = c.c();
        if (c2 != null) {
            this.g(this.d(), c2);
            final String b = c2.B();
            Object o;
            if ((o = this.d.get(b)) == null) {
                o = this.b(c);
                final Map<String, T> d = this.d;
                if (o == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Instance creation from ");
                    sb2.append(this.d());
                    sb2.append(" should not be null");
                    throw new IllegalStateException(sb2.toString().toString());
                }
                d.put(b, (T)o);
            }
            return (T)o;
        }
        throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
    }
    
    @Override
    public boolean e(@e final org.koin.core.instance.c c) {
        k0.q((Object)c, "context");
        final org.koin.core.scope.a c2 = c.c();
        boolean b = false;
        if (c2 != null) {
            b = b;
            if (this.d.get(c.c().B()) != null) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void f(@e final org.koin.core.instance.c c) {
        k0.q((Object)c, "context");
        final org.koin.core.scope.a c2 = c.c();
        if (c2 != null) {
            final org.koin.core.b.a c3 = org.koin.core.b.c;
            if (c3.b().e(org.koin.core.logger.b.G)) {
                final org.koin.core.logger.c b = c3.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("releasing '");
                sb.append(c2);
                sb.append("' ~ ");
                sb.append(this.d());
                sb.append(' ');
                b.a(sb.toString());
            }
            final n6.l<T, j2> g = this.d().g();
            if (g != null) {
                final j2 j2 = (j2)g.invoke((Object)this.d.get(c2.B()));
            }
            this.d.remove(c2.B());
            return;
        }
        throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
    }
}
