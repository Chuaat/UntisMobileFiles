// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.NoSuchElementException;
import java.lang.reflect.Array;
import java.util.Objects;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.lang.reflect.ParameterizedType;
import c6.h;
import java.lang.reflect.TypeVariable;
import java.io.IOException;
import okio.o;
import okio.p0;
import okio.m;
import okhttp3.h0;
import java.lang.reflect.Type;

final class y
{
    static final Type[] a;
    
    static {
        a = new Type[0];
    }
    
    private y() {
    }
    
    static h0 a(final h0 h0) throws IOException {
        final m m = new m();
        h0.source().e5(m);
        return h0.create(h0.contentType(), h0.contentLength(), m);
    }
    
    static void b(final Type type) {
        if (type instanceof Class && ((Class)type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }
    
    @h
    private static Class<?> c(final TypeVariable<?> typeVariable) {
        final Object genericDeclaration = typeVariable.getGenericDeclaration();
        Class<?> clazz;
        if (genericDeclaration instanceof Class) {
            clazz = (Class<?>)genericDeclaration;
        }
        else {
            clazz = null;
        }
        return clazz;
    }
    
    static boolean d(final Type type, Type ownerType) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (type == ownerType) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(ownerType);
        }
        if (type instanceof ParameterizedType) {
            if (!(ownerType instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)ownerType;
            final Type ownerType2 = parameterizedType.getOwnerType();
            ownerType = parameterizedType2.getOwnerType();
            if ((ownerType2 != ownerType && (ownerType2 == null || !ownerType2.equals(ownerType))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                b3 = false;
            }
            return b3;
        }
        else {
            if (type instanceof GenericArrayType) {
                return ownerType instanceof GenericArrayType && d(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)ownerType).getGenericComponentType());
            }
            if (type instanceof WildcardType) {
                if (!(ownerType instanceof WildcardType)) {
                    return false;
                }
                final WildcardType wildcardType = (WildcardType)type;
                final WildcardType wildcardType2 = (WildcardType)ownerType;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && b;
            }
            else {
                if (!(type instanceof TypeVariable)) {
                    return false;
                }
                if (!(ownerType instanceof TypeVariable)) {
                    return false;
                }
                final TypeVariable typeVariable = (TypeVariable)type;
                final TypeVariable typeVariable2 = (TypeVariable)ownerType;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName()) && b2;
            }
        }
    }
    
    static Type e(final Type type, Class<?> clazz, final Class<?> clazz2) {
        if (clazz2 == clazz) {
            return type;
        }
        if (clazz2.isInterface()) {
            final Class<?>[] interfaces = clazz.getInterfaces();
            for (int i = 0; i < interfaces.length; ++i) {
                if (interfaces[i] == clazz2) {
                    return clazz.getGenericInterfaces()[i];
                }
                if (clazz2.isAssignableFrom(interfaces[i])) {
                    return e(clazz.getGenericInterfaces()[i], interfaces[i], clazz2);
                }
            }
        }
        if (!clazz.isInterface()) {
            while (clazz != Object.class) {
                final Class<? super Object> superclass = clazz.getSuperclass();
                if (superclass == clazz2) {
                    return clazz.getGenericSuperclass();
                }
                if (clazz2.isAssignableFrom(superclass)) {
                    return e(clazz.getGenericSuperclass(), superclass, clazz2);
                }
                clazz = (Class<Object>)superclass;
            }
        }
        return clazz2;
    }
    
    static Type f(final int n, final ParameterizedType parameterizedType) {
        Type type2;
        final Type type = type2 = parameterizedType.getActualTypeArguments()[n];
        if (type instanceof WildcardType) {
            type2 = ((WildcardType)type).getLowerBounds()[0];
        }
        return type2;
    }
    
    static Type g(final int i, final ParameterizedType obj) {
        final Type[] actualTypeArguments = obj.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type2;
            final Type type = type2 = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                type2 = ((WildcardType)type).getUpperBounds()[0];
            }
            return type2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" not in range [0,");
        sb.append(actualTypeArguments.length);
        sb.append(") for ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static Class<?> h(Type rawType) {
        Objects.requireNonNull(rawType, "type == null");
        if (rawType instanceof Class) {
            return (Class<?>)rawType;
        }
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType)rawType).getRawType();
            if (rawType instanceof Class) {
                return (Class<?>)rawType;
            }
            throw new IllegalArgumentException();
        }
        else {
            if (rawType instanceof GenericArrayType) {
                return Array.newInstance(h(((GenericArrayType)rawType).getGenericComponentType()), 0).getClass();
            }
            if (rawType instanceof TypeVariable) {
                return Object.class;
            }
            if (rawType instanceof WildcardType) {
                return h(((WildcardType)rawType).getUpperBounds()[0]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(rawType);
            sb.append("> is of type ");
            sb.append(rawType.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static Type i(final Type type, final Class<?> clazz, final Class<?> clazz2) {
        if (clazz2.isAssignableFrom(clazz)) {
            return q(type, clazz, e(type, clazz, clazz2));
        }
        throw new IllegalArgumentException();
    }
    
    static boolean j(@h final Type obj) {
        if (obj instanceof Class) {
            return false;
        }
        if (obj instanceof ParameterizedType) {
            final Type[] actualTypeArguments = ((ParameterizedType)obj).getActualTypeArguments();
            for (int length = actualTypeArguments.length, i = 0; i < length; ++i) {
                if (j(actualTypeArguments[i])) {
                    return true;
                }
            }
            return false;
        }
        if (obj instanceof GenericArrayType) {
            return j(((GenericArrayType)obj).getGenericComponentType());
        }
        if (obj instanceof TypeVariable) {
            return true;
        }
        if (obj instanceof WildcardType) {
            return true;
        }
        String name;
        if (obj == null) {
            name = "null";
        }
        else {
            name = obj.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(obj);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static int k(final Object[] array, final Object o) {
        for (int i = 0; i < array.length; ++i) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
    
    static boolean l(final Annotation[] array, final Class<? extends Annotation> clazz) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (clazz.isInstance(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    static RuntimeException m(final Method method, final String s, final Object... array) {
        return n(method, null, s, array);
    }
    
    static RuntimeException n(final Method method, @h final Throwable cause, final String format, final Object... args) {
        final String format2 = String.format(format, args);
        final StringBuilder sb = new StringBuilder();
        sb.append(format2);
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), cause);
    }
    
    static RuntimeException o(final Method method, final int n, final String str, final Object... array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(n + 1);
        sb.append(")");
        return m(method, sb.toString(), array);
    }
    
    static RuntimeException p(final Method method, final Throwable t, final int n, final String str, final Object... array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(n + 1);
        sb.append(")");
        return n(method, t, sb.toString(), array);
    }
    
    static Type q(Type type, final Class<?> clazz, Type type2) {
        while (type2 instanceof TypeVariable) {
            final TypeVariable typeVariable = (TypeVariable)type2;
            type2 = r(type, clazz, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            final Class clazz2 = (Class)type2;
            if (clazz2.isArray()) {
                final Class componentType = clazz2.getComponentType();
                type = q(type, clazz, componentType);
                Type type3;
                if (componentType == type) {
                    type3 = clazz2;
                }
                else {
                    type3 = new a(type);
                }
                return type3;
            }
        }
        if (type2 instanceof GenericArrayType) {
            final GenericArrayType genericArrayType = (GenericArrayType)type2;
            final Type genericComponentType = genericArrayType.getGenericComponentType();
            type = q(type, clazz, genericComponentType);
            GenericArrayType genericArrayType2;
            if (genericComponentType == type) {
                genericArrayType2 = genericArrayType;
            }
            else {
                genericArrayType2 = new a(type);
            }
            return genericArrayType2;
        }
        final boolean b = type2 instanceof ParameterizedType;
        int i = 0;
        if (b) {
            final ParameterizedType parameterizedType = (ParameterizedType)type2;
            type2 = parameterizedType.getOwnerType();
            final Type q = q(type, clazz, type2);
            int n;
            if (q != type2) {
                n = 1;
            }
            else {
                n = 0;
            }
            Type[] actualTypeArguments;
            int n2;
            Type[] array;
            for (actualTypeArguments = parameterizedType.getActualTypeArguments(); i < actualTypeArguments.length; ++i, n = n2, actualTypeArguments = array) {
                final Type q2 = q(type, clazz, actualTypeArguments[i]);
                n2 = n;
                array = actualTypeArguments;
                if (q2 != actualTypeArguments[i]) {
                    n2 = n;
                    array = actualTypeArguments;
                    if (n == 0) {
                        array = actualTypeArguments.clone();
                        n2 = 1;
                    }
                    array[i] = q2;
                }
            }
            ParameterizedType parameterizedType2 = parameterizedType;
            if (n != 0) {
                parameterizedType2 = new b(q, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType2;
        }
        Type type4 = type2;
        if (!(type2 instanceof WildcardType)) {
            return type4;
        }
        final WildcardType wildcardType = (WildcardType)type2;
        final Type[] lowerBounds = wildcardType.getLowerBounds();
        final Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            type = q(type, clazz, lowerBounds[0]);
            type4 = wildcardType;
            if (type != lowerBounds[0]) {
                return new c(new Type[] { Object.class }, new Type[] { type });
            }
            return type4;
        }
        else {
            type4 = wildcardType;
            if (upperBounds.length != 1) {
                return type4;
            }
        }
        final Type type5 = upperBounds[0];
        try {
            type = q(type, clazz, type5);
            type4 = wildcardType;
            if (type != upperBounds[0]) {
                return new c(new Type[] { type }, y.a);
            }
            return type4;
        }
        finally {}
    }
    
    private static Type r(Type e, final Class<?> clazz, final TypeVariable<?> typeVariable) {
        final Class<?> c = c(typeVariable);
        if (c == null) {
            return typeVariable;
        }
        e = e(e, clazz, c);
        if (e instanceof ParameterizedType) {
            return ((ParameterizedType)e).getActualTypeArguments()[k(c.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }
    
    static void s(final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
    
    static String t(final Type type) {
        String s;
        if (type instanceof Class) {
            s = ((Class)type).getName();
        }
        else {
            s = type.toString();
        }
        return s;
    }
    
    private static final class a implements GenericArrayType
    {
        private final Type G;
        
        a(final Type g) {
            this.G = g;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof GenericArrayType && y.d(this, (Type)o);
        }
        
        @Override
        public Type getGenericComponentType() {
            return this.G;
        }
        
        @Override
        public int hashCode() {
            return this.G.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(y.t(this.G));
            sb.append("[]");
            return sb.toString();
        }
    }
    
    static final class b implements ParameterizedType
    {
        @h
        private final Type G;
        private final Type H;
        private final Type[] I;
        
        b(@h final Type g, final Type h, final Type... array) {
            final boolean b = h instanceof Class;
            final int n = 0;
            if (b) {
                int n2 = true ? 1 : 0;
                final boolean b2 = g == null;
                if (((Class)h).getEnclosingClass() != null) {
                    n2 = (false ? 1 : 0);
                }
                if ((b2 ? 1 : 0) != n2) {
                    throw new IllegalArgumentException();
                }
            }
            for (int length = array.length, i = n; i < length; ++i) {
                final Type obj = array[i];
                Objects.requireNonNull(obj, "typeArgument == null");
                y.b(obj);
            }
            this.G = g;
            this.H = h;
            this.I = array.clone();
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof ParameterizedType && y.d(this, (Type)o);
        }
        
        @Override
        public Type[] getActualTypeArguments() {
            return this.I.clone();
        }
        
        @h
        @Override
        public Type getOwnerType() {
            return this.G;
        }
        
        @Override
        public Type getRawType() {
            return this.H;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = Arrays.hashCode(this.I);
            final int hashCode2 = this.H.hashCode();
            final Type g = this.G;
            int hashCode3;
            if (g != null) {
                hashCode3 = g.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            return hashCode ^ hashCode2 ^ hashCode3;
        }
        
        @Override
        public String toString() {
            final Type[] i = this.I;
            if (i.length == 0) {
                return y.t(this.H);
            }
            final int length = i.length;
            int j = 1;
            final StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(y.t(this.H));
            sb.append("<");
            sb.append(y.t(this.I[0]));
            while (j < this.I.length) {
                sb.append(", ");
                sb.append(y.t(this.I[j]));
                ++j;
            }
            sb.append(">");
            return sb.toString();
        }
    }
    
    private static final class c implements WildcardType
    {
        private final Type G;
        @h
        private final Type H;
        
        c(final Type[] array, final Type[] array2) {
            if (array2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (array.length == 1) {
                if (array2.length == 1) {
                    Objects.requireNonNull(array2[0]);
                    y.b(array2[0]);
                    if (array[0] != Object.class) {
                        throw new IllegalArgumentException();
                    }
                    this.H = array2[0];
                    this.G = Object.class;
                }
                else {
                    Objects.requireNonNull(array[0]);
                    y.b(array[0]);
                    this.H = null;
                    this.G = array[0];
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof WildcardType && y.d(this, (Type)o);
        }
        
        @Override
        public Type[] getLowerBounds() {
            final Type h = this.H;
            Type[] a;
            if (h != null) {
                a = new Type[] { h };
            }
            else {
                a = y.a;
            }
            return a;
        }
        
        @Override
        public Type[] getUpperBounds() {
            return new Type[] { this.G };
        }
        
        @Override
        public int hashCode() {
            final Type h = this.H;
            int n;
            if (h != null) {
                n = h.hashCode() + 31;
            }
            else {
                n = 1;
            }
            return n ^ this.G.hashCode() + 31;
        }
        
        @Override
        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.H != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.H;
            }
            else {
                if (this.G == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.G;
            }
            sb.append(y.t(type));
            return sb.toString();
        }
    }
}
