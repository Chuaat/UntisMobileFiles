// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.module;

import kotlin.j2;
import n6.l;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.w;
import org.koin.core.definition.f;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import n6.p;
import org.koin.dsl.d;
import org.jetbrains.annotations.e;
import org.koin.core.definition.b;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/Jb\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052)\b\b\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0002\b\fH\u0086\bJ\u0018\u0010\u0013\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002JX\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052)\b\b\u0010\r\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b¢\u0006\u0002\b\fH\u0086\bJ\"\u0010\u0015\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016J'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\fJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002R\u001c\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R4\u0010)\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0$j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e`%8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R,\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00160$j\b\u0012\u0004\u0012\u00020\u0016`%8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010-\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b,\u0010#¨\u00060" }, d2 = { "Lorg/koin/core/module/a;", "", "T", "Ll7/a;", "qualifier", "", "createdAtStart", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Lorg/koin/core/definition/b;", "k", "Lorg/koin/core/definition/f;", "options", "Lkotlin/j2;", "m", "c", "a", "Lorg/koin/dsl/d;", "scope", "b", "scopeName", "Lkotlin/Function1;", "scopeSet", "j", "module", "", "i", "d", "Z", "f", "()Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "e", "()Ljava/util/ArrayList;", "definitions", "g", "scopes", "h", "isCreatedAtStart", "<init>", "(ZZ)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @e
    private final ArrayList<b<?>> a;
    @e
    private final ArrayList<d> b;
    private final boolean c;
    private final boolean d;
    
    public a(final boolean c, final boolean d) {
        this.c = c;
        this.d = d;
        this.a = new ArrayList<b<?>>();
        this.b = new ArrayList<d>();
    }
    
    private final <T> b<T> c(final l7.a a, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p3) {
        final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
        final org.koin.core.definition.e h = org.koin.core.definition.e.H;
        k0.y(4, "T");
        final b<T> b2 = new b<T>(a, null, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b2.p(p3);
        b2.r(h);
        this.a(b2, new f(false, b, 1, null));
        return b2;
    }
    
    private final <T> b<T> k(final l7.a a, final boolean b, final boolean b2, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p4) {
        final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
        final org.koin.core.definition.e g = org.koin.core.definition.e.G;
        k0.y(4, "T");
        final b<T> b3 = new b<T>(a, null, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b3.p(p4);
        b3.r(g);
        this.a(b3, new f(b, b2));
        return b3;
    }
    
    private final void m(@e final b<?> b, final f f) {
        final f h = b.h();
        final boolean f2 = f.f();
        final boolean b2 = false;
        h.g(f2 || this.c);
        final f h2 = b.h();
        boolean b3 = false;
        Label_0070: {
            if (!f.e()) {
                b3 = b2;
                if (!this.d) {
                    break Label_0070;
                }
            }
            b3 = true;
        }
        h2.h(b3);
    }
    
    public final <T> void a(@e final b<T> e, @e final f f) {
        k0.q((Object)e, "definition");
        k0.q((Object)f, "options");
        this.m(e, f);
        this.a.add(e);
    }
    
    public final void b(@e final d e) {
        k0.q((Object)e, "scope");
        this.b.add(e);
    }
    
    @e
    public final ArrayList<b<?>> e() {
        return this.a;
    }
    
    public final boolean f() {
        return this.d;
    }
    
    @e
    public final ArrayList<d> g() {
        return this.b;
    }
    
    public final boolean h() {
        return this.c;
    }
    
    @e
    public final List<a> i(@e final a a) {
        k0.q((Object)a, "module");
        return (List<a>)v.L((Object[])new a[] { this, a });
    }
    
    public final void j(@e final l7.a a, @e final l<? super d, j2> l) {
        k0.q((Object)a, "scopeName");
        k0.q((Object)l, "scopeSet");
        final d d = new d(a);
        l.invoke((Object)d);
        this.b(d);
    }
}
