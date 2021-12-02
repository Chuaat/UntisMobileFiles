// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.definition;

import kotlin.collections.v;
import org.koin.core.instance.c;
import kotlin.p1;
import kotlin.h0;
import java.util.Map;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import n6.p;
import org.jetbrains.annotations.f;
import org.koin.core.instance.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.d;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 \u0012\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\bY\u0010ZJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u001b\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u0005R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u001b\u0010$\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R:\u00105\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0.j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a`/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104RC\u0010;\u001a#\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00028\u000006j\b\u0012\u0004\u0012\u00028\u0000`9¢\u0006\u0002\b:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010F\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010B\u001a\u0004\b\u0013\u0010C\"\u0004\bD\u0010ER>\u0010I\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010Gj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010U\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\b'\u0010R\"\u0004\bS\u0010TR>\u0010W\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010Gj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010J\u001a\u0004\bP\u0010L\"\u0004\bX\u0010N¨\u0006[" }, d2 = { "Lorg/koin/core/definition/b;", "T", "", "", "n", "Lkotlin/j2;", "b", "Lorg/koin/core/instance/c;", "context", "o", "(Lorg/koin/core/instance/c;)Ljava/lang/Object;", "", "toString", "other", "equals", "", "hashCode", "a", "Lorg/koin/core/definition/f;", "d", "Lorg/koin/core/definition/f;", "h", "()Lorg/koin/core/definition/f;", "u", "(Lorg/koin/core/definition/f;)V", "options", "Lkotlin/reflect/d;", "k", "Lkotlin/reflect/d;", "i", "()Lkotlin/reflect/d;", "primaryType", "Ll7/a;", "qualifier", "Ll7/a;", "()Ll7/a;", "scopeName", "l", "Lorg/koin/core/definition/g;", "e", "Lorg/koin/core/definition/g;", "j", "()Lorg/koin/core/definition/g;", "v", "(Lorg/koin/core/definition/g;)V", "properties", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "m", "()Ljava/util/ArrayList;", "w", "(Ljava/util/ArrayList;)V", "secondaryTypes", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Ln6/p;", "c", "()Ln6/p;", "p", "(Ln6/p;)V", "Lorg/koin/core/instance/a;", "Lorg/koin/core/instance/a;", "()Lorg/koin/core/instance/a;", "q", "(Lorg/koin/core/instance/a;)V", "instance", "Lkotlin/Function1;", "Lorg/koin/core/definition/OnReleaseCallback;", "onRelease", "Ln6/l;", "g", "()Ln6/l;", "t", "(Ln6/l;)V", "Lorg/koin/core/definition/e;", "f", "Lorg/koin/core/definition/e;", "()Lorg/koin/core/definition/e;", "r", "(Lorg/koin/core/definition/e;)V", "kind", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "s", "<init>", "(Ll7/a;Ll7/a;Lkotlin/reflect/d;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class b<T>
{
    @e
    private ArrayList<d<?>> a;
    @f
    private a<T> b;
    @e
    public p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> c;
    @e
    private org.koin.core.definition.f d;
    @e
    private g e;
    @e
    public org.koin.core.definition.e f;
    @f
    private l<? super T, j2> g;
    @f
    private l<? super T, j2> h;
    @f
    private final l7.a i;
    @f
    private final l7.a j;
    @e
    private final d<?> k;
    
    public b(@f final l7.a i, @f final l7.a j, @e final d<?> k) {
        k0.q((Object)k, "primaryType");
        this.i = i;
        this.j = j;
        this.k = k;
        this.a = new ArrayList<d<?>>();
        this.d = new org.koin.core.definition.f(false, false, 3, null);
        this.e = new g(null, 1, null);
    }
    
    public final void a() {
        final a<T> b = this.b;
        if (b != null) {
            b.a();
        }
        this.b = null;
    }
    
    public final void b() {
        final org.koin.core.definition.e f = this.f;
        if (f == null) {
            k0.S("kind");
        }
        final int n = org.koin.core.definition.a.a[f.ordinal()];
        Object b;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                b = new org.koin.core.instance.d<T>(this);
            }
            else {
                b = new org.koin.core.instance.b<T>(this);
            }
        }
        else {
            b = new org.koin.core.instance.e<T>(this);
        }
        this.b = (a<T>)b;
    }
    
    @e
    public final p<org.koin.core.scope.a, org.koin.core.parameter.a, T> c() {
        final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> c = this.c;
        if (c == null) {
            k0.S("definition");
        }
        return (p<org.koin.core.scope.a, org.koin.core.parameter.a, T>)c;
    }
    
    @f
    public final a<T> d() {
        return this.b;
    }
    
    @e
    public final org.koin.core.definition.e e() {
        final org.koin.core.definition.e f = this.f;
        if (f == null) {
            k0.S("kind");
        }
        return f;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (k0.g((Object)b.class, (Object)class1) ^ true) {
            return false;
        }
        if (o != null) {
            final b b = (b)o;
            return !(k0.g((Object)this.i, (Object)b.i) ^ true) && !(k0.g((Object)this.k, (Object)b.k) ^ true);
        }
        throw new p1("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }
    
    @f
    public final l<T, j2> f() {
        return (l<T, j2>)this.h;
    }
    
    @f
    public final l<T, j2> g() {
        return (l<T, j2>)this.g;
    }
    
    @e
    public final org.koin.core.definition.f h() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        final l7.a i = this.i;
        int hashCode;
        if (i != null) {
            hashCode = i.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.k.hashCode();
    }
    
    @e
    public final d<?> i() {
        return this.k;
    }
    
    @e
    public final g j() {
        return this.e;
    }
    
    @f
    public final l7.a k() {
        return this.i;
    }
    
    @f
    public final l7.a l() {
        return this.j;
    }
    
    @e
    public final ArrayList<d<?>> m() {
        return this.a;
    }
    
    public final boolean n() {
        return this.j != null;
    }
    
    public final <T> T o(@e final c c) {
        k0.q((Object)c, "context");
        final a<T> b = this.b;
        if (b != null) {
            final Object c2 = b.c(c);
            if (c2 != null) {
                return (T)c2;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Definition without any InstanceContext - ");
        sb.append(this);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void p(@e final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> c) {
        k0.q((Object)c, "<set-?>");
        this.c = c;
    }
    
    public final void q(@f final a<T> b) {
        this.b = b;
    }
    
    public final void r(@e final org.koin.core.definition.e f) {
        k0.q((Object)f, "<set-?>");
        this.f = f;
    }
    
    public final void s(@f final l<? super T, j2> h) {
        this.h = h;
    }
    
    public final void t(@f final l<? super T, j2> g) {
        this.g = g;
    }
    
    @e
    @Override
    public String toString() {
        final org.koin.core.definition.e f = this.f;
        if (f == null) {
            k0.S("kind");
        }
        final String string = f.toString();
        final l7.a i = this.i;
        String string2 = "";
        String string3 = null;
        Label_0077: {
            if (i != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("name:'");
                sb.append(this.i);
                sb.append("', ");
                string3 = sb.toString();
                if (string3 != null) {
                    break Label_0077;
                }
            }
            string3 = "";
        }
        String string4 = null;
        Label_0138: {
            if (this.j != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("scope:'");
                sb2.append(this.j);
                sb2.append("', ");
                string4 = sb2.toString();
                if (string4 != null) {
                    break Label_0138;
                }
            }
            string4 = "";
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("primary_type:'");
        sb3.append(org.koin.ext.a.a(this.k));
        sb3.append('\'');
        final String string5 = sb3.toString();
        if (this.a.isEmpty() ^ true) {
            final String z2 = v.Z2((Iterable)this.a, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)b$a.G, 30, (Object)null);
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(", secondary_type:");
            sb4.append(z2);
            string2 = sb4.toString();
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("[type:");
        sb5.append(string);
        sb5.append(',');
        sb5.append(string4);
        sb5.append(string3);
        sb5.append(string5);
        sb5.append(string2);
        sb5.append(']');
        return sb5.toString();
    }
    
    public final void u(@e final org.koin.core.definition.f d) {
        k0.q((Object)d, "<set-?>");
        this.d = d;
    }
    
    public final void v(@e final g e) {
        k0.q((Object)e, "<set-?>");
        this.e = e;
    }
    
    public final void w(@e final ArrayList<d<?>> a) {
        k0.q((Object)a, "<set-?>");
        this.a = a;
    }
}
