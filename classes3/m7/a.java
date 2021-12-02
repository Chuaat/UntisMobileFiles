// 
// Decompiled by Procyon v0.5.36
// 

package m7;

import java.util.List;
import java.util.Set;
import org.koin.core.logger.c;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import kotlin.reflect.d;
import java.util.Map;
import org.koin.core.definition.b;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J \u0010\r\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J,\u0010\u0010\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u000ej\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u0010\u0011\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J0\u0010\u0014\u001a\u00020\u0004*\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0012j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\u00132\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0014\u0010\u0016\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J \u0010\u0017\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0014\u0010\u0018\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J \u0010\u0019\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u0014\u0010\u001b\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u001a\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001a\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0016\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0014\u0010$\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"J\u001d\u0010%\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070'J\u0012\u0010)\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J$\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0019\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070'H\u0000¢\u0006\u0004\b.\u0010/J\u0006\u00101\u001a\u000200J\u0018\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0006\u00103\u001a\u00020\u0004J\u001c\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007042\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u000b¨\u00068" }, d2 = { "Lm7/a;", "", "Lorg/koin/core/module/a;", "module", "Lkotlin/j2;", "s", "A", "Lorg/koin/core/definition/b;", "definition", "n", "w", "Lkotlin/reflect/d;", "type", "v", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "x", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "z", "q", "p", "r", "y", "o", "u", "kClass", "i", "h", "", "name", "g", "", "modules", "m", "C", "(Ljava/lang/Iterable;)V", "", "j", "t", "Ll7/a;", "qualifier", "clazz", "e", "d", "()Ljava/util/Set;", "", "B", "k", "b", "", "l", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    private final HashSet<b<?>> a;
    private final Map<String, b<?>> b;
    private final Map<d<?>, b<?>> c;
    private final Map<d<?>, ArrayList<b<?>>> d;
    private final HashSet<b<?>> e;
    
    public a() {
        this.a = new HashSet<b<?>>();
        this.b = new ConcurrentHashMap<String, b<?>>();
        this.c = new ConcurrentHashMap<d<?>, b<?>>();
        this.d = new ConcurrentHashMap<d<?>, ArrayList<b<?>>>();
        this.e = new HashSet<b<?>>();
    }
    
    private final void A(final org.koin.core.module.a a) {
        final Iterator<b<?>> iterator = a.e().iterator();
        while (iterator.hasNext()) {
            this.t(iterator.next());
        }
    }
    
    private final void a(@e final HashSet<b<?>> set, final b<?> b) {
        if (!set.add(b) && !b.h().e()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Already existing definition or try to override an existing one: ");
            sb.append(b);
            throw new k7.b(sb.toString());
        }
    }
    
    private final ArrayList<b<?>> c(final d<?> d) {
        this.d.put(d, new ArrayList<b<?>>());
        final ArrayList<b<?>> value = this.d.get(d);
        if (value == null) {
            k0.L();
        }
        return value;
    }
    
    private final b<?> g(final String s) {
        return this.b.get(s);
    }
    
    private final b<?> h(final d<?> d) {
        final ArrayList<b<?>> obj = this.d.get(d);
        b<?> b;
        if (obj != null && obj.size() == 1) {
            b = obj.get(0);
        }
        else {
            if (obj != null && obj.size() > 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Found multiple definitions for type '");
                sb.append(org.koin.ext.a.a(d));
                sb.append("': ");
                sb.append(obj);
                sb.append(". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
                throw new k7.f(sb.toString());
            }
            b = null;
        }
        return b;
    }
    
    private final b<?> i(final d<?> d) {
        return this.c.get(d);
    }
    
    private final void n(final b<?> o) {
        final org.koin.core.instance.a<?> d = o.d();
        if (d != null) {
            d.a();
        }
        this.a.remove(o);
        if (o.k() != null) {
            this.o(o);
        }
        else {
            this.r(o);
        }
        this.q(o);
    }
    
    private final void o(final b<?> obj) {
        final l7.a k = obj.k();
        if (k != null) {
            final String string = k.toString();
            if (k0.g((Object)this.b.get(string), (Object)obj)) {
                this.b.remove(string);
                final org.koin.core.b.a c = org.koin.core.b.c;
                if (c.b().e(org.koin.core.logger.b.G)) {
                    final c b = c.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unbind qualifier:'");
                    sb.append(string);
                    sb.append("' ~ ");
                    sb.append(obj);
                    b.d(sb.toString());
                }
            }
        }
    }
    
    private final void p(final b<?> b, final d<?> d) {
        final ArrayList<b<?>> list = this.d.get(d);
        final boolean b2 = list != null && list.remove(b);
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G) && b2) {
            final c b3 = c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("unbind secondary type:'");
            sb.append(org.koin.ext.a.a(d));
            sb.append("' ~ ");
            sb.append(b);
            b3.d(sb.toString());
        }
    }
    
    private final void q(final b<?> b) {
        final Iterator iterator = b.m().iterator();
        while (iterator.hasNext()) {
            this.p(b, (d<?>)iterator.next());
        }
    }
    
    private final void r(final b<?> obj) {
        final d i = obj.i();
        if (k0.g((Object)this.c.get(i), (Object)obj)) {
            this.c.remove(i);
            final org.koin.core.b.a c = org.koin.core.b.c;
            if (c.b().e(org.koin.core.logger.b.G)) {
                final c b = c.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("unbind type:'");
                sb.append(org.koin.ext.a.a(i));
                sb.append("' ~ ");
                sb.append(obj);
                b.d(sb.toString());
            }
        }
    }
    
    private final void s(final org.koin.core.module.a a) {
        final Iterator<b<?>> iterator = a.e().iterator();
        while (iterator.hasNext()) {
            this.n(iterator.next());
        }
    }
    
    private final void u(final b<?> b) {
        final l7.a k = b.k();
        if (k != null) {
            if (this.b.get(k.toString()) != null && !b.h().e()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Already existing definition or try to override an existing one with qualifier '");
                sb.append(k);
                sb.append("' with ");
                sb.append(b);
                sb.append(" but has already registered ");
                sb.append(this.b.get(k.toString()));
                throw new k7.b(sb.toString());
            }
            this.b.put(k.toString(), b);
            final org.koin.core.b.a c = org.koin.core.b.c;
            if (c.b().e(org.koin.core.logger.b.H)) {
                final c b2 = c.b();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("bind qualifier:'");
                sb2.append(b.k());
                sb2.append("' ~ ");
                sb2.append(b);
                b2.d(sb2.toString());
            }
        }
    }
    
    private final void v(final b<?> b, final d<?> d) {
        ArrayList<b<?>> c = this.d.get(d);
        if (c == null) {
            c = this.c(d);
        }
        c.add(b);
        final org.koin.core.b.a c2 = org.koin.core.b.c;
        if (c2.b().e(org.koin.core.logger.b.H)) {
            final c b2 = c2.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("bind secondary type:'");
            sb.append(org.koin.ext.a.a(d));
            sb.append("' ~ ");
            sb.append(b);
            b2.d(sb.toString());
        }
    }
    
    private final void w(final b<?> b) {
        final Iterator iterator = b.m().iterator();
        while (iterator.hasNext()) {
            this.v(b, (d<?>)iterator.next());
        }
    }
    
    private final void x(final b<?> e) {
        this.e.add(e);
    }
    
    private final void y(final d<?> obj, final b<?> b) {
        if (this.c.get(obj) != null && !b.h().e()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Already existing definition or try to override an existing one with type '");
            sb.append(obj);
            sb.append("' and ");
            sb.append(b);
            sb.append(" but has already registered ");
            sb.append(this.c.get(obj));
            throw new k7.b(sb.toString());
        }
        this.c.put(obj, b);
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.H)) {
            final c b2 = c.b();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("bind type:'");
            sb2.append(org.koin.ext.a.a(obj));
            sb2.append("' ~ ");
            sb2.append(b);
            b2.d(sb2.toString());
        }
    }
    
    private final void z(final b<?> b) {
        this.y(b.i(), b);
    }
    
    public final int B() {
        return this.a.size();
    }
    
    public final void C(@e final Iterable<org.koin.core.module.a> iterable) {
        k0.q((Object)iterable, "modules");
        final Iterator<org.koin.core.module.a> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.s(iterator.next());
        }
    }
    
    public final void b() {
        final Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.e.clear();
    }
    
    @e
    public final Set<b<?>> d() {
        return this.e;
    }
    
    @f
    public final b<?> e(@f final l7.a a, @e final d<?> d) {
        k0.q((Object)d, "clazz");
        b<?> b;
        if (a != null) {
            b = this.g(a.toString());
        }
        else {
            b = this.i(d);
            if (b == null) {
                b = this.h(d);
            }
        }
        return b;
    }
    
    @e
    public final Set<b<?>> j() {
        return this.a;
    }
    
    @f
    public final b<?> k(@e final d<?> o) {
        k0.q((Object)o, "clazz");
        for (final b<?> next : this.a) {
            final b<?> b = next;
            if (k0.g((Object)b.i(), (Object)o) || b.m().contains(o)) {
                return next;
            }
        }
        return null;
    }
    
    @e
    public final List<b<?>> l(@e final d<?> o) {
        k0.q((Object)o, "clazz");
        final Set<b<?>> j = this.j();
        final ArrayList<b> list = (ArrayList<b>)new ArrayList<b<?>>();
        for (final b<?> next : j) {
            final b<?> b = next;
            if (k0.g((Object)b.i(), (Object)o) || (b.m().contains(o) && !b.n())) {
                list.add(next);
            }
        }
        return (List<b<?>>)list;
    }
    
    public final void m(@e final Iterable<org.koin.core.module.a> iterable) {
        k0.q((Object)iterable, "modules");
        final Iterator<org.koin.core.module.a> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.A(iterator.next());
        }
    }
    
    public final void t(@e final b<?> b) {
        k0.q((Object)b, "definition");
        this.a(this.a, b);
        b.b();
        if (b.k() != null) {
            this.u(b);
        }
        else {
            this.z(b);
        }
        if (b.m().isEmpty() ^ true) {
            this.w(b);
        }
        if (b.h().f()) {
            this.x(b);
        }
    }
}
