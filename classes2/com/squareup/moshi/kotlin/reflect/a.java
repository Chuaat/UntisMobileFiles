// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi.kotlin.reflect;

import java.util.LinkedHashSet;
import java.util.AbstractMap;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Set;
import kotlin.reflect.l;
import kotlin.reflect.q;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import com.squareup.moshi.t;
import java.util.Map;
import java.util.Arrays;
import kotlin.reflect.n;
import com.squareup.moshi.j;
import kotlin.jvm.internal.k0;
import com.squareup.moshi.m;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.i;
import kotlin.Metadata;
import com.squareup.moshi.h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002 \u0005BW\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u001c\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00100\u000f\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R-\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR/\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'" }, d2 = { "Lcom/squareup/moshi/kotlin/reflect/a;", "T", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/m;", "reader", "b", "(Lcom/squareup/moshi/m;)Ljava/lang/Object;", "Lcom/squareup/moshi/t;", "writer", "value", "Lkotlin/j2;", "m", "(Lcom/squareup/moshi/t;Ljava/lang/Object;)V", "", "toString", "", "Lcom/squareup/moshi/kotlin/reflect/a$a;", "", "c", "Ljava/util/List;", "r", "()Ljava/util/List;", "nonTransientBindings", "Lcom/squareup/moshi/m$b;", "d", "Lcom/squareup/moshi/m$b;", "s", "()Lcom/squareup/moshi/m$b;", "options", "p", "allBindings", "Lkotlin/reflect/i;", "a", "Lkotlin/reflect/i;", "q", "()Lkotlin/reflect/i;", "constructor", "<init>", "(Lkotlin/reflect/i;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/m$b;)V", "reflect" }, k = 1, mv = { 1, 4, 2 })
public final class a<T> extends h<T>
{
    @org.jetbrains.annotations.e
    private final i<T> a;
    @org.jetbrains.annotations.e
    private final List<a<T, Object>> b;
    @org.jetbrains.annotations.e
    private final List<a<T, Object>> c;
    @org.jetbrains.annotations.e
    private final m.b d;
    
    public a(@org.jetbrains.annotations.e final i<? extends T> a, @org.jetbrains.annotations.e final List<a<T, Object>> b, @org.jetbrains.annotations.e final List<a<T, Object>> c, @org.jetbrains.annotations.e final m.b d) {
        k0.p(a, "constructor");
        k0.p(b, "allBindings");
        k0.p(c, "nonTransientBindings");
        k0.p(d, "options");
        this.a = (i<T>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public T b(@org.jetbrains.annotations.e final m m) {
        k0.p(m, "reader");
        final int size = this.a.getParameters().size();
        final int size2 = this.b.size();
        final Object[] original = new Object[size2];
        for (int i = 0; i < size2; ++i) {
            original[i] = com.squareup.moshi.kotlin.reflect.c.a();
        }
        m.b();
        while (m.f()) {
            final int f = m.F(this.d);
            if (f == -1) {
                m.C1();
                m.skipValue();
            }
            else {
                final a<T, Object> a = this.c.get(f);
                final int o = a.o();
                if (original[o] != com.squareup.moshi.kotlin.reflect.c.a()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Multiple values for '");
                    sb.append(a.n().getName());
                    sb.append("' at ");
                    sb.append(m.getPath());
                    throw new j(sb.toString());
                }
                original[o] = a.j().b(m);
                if (original[o] != null) {
                    continue;
                }
                if (a.n().getReturnType().c()) {
                    continue;
                }
                final j z = com.squareup.moshi.internal.c.z(a.n().getName(), a.k(), m);
                k0.o(z, "Util.unexpectedNull(\n   \u2026         reader\n        )");
                throw z;
            }
        }
        m.d();
        int n;
        if (this.b.size() == size) {
            n = 1;
        }
        else {
            n = 0;
        }
        int j = 0;
        int n2 = n;
        while (j < size) {
            int n3 = n2;
            if (original[j] == com.squareup.moshi.kotlin.reflect.c.a()) {
                if (this.a.getParameters().get(j).Z()) {
                    n3 = 0;
                }
                else {
                    final boolean c = this.a.getParameters().get(j).a().c();
                    String k = null;
                    if (!c) {
                        final String name = this.a.getParameters().get(j).getName();
                        final a<T, Object> a2 = this.b.get(j);
                        if (a2 != null) {
                            k = a2.k();
                        }
                        final j q = com.squareup.moshi.internal.c.q(name, k, m);
                        k0.o(q, "Util.missingProperty(\n  \u2026       reader\n          )");
                        throw q;
                    }
                    original[j] = null;
                    n3 = n2;
                }
            }
            ++j;
            n2 = n3;
        }
        final i<T> a3 = this.a;
        Object o2;
        if (n2 != 0) {
            o2 = a3.call(Arrays.copyOf(original, size2));
        }
        else {
            o2 = a3.callBy(new b(this.a.getParameters(), original));
        }
        for (int size3 = this.b.size(), l = size; l < size3; ++l) {
            final a<T, Object> value = this.b.get(l);
            k0.m(value);
            ((a<Object, Object>)value).p(o2, original[l]);
        }
        return (T)o2;
    }
    
    @Override
    public void m(@org.jetbrains.annotations.e final t t, @f final T obj) {
        k0.p(t, "writer");
        Objects.requireNonNull(obj, "value == null");
        t.c();
        for (final a<T, Object> a : this.b) {
            if (a == null) {
                continue;
            }
            t.o(a.l());
            a.j().m(t, a.i(obj));
        }
        t.g();
    }
    
    @org.jetbrains.annotations.e
    public final List<a<T, Object>> p() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final i<T> q() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final List<a<T, Object>> r() {
        return this.c;
    }
    
    @org.jetbrains.annotations.e
    public final m.b s() {
        return this.d;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("KotlinJsonAdapter(");
        sb.append(this.a.getReturnType());
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BM\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b3\u00104J\u0015\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000eH\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003Jg\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u0014H\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00d6\u0003R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u001b\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/R%\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00065" }, d2 = { "com/squareup/moshi/kotlin/reflect/a$a", "K", "P", "", "value", "i", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "Lkotlin/j2;", "p", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "a", "b", "Lcom/squareup/moshi/h;", "c", "Lkotlin/reflect/q;", "d", "Lkotlin/reflect/n;", "e", "", "f", "name", "jsonName", "adapter", "property", "parameter", "propertyIndex", "Lcom/squareup/moshi/kotlin/reflect/a$a;", "g", "toString", "hashCode", "other", "", "equals", "Lcom/squareup/moshi/h;", "j", "()Lcom/squareup/moshi/h;", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "l", "Lkotlin/reflect/n;", "m", "()Lkotlin/reflect/n;", "I", "o", "()I", "Lkotlin/reflect/q;", "n", "()Lkotlin/reflect/q;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/h;Lkotlin/reflect/q;Lkotlin/reflect/n;I)V", "reflect" }, k = 1, mv = { 1, 4, 2 })
    public static final class a<K, P>
    {
        @org.jetbrains.annotations.e
        private final String a;
        @f
        private final String b;
        @org.jetbrains.annotations.e
        private final h<P> c;
        @org.jetbrains.annotations.e
        private final q<K, P> d;
        @f
        private final n e;
        private final int f;
        
        public a(@org.jetbrains.annotations.e final String a, @f final String b, @org.jetbrains.annotations.e final h<P> c, @org.jetbrains.annotations.e final q<K, ? extends P> d, @f final n e, final int f) {
            k0.p(a, "name");
            k0.p(c, "adapter");
            k0.p(d, "property");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (q<K, P>)d;
            this.e = e;
            this.f = f;
        }
        
        @org.jetbrains.annotations.e
        public final String a() {
            return this.a;
        }
        
        @f
        public final String b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        public final h<P> c() {
            return this.c;
        }
        
        @org.jetbrains.annotations.e
        public final q<K, P> d() {
            return this.d;
        }
        
        @f
        public final n e() {
            return this.e;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (k0.g(this.a, a.a) && k0.g(this.b, a.b) && k0.g(this.c, a.c) && k0.g(this.d, a.d) && k0.g(this.e, a.e) && this.f == a.f) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        public final int f() {
            return this.f;
        }
        
        @org.jetbrains.annotations.e
        public final a<K, P> g(@org.jetbrains.annotations.e final String s, @f final String s2, @org.jetbrains.annotations.e final h<P> h, @org.jetbrains.annotations.e final q<K, ? extends P> q, @f final n n, final int n2) {
            k0.p(s, "name");
            k0.p(h, "adapter");
            k0.p(q, "property");
            return new a<K, P>(s, s2, h, q, n, n2);
        }
        
        @Override
        public int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String b = this.b;
            int hashCode3;
            if (b != null) {
                hashCode3 = b.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final h<P> c = this.c;
            int hashCode4;
            if (c != null) {
                hashCode4 = c.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final q<K, P> d = this.d;
            int hashCode5;
            if (d != null) {
                hashCode5 = d.hashCode();
            }
            else {
                hashCode5 = 0;
            }
            final n e = this.e;
            if (e != null) {
                hashCode = e.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31 + this.f;
        }
        
        public final P i(final K k) {
            return this.d.get(k);
        }
        
        @org.jetbrains.annotations.e
        public final h<P> j() {
            return this.c;
        }
        
        @f
        public final String k() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        public final String l() {
            return this.a;
        }
        
        @f
        public final n m() {
            return this.e;
        }
        
        @org.jetbrains.annotations.e
        public final q<K, P> n() {
            return this.d;
        }
        
        public final int o() {
            return this.f;
        }
        
        public final void p(final K k, final P p2) {
            if (p2 != com.squareup.moshi.kotlin.reflect.c.a()) {
                final q<K, P> d = this.d;
                Objects.requireNonNull(d, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                ((l<K, P>)d).d(k, p2);
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Binding(name=");
            sb.append(this.a);
            sb.append(", jsonName=");
            sb.append(this.b);
            sb.append(", adapter=");
            sb.append(this.c);
            sb.append(", property=");
            sb.append(this.d);
            sb.append(", parameter=");
            sb.append(this.e);
            sb.append(", propertyIndex=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R*\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b0\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "com/squareup/moshi/kotlin/reflect/a$b", "Lkotlin/collections/h;", "Lkotlin/reflect/n;", "", "key", "value", "h", "", "e", "f", "", "", "a", "()Ljava/util/Set;", "entries", "", "G", "Ljava/util/List;", "parameterKeys", "", "H", "[Ljava/lang/Object;", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", "reflect" }, k = 1, mv = { 1, 4, 2 })
    public static final class b extends kotlin.collections.h<n, Object>
    {
        private final List<n> G;
        private final Object[] H;
        
        public b(@org.jetbrains.annotations.e final List<? extends n> g, @org.jetbrains.annotations.e final Object[] h) {
            k0.p(g, "parameterKeys");
            k0.p(h, "parameterValues");
            this.G = (List<n>)g;
            this.H = h;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<Entry<n, Object>> a() {
            final List<n> g = this.G;
            final ArrayList list = new ArrayList<SimpleEntry>(v.Y((Iterable<?>)g, 10));
            final Iterator<Object> iterator = g.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final n next = iterator.next();
                if (n < 0) {
                    v.W();
                }
                list.add(new SimpleEntry<n, Object>(next, this.H[n]));
                ++n;
            }
            final LinkedHashSet<SimpleEntry> set = new LinkedHashSet<SimpleEntry>();
            for (final SimpleEntry next2 : list) {
                if (next2.getValue() != com.squareup.moshi.kotlin.reflect.c.a()) {
                    set.add(next2);
                }
            }
            return (Set<Entry<n, Object>>)set;
        }
        
        @Override
        public final /* bridge */ boolean containsKey(final Object o) {
            return o instanceof n && this.e((n)o);
        }
        
        public boolean e(@org.jetbrains.annotations.e final n n) {
            k0.p(n, "key");
            return this.H[n.i()] != com.squareup.moshi.kotlin.reflect.c.a();
        }
        
        @f
        public Object f(@org.jetbrains.annotations.e final n n) {
            k0.p(n, "key");
            Object o = this.H[n.i()];
            if (o == com.squareup.moshi.kotlin.reflect.c.a()) {
                o = null;
            }
            return o;
        }
        
        public /* bridge */ Object g(final n key, final Object defaultValue) {
            return super.getOrDefault(key, defaultValue);
        }
        
        @Override
        public final /* bridge */ Object get(final Object o) {
            if (o instanceof n) {
                return this.f((n)o);
            }
            return null;
        }
        
        @Override
        public final /* bridge */ Object getOrDefault(final Object o, final Object o2) {
            if (o instanceof n) {
                return this.g((n)o, o2);
            }
            return o2;
        }
        
        @f
        public Object h(@org.jetbrains.annotations.e final n n, @f final Object o) {
            k0.p(n, "key");
            return null;
        }
        
        public /* bridge */ Object i(final n key) {
            return super.remove(key);
        }
        
        public /* bridge */ boolean k(final n key, final Object value) {
            return super.remove(key, value);
        }
        
        @Override
        public final /* bridge */ Object remove(final Object o) {
            if (o instanceof n) {
                return this.i((n)o);
            }
            return null;
        }
        
        @Override
        public final /* bridge */ boolean remove(final Object o, final Object o2) {
            return o instanceof n && this.k((n)o, o2);
        }
    }
}
