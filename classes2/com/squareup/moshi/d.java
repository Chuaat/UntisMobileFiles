// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import java.util.Collection;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Field;
import java.lang.reflect.AnnotatedElement;
import java.util.Map;
import java.lang.reflect.Type;

final class d<T> extends h<T>
{
    public static final e d;
    private final c<T> a;
    private final b<?>[] b;
    private final m.b c;
    
    static {
        d = new e() {
            private void b(final x x, final Type type, final Map<String, b<?>> map) {
                final Class<?> j = a0.j(type);
                final boolean m = com.squareup.moshi.internal.c.m(j);
                for (final Field field : j.getDeclaredFields()) {
                    if (this.c(m, field.getModifiers())) {
                        final Type s = com.squareup.moshi.internal.c.s(type, j, field.getGenericType());
                        final Set<? extends Annotation> n = com.squareup.moshi.internal.c.n(field);
                        String s2 = field.getName();
                        final h<Object> g = x.g(s, n, s2);
                        field.setAccessible(true);
                        final g g2 = field.getAnnotation(g.class);
                        if (g2 != null) {
                            s2 = g2.name();
                        }
                        final b b = new b(s2, field, g);
                        final b b2 = map.put(s2, (b<?>)b);
                        if (b2 != null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Conflicting fields:\n    ");
                            sb.append(b2.b);
                            sb.append("\n    ");
                            sb.append(b.b);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
            
            private boolean c(final boolean b, final int n) {
                final boolean static1 = Modifier.isStatic(n);
                boolean b3;
                final boolean b2 = b3 = false;
                if (!static1) {
                    if (Modifier.isTransient(n)) {
                        b3 = b2;
                    }
                    else {
                        if (!Modifier.isPublic(n) && !Modifier.isProtected(n)) {
                            b3 = b2;
                            if (b) {
                                return b3;
                            }
                        }
                        b3 = true;
                    }
                }
                return b3;
            }
            
            private void d(final Type obj, final Class<?> clazz) {
                final Class<?> j = a0.j(obj);
                if (!clazz.isAssignableFrom(j)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No JsonAdapter for ");
                sb.append(obj);
                sb.append(", you should probably use ");
                sb.append(clazz.getSimpleName());
                sb.append(" instead of ");
                sb.append(j.getSimpleName());
                sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
                throw new IllegalArgumentException(sb.toString());
            }
            
            @c6.h
            @Override
            public h<?> a(Type i, final Set<? extends Annotation> set, final x x) {
                if (!(i instanceof Class) && !(i instanceof ParameterizedType)) {
                    return null;
                }
                final Class<?> j = a0.j(i);
                if (j.isInterface() || j.isEnum()) {
                    return null;
                }
                if (!set.isEmpty()) {
                    return null;
                }
                if (com.squareup.moshi.internal.c.m(j)) {
                    this.d(i, List.class);
                    this.d(i, Set.class);
                    this.d(i, Map.class);
                    this.d(i, Collection.class);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Platform ");
                    sb.append(j);
                    String s = sb.toString();
                    if (i instanceof ParameterizedType) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s);
                        sb2.append(" in ");
                        sb2.append(i);
                        s = sb2.toString();
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(s);
                    sb3.append(" requires explicit JsonAdapter to be registered");
                    throw new IllegalArgumentException(sb3.toString());
                }
                if (j.isAnonymousClass()) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cannot serialize anonymous class ");
                    sb4.append(j.getName());
                    throw new IllegalArgumentException(sb4.toString());
                }
                if (j.isLocalClass()) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Cannot serialize local class ");
                    sb5.append(j.getName());
                    throw new IllegalArgumentException(sb5.toString());
                }
                if (j.getEnclosingClass() != null && !Modifier.isStatic(j.getModifiers())) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("Cannot serialize non-static nested class ");
                    sb6.append(j.getName());
                    throw new IllegalArgumentException(sb6.toString());
                }
                if (Modifier.isAbstract(j.getModifiers())) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append("Cannot serialize abstract class ");
                    sb7.append(j.getName());
                    throw new IllegalArgumentException(sb7.toString());
                }
                if (!com.squareup.moshi.internal.c.l(j)) {
                    final c<Object> a = com.squareup.moshi.c.a(j);
                    final TreeMap<String, b<?>> treeMap = new TreeMap<String, b<?>>();
                    while (i != Object.class) {
                        this.b(x, i, treeMap);
                        i = a0.i(i);
                    }
                    return new d<Object>(a, treeMap).j();
                }
                final StringBuilder sb8 = new StringBuilder();
                sb8.append("Cannot serialize Kotlin type ");
                sb8.append(j.getName());
                sb8.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                throw new IllegalArgumentException(sb8.toString());
            }
        };
    }
    
    d(final c<T> a, final Map<String, b<?>> map) {
        this.a = a;
        this.b = map.values().toArray(new b[map.size()]);
        this.c = m.b.a((String[])map.keySet().toArray(new String[map.size()]));
    }
    
    @Override
    public T b(final m m) throws IOException {
        try {
            final T b = this.a.b();
            try {
                m.b();
                while (m.f()) {
                    final int f = m.F(this.c);
                    if (f == -1) {
                        m.C1();
                        m.skipValue();
                    }
                    else {
                        this.b[f].a(m, b);
                    }
                }
                m.d();
                return b;
            }
            catch (IllegalAccessException ex2) {
                throw new AssertionError();
            }
        }
        catch (IllegalAccessException ex3) {
            throw new AssertionError();
        }
        catch (InvocationTargetException ex) {
            throw com.squareup.moshi.internal.c.v(ex);
        }
        catch (InstantiationException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    @Override
    public void m(final t t, final T t2) throws IOException {
        try {
            t.c();
            for (final b<?> b2 : this.b) {
                t.o(b2.a);
                b2.b(t, t2);
            }
            t.g();
        }
        catch (IllegalAccessException ex) {
            throw new AssertionError();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JsonAdapter(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
    
    static class b<T>
    {
        final String a;
        final Field b;
        final h<T> c;
        
        b(final String a, final Field b, final h<T> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        void a(final m m, final Object obj) throws IOException, IllegalAccessException {
            this.b.set(obj, this.c.b(m));
        }
        
        void b(final t t, Object value) throws IllegalAccessException, IOException {
            value = this.b.get(value);
            this.c.m(t, (T)value);
        }
    }
}
