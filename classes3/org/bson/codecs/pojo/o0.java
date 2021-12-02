// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Collections;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import e7.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class o0<T> implements q0<T>
{
    private static final Map<Class<?>, Class<?>> c;
    private final Class<T> a;
    private final List<o0<?>> b;
    
    static {
        final HashMap<Class<Boolean>, Class<Boolean>> c2 = (HashMap<Class<Boolean>, Class<Boolean>>)new HashMap<Class<Short>, Class<Short>>();
        c2.put((Class<Short>)Boolean.TYPE, (Class<Short>)Boolean.class);
        c2.put((Class<Short>)Byte.TYPE, (Class<Short>)Byte.class);
        c2.put((Class<Short>)Character.TYPE, (Class<Short>)Character.class);
        c2.put((Class<Short>)Double.TYPE, (Class<Short>)Double.class);
        c2.put((Class<Short>)Float.TYPE, (Class<Short>)Float.class);
        c2.put((Class<Short>)Integer.TYPE, (Class<Short>)Integer.class);
        c2.put((Class<Short>)Long.TYPE, (Class<Short>)Long.class);
        c2.put(Short.TYPE, Short.class);
        c = c2;
    }
    
    private o0(final Class<T> clazz, final List<o0<?>> b) {
        this.a = this.b(clazz);
        this.b = b;
    }
    
    private <S> Class<S> b(final Class<S> clazz) {
        Class<?> clazz2 = clazz;
        if (clazz.isPrimitive()) {
            clazz2 = o0.c.get(clazz);
        }
        return (Class<S>)clazz2;
    }
    
    public static <T> b<T> c(final Class<T> clazz) {
        return new b<T>((Class)a.e("type", clazz));
    }
    
    private static <T> void d(final b<T> b, Type type) {
        final boolean b2 = type instanceof ParameterizedType;
        int i = 0;
        o0<T> o0;
        if (b2) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final b<T> c = c((Class<T>)parameterizedType.getRawType());
            for (Type[] actualTypeArguments = parameterizedType.getActualTypeArguments(); i < actualTypeArguments.length; ++i) {
                d((b<Object>)c, actualTypeArguments[i]);
            }
            o0 = c.c();
        }
        else {
            Class<Object> clazz = null;
            Label_0097: {
                if (type instanceof WildcardType) {
                    type = ((WildcardType)type).getUpperBounds()[0];
                }
                else {
                    if (type instanceof TypeVariable) {
                        clazz = Object.class;
                        break Label_0097;
                    }
                    if (!(type instanceof Class)) {
                        return;
                    }
                }
                clazz = (Class<Object>)type;
            }
            o0 = (o0<T>)c((Class<S>)clazz).c();
        }
        b.a(o0);
    }
    
    private static String f(final List<o0<?>> list) {
        final StringBuilder sb = new StringBuilder();
        final int size = list.size();
        final Iterator<o0<?>> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final o0<?> o0 = iterator.next();
            final int n2 = n + 1;
            sb.append(o0.a().getSimpleName());
            if (!o0.getTypeParameters().isEmpty()) {
                sb.append(String.format("<%s>", f(o0.getTypeParameters())));
            }
            if ((n = n2) < size) {
                sb.append(", ");
                n = n2;
            }
        }
        return sb.toString();
    }
    
    public static o0<?> g(final Field field) {
        return i(field.getGenericType(), field.getType());
    }
    
    public static o0<?> h(final Method method) {
        Type genericReturnType;
        Class<?> returnType;
        if (m0.b(method)) {
            genericReturnType = method.getGenericReturnType();
            returnType = method.getReturnType();
        }
        else {
            genericReturnType = method.getGenericParameterTypes()[0];
            returnType = method.getParameterTypes()[0];
        }
        return i(genericReturnType, returnType);
    }
    
    public static <T> o0<T> i(final Type type, final Class<T> clazz) {
        final b<T> c = c(clazz);
        if (type instanceof ParameterizedType) {
            final Type[] actualTypeArguments = ((ParameterizedType)type).getActualTypeArguments();
            for (int length = actualTypeArguments.length, i = 0; i < length; ++i) {
                d(c, actualTypeArguments[i]);
            }
        }
        return c.c();
    }
    
    @Override
    public Class<T> a() {
        return this.a;
    }
    
    boolean e(final Class<?> clazz) {
        return this.a.isAssignableFrom(this.b(clazz));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o0)) {
            return false;
        }
        final o0 o2 = (o0)o;
        return this.a().equals(o2.a()) && this.getTypeParameters().equals(o2.getTypeParameters());
    }
    
    @Override
    public List<o0<?>> getTypeParameters() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode() * 31 + this.getTypeParameters().hashCode();
    }
    
    @Override
    public String toString() {
        String string;
        if (this.b.isEmpty()) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(", typeParameters=[");
            sb.append(f(this.b));
            sb.append("]");
            string = sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeData{type=");
        sb2.append(this.a.getSimpleName());
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
    
    public static final class b<T>
    {
        private final Class<T> a;
        private final List<o0<?>> b;
        
        private b(final Class<T> a) {
            this.b = new ArrayList<o0<?>>();
            this.a = a;
        }
        
        public <S> b<T> a(final o0<S> o0) {
            this.b.add(e7.a.e("typeParameter", o0));
            return this;
        }
        
        public b<T> b(final List<o0<?>> list) {
            e7.a.e("typeParameters", list);
            final Iterator<o0<S>> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.a((o0<Object>)iterator.next());
            }
            return this;
        }
        
        public o0<T> c() {
            return new o0<T>(this.a, Collections.unmodifiableList((List<?>)this.b), null);
        }
    }
}
