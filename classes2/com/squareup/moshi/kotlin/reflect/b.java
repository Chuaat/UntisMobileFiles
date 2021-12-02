// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi.kotlin.reflect;

import org.jetbrains.annotations.f;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.i;
import com.squareup.moshi.m;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.q1;
import java.util.ArrayList;
import java.util.Objects;
import com.squareup.moshi.g;
import java.util.Collection;
import kotlin.reflect.l;
import java.lang.reflect.Modifier;
import kotlin.reflect.q;
import kotlin.reflect.n;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import kotlin.collections.v;
import kotlin.reflect.d;
import m6.a;
import com.squareup.moshi.c0;
import kotlin.jvm.internal.k0;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.util.Set;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.Metadata;
import com.squareup.moshi.h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r" }, d2 = { "Lcom/squareup/moshi/kotlin/reflect/b;", "Lcom/squareup/moshi/h$e;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/x;", "moshi", "Lcom/squareup/moshi/h;", "a", "<init>", "()V", "reflect" }, k = 1, mv = { 1, 4, 2 })
public final class b implements e
{
    @f
    @Override
    public h<?> a(@org.jetbrains.annotations.e final Type type, @org.jetbrains.annotations.e final Set<? extends Annotation> set, @org.jetbrains.annotations.e final x x) {
        k0.p(type, "type");
        k0.p(set, "annotations");
        k0.p(x, "moshi");
        if (set.isEmpty() ^ true) {
            return null;
        }
        final Class<?> d = c0.d(type);
        if (d.isInterface()) {
            return null;
        }
        if (d.isEnum()) {
            return null;
        }
        if (!d.isAnnotationPresent(c.b())) {
            return null;
        }
        if (com.squareup.moshi.internal.c.m(d)) {
            return null;
        }
        try {
            final h<?> f = com.squareup.moshi.internal.c.f(x, type, d);
            if (f != null) {
                return f;
            }
        }
        catch (RuntimeException ex) {
            if (!(ex.getCause() instanceof ClassNotFoundException)) {
                throw ex;
            }
        }
        if (!(d.isLocalClass() ^ true)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot serialize local class or object expression ");
            sb.append(d.getName());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        final d<T> g = a.g(d);
        if (!(g.isAbstract() ^ true)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot serialize abstract class ");
            sb2.append(d.getName());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (!(g.u() ^ true)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot serialize inner class ");
            sb3.append(d.getName());
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (g.J() != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot serialize object declaration ");
            sb4.append(d.getName());
            throw new IllegalArgumentException(sb4.toString().toString());
        }
        if (!(g.w() ^ true)) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Cannot reflectively serialize sealed class ");
            sb5.append(d.getName());
            sb5.append(". Please register an adapter.");
            throw new IllegalArgumentException(sb5.toString().toString());
        }
        final i<T> i = kotlin.reflect.full.e.I((d<T>)g);
        if (i != null) {
            final List parameters = i.getParameters();
            final LinkedHashMap linkedHashMap = new LinkedHashMap<Object, n>(o.n(y0.j(v.Y((Iterable<?>)parameters, 10)), 16));
            for (final T next : parameters) {
                linkedHashMap.put(((n)next).getName(), (n)next);
            }
            kotlin.reflect.jvm.a.b(i, true);
            final LinkedHashMap<String, com.squareup.moshi.kotlin.reflect.a.a<Object, Object>> linkedHashMap2 = new LinkedHashMap<String, com.squareup.moshi.kotlin.reflect.a.a<Object, Object>>();
        Label_0567_Outer:
            for (final q<T, ?> q : kotlin.reflect.full.e.G(g)) {
                final n obj = linkedHashMap.get(q.getName());
                final Field c = kotlin.reflect.jvm.e.c(q);
                int modifiers;
                if (c != null) {
                    modifiers = c.getModifiers();
                }
                else {
                    modifiers = 0;
                }
                if (Modifier.isTransient(modifiers)) {
                    if (obj == null || obj.Z()) {
                        continue;
                    }
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("No default value for transient constructor ");
                    sb6.append(obj);
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                else {
                    if (obj != null && !k0.g(obj.a(), q.getReturnType())) {
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append('\'');
                        sb7.append(q.getName());
                        sb7.append("' has a constructor parameter of type ");
                        k0.m(obj);
                        sb7.append(obj.a());
                        sb7.append(" but a property of type ");
                        sb7.append(q.getReturnType());
                        sb7.append('.');
                        throw new IllegalArgumentException(sb7.toString().toString());
                    }
                    if (!(q instanceof l) && obj == null) {
                        continue Label_0567_Outer;
                    }
                    kotlin.reflect.jvm.a.b(q, true);
                    final List<Object> l5 = v.L5((Collection<?>)q.getAnnotations());
                    while (true) {
                        for (final g next2 : q.getAnnotations()) {
                            if (next2 instanceof g) {
                                g g3;
                                final g g2 = g3 = next2;
                                Label_0656: {
                                    if (obj != null) {
                                        v.q0((Collection<? super Object>)l5, (Iterable<?>)obj.getAnnotations());
                                        if ((g3 = g2) == null) {
                                            while (true) {
                                                for (final g next3 : obj.getAnnotations()) {
                                                    if (next3 instanceof g) {
                                                        g3 = next3;
                                                        break Label_0656;
                                                    }
                                                }
                                                g next3 = null;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                String s = null;
                                Label_0684: {
                                    if (g3 != null) {
                                        s = g3.name();
                                        if (s != null) {
                                            break Label_0684;
                                        }
                                    }
                                    s = q.getName();
                                }
                                final Type s2 = com.squareup.moshi.internal.c.s(type, d, kotlin.reflect.jvm.e.g(q.getReturnType()));
                                final Object[] array = l5.toArray((Object[])new Annotation[0]);
                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                final h<Object> g4 = x.g(s2, com.squareup.moshi.internal.c.o((Annotation[])array), q.getName());
                                final String name = q.getName();
                                String name2 = null;
                                Label_0781: {
                                    if (g3 != null) {
                                        name2 = g3.name();
                                        if (name2 != null) {
                                            break Label_0781;
                                        }
                                    }
                                    name2 = s;
                                }
                                k0.o(g4, "adapter");
                                int j;
                                if (obj != null) {
                                    j = obj.i();
                                }
                                else {
                                    j = -1;
                                }
                                linkedHashMap2.put(name, new com.squareup.moshi.kotlin.reflect.a.a<Object, Object>(s, name2, g4, (q<Object, ?>)q, obj, j));
                                continue Label_0837;
                            }
                        }
                        g next2 = null;
                        continue;
                    }
                }
                Label_0837:;
            }
            final ArrayList<com.squareup.moshi.kotlin.reflect.a.a<Object, Object>> list = new ArrayList<com.squareup.moshi.kotlin.reflect.a.a<Object, Object>>();
            for (final n obj2 : i.getParameters()) {
                final com.squareup.moshi.kotlin.reflect.a.a<Object, Object> a = q1.k(linkedHashMap2).remove(obj2.getName());
                if (a == null && !obj2.Z()) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append("No property for required constructor ");
                    sb8.append(obj2);
                    throw new IllegalArgumentException(sb8.toString().toString());
                }
                list.add(a);
            }
            int size = list.size();
            final Iterator<Map.Entry<String, com.squareup.moshi.kotlin.reflect.a.a<Object, Object>>> iterator6 = linkedHashMap2.entrySet().iterator();
            while (iterator6.hasNext()) {
                final com.squareup.moshi.kotlin.reflect.a.a<Object, Object> a2 = iterator6.next().getValue();
                final int n = size + 1;
                list.add(com.squareup.moshi.kotlin.reflect.a.a.h(a2, null, null, null, null, null, size, 31, null));
                size = n;
            }
            final List<Object> f2 = v.f2((Iterable<?>)list);
            final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)f2, 10));
            final Iterator<com.squareup.moshi.kotlin.reflect.a.a> iterator7 = f2.iterator();
            while (iterator7.hasNext()) {
                list2.add(iterator7.next().l());
            }
            final String[] array2 = list2.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            final String[] original = array2;
            final m.b a3 = m.b.a((String[])Arrays.copyOf(original, original.length));
            k0.o(a3, "options");
            return new com.squareup.moshi.kotlin.reflect.a<Object>(i, list, (List<com.squareup.moshi.kotlin.reflect.a.a<Object, Object>>)f2, a3).j();
        }
        return null;
    }
}
