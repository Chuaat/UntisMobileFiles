// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import java.lang.reflect.AnnotatedElement;
import com.squareup.moshi.internal.c;
import java.lang.reflect.Method;
import java.util.List;

final class a implements e
{
    private final List<f> a;
    private final List<f> b;
    
    a(final List<f> a, final List<f> b) {
        this.a = a;
        this.b = b;
    }
    
    static f b(final Object o, final Method obj) {
        obj.setAccessible(true);
        final Type genericReturnType = obj.getGenericReturnType();
        final Set<? extends Annotation> n = c.n(obj);
        final Type[] genericParameterTypes = obj.getGenericParameterTypes();
        final Annotation[][] parameterAnnotations = obj.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == m.class && genericReturnType != Void.TYPE && e(1, genericParameterTypes)) {
            return (f)new f(genericReturnType, n, o, obj, genericParameterTypes.length, 1, true) {
                @Override
                public Object b(final x x, final m m) throws IOException, InvocationTargetException {
                    return ((f)this).c(m);
                }
            };
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            return (f)new f(genericReturnType, n, o, obj, genericParameterTypes.length, 1, c.h(parameterAnnotations[0])) {
                h<Object> h;
                final /* synthetic */ Set k = com.squareup.moshi.internal.c.o(parameterAnnotations[0]);
                
                @Override
                public void a(final x x, final e e) {
                    super.a(x, e);
                    h<Object> h;
                    if (a0.e(genericParameterTypes[0], genericReturnType) && this.k.equals(n)) {
                        h = x.m(e, genericParameterTypes[0], this.k);
                    }
                    else {
                        h = x.f(genericParameterTypes[0], this.k);
                    }
                    this.h = h;
                }
                
                @Override
                public Object b(final x x, final m m) throws IOException, InvocationTargetException {
                    return ((f)this).c(this.h.b(m));
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected signature for ");
        sb.append(obj);
        sb.append(".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @c6.h
    private static f c(final List<f> list, final Type type, final Set<? extends Annotation> set) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final f f = list.get(i);
            if (a0.e(f.a, type) && f.b.equals(set)) {
                return f;
            }
        }
        return null;
    }
    
    public static a d(Object o) {
        final ArrayList<f> list = new ArrayList<f>();
        final ArrayList<f> list2 = new ArrayList<f>();
        for (Class<?> clazz = o.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
            for (final Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(z.class)) {
                    final f f = f(o, method);
                    final f c = c(list, f.a, f.b);
                    if (c != null) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append("Conflicting @ToJson methods:\n    ");
                        ((StringBuilder)o).append(c.d);
                        ((StringBuilder)o).append("\n    ");
                        ((StringBuilder)o).append(f.d);
                        throw new IllegalArgumentException(((StringBuilder)o).toString());
                    }
                    list.add(f);
                }
                if (method.isAnnotationPresent(com.squareup.moshi.f.class)) {
                    final f b = b(o, method);
                    final f c2 = c(list2, b.a, b.b);
                    if (c2 != null) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append("Conflicting @FromJson methods:\n    ");
                        ((StringBuilder)o).append(c2.d);
                        ((StringBuilder)o).append("\n    ");
                        ((StringBuilder)o).append(b.d);
                        throw new IllegalArgumentException(((StringBuilder)o).toString());
                    }
                    list2.add(b);
                }
            }
        }
        if (list.isEmpty() && list2.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected at least one @ToJson or @FromJson method on ");
            sb.append(o.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
        return new a(list, list2);
    }
    
    private static boolean e(int i, final Type[] array) {
        while (i < array.length) {
            if (!(array[i] instanceof ParameterizedType)) {
                return false;
            }
            if (((ParameterizedType)array[i]).getRawType() != h.class) {
                return false;
            }
            ++i;
        }
        return true;
    }
    
    static f f(final Object o, final Method obj) {
        obj.setAccessible(true);
        final Type genericReturnType = obj.getGenericReturnType();
        final Type[] genericParameterTypes = obj.getGenericParameterTypes();
        final Annotation[][] parameterAnnotations = obj.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == t.class && genericReturnType == Void.TYPE && e(2, genericParameterTypes)) {
            return (f)new f(genericParameterTypes[1], c.o(parameterAnnotations[1]), o, obj, genericParameterTypes.length, 2, true) {
                @Override
                public void e(final x x, final t t, @c6.h final Object o) throws IOException, InvocationTargetException {
                    ((f)this).d(t, o);
                }
            };
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            final Set<? extends Annotation> n = c.n(obj);
            final Set<? extends Annotation> o2 = c.o(parameterAnnotations[0]);
            return (f)new f(genericParameterTypes[0], o2, o, obj, genericParameterTypes.length, 1, c.h(parameterAnnotations[0])) {
                private h<Object> h;
                
                @Override
                public void a(final x x, final e e) {
                    super.a(x, e);
                    h<Object> h;
                    if (a0.e(genericParameterTypes[0], genericReturnType) && o2.equals(n)) {
                        h = x.m(e, genericReturnType, n);
                    }
                    else {
                        h = x.f(genericReturnType, n);
                    }
                    this.h = h;
                }
                
                @Override
                public void e(final x x, final t t, @c6.h final Object o) throws IOException, InvocationTargetException {
                    this.h.m(t, ((f)this).c(o));
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected signature for ");
        sb.append(obj);
        sb.append(".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @c6.h
    @Override
    public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
        final f c = c(this.a, type, set);
        final f c2 = c(this.b, type, set);
        h<Object> m = null;
        if (c == null && c2 == null) {
            return null;
        }
        Label_0056: {
            if (c != null) {
                if (c2 != null) {
                    break Label_0056;
                }
            }
            try {
                m = x.m(this, type, set);
                if (c != null) {
                    c.a(x, this);
                }
                if (c2 != null) {
                    c2.a(x, this);
                }
                return new h<Object>() {
                    @c6.h
                    @Override
                    public Object b(final m m) throws IOException {
                        final f d = c2;
                        if (d == null) {
                            return m.b(m);
                        }
                        if (!d.g && m.w() == com.squareup.moshi.m.c.O) {
                            m.q();
                            return null;
                        }
                        try {
                            return c2.b(x, m);
                        }
                        catch (InvocationTargetException ex) {
                            final Throwable cause = ex.getCause();
                            if (cause instanceof IOException) {
                                throw (IOException)cause;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(cause);
                            sb.append(" at ");
                            sb.append(m.getPath());
                            throw new j(sb.toString(), cause);
                        }
                    }
                    
                    @Override
                    public void m(final t t, @c6.h final Object o) throws IOException {
                        final f a = c;
                        if (a == null) {
                            m.m(t, o);
                            return;
                        }
                        if (!a.g && o == null) {
                            t.q();
                            return;
                        }
                        try {
                            a.e(x, t, o);
                        }
                        catch (InvocationTargetException ex) {
                            final Throwable cause = ex.getCause();
                            if (cause instanceof IOException) {
                                throw (IOException)cause;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(cause);
                            sb.append(" at ");
                            sb.append(t.getPath());
                            throw new j(sb.toString(), cause);
                        }
                    }
                    
                    @Override
                    public String toString() {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("JsonAdapter");
                        sb.append(set);
                        sb.append("(");
                        sb.append(type);
                        sb.append(")");
                        return sb.toString();
                    }
                };
            }
            catch (IllegalArgumentException cause) {
                String str;
                if (c == null) {
                    str = "@ToJson";
                }
                else {
                    str = "@FromJson";
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No ");
                sb.append(str);
                sb.append(" adapter for ");
                sb.append(com.squareup.moshi.internal.c.w(type, set));
                throw new IllegalArgumentException(sb.toString(), cause);
            }
        }
    }
    
    abstract static class f
    {
        final Type a;
        final Set<? extends Annotation> b;
        final Object c;
        final Method d;
        final int e;
        final h<?>[] f;
        final boolean g;
        
        f(final Type type, final Set<? extends Annotation> b, final Object c, final Method d, final int n, final int e, final boolean g) {
            this.a = c.b(type);
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = (h<?>[])new h[n - e];
            this.g = g;
        }
        
        public void a(final x x, final e e) {
            if (this.f.length > 0) {
                final Type[] genericParameterTypes = this.d.getGenericParameterTypes();
                final Annotation[][] parameterAnnotations = this.d.getParameterAnnotations();
                for (int i = this.e; i < genericParameterTypes.length; ++i) {
                    final Type type = ((ParameterizedType)genericParameterTypes[i]).getActualTypeArguments()[0];
                    final Set<? extends Annotation> o = com.squareup.moshi.internal.c.o(parameterAnnotations[i]);
                    final h<?>[] f = this.f;
                    final int e2 = this.e;
                    h<?> h;
                    if (a0.e(this.a, type) && this.b.equals(o)) {
                        h = x.m(e, type, o);
                    }
                    else {
                        h = x.f(type, o);
                    }
                    f[i - e2] = h;
                }
            }
        }
        
        @c6.h
        public Object b(final x x, final m m) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
        
        @c6.h
        protected Object c(@c6.h Object invoke) throws InvocationTargetException {
            final h<?>[] f = this.f;
            final Object[] args = new Object[f.length + 1];
            args[0] = invoke;
            System.arraycopy(f, 0, args, 1, f.length);
            try {
                invoke = this.d.invoke(this.c, args);
                return invoke;
            }
            catch (IllegalAccessException ex) {
                throw new AssertionError();
            }
        }
        
        protected Object d(@c6.h Object invoke, @c6.h final Object o) throws InvocationTargetException {
            final h<?>[] f = this.f;
            final Object[] args = new Object[f.length + 2];
            args[0] = invoke;
            args[1] = o;
            System.arraycopy(f, 0, args, 2, f.length);
            try {
                invoke = this.d.invoke(this.c, args);
                return invoke;
            }
            catch (IllegalAccessException ex) {
                throw new AssertionError();
            }
        }
        
        public void e(final x x, final t t, @c6.h final Object o) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }
}
